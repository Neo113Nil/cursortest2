package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.api.routing.models.ClipFeedTransientArgumentsContainer;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.clips.viewer.impl.routing.transition.ClipFullscreenDestinationExitTransition;
import com.vk.clips.viewer.impl.routing.transition.ClipFullscreenSourceHoldTransition;
import com.vk.core.fragments.internal.transition.TransitionAnimation;
import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.ui.SingleClipFragmentWrapperActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import xsna.h7u0;

/* compiled from: ClipsRouterImpl.kt */
/* loaded from: classes17.dex */
public final class d2f implements ClipsRouter {
    public final zof a;

    public d2f(zof zofVar) {
        this.a = zofVar;
    }

    public static boolean m(ClipFeedTab clipFeedTab) {
        if (clipFeedTab == null) {
            return false;
        }
        if ((clipFeedTab instanceof ClipFeedTab.TopVideo) || (clipFeedTab instanceof ClipFeedTab.SingleClip) || (clipFeedTab instanceof ClipFeedTab.SingleClipByVideoId) || (clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) || (clipFeedTab instanceof ClipFeedTab.Mask) || (clipFeedTab instanceof ClipFeedTab.Music) || (clipFeedTab instanceof ClipFeedTab.Compilation) || (clipFeedTab instanceof ClipFeedTab.Hashtag) || (clipFeedTab instanceof ClipFeedTab.Place) || (clipFeedTab instanceof ClipFeedTab.Profile) || (clipFeedTab instanceof ClipFeedTab.Discover) || (clipFeedTab instanceof ClipFeedTab.Search) || (clipFeedTab instanceof ClipFeedTab.CatalogClip) || (clipFeedTab instanceof ClipFeedTab.MusicTemplate) || (clipFeedTab instanceof ClipFeedTab.ProfileLives) || (clipFeedTab instanceof ClipFeedTab.Playlist) || (clipFeedTab instanceof ClipFeedTab.NewsMonotheme)) {
            return true;
        }
        if ((clipFeedTab instanceof ClipFeedTab.LikedClips) || (clipFeedTab instanceof ClipFeedTab.LivesTop) || (clipFeedTab instanceof ClipFeedTab.MyClips) || (clipFeedTab instanceof ClipFeedTab.SingleAdv) || (clipFeedTab instanceof ClipFeedTab.ClipsFromShopsSource) || (clipFeedTab instanceof ClipFeedTab.ClipsFromTrendsSource) || (clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) || (clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) || (clipFeedTab instanceof ClipFeedTab.UserSubscriptions) || (clipFeedTab instanceof ClipFeedTab.FavoriteFolder) || (clipFeedTab instanceof ClipFeedTab.CoauthorInvitations)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.clips.viewer.api.routing.ClipsRouter
    public final void a(Context context, ClipFeedTab clipFeedTab, io2 io2Var, kwc kwcVar, dcy dcyVar, ClipFeedOpenAction clipFeedOpenAction, boolean z) {
        List list;
        VideoPipStateHolder.a.getClass();
        VideoPipStateHolder.b();
        boolean z2 = clipFeedTab instanceof ClipFeedTab.NewsMonotheme;
        if (z2) {
            list = Collections.singletonList(clipFeedTab);
        } else {
            pkd f = g620.f();
            ClipFeedTab.WithPayload withPayload = clipFeedTab instanceof ClipFeedTab.WithPayload ? (ClipFeedTab.WithPayload) clipFeedTab : null;
            List<ClipFeedTab> p = f.p(withPayload != null ? withPayload.getPayload() : null);
            ArrayList arrayList = new ArrayList(c5g.u(p, 10));
            for (ClipFeedTab clipFeedTab2 : p) {
                if (clipFeedTab2 instanceof ClipFeedTab.TopVideo) {
                    clipFeedTab2 = clipFeedTab;
                }
                arrayList.add(clipFeedTab2);
            }
            list = arrayList;
        }
        n(context, list, io2Var, kwcVar, dcyVar == null ? fpf0.a(clipFeedTab.getClass()) : dcyVar, null, clipFeedOpenAction, z, null, !z2);
    }

    @Override // com.vk.clips.viewer.api.routing.ClipsRouter
    public final void d(Context context, ClipGridParams clipGridParams, boolean z, ClipsRouter.GridForcedTab gridForcedTab, SearchStatsLoggingInfo searchStatsLoggingInfo, String str) {
        ClipsGridFragment.a aVar = new ClipsGridFragment.a(clipGridParams);
        Bundle bundle = aVar.j;
        bundle.putBoolean("ClipsGridFragment.is_owner_grid", z);
        bundle.putSerializable("ClipsGridFragment.forced_tab", gridForcedTab);
        g620.f().h().getClass();
        aVar.s(false);
        bundle.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
        bundle.putString("ClipsGridFragment.open_from", str);
        aVar.k(context);
    }

    @Override // com.vk.clips.viewer.api.routing.ClipsRouter
    public final void e(Context context, ClipVideoFile clipVideoFile) {
        if (this.a.I().a) {
            ClipsRouter.c(this, context, Collections.singletonList(new ClipFeedTab.SingleClip(new ClipVideoFileAdapter(clipVideoFile), null, null, false, false, null, null, null, 254, null)), null, null, null, null, null, true, null, 1916);
        } else {
            ClipsRouter.b(this, context, new ClipFeedTab.SingleClip(new ClipVideoFileAdapter(clipVideoFile), null, null, false, false, null, null, null, 254, null), null, null, null, null, false, 252);
        }
    }

    @Override // com.vk.clips.viewer.api.routing.ClipsRouter
    public final void f(Context context, UserId userId, List list, io2 io2Var) {
        if (list.isEmpty()) {
            return;
        }
        List singletonList = Collections.singletonList(new ClipFeedTab.ProfileLives(userId));
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(k15.B((VideoFile) it.next()));
        }
        kwc kwcVar = new kwc(arrayList, PaginationKey.LoadedFull.b, 0);
        io2 io2Var2 = io2Var == null ? null : io2Var;
        VideoPipStateHolder.a.getClass();
        VideoPipStateHolder.b();
        ClipsRouter.c(this, context, singletonList, io2Var2, kwcVar, fpf0.a(ClipFeedTab.ProfileLives.class), null, null, false, null, 2016);
    }

    @Override // com.vk.clips.viewer.api.routing.ClipsRouter
    public final void g(Context context, List list, io2 io2Var, kwc kwcVar, dcy dcyVar, SearchStatsLoggingInfo searchStatsLoggingInfo, ClipFeedOpenAction clipFeedOpenAction, boolean z, wp50 wp50Var) {
        n(context, list, io2Var, kwcVar, dcyVar, searchStatsLoggingInfo, clipFeedOpenAction, z, wp50Var, false);
    }

    @Override // com.vk.clips.viewer.api.routing.ClipsRouter
    public final void h(Activity activity, VideoFile videoFile) {
        VideoPipStateHolder.a.getClass();
        VideoPipStateHolder.b();
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b != null) {
            activity = b;
        }
        Bundle bundle = new Bundle();
        ClipsWrapperInputArguments.a aVar = ClipsWrapperInputArguments.r;
        ArrayList a = e43.a(new ClipFeedTab.SingleClip(k15.B(videoFile), null, null, true, false, null, null, null, 246, null));
        aVar.getClass();
        ClipsWrapperInputArguments.a.e(bundle, a);
        bundle.putBoolean("ClipsWrapperFragment.in_wrapper_activity", true);
        SingleClipFragmentWrapperActivity.a aVar2 = new SingleClipFragmentWrapperActivity.a(ClipsOwnerSwipeFragment.class, null, bundle);
        aVar2.s(true);
        aVar2.j.putBoolean("withoutAnimation", false);
        aVar2.k(activity);
    }

