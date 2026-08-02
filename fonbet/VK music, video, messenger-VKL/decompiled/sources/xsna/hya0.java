package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.k840;

/* compiled from: PlaybackQueueProviderImpl.kt */
/* loaded from: classes3.dex */
public final class hya0 {
    public final com.vk.music.pref.a a;
    public final zl20 b;
    public final u940 c;
    public final nxa0 d;

    /* compiled from: PlaybackQueueProviderImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            ((com.vk.core.utils.newtork.b) this.receiver).getClass();
            return Boolean.valueOf(com.vk.core.utils.newtork.b.d());
        }
    }

    public hya0(com.vk.music.pref.a aVar, zl20 zl20Var, u940 u940Var, nxa0 nxa0Var) {
        this.a = aVar;
        this.b = zl20Var;
        this.c = u940Var;
        this.d = nxa0Var;
    }

    public final hxa0 a() {
        ozd0 ozd0Var = new ozd0();
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        xn4 xn4Var = new xn4((b25) bpn0Var.getValue(), this.c, ozd0Var);
        cbb cbbVar = new cbb(this, 5);
        r5v0 r5v0Var = null;
        r5v0 r5v0Var2 = k840.a.h;
        if (r5v0Var2 != null) {
            r5v0Var = r5v0Var2;
        }
        return new com.vk.music.player.playback.c(cbbVar, ozd0Var, this.d, this.a, r5v0Var.a.a, new px30(this, 19), new a(0, com.vk.core.utils.newtork.b.a, com.vk.core.utils.newtork.b.class, "isConnected", "isConnected()Z", 0), xn4Var);
    }
}
