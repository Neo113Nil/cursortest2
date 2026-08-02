package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.layout.TopTitle;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.api.video.ShowcaseListItem;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.List;
import java.util.Set;

/* compiled from: UIBlockExt.kt */
/* loaded from: classes16.dex */
public final class kwp0 {
    public static final UIBlockHeader a(UIBlockHeader uIBlockHeader, int i) {
        UIBlockBadge uIBlockBadge = uIBlockHeader.C;
        if (uIBlockBadge == null) {
            return uIBlockHeader;
        }
        com.vk.catalog2.common.dto.api.ui.a aVar = new com.vk.catalog2.common.dto.api.ui.a(uIBlockHeader.b, uIBlockHeader.c, uIBlockHeader.d, uIBlockHeader.e, uIBlockHeader.f, uIBlockHeader.g, uIBlockHeader.h, uIBlockHeader.Db(), uIBlockHeader.j, uIBlockHeader.l, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7168);
        String str = uIBlockHeader.y;
        String str2 = uIBlockHeader.z;
        TopTitle topTitle = uIBlockHeader.B;
        String str3 = uIBlockHeader.b;
        CatalogViewType catalogViewType = uIBlockHeader.d;
        CatalogDataType catalogDataType = uIBlockHeader.e;
        String str4 = uIBlockHeader.f;
        UserId userId = uIBlockHeader.g;
        List<String> list = uIBlockHeader.h;
        Set<UIBlockDragDropAction> Db = uIBlockHeader.Db();
        UIBlockHint uIBlockHint = uIBlockHeader.j;
        String valueOf = String.valueOf(i);
        CatalogBadge catalogBadge = uIBlockBadge.y;
        String str5 = catalogBadge != null ? catalogBadge.c : null;
        if (str5 == null) {
            str5 = "";
        }
        return new UIBlockHeader(aVar, str, str2, topTitle, new mwp0(new UIBlockBadge(str3, catalogViewType, catalogDataType, str4, userId, list, Db, uIBlockHint, new CatalogBadge(valueOf, str5)), uIBlockHeader.D, uIBlockHeader.E, uIBlockHeader.F, uIBlockHeader.G, uIBlockHeader.H, uIBlockHeader.I, uIBlockHeader.J, uIBlockHeader.K, uIBlockHeader.L), null, null, 96, null);
    }

    public static final UIBlockVideo b(UIBlockVideo uIBlockVideo, VideoFile videoFile) {
        CatalogViewType catalogViewType;
        UIBlockVideo.DynamicPollData dynamicPollData;
        String str = uIBlockVideo.b;
        CatalogViewType catalogViewType2 = uIBlockVideo.d;
        CatalogDataType catalogDataType = uIBlockVideo.e;
        String str2 = uIBlockVideo.f;
        UserId userId = uIBlockVideo.g;
        List<String> list = uIBlockVideo.h;
        Set<UIBlockDragDropAction> Db = uIBlockVideo.Db();
        UIBlockHint uIBlockHint = uIBlockVideo.j;
        String title = videoFile.getTitle();
        boolean z = uIBlockVideo.H;
        String str3 = uIBlockVideo.K;
        boolean z2 = uIBlockVideo.C;
        List<String> list2 = uIBlockVideo.D;
        ShowcaseListItem showcaseListItem = uIBlockVideo.G;
        UIBlockVideo.DynamicPollData dynamicPollData2 = uIBlockVideo.O;
        if (dynamicPollData2 != null) {
            catalogViewType = catalogViewType2;
            dynamicPollData = new UIBlockVideo.DynamicPollData(dynamicPollData2.b);
        } else {
            catalogViewType = catalogViewType2;
            dynamicPollData = null;
        }
        return new UIBlockVideo(str, catalogViewType, catalogDataType, str2, userId, list, Db, uIBlockHint, new UIBlockVideo.a(title, videoFile, z, str3, z2, list2, showcaseListItem, dynamicPollData, 12724), uIBlockVideo.l);
    }
}
