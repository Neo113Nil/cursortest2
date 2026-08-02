package xsna;

import android.app.RemoteAction;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.search.FiltersWithSearchResultVh;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.market.album.MarketEditAlbumFinishedFragment;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.b;
import com.vk.ecomm.market.good.ui.c;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.music.fragment.impl.MusicCatalogFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboarding.api.stat.VkOnboardingStat$Type;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.qie;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bn7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bn7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ComposeView composeView;
        com.vk.ecomm.market.good.ui.d dVar;
        List<AboutVideoItem.SimilarVideoRedesign> O0;
        int i = this.b;
        us2 a = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((pn7) obj3).n(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((o48) obj3).b(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((hr8) obj3).k(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                qie qieVar = (qie) obj3;
                ArrayList arrayList = new ArrayList((List) obj);
                for (qie.a aVar : (List) obj2) {
                    if (aVar instanceof qie.a.C3564a) {
                        qie.a.C3564a c3564a = (qie.a.C3564a) aVar;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (epx.f(((SdkVideoFile) it.next()).r1(), c3564a.a.r1())) {
                                it.remove();
                            }
                        }
                        arrayList.add(0, c3564a.a);
                    } else {
                        if (!(aVar instanceof qie.a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qie.a.b bVar = (qie.a.b) aVar;
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (epx.f(((SdkVideoFile) it2.next()).r1(), bVar.a.r1())) {
                                it2.remove();
                            }
                        }
                    }
                }
                return j5g.H0(arrayList, qieVar.a.a);
            case 4:
                CommunitiesCatalogRootVh communitiesCatalogRootVh = (CommunitiesCatalogRootVh) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                Object a0 = j5g.a0(uIBlockList.y);
                UIBlockList uIBlockList2 = a0 instanceof UIBlockList ? (UIBlockList) a0 : null;
                if (uIBlockList2 != null) {
                    List D0 = j5g.D0(new dog(communitiesCatalogRootVh), uIBlockList2.y);
                    uIBlockList2.y.clear();
                    uIBlockList2.y.addAll(D0);
                }
                FiltersWithSearchResultVh filtersWithSearchResultVh = communitiesCatalogRootVh.S;
                if (filtersWithSearchResultVh != null) {
                    filtersWithSearchResultVh.b(uIBlockList);
                }
                return s3q0.a;
            case 5:
                ((xlb0) obj).a();
                long j = ((ov70) obj2).a;
                ((nfu) obj3).getClass();
                throw null;
            case 6:
                GoodFragment goodFragment = (GoodFragment) obj3;
                List list = (List) obj;
                d210 d210Var = (d210) obj2;
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                if (d210Var != null) {
                    h5u h5uVar = (h5u) goodFragment.Po().a.t0.getValue();
                    cxo Po = goodFragment.Po();
                    ArrayList arrayList2 = new ArrayList(list);
                    goodFragment.Oo();
                    goodFragment.No();
                    Context requireContext = goodFragment.requireContext();
                    h5uVar.getClass();
                    Po.n = arrayList2;
                    jid0 jid0Var = Po.G;
                    if (jid0Var != null) {
                        jid0Var.c = arrayList2;
                        jid0Var.notifyDataSetChanged();
                    }
                    Po.a.a().c.onNext(new b.C0946b());
                    Good good = Po.r;
                    com.vk.ecomm.market.good.ui.c a2 = good != null ? c.a.a(requireContext, new com.vk.ecomm.market.good.ui.b(good, Po.v, Po.u, Po.O, Po.y, Po.W, Po.d0)) : null;
                    if (a2 != null && (dVar = Po.D) != null) {
                        dVar.a(a2);
                    }
                    ymd0 ymd0Var = Po.Y;
                    if (ymd0Var != null && !Po.f0 && (composeView = Po.e0) != null) {
                        ymd0Var.a(composeView, gnd0.a(Po));
                    }
                }
                goodFragment.Ao(list);
                return s3q0.a;
            case 7:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1077085619, intValue, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.InterestBox.<anonymous>.<anonymous> (InterestBox.kt:71)");
                    }
                    if (cq.i(0, aVar2, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 8:
                MarketEditAlbumFinishedFragment marketEditAlbumFinishedFragment = (MarketEditAlbumFinishedFragment) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i2 = MarketEditAlbumFinishedFragment.Q;
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-59554439, intValue2, -1, "com.vk.ecomm.market.album.MarketEditAlbumFinishedFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (MarketEditAlbumFinishedFragment.kt:63)");
                    }
                    Object x = aVar3.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new bih(marketEditAlbumFinishedFragment, 25);
                        aVar3.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    Object x2 = aVar3.x();
                    if (x2 == c0012a) {
                        x2 = new h1j(marketEditAlbumFinishedFragment, 21);
                        aVar3.R(x2);
                    }
                    gzs gzsVar2 = (gzs) x2;
                    Object x3 = aVar3.x();
                    if (x3 == c0012a) {
                        x3 = new wzh(marketEditAlbumFinishedFragment, 19);
                        aVar3.R(x3);
                    }
                    px00.a(gzsVar, gzsVar2, (gzs) x3, null, aVar3, 438);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((co20) obj3).i(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 10:
                int i3 = MusicCatalogFragment.W;
                VkOnboardingComponent.Companion companion = VkOnboardingComponent.Companion;
                return ((VkOnboardingComponent) obj3).ac((VkOnboardingStat$Type) obj, (String) obj2);
            case 11:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                View view = ((NewsfeedCustomFragment2) obj3).d0;
                if (view != null) {
                    view.setVisibility(booleanValue ? 0 : 8);
                }
                return s3q0.a;
            case 12:
                rkd0 rkd0Var = (rkd0) obj3;
                sti stiVar = (sti) obj;
                sl50 sl50Var = (sl50) obj2;
                stiVar.a(new ykd0(sl50Var, rkd0Var));
                stiVar.a(new yjd0(sl50Var, rkd0Var));
                stiVar.a(new jld0(sl50Var, rkd0Var));
                return s3q0.a;
            case 13:
                CatalogDataType catalogDataType = (CatalogDataType) obj3;
                ((Integer) obj).intValue();
                return Boolean.valueOf(((UIBlock) obj2).o == catalogDataType);
            case 14:
                RemoteAction remoteAction = (RemoteAction) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                aVar4.K(-1376593684);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1376593684, intValue3, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:254)");
                }
                String obj4 = remoteAction.getTitle().toString();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return obj4;
            case 15:
                ((Integer) obj2).getClass();
                ((r4t0) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 16:
                sat0 sat0Var = (sat0) obj3;
                List list2 = (List) obj;
                bwr0 bwr0Var = (bwr0) obj2;
                List list3 = list2;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list3) {
                    if (obj5 instanceof AboutVideoItem.SimilarVideoRedesign) {
                        arrayList3.add(obj5);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : list3) {
                    if (!(((AboutVideoItem) obj6) instanceof AboutVideoItem.SimilarVideoRedesign)) {
                        arrayList4.add(obj6);
                    }
                }
                if (arrayList3.isEmpty()) {
                    return list2;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList3.size());
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    linkedHashMap.put(((AboutVideoItem.SimilarVideoRedesign) next).b.a.r1(), next);
                }
                if (bwr0Var instanceof fyr0) {
                    VideoFile videoFile = ((fyr0) bwr0Var).a;
                    AboutVideoItem.SimilarVideoRedesign similarVideoRedesign = (AboutVideoItem.SimilarVideoRedesign) linkedHashMap.get(videoFile.r1());
                    if (similarVideoRedesign == null) {
                        return list2;
                    }
                    String r1 = videoFile.r1();
                    DonutVideoUiModel a3 = sat0Var.a.a(nkt0.a(videoFile), DonutVideoCardSource.LARGE_CARD);
                    noj0 noj0Var = similarVideoRedesign.b;
                    linkedHashMap.put(r1, AboutVideoItem.SimilarVideoRedesign.a(similarVideoRedesign, new noj0(videoFile, noj0Var.b, noj0Var.c, a3), false, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
                    O0 = j5g.O0(linkedHashMap.values());
                } else if (bwr0Var instanceof oxr0) {
                    oxr0 oxr0Var = (oxr0) bwr0Var;
                    O0 = sat0Var.a(oxr0Var.a, linkedHashMap, oxr0Var.b);
                } else if (bwr0Var instanceof qxr0) {
                    O0 = sat0Var.b(((qxr0) bwr0Var).a.I0().b, linkedHashMap);
                } else {
                    if (!(bwr0Var instanceof ayr0)) {
                        return list2;
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        AboutVideoItem.SimilarVideoRedesign similarVideoRedesign2 = (AboutVideoItem.SimilarVideoRedesign) entry.getValue();
                        linkedHashMap.put(str, AboutVideoItem.SimilarVideoRedesign.a(similarVideoRedesign2, null, false, fxc0.B().c(similarVideoRedesign2.b.a), Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
                    }
                    O0 = j5g.O0(linkedHashMap.values());
                }
                return j5g.u0(O0, arrayList4);
            case 17:
                DonutVideoUiModel.PreviewBadge previewBadge = (DonutVideoUiModel.PreviewBadge) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                aVar5.K(-1482678861);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1482678861, intValue4, -1, "com.vk.catalog.mvi.block.video.impl.video.list.VideosListViewStateMapper.getPreview.<anonymous>.<anonymous> (VideosListViewStateMapper.kt:145)");
                }
                DonutPriceTemplate donutPriceTemplate = previewBadge.c;
                if (donutPriceTemplate == null) {
                    aVar5.K(-1042232493);
                } else {
                    aVar5.K(1074758254);
                    a = z1o.a(donutPriceTemplate, null, aVar5, 1);
                }
                aVar5.j();
                if (a == null) {
                    aVar5.K(1074760366);
                    a = ws2.b(previewBadge.b, aVar5, 0);
                    aVar5.j();
                } else {
                    aVar5.K(1074757669);
                    aVar5.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return a;
            default:
                tuo0 tuo0Var = (tuo0) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(967108930, intValue5, -1, "com.vk.core.compose.component.datetime.VkTimePickerDialog.<anonymous>.<anonymous> (VkDateTimePicker.kt:136)");
                    }
                    kuo0.j(tuo0Var, null, null, 0, aVar6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ bn7(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
