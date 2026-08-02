package androidx.media3.exoplayer.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.a;
import androidx.media3.exoplayer.ExoPlaybackException;
import defpackage.a920;
import defpackage.a95;
import defpackage.b920;
import defpackage.d6z;
import defpackage.d920;
import defpackage.ies0;
import defpackage.iyi0;
import defpackage.k920;
import defpackage.ny61;
import defpackage.o7s;
import defpackage.r400;
import defpackage.s820;
import defpackage.sf10;
import defpackage.tw21;
import defpackage.w820;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class MetadataRenderer extends a95 implements Handler.Callback {
    private static final int MSG_INVOKE_RENDERER = 1;
    private static final String TAG = "MetadataRenderer";
    private final d920 buffer;
    private a920 decoder;
    private final b920 decoderFactory;
    private boolean inputStreamEnded;
    private final k920 output;
    private final Handler outputHandler;
    private final boolean outputMetadataEarly;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private w820 pendingMetadata;
    private long subsampleOffsetUs;

    public MetadataRenderer(k920 k920Var, Looper looper, b920 b920Var, boolean z) {
        super(5);
        k920Var.getClass();
        this.output = k920Var;
        this.outputHandler = looper == null ? null : new Handler(looper, this);
        b920Var.getClass();
        this.decoderFactory = b920Var;
        this.outputMetadataEarly = z;
        this.buffer = new d920();
        this.outputStreamOffsetUs = -9223372036854775807L;
    }

    private void decodeWrappedMetadata(w820 w820Var, List<s820> list) {
        int i = 0;
        while (true) {
            s820[] s820VarArr = w820Var.a;
            if (i >= s820VarArr.length) {
                return;
            }
            a wrappedMetadataFormat = s820VarArr[i].getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !((r400) this.decoderFactory).m(wrappedMetadataFormat)) {
                list.add(s820VarArr[i]);
            } else {
                ies0 f = ((r400) this.decoderFactory).f(wrappedMetadataFormat);
                byte[] wrappedMetadataBytes = s820VarArr[i].getWrappedMetadataBytes();
                wrappedMetadataBytes.getClass();
                this.buffer.d();
                this.buffer.f(wrappedMetadataBytes.length);
                this.buffer.w.put(wrappedMetadataBytes);
                this.buffer.j();
                w820 a = f.a(this.buffer);
                if (a != null) {
                    decodeWrappedMetadata(a, list);
                }
            }
            i++;
        }
    }

    private long getPresentationTimeUs(long j) {
        d6z.x(j != -9223372036854775807L);
        d6z.x(this.outputStreamOffsetUs != -9223372036854775807L);
        return j - this.outputStreamOffsetUs;
    }

    private void invokeRenderer(w820 w820Var) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, w820Var).sendToTarget();
        } else {
            invokeRendererInternal(w820Var);
        }
    }

    private void invokeRendererInternal(w820 w820Var) {
        this.output.onMetadata(w820Var);
    }

    private boolean outputMetadata(long j) {
        boolean z;
        w820 w820Var = this.pendingMetadata;
        if (w820Var == null || (!this.outputMetadataEarly && w820Var.b > getPresentationTimeUs(j))) {
            z = false;
        } else {
            invokeRenderer(this.pendingMetadata);
            this.pendingMetadata = null;
            z = true;
        }
        if (this.inputStreamEnded && this.pendingMetadata == null) {
            this.outputStreamEnded = true;
        }
        return z;
    }

    private void readMetadata() {
        if (this.inputStreamEnded || this.pendingMetadata != null) {
            return;
        }
        this.buffer.d();
        o7s formatHolder = getFormatHolder();
        int readSource = readSource(formatHolder, this.buffer, 0);
        if (readSource != -4) {
            if (readSource == -5) {
                a aVar = formatHolder.b;
                aVar.getClass();
                this.subsampleOffsetUs = aVar.s;
                return;
            }
            return;
        }
        if (this.buffer.b(4)) {
            this.inputStreamEnded = true;
            return;
        }
        if (this.buffer.y >= getLastResetPositionUs()) {
            d920 d920Var = this.buffer;
            d920Var.B = this.subsampleOffsetUs;
            d920Var.j();
            a920 a920Var = this.decoder;
            int i = tw21.a;
            w820 a = ((ies0) a920Var).a(this.buffer);
            if (a != null) {
                ArrayList arrayList = new ArrayList(a.a.length);
                decodeWrappedMetadata(a, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.pendingMetadata = new w820(getPresentationTimeUs(this.buffer.y), (s820[]) arrayList.toArray(new s820[0]));
            }
        }
    }

    @Override // defpackage.fyi0
    public /* bridge */ /* synthetic */ void enableMayRenderStartOfStream() {
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
            invokeRendererInternal((w820) message.obj);
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
        return true;
    }

    @Override // defpackage.a95
    public void onDisabled() {
        this.pendingMetadata = null;
        this.decoder = null;
        this.outputStreamOffsetUs = -9223372036854775807L;
    }

    @Override // defpackage.a95
    public void onPositionReset(long j, boolean z) {
        this.pendingMetadata = null;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
    }

    @Override // defpackage.a95
    public void onStreamChanged(a[] aVarArr, long j, long j2, sf10 sf10Var) {
        this.decoder = ((r400) this.decoderFactory).f(aVarArr[0]);
        w820 w820Var = this.pendingMetadata;
        if (w820Var != null) {
            long j3 = w820Var.b;
            long j4 = (this.outputStreamOffsetUs + j3) - j2;
            if (j3 != j4) {
                w820Var = new w820(j4, w820Var.a);
            }
            this.pendingMetadata = w820Var;
        }
        this.outputStreamOffsetUs = j2;
    }

    @Override // defpackage.fyi0
    public void render(long j, long j2) {
        boolean z = true;
        while (z) {
            readMetadata();
            z = outputMetadata(j);
        }
    }

    @Override // defpackage.fyi0
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f, float f2) throws ExoPlaybackException {
    }

    @Override // defpackage.iyi0
    public int supportsFormat(a aVar) {
        if (((r400) this.decoderFactory).m(aVar)) {
            return iyi0.a(aVar.M == 0 ? 4 : 2, 0, 0, 0);
        }
        return iyi0.a(0, 0, 0, 0);
    }

    public MetadataRenderer(k920 k920Var, Looper looper, b920 b920Var) {
        this(k920Var, looper, b920Var, false);
    }

    public MetadataRenderer(k920 k920Var, Looper looper) {
        this(k920Var, looper, b920.M2);
    }
}
