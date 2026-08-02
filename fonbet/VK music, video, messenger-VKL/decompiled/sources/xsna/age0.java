package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.newsfeed.posting.api.analytics.PostingAttachmentInfo;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SavePickTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkVideo;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vkontakte.android.attachments.VideoAttachment;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.efc0;
import xsna.fmc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class age0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ age0(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.b = i;
        this.d = obj;
        this.c = z;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                zfe0 zfe0Var = (zfe0) this.d;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.e;
                Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) this.f;
                boolean c = zfe0Var.c();
                yvj yvjVar = zfe0Var.a;
                kg50 kg50Var = zfe0Var.h;
                boolean z = this.c;
                if (c != z) {
                    ((zak0) zfe0Var.d).setValue(Boolean.valueOf(z));
                    vak0 vak0Var = (vak0) zfe0Var.f;
                    float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    vak0Var.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    if (z) {
                        f = ((vak0) kg50Var).getFloatValue();
                    }
                    myc0.h(yvjVar, null, null, new yfe0(zfe0Var, f, null), 3);
                }
                ((vak0) zfe0Var.g).g(ref$FloatRef.element);
                float f2 = ref$FloatRef2.element;
                vak0 vak0Var2 = (vak0) kg50Var;
                if (vak0Var2.getFloatValue() != f2) {
                    vak0Var2.g(f2);
                    if (zfe0Var.c()) {
                        myc0.h(yvjVar, null, null, new yfe0(zfe0Var, f2, null), 3);
                    }
                }
                break;
            default:
                xci0 xci0Var = (xci0) this.d;
                PostingState postingState = (PostingState) this.e;
                PostingAction.MediaPicker.Selection.ToggleVkVideoItemSelection toggleVkVideoItemSelection = (PostingAction.MediaPicker.Selection.ToggleVkVideoItemSelection) this.f;
                PostingState.Editing editing = (PostingState.Editing) postingState;
                efc0.a aVar = xci0Var.a;
                ibc0 ibc0Var = xci0Var.b;
                boolean z2 = this.c;
                if (z2) {
                    VkMediaEntry$VkVideo vkMediaEntry$VkVideo = toggleVkVideoItemSelection.b.b;
                    ibc0Var.u().t(new PostingAttachmentInfo(vkMediaEntry$VkVideo.b.I0().b, r6.o0(), null, null, null, 28, null));
                } else {
                    VkMediaEntry$VkVideo vkMediaEntry$VkVideo2 = toggleVkVideoItemSelection.b.b;
                    ibc0Var.u().h(new PostingAttachmentInfo(vkMediaEntry$VkVideo2.b.I0().b, r6.o0(), null, null, null, 28, null));
                }
                VkMediaEntry$VkVideo vkMediaEntry$VkVideo3 = toggleVkVideoItemSelection.b.b;
                aVar.a(new e.b.h.f(new VkMediaEntry$VkVideo(vkMediaEntry$VkVideo3.b), !z2));
                VideoFile videoFile = vkMediaEntry$VkVideo3.b;
                VideoAttachment videoAttachment = new VideoAttachment(videoFile);
                if (z2) {
                    aVar.e(new fmc0.h.f(videoFile, false));
                } else if (!z2) {
                    if (icc0.b(editing)) {
                        aVar.e(new fmc0.h.d(editing.d.c));
                    } else if (icc0.a(editing, videoAttachment)) {
                        aVar.d(new PostingAction$TechStats$Picker$SavePickTime(MobileOfficialAppsFeedStat$PickerType.VIDEO_VK, Long.valueOf(toggleVkVideoItemSelection.c), null, 4, null));
                        aVar.e(new fmc0.h.f(videoFile, true));
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
