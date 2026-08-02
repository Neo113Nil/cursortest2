package com.ybsdk.feature.pfm.internal.data.mappers;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$FeedFilterBottomSheetContent$SelectableList;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$FeedFilterBottomSheetContent$ToggleList;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$FilterContent$Icon;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$FilterContent$IconAndTitle;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$FilterContent$Title;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$FilterInnerContent$DateFilter;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$FilterInnerContent$FeedFilter;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$NodeContent$EmptyContent;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$NodeContent$ViewNodeContent;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$PfmNodeText$MultipleText;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$PfmNodeText$SingleText;
import com.ybsdk.feature.pfm.internal.domain.entities.FilterEntity$Mode;
import com.ybsdk.feature.pfm.internal.domain.entities.FilterInnerContentEntity$Date$SelectionMode;
import defpackage.acb0;
import defpackage.bcb0;
import defpackage.c9b0;
import defpackage.ccb0;
import defpackage.ctu0;
import defpackage.d9b0;
import defpackage.e9b0;
import defpackage.egq0;
import defpackage.f9b0;
import defpackage.fcb0;
import defpackage.g9b0;
import defpackage.gcb0;
import defpackage.hcb0;
import defpackage.hdb0;
import defpackage.icb0;
import defpackage.j4r;
import defpackage.jcb0;
import defpackage.jpl;
import defpackage.l4r;
import defpackage.lcb0;
import defpackage.lvy0;
import defpackage.m4r;
import defpackage.mls;
import defpackage.n4r;
import defpackage.ncb0;
import defpackage.ny61;
import defpackage.o4r;
import defpackage.p4r;
import defpackage.ppl;
import defpackage.q4r;
import defpackage.qxy0;
import defpackage.r4r;
import defpackage.r9b0;
import defpackage.rcb0;
import defpackage.rr51;
import defpackage.s4r;
import defpackage.scb0;
import defpackage.tcb0;
import defpackage.tcc;
import defpackage.ung0;
import defpackage.w511;
import defpackage.xpb1;
import defpackage.xvq;
import defpackage.ycb0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class b {
    public static final g9b0 a(PfmResponse.Node node, String str) {
        ccb0 acb0Var;
        ColorModel a;
        icb0 content = node.getContent();
        if (!(content instanceof PfmResponse$NodeContent$ViewNodeContent)) {
            if (content instanceof PfmResponse$NodeContent$EmptyContent) {
                return null;
            }
            w511.b();
            return null;
        }
        PfmResponse$NodeContent$ViewNodeContent pfmResponse$NodeContent$ViewNodeContent = (PfmResponse$NodeContent$ViewNodeContent) content;
        String categoryId = pfmResponse$NodeContent$ViewNodeContent.getCategoryId();
        List<PfmResponse.Node> children = node.getChildren();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = children.iterator();
        while (it.hasNext()) {
            g9b0 a2 = a((PfmResponse.Node) it.next(), categoryId);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        Set N0 = kotlin.collections.a.N0(arrayList);
        String logId = node.getLogId();
        ThemedImageUrlEntity c = qxy0.c(pfmResponse$NodeContent$ViewNodeContent.getData().getImage(), null);
        PfmResponse$NodeContent$ViewNodeContent.NodeBackground background = pfmResponse$NodeContent$ViewNodeContent.getData().getBackground();
        c9b0 c9b0Var = new c9b0(lvy0.c(background.getBackgroundColor()), qxy0.c(background.getBackgroundImage(), null));
        jcb0 text = pfmResponse$NodeContent$ViewNodeContent.getData().getText();
        if (text instanceof PfmResponse$PfmNodeText$SingleText) {
            acb0Var = new bcb0(ncb0.b(((PfmResponse$PfmNodeText$SingleText) text).getText()));
        } else {
            if (!(text instanceof PfmResponse$PfmNodeText$MultipleText)) {
                w511.b();
                return null;
            }
            PfmResponse$PfmNodeText$MultipleText pfmResponse$PfmNodeText$MultipleText = (PfmResponse$PfmNodeText$MultipleText) text;
            acb0Var = new acb0(ncb0.b(pfmResponse$PfmNodeText$MultipleText.getTitle()), ncb0.b(pfmResponse$PfmNodeText$MultipleText.getSubtitle()));
        }
        d9b0 d9b0Var = new d9b0(c, c9b0Var, acb0Var);
        PfmResponse$NodeContent$ViewNodeContent.ExpandedCategoryHeader expandedCategoryHeader = pfmResponse$NodeContent$ViewNodeContent.getExpandedCategoryHeader();
        e9b0 e9b0Var = expandedCategoryHeader != null ? new e9b0(ncb0.a(expandedCategoryHeader.getNote()), ncb0.b(expandedCategoryHeader.getTitle())) : null;
        PfmResponse$NodeContent$ViewNodeContent.SelectedState selectedState = pfmResponse$NodeContent$ViewNodeContent.getSelectedState();
        a = lvy0.a(selectedState.getBorderColor(), new ColorModel.Attr(ung0.ybColor_fill_default_900), new xvq(29));
        PfmResponse$NodeContent$ViewNodeContent.NodeBackground background2 = selectedState.getBackground();
        return new g9b0(logId, categoryId, str, N0, d9b0Var, e9b0Var, new f9b0(a, background2 != null ? new c9b0(lvy0.c(background2.getBackgroundColor()), qxy0.c(background2.getBackgroundImage(), null)) : null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(PfmResponse.TransactionListItem transactionListItem, com.ybsdk.feature.divkit.api.domain.a aVar, ContinuationImpl continuationImpl) {
        PfmResponseMapperKt$toDivViewItem$1 pfmResponseMapperKt$toDivViewItem$1;
        int i;
        Object b;
        rr51 rr51Var;
        if (continuationImpl instanceof PfmResponseMapperKt$toDivViewItem$1) {
            pfmResponseMapperKt$toDivViewItem$1 = (PfmResponseMapperKt$toDivViewItem$1) continuationImpl;
            int i2 = pfmResponseMapperKt$toDivViewItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pfmResponseMapperKt$toDivViewItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pfmResponseMapperKt$toDivViewItem$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pfmResponseMapperKt$toDivViewItem$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DivDataDto divJson = transactionListItem.getDivJson();
                    pfmResponseMapperKt$toDivViewItem$1.L$0 = transactionListItem;
                    pfmResponseMapperKt$toDivViewItem$1.label = 1;
                    b = aVar.b(divJson, pfmResponseMapperKt$toDivViewItem$1);
                    if (b == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    transactionListItem = (PfmResponse.TransactionListItem) pfmResponseMapperKt$toDivViewItem$1.L$0;
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                rr51Var = (rr51) b;
                if (rr51Var == null) {
                    return new jpl(new ctu0(rr51Var.e), rr51Var, new hdb0(transactionListItem.getSectionKey()), null, 20);
                }
                return null;
            }
        }
        pfmResponseMapperKt$toDivViewItem$1 = new PfmResponseMapperKt$toDivViewItem$1(continuationImpl);
        Object obj3 = pfmResponseMapperKt$toDivViewItem$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pfmResponseMapperKt$toDivViewItem$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        rr51Var = (rr51) b;
        if (rr51Var == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x02d2 -> B:58:0x02d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(PfmResponse pfmResponse, ContinuationImpl continuationImpl) {
        PfmResponseMapperKt$toEntity$1 pfmResponseMapperKt$toEntity$1;
        int i;
        com.ybsdk.feature.divkit.api.domain.a aVar;
        Set set;
        Iterator it;
        Collection collection;
        com.ybsdk.feature.divkit.api.domain.a aVar2;
        Set set2;
        PfmResponse pfmResponse2;
        List<PfmResponse.Filter> content;
        Object a;
        Object obj;
        Object c;
        Object obj2;
        hcb0 innerContent;
        String str;
        com.ybsdk.feature.divkit.api.domain.a aVar3;
        q4r n4rVar;
        s4r r4rVar;
        int i2;
        String str2;
        FilterEntity$Mode filterEntity$Mode;
        FilterEntity$Mode filterEntity$Mode2;
        String str3;
        Calendar endExclusive;
        Set<j4r> set3;
        ppl pplVar;
        mls mlsVar;
        PfmResponse pfmResponse3;
        Set set4;
        ppl pplVar2;
        Object scb0Var;
        Calendar calendar;
        Calendar calendar2;
        if (continuationImpl instanceof PfmResponseMapperKt$toEntity$1) {
            pfmResponseMapperKt$toEntity$1 = (PfmResponseMapperKt$toEntity$1) continuationImpl;
            int i3 = pfmResponseMapperKt$toEntity$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pfmResponseMapperKt$toEntity$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = pfmResponseMapperKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pfmResponseMapperKt$toEntity$1.label;
                String str4 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pplVar2 = (ppl) pfmResponseMapperKt$toEntity$1.L$2;
                        set4 = (Set) pfmResponseMapperKt$toEntity$1.L$1;
                        pfmResponse3 = (PfmResponse) pfmResponseMapperKt$toEntity$1.L$0;
                        kotlin.b.b(obj3);
                        mlsVar = (mls) obj3;
                        pfmResponse2 = pfmResponse3;
                        pplVar = pplVar2;
                        set3 = set4;
                        ArrayList arrayList = new ArrayList();
                        for (j4r j4rVar : set3) {
                            s4r s4rVar = j4rVar.e;
                            String str5 = j4rVar.a;
                            if (s4rVar instanceof r4r) {
                                q4r q4rVar = ((r4r) s4rVar).c;
                                if (!(q4rVar instanceof p4r)) {
                                    if (!(q4rVar instanceof n4r)) {
                                        w511.b();
                                        return null;
                                    }
                                    String str6 = ((n4r) q4rVar).a;
                                    if (str6 != null) {
                                        scb0Var = new tcb0(str5, str6);
                                    }
                                }
                                scb0Var = null;
                            } else {
                                if (!(s4rVar instanceof l4r)) {
                                    w511.b();
                                    return null;
                                }
                                l4r l4rVar = (l4r) s4rVar;
                                scb0Var = (!l4rVar.h || (calendar = l4rVar.f) == null || (calendar2 = l4rVar.g) == null) ? null : new scb0(str5, calendar, calendar2, l4rVar.c, l4rVar.e);
                            }
                            if (scb0Var != null) {
                                arrayList.add(scb0Var);
                            }
                        }
                        Set N0 = kotlin.collections.a.N0(arrayList);
                        Map<String, PfmResponse.Analytics> analytics = pfmResponse2.getAnalytics();
                        ArrayList arrayList2 = new ArrayList(analytics.size());
                        for (Map.Entry<String, PfmResponse.Analytics> entry : analytics.entrySet()) {
                            rcb0 rcb0Var = new rcb0(entry.getKey());
                            List<PfmResponse.Node> children = entry.getValue().getRoot().getChildren();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<T> it2 = children.iterator();
                            while (it2.hasNext()) {
                                g9b0 a2 = a((PfmResponse.Node) it2.next(), null);
                                if (a2 != null) {
                                    arrayList3.add(a2);
                                }
                            }
                            arrayList2.add(new Pair(rcb0Var, kotlin.collections.a.N0(arrayList3)));
                        }
                        return new r9b0(mlsVar, pplVar, set3, N0, kotlin.collections.b.s(arrayList2));
                    }
                    it = (Iterator) pfmResponseMapperKt$toEntity$1.L$4;
                    collection = (Collection) pfmResponseMapperKt$toEntity$1.L$3;
                    Set set5 = (Set) pfmResponseMapperKt$toEntity$1.L$2;
                    aVar2 = (com.ybsdk.feature.divkit.api.domain.a) pfmResponseMapperKt$toEntity$1.L$1;
                    PfmResponse pfmResponse4 = (PfmResponse) pfmResponseMapperKt$toEntity$1.L$0;
                    kotlin.b.b(obj3);
                    set2 = set5;
                    jpl jplVar = (jpl) obj3;
                    if (jplVar != null) {
                        collection.add(jplVar);
                    }
                    pfmResponse2 = pfmResponse4;
                    if (it.hasNext()) {
                        PfmResponse.TransactionListItem transactionListItem = (PfmResponse.TransactionListItem) it.next();
                        pfmResponseMapperKt$toEntity$1.L$0 = pfmResponse2;
                        pfmResponseMapperKt$toEntity$1.L$1 = aVar2;
                        pfmResponseMapperKt$toEntity$1.L$2 = set2;
                        pfmResponseMapperKt$toEntity$1.L$3 = collection;
                        pfmResponseMapperKt$toEntity$1.L$4 = it;
                        pfmResponseMapperKt$toEntity$1.label = 1;
                        Object b = b(transactionListItem, aVar2, pfmResponseMapperKt$toEntity$1);
                        if (b != coroutineSingletons) {
                            pfmResponse4 = pfmResponse2;
                            obj3 = b;
                            jpl jplVar2 = (jpl) obj3;
                            if (jplVar2 != null) {
                            }
                            pfmResponse2 = pfmResponse4;
                            if (it.hasNext()) {
                                ppl pplVar3 = new ppl((List) collection, pfmResponse2.getCursor());
                                PfmResponse.FunFactData funFact = pfmResponse2.getFunFact();
                                if (funFact == null) {
                                    set3 = set2;
                                    pplVar = pplVar3;
                                    mlsVar = null;
                                    ArrayList arrayList4 = new ArrayList();
                                    while (r1.hasNext()) {
                                    }
                                    Set N02 = kotlin.collections.a.N0(arrayList4);
                                    Map<String, PfmResponse.Analytics> analytics2 = pfmResponse2.getAnalytics();
                                    ArrayList arrayList22 = new ArrayList(analytics2.size());
                                    while (r0.hasNext()) {
                                    }
                                    return new r9b0(mlsVar, pplVar, set3, N02, kotlin.collections.b.s(arrayList22));
                                }
                                pfmResponseMapperKt$toEntity$1.L$0 = pfmResponse2;
                                pfmResponseMapperKt$toEntity$1.L$1 = set2;
                                pfmResponseMapperKt$toEntity$1.L$2 = pplVar3;
                                pfmResponseMapperKt$toEntity$1.L$3 = null;
                                pfmResponseMapperKt$toEntity$1.L$4 = null;
                                pfmResponseMapperKt$toEntity$1.label = 2;
                                Object a3 = a.a(funFact, pfmResponseMapperKt$toEntity$1);
                                if (a3 != coroutineSingletons) {
                                    pfmResponse3 = pfmResponse2;
                                    obj3 = a3;
                                    set4 = set2;
                                    pplVar2 = pplVar3;
                                    mlsVar = (mls) obj3;
                                    pfmResponse2 = pfmResponse3;
                                    pplVar = pplVar2;
                                    set3 = set4;
                                    ArrayList arrayList42 = new ArrayList();
                                    while (r1.hasNext()) {
                                    }
                                    Set N022 = kotlin.collections.a.N0(arrayList42);
                                    Map<String, PfmResponse.Analytics> analytics22 = pfmResponse2.getAnalytics();
                                    ArrayList arrayList222 = new ArrayList(analytics22.size());
                                    while (r0.hasNext()) {
                                    }
                                    return new r9b0(mlsVar, pplVar, set3, N022, kotlin.collections.b.s(arrayList222));
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                kotlin.b.b(obj3);
                com.ybsdk.feature.divkit.api.domain.a aVar4 = new com.ybsdk.feature.divkit.api.domain.a(pfmResponse.getTransactions().getCommonData());
                PfmResponse.FeedFilters filters = pfmResponse.getFilters();
                if (filters == null || (content = filters.getContent()) == null) {
                    aVar = aVar4;
                    set = EmptySet.a;
                } else {
                    List<PfmResponse.Filter> list = content;
                    int i4 = 10;
                    ArrayList arrayList5 = new ArrayList(tcc.n(list, 10));
                    for (PfmResponse.Filter filter : list) {
                        String logId = filter.getLogId();
                        gcb0 filterContent = filter.getFilterContent();
                        if (filterContent instanceof PfmResponse$FilterContent$Icon) {
                            obj = str4;
                        } else {
                            if (filterContent instanceof PfmResponse$FilterContent$Title) {
                                a = ncb0.a(((PfmResponse$FilterContent$Title) filterContent).getTitle());
                            } else {
                                if (!(filterContent instanceof PfmResponse$FilterContent$IconAndTitle)) {
                                    String str7 = str4;
                                    w511.b();
                                    return str7;
                                }
                                a = ncb0.a(((PfmResponse$FilterContent$IconAndTitle) filterContent).getTitle());
                            }
                            obj = a;
                        }
                        gcb0 filterContent2 = filter.getFilterContent();
                        if (filterContent2 instanceof PfmResponse$FilterContent$Icon) {
                            c = qxy0.c(((PfmResponse$FilterContent$Icon) filterContent2).getIcon(), str4);
                        } else if (filterContent2 instanceof PfmResponse$FilterContent$Title) {
                            obj2 = str4;
                            innerContent = filter.getInnerContent();
                            if (innerContent instanceof PfmResponse$FilterInnerContent$DateFilter) {
                                str = logId;
                                if (!(innerContent instanceof PfmResponse$FilterInnerContent$FeedFilter)) {
                                    String str8 = str4;
                                    w511.b();
                                    return str8;
                                }
                                PfmResponse$FilterInnerContent$FeedFilter pfmResponse$FilterInnerContent$FeedFilter = (PfmResponse$FilterInnerContent$FeedFilter) innerContent;
                                ycb0 a4 = ncb0.a(pfmResponse$FilterInnerContent$FeedFilter.getInnerContent().getTitle());
                                fcb0 content2 = pfmResponse$FilterInnerContent$FeedFilter.getInnerContent().getContent();
                                if (content2 instanceof PfmResponse$FeedFilterBottomSheetContent$ToggleList) {
                                    List<PfmResponse.ToggleListItem> settings = ((PfmResponse$FeedFilterBottomSheetContent$ToggleList) content2).getSettings();
                                    ArrayList arrayList6 = new ArrayList(tcc.n(settings, i4));
                                    for (PfmResponse.ToggleListItem toggleListItem : settings) {
                                        arrayList6.add(new o4r(ncb0.a(toggleListItem.getTitle()), toggleListItem.getFilterId(), false));
                                    }
                                    n4rVar = new p4r(kotlin.collections.a.N0(arrayList6));
                                    aVar3 = aVar4;
                                } else {
                                    if (!(content2 instanceof PfmResponse$FeedFilterBottomSheetContent$SelectableList)) {
                                        w511.b();
                                        return null;
                                    }
                                    PfmResponse$FeedFilterBottomSheetContent$SelectableList pfmResponse$FeedFilterBottomSheetContent$SelectableList = (PfmResponse$FeedFilterBottomSheetContent$SelectableList) content2;
                                    String selectedOption = pfmResponse$FeedFilterBottomSheetContent$SelectableList.getSelectedOption();
                                    if (selectedOption == null) {
                                        selectedOption = null;
                                    }
                                    List<PfmResponse.SelectableListItem> options = pfmResponse$FeedFilterBottomSheetContent$SelectableList.getOptions();
                                    ArrayList arrayList7 = new ArrayList(tcc.n(options, i4));
                                    for (PfmResponse.SelectableListItem selectableListItem : options) {
                                        ycb0 a5 = ncb0.a(selectableListItem.getTitle());
                                        com.ybsdk.feature.divkit.api.domain.a aVar5 = aVar4;
                                        ThemedImageUrlEntity c2 = qxy0.c(selectableListItem.getIcon(), null);
                                        PfmResponse.PfmText subtitle = selectableListItem.getSubtitle();
                                        arrayList7.add(new m4r(a5, c2, subtitle != null ? ncb0.b(subtitle) : null, selectableListItem.getFilterId()));
                                        aVar4 = aVar5;
                                    }
                                    aVar3 = aVar4;
                                    n4rVar = new n4r(selectedOption, arrayList7);
                                }
                                r4rVar = new r4r(a4, str, n4rVar);
                            } else {
                                PfmResponse$FilterInnerContent$DateFilter pfmResponse$FilterInnerContent$DateFilter = (PfmResponse$FilterInnerContent$DateFilter) innerContent;
                                Calendar availableDate = pfmResponse$FilterInnerContent$DateFilter.getAvailableDate();
                                PfmResponse.DateFilterPreselectedDates preselectedDates = pfmResponse$FilterInnerContent$DateFilter.getPreselectedDates();
                                Object startInclusive = preselectedDates != null ? preselectedDates.getStartInclusive() : str4;
                                PfmResponse.DateFilterPreselectedDates preselectedDates2 = pfmResponse$FilterInnerContent$DateFilter.getPreselectedDates();
                                if (preselectedDates2 == null || (endExclusive = preselectedDates2.getEndExclusive()) == null) {
                                    str3 = str4;
                                } else {
                                    Calendar calendar3 = (Calendar) endExclusive.clone();
                                    calendar3.add(5, -1);
                                    str3 = calendar3;
                                }
                                Pair pair = new Pair(startInclusive, str3);
                                egq0 C = xpb1.C((Calendar) pair.getFirst(), (Calendar) pair.getSecond(), availableDate);
                                str = logId;
                                aVar3 = aVar4;
                                r4rVar = new l4r(ncb0.a(pfmResponse$FilterInnerContent$DateFilter.getTitle()), str, availableDate, FilterInnerContentEntity$Date$SelectionMode.START_DATE, pfmResponse$FilterInnerContent$DateFilter.getFallbackSectionKey(), C.a, C.b, pfmResponse$FilterInnerContent$DateFilter.getPreselectedDates() != null);
                            }
                            i2 = lcb0.a[filter.getFilterMode().ordinal()];
                            if (i2 != 1) {
                                str2 = null;
                                filterEntity$Mode = FilterEntity$Mode.IDLE;
                            } else if (i2 == 2) {
                                str2 = null;
                                filterEntity$Mode = FilterEntity$Mode.SELECTABLE;
                            } else {
                                if (i2 != 3) {
                                    w511.b();
                                    return null;
                                }
                                filterEntity$Mode2 = FilterEntity$Mode.SELECTABLE_AND_RESETTABLE;
                                str2 = null;
                                arrayList5.add(new j4r(str, obj, obj2, filterEntity$Mode2, r4rVar));
                                str4 = str2;
                                aVar4 = aVar3;
                                i4 = 10;
                            }
                            filterEntity$Mode2 = filterEntity$Mode;
                            arrayList5.add(new j4r(str, obj, obj2, filterEntity$Mode2, r4rVar));
                            str4 = str2;
                            aVar4 = aVar3;
                            i4 = 10;
                        } else {
                            if (!(filterContent2 instanceof PfmResponse$FilterContent$IconAndTitle)) {
                                String str9 = str4;
                                w511.b();
                                return str9;
                            }
                            c = qxy0.c(((PfmResponse$FilterContent$IconAndTitle) filterContent2).getIcon(), str4);
                        }
                        obj2 = c;
                        innerContent = filter.getInnerContent();
                        if (innerContent instanceof PfmResponse$FilterInnerContent$DateFilter) {
                        }
                        i2 = lcb0.a[filter.getFilterMode().ordinal()];
                        if (i2 != 1) {
                        }
                        filterEntity$Mode2 = filterEntity$Mode;
                        arrayList5.add(new j4r(str, obj, obj2, filterEntity$Mode2, r4rVar));
                        str4 = str2;
                        aVar4 = aVar3;
                        i4 = 10;
                    }
                    aVar = aVar4;
                    set = kotlin.collections.a.N0(arrayList5);
                }
                List<PfmResponse.TransactionListItem> items = pfmResponse.getTransactions().getItems();
                ArrayList arrayList8 = new ArrayList();
                it = items.iterator();
                collection = arrayList8;
                aVar2 = aVar;
                set2 = set;
                pfmResponse2 = pfmResponse;
                if (it.hasNext()) {
                }
                return coroutineSingletons;
            }
        }
        pfmResponseMapperKt$toEntity$1 = new PfmResponseMapperKt$toEntity$1(continuationImpl);
        Object obj32 = pfmResponseMapperKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pfmResponseMapperKt$toEntity$1.label;
        String str42 = null;
        if (i == 0) {
        }
    }
}
