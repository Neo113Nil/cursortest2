package xsna;

import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;

/* compiled from: AudioAttachCornersHelper.kt */
/* loaded from: classes2.dex */
public final class gc4 {
    public final Object a;
    public final Object b;

    public gc4(Context context) {
        this.a = context;
        this.b = new bpn0(new bu1(this, 2));
    }

    public void a(dc4 dc4Var, View view) {
        Pair pair;
        Pair pair2;
        if (dc4Var.a0()) {
            f14 e = dc4Var.e(view.getContext());
            Pair pair3 = new Pair(Float.valueOf(e.a), Float.valueOf(e.b));
            view.setOutlineProvider(new fc4(((Number) pair3.d()).floatValue(), ((Number) pair3.g()).floatValue(), dc4Var.p((Context) this.a)));
            return;
        }
        Context context = view.getContext();
        if (!dc4Var.j()) {
            pair = new Pair(Float.valueOf(b()), Float.valueOf(b()));
        } else if (dc4Var.k() || !(dc4Var.r() || dc4Var.T())) {
            if (dc4Var.k()) {
                float c = dc4Var.c(context);
                pair2 = new Pair(Float.valueOf(c), Float.valueOf(c));
            } else {
                pair2 = new Pair(Float.valueOf(dc4Var.m0(context)), Float.valueOf(b()));
            }
            pair = pair2;
        } else {
            pair = new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Float.valueOf(b()));
        }
        view.setOutlineProvider(new ec4(((Number) pair.d()).floatValue(), ((Number) pair.g()).floatValue()));
    }

    public float b() {
        return ((Number) ((bpn0) this.b).getValue()).floatValue();
    }

    public String c() {
        return (String) this.a;
    }

    public String d() {
        return (String) this.b;
    }

    public gc4() {
        io.reactivex.rxjava3.subjects.d O0 = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
        this.a = O0;
        this.b = new io.reactivex.rxjava3.internal.operators.observable.y(O0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public gc4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
