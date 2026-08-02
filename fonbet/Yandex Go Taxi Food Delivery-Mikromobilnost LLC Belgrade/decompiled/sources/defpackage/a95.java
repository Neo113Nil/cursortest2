package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.io.IOException;
import java.util.Objects;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public abstract class a95 implements fyi0, iyi0 {
    private y3c clock;
    private lyi0 configuration;
    private int index;
    private long lastResetPositionUs;
    private vyc0 playerId;
    private hyi0 rendererCapabilitiesListener;
    private int state;
    private xyl0 stream;
    private a[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;
    private final Object lock = new Object();
    private final o7s formatHolder = new o7s();
    private long readingPositionUs = Long.MIN_VALUE;
    private a9z0 timeline = a9z0.a;

    public a95(int i) {
        this.trackType = i;
    }

    @Override // defpackage.iyi0
    public final void clearListener() {
        synchronized (this.lock) {
            this.rendererCapabilitiesListener = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExoPlaybackException createRendererException(Throwable th, a aVar, boolean z, int i) {
        int i2;
        if (aVar != null && !this.throwRendererExceptionIsExecuting) {
            this.throwRendererExceptionIsExecuting = true;
            try {
                i2 = supportsFormat(aVar) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.throwRendererExceptionIsExecuting = false;
            }
            return new ExoPlaybackException(1, th, i, getName(), getIndex(), aVar, aVar != null ? 4 : i2, z);
        }
        i2 = 4;
        return new ExoPlaybackException(1, th, i, getName(), getIndex(), aVar, aVar != null ? 4 : i2, z);
    }

    @Override // defpackage.fyi0
    public final void disable() {
        d6z.x(this.state == 1);
        o7s o7sVar = this.formatHolder;
        o7sVar.a = null;
        o7sVar.b = null;
        this.state = 0;
        this.stream = null;
        this.streamFormats = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    @Override // defpackage.fyi0
    public final void enable(lyi0 lyi0Var, a[] aVarArr, xyl0 xyl0Var, long j, boolean z, boolean z2, long j2, long j3, sf10 sf10Var) throws ExoPlaybackException {
        d6z.x(this.state == 0);
        this.configuration = lyi0Var;
        this.state = 1;
        onEnabled(z, z2);
        replaceStream(aVarArr, xyl0Var, j2, j3, sf10Var);
        this.streamIsFinal = false;
        this.lastResetPositionUs = j2;
        this.readingPositionUs = j2;
        onPositionReset(j2, z);
    }

    @Override // defpackage.fyi0
    public final iyi0 getCapabilities() {
        return this;
    }

    public final y3c getClock() {
        y3c y3cVar = this.clock;
        y3cVar.getClass();
        return y3cVar;
    }

    public final lyi0 getConfiguration() {
        lyi0 lyi0Var = this.configuration;
        lyi0Var.getClass();
        return lyi0Var;
    }

    public final o7s getFormatHolder() {
        o7s o7sVar = this.formatHolder;
        o7sVar.a = null;
        o7sVar.b = null;
        return o7sVar;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getLastResetPositionUs() {
        return this.lastResetPositionUs;
    }

    @Override // defpackage.fyi0
    public kb10 getMediaClock() {
        return null;
    }

    public final vyc0 getPlayerId() {
        vyc0 vyc0Var = this.playerId;
        vyc0Var.getClass();
        return vyc0Var;
    }

    @Override // defpackage.fyi0
    public final long getReadingPositionUs() {
        return this.readingPositionUs;
    }

    @Override // defpackage.fyi0
    public final int getState() {
        return this.state;
    }

    @Override // defpackage.fyi0
    public final xyl0 getStream() {
        return this.stream;
    }

    public final a[] getStreamFormats() {
        a[] aVarArr = this.streamFormats;
        aVarArr.getClass();
        return aVarArr;
    }

    public final long getStreamOffsetUs() {
        return this.streamOffsetUs;
    }

    public final a9z0 getTimeline() {
        return this.timeline;
    }

    @Override // defpackage.fyi0, defpackage.iyi0
    public final int getTrackType() {
        return this.trackType;
    }

    @Override // defpackage.xyc0
    public void handleMessage(int i, Object obj) throws ExoPlaybackException {
    }

    @Override // defpackage.fyi0
    public final boolean hasReadStreamToEnd() {
        return this.readingPositionUs == Long.MIN_VALUE;
    }

    @Override // defpackage.fyi0
    public final void init(int i, vyc0 vyc0Var, y3c y3cVar) {
        this.index = i;
        this.playerId = vyc0Var;
        this.clock = y3cVar;
        onInit();
    }

    @Override // defpackage.fyi0
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    @Override // defpackage.fyi0
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    public final boolean isSourceReady() {
        if (hasReadStreamToEnd()) {
            return this.streamIsFinal;
        }
        xyl0 xyl0Var = this.stream;
        xyl0Var.getClass();
        return xyl0Var.isReady();
    }

    @Override // defpackage.fyi0
    public final void maybeThrowStreamError() throws IOException {
        xyl0 xyl0Var = this.stream;
        xyl0Var.getClass();
        xyl0Var.b();
    }

    public abstract void onDisabled();

    public void onEnabled(boolean z, boolean z2) throws ExoPlaybackException {
    }

    public void onInit() {
    }

    public abstract void onPositionReset(long j, boolean z);

    public void onRelease() {
    }

    public final void onRendererCapabilitiesChanged() {
        hyi0 hyi0Var;
        synchronized (this.lock) {
            hyi0Var = this.rendererCapabilitiesListener;
        }
        if (hyi0Var != null) {
            hyi0Var.onRendererCapabilitiesChanged(this);
        }
    }

    public void onReset() {
    }

    public void onStarted() throws ExoPlaybackException {
    }

    public void onStopped() {
    }

    public void onStreamChanged(a[] aVarArr, long j, long j2, sf10 sf10Var) {
    }

    public void onTimelineChanged(a9z0 a9z0Var) {
    }

    public final int readSource(o7s o7sVar, nyg nygVar, int i) {
        xyl0 xyl0Var = this.stream;
        xyl0Var.getClass();
        int q = xyl0Var.q(o7sVar, nygVar, i);
        if (q == -4) {
            if (nygVar.b(4)) {
                this.readingPositionUs = Long.MIN_VALUE;
                return this.streamIsFinal ? -4 : -3;
            }
            long j = nygVar.y + this.streamOffsetUs;
            nygVar.y = j;
            this.readingPositionUs = Math.max(this.readingPositionUs, j);
            return q;
        }
        if (q == -5) {
            a aVar = o7sVar.b;
            aVar.getClass();
            long j2 = aVar.s;
            if (j2 != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                f7s a = aVar.a();
                a.r = j2 + this.streamOffsetUs;
                o7sVar.b = new a(a);
            }
        }
        return q;
    }

    @Override // defpackage.fyi0
    public final void release() {
        d6z.x(this.state == 0);
        onRelease();
    }

    @Override // defpackage.fyi0
    public final void replaceStream(a[] aVarArr, xyl0 xyl0Var, long j, long j2, sf10 sf10Var) throws ExoPlaybackException {
        d6z.x(!this.streamIsFinal);
        this.stream = xyl0Var;
        if (this.readingPositionUs == Long.MIN_VALUE) {
            this.readingPositionUs = j;
        }
        this.streamFormats = aVarArr;
        this.streamOffsetUs = j2;
        onStreamChanged(aVarArr, j, j2, sf10Var);
    }

    @Override // defpackage.fyi0
    public final void reset() {
        d6z.x(this.state == 0);
        o7s o7sVar = this.formatHolder;
        o7sVar.a = null;
        o7sVar.b = null;
        onReset();
    }

    @Override // defpackage.fyi0
    public final void resetPosition(long j) throws ExoPlaybackException {
        this.streamIsFinal = false;
        this.lastResetPositionUs = j;
        this.readingPositionUs = j;
        onPositionReset(j, false);
    }

    @Override // defpackage.fyi0
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // defpackage.iyi0
    public final void setListener(hyi0 hyi0Var) {
        synchronized (this.lock) {
            this.rendererCapabilitiesListener = hyi0Var;
        }
    }

    @Override // defpackage.fyi0
    public final void setTimeline(a9z0 a9z0Var) {
        if (Objects.equals(this.timeline, a9z0Var)) {
            return;
        }
        this.timeline = a9z0Var;
        onTimelineChanged(a9z0Var);
    }

    public int skipSource(long j) {
        xyl0 xyl0Var = this.stream;
        xyl0Var.getClass();
        return xyl0Var.r(j - this.streamOffsetUs);
    }

    @Override // defpackage.fyi0
    public final void start() throws ExoPlaybackException {
        d6z.x(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // defpackage.fyi0
    public final void stop() {
        d6z.x(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // defpackage.iyi0
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }

    public final ExoPlaybackException createRendererException(Throwable th, a aVar, int i) {
        return createRendererException(th, aVar, false, i);
    }
}
