package xsna;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchInCommunityCatalogRootVh;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.friends.discover.UserDiscoverSmoothScroller;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.friends.discover.UsersDiscoverLayoutManager;
import com.vk.friends.discover.UsersDiscoverListView;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.im.ui.views.ScrollToBottomView;
import com.vk.media.pipeline.stat.ErrorStatBuilder;
import com.vk.music.fragment.api.di.MusicFragmentComponent;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.impl.presentation.base.view.PostingContentView;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.posting.di.PostingComponent;
import com.vk.superapp.core.api.models.SendOtpInfo;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.video.ui.albums.fragments.VideoAlbumFragment;
import com.vkontakte.android.R;
import java.util.concurrent.atomic.AtomicReference;
import xsna.b0u;
import xsna.cqc0;
import xsna.hds0;
import xsna.htd0;
import xsna.v6e0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class odc0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ odc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new tcc0(new gec0(), ((PostingContentView) obj2).g.k());
            case 1:
                int i2 = PostingFragment.L0;
                return ((NewsFeedComponent) ((k7m) m7m.f((PostingFragment) obj2)).a(fpf0.a(NewsFeedComponent.class))).G2();
            case 2:
                return ((PostingComponent) ((k7m) m7m.f((pgc0) obj2)).mo408a(fpf0.a(PostingComponent.class))).H6();
            case 3:
                ModalSettingsPrivacyOption modalSettingsPrivacyOption = new ModalSettingsPrivacyOption(((cqc0.c) obj2).a, null, 6);
                bwt0.p0(modalSettingsPrivacyOption, false);
                return modalSettingsPrivacyOption;
            case 4:
                ProductsSelectionBottomSheet productsSelectionBottomSheet = (ProductsSelectionBottomSheet) obj2;
                int i3 = ProductsSelectionBottomSheet.u1;
                htd0.c cVar = htd0.c.b;
                productsSelectionBottomSheet.getClass();
                xn50.a.c(productsSelectionBottomSheet, cVar);
                return s3q0.a;
            case 5:
                int i4 = ProfileMainPhotosFragment.F0;
                ((ProfileMainPhotosFragment) obj2).uo();
                return s3q0.a;
            case 6:
                return ((MusicPrefsComponent) ((k7m) m7m.f((b6e0) obj2)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 7:
                xne0 xne0Var = (xne0) obj2;
                return xne0Var.b.e(xne0Var.a.kn(), new qc00(8));
            case 8:
                m6f0 m6f0Var = (m6f0) obj2;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether((ValueAnimator) m6f0Var.w.getValue(), (ValueAnimator) m6f0Var.y.getValue());
                return animatorSet;
            case 9:
                int i5 = osf0.q1;
                return ((MultiAccountComponent) m7m.d((osf0) obj2).a(fpf0.a(MultiAccountComponent.class))).a();
            case 10:
                ((io.reactivex.rxjava3.disposables.c) obj2).dispose();
                return s3q0.a;
            case 11:
                mgh0 mgh0Var = (mgh0) obj2;
                ScrollToBottomView scrollToBottomView = (ScrollToBottomView) mgh0Var.a.getValue();
                scrollToBottomView.setIconDrawable(R.drawable.vk_icon_deprecated_vkim_mention_outline_28);
                kkm kkmVar = mgh0Var.e;
                if (kkmVar != null) {
                    kkmVar.e(scrollToBottomView, new bkh(9));
                }
                return scrollToBottomView;
            case 12:
                ((SearchInCommunityCatalogRootVh) obj2).E.getClass();
                return null;
            case 13:
                return (ViewGroup) ((com.vk.sharing.core.view.f) obj2).findViewById(R.id.bottom_controls_container);
            case 14:
                huj0 huj0Var = (huj0) obj2;
                huj0Var.b.removeView(huj0Var.h);
                return s3q0.a;
            case 15:
                ((vbr0) obj2).a();
                return s3q0.a;
            case 16:
                return ((MusicFragmentComponent) ((k7m) m7m.c((jfl0) obj2)).a(fpf0.a(MusicFragmentComponent.class))).tc();
            case 17:
                return ((jzl0) obj2).h;
            case 18:
                int i6 = hem0.y1;
                Bundle arguments = ((hem0) obj2).getArguments();
                return Boolean.valueOf(arguments != null ? arguments.getBoolean("IS_GROUP") : false);
            case 19:
                Bundle requireArguments = ((zkn0) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("arg_send_otp_info", SendOtpInfo.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("arg_send_otp_info");
                    obj = (SendOtpInfo) (parcelable2 instanceof SendOtpInfo ? parcelable2 : null);
                }
                SendOtpInfo sendOtpInfo = (SendOtpInfo) obj;
                return sendOtpInfo == null ? new SendOtpInfo(-1, -1, "") : sendOtpInfo;
            case 20:
                com.vk.photo.editor.features.markup.text.a aVar = (com.vk.photo.editor.features.markup.text.a) obj2;
                aVar.J();
                aVar.d.c(false);
                return s3q0.a;
            case 21:
                ToolbarRedesignVh toolbarRedesignVh = (ToolbarRedesignVh) obj2;
                if (toolbarRedesignVh.w) {
                    toolbarRedesignVh.a();
                } else {
                    toolbarRedesignVh.i.getClass();
                    if (!Boolean.FALSE.booleanValue()) {
                        toolbarRedesignVh.b.c(false);
                    }
                }
                return s3q0.a;
            case 22:
                return new fp5(((r6p0) obj2).a);
            case 23:
                com.vk.clips.design.view.component.video.preview.b bVar = (com.vk.clips.design.view.component.video.preview.b) obj2;
                f4m.j(bVar.b);
                f4m.j(bVar);
                bVar.setX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                bVar.f = false;
                bVar.g = false;
                return s3q0.a;
            case 24:
                vxq0 vxq0Var = (vxq0) obj2;
                return new ar60((tr60) vxq0Var.g.getValue(), (AtomicReference) vxq0Var.h.getValue(), vxq0Var.b, vxq0Var.f, new in60(vxq0Var, 29));
            case 25:
                UsersDiscoverListView usersDiscoverListView = ((UsersDiscoverFragment) obj2).U;
                if (usersDiscoverListView != null) {
                    RecyclerView.o layoutManager = usersDiscoverListView.getLayoutManager();
                    UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
                    if (usersDiscoverLayoutManager != null) {
                        UserDiscoverSmoothScroller userDiscoverSmoothScroller = new UserDiscoverSmoothScroller(UserDiscoverSmoothScroller.ScrollType.OnBoardingCancel, usersDiscoverLayoutManager);
                        userDiscoverSmoothScroller.setTargetPosition(usersDiscoverLayoutManager.f.f);
                        usersDiscoverLayoutManager.startSmoothScroll(userDiscoverSmoothScroller);
                    }
                }
                return s3q0.a;
            case 26:
                wjs0.a(new hwr0(((VideoAlbumFragment) obj2).e1));
                return s3q0.a;
            case 27:
                hds0 hds0Var = (hds0) obj2;
                csp cspVar = hds0Var.a;
                if (hds0Var.f == null) {
                    b0u a = b0u.a.a(cspVar.d);
                    hds0Var.f = a;
                    rfp0 rfp0Var = hds0Var.b;
                    ncl nclVar = rfp0Var.b;
                    v6e0.a aVar2 = rfp0Var.c;
                    MediaCodecInfo mediaCodecInfo = aVar2.a;
                    MediaFormat mediaFormat = aVar2.b;
                    zis0 d = nclVar.d(a, mediaFormat, mediaCodecInfo != null ? mediaCodecInfo.getName() : null, nclVar.d);
                    if (d == null && (d = nclVar.d(a, mediaFormat, null, true)) == null) {
                        throw new IllegalStateException("creating video encoder, fail but exception wasn't thrown");
                    }
                    hds0Var.i = d;
                    kfp0<zis0> kfp0Var = new kfp0<>(cspVar, d, "VideoTrackHandler");
                    hds0Var.h = kfp0Var;
                    kfp0Var.d = new hds0.a(hds0Var);
                    zis0 zis0Var = hds0Var.i;
                    hds0Var.g = new fkn0(cspVar, (zis0Var != null ? zis0Var : null).h, hds0Var.c);
                    String glGetString = GLES20.glGetString(7936);
                    String glGetString2 = GLES20.glGetString(7937);
                    String glGetString3 = GLES20.glGetString(7938);
                    ju4 ju4Var = hds0Var.d;
                    ejp0 ejp0Var = (ejp0) ju4Var.a;
                    ejp0Var.n = glGetString;
                    ejp0Var.o = glGetString2;
                    ejp0Var.p = glGetString3;
                    ErrorStatBuilder errorStatBuilder = (ErrorStatBuilder) ju4Var.b;
                    errorStatBuilder.o = glGetString;
                    errorStatBuilder.p = glGetString2;
                    errorStatBuilder.q = glGetString3;
                }
                return s3q0.a;
            case 28:
                return Boolean.valueOf(((g7s0) obj2).J().b());
            default:
                return ((ImReportersComponent) ((k7m) m7m.c((nts0) obj2)).a(fpf0.a(ImReportersComponent.class))).K().l();
        }
    }
}
