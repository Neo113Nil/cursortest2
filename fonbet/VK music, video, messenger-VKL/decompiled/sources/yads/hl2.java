package yads;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import xsna.cfz;

/* loaded from: classes10.dex */
public final class hl2 implements yn1 {
    public final o30 a;
    public final zk2 b;
    public hd0 c;
    public ae0 d;

    public hl2(o30 o30Var, sq0 sq0Var) {
        this(o30Var, new cfz(sq0Var, 25));
    }

    @Override // yads.yn1
    public final mo a(gn1 gn1Var) {
        gn1Var.c.getClass();
        Object obj = gn1Var.c.g;
        return new il2(gn1Var, this.a, this.b, this.c.a(gn1Var), this.d, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
    }

    public hl2(o30 o30Var, zk2 zk2Var) {
        this(o30Var, zk2Var, new hd0(), new ae0());
    }

    public hl2(o30 o30Var, zk2 zk2Var, hd0 hd0Var, ae0 ae0Var) {
        this.a = o30Var;
        this.b = zk2Var;
        this.c = hd0Var;
        this.d = ae0Var;
    }

    @Override // yads.yn1
    public final yn1 a(hd0 hd0Var) {
        if (hd0Var != null) {
            this.c = hd0Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // yads.yn1
    public final yn1 a(ae0 ae0Var) {
        if (ae0Var != null) {
            this.d = ae0Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    public static /* synthetic */ cr a(sq0 sq0Var, zf2 zf2Var) {
        return new cr(sq0Var);
    }
}
