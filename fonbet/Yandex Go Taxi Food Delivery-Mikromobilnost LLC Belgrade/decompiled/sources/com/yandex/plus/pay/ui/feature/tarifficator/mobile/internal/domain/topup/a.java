package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup;

import android.content.Context;
import com.yandex.plus.core.data.common.PlusThemedUrl;
import com.yandex.plus.pay.internal.model.PlusPayTopupScreenConfiguration;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.add0;
import defpackage.ehb1;
import defpackage.fpd0;
import defpackage.hxz0;
import defpackage.ind0;
import defpackage.ixz0;
import defpackage.knd0;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tpd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements ixz0 {
    public final Context a;
    public final knd0 b;
    public final add0 c;
    public final n4u0 d;

    public a(Context context, knd0 knd0Var, add0 add0Var, n4u0 n4u0Var) {
        this.a = context;
        this.b = knd0Var;
        this.c = add0Var;
        this.d = n4u0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:32|33))(10:34|(2:37|35)|38|39|(4:42|(3:44|45|46)(1:48)|47|40)|49|50|(2:51|(2:53|(1:55)(1:59))(2:60|61))|56|(1:58))|12|13|(1:15)|16|(4:18|(4:20|(1:22)(1:26)|23|(1:25))|27|28)(1:30)))|68|6|7|(0)(0)|12|13|(0)|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0040, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d0, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ce, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cf, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x003d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c8, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ind0 ind0Var, ContinuationImpl continuationImpl) {
        TopupConfigurationInteractorImpl$getTopupConfiguration$1 topupConfigurationInteractorImpl$getTopupConfiguration$1;
        Object obj;
        int i;
        PlusPayTopupScreenConfiguration plusPayTopupScreenConfiguration;
        String str;
        if (continuationImpl instanceof TopupConfigurationInteractorImpl$getTopupConfiguration$1) {
            topupConfigurationInteractorImpl$getTopupConfiguration$1 = (TopupConfigurationInteractorImpl$getTopupConfiguration$1) continuationImpl;
            int i2 = topupConfigurationInteractorImpl$getTopupConfiguration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                topupConfigurationInteractorImpl$getTopupConfiguration$1.label = i2 - Integer.MIN_VALUE;
                obj = topupConfigurationInteractorImpl$getTopupConfiguration$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = topupConfigurationInteractorImpl$getTopupConfiguration$1.label;
                String str2 = null;
                if (i != 0) {
                    b.b(obj);
                    List list = ind0Var.c;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusTarifficatorPurchase) it.next()).getStatus());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof PlusTarifficatorPurchase.Status.Success) {
                            arrayList2.add(next);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            str = null;
                            break;
                        }
                        str = ((PlusTarifficatorPurchase.Status.Success) it3.next()).getInvoiceId();
                        if (str != null) {
                            break;
                        }
                    }
                    fpd0 e = ((com.yandex.plus.pay.internal.b) this.c).e();
                    topupConfigurationInteractorImpl$getTopupConfiguration$1.L$0 = null;
                    topupConfigurationInteractorImpl$getTopupConfiguration$1.L$1 = null;
                    topupConfigurationInteractorImpl$getTopupConfiguration$1.L$2 = null;
                    topupConfigurationInteractorImpl$getTopupConfiguration$1.L$3 = null;
                    topupConfigurationInteractorImpl$getTopupConfiguration$1.L$4 = null;
                    topupConfigurationInteractorImpl$getTopupConfiguration$1.I$0 = 0;
                    topupConfigurationInteractorImpl$getTopupConfiguration$1.I$1 = 0;
                    topupConfigurationInteractorImpl$getTopupConfiguration$1.label = 1;
                    obj = ((com.yandex.plus.pay.internal.feature.payment.a) e).e(str, topupConfigurationInteractorImpl$getTopupConfiguration$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                plusPayTopupScreenConfiguration = (PlusPayTopupScreenConfiguration) obj;
                ind0 a = this.b.a();
                if (plusPayTopupScreenConfiguration != null) {
                    return null;
                }
                String actionScenario = plusPayTopupScreenConfiguration.getActionScenario();
                PlusThemedUrl widgetUrl = plusPayTopupScreenConfiguration.getWidgetUrl();
                if (widgetUrl != null) {
                    String str3 = (String) (tpd0.a(this.a, (PlusTheme) this.d.getValue()) ? widgetUrl.getDark() : widgetUrl.getLight());
                    if (str3 != null) {
                        str2 = ehb1.b(str3, a.a);
                    }
                }
                return new hxz0(plusPayTopupScreenConfiguration.getTimeoutParams().getStartMessageTimeoutMillis(), actionScenario, str2, plusPayTopupScreenConfiguration.getTimeoutParams().getLoadMessageTimeoutMillis());
            }
        }
        topupConfigurationInteractorImpl$getTopupConfiguration$1 = new TopupConfigurationInteractorImpl$getTopupConfiguration$1(this, continuationImpl);
        obj = topupConfigurationInteractorImpl$getTopupConfiguration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = topupConfigurationInteractorImpl$getTopupConfiguration$1.label;
        String str22 = null;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
        plusPayTopupScreenConfiguration = (PlusPayTopupScreenConfiguration) obj;
        ind0 a2 = this.b.a();
        if (plusPayTopupScreenConfiguration != null) {
        }
    }
}
