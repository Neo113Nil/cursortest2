package defpackage;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.PlusTarifficatorMobileArguments;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.SuccessFlowScreen;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.UpsaleFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class m3v0 implements k3v0 {
    public static final List e = scc.g(SuccessFlowScreen.UPSALE, SuccessFlowScreen.TOPUP, SuccessFlowScreen.FAMILY_INVITATION, SuccessFlowScreen.CONTACTS, SuccessFlowScreen.SUCCESS);
    public final Set a;
    public final ftb b;
    public final fwa0 c;
    public final sls d;

    public m3v0(Set set, ftb ftbVar, fwa0 fwa0Var, sls slsVar) {
        this.a = set;
        this.b = ftbVar;
        this.c = fwa0Var;
        this.d = slsVar;
    }

    public final void a() {
        hwa0 hwa0Var = (hwa0) this.c;
        pgz pgzVar = hwa0Var.e;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "PerformanceSessionImpl", "onEndFlow()");
        }
        hwa0Var.a((ll5) hwa0Var.i.getValue());
        this.b.a();
    }

    public final void b(SuccessFlowScreen successFlowScreen) {
        Object obj;
        List list = e;
        Iterator it = list.subList(list.indexOf(successFlowScreen) + 1, list.size()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (d((SuccessFlowScreen) obj, this.a)) {
                    break;
                }
            }
        }
        SuccessFlowScreen successFlowScreen2 = (SuccessFlowScreen) obj;
        if (successFlowScreen2 != null) {
            c(successFlowScreen2);
        } else {
            a();
        }
    }

    public final void c(SuccessFlowScreen successFlowScreen) {
        int i = l3v0.a[successFlowScreen.ordinal()];
        ftb ftbVar = this.b;
        if (i == 1) {
            ftbVar.getClass();
            ftbVar.c(new UpsaleFragment(), "Upsale");
            return;
        }
        if (i == 2) {
            ftbVar.getClass();
            ftbVar.c(new TopupFragment(), "Topup");
            return;
        }
        if (i == 3) {
            ftbVar.getClass();
            ftbVar.c(new FamilyFragment(), "Family");
        } else if (i == 4) {
            ftbVar.getClass();
            ftbVar.c(new ContactsFragment(), "Contacts");
        } else if (i != 5) {
            w511.b();
        } else {
            ftbVar.getClass();
            ftbVar.c(new SuccessFragment(), "Success");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(SuccessFlowScreen successFlowScreen, Set set) {
        int i = l3v0.a[successFlowScreen.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return !set.contains(PlusTarifficatorMobileArguments.Screen.SUCCESS);
                        }
                        w511.b();
                        return false;
                    }
                    if (!set.contains(PlusTarifficatorMobileArguments.Screen.CONTACTS)) {
                    }
                } else if (!set.contains(PlusTarifficatorMobileArguments.Screen.FAMILY)) {
                }
            } else if (set.contains(PlusTarifficatorMobileArguments.Screen.TOPUP) || !((Boolean) this.d.invoke()).booleanValue()) {
            }
        } else if (!set.contains(PlusTarifficatorMobileArguments.Screen.UPSALE)) {
        }
    }

    public final void e() {
        Object obj;
        Iterator it = e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (d((SuccessFlowScreen) obj, this.a)) {
                    break;
                }
            }
        }
        SuccessFlowScreen successFlowScreen = (SuccessFlowScreen) obj;
        if (successFlowScreen != null) {
            c(successFlowScreen);
        } else {
            a();
        }
    }
}
