package xsna;

import org.json.JSONObject;

/* compiled from: NewsfeedDiscoverMediaInteractor.kt */
/* loaded from: classes4.dex */
public final class nh60 {
    public final oh60 a;
    public final kh60 b;
    public final ac60 c = new ac60();

    /* compiled from: NewsfeedDiscoverMediaInteractor.kt */
    public static final class a {
        public final JSONObject a;
        public final String b;
        public final String c;
        public final String d;

        public a(String str, JSONObject jSONObject, String str2, String str3) {
            this.a = jSONObject;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }
    }

    public nh60(oh60 oh60Var, rte0 rte0Var, kh60 kh60Var) {
        this.a = oh60Var;
        this.b = kh60Var;
    }

    public final mx6<x960> a(og60 og60Var, krk0 krk0Var) {
        this.c.getClass();
        bwq bwqVar = new bwq();
        return new mx6<>(io.reactivex.rxjava3.core.q.H0(rte0.p(), new io.reactivex.rxjava3.internal.operators.observable.s0(new hh60(0)), new io.reactivex.rxjava3.internal.operators.observable.s0(new ih60(this.b, og60Var.c)), new io.reactivex.rxjava3.internal.operators.observable.s0(new gh60()), new r2v(new ani(2), 9)).r0(asu0.a.c()).L(new or20(new jsg(this, og60Var, krk0Var, bwqVar, 2), 6), false), bwqVar);
    }
}
