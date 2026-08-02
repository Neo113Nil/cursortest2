package com.ybsdk.feature.savings.internal.mapper;

import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import com.ybsdk.feature.savings.internal.entities.SavingsDashboardPollStatus;
import com.ybsdk.feature.savings.internal.network.dto.DivSavingsAccountResponse;
import com.ybsdk.feature.savings.internal.network.dto.DivkitWidgetDto;
import com.ybsdk.feature.savings.internal.network.dto.v4.SavingsAccountsHeaderInfoDtoV4;
import com.ybsdk.feature.savings.internal.network.dto.v4.SavingsDashboardV4Response;
import com.ybsdk.feature.savings.internal.network.dto.v4.SavingsShelfDtoV4;
import defpackage.bob1;
import defpackage.fob1;
import defpackage.jam0;
import defpackage.jl40;
import defpackage.kam0;
import defpackage.kpn;
import defpackage.lam0;
import defpackage.lvy0;
import defpackage.ny61;
import defpackage.oxy0;
import defpackage.rbv;
import defpackage.rr51;
import defpackage.rtl;
import defpackage.tcc;
import defpackage.ung0;
import defpackage.w530;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class c {
    public final a a;
    public final w530 b;

    public c(a aVar, w530 w530Var) {
        this.a = aVar;
        this.b = w530Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00a3, code lost:
    
        if (r1 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d3, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0103, code lost:
    
        if (r1 == r3) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.ybsdk.feature.savings.internal.mapper.c] */
    /* JADX WARN: Type inference failed for: r1v30, types: [com.ybsdk.core.utils.ColorModel] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Collection, java.util.HashSet] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x01c5 -> B:13:0x01ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x014f -> B:62:0x0150). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0103 -> B:74:0x0107). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x010a -> B:75:0x010b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SavingsDashboardV4Response savingsDashboardV4Response, ContinuationImpl continuationImpl) {
        SavingsDashboardDataMapperV4$map$1 savingsDashboardDataMapperV4$map$1;
        int i;
        SavingsDashboardV4Response savingsDashboardV4Response2;
        SavingsDashboardV4Response savingsDashboardV4Response3;
        Iterator it;
        Collection collection;
        jam0 jam0Var;
        List list;
        Collection arrayList;
        Iterator it2;
        SavingsDashboardV4Response savingsDashboardV4Response4;
        jam0 jam0Var2;
        List list2;
        Object obj;
        List list3;
        Collection arrayList2;
        jam0 jam0Var3;
        List list4;
        Iterator it3;
        Object obj2;
        if (continuationImpl instanceof SavingsDashboardDataMapperV4$map$1) {
            savingsDashboardDataMapperV4$map$1 = (SavingsDashboardDataMapperV4$map$1) continuationImpl;
            int i2 = savingsDashboardDataMapperV4$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsDashboardDataMapperV4$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = savingsDashboardDataMapperV4$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardDataMapperV4$map$1.label;
                ?? r5 = EmptyList.a;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    SavingsAccountsHeaderInfoDtoV4 headerInfo = savingsDashboardV4Response.getHeaderInfo();
                    savingsDashboardV4Response2 = savingsDashboardV4Response;
                    savingsDashboardDataMapperV4$map$1.L$0 = savingsDashboardV4Response2;
                    savingsDashboardDataMapperV4$map$1.label = 1;
                    obj3 = b(headerInfo, savingsDashboardDataMapperV4$map$1);
                } else if (i == 1) {
                    savingsDashboardV4Response2 = (SavingsDashboardV4Response) savingsDashboardDataMapperV4$map$1.L$0;
                    kotlin.b.b(obj3);
                } else if (i == 2) {
                    it = (Iterator) savingsDashboardDataMapperV4$map$1.L$3;
                    collection = (Collection) savingsDashboardDataMapperV4$map$1.L$2;
                    jam0Var = (jam0) savingsDashboardDataMapperV4$map$1.L$1;
                    savingsDashboardV4Response3 = (SavingsDashboardV4Response) savingsDashboardDataMapperV4$map$1.L$0;
                    kotlin.b.b(obj3);
                    rtl rtlVar = (rtl) obj3;
                    if (rtlVar != null) {
                        collection.add(rtlVar);
                    }
                    if (!it.hasNext()) {
                        String str = (String) it.next();
                        Iterator it4 = savingsDashboardV4Response3.getDivWidgets().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it4.next();
                            if (jl40.l(((DivkitWidgetDto) obj).getLayoutId(), str)) {
                                break;
                            }
                        }
                        DivkitWidgetDto divkitWidgetDto = (DivkitWidgetDto) obj;
                        if (divkitWidgetDto != null) {
                            savingsDashboardDataMapperV4$map$1.L$0 = savingsDashboardV4Response3;
                            savingsDashboardDataMapperV4$map$1.L$1 = jam0Var;
                            savingsDashboardDataMapperV4$map$1.L$2 = collection;
                            savingsDashboardDataMapperV4$map$1.L$3 = it;
                            savingsDashboardDataMapperV4$map$1.label = 2;
                            obj3 = com.ybsdk.feature.savings.internal.entities.a.a(divkitWidgetDto, str, savingsDashboardDataMapperV4$map$1);
                        } else {
                            rtlVar = null;
                            if (rtlVar != null) {
                            }
                            if (!it.hasNext()) {
                                list = (List) collection;
                                List<EducationsV2Dto> educations = savingsDashboardV4Response3.getEducations();
                                if (educations != null) {
                                    List<EducationsV2Dto> list5 = educations;
                                    arrayList = new ArrayList(tcc.n(list5, 10));
                                    it2 = list5.iterator();
                                    savingsDashboardV4Response4 = savingsDashboardV4Response3;
                                    jam0Var2 = jam0Var;
                                    list2 = list;
                                    if (it2.hasNext()) {
                                    }
                                }
                                list3 = r5;
                                savingsDashboardV4Response4 = savingsDashboardV4Response3;
                                jam0Var2 = jam0Var;
                                list2 = list;
                                List<String> layout = savingsDashboardV4Response4.getLayout();
                                arrayList2 = new ArrayList();
                                jam0Var3 = jam0Var2;
                                list4 = list3;
                                it3 = layout.iterator();
                                if (it3.hasNext()) {
                                }
                            }
                        }
                    }
                } else if (i == 3) {
                    arrayList = (Collection) savingsDashboardDataMapperV4$map$1.L$5;
                    it2 = (Iterator) savingsDashboardDataMapperV4$map$1.L$4;
                    Collection collection2 = (Collection) savingsDashboardDataMapperV4$map$1.L$3;
                    list2 = (List) savingsDashboardDataMapperV4$map$1.L$2;
                    jam0Var2 = (jam0) savingsDashboardDataMapperV4$map$1.L$1;
                    savingsDashboardV4Response4 = (SavingsDashboardV4Response) savingsDashboardDataMapperV4$map$1.L$0;
                    kotlin.b.b(obj3);
                    arrayList.add((kpn) obj3);
                    arrayList = collection2;
                    if (it2.hasNext()) {
                        EducationsV2Dto educationsV2Dto = (EducationsV2Dto) it2.next();
                        savingsDashboardDataMapperV4$map$1.L$0 = savingsDashboardV4Response4;
                        savingsDashboardDataMapperV4$map$1.L$1 = jam0Var2;
                        savingsDashboardDataMapperV4$map$1.L$2 = list2;
                        savingsDashboardDataMapperV4$map$1.L$3 = arrayList;
                        savingsDashboardDataMapperV4$map$1.L$4 = it2;
                        savingsDashboardDataMapperV4$map$1.L$5 = arrayList;
                        savingsDashboardDataMapperV4$map$1.label = 3;
                        obj3 = com.ybsdk.feature.educations.api.a.d(educationsV2Dto, savingsDashboardDataMapperV4$map$1);
                        if (obj3 != coroutineSingletons) {
                            collection2 = arrayList;
                            arrayList.add((kpn) obj3);
                            arrayList = collection2;
                            if (it2.hasNext()) {
                                list3 = (List) arrayList;
                                if (list3 == null) {
                                    list = list2;
                                    jam0Var = jam0Var2;
                                    savingsDashboardV4Response3 = savingsDashboardV4Response4;
                                    list3 = r5;
                                    savingsDashboardV4Response4 = savingsDashboardV4Response3;
                                    jam0Var2 = jam0Var;
                                    list2 = list;
                                }
                                List<String> layout2 = savingsDashboardV4Response4.getLayout();
                                arrayList2 = new ArrayList();
                                jam0Var3 = jam0Var2;
                                list4 = list3;
                                it3 = layout2.iterator();
                                if (it3.hasNext()) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it3 = (Iterator) savingsDashboardDataMapperV4$map$1.L$5;
                    arrayList2 = (Collection) savingsDashboardDataMapperV4$map$1.L$4;
                    List list6 = (List) savingsDashboardDataMapperV4$map$1.L$3;
                    List list7 = (List) savingsDashboardDataMapperV4$map$1.L$2;
                    jam0 jam0Var4 = (jam0) savingsDashboardDataMapperV4$map$1.L$1;
                    SavingsDashboardV4Response savingsDashboardV4Response5 = (SavingsDashboardV4Response) savingsDashboardDataMapperV4$map$1.L$0;
                    kotlin.b.b(obj3);
                    kam0 kam0Var = (kam0) obj3;
                    jam0 jam0Var5 = jam0Var4;
                    list2 = list7;
                    jam0Var3 = jam0Var5;
                    savingsDashboardV4Response4 = savingsDashboardV4Response5;
                    list4 = list6;
                    if (kam0Var != null) {
                        arrayList2.add(kam0Var);
                    }
                    if (it3.hasNext()) {
                        String str2 = (String) it3.next();
                        List<SavingsShelfDtoV4> shelves = savingsDashboardV4Response4.getShelves();
                        if (shelves != null) {
                            Iterator it5 = shelves.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it5.next();
                                if (jl40.l(((SavingsShelfDtoV4) obj2).getId(), str2)) {
                                    break;
                                }
                            }
                            SavingsShelfDtoV4 savingsShelfDtoV4 = (SavingsShelfDtoV4) obj2;
                            if (savingsShelfDtoV4 != null) {
                                DivDataDto commonDivData = savingsDashboardV4Response4.getCommonDivData();
                                savingsDashboardDataMapperV4$map$1.L$0 = savingsDashboardV4Response4;
                                savingsDashboardDataMapperV4$map$1.L$1 = jam0Var3;
                                savingsDashboardDataMapperV4$map$1.L$2 = list2;
                                savingsDashboardDataMapperV4$map$1.L$3 = list4;
                                savingsDashboardDataMapperV4$map$1.L$4 = arrayList2;
                                savingsDashboardDataMapperV4$map$1.L$5 = it3;
                                savingsDashboardDataMapperV4$map$1.label = 4;
                                obj3 = c(savingsShelfDtoV4, commonDivData, savingsDashboardDataMapperV4$map$1);
                                if (obj3 != coroutineSingletons) {
                                    List list8 = list2;
                                    jam0Var4 = jam0Var3;
                                    list7 = list8;
                                    list6 = list4;
                                    savingsDashboardV4Response5 = savingsDashboardV4Response4;
                                    kam0 kam0Var2 = (kam0) obj3;
                                    jam0 jam0Var52 = jam0Var4;
                                    list2 = list7;
                                    jam0Var3 = jam0Var52;
                                    savingsDashboardV4Response4 = savingsDashboardV4Response5;
                                    list4 = list6;
                                    if (kam0Var2 != null) {
                                    }
                                    if (it3.hasNext()) {
                                        List list9 = (List) arrayList2;
                                        List<SavingsShelfDtoV4> shelves2 = savingsDashboardV4Response4.getShelves();
                                        if (shelves2 != null) {
                                            r5 = new HashSet();
                                            Iterator it6 = shelves2.iterator();
                                            while (it6.hasNext()) {
                                                List<DivSavingsAccountResponse> items = ((SavingsShelfDtoV4) it6.next()).getItems();
                                                ArrayList arrayList3 = new ArrayList(tcc.n(items, 10));
                                                Iterator it7 = items.iterator();
                                                while (it7.hasNext()) {
                                                    arrayList3.add(((DivSavingsAccountResponse) it7.next()).getType());
                                                }
                                                ycc.r(arrayList3, r5);
                                            }
                                        }
                                        SavingsDashboardPollStatus savingsDashboardPollStatus = r5.contains(DivSavingsAccountResponse.Type.OPENING) ? SavingsDashboardPollStatus.OPENING_ACCOUNT_POLLING : r5.contains(DivSavingsAccountResponse.Type.CLOSING) ? SavingsDashboardPollStatus.CLOSING_ACCOUNT_POLLING : SavingsDashboardPollStatus.NO_POLLING;
                                        ThemedParameter<String> backgroundColor = savingsDashboardV4Response4.getBackgroundColor();
                                        ColorModel.Attr attr = new ColorModel.Attr(ung0.ybColor_internal_transparent);
                                        ?? b = lvy0.b(backgroundColor.getLight(), backgroundColor.getDark(), new oxy0(backgroundColor, 1));
                                        return new lam0(jam0Var3, list2, list4, savingsDashboardPollStatus, list9, b == 0 ? attr : b);
                                    }
                                }
                                return coroutineSingletons;
                            }
                        }
                        kam0Var2 = null;
                        if (kam0Var2 != null) {
                        }
                        if (it3.hasNext()) {
                        }
                    }
                }
                List<String> layout3 = savingsDashboardV4Response2.getLayout();
                ArrayList arrayList4 = new ArrayList();
                savingsDashboardV4Response3 = savingsDashboardV4Response2;
                it = layout3.iterator();
                collection = arrayList4;
                jam0Var = (jam0) obj3;
                if (!it.hasNext()) {
                }
            }
        }
        savingsDashboardDataMapperV4$map$1 = new SavingsDashboardDataMapperV4$map$1(this, continuationImpl);
        Object obj32 = savingsDashboardDataMapperV4$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardDataMapperV4$map$1.label;
        ?? r52 = EmptyList.a;
        if (i != 0) {
        }
        List<String> layout32 = savingsDashboardV4Response2.getLayout();
        ArrayList arrayList42 = new ArrayList();
        savingsDashboardV4Response3 = savingsDashboardV4Response2;
        it = layout32.iterator();
        collection = arrayList42;
        jam0Var = (jam0) obj32;
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.ybsdk.core.utils.text.Text] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(SavingsAccountsHeaderInfoDtoV4 savingsAccountsHeaderInfoDtoV4, ContinuationImpl continuationImpl) {
        SavingsDashboardDataMapperV4$toEntity$1 savingsDashboardDataMapperV4$toEntity$1;
        int i;
        rbv b;
        Object a;
        MoneyEntity moneyEntity;
        Text.Constant constant;
        ColorModel colorModel;
        String str;
        if (continuationImpl instanceof SavingsDashboardDataMapperV4$toEntity$1) {
            savingsDashboardDataMapperV4$toEntity$1 = (SavingsDashboardDataMapperV4$toEntity$1) continuationImpl;
            int i2 = savingsDashboardDataMapperV4$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsDashboardDataMapperV4$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsDashboardDataMapperV4$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardDataMapperV4$toEntity$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Text.Constant constant2 = new Text.Constant(savingsAccountsHeaderInfoDtoV4.getTitle());
                    b = fob1.b(savingsAccountsHeaderInfoDtoV4.getTitleIcon());
                    MoneyEntity g = bob1.g(savingsAccountsHeaderInfoDtoV4.getTotalBalance(), this.b);
                    ThemedParameter<String> backgroundGradient = savingsAccountsHeaderInfoDtoV4.getBackgroundGradient();
                    ColorModel.Attr attr = new ColorModel.Attr(ung0.ybColor_internal_transparent);
                    ColorModel b2 = lvy0.b(backgroundGradient.getLight(), backgroundGradient.getDark(), new oxy0(backgroundGradient, i3));
                    if (b2 == null) {
                        b2 = attr;
                    }
                    String supportUrl = savingsAccountsHeaderInfoDtoV4.getSupportUrl();
                    DivDataDto bottomDivData = savingsAccountsHeaderInfoDtoV4.getBottomDivData();
                    savingsDashboardDataMapperV4$toEntity$1.L$0 = constant2;
                    savingsDashboardDataMapperV4$toEntity$1.L$1 = b;
                    savingsDashboardDataMapperV4$toEntity$1.L$2 = g;
                    savingsDashboardDataMapperV4$toEntity$1.L$3 = b2;
                    savingsDashboardDataMapperV4$toEntity$1.L$4 = supportUrl;
                    savingsDashboardDataMapperV4$toEntity$1.label = 1;
                    a = com.ybsdk.feature.divkit.internal.a.a(bottomDivData, new com.ybsdk.feature.divkit.api.domain.a(null), savingsDashboardDataMapperV4$toEntity$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    moneyEntity = g;
                    constant = constant2;
                    colorModel = b2;
                    str = supportUrl;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str2 = (String) savingsDashboardDataMapperV4$toEntity$1.L$4;
                    ColorModel colorModel2 = (ColorModel) savingsDashboardDataMapperV4$toEntity$1.L$3;
                    MoneyEntity moneyEntity2 = (MoneyEntity) savingsDashboardDataMapperV4$toEntity$1.L$2;
                    b = (rbv) savingsDashboardDataMapperV4$toEntity$1.L$1;
                    ?? r0 = (Text) savingsDashboardDataMapperV4$toEntity$1.L$0;
                    kotlin.b.b(obj);
                    str = str2;
                    colorModel = colorModel2;
                    constant = r0;
                    moneyEntity = moneyEntity2;
                }
                return new jam0(constant, b, moneyEntity, colorModel, str, (rr51) obj);
            }
        }
        savingsDashboardDataMapperV4$toEntity$1 = new SavingsDashboardDataMapperV4$toEntity$1(this, continuationImpl);
        Object obj2 = savingsDashboardDataMapperV4$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardDataMapperV4$toEntity$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        return new jam0(constant, b, moneyEntity, colorModel, str, (rr51) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00de, code lost:
    
        if (r1 == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(SavingsShelfDtoV4 savingsShelfDtoV4, DivDataDto divDataDto, ContinuationImpl continuationImpl) {
        SavingsDashboardDataMapperV4$toEntity$2 savingsDashboardDataMapperV4$toEntity$2;
        int i;
        String id;
        rbv b;
        Text.Constant constant;
        Text.Constant constant2;
        SavingsShelfDtoV4 savingsShelfDtoV42;
        DivDataDto divDataDto2;
        Text.Constant constant3;
        rr51 rr51Var;
        DivDataDto divWidget;
        rr51 rr51Var2;
        Text.Constant constant4;
        rbv rbvVar;
        String str;
        Object a;
        Text.Constant constant5;
        rbv rbvVar2;
        DivDataDto divDataDto3;
        Object e;
        Text.Constant constant6;
        rr51 rr51Var3;
        Text.Constant constant7;
        rr51 rr51Var4;
        String str2;
        SavingsShelfDtoV4 savingsShelfDtoV43;
        if (continuationImpl instanceof SavingsDashboardDataMapperV4$toEntity$2) {
            savingsDashboardDataMapperV4$toEntity$2 = (SavingsDashboardDataMapperV4$toEntity$2) continuationImpl;
            int i2 = savingsDashboardDataMapperV4$toEntity$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsDashboardDataMapperV4$toEntity$2.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsDashboardDataMapperV4$toEntity$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsDashboardDataMapperV4$toEntity$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    id = savingsShelfDtoV4.getId();
                    b = fob1.b(savingsShelfDtoV4.getIcon());
                    constant = new Text.Constant(savingsShelfDtoV4.getTitle());
                    constant2 = new Text.Constant(savingsShelfDtoV4.getSubtitle());
                    DivDataDto subtitleDivWidget = savingsShelfDtoV4.getSubtitleDivWidget();
                    savingsShelfDtoV42 = savingsShelfDtoV4;
                    if (subtitleDivWidget == null) {
                        divDataDto2 = divDataDto;
                        constant3 = constant2;
                        rr51Var = null;
                        divWidget = savingsShelfDtoV42.getDivWidget();
                        if (divWidget == null) {
                            Text.Constant constant8 = constant;
                            rr51Var2 = null;
                            constant4 = constant8;
                            rbvVar = b;
                            str = id;
                            List<DivSavingsAccountResponse> items = savingsShelfDtoV42.getItems();
                            savingsDashboardDataMapperV4$toEntity$2.L$0 = savingsShelfDtoV42;
                            savingsDashboardDataMapperV4$toEntity$2.L$1 = str;
                            savingsDashboardDataMapperV4$toEntity$2.L$2 = rbvVar;
                            savingsDashboardDataMapperV4$toEntity$2.L$3 = constant4;
                            savingsDashboardDataMapperV4$toEntity$2.L$4 = constant3;
                            savingsDashboardDataMapperV4$toEntity$2.L$5 = rr51Var;
                            savingsDashboardDataMapperV4$toEntity$2.L$6 = rr51Var2;
                            savingsDashboardDataMapperV4$toEntity$2.label = 3;
                            e = this.a.e(items, divDataDto2, true, savingsDashboardDataMapperV4$toEntity$2);
                            if (e != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        savingsDashboardDataMapperV4$toEntity$2.L$0 = savingsShelfDtoV42;
                        savingsDashboardDataMapperV4$toEntity$2.L$1 = divDataDto2;
                        savingsDashboardDataMapperV4$toEntity$2.L$2 = id;
                        savingsDashboardDataMapperV4$toEntity$2.L$3 = b;
                        savingsDashboardDataMapperV4$toEntity$2.L$4 = constant;
                        savingsDashboardDataMapperV4$toEntity$2.L$5 = constant3;
                        savingsDashboardDataMapperV4$toEntity$2.L$6 = rr51Var;
                        savingsDashboardDataMapperV4$toEntity$2.label = 2;
                        a = com.ybsdk.feature.divkit.internal.a.a(divWidget, new com.ybsdk.feature.divkit.api.domain.a(null), savingsDashboardDataMapperV4$toEntity$2);
                        if (a != coroutineSingletons) {
                            constant5 = constant3;
                            obj = a;
                            constant4 = constant;
                            rbvVar2 = b;
                            str = id;
                            divDataDto3 = divDataDto2;
                            rbv rbvVar3 = rbvVar2;
                            rr51Var2 = (rr51) obj;
                            constant3 = constant5;
                            rbvVar = rbvVar3;
                            divDataDto2 = divDataDto3;
                            List<DivSavingsAccountResponse> items2 = savingsShelfDtoV42.getItems();
                            savingsDashboardDataMapperV4$toEntity$2.L$0 = savingsShelfDtoV42;
                            savingsDashboardDataMapperV4$toEntity$2.L$1 = str;
                            savingsDashboardDataMapperV4$toEntity$2.L$2 = rbvVar;
                            savingsDashboardDataMapperV4$toEntity$2.L$3 = constant4;
                            savingsDashboardDataMapperV4$toEntity$2.L$4 = constant3;
                            savingsDashboardDataMapperV4$toEntity$2.L$5 = rr51Var;
                            savingsDashboardDataMapperV4$toEntity$2.L$6 = rr51Var2;
                            savingsDashboardDataMapperV4$toEntity$2.label = 3;
                            e = this.a.e(items2, divDataDto2, true, savingsDashboardDataMapperV4$toEntity$2);
                            if (e != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    savingsDashboardDataMapperV4$toEntity$2.L$0 = savingsShelfDtoV42;
                    divDataDto2 = divDataDto;
                    savingsDashboardDataMapperV4$toEntity$2.L$1 = divDataDto2;
                    savingsDashboardDataMapperV4$toEntity$2.L$2 = id;
                    savingsDashboardDataMapperV4$toEntity$2.L$3 = b;
                    savingsDashboardDataMapperV4$toEntity$2.L$4 = constant;
                    savingsDashboardDataMapperV4$toEntity$2.L$5 = constant2;
                    savingsDashboardDataMapperV4$toEntity$2.label = 1;
                    obj = com.ybsdk.feature.divkit.internal.a.a(subtitleDivWidget, new com.ybsdk.feature.divkit.api.domain.a(null), savingsDashboardDataMapperV4$toEntity$2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rr51 rr51Var5 = (rr51) savingsDashboardDataMapperV4$toEntity$2.L$6;
                            rr51 rr51Var6 = (rr51) savingsDashboardDataMapperV4$toEntity$2.L$5;
                            Text.Constant constant9 = (Text.Constant) savingsDashboardDataMapperV4$toEntity$2.L$4;
                            Text.Constant constant10 = (Text.Constant) savingsDashboardDataMapperV4$toEntity$2.L$3;
                            rbvVar = (rbv) savingsDashboardDataMapperV4$toEntity$2.L$2;
                            String str3 = (String) savingsDashboardDataMapperV4$toEntity$2.L$1;
                            savingsShelfDtoV43 = (SavingsShelfDtoV4) savingsDashboardDataMapperV4$toEntity$2.L$0;
                            kotlin.b.b(obj);
                            rr51Var4 = rr51Var5;
                            rr51Var3 = rr51Var6;
                            constant6 = constant9;
                            constant7 = constant10;
                            str2 = str3;
                            return new kam0(rbvVar, rr51Var3, rr51Var4, constant7, constant6, str2, (List) obj, savingsShelfDtoV43.getDragAndDropEnabled(), false);
                        }
                        rr51Var = (rr51) savingsDashboardDataMapperV4$toEntity$2.L$6;
                        constant5 = (Text.Constant) savingsDashboardDataMapperV4$toEntity$2.L$5;
                        constant4 = (Text.Constant) savingsDashboardDataMapperV4$toEntity$2.L$4;
                        rbvVar2 = (rbv) savingsDashboardDataMapperV4$toEntity$2.L$3;
                        str = (String) savingsDashboardDataMapperV4$toEntity$2.L$2;
                        divDataDto3 = (DivDataDto) savingsDashboardDataMapperV4$toEntity$2.L$1;
                        savingsShelfDtoV42 = (SavingsShelfDtoV4) savingsDashboardDataMapperV4$toEntity$2.L$0;
                        kotlin.b.b(obj);
                        rbv rbvVar32 = rbvVar2;
                        rr51Var2 = (rr51) obj;
                        constant3 = constant5;
                        rbvVar = rbvVar32;
                        divDataDto2 = divDataDto3;
                        List<DivSavingsAccountResponse> items22 = savingsShelfDtoV42.getItems();
                        savingsDashboardDataMapperV4$toEntity$2.L$0 = savingsShelfDtoV42;
                        savingsDashboardDataMapperV4$toEntity$2.L$1 = str;
                        savingsDashboardDataMapperV4$toEntity$2.L$2 = rbvVar;
                        savingsDashboardDataMapperV4$toEntity$2.L$3 = constant4;
                        savingsDashboardDataMapperV4$toEntity$2.L$4 = constant3;
                        savingsDashboardDataMapperV4$toEntity$2.L$5 = rr51Var;
                        savingsDashboardDataMapperV4$toEntity$2.L$6 = rr51Var2;
                        savingsDashboardDataMapperV4$toEntity$2.label = 3;
                        e = this.a.e(items22, divDataDto2, true, savingsDashboardDataMapperV4$toEntity$2);
                        if (e != coroutineSingletons) {
                            constant6 = constant3;
                            rr51Var3 = rr51Var;
                            constant7 = constant4;
                            rr51Var4 = rr51Var2;
                            str2 = str;
                            savingsShelfDtoV43 = savingsShelfDtoV42;
                            obj = e;
                            return new kam0(rbvVar, rr51Var3, rr51Var4, constant7, constant6, str2, (List) obj, savingsShelfDtoV43.getDragAndDropEnabled(), false);
                        }
                        return coroutineSingletons;
                    }
                    constant2 = (Text.Constant) savingsDashboardDataMapperV4$toEntity$2.L$5;
                    constant = (Text.Constant) savingsDashboardDataMapperV4$toEntity$2.L$4;
                    b = (rbv) savingsDashboardDataMapperV4$toEntity$2.L$3;
                    id = (String) savingsDashboardDataMapperV4$toEntity$2.L$2;
                    DivDataDto divDataDto4 = (DivDataDto) savingsDashboardDataMapperV4$toEntity$2.L$1;
                    SavingsShelfDtoV4 savingsShelfDtoV44 = (SavingsShelfDtoV4) savingsDashboardDataMapperV4$toEntity$2.L$0;
                    kotlin.b.b(obj);
                    divDataDto2 = divDataDto4;
                    savingsShelfDtoV42 = savingsShelfDtoV44;
                }
                Text.Constant constant11 = constant2;
                rr51Var = (rr51) obj;
                constant3 = constant11;
                divWidget = savingsShelfDtoV42.getDivWidget();
                if (divWidget == null) {
                }
            }
        }
        savingsDashboardDataMapperV4$toEntity$2 = new SavingsDashboardDataMapperV4$toEntity$2(this, continuationImpl);
        Object obj2 = savingsDashboardDataMapperV4$toEntity$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsDashboardDataMapperV4$toEntity$2.label;
        if (i != 0) {
        }
        Text.Constant constant112 = constant2;
        rr51Var = (rr51) obj2;
        constant3 = constant112;
        divWidget = savingsShelfDtoV42.getDivWidget();
        if (divWidget == null) {
        }
    }
}
