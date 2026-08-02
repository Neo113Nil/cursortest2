package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.TemplateDraftData;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipDraft;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.storycamera.builder.StoryCameraParams;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ClipsDraftListController.kt */
/* loaded from: classes16.dex */
public final class atd implements m0q0, w8i {
    public final CameraUIView b;
    public final com.vk.cameraui.impl.a c;
    public final jpd d;
    public final lsd e;
    public final lpd f;
    public final bpn0 g = new bpn0(new sa0(this, 24));
    public final bpn0 h = new bpn0(new im0(this, 19));
    public androidx.appcompat.app.d i;
    public dw20 j;
    public final yvd0 k;
    public final StoryCameraParams l;

    public atd(CameraUIView cameraUIView, com.vk.cameraui.impl.a aVar, jpd jpdVar, lsd lsdVar, ibr0 ibr0Var, lpd lpdVar) {
        this.b = cameraUIView;
        this.c = aVar;
        this.d = jpdVar;
        this.e = lsdVar;
        this.f = lpdVar;
        int i = 0;
        int i2 = 1;
        this.k = new yvd0(new wi3(i2, this, atd.class, "onDraftClicked", "onDraftClicked(Lcom/vk/clips/viewer/impl/profile/DraftListItem;)V", i, 3), new ae8(i2, this, atd.class, "onDraftDeleteClicked", "onDraftDeleteClicked(Lcom/vk/clips/viewer/impl/profile/DraftListItem;)V", i, 1), ibr0Var);
        this.l = aVar.c;
        new bpn0(new ra(this, 21));
    }

    public static ArrayList a(egg0 egg0Var) {
        ArrayList arrayList = new ArrayList(c5g.u(egg0Var, 10));
        Iterator<T> it = egg0Var.iterator();
        while (it.hasNext()) {
            ClipsDraftVk clipsDraftVk = (ClipsDraftVk) it.next();
            ClipsDraftCommonData clipsDraftCommonData = clipsDraftVk.b;
            String str = clipsDraftCommonData.b;
            String str2 = clipsDraftCommonData.e;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = clipsDraftCommonData.j;
            int i = clipsDraftCommonData.h;
            TemplateDraftData templateDraftData = clipsDraftVk.c.i;
            arrayList.add(new jdo(str, str2, str3, i, templateDraftData != null ? templateDraftData.b : null));
        }
        return arrayList;
    }

    public final void b(jdo jdoVar, ShortVideoGetTemplateExtendedResponseDto shortVideoGetTemplateExtendedResponseDto) {
        this.f.invoke(new MobileOfficialAppsClipsStat$TypeClipDraft(MobileOfficialAppsClipsStat$TypeClipDraft.EventType.OPEN_DRAFT));
        if (this.c.i.j) {
            ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
            ysd ysdVar = new ysd(this, jdoVar, shortVideoGetTemplateExtendedResponseDto, 0);
            clipsDraftPersistentStore.getClass();
            ClipsDraftPersistentStore.o(ysdVar);
            return;
        }
        this.d.q(false);
        c(jdoVar, shortVideoGetTemplateExtendedResponseDto);
        dw20 dw20Var = this.j;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }

    public final void c(jdo jdoVar, ShortVideoGetTemplateExtendedResponseDto shortVideoGetTemplateExtendedResponseDto) {
        ClipAudioTemplate clipAudioTemplate = jdoVar.e;
        String str = jdoVar.a;
        jpd jpdVar = this.d;
        if (clipAudioTemplate == null || shortVideoGetTemplateExtendedResponseDto == null) {
            this.l.M = str;
            jpdVar.o();
        } else {
            ((ClipsTemplatesEditorComponent) this.g.getValue()).l4().e("ClipsDraftListController");
            jpdVar.g();
            ((v8f) this.h.getValue()).d(this.b, jdoVar.e, shortVideoGetTemplateExtendedResponseDto, str);
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_CAMERA_DRAFTS;
    }
}
