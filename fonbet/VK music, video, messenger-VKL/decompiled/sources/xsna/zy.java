package xsna;

import android.app.Activity;
import android.view.ViewGroup;
import com.vk.api.generated.market.dto.MarketProfileInfoSimpleButtonDto;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.BiometricsLockOnboardingFragment;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.f;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.channels.impl.channel_screen.profile.ChannelProfileFragment;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.common.links.LaunchContext;
import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.music.offline.configs.impl.di.AudioRestrictionComponentImpl;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.profile.core.scheduled_clips.BaseCommunityScheduledClipsGridFragment;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.superapp.browser.internal.ui.shortcats.ShortcutPendingData;
import com.vkontakte.android.task.di.components.clips.ClipsEditorComponentVkApp;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.Call;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.TensorflowSegmentationType;
import xsna.c39;
import xsna.dzc.d;
import xsna.p16.d;
import xsna.q0e.a;
import xsna.va9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zy implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zy(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        TensorflowModel tensorflowModel;
        String url;
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                com.vk.superapp.browser.internal.ui.shortcats.a aVar = (com.vk.superapp.browser.internal.ui.shortcats.a) obj;
                Activity k = aVar.a.k();
                if (k != null) {
                    aVar.f(k, ShortcutPendingData.ShortcutSource.BRIDGE);
                }
                return s3q0.a;
            case 1:
                return com.vk.clips.sdk.shared.item.ads.c.v((com.vk.clips.sdk.shared.item.ads.c) obj);
            case 2:
                AllHighlightsFragment allHighlightsFragment = (AllHighlightsFragment) obj;
                int i3 = AllHighlightsFragment.g0;
                ((j6v) allHighlightsFragment.b0.getValue()).d(NarrativePublishEventType.CHANGE_LIST, (String) allHighlightsFragment.a0.getValue(), null);
                ((zt1) allHighlightsFragment.S).R1(true);
                return s3q0.a;
            case 3:
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
                sgo b = c12Var.b();
                float c = b.c(value2);
                if (c != floatValue && !Float.isNaN(c)) {
                    if (c < floatValue) {
                        Object b2 = b.b(floatValue, true);
                        if (b2 != null) {
                            return b2;
                        }
                    } else {
                        Object b3 = b.b(floatValue, false);
                        if (b3 != null) {
                            return b3;
                        }
                    }
                }
                return value2;
            case 4:
                ((bq3) obj).f.getCallback();
                return s3q0.a;
            case 5:
                return (LinksGeneratorComponent) ((k7m) m7m.f((s84) obj)).mo408a(fpf0.a(LinksGeneratorComponent.class));
            case 6:
                nwy nwyVar = ((AudioRestrictionComponentImpl) obj).b;
                qcy<Object> qcyVar = AudioRestrictionComponentImpl.c[1];
                return new qw4((sw4) nwyVar.c(), new rw4());
            case 7:
                return ((p16) obj).new d();
            case 8:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                int i4 = BaseCommunityScheduledClipsGridFragment.S;
                bkd bkdVar = (bkd) ref$ObjectRef.element;
                if (bkdVar != null) {
                    bkdVar.dismiss();
                }
                ref$ObjectRef.element = null;
                return s3q0.a;
            case 9:
                int i5 = BiometricsLockOnboardingFragment.T;
                return ((BiometricsLockComponent) ((k7m) m7m.f((BiometricsLockOnboardingFragment) obj)).a(fpf0.a(BiometricsLockComponent.class))).a();
            case 10:
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.settings.g) obj).f.b(f.d.a);
                return s3q0.a;
            case 11:
                lj8 lj8Var = (lj8) obj;
                p5h0 p5h0Var = new p5h0((ViewGroup) lj8Var.b);
                p5h0Var.c = new fs2(lj8Var, i2);
                return p5h0Var;
            case 12:
                return ((Call) obj).k();
            case 13:
                c39 c39Var = (c39) obj;
                if (((Boolean) c39Var.a.invoke()).booleanValue()) {
                    c39.a aVar2 = c39.f;
                    TensorflowSegmentationType b4 = c39Var.b.b();
                    aVar2.getClass();
                    int i6 = c39.a.C2638a.$EnumSwitchMapping$0[b4.ordinal()];
                    tensorflowModel = i6 != 1 ? i6 != 2 ? TensorflowModel.HUMAN_SEGMENTATION : TensorflowModel.HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH : TensorflowModel.HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH;
                } else {
                    tensorflowModel = TensorflowModel.HUMAN_SEGMENTATION;
                }
                return (TensorflowModel[]) jw5.y(tensorflowModel, ((Boolean) c39Var.c.get()).booleanValue() ? c39Var.d : new TensorflowModel[0]);
            case 14:
                ((va9.e) ((va9) obj).e.getValue()).e();
                return s3q0.a;
            case 15:
                CameraUIView cameraUIView = (CameraUIView) obj;
                float f = CameraUIView.w1;
                iz8 Q = cameraUIView.Q(false);
                cameraUIView.D(Q);
                cameraUIView.B.e = Q;
                cameraUIView.V0 = false;
                return s3q0.a;
            case 16:
                return CatalogRecyclerPaginatedView.x((CatalogRecyclerPaginatedView) obj);
            case 17:
                qcy<Object>[] qcyVarArr = CatalogSectionScreenFragment.T;
                return new xfa(((CatalogSectionScreenFragment) obj).fo().c());
            case 18:
                ChannelProfileFragment channelProfileFragment = (ChannelProfileFragment) obj;
                int i7 = ChannelProfileFragment.e0;
                return new lxa(((Number) channelProfileFragment.S.getValue()).longValue(), channelProfileFragment.Q);
            case 19:
                fgc fgcVar = (fgc) obj;
                dw20 dw20Var = fgcVar.a.c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                ggc ggcVar = fgcVar.b;
                MarketProfileInfoSimpleButtonDto g = ggcVar.b.g();
                if (g != null && (url = g.getUrl()) != null) {
                    maz.c(ggcVar.c, ggcVar.a, url, LaunchContext.A, null, null, 24);
                }
                return s3q0.a;
            case 20:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 21:
                return ((dzc) obj).new d();
            case 22:
                return ((q8d) obj).b.inflate();
            case 23:
                dz20 dz20Var = (dz20) obj;
                if (dz20Var != null) {
                    dz20Var.Ff(nad.u);
                }
                return s3q0.a;
            case 24:
                qcy<Object>[] qcyVarArr2 = ClipsEditorComponentVkApp.c;
                return ((ClipsConfigAuthorsComponent) obj).getExperiments();
            case 25:
                q0e q0eVar = (q0e) obj;
                return new twd(q0eVar.f, q0eVar.i, q0eVar.e, q0eVar.new a(), true, false);
            case 26:
                int i8 = ClipsGridCommonClipsListFragment.q0;
                return new pee(((BridgeComponent) ((ClipsGridCommonClipsListFragment) obj).g0.getValue()).F());
            case 27:
                sze szeVar = ((xze) obj).d;
                return new ztd(((DataRepositoryComponent) szeVar.d.getValue()).D(), ((ClipsUploadUiVkComponent) szeVar.e.getValue()).V0(), ((CameraClipsComponent) szeVar.c.getValue()).p9(), ((ClipsViewerComponent) szeVar.f.getValue()).pe());
            default:
                return ((ClipsUploadSdkUploaderComponent) ((k7m) m7m.f((mkf) obj)).a(fpf0.a(ClipsUploadSdkUploaderComponent.class))).k();
        }
    }

    public /* synthetic */ zy(bq3 bq3Var, String str) {
        this.b = 4;
        this.c = bq3Var;
    }
}
