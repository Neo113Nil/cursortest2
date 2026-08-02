package com.ybsdk.feature.savings.internal.mapper;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.savings.internal.entities.SavingsDashboardPollStatus;
import com.ybsdk.feature.savings.internal.network.dto.DashboardDataResponse;
import com.ybsdk.feature.savings.internal.network.dto.DashboardDataResponseV3;
import com.ybsdk.feature.savings.internal.network.dto.DivSavingsAccountResponse;
import com.ybsdk.feature.savings.internal.network.dto.DivkitWidgetDto;
import com.ybsdk.feature.savings.internal.network.dto.NoAccountsInfoResponseV3;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountsInfoResponseV3;
import com.ybsdk.feature.savings.internal.network.dto.SavingsCellResponse;
import com.ybsdk.feature.savings.internal.network.dto.SavingsInterestHintResponse;
import defpackage.bob1;
import defpackage.ddm0;
import defpackage.fob1;
import defpackage.g8e;
import defpackage.ham0;
import defpackage.i1m0;
import defpackage.iam0;
import defpackage.jl40;
import defpackage.nbv;
import defpackage.ny61;
import defpackage.rbv;
import defpackage.rtl;
import defpackage.tcc;
import defpackage.txg0;
import defpackage.w530;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final w530 a;
    public final ddm0 b;
    public final a c;

    public b(w530 w530Var, ddm0 ddm0Var, a aVar) {
        this.a = w530Var;
        this.b = ddm0Var;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x01b0 -> B:11:0x01b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x01c1 -> B:12:0x01c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(DashboardDataResponse dashboardDataResponse, ContinuationImpl continuationImpl) {
        SavingsDashboardDataMapper$map$1 savingsDashboardDataMapper$map$1;
        int i;
        rbv rbvVar;
        Text.Constant i2;
        MoneyEntity g;
        List list;
        DashboardDataResponse dashboardDataResponse2;
        String supportUrl;
        Iterator<T> it;
        SavingsDashboardPollStatus savingsDashboardPollStatus;
        List list2;
        Iterator it2;
        String str;
        MoneyEntity moneyEntity;
        Collection collection;
        List list3;
        SavingsDashboardPollStatus savingsDashboardPollStatus2;
        DashboardDataResponse dashboardDataResponse3;
        Text.Constant constant;
        Object obj;
        if (continuationImpl instanceof SavingsDashboardDataMapper$map$1) {
            savingsDashboardDataMapper$map$1 = (SavingsDashboardDataMapper$map$1) continuationImpl;
            int i3 = savingsDashboardDataMapper$map$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                savingsDashboardDataMapper$map$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = savingsDashboardDataMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardDataMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rbv c = fob1.c(dashboardDataResponse.getIcon().getLight(), dashboardDataResponse.getIcon().getDark(), new i1m0(20));
                    if (c == null) {
                        c = new nbv(txg0.ybsdk_ic_product_deposit, null);
                    }
                    rbvVar = c;
                    i2 = g8e.i(Text.Companion, dashboardDataResponse.getTitle());
                    g = bob1.g(dashboardDataResponse.getTotalBalance(), this.a);
                    List<SavingsInterestHintResponse> interestHints = dashboardDataResponse.getInterestHints();
                    ArrayList arrayList = new ArrayList(tcc.n(interestHints, 10));
                    Iterator<T> it3 = interestHints.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(this.b.a((SavingsInterestHintResponse) it3.next()));
                    }
                    List<SavingsCellResponse> accountCells = dashboardDataResponse.getSavingsAccountsInfo().getAccountCells();
                    savingsDashboardDataMapper$map$1.L$0 = dashboardDataResponse;
                    savingsDashboardDataMapper$map$1.L$1 = rbvVar;
                    savingsDashboardDataMapper$map$1.L$2 = i2;
                    savingsDashboardDataMapper$map$1.L$3 = g;
                    savingsDashboardDataMapper$map$1.L$4 = arrayList;
                    savingsDashboardDataMapper$map$1.label = 1;
                    obj2 = this.c.d(accountCells, savingsDashboardDataMapper$map$1);
                    if (obj2 != coroutineSingletons) {
                        list = arrayList;
                        dashboardDataResponse2 = dashboardDataResponse;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    list = (List) savingsDashboardDataMapper$map$1.L$4;
                    g = (MoneyEntity) savingsDashboardDataMapper$map$1.L$3;
                    i2 = (Text.Constant) savingsDashboardDataMapper$map$1.L$2;
                    rbvVar = (rbv) savingsDashboardDataMapper$map$1.L$1;
                    dashboardDataResponse2 = (DashboardDataResponse) savingsDashboardDataMapper$map$1.L$0;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it2 = (Iterator) savingsDashboardDataMapper$map$1.L$9;
                    collection = (Collection) savingsDashboardDataMapper$map$1.L$8;
                    SavingsDashboardPollStatus savingsDashboardPollStatus3 = (SavingsDashboardPollStatus) savingsDashboardDataMapper$map$1.L$7;
                    String str2 = (String) savingsDashboardDataMapper$map$1.L$6;
                    List list4 = (List) savingsDashboardDataMapper$map$1.L$5;
                    List list5 = (List) savingsDashboardDataMapper$map$1.L$4;
                    moneyEntity = (MoneyEntity) savingsDashboardDataMapper$map$1.L$3;
                    Text.Constant constant2 = (Text.Constant) savingsDashboardDataMapper$map$1.L$2;
                    rbv rbvVar2 = (rbv) savingsDashboardDataMapper$map$1.L$1;
                    DashboardDataResponse dashboardDataResponse4 = (DashboardDataResponse) savingsDashboardDataMapper$map$1.L$0;
                    kotlin.b.b(obj2);
                    rtl rtlVar = (rtl) obj2;
                    savingsDashboardPollStatus2 = savingsDashboardPollStatus3;
                    List list6 = list4;
                    rbvVar = rbvVar2;
                    list2 = list5;
                    constant = constant2;
                    str = str2;
                    if (rtlVar != null) {
                        collection.add(rtlVar);
                    }
                    dashboardDataResponse3 = dashboardDataResponse4;
                    list3 = list6;
                    if (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        Iterator<T> it4 = dashboardDataResponse3.getDivkitWidgets().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it4.next();
                            if (jl40.l(((DivkitWidgetDto) obj).getLayoutId(), str3)) {
                                break;
                            }
                        }
                        DivkitWidgetDto divkitWidgetDto = (DivkitWidgetDto) obj;
                        if (divkitWidgetDto != null) {
                            savingsDashboardDataMapper$map$1.L$0 = dashboardDataResponse3;
                            savingsDashboardDataMapper$map$1.L$1 = rbvVar;
                            savingsDashboardDataMapper$map$1.L$2 = constant;
                            savingsDashboardDataMapper$map$1.L$3 = moneyEntity;
                            savingsDashboardDataMapper$map$1.L$4 = list2;
                            savingsDashboardDataMapper$map$1.L$5 = list3;
                            savingsDashboardDataMapper$map$1.L$6 = str;
                            savingsDashboardDataMapper$map$1.L$7 = savingsDashboardPollStatus2;
                            savingsDashboardDataMapper$map$1.L$8 = collection;
                            savingsDashboardDataMapper$map$1.L$9 = it2;
                            savingsDashboardDataMapper$map$1.label = 2;
                            Object a = com.ybsdk.feature.savings.internal.entities.a.a(divkitWidgetDto, str3, savingsDashboardDataMapper$map$1);
                            if (a != coroutineSingletons) {
                                str2 = str;
                                constant2 = constant;
                                list5 = list2;
                                rbvVar2 = rbvVar;
                                list4 = list3;
                                dashboardDataResponse4 = dashboardDataResponse3;
                                obj2 = a;
                                savingsDashboardPollStatus3 = savingsDashboardPollStatus2;
                                rtl rtlVar2 = (rtl) obj2;
                                savingsDashboardPollStatus2 = savingsDashboardPollStatus3;
                                List list62 = list4;
                                rbvVar = rbvVar2;
                                list2 = list5;
                                constant = constant2;
                                str = str2;
                                if (rtlVar2 != null) {
                                }
                                dashboardDataResponse3 = dashboardDataResponse4;
                                list3 = list62;
                                if (it2.hasNext()) {
                                    return new iam0(rbvVar, constant, moneyEntity, str, list2, list3, savingsDashboardPollStatus2, (List) collection, null);
                                }
                            }
                            return coroutineSingletons;
                        }
                        list62 = list3;
                        dashboardDataResponse4 = dashboardDataResponse3;
                        rtlVar2 = null;
                        if (rtlVar2 != null) {
                        }
                        dashboardDataResponse3 = dashboardDataResponse4;
                        list3 = list62;
                        if (it2.hasNext()) {
                        }
                    }
                }
                List list7 = (List) obj2;
                supportUrl = dashboardDataResponse2.getSupportUrl();
                if (supportUrl == null) {
                    supportUrl = null;
                }
                it = dashboardDataResponse2.getSavingsAccountsInfo().getAccountCells().iterator();
                boolean z = false;
                while (true) {
                    if (it.hasNext()) {
                        savingsDashboardPollStatus = z ? SavingsDashboardPollStatus.CLOSING_ACCOUNT_POLLING : SavingsDashboardPollStatus.NO_POLLING;
                    } else {
                        SavingsCellResponse savingsCellResponse = (SavingsCellResponse) it.next();
                        if (savingsCellResponse.getOpeningAccountInfo() != null) {
                            savingsDashboardPollStatus = SavingsDashboardPollStatus.OPENING_ACCOUNT_POLLING;
                            break;
                        }
                        if (savingsCellResponse.getClosingAccountInfo() != null) {
                            z = true;
                        }
                    }
                }
                List<String> layout = dashboardDataResponse2.getLayout();
                ArrayList arrayList2 = new ArrayList();
                list2 = list;
                it2 = layout.iterator();
                str = supportUrl;
                moneyEntity = g;
                collection = arrayList2;
                list3 = list7;
                savingsDashboardPollStatus2 = savingsDashboardPollStatus;
                dashboardDataResponse3 = dashboardDataResponse2;
                constant = i2;
                if (it2.hasNext()) {
                }
            }
        }
        savingsDashboardDataMapper$map$1 = new SavingsDashboardDataMapper$map$1(this, continuationImpl);
        Object obj22 = savingsDashboardDataMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardDataMapper$map$1.label;
        if (i != 0) {
        }
        List list72 = (List) obj22;
        supportUrl = dashboardDataResponse2.getSupportUrl();
        if (supportUrl == null) {
        }
        it = dashboardDataResponse2.getSavingsAccountsInfo().getAccountCells().iterator();
        boolean z2 = false;
        while (true) {
            if (it.hasNext()) {
            }
        }
        List<String> layout2 = dashboardDataResponse2.getLayout();
        ArrayList arrayList22 = new ArrayList();
        list2 = list;
        it2 = layout2.iterator();
        str = supportUrl;
        moneyEntity = g;
        collection = arrayList22;
        list3 = list72;
        savingsDashboardPollStatus2 = savingsDashboardPollStatus;
        dashboardDataResponse3 = dashboardDataResponse2;
        constant = i2;
        if (it2.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x01fa -> B:11:0x0202). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x020b -> B:12:0x020e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(DashboardDataResponseV3 dashboardDataResponseV3, boolean z, ContinuationImpl continuationImpl) {
        SavingsDashboardDataMapper$mapV3$1 savingsDashboardDataMapper$mapV3$1;
        int i;
        rbv rbvVar;
        Text.Constant i2;
        MoneyEntity g;
        List list;
        DashboardDataResponseV3 dashboardDataResponseV32;
        String supportUrl;
        List<DivSavingsAccountResponse> items;
        Iterator<T> it;
        boolean z2;
        List<DivSavingsAccountResponse> items2;
        Iterator<T> it2;
        boolean z3;
        List list2;
        Iterator it3;
        String str;
        MoneyEntity moneyEntity;
        Collection collection;
        List list3;
        SavingsDashboardPollStatus savingsDashboardPollStatus;
        DashboardDataResponseV3 dashboardDataResponseV33;
        Text.Constant constant;
        String title;
        Object obj;
        if (continuationImpl instanceof SavingsDashboardDataMapper$mapV3$1) {
            savingsDashboardDataMapper$mapV3$1 = (SavingsDashboardDataMapper$mapV3$1) continuationImpl;
            int i3 = savingsDashboardDataMapper$mapV3$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                savingsDashboardDataMapper$mapV3$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = savingsDashboardDataMapper$mapV3$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardDataMapper$mapV3$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rbv c = fob1.c(dashboardDataResponseV3.getIcon().getLight(), dashboardDataResponseV3.getIcon().getDark(), new i1m0(21));
                    if (c == null) {
                        c = new nbv(txg0.ybsdk_ic_product_deposit, null);
                    }
                    rbvVar = c;
                    i2 = g8e.i(Text.Companion, dashboardDataResponseV3.getTitle());
                    g = bob1.g(dashboardDataResponseV3.getTotalBalance(), this.a);
                    List<SavingsInterestHintResponse> interestHints = dashboardDataResponseV3.getInterestHints();
                    ArrayList arrayList = new ArrayList(tcc.n(interestHints, 10));
                    Iterator<T> it4 = interestHints.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(this.b.a((SavingsInterestHintResponse) it4.next()));
                    }
                    SavingsAccountsInfoResponseV3 savingsAccountsInfo = dashboardDataResponseV3.getSavingsAccountsInfo();
                    savingsDashboardDataMapper$mapV3$1.L$0 = dashboardDataResponseV3;
                    savingsDashboardDataMapper$mapV3$1.L$1 = rbvVar;
                    savingsDashboardDataMapper$mapV3$1.L$2 = i2;
                    savingsDashboardDataMapper$mapV3$1.L$3 = g;
                    savingsDashboardDataMapper$mapV3$1.L$4 = arrayList;
                    savingsDashboardDataMapper$mapV3$1.label = 1;
                    a aVar = this.c;
                    aVar.getClass();
                    obj2 = aVar.e(savingsAccountsInfo.getItems(), savingsAccountsInfo.getCommonDivData(), z, savingsDashboardDataMapper$mapV3$1);
                    if (obj2 != coroutineSingletons) {
                        list = arrayList;
                        dashboardDataResponseV32 = dashboardDataResponseV3;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    list = (List) savingsDashboardDataMapper$mapV3$1.L$4;
                    g = (MoneyEntity) savingsDashboardDataMapper$mapV3$1.L$3;
                    i2 = (Text.Constant) savingsDashboardDataMapper$mapV3$1.L$2;
                    rbvVar = (rbv) savingsDashboardDataMapper$mapV3$1.L$1;
                    dashboardDataResponseV32 = (DashboardDataResponseV3) savingsDashboardDataMapper$mapV3$1.L$0;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it3 = (Iterator) savingsDashboardDataMapper$mapV3$1.L$9;
                    collection = (Collection) savingsDashboardDataMapper$mapV3$1.L$8;
                    SavingsDashboardPollStatus savingsDashboardPollStatus2 = (SavingsDashboardPollStatus) savingsDashboardDataMapper$mapV3$1.L$7;
                    String str2 = (String) savingsDashboardDataMapper$mapV3$1.L$6;
                    List list4 = (List) savingsDashboardDataMapper$mapV3$1.L$5;
                    List list5 = (List) savingsDashboardDataMapper$mapV3$1.L$4;
                    moneyEntity = (MoneyEntity) savingsDashboardDataMapper$mapV3$1.L$3;
                    Text.Constant constant2 = (Text.Constant) savingsDashboardDataMapper$mapV3$1.L$2;
                    rbv rbvVar2 = (rbv) savingsDashboardDataMapper$mapV3$1.L$1;
                    DashboardDataResponseV3 dashboardDataResponseV34 = (DashboardDataResponseV3) savingsDashboardDataMapper$mapV3$1.L$0;
                    kotlin.b.b(obj2);
                    rtl rtlVar = (rtl) obj2;
                    savingsDashboardPollStatus = savingsDashboardPollStatus2;
                    List list6 = list4;
                    rbvVar = rbvVar2;
                    list2 = list5;
                    constant = constant2;
                    str = str2;
                    if (rtlVar != null) {
                        collection.add(rtlVar);
                    }
                    dashboardDataResponseV33 = dashboardDataResponseV34;
                    list3 = list6;
                    if (it3.hasNext()) {
                        String str3 = (String) it3.next();
                        Iterator<T> it5 = dashboardDataResponseV33.getDivkitWidgets().iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it5.next();
                            if (jl40.l(((DivkitWidgetDto) obj).getLayoutId(), str3)) {
                                break;
                            }
                        }
                        DivkitWidgetDto divkitWidgetDto = (DivkitWidgetDto) obj;
                        if (divkitWidgetDto != null) {
                            savingsDashboardDataMapper$mapV3$1.L$0 = dashboardDataResponseV33;
                            savingsDashboardDataMapper$mapV3$1.L$1 = rbvVar;
                            savingsDashboardDataMapper$mapV3$1.L$2 = constant;
                            savingsDashboardDataMapper$mapV3$1.L$3 = moneyEntity;
                            savingsDashboardDataMapper$mapV3$1.L$4 = list2;
                            savingsDashboardDataMapper$mapV3$1.L$5 = list3;
                            savingsDashboardDataMapper$mapV3$1.L$6 = str;
                            savingsDashboardDataMapper$mapV3$1.L$7 = savingsDashboardPollStatus;
                            savingsDashboardDataMapper$mapV3$1.L$8 = collection;
                            savingsDashboardDataMapper$mapV3$1.L$9 = it3;
                            savingsDashboardDataMapper$mapV3$1.label = 2;
                            Object a = com.ybsdk.feature.savings.internal.entities.a.a(divkitWidgetDto, str3, savingsDashboardDataMapper$mapV3$1);
                            if (a != coroutineSingletons) {
                                str2 = str;
                                constant2 = constant;
                                list5 = list2;
                                rbvVar2 = rbvVar;
                                list4 = list3;
                                dashboardDataResponseV34 = dashboardDataResponseV33;
                                obj2 = a;
                                savingsDashboardPollStatus2 = savingsDashboardPollStatus;
                                rtl rtlVar2 = (rtl) obj2;
                                savingsDashboardPollStatus = savingsDashboardPollStatus2;
                                List list62 = list4;
                                rbvVar = rbvVar2;
                                list2 = list5;
                                constant = constant2;
                                str = str2;
                                if (rtlVar2 != null) {
                                }
                                dashboardDataResponseV33 = dashboardDataResponseV34;
                                list3 = list62;
                                if (it3.hasNext()) {
                                    List list7 = (List) collection;
                                    NoAccountsInfoResponseV3 noAccountsInfo = dashboardDataResponseV33.getSavingsAccountsInfo().getNoAccountsInfo();
                                    return new iam0(rbvVar, constant, moneyEntity, str, list2, list3, savingsDashboardPollStatus, list7, (noAccountsInfo == null || (title = noAccountsInfo.getTitle()) == null) ? null : new ham0(g8e.i(Text.Companion, title), d.g(dashboardDataResponseV33.getSavingsAccountsInfo().getNoAccountsInfo().getSubtitle())));
                                }
                            }
                            return coroutineSingletons;
                        }
                        list62 = list3;
                        dashboardDataResponseV34 = dashboardDataResponseV33;
                        rtlVar2 = null;
                        if (rtlVar2 != null) {
                        }
                        dashboardDataResponseV33 = dashboardDataResponseV34;
                        list3 = list62;
                        if (it3.hasNext()) {
                        }
                    }
                }
                List list8 = (List) obj2;
                supportUrl = dashboardDataResponseV32.getSupportUrl();
                if (supportUrl == null) {
                    supportUrl = null;
                }
                items = dashboardDataResponseV32.getSavingsAccountsInfo().getItems();
                if ((items instanceof Collection) || !items.isEmpty()) {
                    it = items.iterator();
                    while (it.hasNext()) {
                        if (((DivSavingsAccountResponse) it.next()).getType() == DivSavingsAccountResponse.Type.OPENING) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                items2 = dashboardDataResponseV32.getSavingsAccountsInfo().getItems();
                if ((items2 instanceof Collection) || !items2.isEmpty()) {
                    it2 = items2.iterator();
                    while (it2.hasNext()) {
                        if (((DivSavingsAccountResponse) it2.next()).getType() == DivSavingsAccountResponse.Type.CLOSING) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
                SavingsDashboardPollStatus savingsDashboardPollStatus3 = !z2 ? SavingsDashboardPollStatus.OPENING_ACCOUNT_POLLING : z3 ? SavingsDashboardPollStatus.CLOSING_ACCOUNT_POLLING : SavingsDashboardPollStatus.NO_POLLING;
                List<String> layout = dashboardDataResponseV32.getLayout();
                ArrayList arrayList2 = new ArrayList();
                list2 = list;
                it3 = layout.iterator();
                str = supportUrl;
                moneyEntity = g;
                collection = arrayList2;
                list3 = list8;
                savingsDashboardPollStatus = savingsDashboardPollStatus3;
                dashboardDataResponseV33 = dashboardDataResponseV32;
                constant = i2;
                if (it3.hasNext()) {
                }
            }
        }
        savingsDashboardDataMapper$mapV3$1 = new SavingsDashboardDataMapper$mapV3$1(this, continuationImpl);
        Object obj22 = savingsDashboardDataMapper$mapV3$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardDataMapper$mapV3$1.label;
        if (i != 0) {
        }
        List list82 = (List) obj22;
        supportUrl = dashboardDataResponseV32.getSupportUrl();
        if (supportUrl == null) {
        }
        items = dashboardDataResponseV32.getSavingsAccountsInfo().getItems();
        if (items instanceof Collection) {
        }
        it = items.iterator();
        while (it.hasNext()) {
        }
        z2 = false;
        items2 = dashboardDataResponseV32.getSavingsAccountsInfo().getItems();
        if (items2 instanceof Collection) {
        }
        it2 = items2.iterator();
        while (it2.hasNext()) {
        }
        z3 = false;
        if (!z2) {
        }
        List<String> layout2 = dashboardDataResponseV32.getLayout();
        ArrayList arrayList22 = new ArrayList();
        list2 = list;
        it3 = layout2.iterator();
        str = supportUrl;
        moneyEntity = g;
        collection = arrayList22;
        list3 = list82;
        savingsDashboardPollStatus = savingsDashboardPollStatus3;
        dashboardDataResponseV33 = dashboardDataResponseV32;
        constant = i2;
        if (it3.hasNext()) {
        }
    }
}
