package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.music.player.api.di.EqualizerControllerComponent;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.story.viewer.api.models.Action;
import com.vk.story.viewer.api.models.AttachType;
import com.vk.superapp.multiaccount.api.RelatedProfileComponent;
import com.vk.superapp.multiaccount.impl.ui.relateduser.RelatedUserStackView;
import com.vkontakte.android.R;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.serialization.KSerializer;
import okhttp3.n;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import one.video.ad.ux.controls.OneVideoAdControlsViewNew;
import ru.ok.android.commons.util.Optional;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import xsna.bcp0;
import xsna.dt1;
import xsna.e3m;
import xsna.wqh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bi80 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bi80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        KSerializer<?>[] typeParametersSerializers;
        TriggerInitializeListener initialize$lambda$220$lambda$133;
        Optional empty;
        int i = this.b;
        ArrayList arrayList = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                dt1.a.getClass();
                ((wh50) obj).setValue(dt1.a.p);
                return s3q0.a;
            case 1:
                int i2 = OneVideoAdControlsViewNew.E;
                OneVideoAdBaseControls.a listener = ((OneVideoAdControlsViewNew) obj).getListener();
                if (listener != null) {
                    listener.e();
                }
                return s3q0.a;
            case 2:
                qcy<Object>[] qcyVarArr = OrderFragment.Y;
                return ((BridgeComponent) ((OrderFragment) obj).S.getValue()).p().a();
            case 3:
                return PhotoEditorView.d((PhotoEditorView) obj);
            case 4:
                qcy<Object>[] qcyVarArr2 = d1b0.l1;
                return ((EqualizerControllerComponent) m7m.d((d1b0) obj).a(fpf0.a(EqualizerControllerComponent.class))).F9();
            case 5:
                vht<?> vhtVar = ((xfb0) obj).b;
                if (vhtVar != null && (typeParametersSerializers = vhtVar.typeParametersSerializers()) != null) {
                    arrayList = new ArrayList(typeParametersSerializers.length);
                    for (KSerializer<?> kSerializer : typeParametersSerializers) {
                        arrayList.add(kSerializer.getDescriptor());
                    }
                }
                return fvr.k(arrayList);
            case 6:
                return Boolean.valueOf(((com.vk.newsfeed.impl.items.posting.item.modals.b) obj).a.c);
            case 7:
                qcy<Object>[] qcyVarArr3 = PostsFromNotificationsFragment.p0;
                return ((PostsFromNotificationsFragment) obj).eo();
            case 8:
                return ((StorefrontServicesComponent) ((rkd0) obj).k.getValue()).a();
            case 9:
                okhttp3.t tVar = ((f3e0) obj).c;
                if (tVar instanceof okhttp3.n) {
                    List<n.c> list = ((okhttp3.n) tVar).d;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (((n.c) it.next()).b.isDuplex()) {
                            }
                        }
                    }
                    r2 = false;
                } else {
                    r2 = tVar.isDuplex();
                }
                return Boolean.valueOf(r2);
            case 10:
                int i3 = QuestionsListFragment.f0;
                return ((BridgeComponent) m7m.d((QuestionsListFragment) obj).a(fpf0.a(BridgeComponent.class))).F();
            case 11:
                RelatedUserStackView.a aVar = RelatedUserStackView.m;
                return ((RelatedProfileComponent) ((k7m) m7m.c((RelatedUserStackView) obj)).a(fpf0.a(RelatedProfileComponent.class))).db();
            case 12:
                ClassLoader classLoader = (ClassLoader) ((iid) obj).b;
                Method declaredMethod = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", null);
                return Boolean.valueOf(declaredMethod.getReturnType().equals(classLoader.loadClass("androidx.window.extensions.WindowExtensions")) && Modifier.isPublic(declaredMethod.getModifiers()));
            case 13:
                return ((xvy) obj).j().f();
            case 14:
                ((orh0) obj).d.C(wqh0.r.b);
                return s3q0.a;
            case 15:
                Context context = ((a3i0) obj).a.getContext();
                e3m.a aVar2 = e3m.a;
                return m33.a(R.drawable.vk_icon_error_circle_24, context);
            case 16:
                ((bei0) obj).i();
                return s3q0.a;
            case 17:
                initialize$lambda$220$lambda$133 = ServiceProvider.initialize$lambda$220$lambda$133((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$133;
            case 18:
                return ((StoryEditorComponent) m7m.d((e8j0) obj).a(fpf0.a(StoryEditorComponent.class))).ff();
            case 19:
                return ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_send_redesign_container);
            case 20:
                dsj0 dsj0Var = (dsj0) obj;
                ConversationParams conversationParams = dsj0Var.k;
                if (conversationParams == null && !dsj0Var.e) {
                    OkApiServiceInternal okApiServiceInternal = dsj0Var.i;
                    boolean z = dsj0Var.d;
                    return okApiServiceInternal.getConversationParams(null, !z, z ? dsj0Var.j.getConversationId() : null).l(wwf0.d);
                }
                if (conversationParams == null || (empty = Optional.of(conversationParams)) == null) {
                    empty = Optional.empty();
                }
                return io.reactivex.rxjava3.core.x.k(empty);
            case 21:
                cvj0 cvj0Var = (cvj0) obj;
                h2r h2rVar = new h2r(cvj0Var.Q, new lbc0(cvj0Var, 15));
                h2rVar.d = cvj0Var;
                return h2rVar;
            case 22:
                return Boolean.valueOf(((StickersView) obj).D.a());
            case 23:
                return new gql0(((StoryEditorExtDepsComponent) ((k7m) m7m.c(((com.vk.camera.editor.stories.impl.background.b) obj).b.getView())).a(fpf0.a(StoryEditorExtDepsComponent.class))).Cb());
            case 24:
                int i4 = StoryBottomViewGroup.P;
                ((StoryBottomViewGroup) obj).T4();
                return s3q0.a;
            case 25:
                StoryFragment storyFragment = (StoryFragment) obj;
                int i5 = StoryFragment.X;
                if (storyFragment.getActivity() == null) {
                    return s3q0.a;
                }
                ((anm0) storyFragment.V.getValue()).B(Action.OPEN_CAMERA, AttachType.STORY, storyFragment.R, storyFragment.Q);
                if (storyFragment.mo2getContext() != null) {
                    com.vk.storycamera.builder.a aVar3 = new com.vk.storycamera.builder.a("im", "dialog");
                    ArrayList arrayList2 = new ArrayList();
                    ms i6 = o25.a().i();
                    if (g620.f().getExperiments().c()) {
                        arrayList2.add(StoryCameraMode.CLIPS);
                    }
                    arrayList2.add(StoryCameraMode.STORY);
                    arrayList2.add(StoryCameraMode.STORY_VIDEO);
                    if (i6.l) {
                        arrayList2.add(StoryCameraMode.PING_PONG);
                    }
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    StoryCameraMode storyCameraMode = StoryCameraMode.CLIPS;
                    if (arrayList3.contains(storyCameraMode)) {
                        arrayList3.remove(storyCameraMode);
                    }
                    aVar3.g = arrayList3;
                    aVar3.q(o25.a().c(), null, null);
                    aVar3.r = StoryCameraTarget.IM;
                    aVar3.t = storyFragment.Q;
                    aVar3.H = false;
                    Intent B = aVar3.B(storyFragment.kn(), true);
                    LayoutInflater.Factory activity = storyFragment.getActivity();
                    ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
                    ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
                    if (Y == null || !Y.q(200, B, storyFragment)) {
                        storyFragment.startActivityForResult(B, 200, null);
                    }
                }
                return s3q0.a;
            case 26:
                com.vk.sharing.core.view.j jVar = (com.vk.sharing.core.view.j) obj;
                jVar.i.setVisibility(8);
                jVar.b(jVar.e, false);
                return s3q0.a;
            case 27:
                return Pattern.compile("\\b" + ((g5p0) obj).e, 2);
            case 28:
                bcp0.a aVar4 = bcp0.w;
                return (VideoMinimizableState) ((io.reactivex.rxjava3.subjects.d) ((bcp0) obj).s.getValue()).P0();
            default:
                jrp0 jrp0Var = (jrp0) obj;
                lqr lqrVar = jrp0Var.b;
                float f = jrp0Var.a;
                return new r500(nzo.g(lqrVar.a, f), nzo.g(lqrVar.b, f));
        }
    }
}
