package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.about.AboutAppFragment;
import com.vk.articles.ArticleFragment;
import com.vk.avatarpicker.AvatarPickerActivity;
import com.vk.clips.design.view.author.a;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.ecomm.reviews.ui.reviewbody.ReviewBodyView;
import com.vk.feed.design.view.newsfeed.digest.header.FeedDigestHeader;
import com.vk.log.L;
import com.vk.newsfeed.impl.fragments.VideoCommentThreadFragment;
import com.vk.photo.editor.markup.view.tools.BrushesPanel;
import com.vk.socialgraph.init.PickAvatarFragment;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vk.toggle.Features;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.WebViewFragment;
import one.video.controls.views.VideoShortActions;
import xsna.bhg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class k1 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gzs<Boolean> gzsVar;
        switch (this.b) {
            case 0:
                AboutAppFragment aboutAppFragment = (AboutAppFragment) this.c;
                int i = AboutAppFragment.U;
                Object tag = view.getTag();
                if (epx.f(tag, 0)) {
                    String a = com.vk.toggle.b.A.a(Features.Type.FEATURE_APP_ABOUT_MOBILEHELP) ? "vk.cc/mobilehelpabout" : i5s.a(new StringBuilder("https://"), a0a.d, "/android_app");
                    Context mo2getContext = aboutAppFragment.mo2getContext();
                    if (mo2getContext != null) {
                        xwk.d().e().a(mo2getContext, a);
                        return;
                    }
                    return;
                }
                if (epx.f(tag, 1)) {
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=" + aboutAppFragment.kn().getPackageName()));
                    intent.addFlags(1074266112);
                    FragmentActivity kn = aboutAppFragment.kn();
                    try {
                        kn.startActivity(intent);
                        return;
                    } catch (Throwable th) {
                        L.i(th);
                        try {
                            kn.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("http://play.google.com/store/apps/details?id=" + aboutAppFragment.kn().getPackageName())));
                            return;
                        } catch (Throwable th2) {
                            L.i(th2);
                            return;
                        }
                    }
                }
                if (epx.f(tag, 2)) {
                    WebViewFragment.c cVar = new WebViewFragment.c(i5s.a(new StringBuilder("https://m."), a0a.d, "/privacy"));
                    cVar.z();
                    cVar.D();
                    cVar.F(false, false);
                    cVar.C();
                    cVar.A();
                    cVar.k(aboutAppFragment.getActivity());
                    return;
                }
                if (epx.f(tag, 3)) {
                    WebViewFragment.c cVar2 = new WebViewFragment.c(i5s.a(new StringBuilder("https://m."), a0a.d, "/terms"));
                    cVar2.z();
                    cVar2.D();
                    cVar2.F(false, false);
                    cVar2.C();
                    cVar2.A();
                    cVar2.k(aboutAppFragment.getActivity());
                    return;
                }
                if (epx.f(tag, 4)) {
                    WebViewFragment.c cVar3 = new WebViewFragment.c("file:///android_asset/license.html");
                    cVar3.H(aboutAppFragment.getString(R.string.about_app_license));
                    cVar3.k(aboutAppFragment.getActivity());
                    return;
                }
                if (epx.f(tag, 5)) {
                    WebViewFragment.c cVar4 = new WebViewFragment.c(i5s.a(new StringBuilder("https://m."), a0a.d, "/privacy/cookies"));
                    cVar4.D();
                    cVar4.F(false, false);
                    cVar4.z();
                    cVar4.A();
                    cVar4.k(aboutAppFragment.getActivity());
                    return;
                }
                if (epx.f(tag, 6)) {
                    WebViewFragment.c cVar5 = new WebViewFragment.c(i5s.a(new StringBuilder("https://m."), a0a.d, "/data_protection"));
                    cVar5.D();
                    cVar5.F(false, false);
                    cVar5.A();
                    cVar5.C();
                    cVar5.k(aboutAppFragment.getActivity());
                    return;
                }
                return;
            case 1:
                ((cb) ((uw0) this.c).c.a).invoke();
                return;
            case 2:
                ((b11) this.c).b.a(yz0.b);
                return;
            case 3:
                ArticleFragment articleFragment = (ArticleFragment) this.c;
                int i2 = ArticleFragment.E0;
                com.vk.articles.a aVar = articleFragment.m0;
                if (aVar != null) {
                    aVar.clearFocus();
                }
                articleFragment.finish();
                return;
            case 4:
                wa6 wa6Var = (wa6) this.c;
                otu0 un = wa6Var.un();
                Context requireContext = wa6Var.requireContext();
                SchemeStatSak$EventScreen u5 = wa6Var.u5();
                un.getClass();
                otu0.b(requireContext, u5);
                return;
            case 5:
                BrushesPanel brushesPanel = (BrushesPanel) this.c;
                int i3 = BrushesPanel.j;
                brushesPanel.b(BrushesPanel.BrushType.Pen);
                return;
            case 6:
                ((a.d.b) ((a.d) this.c)).getClass();
                throw null;
            case 7:
                ((com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b) this.c).h.e().f(false);
                return;
            case 8:
                FeedDigestHeader.a aVar2 = (FeedDigestHeader.a) this.c;
                int i4 = FeedDigestHeader.n;
                ((FeedDigestHeader.a.C1045a) aVar2).b.invoke();
                return;
            case 9:
                MasksWrap masksWrap = (MasksWrap) this.c;
                int i5 = MasksWrap.e0;
                yg10 yg10Var = masksWrap.d;
                if (yg10Var != null) {
                    yg10Var.a(masksWrap.getSelectedMask());
                }
                am9 am9Var = masksWrap.h;
                if (am9Var != null) {
                    am9Var.c(StoryPublishEvent.CANCEL_MASK_LOADING, null);
                }
                int i6 = MasksWrap.e0;
                masksWrap.I(false);
                s3q0 s3q0Var = s3q0.a;
                return;
            case 10:
                PickAvatarFragment pickAvatarFragment = (PickAvatarFragment) this.c;
                int i7 = PickAvatarFragment.P;
                int i8 = AvatarPickerActivity.g;
                pickAvatarFragment.startActivityForResult(AvatarPickerActivity.a.a(pickAvatarFragment.requireContext(), "avatar_social"), 13);
                return;
            case 11:
                b7d0.X6((b7d0) this.c);
                return;
            case 12:
                eig0 eig0Var = (eig0) this.c;
                int i9 = ReviewBodyView.i;
                eig0Var.a(bhg0.f.a);
                return;
            case 13:
                ((u1o0) this.c).a();
                return;
            case 14:
                r5q0 r5q0Var = (r5q0) this.c;
                int i10 = r5q0.f1;
                r5q0Var.hide();
                return;
            case 15:
                k0r0 k0r0Var = (k0r0) this.c;
                qhg0 qhg0Var = k0r0Var.m;
                UserItem userItem = k0r0Var.q;
                qhg0Var.invoke(userItem != null ? userItem : null);
                return;
            case 16:
                VideoCommentThreadFragment videoCommentThreadFragment = (VideoCommentThreadFragment) this.c;
                int i11 = VideoCommentThreadFragment.B0;
                u3g0 u3g0Var = videoCommentThreadFragment.X;
                if (u3g0Var == null || (gzsVar = u3g0Var.d) == null || !gzsVar.invoke().booleanValue()) {
                    videoCommentThreadFragment.Ic(false);
                    return;
                }
                return;
            default:
                VideoShortActions.a aVar3 = ((VideoShortActions) this.c).t;
                if (aVar3 != null) {
                    aVar3.l();
                    return;
                }
                return;
        }
    }
}
