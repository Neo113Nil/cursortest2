package xsna;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal;
import com.vk.catalog2.common.ui.mvp.clip.VideoCatalogSearchFragment;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.libvideo.api.di.VideoPromoComponent;
import com.vk.libvideo.api.di.VideoSubscriptionComponent;
import com.vk.libvideo.screen.VideoActivity;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.player.StandalonePlayerFragment;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.api.di.PostingSettingsComponent;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.posting.di.PostingComponent;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import com.vk.stories.design.view.sticker.TemplateButton;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.VideoAlbumResultData;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import xsna.c9p0;
import xsna.dmc0;
import xsna.dmc0.b;
import xsna.mbc0;
import xsna.nyd0.m;
import xsna.sx40;
import xsna.zzd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class lbc0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lbc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v83, types: [android.os.Parcelable] */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        Parcelable parcelable;
        Object parcelable2;
        ww50<?> Y;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new mbc0.g((mbc0) obj);
            case 1:
                return ((PostingComponent) ((k7m) m7m.f((ikc0) obj)).mo408a(fpf0.a(PostingComponent.class))).W9();
            case 2:
                return new tlc0(((dmc0) obj).new b(), new dmc0.c());
            case 3:
                return Boolean.valueOf(((b4d0) obj).N.h);
            case 4:
                cfd0 cfd0Var = (cfd0) obj;
                qcy<Object>[] qcyVarArr = cfd0.q1;
                ekc0 a = ((PostingSettingsComponent) m7m.d(cfd0Var).mo408a(fpf0.a(PostingSettingsComponent.class))).u0().a(R.string.open_post_for_all, cfd0Var.requireContext());
                a.c = new ux40(cfd0Var, 20);
                return a;
            case 5:
                return ((nyd0) obj).new m();
            case 6:
                ((i0e0) obj).b.invoke(zzd0.a.b);
                return s3q0.a;
            case 7:
                List<VideoAlbumResultData> list = ((PublishState) obj).A;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((VideoAlbumResultData) it.next()).b));
                }
                return arrayList;
            case 8:
                ModalAuthHostActivity modalAuthHostActivity = ((QrWithCodeAuthModal) obj).e;
                if (modalAuthHostActivity != null) {
                    return ((MultiAccountComponent) m7m.a(modalAuthHostActivity).a(fpf0.a(MultiAccountComponent.class))).a();
                }
                throw new IllegalStateException("QrWithCodeAuthModal is not shown");
            case 9:
                rt8 rt8Var = (rt8) ((p8v) obj).c;
                ReentrantLock reentrantLock = rt8Var.a;
                reentrantLock.lock();
                try {
                    byte[] l = rt8Var.b.l();
                    if (l == null) {
                        l = new byte[32768];
                    }
                    return l;
                } finally {
                    reentrantLock.unlock();
                }
            case 10:
                return ((ViewGroup) obj).getContext().getDrawable(R.drawable.ic_online_web_composite_16);
            case 11:
                int i2 = a5g0.k1;
                return (n6g0) ((androidx.lifecycle.e0) ((a5g0) obj).i1.getValue()).a(n6g0.class);
            case 12:
                return ((Object[]) obj).toString();
            case 13:
                ((zak0) ((u4i0) obj).e).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 14:
                return ((gpj0) ((e8j0) obj).u1.getValue()).getUid();
            case 15:
                return (PhotoAttachment) ((cvj0) obj).C;
            case 16:
                ((hmk0) obj).c.c(false);
                return s3q0.a;
            case 17:
                int i3 = StandalonePlayerFragment.a0;
                return ((AudioModelsComponent) m7m.d((StandalonePlayerFragment) obj).a(fpf0.a(AudioModelsComponent.class))).r();
            case 18:
                return new k8g(((c3l0) obj).b, 35.0d);
            case 19:
                int i4 = StickersDatabase_Impl.B;
                return new jaw0((StickersDatabase_Impl) obj);
            case 20:
                return (TextView) ((kdm0) obj).findViewById(R.id.tv_subtitle);
            case 21:
                zim0 zim0Var = (zim0) obj;
                ?? r0 = zim0Var.k;
                TemplateButton templateButton = zim0Var.l;
                wvw wvwVar = (wvw) r0.getValue();
                Hint p = wvwVar.b().p(HintId.STORIES_NEW_TEMPLATE_BUTTON.getId());
                if (p != null && (str = p.c) != null) {
                    templateButton.b.U(new yim0(zim0Var, str, wvwVar, p));
                }
                templateButton.animate().alpha(1.0f).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(333L).setInterpolator(new pkk(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)).withEndAction(new wd2(zim0Var, 9)).start();
                zim0Var.a.b();
                return s3q0.a;
            case 22:
                qcy<Object>[] qcyVarArr2 = SuggestedPostsFragment.r0;
                Bundle requireArguments = ((SuggestedPostsFragment) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("owner_id", UserId.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable3 = requireArguments.getParcelable("owner_id");
                    parcelable = (UserId) (parcelable3 instanceof UserId ? parcelable3 : null);
                }
                UserId userId = (UserId) parcelable;
                if (userId == null) {
                    userId = UserId.d;
                }
                return new w3n0(userId);
            case 23:
                c9p0.c cVar = (c9p0.c) obj;
                wh50 wh50Var = cVar.d;
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    ((izs) ((zak0) wh50Var).getValue()).invoke(new sx40.m0(((Boolean) ((zak0) cVar.b).getValue()).booleanValue(), PlayerContext.TOP));
                } else {
                    ((izs) ((zak0) wh50Var).getValue()).invoke(sx40.o.b);
                }
                return s3q0.a;
            case 24:
                return go9.b("Unknown error: ", ((Throwable) obj).getMessage());
            case 25:
                return ((VKEnhancedImageView) obj).u;
            case 26:
                Bundle bundle = (Bundle) obj;
                int i5 = VKSuperAppBrowserFragment.Y;
                c63 c63Var = c63.a;
                ComponentCallbacks2 b = c63.b();
                ey50 ey50Var = b instanceof ey50 ? (ey50) b : null;
                if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                    Y.K(bundle);
                }
                return s3q0.a;
            case 27:
                int i6 = VideoActivity.I;
                return ((VideoSubscriptionComponent) m7m.a((VideoActivity) obj).mo408a(fpf0.a(VideoSubscriptionComponent.class))).g0();
            case 28:
                int i7 = VideoCatalogSearchFragment.X;
                return ((VideoPromoComponent) m7m.d((VideoCatalogSearchFragment) obj).a(fpf0.a(VideoPromoComponent.class))).yf();
            default:
                rwo0 rwo0Var = ((VideoEditTimelineView) obj).F;
                if (rwo0Var != null) {
                    rwo0Var.z();
                }
                return s3q0.a;
        }
    }
}
