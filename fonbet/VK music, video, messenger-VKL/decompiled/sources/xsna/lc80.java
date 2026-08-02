package xsna;

import com.vk.dto.common.Peer;

/* compiled from: OnTranslateMsg.kt */
/* loaded from: classes2.dex */
public abstract class lc80 extends sxp {
    public final Peer b;
    public final int c;
    public final e500 d;

    /* compiled from: OnTranslateMsg.kt */
    public static final class a extends lc80 {
        public final int e;

        public a(Peer peer, int i, int i2, xnp0 xnp0Var) {
            super(peer, i, xnp0Var);
            this.e = i2;
        }
    }

    /* compiled from: OnTranslateMsg.kt */
    public static final class b extends lc80 {
        public final String e;
        public final String f;
        public final String g;

        public b(Peer peer, int i, String str, String str2, String str3, znp0 znp0Var) {
            super(peer, i, znp0Var);
            this.e = str;
            this.f = str2;
            this.g = str3;
        }
    }

    public lc80(Peer peer, int i, e500 e500Var) {
        this.b = peer;
        this.c = i;
        this.d = e500Var;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.d;
    }
}
