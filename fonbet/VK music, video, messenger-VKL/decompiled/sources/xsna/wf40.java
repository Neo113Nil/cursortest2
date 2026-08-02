package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchInCommunityCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCuratorCatalogRootVh;
import com.vk.core.view.PhotoStackView;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.im.ui.views.ScrollToBottomView;
import com.vk.importcontacts.api.di.ImportContactsComponent;
import com.vk.musc.kidsmode.impl.di.MusicKidsModeComponentImpl;
import com.vk.music.subscription.api.di.MusicSubscriptionComponent;
import com.vk.mytarget.AdsSdkComponent;
import com.vk.mytarget.report.MyTargetReportFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.views.header.PostHeaderSubtitleTextView;
import com.vk.onboardingscreens.impl.di.OnboardingScreensComponentImpl;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.profile.core.scheduled_clips.bottom_sheet.options.CommunityScheduledClipsBottomSheetSideEffectOptions;
import com.vk.socialgraph.init.SocialGraphLoginFragmentNewContainer;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.video.music.dialog.api.domain.entity.PlaylistOnboardingButton;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.cqc0;
import xsna.gd60;
import xsna.h7u0;
import xsna.htd0;
import xsna.x6a0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wf40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wf40(com.vk.profile.core.scheduled_clips.a aVar, j0i j0iVar) {
        this.b = 22;
        this.c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ww50<?> ww50Var;
        LinkButton linkButton;
        int i = this.b;
        int i2 = 2;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((MusicCuratorCatalogRootVh) obj).u.d();
                return s3q0.a;
            case 1:
                qcy<Object>[] qcyVarArr = MusicKidsModeComponentImpl.f;
                return new com.vk.musc.kidsmode.impl.b(new ix4(), new es(), new mm40(), ((MusicKidsModeComponentImpl) obj).a.s());
            case 2:
                ViewGroup viewGroup = (ViewGroup) obj;
                int width = viewGroup.getWidth();
                Context context = viewGroup.getContext();
                HashSet hashSet = iah0.a;
                if (fnj.d(context)) {
                    width -= gjf0.a(viewGroup.getContext(), true) * 2;
                }
                return Integer.valueOf((int) (width * 0.58f));
            case 3:
                int i3 = MyTargetReportFragment.X;
                return (AdsSdkComponent) m7m.d((MyTargetReportFragment) obj).mo408a(fpf0.a(AdsSdkComponent.class));
            case 4:
                v4d0 v4d0Var = (v4d0) obj;
                if (v4d0Var != null && (ww50Var = v4d0Var.b) != null) {
                    ww50Var.S(v4d0Var.c);
                }
                return s3q0.a;
            case 5:
                OnboardingScreensComponentImpl onboardingScreensComponentImpl = (OnboardingScreensComponentImpl) obj;
                nwy nwyVar = onboardingScreensComponentImpl.d;
                qcy<Object>[] qcyVarArr2 = OnboardingScreensComponentImpl.h;
                qcy<Object> qcyVar = qcyVarArr2[2];
                czq0 czq0Var = (czq0) nwyVar.c();
                nwy nwyVar2 = onboardingScreensComponentImpl.c;
                qcy<Object> qcyVar2 = qcyVarArr2[1];
                return new zyq0(czq0Var, (azq0) nwyVar2.c(), onboardingScreensComponentImpl.a.s());
            case 6:
                return Boolean.valueOf(((tw90) obj).c.a(PerformanceEventType.CHANNEL_STUB_ATTACH_UPDATE));
            case 7:
                return ((x2a0) obj).y0;
            case 8:
                PhotoAlbumFragment photoAlbumFragment = (PhotoAlbumFragment) obj;
                int i4 = PhotoAlbumFragment.r0;
                FragmentActivity activity = photoAlbumFragment.getActivity();
                if (activity != null) {
                    h7u0.a aVar = new h7u0.a(activity);
                    aVar.g0(R.string.delete_album);
                    aVar.U(R.string.delete_album_confirm);
                    aVar.c0(R.string.yes, new f4h(photoAlbumFragment, i2));
                    aVar.W(R.string.no, null);
                    aVar.m();
                }
                return s3q0.a;
            case 9:
                x6a0 x6a0Var = ((x6a0.b) obj).a;
                x6a0Var.e0.K();
                x6a0Var.y0();
                return null;
            case 10:
                ((PhotoFlowFragment) obj).l0 = true;
                return s3q0.a;
            case 11:
                xbb0 xbb0Var = (xbb0) obj;
                xbb0Var.a.invoke(PlaylistOnboardingButton.ContinueWatching);
                dw20 dw20Var = xbb0Var.b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 12:
                return Integer.valueOf(PostHeaderSubtitleTextView.b((PostHeaderSubtitleTextView) obj));
            case 13:
                return ((NewsFeedComponent) ((k7m) m7m.f((gac0) obj)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 14:
                ((dcc0) obj).g();
                return s3q0.a;
            case 15:
                return ((NewsFeedComponent) ((k7m) m7m.f((pgc0) obj)).a(fpf0.a(NewsFeedComponent.class))).oc();
            case 16:
                enc0 enc0Var = (enc0) obj;
                ((ibc0) enc0Var.n0.getValue()).u().f();
                bwt0.p0(enc0Var.q, true);
                enc0Var.u.e(0, false);
                enc0Var.h(3);
                return s3q0.a;
            case 17:
                cqc0.c cVar = (cqc0.c) obj;
                View inflate = LayoutInflater.from(cVar.a).inflate(R.layout.view_posting_visibility_counter_stack_item, (ViewGroup) cVar.h, false);
                ((PhotoStackView) inflate.findViewById(R.id.posting_visibility_counter_stack_images)).setOverlapOffset(0.85f);
                return inflate;
            case 18:
                qcy<Object>[] qcyVarArr3 = ycd0.m1;
                Bundle requireArguments = ((ycd0) obj).requireArguments();
                ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? requireArguments.getParcelableArrayList("donut_levels", DonutLevel.class) : requireArguments.getParcelableArrayList("donut_levels");
                List O0 = parcelableArrayList != null ? j5g.O0(parcelableArrayList) : null;
                return O0 == null ? EmptyList.b : O0;
            case 19:
                ProductsSelectionBottomSheet productsSelectionBottomSheet = (ProductsSelectionBottomSheet) obj;
                int i5 = ProductsSelectionBottomSheet.u1;
                htd0.c cVar2 = htd0.c.b;
                productsSelectionBottomSheet.getClass();
                xn50.a.c(productsSelectionBottomSheet, cVar2);
                return s3q0.a;
            case 20:
                jdf0 jdf0Var = (jdf0) obj;
                GroupsSuggestions b7 = jdf0Var.b7();
                Action action = (b7 == null || (linkButton = b7.m) == null) ? null : linkButton.c;
                if (action != null) {
                    hd60.a().v(action, jdf0Var.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
                } else {
                    gd60 a = hd60.a();
                    Context context2 = jdf0Var.itemView.getContext();
                    String str = b7 != null ? b7.j : null;
                    UserId userId = jdf0Var.I;
                    gd60.a aVar2 = gd60.a;
                    a.c0(context2, userId, str);
                }
                return s3q0.a;
            case 21:
                int i6 = osf0.q1;
                return ((MultiAccountComponent) m7m.d((osf0) obj).a(fpf0.a(MultiAccountComponent.class))).q2();
            case 22:
                ((com.vk.profile.core.scheduled_clips.a) obj).a(CommunityScheduledClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER);
                return s3q0.a;
            case 23:
                ((gzs) ((zak0) ((xdg0) obj).d).getValue()).invoke();
                return s3q0.a;
            case 24:
                ogh0 ogh0Var = (ogh0) obj;
                ScrollToBottomView scrollToBottomView = (ScrollToBottomView) ogh0Var.a.getValue();
                scrollToBottomView.setIconDrawable(R.drawable.vk_icon_stars_outline_24);
                kkm kkmVar = ogh0Var.e;
                if (kkmVar != null) {
                    kkmVar.e(scrollToBottomView, new uhd(8));
                }
                return scrollToBottomView;
            case 25:
                return ((SearchInCommunityCatalogRootVh) obj).t;
            case 26:
                return ((com.vk.sharing.core.view.f) obj).findViewById(R.id.bottom_container_separator);
            case 27:
                ((jz70) obj).invoke();
                return s3q0.a;
            case 28:
                int i7 = SocialGraphLoginFragmentNewContainer.Q;
                return ((ImportContactsComponent) m7m.d((SocialGraphLoginFragmentNewContainer) obj).mo408a(fpf0.a(ImportContactsComponent.class))).a();
            default:
                return ((MusicSubscriptionComponent) ((k7m) m7m.c((jfl0) obj)).a(fpf0.a(MusicSubscriptionComponent.class))).q1();
        }
    }

    public /* synthetic */ wf40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
