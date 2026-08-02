package defpackage;

import com.adjust.sdk.Constants;

/* loaded from: classes13.dex */
public final class ouo0 {
    public final n5o0 a;

    public ouo0(n5o0 n5o0Var) {
        this.a = n5o0Var;
    }

    public static String a(wvn0 wvn0Var) {
        String str;
        if (jl40.l(wvn0Var, vvn0.b)) {
            str = "scooters_app";
        } else if (wvn0Var instanceof jvn0) {
            str = Constants.DEEPLINK;
        } else if (wvn0Var instanceof ovn0) {
            str = "detailed_order";
        } else if (wvn0Var instanceof pvn0) {
            str = "direct_active_super_pass";
        } else if (wvn0Var instanceof qvn0) {
            str = "direct_super_pass";
        } else if (wvn0Var instanceof rvn0) {
            str = "discovery";
        } else if (wvn0Var instanceof svn0) {
            str = "promo";
        } else if (wvn0Var instanceof tvn0) {
            str = "qr";
        } else {
            if (!(wvn0Var instanceof uvn0)) {
                w511.b();
                return null;
            }
            str = "scooter_offer_mode";
        }
        return "Perf.ScootersRouter.Launch#".concat(str);
    }
}