    @Override // com.vk.clips.viewer.api.routing.ClipsRouter
    public final void i(Context context, rfc rfcVar, ClipFeedOpenAction clipFeedOpenAction) {
        Object obj;
        pkd f = g620.f();
        int i = pkd.a;
        List<ClipFeedTab> p = f.p(null);
        Iterator<T> it = p.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ClipFeedTab clipFeedTab = (ClipFeedTab) obj;
            if (rfcVar != null && rfcVar.c(clipFeedTab)) {
                break;
            }
        }
        ClipFeedTab clipFeedTab2 = (ClipFeedTab) obj;
        int indexOf = p.indexOf(clipFeedTab2);
        if (m(clipFeedTab2) || !j8.d(context)) {
            VideoPipStateHolder.a.getClass();
            VideoPipStateHolder.b();
            ComponentCallbacks2 h = e3m.h(context);
            ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
            ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
            if (Y == null || Y.y() != 0) {
                ClipsRouter.c(this, context, p, null, null, rfcVar, null, clipFeedOpenAction, false, null, 1964);
                return;
            }
            Bundle bundle = new Bundle();
            if (indexOf >= 0) {
                ClipsWrapperInputArguments.r.getClass();
                bundle.putInt("ClipsWrapperFragment.init_tab", indexOf);
            }
            if (clipFeedOpenAction != null) {
                ClipsWrapperInputArguments.r.getClass();
                bundle.putParcelable("ClipsWrapperFragment.open_action", clipFeedOpenAction);
            }
            Y.V(bundle);
        }
    }

    @Override // com.vk.clips.viewer.api.routing.ClipsRouter
    public final void k(Context context, String str) {
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b != null) {
            context = b;
        }
        Bundle bundle = new Bundle();
        ClipsWrapperInputArguments.a aVar = ClipsWrapperInputArguments.r;
        Serializer.c<ClipFeedTab.MusicTemplate> cVar = ClipFeedTab.MusicTemplate.CREATOR;
        ArrayList a = e43.a(new ClipFeedTab.MusicTemplate(str, null, ClipFeedTab.MusicTemplate.IdType.ClipId));
        aVar.getClass();
        ClipsWrapperInputArguments.a.e(bundle, a);
        bundle.putBoolean("ClipsWrapperFragment.in_wrapper_activity", true);
        bundle.putBoolean("ClipsWrapperFragment.key_single_template", true);
        SingleClipFragmentWrapperActivity.a aVar2 = new SingleClipFragmentWrapperActivity.a(ClipsOwnerSwipeFragment.class, null, bundle);
        aVar2.s(true);
        aVar2.j.putBoolean("withoutAnimation", false);
        aVar2.k(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x010e, code lost:
    
        if (r8 == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(Context context, List list, io2 io2Var, kwc kwcVar, dcy dcyVar, SearchStatsLoggingInfo searchStatsLoggingInfo, ClipFeedOpenAction clipFeedOpenAction, boolean z, wp50 wp50Var, boolean z2) {
        Object obj;
        io2 io2Var2;
        ClipsOwnerSwipeFragment.a aVar;
        Bundle bundle;
        Activity h;
        Activity h2;
        DevicePerformanceInfo a;
        VideoRestriction O;
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ClipFeedTab clipFeedTab = (ClipFeedTab) obj;
            if (dcyVar != null && dcyVar.c(clipFeedTab)) {
                break;
            }
        }
        if (!m((ClipFeedTab) obj) && (!(list2 instanceof Collection) || !list2.isEmpty())) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (!m((ClipFeedTab) it2.next())) {
                    if (j8.d(context)) {
                        return;
                    }
                }
            }
        }
        if (list.size() == 1) {
            ClipFeedTab clipFeedTab2 = (ClipFeedTab) j5g.Y(list);
            VideoFile A = clipFeedTab2 instanceof ClipFeedTab.SingleClip ? k15.A(((ClipFeedTab.SingleClip) clipFeedTab2).b) : clipFeedTab2 instanceof ClipFeedTab.SingleClipWithDecoration ? k15.A(((ClipFeedTab.SingleClipWithDecoration) clipFeedTab2).b) : null;
            if (A != null && (O = A.O()) != null && g620.f().v(A) && !epx.f(clipFeedOpenAction, ClipFeedOpenAction.ShowLogin.b)) {
                int i = h7u0.p;
                h7u0.a c = h7u0.b.c(context);
                c.h0(O.b);
                c.c0(R.string.close, new o1c());
                c.m();
                return;
            }
        }
        VideoPipStateHolder.a.getClass();
        VideoPipStateHolder.b();
        zof zofVar = this.a;
        int i2 = 0;
        boolean z3 = zofVar.H().isEnabled() && zofVar.H().c();
        if (zofVar.H().isEnabled()) {
            HashSet hashSet = iah0.a;
            if (!fnj.d(context)) {
                if (zofVar.q() && (a = DevicePerformanceInfo.a.a()) != null) {
                    DevicePerformanceInfo.Class r9 = a.a;
                    DevicePerformanceInfo.Class r10 = DevicePerformanceInfo.Class.LOW;
                    boolean z4 = r9 == r10;
                    boolean z5 = a.e == r10;
                    if (!z4) {
                    }
                }
            }
            io2Var2 = null;
            ClipFeedTab[] clipFeedTabArr = (ClipFeedTab[]) list.toArray(new ClipFeedTab[0]);
            ClipFeedTab[] clipFeedTabArr2 = (ClipFeedTab[]) Arrays.copyOf(clipFeedTabArr, clipFeedTabArr.length);
            ClipFeedTab[] clipFeedTabArr3 = (ClipFeedTab[]) Arrays.copyOf(clipFeedTabArr2, clipFeedTabArr2.length);
            ClipFeedTab[] clipFeedTabArr4 = (ClipFeedTab[]) Arrays.copyOf(clipFeedTabArr3, clipFeedTabArr3.length);
            aVar = new ClipsOwnerSwipeFragment.a((ClipFeedTab[]) Arrays.copyOf(clipFeedTabArr4, clipFeedTabArr4.length));
            bundle = aVar.j;
            if (dcyVar != null) {
                ClipFeedTab[] clipFeedTabArr5 = aVar.m;
                int length = clipFeedTabArr5.length;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (fpf0.a(clipFeedTabArr5[i2].getClass()).equals(dcyVar)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                Integer valueOf = Integer.valueOf(i2);
                if (i2 < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    ClipsWrapperInputArguments.r.getClass();
                    bundle.putInt("ClipsWrapperFragment.init_tab", intValue);
                }
            }
            if (searchStatsLoggingInfo != null) {
                ClipsWrapperInputArguments.r.getClass();
                bundle.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
            }
            if (clipFeedOpenAction != null) {
                ClipsWrapperInputArguments.r.getClass();
                bundle.putParcelable("ClipsWrapperFragment.open_action", clipFeedOpenAction);
            }
            if (!z3 || z) {
                aVar.s(true);
            }
            if (z2 && zofVar.I().a) {
                ClipsWrapperInputArguments.r.getClass();
                bundle.putBoolean("ClipsWrapperFragment.open_with_default_tabs", true);
            }
            ClipsWrapperInputArguments.a aVar2 = ClipsWrapperInputArguments.r;
            ClipFeedTransientArgumentsContainer clipFeedTransientArgumentsContainer = new ClipFeedTransientArgumentsContainer(kwcVar, io2Var2, wp50Var);
            aVar2.getClass();
            bundle.putParcelable("ClipsWrapperFragment.transient_arguments", clipFeedTransientArgumentsContainer);
            h = e3m.h(context);
            if (h == null && zofVar.H().isEnabled() && (h instanceof FragmentActivity) && !p90.e(h)) {
                if (io2Var2 != null) {
                    aVar.u(new TransitionAnimation.Animations(null, new ClipFullscreenDestinationExitTransition(), null, new ClipFullscreenSourceHoldTransition(ClipFullscreenSourceHoldTransition.b.EXIT, null), 5, null));
                }
                if (io2Var2 instanceof po2) {
                    ((po2) io2Var2).c();
                }
                aVar.k(h);
                return;
            }
            if (io2Var2 != null || (h2 = e3m.h(context)) == null || !(h2 instanceof FragmentActivity) || p90.e(h2)) {
                bundle.putBoolean("ClipsWrapperFragment.in_wrapper_activity", true);
                aVar.k(context);
            }
            aVar.f().Td(((FragmentActivity) h2).getSupportFragmentManager(), "ClipsOwnerSwipeFragment." + ((AtomicInteger) ClipsOwnerSwipeFragment.k0.getValue()).incrementAndGet());
            if (io2Var2 instanceof po2) {
                ((po2) io2Var2).c();
                return;
            }
            return;
        }
        io2Var2 = io2Var;
        ClipFeedTab[] clipFeedTabArr6 = (ClipFeedTab[]) list.toArray(new ClipFeedTab[0]);
        ClipFeedTab[] clipFeedTabArr22 = (ClipFeedTab[]) Arrays.copyOf(clipFeedTabArr6, clipFeedTabArr6.length);
        ClipFeedTab[] clipFeedTabArr32 = (ClipFeedTab[]) Arrays.copyOf(clipFeedTabArr22, clipFeedTabArr22.length);
        ClipFeedTab[] clipFeedTabArr42 = (ClipFeedTab[]) Arrays.copyOf(clipFeedTabArr32, clipFeedTabArr32.length);
        aVar = new ClipsOwnerSwipeFragment.a((ClipFeedTab[]) Arrays.copyOf(clipFeedTabArr42, clipFeedTabArr42.length));
        bundle = aVar.j;
        if (dcyVar != null) {
        }
        if (searchStatsLoggingInfo != null) {
        }
        if (clipFeedOpenAction != null) {
        }
        if (!z3) {
        }
        aVar.s(true);
        if (z2) {
            ClipsWrapperInputArguments.r.getClass();
            bundle.putBoolean("ClipsWrapperFragment.open_with_default_tabs", true);
        }
        ClipsWrapperInputArguments.a aVar22 = ClipsWrapperInputArguments.r;
        ClipFeedTransientArgumentsContainer clipFeedTransientArgumentsContainer2 = new ClipFeedTransientArgumentsContainer(kwcVar, io2Var2, wp50Var);
        aVar22.getClass();
        bundle.putParcelable("ClipsWrapperFragment.transient_arguments", clipFeedTransientArgumentsContainer2);
        h = e3m.h(context);
        if (h == null) {
        }
        if (io2Var2 != null) {
        }
        bundle.putBoolean("ClipsWrapperFragment.in_wrapper_activity", true);
        aVar.k(context);
    }
}
