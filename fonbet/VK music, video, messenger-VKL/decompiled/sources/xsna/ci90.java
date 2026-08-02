package xsna;

import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdsType;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.playlist.SdkClipsDraftablePlaylist;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.feed.view.bottomsheet.actions.menu.ClipsActionEnableState;
import com.vk.dto.common.VideoAccessInfo;
import com.vk.dto.common.VideoEditForbiddenReason;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.g8d;

/* compiled from: ParamsHelpers.kt */
/* loaded from: classes17.dex */
public final class ci90 {
    public static final boolean a(ikd ikdVar) {
        VideoAccessInfo G9 = k15.A(ikdVar.a).G9();
        if (G9 == null) {
            return false;
        }
        List<VideoEditForbiddenReason> list = G9.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((VideoEditForbiddenReason) it.next()) instanceof VideoEditForbiddenReason.Ad) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(ikd ikdVar, xne xneVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        if (j(ikdVar) || !h(ikdVar) || g(ikdVar)) {
            return false;
        }
        if (xneVar.a(sdkVideoFile)) {
            SdkVideoAdInfo X0 = sdkVideoFile.X0();
            if ((X0 != null ? X0.h : null) != SdkVideoAdsType.MY_TARGET_VIDEO) {
                return false;
            }
        }
        ClipFeedTab c = c(ikdVar);
        return c != null && c.zb();
    }

    public static final ClipFeedTab c(ikd ikdVar) {
        g8d.a aVar = ikdVar.f;
        g8d.a.C2925a c2925a = aVar instanceof g8d.a.C2925a ? (g8d.a.C2925a) aVar : null;
        if (c2925a != null) {
            return c2925a.a;
        }
        return null;
    }

    public static final ClipsActionEnableState d(ikd ikdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        if (sdkVideoFile.g1() && n(ikdVar)) {
            return ClipsActionEnableState.EnableWithBlockedClickAction;
        }
        if (sdkVideoFile.g1()) {
            return ClipsActionEnableState.Enabled;
        }
        if (a(ikdVar)) {
            return ClipsActionEnableState.EnableWithBlockedClickAction;
        }
        return (xg5.a().e(ikdVar.a.I0()) && n(ikdVar)) ? ClipsActionEnableState.EnableWithBlockedClickAction : ClipsActionEnableState.Disabled;
    }

    public static final ClipsActionEnableState e(ikd ikdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        if (sdkVideoFile.t0() && n(ikdVar)) {
            return ClipsActionEnableState.EnableWithBlockedClickAction;
        }
        if (sdkVideoFile.t0()) {
            return ClipsActionEnableState.Enabled;
        }
        if (a(ikdVar)) {
            return ClipsActionEnableState.EnableWithBlockedClickAction;
        }
        return (xg5.a().e(ikdVar.a.I0()) && n(ikdVar)) ? ClipsActionEnableState.EnableWithBlockedClickAction : ClipsActionEnableState.Disabled;
    }

