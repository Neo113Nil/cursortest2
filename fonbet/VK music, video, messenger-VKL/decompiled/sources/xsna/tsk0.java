package xsna;

import android.os.HandlerThread;
import com.vk.articleeditor.api.di.ArticleComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.editor.stories.impl.di.StoryEditorComponentImpl;
import com.vk.cast.api.di.CastComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.video.VideoAlbum;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.libvideo.api.di.VideoPromoComponent;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.design.view.video.VideoView.e;
import com.vk.libvideo.screen.VideoActivity;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.f;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.translate.impl.models.SupportedTranslateLanguage;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;
import xsna.bgp0;
import xsna.c9p0;
import xsna.sx40;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class tsk0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tsk0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new tte0((u750) obj);
            case 1:
                ((nxk0) obj).b.b(b0n0.a);
                return s3q0.a;
            case 2:
                ((s7l0) obj).g = null;
                return s3q0.a;
            case 3:
                int i2 = StickersDatabase_Impl.B;
                return new v9f0((StickersDatabase_Impl) obj);
            case 4:
                int i3 = StoryArchiveFragment.h0;
                return ((StoryViewerComponent) ((k7m) m7m.f((StoryArchiveFragment) obj)).a(fpf0.a(StoryViewerComponent.class))).tb();
            case 5:
                qcy<Object>[] qcyVarArr = StoryEditorComponentImpl.h;
                return ((StoryEditorExtDepsComponent) obj).k7();
            case 6:
                ((com.vk.storycamera.picker.feature.a) obj).h.c(0);
                return s3q0.a;
            case 7:
                hw3 hw3Var = (hw3) obj;
                Set<fjn0> set = (Set) vdg0.b(((a1w) hw3Var.a).n(hw3Var, new ejn0()), new d4r(24));
                if (set == null) {
                    return EmptySet.b;
                }
                HashSet hashSet = new HashSet();
                for (fjn0 fjn0Var : set) {
                    String language = fjn0Var.a.getLanguage();
                    Locale locale = fjn0Var.a;
                    List<Locale> list = fjn0Var.b;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Locale) it.next()).getLanguage());
                    }
                    hashSet.add(new SupportedTranslateLanguage(language, locale, arrayList));
                }
                return hashSet;
            case 8:
                ((zak0) ((e6p0) obj).g).setValue(Boolean.valueOf(!r5.r()));
                return s3q0.a;
            case 9:
                ((izs) ((zak0) ((c9p0.d) obj).b).getValue()).invoke(sx40.g.b);
                return s3q0.a;
            case 10:
                ((xfp0) obj).T(new bgp0.b());
                return s3q0.a;
            case 11:
                return new io.reactivex.rxjava3.internal.operators.observable.i0((io.reactivex.rxjava3.internal.operators.observable.i0) obj, new t9c0(4, new t3v(20))).U(new fhb0(new irt(23), 11)).k0();
            case 12:
                return ((HandlerThread) ((pdq0) obj).j.getValue()).getLooper();
            case 13:
                return new f.e.AbstractC1725f.a(((f.b.a) ((f.b) obj)).a);
            case 14:
                int i4 = UserProfileHeaderView.G;
                ((slq0) obj).a(UserProfileAction.m.g.b);
                return s3q0.a;
            case 15:
                dwq0 dwq0Var = dwq0.r;
                jvq0 jvq0Var = ((fxq0) obj).k;
                UserId userId = jvq0Var.a;
                WallGetMode wallGetMode = jvq0Var.c;
                return dwq0.a(dwq0Var, userId, wallGetMode == null ? jvq0Var.b : wallGetMode, wallGetMode, 0, 0, 0, Boolean.valueOf(jvq0Var.i), jvq0Var.j, jvq0Var.h, null, jvq0Var.d, jvq0Var.e, jvq0Var.f, false, null, 50296);
            case 16:
                ((tdr0) obj).d.z(null);
                return s3q0.a;
            case 17:
                Regex regex = hgr0.X;
                return ((ArticleComponent) m7m.d((hgr0) obj).mo408a(fpf0.a(ArticleComponent.class))).O7();
            case 18:
                return (VkSimpleButton) ((lor0) obj).a.findViewById(R.id.nativeads_call_to_action);
            case 19:
                int i5 = VideoActivity.I;
                return (ClipsViewerComponent) m7m.a((VideoActivity) obj).a(fpf0.a(ClipsViewerComponent.class));
            case 20:
                wjs0.a(new hwr0((VideoAlbum) obj));
                return s3q0.a;
            case 21:
                int i6 = VideoInteractiveFullscreenFragment.Q0;
                return ((VideoPromoComponent) m7m.d((VideoInteractiveFullscreenFragment) obj).a(fpf0.a(VideoPromoComponent.class))).L();
            case 22:
                int i7 = VideoMinimizableDiscoveryFragment.p1;
                return ((CastComponent) ((VideoMinimizableDiscoveryFragment) obj).ko().e.getValue()).Q4();
            case 23:
                return (VideoPromoComponent) ((f8m) obj).a(fpf0.a(VideoPromoComponent.class));
            case 24:
                int i8 = VideoProfileFragmentOld.p0;
                xn50.a.c((VideoProfileFragmentOld) obj, a.r.b);
                return s3q0.a;
            case 25:
                return (BridgeComponent) m7m.d((ect0) obj).a(fpf0.a(BridgeComponent.class));
            case 26:
                qcy<Object>[] qcyVarArr2 = VideoView.T0;
                return ((VideoView) obj).new e();
            case 27:
                return (DonutVideoComponent) ((k7m) m7m.c((sqt0) obj)).a(fpf0.a(DonutVideoComponent.class));
            case 28:
                return ((com.vk.superapp.browser.ui.a) obj).vn().j0();
            default:
                ((ggu0) obj).d.n(JsApiMethodType.FLASH_SET_LEVEL, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true));
                return s3q0.a;
        }
    }
}
