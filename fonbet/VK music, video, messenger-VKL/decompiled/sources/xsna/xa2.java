package xsna;

import android.graphics.RectF;
import androidx.core.widget.NestedScrollView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.core.view.components.pagination.VkPaginationDots;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class xa2 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xa2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = null;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(((hio0) obj4).a(zjq.p((RectF) obj), zjq.p((RectF) obj2)));
            case 1:
                ((Integer) obj2).getClass();
                ((kd4) obj4).c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                ?? r0 = (ClipInvolvementActionButton) obj;
                if (((Boolean) obj2).booleanValue()) {
                    if (ref$ObjectRef.element != 0) {
                        ref$ObjectRef.element = null;
                        return s3q0.a;
                    }
                    ref$ObjectRef.element = r0;
                }
                return s3q0.a;
            case 3:
                DonutPriceTemplate donutPriceTemplate = (DonutPriceTemplate) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                aVar.K(2026756135);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2026756135, intValue, -1, "com.vk.profile.core.tabs.ui.videos.CommunityProfileVideoItemViewHolderRedesigned.toDonutTeaserViewState.<anonymous>.<anonymous> (CommunityProfileVideoItemViewHolderRedesigned.kt:258)");
                }
                us2 a = z1o.a(donutPriceTemplate, null, aVar, 1);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return a;
            case 4:
                String str = (String) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1388951098, intValue2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointAddress.<anonymous> (DeliveryPointDetails.kt:122)");
                    }
                    q630 f = txj0.f(q630.a.a, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().m;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, f, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.c0, aVar2, 48, 0, 8184);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((vwn) obj4).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((v0r) obj4).f(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 7:
                MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = (MarketItemReviewRepliesFragment) obj4;
                RepliesView repliesView = marketItemReviewRepliesFragment.T;
                if (repliesView != null) {
                    repliesView.d();
                }
                RepliesView repliesView2 = marketItemReviewRepliesFragment.T;
                if (repliesView2 != null) {
                    repliesView2.c();
                }
                NestedScrollView nestedScrollView = marketItemReviewRepliesFragment.V;
                if (nestedScrollView != null) {
                    nestedScrollView.setVisibility(8);
                }
                VkSpinner vkSpinner = marketItemReviewRepliesFragment.U;
                if (vkSpinner != null) {
                    vkSpinner.setVisibility(8);
                }
                RepliesView repliesView3 = marketItemReviewRepliesFragment.T;
                if (repliesView3 != null) {
                    repliesView3.setVisibility(0);
                }
                return s3q0.a;
            case 8:
                jai jaiVar = (jai) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1599196496, intValue3, -1, "com.vk.core.compose.component.cell.miniinfo.MiniInfoCell.Middle.SelectableContent.<anonymous> (MiniInfoCell.kt:92)");
                    }
                    if (cq.i(0, aVar3, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 9:
                ((f880) obj4).invoke();
                return Boolean.FALSE;
            case 10:
                a9k0 a9k0Var = (a9k0) obj4;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(199922588, intValue4, -1, "com.vk.design.demo.presentation.screens.SnackbarScreenContent.ViewImage.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarScreenContent.kt:221)");
                    }
                    a9k0Var.b(0, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 11:
                final VideoAlbum videoAlbum = (VideoAlbum) obj4;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        UIBlock uIBlock = (UIBlock) next;
                        if ((uIBlock instanceof UIBlockList) && uIBlock.h.contains("albums_add")) {
                            obj3 = next;
                        }
                    }
                }
                UIBlock uIBlock2 = (UIBlock) obj3;
                if (uIBlock2 != null) {
                    ArrayList<UIBlock> arrayList2 = ((UIBlockList) uIBlock2).y;
                    if (!arrayList2.isEmpty()) {
                        UIBlockVideoAlbum uIBlockVideoAlbum = (UIBlockVideoAlbum) j5g.Y(arrayList2);
                        arrayList2.add(0, new UIBlockVideoAlbum(uIBlockVideoAlbum.b, uIBlockVideoAlbum.d, uIBlockVideoAlbum.e, uIBlockVideoAlbum.f, videoAlbum.c, uIBlockVideoAlbum.h, videoAlbum, uIBlockVideoAlbum.Db(), uIBlockVideoAlbum.j, uIBlockVideoAlbum.z, uIBlockVideoAlbum.A, uIBlockVideoAlbum.B, uIBlockVideoAlbum.C, uIBlockVideoAlbum.D, uIBlockVideoAlbum.E));
                    }
                }
                arrayList.replaceAll(new UnaryOperator() { // from class: xsna.z5s0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj5) {
                        UIBlock uIBlock3 = (UIBlock) obj5;
                        if (!(uIBlock3 instanceof UIBlockButtons) || !uIBlock3.h.contains("albums_add")) {
                            return uIBlock3;
                        }
                        String str2 = "video_playlist_" + UUID.randomUUID();
                        CatalogViewType catalogViewType = CatalogViewType.DOUBLE_STACKED_SLIDER;
                        CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_VIDEO_ALBUMS;
                        UserId userId = UserId.d;
                        List l = e43.l("albums_add", "albums_remove");
                        EmptySet emptySet = EmptySet.b;
                        return new UIBlockList("video_playlists_" + UUID.randomUUID(), catalogViewType, CatalogDataType.DATA_SYNTHETIC_SECTION, "", userId, e43.l("albums_add", "albums_remove"), emptySet, null, null, "", Collections.singletonList(new UIBlockVideoAlbum(str2, catalogViewType, catalogDataType, "", userId, l, VideoAlbum.this, emptySet, null, EmptyList.b, false, null, null, null, false, 30720, null)), null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, 1072693248, null);
                    }
                });
                return new UIBlockList(uIBlockList, arrayList);
            case 12:
                VideoFile videoFile = (VideoFile) obj;
                kz20 kz20Var = ((VideoEmbedFragment) obj4).Z;
                if (kz20Var != null) {
                    kz20Var.g = videoFile;
                }
                return s3q0.a;
            case 13:
                ((Integer) obj2).getClass();
                int i2 = VkPaginationDots.r;
                ((VkPaginationDots) obj4).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 14:
                ((Integer) obj2).getClass();
                bqv0.e((gzs) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                Boolean bool = (Boolean) obj2;
                cjw0 cjw0Var = ((zhw0) obj4).i;
                cjw0Var.getClass();
                List<zpp> list = (List) obj;
                ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                for (zpp zppVar : list) {
                    T t = zppVar.a;
                    String str2 = zppVar.b;
                    qtd0 qtd0Var = (qtd0) t;
                    arrayList3.add(qtd0Var instanceof Contact ? cjw0Var.a((Contact) qtd0Var, str2) : cjw0Var.b(qtd0Var, str2));
                }
                return new iiw0(arrayList3, bool.booleanValue());
        }
    }

    public /* synthetic */ xa2(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
