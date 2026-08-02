package xsna;

import android.app.Activity;
import android.util.Size;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.EventAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fzp implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fzp(EventAttachment eventAttachment, boolean z, u1c0 u1c0Var, gzp gzpVar) {
        this.d = eventAttachment;
        this.c = z;
        this.e = u1c0Var;
        this.f = gzpVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Owner s;
        int i = this.b;
        Object obj2 = this.f;
        boolean z = this.c;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                EventAttachment eventAttachment = (EventAttachment) obj4;
                u1c0 u1c0Var = (u1c0) obj3;
                gzp gzpVar = (gzp) obj2;
                UserId userId = (UserId) obj;
                eventAttachment.j = !z;
                if (u1c0Var != null) {
                    gzpVar.c7(userId, u1c0Var, eventAttachment);
                }
                break;
            default:
                y6s0 y6s0Var = (y6s0) obj4;
                s6s0 s6s0Var = (s6s0) obj3;
                Activity activity = (Activity) obj2;
                VideoFile videoFile = (VideoFile) obj;
                if (y6s0Var != null) {
                    y6s0Var.b(VideoBottomSheetSideEffectOptions.DELAY_CLIP_PUBLISHED_NOW, s6s0Var.a);
                }
                if (!z && (s = videoFile.s()) != null) {
                    cee0.c.getClass();
                    String str = s.c;
                    String string = (fkq0.b(s.b) && str == null) ? null : fkq0.b(s.b) ? activity.getString(R.string.video_publish_now_group_snack, str) : activity.getString(R.string.video_publish_now_profile_snack);
                    if (string != null) {
                        ikv0.d.a aVar = (BuildInfo.q() && fxc0.B().J().L0()) ? new ikv0.d.a(activity.getString(R.string.video_publish_now_snack_action), null, new mz80(10, activity, s.b), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) : null;
                        ikv0.a aVar2 = new ikv0.a(activity);
                        HashSet hashSet = iah0.a;
                        if (fnj.d(activity)) {
                            aVar2.k = 1;
                            aVar2.g(1);
                        }
                        aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                        aVar2.u = new ikv0.d(string, (String) null, aVar, 2);
                        aVar2.n();
                    }
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fzp(y6s0 y6s0Var, s6s0 s6s0Var, boolean z, Activity activity) {
        this.d = y6s0Var;
        this.e = s6s0Var;
        this.c = z;
        this.f = activity;
    }
}