    public static final boolean f(ikd ikdVar) {
        boolean z;
        List<SdkClipsDraftablePlaylist> d0;
        List<SdkCoOwnerItem> P1;
        SdkVideoFile sdkVideoFile = ikdVar.a;
        SdkClipVideoFile sdkClipVideoFile = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
        if (sdkClipVideoFile != null && (P1 = sdkClipVideoFile.P1()) != null) {
            List<SdkCoOwnerItem> list = P1;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (SdkCoOwnerItem sdkCoOwnerItem : list) {
                    if (sdkCoOwnerItem.d() && sdkCoOwnerItem.d) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        if ((sdkVideoFile.t0() || z) && h(ikdVar)) {
            SdkClipVideoFile sdkClipVideoFile2 = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
            if (sdkClipVideoFile2 != null && (d0 = sdkClipVideoFile2.d0()) != null && d0.isEmpty() && sdkVideoFile.k1() == 0 && !sdkVideoFile.Q0()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean g(ikd ikdVar) {
        List<SdkCoOwnerItem> P1;
        SdkVideoFile sdkVideoFile = ikdVar.a;
        SdkClipVideoFile sdkClipVideoFile = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
        if (sdkClipVideoFile != null && (P1 = sdkClipVideoFile.P1()) != null) {
            List<SdkCoOwnerItem> list = P1;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (SdkCoOwnerItem sdkCoOwnerItem : list) {
                    if (sdkCoOwnerItem.d && sdkCoOwnerItem.d()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean h(ikd ikdVar) {
        return g620.f().c(k15.A(ikdVar.a));
    }

    public static final boolean i(ikd ikdVar) {
        List<SdkCoOwnerItem> P1;
        SdkVideoFile sdkVideoFile = ikdVar.a;
        SdkClipVideoFile sdkClipVideoFile = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
        if (sdkClipVideoFile != null && (P1 = sdkClipVideoFile.P1()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : P1) {
                if (((SdkCoOwnerItem) obj).d) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    UserId userId = ((SdkCoOwnerItem) it.next()).b;
                    ClipFeedTab c = c(ikdVar);
                    ClipFeedTab.Profile profile = c instanceof ClipFeedTab.Profile ? (ClipFeedTab.Profile) c : null;
                    if (epx.f(userId, profile != null ? profile.c : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean j(ikd ikdVar) {
        return o25.a().a(ikdVar.a.I0());
    }

    public static final boolean k(ikd ikdVar) {
        boolean z;
        List<SdkClipsDraftablePlaylist> d0;
        List<SdkCoOwnerItem> P1;
        SdkVideoFile sdkVideoFile = ikdVar.a;
        SdkClipVideoFile sdkClipVideoFile = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
        if (sdkClipVideoFile != null && (P1 = sdkClipVideoFile.P1()) != null) {
            List<SdkCoOwnerItem> list = P1;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (SdkCoOwnerItem sdkCoOwnerItem : list) {
                    if (sdkCoOwnerItem.d() && sdkCoOwnerItem.d) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        if ((sdkVideoFile.t0() || z) && h(ikdVar) && !(c(ikdVar) instanceof ClipFeedTab.Playlist)) {
            SdkClipVideoFile sdkClipVideoFile2 = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
            if (sdkClipVideoFile2 != null && (d0 = sdkClipVideoFile2.d0()) != null && (!d0.isEmpty()) && sdkVideoFile.k1() == 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean l(SdkClipVideoFile sdkClipVideoFile) {
        ClickableStickers clickableStickers = k15.z(sdkClipVideoFile).C1;
        ArrayList arrayList = null;
        List<ClickableSticker> list = clickableStickers != null ? clickableStickers.d : null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ClickableSticker clickableSticker : list) {
                ClickableMarketItem clickableMarketItem = clickableSticker instanceof ClickableMarketItem ? (ClickableMarketItem) clickableSticker : null;
                String str = clickableMarketItem != null ? clickableMarketItem.l : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            arrayList = arrayList2;
        }
        return true ^ (arrayList == null || arrayList.isEmpty());
    }

    public static final boolean m(ikd ikdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        VideoFile A = k15.A(sdkVideoFile);
        if (fxc0.B().c(A)) {
            return false;
        }
        VideoRestriction O = A.O();
        return (O == null || O.f) && !fxc0.B().b0().e(k15.A(sdkVideoFile));
    }

    public static final boolean n(ikd ikdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        SdkClipVideoFile sdkClipVideoFile = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
        if (sdkClipVideoFile != null) {
            return l(sdkClipVideoFile);
        }
        return false;
    }

    public static final boolean o(ikd ikdVar, boolean z) {
        boolean z2 = ikdVar.a.g1() || a(ikdVar);
        return (z2 && z) ? !j(ikdVar) && ikdVar.d.b < 0 : z2;
    }
}
