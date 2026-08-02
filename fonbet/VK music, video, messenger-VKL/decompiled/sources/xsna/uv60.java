package xsna;

import org.json.JSONObject;

/* compiled from: NewsfeedPostsRecommendationsInteractor.kt */
/* loaded from: classes4.dex */
public final class uv60 {
    public final vv60 a;
    public final kh60 b;

    /* compiled from: NewsfeedPostsRecommendationsInteractor.kt */
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

    public uv60(vv60 vv60Var, rte0 rte0Var, kh60 kh60Var) {
        this.a = vv60Var;
        this.b = kh60Var;
    }

    public final io.reactivex.rxjava3.core.q<x960> a(og60 og60Var) {
        return io.reactivex.rxjava3.core.q.H0(rte0.p(), new io.reactivex.rxjava3.internal.operators.observable.s0(new hh60(0)), new io.reactivex.rxjava3.internal.operators.observable.s0(new ih60(this.b, og60Var.c)), new io.reactivex.rxjava3.internal.operators.observable.s0(new gh60()), new g7(new wii(3), 27)).r0(asu0.a.c()).L(new bj50(new g84(23, this, og60Var), 1), false);
    }
}
