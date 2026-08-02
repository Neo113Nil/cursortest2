package xsna;

import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;

/* compiled from: MusicSimilarTracksSectionCreator.kt */
/* loaded from: classes16.dex */
public final class s550 {
    public final ix4 a = new ix4();

    /* compiled from: MusicSimilarTracksSectionCreator.kt */
    public static final class a {
        public static String a(Boolean bool, String str) {
            return "synthetic_section_similar_tracks_" + str + "_isKidsContext_" + bool;
        }
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 a(String str) {
        List c0 = drm0.c0(drm0.U(str, "synthetic_section_similar_tracks_"), new String[]{"_isKidsContext_"}, 0, 6);
        String str2 = (String) j5g.a0(c0);
        io.reactivex.rxjava3.internal.operators.observable.m1 T = rsg0.T(yfb.x(this.a.n(Boolean.valueOf(Boolean.parseBoolean((String) j5g.k0(c0))), str2)));
        qw40 qw40Var = new qw40(new b4r(18), 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return T.E(qw40Var, lVar, kVar, kVar).F(new rkz(new ept(14), 9)).U(new nh40(new hba(this, str), 1)).a0(asu0.a.d());
    }
}
