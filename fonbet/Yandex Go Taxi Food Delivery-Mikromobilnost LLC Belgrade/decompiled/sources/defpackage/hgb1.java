package defpackage;

import com.yandex.xplat.payment.sdk.ExternalErrorKind;

/* loaded from: classes11.dex */
public abstract class hgb1 {
    public static au2 a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final ExternalErrorKind a(String str) {
        if (str == null) {
            return ExternalErrorKind.unknown;
        }
        switch (str.hashCode()) {
            case -1562584233:
                if (str.equals("limit_exceeded")) {
                    return ExternalErrorKind.limit_exceeded;
                }
                break;
            case -1528707547:
                if (str.equals("authorization_reject")) {
                    return ExternalErrorKind.payment_authorization_reject;
                }
                break;
            case 675222369:
                if (str.equals("fail_3ds")) {
                    return ExternalErrorKind.fail_3ds;
                }
                break;
            case 1635433643:
                if (str.equals("not_enough_funds")) {
                    return ExternalErrorKind.not_enough_funds;
                }
                break;
            case 2038628819:
                if (str.equals("unknown_error")) {
                    return ExternalErrorKind.unknown;
                }
                break;
        }
        return ExternalErrorKind.unknown;
    }

    public static final au2 b() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Location", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.j(9.48f, 14.52f);
        uq90Var.h(11.91f, 21.0f);
        uq90Var.g(0.81f);
        uq90Var.h(19.0f, 5.6f);
        uq90Var.i(-0.6f, -0.6f);
        uq90Var.h(3.0f, 11.28f);
        uq90Var.p(0.8f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static boolean c(hau0 hau0Var) {
        return (hau0Var instanceof x9u0) && ((x9u0) hau0Var).a;
    }
}
