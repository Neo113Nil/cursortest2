package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.attachpicker.stat.data.PhotoParamsDatabase_Impl;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.core.tips.TipAnchorView;
import com.vk.ecomm.product_list.router.ProductListInternalParams;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.fave.di.FaveComponent;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.menu.di.MenuComponent;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsFragmentMvi;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.posting.di.PostingComponent;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.story.settings.api.di.StoriesSettingsComponent;
import com.vk.superapp.ui.SuperAppFragment;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.collections.EmptyList;
import xsna.a9i0;
import xsna.bcp0;
import xsna.fmc0;
import xsna.g7n0;
import xsna.tmd0;
import xsna.x9n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class b990 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b990(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v91, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        HttpClientProvider initialize$lambda$220$lambda$33;
        d3b0 d3b0Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((c990) obj).s6();
                return s3q0.a;
            case 1:
                return new com.vk.attachpicker.stat.data.c((PhotoParamsDatabase_Impl) obj);
            case 2:
                return ((ocb0) obj).c.Mc(EmptyList.b);
            case 3:
                int i2 = PodcastEpisodeFragment.u0;
                return ((MusicKidsModeComponent) m7m.d((PodcastEpisodeFragment) obj).a(fpf0.a(MusicKidsModeComponent.class))).T9();
            case 4:
                int i3 = PostingFragment.L0;
                return ((StoriesSettingsComponent) ((k7m) m7m.f((PostingFragment) obj)).a(fpf0.a(StoriesSettingsComponent.class))).B7();
            case 5:
                com.vk.newsfeed.impl.items.posting.item.modals.b bVar = (com.vk.newsfeed.impl.items.posting.item.modals.b) obj;
                bVar.b.x1(true, bVar.a.h);
                return s3q0.a;
            case 6:
                ((qkc0) obj).g.b(fmc0.j.n.a);
                return s3q0.a;
            case 7:
                int i4 = PostingSettingsFragmentMvi.Y;
                return ((PostingComponent) ((k7m) m7m.f((PostingSettingsFragmentMvi) obj)).mo408a(fpf0.a(PostingComponent.class))).H6().x();
            case 8:
                g3d0 g3d0Var = (g3d0) obj;
                int width = g3d0Var.D.getWidth();
                ViewGroup viewGroup = g3d0Var.D;
                Context context = viewGroup.getContext();
                HashSet hashSet = iah0.a;
                if (fnj.d(context)) {
                    width -= gjf0.a(viewGroup.getContext(), true) * 2;
                }
                return Integer.valueOf((int) (width * 0.58f));
            case 9:
                return ((FaveComponent) ((rkd0) obj).f.getValue()).S8();
            case 10:
                ((ml1) obj).invoke(tmd0.f.a);
                return s3q0.a;
            case 11:
                com.vk.ecomm.product_list.presentation.a aVar = (com.vk.ecomm.product_list.presentation.a) obj;
                Bundle requireArguments = aVar.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("product_list_params", ProductListInternalParams.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Object parcelable3 = requireArguments.getParcelable("product_list_params");
                    parcelable = (ProductListInternalParams) (parcelable3 instanceof ProductListInternalParams ? parcelable3 : null);
                }
                return new fqd0((ProductListInternalParams) parcelable, (y330) aVar.n1.getValue(), new rpd0(), (tpd0) aVar.m1.getValue());
            case 12:
                a9i0 a9i0Var = (a9i0) obj;
                a9i0.a aVar2 = a9i0.i1;
                vyt0 vyt0Var = new vyt0(a9i0Var.getViewModelStore(), new qyt0(j9i0.class, new c950(a9i0Var, 28)), a9i0Var.getDefaultViewModelCreationExtras());
                rfc a = fpf0.a(j9i0.class);
                String h = a.h();
                if (h != null) {
                    return (j9i0) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a);
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 13:
                initialize$lambda$220$lambda$33 = ServiceProvider.initialize$lambda$220$lambda$33((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$33;
            case 14:
                return ((StoryEditorExtDepsComponent) m7m.d((e8j0) obj).a(fpf0.a(StoryEditorExtDepsComponent.class))).Je();
            case 15:
                return ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_comment_redesign_send_button);
            case 16:
                return ((NewsFeedComponent) ((k7m) m7m.f((cvj0) obj)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 17:
                SuperAppFragment superAppFragment = (SuperAppFragment) obj;
                int i5 = SuperAppFragment.o0;
                if (!jjc.d().a()) {
                    g7n0.b d = superAppFragment.d0.d();
                    if (d != null) {
                        d.g();
                    }
                    v7n0 v7n0Var = (v7n0) superAppFragment.S;
                    if (v7n0Var != null) {
                        v7n0Var.I4();
                    }
                    Context vo = superAppFragment.vo();
                    x9n0.a aVar3 = new x9n0.a(vo, null);
                    View inflate = LayoutInflater.from(aVar3.c).inflate(R.layout.vk_super_app_menu_v3_dialog, (ViewGroup) null, false);
                    aVar3.D0(inflate, false);
                    aVar3.c(new jgj(inflate, 0, 0, 46));
                    aVar3.F0(true);
                    aVar3.R0(false);
                    aVar3.q0(false);
                    aVar3.E(true);
                    aVar3.x(0);
                    aVar3.u(0);
                    aVar3.l(e3m.f(R.attr.vk_ui_background_content, vo));
                    aVar3.S(e3m.f(R.attr.vk_ui_background_content, vo));
                    aVar3.I0("super_app:menu_v3");
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 18:
                qcy<Object>[] qcyVarArr = ovn0.m1;
                return ((MenuComponent) ((k7m) m7m.f((ovn0) obj)).a(fpf0.a(MenuComponent.class))).md();
            case 19:
                gzs<s3q0> gzsVar = ((gho0) obj).g;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 20:
                ((com.vk.im.ui.components.theme_chooser.c) obj).a.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.setOrientation(0);
                return linearLayoutManager;
            case 21:
                int i6 = TipAnchorView.m;
                ((TipAnchorView) obj).requestLayout();
                return s3q0.a;
            case 22:
                return ((ToolbarRedesignVh) obj).s;
            case 23:
                bcp0.a aVar4 = bcp0.w;
                return (VideoMinimizableState) ((io.reactivex.rxjava3.subjects.d) ((bcp0) obj).s.getValue()).P0();
            case 24:
                ((ww50) obj).j0();
                return s3q0.a;
            case 25:
                UserProfileHeaderView userProfileHeaderView = (UserProfileHeaderView) obj;
                if (userProfileHeaderView != null) {
                    return userProfileHeaderView;
                }
                throw new IllegalArgumentException("headerView must be set for the legacy (non-Lego) header");
            case 26:
                return ((vxq0) obj).q();
            case 27:
                return (AppCompatTextView) ((xwr0) obj).findViewById(R.id.video_complete_action);
            case 28:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) obj;
                if (videoAutoPlay.g1() && (d3b0Var = videoAutoPlay.p0) != null) {
                    d3b0Var.a();
                }
                if (videoAutoPlay.j0 != null && videoAutoPlay.p1()) {
                    videoAutoPlay.J1();
                    m7q m7qVar = videoAutoPlay.j0;
                    videoAutoPlay.j0 = m7qVar != null ? m7q.a(m7qVar, null, null, null, 0, false, false, videoAutoPlay.k0.r, 0L, null, null, false, 134086655) : null;
                }
                m7q m7qVar2 = videoAutoPlay.k0;
                videoAutoPlay.j0 = m7qVar2;
                sr10 sr10Var = dy2.a;
                return videoAutoPlay.w1(m7qVar2, false, epx.f(sr10Var != null ? sr10Var.g() : null, Boolean.TRUE), true);
            default:
                ((cd80) obj).getClass();
                return s3q0.a;
        }
    }
}
