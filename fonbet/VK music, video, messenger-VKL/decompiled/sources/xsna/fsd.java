package xsna;

import android.content.DialogInterface;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipDraft;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.am9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fsd implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fsd(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                n1d n1dVar = (n1d) this.c;
                ClipsDraftVk clipsDraftVk = (ClipsDraftVk) this.d;
                lsd lsdVar = (lsd) this.e;
                ClipsDraftCommonData clipsDraftCommonData = clipsDraftVk.b;
                n1dVar.invoke(clipsDraftCommonData.b);
                MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint a = wrp.a(clipsDraftCommonData.k);
                nf9 nf9Var = nf9.b;
                String name = a.name();
                am9.a aVar = new am9.a();
                aVar.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS);
                aVar.a = name;
                nf9.b(nf9Var, StoryPublishEvent.CONTINUE_RECORDING, aVar, null, null, true, null, 108).e();
                lsdVar.c.h.a.a = a.name();
                lsdVar.e.invoke(new MobileOfficialAppsClipsStat$TypeClipDraft(MobileOfficialAppsClipsStat$TypeClipDraft.EventType.OPEN_DRAFT));
                break;
            default:
                SuperappUiRouterBridge.d dVar = (SuperappUiRouterBridge.d) this.c;
                VkAlertData.a aVar2 = (VkAlertData.a) this.d;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.e;
                dVar.a(aVar2);
                ref$BooleanRef.element = true;
                dialogInterface.dismiss();
                break;
        }
    }
}
