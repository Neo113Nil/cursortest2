package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.auth.captcha.impl.SakCaptchaActivity;
import com.vk.catalog2.common.ui.mvp.clip.VideoCatalogSearchFragment;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistPlaceHolder;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.libvideo.api.di.VideoPlaybackSpeedComponent;
import com.vk.libvideo.api.di.VkVideoPromoComponent;
import com.vk.libvideo.screen.VideoActivity;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import com.vk.search.integration.api.di.SearchComponent;
import com.vk.search.ui.impl.catalog.SearchOwnerVideosCatalogFragment;
import com.vk.sharing.core.SharingActivity;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.superapp.ads.js.bridge.api.di.JsAdsDelegateComponent;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.VideoAlbumResultData;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.VoipViewBehaviour;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.onelog.uv.UVApiClient;
import ru.ok.android.onelog.uv.UVApiClientBuilder;
import xsna.ikv0;
import xsna.iqh0;
import xsna.nyd0.l;
import xsna.zzd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class myd0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ myd0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        UVApiClient build;
        Context context;
        Activity h;
        int i = this.b;
        ikv0.d.b bVar = null;
        Object[] objArr = 0;
        int i2 = 20;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((nyd0) obj).new l();
            case 1:
                ((i0e0) obj).b.invoke(zzd0.b.b);
                return s3q0.a;
            case 2:
                return (ClipsUploadVkComponent) ((k7m) m7m.f((abe0) obj)).a(fpf0.a(ClipsUploadVkComponent.class));
            case 3:
                List<VideoAlbumResultData> list = ((PublishState) obj).B;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((VideoAlbumResultData) it.next()).b));
                }
                return arrayList;
            case 4:
                return ((ViewGroup) obj).getContext().getDrawable(R.drawable.ic_online_mobile_vkapp_composite_16);
            case 5:
                Activity activity = (Activity) obj;
                cxf0.c.getClass();
                ikv0.a aVar = new ikv0.a(activity);
                aVar.u = new ikv0.d(new ikv0.d.c(activity.getString(R.string.video_removed_from_liked_message)), bVar, (ikv0.d.a) (objArr == true ? 1 : 0), 6);
                aVar.n();
                return s3q0.a;
            case 6:
                int i3 = SakCaptchaActivity.f;
                ((SakCaptchaActivity) obj).finish();
                return s3q0.a;
            case 7:
                xqy xqyVar = (xqy) j5g.k0(((dsy) obj).i().f());
                if (xqyVar != null && xqyVar.getIndex() >= r5.i().d() - 7) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                SearchOwnerVideosCatalogFragment searchOwnerVideosCatalogFragment = (SearchOwnerVideosCatalogFragment) obj;
                int i4 = SearchOwnerVideosCatalogFragment.T;
                return ((SearchComponent) ((k7m) m7m.f(searchOwnerVideosCatalogFragment)).mo408a(fpf0.a(SearchComponent.class))).V3().a(new iqh0.d(searchOwnerVideosCatalogFragment, searchOwnerVideosCatalogFragment.requireArguments().getLong("owner_id"), searchOwnerVideosCatalogFragment.requireContext().getString(R.string.search_owner_videos_hint)));
            case 9:
                ((zak0) ((u4i0) obj).f).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 10:
                Bundle bundle = SharingActivity.n0;
                ((SharingActivity) obj).finish();
                return s3q0.a;
            case 11:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                f11 f11Var = (f11) ref$ObjectRef.element;
                if (f11Var != null) {
                    dw20 dw20Var = f11Var.d;
                    if (dw20Var != null) {
                        dw20Var.dismiss();
                    }
                    f11Var.d = null;
                }
                ref$ObjectRef.element = null;
                return s3q0.a;
            case 12:
                return new k8g(((c3l0) obj).b, 16.0d);
            case 13:
                int i5 = StickersDatabase_Impl.B;
                return new gyb0((StickersDatabase_Impl) obj);
            case 14:
                int i6 = StoryArchiveFragment.h0;
                ((StoryArchiveFragment) obj).mo("archive_empty_button");
                return s3q0.a;
            case 15:
                return rl3.u0(((l0u0) obj).c.getFillPoints());
            case 16:
                zim0 zim0Var = (zim0) obj;
                zim0Var.i.postDelayed(new o4(zim0Var, i2), 0L);
                LottieAnimationView lottieAnimationView = zim0Var.l.b;
                lottieAnimationView.W();
                lottieAnimationView.o0();
                return s3q0.a;
            case 17:
                build = ((UVApiClientBuilder) obj).build();
                return build;
            case 18:
                File file = (File) obj;
                return "collectFileBatch: file for uploading " + file + ", length= " + cvk.q(file);
            case 19:
                int i7 = VideoActivity.I;
                return ((VideoPlaybackSpeedComponent) m7m.a((VideoActivity) obj).mo408a(fpf0.a(VideoPlaybackSpeedComponent.class))).m0();
            case 20:
                int i8 = VideoCatalogSearchFragment.X;
                return ((VkVideoPromoComponent) m7m.d((VideoCatalogSearchFragment) obj).a(fpf0.a(VkVideoPromoComponent.class))).d7();
            case 21:
                return sns0.e((sns0) obj);
            case 22:
                VideoPlaylistPlaceHolder videoPlaylistPlaceHolder = (VideoPlaylistPlaceHolder) obj;
                View view = videoPlaylistPlaceHolder.y;
                if (view != null && (context = view.getContext()) != null && (h = e3m.h(context)) != null) {
                    fxc0.B().g(h, videoPlaylistPlaceHolder.t, true);
                }
                return s3q0.a;
            case 23:
                int i9 = VideoProfileFragmentOld.p0;
                return ((UserProfileComponent) ((k7m) m7m.f((VideoProfileFragmentOld) obj)).mo408a(fpf0.a(UserProfileComponent.class))).Jc();
            case 24:
                return ((sqt0) obj).b;
            case 25:
                return Boolean.valueOf(((q9u0) obj).w);
            case 26:
                com.vk.superapp.browser.ui.a aVar2 = (com.vk.superapp.browser.ui.a) obj;
                return new jgu0(((JsAdsDelegateComponent) m7m.d(aVar2).a(fpf0.a(JsAdsDelegateComponent.class))).rf().a(new x9l0(aVar2, i2)));
            default:
                mjw0 mjw0Var = (mjw0) obj;
                VoipViewBehaviour voipViewBehaviour = mjw0Var.y;
                voipViewBehaviour.f.b = mjw0Var.x.f.b;
                voipViewBehaviour.i();
                mjw0.u(mjw0Var, mjw0Var.n0, false, false, 12);
                mjw0Var.u.c(false);
                return s3q0.a;
        }
    }
}
