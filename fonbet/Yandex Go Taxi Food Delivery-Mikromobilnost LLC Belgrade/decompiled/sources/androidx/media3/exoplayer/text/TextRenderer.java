package androidx.media3.exoplayer.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.common.a;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import defpackage.a95;
import defpackage.b69;
import defpackage.d6z;
import defpackage.dlh;
import defpackage.e2v0;
import defpackage.eh20;
import defpackage.g2v0;
import defpackage.g8e;
import defpackage.h2v0;
import defpackage.iyi0;
import defpackage.k2v0;
import defpackage.l2v0;
import defpackage.lk91;
import defpackage.n06;
import defpackage.ny61;
import defpackage.nyg;
import defpackage.o7s;
import defpackage.pdf;
import defpackage.piv;
import defpackage.rdf;
import defpackage.s1j0;
import defpackage.sdf;
import defpackage.sf10;
import defpackage.tdf;
import defpackage.ur10;
import defpackage.ury0;
import defpackage.wor0;
import defpackage.x59;
import defpackage.x8e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class TextRenderer extends a95 implements Handler.Callback {
    private static final int MSG_UPDATE_OUTPUT = 1;
    private static final int REPLACEMENT_STATE_NONE = 0;
    private static final int REPLACEMENT_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REPLACEMENT_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "TextRenderer";
    private final pdf cueDecoder;
    private final nyg cueDecoderInputBuffer;
    private sdf cuesResolver;
    private int decoderReplacementState;
    private long finalStreamEndPositionUs;
    private final o7s formatHolder;
    private boolean inputStreamEnded;
    private long lastRendererPositionUs;
    private boolean legacyDecodingEnabled;
    private l2v0 nextSubtitle;
    private int nextSubtitleEventIndex;
    private k2v0 nextSubtitleInputBuffer;
    private final ury0 output;
    private final Handler outputHandler;
    private boolean outputStreamEnded;
    private IOException streamError;
    private a streamFormat;
    private l2v0 subtitle;
    private g2v0 subtitleDecoder;
    private final h2v0 subtitleDecoderFactory;
    private boolean waitingForKeyFrame;

    public TextRenderer(ury0 ury0Var, Looper looper, h2v0 h2v0Var) {
        super(3);
        ury0Var.getClass();
        this.output = ury0Var;
        this.outputHandler = looper == null ? null : new Handler(looper, this);
        this.subtitleDecoderFactory = h2v0Var;
        this.cueDecoder = new pdf();
        this.cueDecoderInputBuffer = new nyg(1);
        this.formatHolder = new o7s();
        this.finalStreamEndPositionUs = -9223372036854775807L;
        this.lastRendererPositionUs = -9223372036854775807L;
        this.legacyDecodingEnabled = false;
    }

    private void assertLegacyDecodingEnabledIfRequired() {
        d6z.w("Legacy decoding is disabled, can't handle " + this.streamFormat.n + " samples (expected application/x-media3-cues).", this.legacyDecodingEnabled || Objects.equals(this.streamFormat.n, "application/cea-608") || Objects.equals(this.streamFormat.n, "application/x-mp4-cea-608") || Objects.equals(this.streamFormat.n, "application/cea-708"));
    }

    private void clearOutput() {
        ImmutableList p = ImmutableList.p();
        getPresentationTimeUs(this.lastRendererPositionUs);
        updateOutput(new rdf(p));
    }

    private long getCurrentEventTimeUs(long j) {
        int h = this.subtitle.h(j);
        if (h == 0 || this.subtitle.g() == 0) {
            return this.subtitle.b;
        }
        l2v0 l2v0Var = this.subtitle;
        return h == -1 ? l2v0Var.c(l2v0Var.g() - 1) : l2v0Var.c(h - 1);
    }

    private long getNextEventTime() {
        if (this.nextSubtitleEventIndex == -1) {
            return ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
        this.subtitle.getClass();
        return this.nextSubtitleEventIndex >= this.subtitle.g() ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : this.subtitle.c(this.nextSubtitleEventIndex);
    }

    private long getPresentationTimeUs(long j) {
        d6z.x(j != -9223372036854775807L);
        return j - getStreamOffsetUs();
    }

    private void handleDecoderError(SubtitleDecoderException subtitleDecoderException) {
        lk91.f(TAG, "Subtitle decoding failed. streamFormat=" + this.streamFormat, subtitleDecoderException);
        clearOutput();
        replaceSubtitleDecoder();
    }

    private static boolean hasNoEventsAfter(e2v0 e2v0Var, long j) {
        return e2v0Var == null || e2v0Var.c(e2v0Var.g() - 1) <= j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r3.equals("application/cea-608") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void initSubtitleDecoder() {
        g2v0 n06Var;
        char c = 1;
        this.waitingForKeyFrame = true;
        h2v0 h2v0Var = this.subtitleDecoderFactory;
        a aVar = this.streamFormat;
        aVar.getClass();
        dlh dlhVar = (dlh) ((wor0) h2v0Var).a;
        String str = aVar.n;
        int i = aVar.I;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1566015601:
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    n06Var = new x59(str, i);
                    break;
                case 2:
                    n06Var = new b69(i, aVar.q);
                    break;
            }
            this.subtitleDecoder = n06Var;
            n06Var.f(getLastResetPositionUs());
        }
        if (!dlhVar.supportsFormat(aVar)) {
            ny61.g(g8e.o("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        }
        n06Var = new n06(dlhVar.e(aVar));
        this.subtitleDecoder = n06Var;
        n06Var.f(getLastResetPositionUs());
    }

    private void invokeUpdateOutputInternal(rdf rdfVar) {
        this.output.onCues(rdfVar.a);
        this.output.onCues(rdfVar);
    }

    private static boolean isCuesWithTiming(a aVar) {
        return Objects.equals(aVar.n, "application/x-media3-cues");
    }

    private boolean readAndDecodeCuesWithTiming(long j) {
        if (this.inputStreamEnded || readSource(this.formatHolder, this.cueDecoderInputBuffer, 0) != -4) {
            return false;
        }
        if (this.cueDecoderInputBuffer.b(4)) {
            this.inputStreamEnded = true;
            return false;
        }
        this.cueDecoderInputBuffer.j();
        ByteBuffer byteBuffer = this.cueDecoderInputBuffer.w;
        byteBuffer.getClass();
        pdf pdfVar = this.cueDecoder;
        long j2 = this.cueDecoderInputBuffer.y;
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        int limit = byteBuffer.limit();
        pdfVar.getClass();
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(array, arrayOffset, limit);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
        parcelableArrayList.getClass();
        x8e x8eVar = new x8e(11);
        piv pivVar = ImmutableList.b;
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            Bundle bundle = (Bundle) parcelableArrayList.get(i);
            bundle.getClass();
            aVar.a(x8eVar.mo489apply(bundle));
        }
        tdf tdfVar = new tdf(aVar.g(), j2, readBundle.getLong("d"));
        this.cueDecoderInputBuffer.d();
        return this.cuesResolver.a(tdfVar, j);
    }

    private void releaseSubtitleBuffers() {
        this.nextSubtitleInputBuffer = null;
        this.nextSubtitleEventIndex = -1;
        l2v0 l2v0Var = this.subtitle;
        if (l2v0Var != null) {
            l2v0Var.e();
            this.subtitle = null;
        }
        l2v0 l2v0Var2 = this.nextSubtitle;
        if (l2v0Var2 != null) {
            l2v0Var2.e();
            this.nextSubtitle = null;
        }
    }

    private void releaseSubtitleDecoder() {
        releaseSubtitleBuffers();
        g2v0 g2v0Var = this.subtitleDecoder;
        g2v0Var.getClass();
        g2v0Var.release();
        this.subtitleDecoder = null;
        this.decoderReplacementState = 0;
    }

    private void renderFromCuesWithTiming(long j) {
        boolean readAndDecodeCuesWithTiming = readAndDecodeCuesWithTiming(j);
        long c = this.cuesResolver.c(this.lastRendererPositionUs);
        if (c == Long.MIN_VALUE && this.inputStreamEnded && !readAndDecodeCuesWithTiming) {
            this.outputStreamEnded = true;
        }
        if (c != Long.MIN_VALUE && c <= j) {
            readAndDecodeCuesWithTiming = true;
        }
        if (readAndDecodeCuesWithTiming) {
            ImmutableList b = this.cuesResolver.b(j);
            long e = this.cuesResolver.e(j);
            getPresentationTimeUs(e);
            updateOutput(new rdf(b));
            this.cuesResolver.d(e);
        }
        this.lastRendererPositionUs = j;
    }

    private void renderFromSubtitles(long j) {
        boolean z;
        this.lastRendererPositionUs = j;
        if (this.nextSubtitle == null) {
            g2v0 g2v0Var = this.subtitleDecoder;
            g2v0Var.getClass();
            g2v0Var.a(j);
            try {
                g2v0 g2v0Var2 = this.subtitleDecoder;
                g2v0Var2.getClass();
                this.nextSubtitle = (l2v0) g2v0Var2.g();
            } catch (SubtitleDecoderException e) {
                handleDecoderError(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.subtitle != null) {
            long nextEventTime = getNextEventTime();
            z = false;
            while (nextEventTime <= j) {
                this.nextSubtitleEventIndex++;
                nextEventTime = getNextEventTime();
                z = true;
            }
        } else {
            z = false;
        }
        l2v0 l2v0Var = this.nextSubtitle;
        if (l2v0Var != null) {
            if (l2v0Var.b(4)) {
                if (!z && getNextEventTime() == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                    if (this.decoderReplacementState == 2) {
                        replaceSubtitleDecoder();
                    } else {
                        releaseSubtitleBuffers();
                        this.outputStreamEnded = true;
                    }
                }
            } else if (l2v0Var.b <= j) {
                l2v0 l2v0Var2 = this.subtitle;
                if (l2v0Var2 != null) {
                    l2v0Var2.e();
                }
                this.nextSubtitleEventIndex = l2v0Var.h(j);
                this.subtitle = l2v0Var;
                this.nextSubtitle = null;
                z = true;
            }
        }
        if (z) {
            this.subtitle.getClass();
            getPresentationTimeUs(getCurrentEventTimeUs(j));
            updateOutput(new rdf(this.subtitle.i(j)));
        }
        if (this.decoderReplacementState == 2) {
            return;
        }
        while (!this.inputStreamEnded) {
            try {
                k2v0 k2v0Var = this.nextSubtitleInputBuffer;
                if (k2v0Var == null) {
                    g2v0 g2v0Var3 = this.subtitleDecoder;
                    g2v0Var3.getClass();
                    k2v0Var = (k2v0) g2v0Var3.d();
                    if (k2v0Var == null) {
                        return;
                    } else {
                        this.nextSubtitleInputBuffer = k2v0Var;
                    }
                }
                if (this.decoderReplacementState == 1) {
                    k2v0Var.a = 4;
                    g2v0 g2v0Var4 = this.subtitleDecoder;
                    g2v0Var4.getClass();
                    g2v0Var4.e(k2v0Var);
                    this.nextSubtitleInputBuffer = null;
                    this.decoderReplacementState = 2;
                    return;
                }
                int readSource = readSource(this.formatHolder, k2v0Var, 0);
                if (readSource == -4) {
                    if (k2v0Var.b(4)) {
                        this.inputStreamEnded = true;
                        this.waitingForKeyFrame = false;
                    } else {
                        a aVar = this.formatHolder.b;
                        if (aVar == null) {
                            return;
                        }
                        k2v0Var.B = aVar.s;
                        k2v0Var.j();
                        this.waitingForKeyFrame &= !k2v0Var.b(1);
                    }
                    if (!this.waitingForKeyFrame) {
                        g2v0 g2v0Var5 = this.subtitleDecoder;
                        g2v0Var5.getClass();
                        g2v0Var5.e(k2v0Var);
                        this.nextSubtitleInputBuffer = null;
                    }
                } else if (readSource == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                handleDecoderError(e2);
                return;
            }
        }
    }

    private void replaceSubtitleDecoder() {
        releaseSubtitleDecoder();
        initSubtitleDecoder();
    }

    private void updateOutput(rdf rdfVar) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, rdfVar).sendToTarget();
        } else {
            invokeUpdateOutputInternal(rdfVar);
        }
    }

    @Override // defpackage.fyi0
    public /* bridge */ /* synthetic */ void enableMayRenderStartOfStream() {
    }

    @Deprecated
    public void experimentalSetLegacyDecodingEnabled(boolean z) {
        this.legacyDecodingEnabled = z;
    }

    @Override // defpackage.fyi0
    public /* bridge */ /* synthetic */ long getDurationToProgressUs(long j, long j2) {
        return 10000L;
    }

    @Override // defpackage.fyi0, defpackage.iyi0
    public String getName() {
        return TAG;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            invokeUpdateOutputInternal((rdf) message.obj);
            return true;
        }
        ny61.k();
        return false;
    }

    @Override // defpackage.a95, defpackage.fyi0
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // defpackage.fyi0
    public boolean isReady() {
        if (this.streamFormat == null) {
            return true;
        }
        if (this.streamError == null) {
            try {
                maybeThrowStreamError();
            } catch (IOException e) {
                this.streamError = e;
            }
        }
        if (this.streamError != null) {
            a aVar = this.streamFormat;
            aVar.getClass();
            if (isCuesWithTiming(aVar)) {
                sdf sdfVar = this.cuesResolver;
                sdfVar.getClass();
                return sdfVar.c(this.lastRendererPositionUs) != Long.MIN_VALUE;
            }
            if (this.outputStreamEnded || (this.inputStreamEnded && hasNoEventsAfter(this.subtitle, this.lastRendererPositionUs) && hasNoEventsAfter(this.nextSubtitle, this.lastRendererPositionUs) && this.nextSubtitleInputBuffer != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.a95
    public void onDisabled() {
        this.streamFormat = null;
        this.finalStreamEndPositionUs = -9223372036854775807L;
        clearOutput();
        this.lastRendererPositionUs = -9223372036854775807L;
        if (this.subtitleDecoder != null) {
            releaseSubtitleDecoder();
        }
    }

    @Override // defpackage.a95
    public void onPositionReset(long j, boolean z) {
        this.lastRendererPositionUs = j;
        sdf sdfVar = this.cuesResolver;
        if (sdfVar != null) {
            sdfVar.clear();
        }
        clearOutput();
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.finalStreamEndPositionUs = -9223372036854775807L;
        a aVar = this.streamFormat;
        if (aVar == null || isCuesWithTiming(aVar)) {
            return;
        }
        if (this.decoderReplacementState != 0) {
            replaceSubtitleDecoder();
            return;
        }
        releaseSubtitleBuffers();
        g2v0 g2v0Var = this.subtitleDecoder;
        g2v0Var.getClass();
        g2v0Var.flush();
        g2v0Var.f(getLastResetPositionUs());
    }

    @Override // defpackage.a95
    public void onStreamChanged(a[] aVarArr, long j, long j2, sf10 sf10Var) {
        a aVar = aVarArr[0];
        this.streamFormat = aVar;
        if (isCuesWithTiming(aVar)) {
            this.cuesResolver = this.streamFormat.J == 1 ? new ur10() : new s1j0();
            return;
        }
        assertLegacyDecodingEnabledIfRequired();
        if (this.subtitleDecoder != null) {
            this.decoderReplacementState = 1;
        } else {
            initSubtitleDecoder();
        }
    }

    @Override // defpackage.fyi0
    public void render(long j, long j2) {
        if (isCurrentStreamFinal()) {
            long j3 = this.finalStreamEndPositionUs;
            if (j3 != -9223372036854775807L && j >= j3) {
                releaseSubtitleBuffers();
                this.outputStreamEnded = true;
            }
        }
        if (this.outputStreamEnded) {
            return;
        }
        a aVar = this.streamFormat;
        aVar.getClass();
        if (isCuesWithTiming(aVar)) {
            this.cuesResolver.getClass();
            renderFromCuesWithTiming(j);
        } else {
            assertLegacyDecodingEnabledIfRequired();
            renderFromSubtitles(j);
        }
    }

    public void setFinalStreamEndPositionUs(long j) {
        d6z.x(isCurrentStreamFinal());
        this.finalStreamEndPositionUs = j;
    }

    @Override // defpackage.fyi0
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f, float f2) throws ExoPlaybackException {
    }

    @Override // defpackage.iyi0
    public int supportsFormat(a aVar) {
        if (!isCuesWithTiming(aVar)) {
            wor0 wor0Var = (wor0) this.subtitleDecoderFactory;
            wor0Var.getClass();
            String str = aVar.n;
            if (!((dlh) wor0Var.a).supportsFormat(aVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return eh20.o(aVar.n) ? iyi0.a(1, 0, 0, 0) : iyi0.a(0, 0, 0, 0);
            }
        }
        return iyi0.a(aVar.M == 0 ? 4 : 2, 0, 0, 0);
    }

    public TextRenderer(ury0 ury0Var, Looper looper) {
        this(ury0Var, looper, h2v0.c4);
    }
}
