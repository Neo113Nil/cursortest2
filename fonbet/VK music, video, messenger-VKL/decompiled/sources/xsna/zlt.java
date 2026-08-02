package xsna;

import android.os.Bundle;

/* compiled from: GeoPostsMviMappers.kt */
/* loaded from: classes4.dex */
public final class zlt implements yt60 {
    public final Object b;
    public final Object c;
    public final Object d;

    public zlt(fb8 fb8Var, clt0 clt0Var, Bundle bundle, int i) {
        fb8Var = (i & 2) != 0 ? null : fb8Var;
        clt0Var = (i & 4) != 0 ? null : clt0Var;
        bundle = (i & 8) != 0 ? null : bundle;
        this.b = fb8Var;
        this.c = clt0Var;
        this.d = bundle;
    }

    @Override // xsna.yt60
    public zt60 Z() {
        return (emt) this.c;
    }

    @Override // xsna.yt60
    public au60 d0() {
        return (umt) this.b;
    }

    @Override // xsna.yt60
    public xt60 h1() {
        return (ylt) this.d;
    }

    public zlt(umt umtVar, emt emtVar, ylt yltVar) {
        this.b = umtVar;
        this.c = emtVar;
        this.d = yltVar;
    }
}
