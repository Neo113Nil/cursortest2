package defpackage;

import com.yandex.plus.core.config.Environment;

/* loaded from: classes4.dex */
public abstract class gu91 {
    public static final tig0 a = new tig0(new t1m0(0, 7), new i1m0(1));
    public static final tig0 b = new tig0(new t1m0(0, 8), new i1m0(2));
    public static final tig0 c = new tig0(new t1m0(0, 9), new i1m0(3));
    public static final tig0 d = new tig0(new t1m0(0, 10), new i1m0(4));
    public static final tig0 e = new tig0(new t1m0(0, 11), new i1m0(5));

    public static xqm a(brm brmVar) {
        if (brmVar instanceof yqm) {
            return new tqm(null, null);
        }
        if (brmVar instanceof zqm) {
            return new vqm(12.0f, ((zqm) brmVar).a);
        }
        if (brmVar.equals(arm.a)) {
            return wqm.a;
        }
        w511.b();
        return null;
    }

    public static String b(Environment environment) {
        int i = lhd0.a[environment.ordinal()];
        if (i == 1) {
            return "union_mediaservices_9ce4193462e8fe3efdc7b31f60f4d74a";
        }
        if (i == 2) {
            return "union_mediaservices_be17bb5c43e8a179db49b123454678ed";
        }
        w511.b();
        return null;
    }
}
