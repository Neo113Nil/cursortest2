package xsna;

import kotlin.LazyThreadSafetyMode;
import org.json.JSONObject;

/* compiled from: NewsfeedCustomInteractor.kt */
/* loaded from: classes4.dex */
public final class nf60 {
    public final tg60 a;
    public final kh60 b;
    public final ac60 c = new ac60();
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new kk1(16));

    /* compiled from: NewsfeedCustomInteractor.kt */
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

    public nf60(tg60 tg60Var, rte0 rte0Var, kh60 kh60Var) {
        this.a = tg60Var;
        this.b = kh60Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final mx6<x960> a(og60 og60Var) {
        this.c.getClass();
        return new mx6<>(io.reactivex.rxjava3.core.q.H0(rte0.p(), ((Boolean) this.d.getValue()).booleanValue() ? new io.reactivex.rxjava3.internal.operators.observable.s0(new hh60(1)) : new io.reactivex.rxjava3.internal.operators.observable.s0(new hh60(0)), new io.reactivex.rxjava3.internal.operators.observable.s0(new ih60(this.b, og60Var.c)), new io.reactivex.rxjava3.internal.operators.observable.s0(new gh60()), new e4t(new ioi(1), 6)).r0(asu0.a.c()).L(new hl30(new g86(15, this, og60Var), 4), false), new bwq());
    }
}
