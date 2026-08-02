package defpackage;

import com.yandex.plus.log.api.LogPriority;

/* loaded from: classes8.dex */
public final class m5z0 implements pgz {
    @Override // defpackage.pgz
    public final void a(LogPriority logPriority, String str, String str2) {
        b(logPriority, str, str2, null);
    }

    @Override // defpackage.pgz
    public final void b(LogPriority logPriority, String str, String str2, Throwable th) {
        String l = b64.l("[", str, "] ", str2);
        d5z0 d5z0Var = h5z0.a;
        d5z0Var.t("PlusPay");
        switch (k5z0.a[logPriority.ordinal()]) {
            case 1:
                d5z0Var.n(th, l, new Object[0]);
                break;
            case 2:
                d5z0Var.b(th, l, new Object[0]);
                break;
            case 3:
                d5z0Var.i(th, l, new Object[0]);
                break;
            case 4:
                d5z0Var.p(th, l, new Object[0]);
                break;
            case 5:
                d5z0Var.f(th, l, new Object[0]);
                break;
            case 6:
                d5z0Var.r(th, l, new Object[0]);
                break;
            default:
                w511.b();
                break;
        }
    }

    @Override // defpackage.pgz
    public final boolean e(LogPriority logPriority) {
        return true;
    }
}
