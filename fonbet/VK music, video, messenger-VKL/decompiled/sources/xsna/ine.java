package xsna;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlockAnchorInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.clips.SdkNewsMonotheme;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.NestedScrollableRecyclerView;
import com.vk.dto.common.VideoFile;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClipsOnClickListener.kt */
/* loaded from: classes16.dex */
public final class ine implements mba {
    public static final hne b = new hne(0);

    /* JADX WARN: Removed duplicated region for block: B:134:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    @Override // xsna.mba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(View view, UIBlock uIBlock, Object obj) {
        io2 io2Var;
        SdkNewsMonotheme v1;
        List list;
        Object profileCatalogClip;
        CatalogViewType catalogViewType;
        yg5 yg5Var;
        VideoFile A;
        Activity c = g2u0.c(view);
        if (c == null) {
            return;
        }
        UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
        if (uIBlockVideo == null || uIBlockVideo.b == null) {
            return;
        }
        View rootView = view.getRootView();
        View view2 = view;
        while (!fpf0.a(NestedScrollableRecyclerView.class).c(view2) && view2 != null && !view2.equals(rootView)) {
            view2 = (View) view2.getParent();
        }
        if (!(view2 instanceof NestedScrollableRecyclerView)) {
            view2 = null;
        }
        NestedScrollableRecyclerView nestedScrollableRecyclerView = (NestedScrollableRecyclerView) view2;
        if (nestedScrollableRecyclerView == null) {
            return;
        }
        UIBlockVideo uIBlockVideo2 = (UIBlockVideo) uIBlock;
        VideoFile videoFile = uIBlockVideo2.B;
        List<CatalogBlockAnchorInfo> list2 = uIBlockVideo2.A;
        VideoFile videoFile2 = uIBlockVideo2.B;
        String r = videoFile.r();
        if (r != null) {
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, r, null, 46, null), new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.CLICK, CommonVideoStat$TypeScreenMode.PREVIEW), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c2, b2, uzp0Var.a).q();
        }
        View rootView2 = view.getRootView();
        View view3 = view;
        while (!fpf0.a(NestedScrollableRecyclerView.class).c(view3) && view3 != null && !view3.equals(rootView2)) {
            view3 = (View) view3.getParent();
        }
        if (!(view3 instanceof NestedScrollableRecyclerView)) {
            view3 = null;
        }
        NestedScrollableRecyclerView nestedScrollableRecyclerView2 = (NestedScrollableRecyclerView) view3;
        if (nestedScrollableRecyclerView2 != null) {
            Object findContainingViewHolder = nestedScrollableRecyclerView2.findContainingViewHolder(view);
            ent0 ent0Var = findContainingViewHolder instanceof ent0 ? (ent0) findContainingViewHolder : null;
            if (ent0Var != null) {
                dnt0 q3 = ent0Var.q3();
                if (q3 instanceof fh5) {
                    io2Var = (fh5) q3;
                    if (io2Var == null) {
                        io2Var = x0a.b((x0a) b.invoke(view, nestedScrollableRecyclerView), videoFile2, 2);
                    }
                    io2 io2Var2 = io2Var;
                    SdkVideoFile c3 = g620.f().e0().c(videoFile2);
                    SdkClipVideoFile sdkClipVideoFile = !(c3 instanceof SdkClipVideoFile) ? (SdkClipVideoFile) c3 : null;
                    v1 = sdkClipVideoFile == null ? sdkClipVideoFile.v1() : null;
                    if (v1 == null) {
                        ClipsRouter.b(g620.f().a(), c, new ClipFeedTab.NewsMonotheme(v1.b, v1.c, c3, null, 8, null), io2Var2, null, null, null, true, 120);
                        return;
                    }
                    RecyclerView.Adapter adapter = nestedScrollableRecyclerView.getAdapter();
                    pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
                    Object obj2 = pd90Var != null ? pd90Var.c : null;
                    ai5 ai5Var = obj2 instanceof ai5 ? (ai5) obj2 : null;
                    if (ai5Var != null) {
                        k9x q = swe0.q(0, ai5Var.getItemCount());
                        ArrayList arrayList = new ArrayList();
                        j9x it = q.iterator();
                        while (it.d) {
                            y9t0 Eh = ai5Var.Eh(it.nextInt());
                            SdkVideoFile c4 = (Eh == null || (yg5Var = Eh.a) == null || (A = yg5Var.A()) == null) ? null : g620.f().e0().c(A);
                            if (c4 != null) {
                                arrayList.add(c4);
                            }
                        }
                        list = j5g.O0(arrayList);
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = EmptyList.b;
                    }
                    List list3 = list;
                    if (list3.isEmpty()) {
                        list3 = Collections.singletonList(c3);
                    }
                    List list4 = list3;
                    VideoFeatures videoFeatures = VideoFeatures.CLIPS_CATALOG_USE_GET_RECOM;
                    videoFeatures.getClass();
                    if (!com.vk.toggle.b.A.a(videoFeatures) || (catalogViewType = uIBlockVideo2.d) == CatalogViewType.SEARCH_CAROUSEL_CLIPS || catalogViewType == CatalogViewType.SEARCH_FLOOR_CLIPS) {
                        profileCatalogClip = new ClipFeedTab.CatalogClip.ProfileCatalogClip(uIBlockVideo2.b, new ClipFeedTab.Profile(null, uIBlockVideo2.g));
                    } else {
                        String r2 = videoFile2.r();
                        CatalogBlockAnchorInfo catalogBlockAnchorInfo = (CatalogBlockAnchorInfo) j5g.a0(list2);
                        String str = catalogBlockAnchorInfo != null ? catalogBlockAnchorInfo.d : null;
                        CatalogBlockAnchorInfo catalogBlockAnchorInfo2 = (CatalogBlockAnchorInfo) j5g.a0(list2);
                        profileCatalogClip = new ClipFeedTab.TopVideo(null, str, r2, catalogBlockAnchorInfo2 != null ? catalogBlockAnchorInfo2.e : null, null, 17, null);
                    }
                    ClipsRouter a = g620.f().a();
                    List singletonList = Collections.singletonList(profileCatalogClip);
                    String str2 = uIBlockVideo2.z;
                    PaginationKey next = (str2 == null || str2.length() == 0 || str2.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(str2);
                    Iterator it2 = list4.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        } else if (epx.f(((SdkVideoFile) it2.next()).r1(), videoFile2.r1())) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (i == -1) {
                        valueOf = null;
                    }
                    ClipsRouter.c(a, c, singletonList, io2Var2, new kwc(list4, next, valueOf != null ? valueOf.intValue() : 0), null, null, null, true, null, 1904);
                    return;
                }
            }
        }
        io2Var = null;
        if (io2Var == null) {
        }
        io2 io2Var22 = io2Var;
        SdkVideoFile c32 = g620.f().e0().c(videoFile2);
        if (!(c32 instanceof SdkClipVideoFile)) {
        }
        if (sdkClipVideoFile == null) {
        }
        if (v1 == null) {
        }
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
    }

    @Override // xsna.mba
    public final void m(int i, UIBlock uIBlock, izs<? super Boolean, s3q0> izsVar) {
    }

    @Override // xsna.mba
    public final void q(int i, UIBlock uIBlock, Object obj) {
    }
}
