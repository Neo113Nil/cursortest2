package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.a;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.design.view.timeline.ClipsEditorVoiceOverRecordButton;
import com.vk.clips.entrypoints.ui.ClipsEntryPointDraftsFragment;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dialogssearch.impl.di.ChannelSearchListComponentImpl;
import com.vk.ecomm.orders.api.di.MarketOrdersComponent;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.channelcreation.impl.g;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.bottomsheet.about.delegate.s;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import ru.ok.android.utils.Logger;
import xsna.b4;
import xsna.fl6;
import xsna.or2;
import xsna.ow0.a;
import xsna.tzp0;
import xsna.yeh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h9 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        Boolean init$lambda$6;
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((s.d) obj).l.d(b4.c0.a);
                return s3q0.a;
            case 1:
                com.vk.superapp.browser.internal.ui.shortcats.a aVar = (com.vk.superapp.browser.internal.ui.shortcats.a) obj;
                WebApiApplication v = aVar.b.v();
                if (v != null && (!v.f() || v.r)) {
                    aVar.d();
                }
                return s3q0.a;
            case 2:
                Boolean bool = ((com.vk.superapp.browser.internal.ui.menu.action.c) obj).m;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 3:
                return ((ow0) obj).new a();
            case 4:
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CHANGE_NUMBER_TO_VERIFY, null, null, null, null, null, null, 254);
                FragmentActivity activity = ((ta6) obj).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 5:
                rul rulVar = (rul) obj;
                io.reactivex.rxjava3.subjects.d N0 = io.reactivex.rxjava3.subjects.d.N0();
                if (rulVar.j()) {
                    rulVar.l((io.reactivex.rxjava3.core.q) new r5p(rulVar.a, rulVar.h).e.getValue(), new j22(N0, 6), new mp0(new fl6.b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 5));
                } else {
                    N0.onNext(EmptyList.b);
                }
                return N0;
            case 6:
                init$lambda$6 = CallAnalyticsInitializer.init$lambda$6((i70) obj);
                return init$lambda$6;
            case 7:
                return ((or2.a.InterfaceC3466a) obj).a();
            case 8:
                hj9 hj9Var = (hj9) obj;
                vrj vrjVar = hj9Var.b;
                if (!vrjVar.a()) {
                    return s3q0.a;
                }
                Conversation conversation = vrjVar.getConversation();
                if (conversation == null) {
                    return s3q0.a;
                }
                if (((Number) hj9Var.h.getValue()).intValue() > 1) {
                    conversation.getCameraManager().switchCamera(null);
                }
                return s3q0.a;
            case 9:
                return (StoryEditorComponent) ((nmg0) obj).a(fpf0.a(StoryEditorComponent.class));
            case 10:
                return ((MarketOrdersComponent) m7m.d(((yw9) obj).d).a(fpf0.a(MarketOrdersComponent.class))).S4();
            case 11:
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj).element;
                if (dw20Var != null) {
                    dw20Var.tn();
                }
                return s3q0.a;
            case 12:
                ((com.vk.im.channelcreation.impl.h) obj).O(g.d.b);
                return s3q0.a;
            case 13:
                return new nbb(((ChannelSearchListComponentImpl) obj).a.g());
            case 14:
                return i5s.a(new StringBuilder(), ((wgb) obj).s, ": loadInitial: cache has channels");
            case 15:
                ChatFragment.d dVar = ChatFragment.w1;
                return ((BridgeComponent) m7m.d((ChatFragment) obj).a(fpf0.a(BridgeComponent.class))).a0();
            case 16:
                return ((q5c) obj).a.requireContext();
            case 17:
                tzp0.c.a aVar2 = poc.l1;
                return ((ClipsCoauthorsComponent) m7m.d((poc) obj).mo408a(fpf0.a(ClipsCoauthorsComponent.class))).e();
            case 18:
                int i3 = ClipEndOverlayView.u;
                return (VkBlurView) ((ClipEndOverlayView) obj).findViewById(R.id.attach_clip_end_blur_container);
            case 19:
                return new wzc((uzc) obj);
            case 20:
                return (VkImageSimple) ((cmd) obj).findViewById(R.id.photo_thumb);
            case 21:
                int i4 = ClipsEditorVoiceOverRecordButton.B;
                return ((ClipsEditorVoiceOverRecordButton) obj).findViewById(R.id.clips_editor_voiceover_view_button_idle);
            case 22:
                int i5 = ClipsEntryPointDraftsFragment.Y;
                return ((CameraClipsComponent) m7m.d((ClipsEntryPointDraftsFragment) obj).a(fpf0.a(CameraClipsComponent.class))).sf();
            case 23:
                ene eneVar = (ene) obj;
                List<bne> list = eneVar.g;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    cne a = ((bne) it.next()).a(eneVar.c, eneVar.d);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                return j5g.D0(new paa(i2), arrayList);
            case 24:
                return ((r2g) obj).v;
            case 25:
                ((CommunitiesSearchTopBarVh) obj).b.invoke(a.d.a);
                return s3q0.a;
            case 26:
                ((d4h) obj).i.invoke(CommunityProfileAction.n.e.j.b);
                return s3q0.a;
            case 27:
                ((srh) obj).a();
                return s3q0.a;
            case 28:
                ((yeh.b) obj).n.invoke();
                return s3q0.a;
            default:
                return new tph((mph) obj);
        }
    }
}
