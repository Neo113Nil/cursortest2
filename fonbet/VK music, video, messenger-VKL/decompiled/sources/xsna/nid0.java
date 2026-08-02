package xsna;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.vk.api.sdk.utils.StartUpMethodPriorityBackoffBaseImpl;
import com.vk.asset.manager.api.di.VkAssetManagerComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.design.view.timeline.ClipsEditorVoiceOverRecordButton;
import com.vk.clips.design.view.timeline.TimelineVoiceoverView;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.libvideo.api.di.VideoKidsComponent;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.newsfeed.impl.fragments.VideoCommentThreadFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.profile.user.impl.di.UserProfileParamsComponentImpl;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.video.assistant.api.di.AiAssistantComponent;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Ref$IntRef;
import ru.mail.libverify.controls.VerificationController;
import xsna.f24;
import xsna.zuu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nid0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nid0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r0.c() == true) goto L14;
     */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String lambda$getModifiedPhoneNumber$6;
        boolean z;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                pid0 pid0Var = (pid0) obj;
                f24 f24Var = pid0Var.d;
                Context context = pid0Var.b;
                ah5 ah5Var = new ah5((w530) pid0Var.j.getValue(), (sz00) pid0Var.e.getValue(), (lt00) pid0Var.h.getValue(), (maz) pid0Var.f.getValue());
                return f24Var instanceof f24.b ? new tid0(context, ah5Var) : new rid0(context, ah5Var);
            case 1:
                int i2 = ProfileFriendsFragment.k0;
                ((ProfileFriendsFragment) obj).qo();
                return s3q0.a;
            case 2:
                return ((prf0) obj).a.findViewById(R.id.nativeads_rating_icon);
            case 3:
                ((sgg0) ((zak0) ((tgg0) obj).a).getValue()).getClass();
                return s3q0.a;
            case 4:
                ov70 ov70Var = (ov70) ((zak0) ((bei0) obj).r).getValue();
                return new ov70(ov70Var != null ? ov70Var.a : 9205357640488583168L);
            case 5:
                ((afi0) obj).a();
                return s3q0.a;
            case 6:
                return (ViewAnimator) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.content_animator);
            case 7:
                ((znj0) obj).f0();
                return s3q0.a;
            case 8:
                Cursor cursor = (Cursor) obj;
                try {
                    if (cursor.moveToFirst()) {
                        return cursor;
                    }
                    return null;
                } finally {
                    cursor.close();
                }
            case 9:
                return new CopyOnWriteArraySet((Collection) ((StartUpMethodPriorityBackoffBaseImpl) obj).a.invoke());
            case 10:
                int i3 = StoryMediaPickerFragment.d0;
                return ((StoriesComponent) m7m.d((StoryMediaPickerFragment) obj).a(fpf0.a(StoriesComponent.class))).td();
            case 11:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.c(((o8m0) obj).b)).a(fpf0.a(StoryEditorExtDepsComponent.class))).w0();
            case 12:
                int i4 = StoryStatisticsViewersFragment.f0;
                return ((StoryViewerComponent) m7m.d((StoryStatisticsViewersFragment) obj).a(fpf0.a(StoryViewerComponent.class))).va();
            case 13:
                unm0 unm0Var = (unm0) obj;
                o1l0 o1l0Var = unm0Var.f;
                if (o1l0Var != null) {
                    ((kdl0) o1l0Var).a(unm0Var);
                }
                return s3q0.a;
            case 14:
                int i5 = TimelineVoiceoverView.v;
                return (ClipsEditorVoiceOverRecordButton) ((TimelineVoiceoverView) obj).findViewById(R.id.timeline_voiceover_record_button);
            case 15:
                return tgw.b(((Ref$IntRef) obj).element, "generateUploadFile failed after trying ", " suffixes");
            case 16:
                BridgeComponent bridgeComponent = ((UserProfileParamsComponentImpl) obj).d;
                return new vvd0(bridgeComponent.s(), bridgeComponent.p());
            case 17:
                return ((ker0) obj).vn().d;
            case 18:
                lambda$getModifiedPhoneNumber$6 = ((VerificationController) obj).lambda$getModifiedPhoneNumber$6();
                return lambda$getModifiedPhoneNumber$6;
            case 19:
                VideoBottomPanelView videoBottomPanelView = (VideoBottomPanelView) obj;
                View.OnClickListener onClickListener = videoBottomPanelView.z;
                if (onClickListener != null) {
                    onClickListener.onClick(videoBottomPanelView.L);
                }
                return s3q0.a;
            case 20:
                return ((AiAssistantComponent) ((k7m) m7m.f((b9s0) obj)).mo408a(fpf0.a(AiAssistantComponent.class))).b();
            case 21:
                return ((VideoKidsComponent) m7m.a(((gas0) obj).a).a(fpf0.a(VideoKidsComponent.class))).I4();
            case 22:
                int i6 = VideoCommentThreadFragment.B0;
                return ((AttachmentMappersComponent) m7m.d((VideoCommentThreadFragment) obj).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 23:
                return (VkAssetManagerComponent) ((g8m) obj).a(fpf0.a(VkAssetManagerComponent.class));
            case 24:
                return ((ClipsConfigViewersComponent) ((k7m) m7m.f((VideoItemListLargeVh) obj)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 25:
                return (VideoPlaylistReversionComponent) ((f8m) obj).a(fpf0.a(VideoPlaylistReversionComponent.class));
            case 26:
                return ((pbt0) obj).b.s3();
            case 27:
                zuu0.a aVar = ((zuu0) obj).f;
                if (aVar != null) {
                    z = true;
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 28:
                ((VkTopBarVh) obj).p = null;
                return s3q0.a;
            default:
                return (TextView) ((View) ((qyw0) obj).e.getValue()).findViewById(R.id.call_by_link_media_setting_enabled_view);
        }
    }
}
