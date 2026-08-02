package com.ybsdk.feature.transfer.version2.internal.screens.budget.data;

import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.transfer.version2.internal.data.dto.FormFieldValidationDto;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.BudgetFoundChargeItemDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.BudgetFoundInvoicesSectionDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.BudgetHeaderButtonDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.BudgetHeaderDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.BudgetSearchSectionDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.BudgetUinSearchFieldDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.GetBudgetChargesResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.StatusInfoDto;
import defpackage.iyd0;
import defpackage.ns;
import defpackage.ny61;
import defpackage.op6;
import defpackage.pp6;
import defpackage.q4s;
import defpackage.q8u0;
import defpackage.qxy0;
import defpackage.rp6;
import defpackage.rr51;
import defpackage.so6;
import defpackage.sp6;
import defpackage.tcc;
import defpackage.tp6;
import defpackage.vp6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class a {
    public final Transfer2Api a;

    public a(Transfer2Api transfer2Api) {
        this.a = transfer2Api;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, GetBudgetChargesResponse getBudgetChargesResponse, Continuation continuation) {
        BudgetChargesRepository$toEntity$1 budgetChargesRepository$toEntity$1;
        int i;
        sp6 f;
        tp6 tp6Var;
        pp6 pp6Var;
        sp6 sp6Var;
        tp6 tp6Var2;
        aVar.getClass();
        if (continuation instanceof BudgetChargesRepository$toEntity$1) {
            budgetChargesRepository$toEntity$1 = (BudgetChargesRepository$toEntity$1) continuation;
            int i2 = budgetChargesRepository$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                budgetChargesRepository$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = budgetChargesRepository$toEntity$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = budgetChargesRepository$toEntity$1.label;
                if (i != 0) {
                    b.b(obj);
                    f = f(getBudgetChargesResponse.getHeader());
                    BudgetSearchSectionDto searchSection = getBudgetChargesResponse.getSearchSection();
                    String tabTitle = searchSection.getTabTitle();
                    BudgetUinSearchFieldDto searchField = searchSection.getSearchField();
                    sp6 f2 = f(searchField.getHeader());
                    String hint = searchField.getHint();
                    String placeholder = searchField.getPlaceholder();
                    FormFieldValidationDto validation = searchField.getValidation();
                    tp6Var = new tp6(tabTitle, new vp6(f2, hint, placeholder, new q4s(new Regex(validation.getRegex()), validation.getErrorHint()), ns.a(searchField.getButton())));
                    BudgetFoundInvoicesSectionDto foundInvoicesSection = getBudgetChargesResponse.getFoundInvoicesSection();
                    if (foundInvoicesSection == null) {
                        pp6Var = null;
                        return new so6(f, tp6Var, pp6Var);
                    }
                    budgetChargesRepository$toEntity$1.L$0 = tp6Var;
                    budgetChargesRepository$toEntity$1.L$1 = f;
                    budgetChargesRepository$toEntity$1.label = 1;
                    Object h = aVar.h(foundInvoicesSection, budgetChargesRepository$toEntity$1);
                    if (h == obj2) {
                        return obj2;
                    }
                    obj = h;
                    sp6Var = f;
                    tp6Var2 = tp6Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sp6Var = (sp6) budgetChargesRepository$toEntity$1.L$1;
                    tp6Var2 = (tp6) budgetChargesRepository$toEntity$1.L$0;
                    b.b(obj);
                }
                pp6Var = (pp6) obj;
                f = sp6Var;
                tp6Var = tp6Var2;
                return new so6(f, tp6Var, pp6Var);
            }
        }
        budgetChargesRepository$toEntity$1 = new BudgetChargesRepository$toEntity$1(aVar, continuation);
        Object obj3 = budgetChargesRepository$toEntity$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = budgetChargesRepository$toEntity$1.label;
        if (i != 0) {
        }
        pp6Var = (pp6) obj3;
        f = sp6Var;
        tp6Var = tp6Var2;
        return new so6(f, tp6Var, pp6Var);
    }

    public static sp6 f(BudgetHeaderDto budgetHeaderDto) {
        String title = budgetHeaderDto.getTitle();
        BudgetHeaderButtonDto button = budgetHeaderDto.getButton();
        return new sp6(title, new rp6(button.getAction(), button.getA11yDescription(), qxy0.c(button.getImage(), null)));
    }

    public static q8u0 g(StatusInfoDto statusInfoDto) {
        ThemedImageUrlEntity c = qxy0.c(statusInfoDto.getImage(), null);
        String title = statusInfoDto.getTitle();
        String subtitle = statusInfoDto.getSubtitle();
        ActionButtonDto button = statusInfoDto.getButton();
        return new q8u0(c, title, subtitle, button != null ? ns.a(button) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        BudgetChargesRepository$getCharges$1 budgetChargesRepository$getCharges$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof BudgetChargesRepository$getCharges$1) {
            budgetChargesRepository$getCharges$1 = (BudgetChargesRepository$getCharges$1) continuationImpl;
            int i2 = budgetChargesRepository$getCharges$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                budgetChargesRepository$getCharges$1.label = i2 - Integer.MIN_VALUE;
                Object obj = budgetChargesRepository$getCharges$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = budgetChargesRepository$getCharges$1.label;
                if (i != 0) {
                    b.b(obj);
                    BudgetChargesRepository$getCharges$2 budgetChargesRepository$getCharges$2 = new BudgetChargesRepository$getCharges$2(this, null);
                    budgetChargesRepository$getCharges$1.label = 1;
                    c = c.c(budgetChargesRepository$getCharges$2, budgetChargesRepository$getCharges$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                BudgetChargesRepository$getCharges$3$1 budgetChargesRepository$getCharges$3$1 = new BudgetChargesRepository$getCharges$3$1(2, this, a.class, "toEntity", "toEntity(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/GetBudgetChargesResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                budgetChargesRepository$getCharges$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, budgetChargesRepository$getCharges$3$1, budgetChargesRepository$getCharges$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        budgetChargesRepository$getCharges$1 = new BudgetChargesRepository$getCharges$1(this, continuationImpl);
        Object obj2 = budgetChargesRepository$getCharges$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = budgetChargesRepository$getCharges$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        BudgetChargesRepository$getRequisites$1 budgetChargesRepository$getRequisites$1;
        int i;
        if (continuationImpl instanceof BudgetChargesRepository$getRequisites$1) {
            budgetChargesRepository$getRequisites$1 = (BudgetChargesRepository$getRequisites$1) continuationImpl;
            int i2 = budgetChargesRepository$getRequisites$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                budgetChargesRepository$getRequisites$1.label = i2 - Integer.MIN_VALUE;
                Object obj = budgetChargesRepository$getRequisites$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = budgetChargesRepository$getRequisites$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                BudgetChargesRepository$getRequisites$2 budgetChargesRepository$getRequisites$2 = new BudgetChargesRepository$getRequisites$2(this, str, null);
                budgetChargesRepository$getRequisites$1.label = 1;
                Object c = c.c(budgetChargesRepository$getRequisites$2, budgetChargesRepository$getRequisites$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        budgetChargesRepository$getRequisites$1 = new BudgetChargesRepository$getRequisites$1(this, continuationImpl);
        Object obj2 = budgetChargesRepository$getRequisites$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = budgetChargesRepository$getRequisites$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        if (r0 == r8) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, String str, ContinuationImpl continuationImpl) {
        BudgetChargesRepository$getStatusSearch$1 budgetChargesRepository$getStatusSearch$1;
        int i2;
        Object c;
        Throwable a;
        Object a2;
        iyd0 iyd0Var;
        if (continuationImpl instanceof BudgetChargesRepository$getStatusSearch$1) {
            budgetChargesRepository$getStatusSearch$1 = (BudgetChargesRepository$getStatusSearch$1) continuationImpl;
            int i3 = budgetChargesRepository$getStatusSearch$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                budgetChargesRepository$getStatusSearch$1.label = i3 - Integer.MIN_VALUE;
                BudgetChargesRepository$getStatusSearch$1 budgetChargesRepository$getStatusSearch$12 = budgetChargesRepository$getStatusSearch$1;
                Object obj = budgetChargesRepository$getStatusSearch$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = budgetChargesRepository$getStatusSearch$12.label;
                if (i2 != 0) {
                    b.b(obj);
                    BudgetChargesRepository$getStatusSearch$2 budgetChargesRepository$getStatusSearch$2 = new BudgetChargesRepository$getStatusSearch$2(this, str, i, null);
                    budgetChargesRepository$getStatusSearch$12.label = 1;
                    c = c.c(budgetChargesRepository$getStatusSearch$2, budgetChargesRepository$getStatusSearch$12);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) budgetChargesRepository$getStatusSearch$12.L$0;
                        b.b(obj);
                        a2 = ((Result) obj).getValue();
                        return a2 instanceof Result.Failure ? new iyd0(iyd0Var.b, a2) : a2;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0 iyd0Var2 = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var2.a;
                BudgetChargesRepository$getStatusSearch$3$1$1 budgetChargesRepository$getStatusSearch$3$1$1 = new BudgetChargesRepository$getStatusSearch$3$1$1(2, this, a.class, "toEntity", "toEntity(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/GetStatusChargeSearchResponse;)Lcom/ybsdk/feature/transfer/version2/internal/screens/budget/domain/entities/BudgetGetStatusEntity;", 4);
                budgetChargesRepository$getStatusSearch$12.L$0 = iyd0Var2;
                budgetChargesRepository$getStatusSearch$12.label = 2;
                a2 = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, budgetChargesRepository$getStatusSearch$3$1$1, budgetChargesRepository$getStatusSearch$12);
                if (a2 != coroutineSingletons) {
                    iyd0Var = iyd0Var2;
                    if (a2 instanceof Result.Failure) {
                    }
                }
                return coroutineSingletons;
            }
        }
        budgetChargesRepository$getStatusSearch$1 = new BudgetChargesRepository$getStatusSearch$1(this, continuationImpl);
        BudgetChargesRepository$getStatusSearch$1 budgetChargesRepository$getStatusSearch$122 = budgetChargesRepository$getStatusSearch$1;
        Object obj2 = budgetChargesRepository$getStatusSearch$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = budgetChargesRepository$getStatusSearch$122.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r0 == r7) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        BudgetChargesRepository$startSearch$1 budgetChargesRepository$startSearch$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof BudgetChargesRepository$startSearch$1) {
            budgetChargesRepository$startSearch$1 = (BudgetChargesRepository$startSearch$1) continuationImpl;
            int i2 = budgetChargesRepository$startSearch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                budgetChargesRepository$startSearch$1.label = i2 - Integer.MIN_VALUE;
                BudgetChargesRepository$startSearch$1 budgetChargesRepository$startSearch$12 = budgetChargesRepository$startSearch$1;
                Object obj = budgetChargesRepository$startSearch$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = budgetChargesRepository$startSearch$12.label;
                if (i != 0) {
                    b.b(obj);
                    BudgetChargesRepository$startSearch$2 budgetChargesRepository$startSearch$2 = new BudgetChargesRepository$startSearch$2(this, str3, str, str2, null);
                    budgetChargesRepository$startSearch$12.label = 1;
                    c = c.c(budgetChargesRepository$startSearch$2, budgetChargesRepository$startSearch$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                BudgetChargesRepository$startSearch$3$1 budgetChargesRepository$startSearch$3$1 = new BudgetChargesRepository$startSearch$3$1(this, null);
                budgetChargesRepository$startSearch$12.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, budgetChargesRepository$startSearch$3$1, budgetChargesRepository$startSearch$12);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        budgetChargesRepository$startSearch$1 = new BudgetChargesRepository$startSearch$1(this, continuationImpl);
        BudgetChargesRepository$startSearch$1 budgetChargesRepository$startSearch$122 = budgetChargesRepository$startSearch$1;
        Object obj2 = budgetChargesRepository$startSearch$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = budgetChargesRepository$startSearch$122.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084 A[LOOP:0: B:15:0x007e->B:17:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(BudgetFoundInvoicesSectionDto budgetFoundInvoicesSectionDto, ContinuationImpl continuationImpl) {
        BudgetChargesRepository$toEntity$3 budgetChargesRepository$toEntity$3;
        int i;
        BudgetFoundInvoicesSectionDto budgetFoundInvoicesSectionDto2;
        String str;
        rr51 rr51Var;
        Object obj;
        if (continuationImpl instanceof BudgetChargesRepository$toEntity$3) {
            budgetChargesRepository$toEntity$3 = (BudgetChargesRepository$toEntity$3) continuationImpl;
            int i2 = budgetChargesRepository$toEntity$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                budgetChargesRepository$toEntity$3.label = i2 - Integer.MIN_VALUE;
                Object obj2 = budgetChargesRepository$toEntity$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = budgetChargesRepository$toEntity$3.label;
                if (i != 0) {
                    b.b(obj2);
                    String tabTitle = budgetFoundInvoicesSectionDto.getTabTitle();
                    DivDataDto emptyDivState = budgetFoundInvoicesSectionDto.getEmptyDivState();
                    if (emptyDivState == null) {
                        budgetFoundInvoicesSectionDto2 = budgetFoundInvoicesSectionDto;
                        str = tabTitle;
                        rr51Var = null;
                        List<BudgetFoundChargeItemDto> items = budgetFoundInvoicesSectionDto2.getItems();
                        ArrayList arrayList = new ArrayList(tcc.n(items, 10));
                        for (BudgetFoundChargeItemDto budgetFoundChargeItemDto : items) {
                            arrayList.add(new op6(budgetFoundChargeItemDto.getId(), budgetFoundChargeItemDto.getTitle(), budgetFoundChargeItemDto.getSubtitle(), budgetFoundChargeItemDto.getValue(), budgetFoundChargeItemDto.getSubvalue(), budgetFoundChargeItemDto.getAction(), qxy0.c(budgetFoundChargeItemDto.getImage(), null)));
                        }
                        return new pp6(str, rr51Var, arrayList);
                    }
                    com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    budgetChargesRepository$toEntity$3.L$0 = budgetFoundInvoicesSectionDto;
                    budgetChargesRepository$toEntity$3.L$1 = tabTitle;
                    budgetChargesRepository$toEntity$3.label = 1;
                    Object b = aVar.b(emptyDivState, budgetChargesRepository$toEntity$3);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    budgetFoundInvoicesSectionDto2 = budgetFoundInvoicesSectionDto;
                    str = tabTitle;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) budgetChargesRepository$toEntity$3.L$1;
                    budgetFoundInvoicesSectionDto2 = (BudgetFoundInvoicesSectionDto) budgetChargesRepository$toEntity$3.L$0;
                    b.b(obj2);
                    obj = ((Result) obj2).getValue();
                }
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                rr51Var = (rr51) obj;
                List<BudgetFoundChargeItemDto> items2 = budgetFoundInvoicesSectionDto2.getItems();
                ArrayList arrayList2 = new ArrayList(tcc.n(items2, 10));
                while (r14.hasNext()) {
                }
                return new pp6(str, rr51Var, arrayList2);
            }
        }
        budgetChargesRepository$toEntity$3 = new BudgetChargesRepository$toEntity$3(this, continuationImpl);
        Object obj22 = budgetChargesRepository$toEntity$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = budgetChargesRepository$toEntity$3.label;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
        rr51Var = (rr51) obj;
        List<BudgetFoundChargeItemDto> items22 = budgetFoundInvoicesSectionDto2.getItems();
        ArrayList arrayList22 = new ArrayList(tcc.n(items22, 10));
        while (r14.hasNext()) {
        }
        return new pp6(str, rr51Var, arrayList22);
    }
}
