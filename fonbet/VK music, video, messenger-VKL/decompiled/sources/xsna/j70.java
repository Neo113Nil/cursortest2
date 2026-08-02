package xsna;

import android.graphics.Paint;
import android.widget.EditText;
import android.widget.TextView;
import com.vk.bridges.ProfileType;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipGlobalSearchFeatureRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.ChildTopBarWrapperVh;
import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import com.vk.clips.coauthors.invite.CoauthorsInviteDialog;
import com.vk.clips.design.view.templates.ClipsTemplateEditorFragmentsBottomView;
import com.vk.clips.download.api.di.ClipsDownloadComponent;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.ClipVideoFile;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.im.channelcreation.impl.di.ChannelCreationInternalDiComponent;
import com.vk.im.edu.common.api.di.EduCommonComponent;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.video.profile.presentation.a;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsConfigurationImpl;
import xsna.szb0;
import xsna.t0e.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class j70 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j70(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String init$lambda$1;
        boolean z = true;
        switch (this.b) {
            case 0:
                return (ClipsDownloadComponent) ((k7m) m7m.f((k70) this.c)).a(fpf0.a(ClipsDownloadComponent.class));
            case 1:
                SdkClipVideoFile sdkClipVideoFile = ((hw0) this.c).a;
                ClipVideoFileAdapter copy = sdkClipVideoFile.copy();
                CharSequence U6 = sdkClipVideoFile.U6();
                ClipVideoFile clipVideoFile = copy.m;
                clipVideoFile.U1 = U6;
                clipVideoFile.V1 = sdkClipVideoFile.L5();
                clipVideoFile.W1 = sdkClipVideoFile.S6();
                return copy;
            case 2:
                return Float.valueOf(((s600) this.c).getProgress());
            case 3:
                return (EditText) ((ow3) this.c).c.findViewById(R.id.et_asr_title);
            case 4:
                return u86.L((y440) this.c);
            case 5:
                com.vk.content.design.view.camera.a aVar = (com.vk.content.design.view.camera.a) this.c;
                szb0 szb0Var = aVar.s;
                TextView textView = aVar.n;
                szb0.a aVar2 = com.vk.content.design.view.camera.a.E;
                szb0Var.d(textView, com.vk.content.design.view.camera.a.E, 2000L, null);
                return s3q0.a;
            case 6:
                ((izs) ((zak0) ((no7) this.c).b).getValue()).invoke(a.b.C0959a.b);
                return s3q0.a;
            case 7:
                ((wf8) this.c).b();
                return s3q0.a;
            case 8:
                init$lambda$1 = CallAnalyticsInitializer.init$lambda$1((ConversationAnalyticsConfigurationImpl) this.c);
                return init$lambda$1;
            case 9:
                return (StoriesComponent) ((nmg0) this.c).a(fpf0.a(StoriesComponent.class));
            case 10:
                return ((ClassifiedsComponent) m7m.d(((yw9) this.c).d).a(fpf0.a(ClassifiedsComponent.class))).dc();
            case 11:
                return ((laa) this.c).j;
            case 12:
                return ((ChannelCreationInternalDiComponent) this.c).b.s();
            case 13:
                return i5s.a(new StringBuilder(), ((wgb) this.c).s, ": updateAllHistoryFromCache: finished");
            case 14:
                ChatFragment chatFragment = (ChatFragment) this.c;
                ChatFragment.d dVar = ChatFragment.w1;
                return (EduCommonComponent) m7m.d(chatFragment).mo408a(fpf0.a(EduCommonComponent.class));
            case 15:
                ChildTopBarWrapperVh childTopBarWrapperVh = (ChildTopBarWrapperVh) this.c;
                if (o25.a().c0() != ProfileType.RELATED) {
                    ((vqs0) childTopBarWrapperVh.d.getValue()).getClass();
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                return new zo0(((ylc) this.c).d);
            case 17:
                ClipEndOverlayView clipEndOverlayView = (ClipEndOverlayView) this.c;
                int i = ClipEndOverlayView.u;
                return (VkButton) clipEndOverlayView.findViewById(R.id.attach_clip_end_overlay_more);
            case 18:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i2 = ClipFeedListFragment.a2;
                return (ClipsDecorationComponent) m7m.d(clipFeedListFragment).mo408a(fpf0.a(ClipsDecorationComponent.class));
            case 19:
                return ((ClipGlobalSearchFeatureRootVh) this.c).q;
            case 20:
                return g2u0.c((o1d) this.c);
            case 21:
                return ((ClipsViewerComponent) ((k7m) m7m.f((cfd) this.c)).a(fpf0.a(ClipsViewerComponent.class))).K0();
            case 22:
                return new uy50(((t0e) this.c).new b());
            case 23:
                te0 te0Var = ((d8e) this.c).g.r.e;
                return new waf();
            case 24:
                nwy nwyVar = ((ClipsInterestsComponentImpl) this.c).k;
                qcy<Object> qcyVar = ClipsInterestsComponentImpl.o[10];
                return new fhe((bie) nwyVar.c());
            case 25:
                List<xuy> f = ((xvy) this.c).j().f();
                if (!(f instanceof Collection) || !f.isEmpty()) {
                    Iterator<T> it = f.iterator();
                    while (it.hasNext()) {
                        if (!(((xuy) it.next()).getKey() instanceof Integer)) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 26:
                utx0 utx0Var = (utx0) this.c;
                boolean d = utx0Var.d();
                Paint paint = utx0Var.c.a;
                int i3 = d ? 250 : 0;
                return f5f.z(paint.getAlpha(), i3, ((long) Math.abs((i3 - r0) / 250)) * 250);
            case 27:
                ClipsTemplateEditorFragmentsBottomView clipsTemplateEditorFragmentsBottomView = (ClipsTemplateEditorFragmentsBottomView) this.c;
                int i4 = ClipsTemplateEditorFragmentsBottomView.j;
                return clipsTemplateEditorFragmentsBottomView.findViewById(R.id.clips_template_editor_template_fragments_recycler_view_left_shadow);
            case 28:
                return ((ClipsCoauthorsInternalComponent) ((CoauthorsInviteDialog) this.c).c.getValue()).Df();
            default:
                ((wlg) this.c).c.invoke(a.d0.b);
                return s3q0.a;
        }
    }

    public /* synthetic */ j70(f5f f5fVar, utx0 utx0Var) {
        this.b = 26;
        this.c = utx0Var;
    }
}
