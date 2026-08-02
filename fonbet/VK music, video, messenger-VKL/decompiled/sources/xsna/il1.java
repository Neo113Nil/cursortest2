package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.animation.PathInterpolator;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.channels.impl.channel_screen.profile.ChannelProfileFragment;
import com.vk.channels.impl.donut.ChannelDonutSupportFragment;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.clips.design.view.templates.ClipsTemplateEditorCropperView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.picker.a;
import com.vk.clips.upload.vk.api.navigation.preview.ClipPreviewInputParams;
import com.vk.clips.upload.vk.impl.preview.ClipsPublishViewerOverlayFragment;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.core.view.ColorProgressBar;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.profile.core.content.albums.AlbumView;
import com.vkontakte.android.R;
import java.util.Collections;
import xsna.dzc;
import xsna.qvq;
import xsna.va9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class il1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ il1(AlbumView albumView, PhotoAlbum photoAlbum) {
        this.b = 0;
        this.c = photoAlbum;
    }

    /* JADX WARN: Type inference failed for: r1v105, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Image image;
        io.reactivex.rxjava3.disposables.c cVar;
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = AlbumView.F;
                ImageSize imageSize = (ImageSize) j5g.a0(((PhotoAlbum) obj).u.b);
                if (imageSize == null || (image = imageSize.d) == null) {
                    return null;
                }
                return image.d;
            case 1:
                int i3 = AllHighlightsFragment.g0;
                ((zt1) ((AllHighlightsFragment) obj).S).X();
                return s3q0.a;
            case 2:
                c12 c12Var = (c12) obj;
                wh50 wh50Var = c12Var.j;
                wh50 wh50Var2 = c12Var.f;
                Object value = ((zak0) wh50Var).getValue();
                if (value != null) {
                    return value;
                }
                float floatValue = ((vak0) c12Var.h).getFloatValue();
                if (Float.isNaN(floatValue)) {
                    return ((zak0) wh50Var2).getValue();
                }
                Object value2 = ((zak0) wh50Var2).getValue();
                vfk vfkVar = c12Var.a;
                sgo b = c12Var.b();
                float c = b.c(value2);
                float floatValue2 = ((Number) c12Var.b.invoke()).floatValue();
                if (c != floatValue && !Float.isNaN(c)) {
                    if (c < floatValue) {
                        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT >= floatValue2) {
                            return b.b(floatValue, true);
                        }
                        Object b2 = b.b(floatValue, true);
                        if (floatValue >= Math.abs(Math.abs(((Number) vfkVar.invoke(Float.valueOf(Math.abs(b.c(b2) - c)))).floatValue()) + c)) {
                            return b2;
                        }
                    } else {
                        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= (-floatValue2)) {
                            return b.b(floatValue, false);
                        }
                        Object b3 = b.b(floatValue, false);
                        float abs = Math.abs(c - Math.abs(((Number) vfkVar.invoke(Float.valueOf(Math.abs(c - b.c(b3))))).floatValue()));
                        if (floatValue >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? floatValue <= abs : Math.abs(floatValue) >= abs) {
                            return b3;
                        }
                    }
                }
                return value2;
            case 3:
                DevicePerformanceInfo devicePerformanceInfo = ((on2) obj).a;
                if (devicePerformanceInfo != null) {
                    DevicePerformanceInfo.Class r2 = devicePerformanceInfo.e;
                    DevicePerformanceInfo.Class r5 = DevicePerformanceInfo.Class.LOW;
                    if (r2 == r5 || devicePerformanceInfo.a == r5) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                return (ColorProgressBar) ((aw3) obj).b.findViewById(R.id.progress_icon);
            case 5:
                return Float.valueOf(((g07) obj).a.I0(f17.b));
            case 6:
                return ((StoryEditorComponent) ((k7m) m7m.c((u48) obj)).a(fpf0.a(StoryEditorComponent.class))).H8();
            case 7:
                ((va9.e) ((va9) obj).e.getValue()).g();
                return s3q0.a;
            case 8:
                CameraUIView cameraUIView = (CameraUIView) obj;
                cameraUIView.J0(cameraUIView.z0);
                return s3q0.a;
            case 9:
                int i4 = ChannelDonutSupportFragment.V;
                ((ChannelDonutSupportFragment) obj).finish();
                return s3q0.a;
            case 10:
                int i5 = ChannelProfileFragment.e0;
                return ((ChannelProfileFragment) obj).requireContext();
            case 11:
                smb smbVar = (smb) obj;
                smbVar.f.k().y(smbVar.b, smbVar.g);
                return s3q0.a;
            case 12:
                return new bzb0(((com.vk.im.ui.components.chat_profile.a) obj).b);
            case 13:
                tsu tsuVar = ((azb) obj).k;
                if (tsuVar != null && (cVar = ((xyb) tsuVar.b).u) != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 14:
                int i6 = ClipFeedListFragment.a2;
                return ((ClipsViewersSdkComponentImpl) ((ClipFeedListFragment) obj).V.getValue()).q0();
            case 15:
                return new dzc.c((dzc) obj);
            case 16:
                Activity h = e3m.h(((axd) obj).a.a);
                if (h != null) {
                    com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a("STORY_EDITOR", "clips_editor");
                    aVar.r = StoryCameraTarget.CLIP_FRAGMENT;
                    StoryCameraMode storyCameraMode = StoryCameraMode.CLIPS;
                    aVar.f = storyCameraMode;
                    aVar.g = Collections.singletonList(storyCameraMode);
                    aVar.y0 = false;
                    aVar.D(xa4.L(h), 981, null);
                }
                return s3q0.a;
            case 17:
                bzd bzdVar = (bzd) obj;
                return new owd(bzdVar.n, bzdVar.p);
            case 18:
                q0e q0eVar = (q0e) obj;
                s0e s0eVar = q0eVar.l;
                return new dms0(s0eVar == null ? null : s0eVar, q0eVar.d, q0eVar.c, q0eVar.e, q0eVar.b, q0eVar.f, q0eVar.h, q0eVar.g, q0eVar.k);
            case 19:
                int i7 = ClipsFavoriteFolderContentListFragment.W;
                return new v2e(new ClipsFavoriteFolderContentListFragment.d(1, (ClipsFavoriteFolderContentListFragment) obj, ClipsFavoriteFolderContentListFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
            case 20:
                ((p4e) obj).b.invoke(a.f.C0606f.b);
                return s3q0.a;
            case 21:
                ((u6e) obj).C(qvq.w.b);
                return s3q0.a;
            case 22:
                afe afeVar = (afe) obj;
                return Integer.valueOf(afeVar.d.getHeight() + afeVar.p.getHeight() + afeVar.m);
            case 23:
                final eje ejeVar = (eje) obj;
                final ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.dje
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (ofFloat.isRunning()) {
                            eje ejeVar2 = ejeVar;
                            if (ejeVar2.c == null) {
                                return;
                            }
                            long currentPlayTime = valueAnimator.getCurrentPlayTime();
                            if (!ejeVar2.d && currentPlayTime >= 167) {
                                ejeVar2.d = true;
                                ejeVar2.b.invoke();
                            }
                            Float f = (Float) valueAnimator.getAnimatedValue();
                            f.getClass();
                            ejeVar2.a.invoke(f);
                        }
                    }
                });
                return ofFloat;
            case 24:
                Bundle a = ((roe) obj).a();
                return Boolean.valueOf(a != null ? a.getBoolean("ClipsOwnerSwipeFragment.lazy_owner_grid", true) : true);
            case 25:
                qcy<Object>[] qcyVarArr = ClipsPublishViewerOverlayFragment.T;
                Bundle requireArguments = ((ClipsPublishViewerOverlayFragment) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("input_params", ClipPreviewInputParams.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = requireArguments.getParcelable("input_params");
                    parcelable = (ClipPreviewInputParams) (parcelable3 instanceof ClipPreviewInputParams ? parcelable3 : null);
                }
                if (parcelable != null) {
                    return (ClipPreviewInputParams) parcelable;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 26:
                int i8 = ClipsTemplateEditorCropperView.z;
                return (ViewPager2) ((ClipsTemplateEditorCropperView) obj).findViewById(R.id.clips_template_editor_cropper_view_pager);
            case 27:
                return ((ClipsBlacklistsComponent) ((i8f) obj).h.e.getValue()).f4();
            case 28:
                gzs gzsVar = (gzs) ((zak0) ((naf) obj).i1).getValue();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            default:
                ClipsWrapperInputArguments.a aVar2 = ClipsWrapperInputArguments.r;
                Bundle a2 = ((ClipsWrapperInputArguments) obj).a();
                aVar2.getClass();
                return ClipsWrapperInputArguments.a.c(a2);
        }
    }

    public /* synthetic */ il1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
