package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.Surface;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearSection;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.clips.playlists.ClipsPlaylistNamingLaunchParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.expandable.VkExpandableText;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.b9a0;
import xsna.bxi;
import xsna.l310;
import xsna.m6a0;
import xsna.o9t;
import xsna.vm30;
import xsna.xn50;
import xsna.yc1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wo1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wo1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        pni0 pni0Var;
        UIBlockActionClearSection uIBlockActionClearSection;
        r2 = null;
        String str = null;
        int i = 0;
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(new yc1.c(((vo1) this.d).b));
                return s3q0.a;
            case 1:
                Context context = (Context) this.c;
                fh5 fh5Var = (fh5) this.d;
                g7s0.m(fxc0.B(), context, fh5Var.o, UserId.d, null, new t9(fh5Var, 7), 8);
                return s3q0.a;
            case 2:
                BaseVideoPlayer baseVideoPlayer = (BaseVideoPlayer) this.c;
                OneVideoPlayer.State state = (OneVideoPlayer.State) this.d;
                return "setState() " + baseVideoPlayer.G + " -> " + state;
            case 3:
                mph mphVar = (mph) this.c;
                CommunityProfileContent communityProfileContent = (CommunityProfileContent) this.d;
                Context requireContext = mphVar.c.a.requireContext();
                ynh ynhVar = mphVar.b;
                ((ClipsPlaylistsComponent) ynhVar.I.getValue()).e().a(requireContext, new ClipsPlaylistNamingLaunchParams(communityProfileContent.a, "", false, "community_playlist_result", 0, null, 48, null), mphVar.c.a.kn().getSupportFragmentManager(), null);
                Context context2 = requireContext;
                while (true) {
                    z = context2 instanceof FragmentActivity;
                    if (!z && (context2 instanceof ContextWrapper)) {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
                FragmentActivity fragmentActivity = (FragmentActivity) (z ? (Activity) context2 : null);
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                supportFragmentManager.l0("community_playlist_result", fragmentActivity, new lph(i, supportFragmentManager, ((ClipsPlaylistsComponent) ynhVar.I.getValue()).e().c(requireContext, new kz0(14))));
                return s3q0.a;
            case 4:
                ((ptk0) this.c).a((lm50) this.d);
                return s3q0.a;
            case 5:
                ((OneVideoPlayer.b) this.c).a((String) this.d);
                return s3q0.a;
            case 6:
                m7w m7wVar = (m7w) this.c;
                RecyclerView.e0 e0Var = (RecyclerView.e0) this.d;
                if (!m7wVar.b()) {
                    m7wVar.a();
                } else if (((ujm) e0Var).m) {
                    ((jtm) m7wVar.c.invoke()).e();
                }
                return s3q0.a;
            case 7:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) this.c;
                q48 q48Var = (q48) this.d;
                int i2 = MarketItemReviewsFragment.w0;
                xn50.a.c(marketItemReviewsFragment, new l310.r(q48Var.b));
                return s3q0.a;
            case 8:
                return new dtt((Context) this.c, o25.a(), ((VkClientMultiAccountComponent) ((k7m) m7m.f((pa20) this.d)).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments());
            case 9:
                vm30 vm30Var = (vm30) this.c;
                awt0.i(vm30Var.u, new com.vk.movika.sdk.base.flow.binding.l(12, (vm30.c) this.d, vm30Var));
                return s3q0.a;
            case 10:
                return new sr60(((mo60) this.c).n, (d3f0) this.d);
            case 11:
                oe80 oe80Var = (oe80) this.c;
                dw20 dw20Var = (dw20) this.d;
                wzf wzfVar = oe80Var.h;
                if (wzfVar != null) {
                    wzfVar.invoke(Boolean.FALSE);
                }
                dw20Var.hide();
                return s3q0.a;
            case 12:
                return "onRendererThreadAttached() - surface= " + ((Surface) this.c) + " player= " + ((qkz) this.d);
            case 13:
                m6a0 m6a0Var = (m6a0) this.c;
                o6a0 o6a0Var = (o6a0) this.d;
                if (m6a0Var instanceof m6a0.b) {
                    ei90 ei90Var = o6a0Var.b;
                    String str2 = ((m6a0.b) m6a0Var).a;
                    ReentrantLock reentrantLock = ei90Var.e;
                    reentrantLock.lock();
                    try {
                        UiTracker uiTracker = UiTracker.a;
                        UiTrackingScreen b = UiTracker.j.b();
                        if (b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.a) == null) {
                            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
                        }
                        StringBuilder sb = new StringBuilder(v1v.a('/', com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen), UiTracker.d()));
                        if (str2 != null) {
                            sb.append(DomExceptionUtils.SEPARATOR);
                            sb.append(str2);
                        }
                        ei90Var.c = sb.toString();
                        s3q0 s3q0Var = s3q0.a;
                        reentrantLock.unlock();
                        ksk0.b(new jw30(o6a0Var, 8));
                    } finally {
                    }
                } else {
                    if (!(m6a0Var instanceof m6a0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ei90 ei90Var2 = o6a0Var.b;
                    String str3 = ((m6a0.a) m6a0Var).a;
                    ei90Var2.e.lock();
                    try {
                        ei90Var2.d = str3;
                        paa0 paa0Var = ei90Var2.b;
                        if (paa0Var != null) {
                            ei90Var2.a.b(str3, paa0Var);
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                    } finally {
                    }
                }
                return s3q0.a;
            case 14:
                ((com.vk.photos.root.photoflow.presentation.b) this.c).h.b(new b9a0.f.d(((PhotoAlbumWrapper.CommonPhotoAlbum) this.d).e));
                return s3q0.a;
            case 15:
                String str4 = ((bxi.a.C2631a) this.c).b;
                AppCompatActivity appCompatActivity = (AppCompatActivity) this.d;
                d6q0.a.getClass();
                Iterator<ny1> it = d6q0.d.iterator();
                while (it.hasNext()) {
                    it.next().d();
                }
                if (epx.f(str4, "vpn_settings")) {
                    wp80.d(appCompatActivity);
                } else {
                    d6q0.a.getClass();
                    bxi bxiVar = d6q0.b;
                    if (bxiVar != null && (pni0Var = bxiVar.i) != null) {
                        pni0Var.invoke(appCompatActivity, str4);
                    }
                }
                return s3q0.a;
            case 16:
                ((izs) this.c).invoke(new o9t.m(x7t.a((w7t) this.d)));
                return s3q0.a;
            case 17:
                znj0 znj0Var = (znj0) this.c;
                h4x h4xVar = (h4x) this.d;
                int a = iah0.a(6);
                View view = znj0Var.h().c;
                int i3 = h4xVar.a + a;
                int i4 = h4xVar.c;
                f4m.l(i3, i4, view);
                View view2 = znj0Var.h().g;
                int i5 = h4xVar.a;
                f4m.l(a + i5, i4, view2);
                f4m.x(iah0.a(-3) + i5, znj0Var.h().b);
                return s3q0.a;
            case 18:
                ((slq0) this.c).a(new UserProfileAction.s.c.a.b(new a840((VkButton) this.d, 13)));
                return s3q0.a;
            case 19:
                ((izs) this.c).invoke(new VideoLargeListTabletView.c.a(((VideoLargeListTabletView.d) this.d).b));
                return s3q0.a;
            case 20:
                VkExpandableText.a aVar = (VkExpandableText.a) this.c;
                VkExpandableText vkExpandableText = (VkExpandableText) this.d;
                int i6 = VkExpandableText.S;
                aVar.getClass();
                vkExpandableText.q();
                gzs<s3q0> gzsVar = aVar.d;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 21:
                VkTopBarVh vkTopBarVh = (VkTopBarVh) this.c;
                String str5 = (String) this.d;
                vkTopBarVh.h(false);
                q3a q3aVar = vkTopBarVh.c;
                UIBlockList uIBlockList = vkTopBarVh.q;
                if (uIBlockList != null && (uIBlockActionClearSection = uIBlockList.E) != null) {
                    str = uIBlockActionClearSection.z;
                }
                q3aVar.b(new v1i0(str5, str), true);
                return s3q0.a;
            case 22:
                gvw0 gvw0Var = (gvw0) this.c;
                gzs gzsVar2 = (gzs) this.d;
                gvw0Var.i = false;
                gzsVar2.invoke();
                return s3q0.a;
            default:
                String str6 = (String) this.d;
                izs izsVar = (izs) this.c;
                if (str6 != null) {
                    izsVar.invoke(str6);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ wo1(String str, izs izsVar) {
        this.b = 23;
        this.d = str;
        this.c = izsVar;
    }
}
