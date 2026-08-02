package xsna;

import android.view.View;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipDraft;
import xsna.av20;

/* compiled from: ClipsDraftController.kt */
/* loaded from: classes16.dex */
public final class ksd implements av20.b<String> {
    public final /* synthetic */ lsd a;

    public ksd(lsd lsdVar) {
        this.a = lsdVar;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        lsd lsdVar = this.a;
        if (i == 0) {
            y6 y6Var = new y6(lsdVar, 20);
            lsdVar.e.invoke(new MobileOfficialAppsClipsStat$TypeClipDraft(MobileOfficialAppsClipsStat$TypeClipDraft.EventType.SAVE_DRAFT));
            ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
            jp5 jp5Var = new jp5(5, lsdVar, y6Var);
            clipsDraftPersistentStore.getClass();
            ClipsDraftPersistentStore.o(jp5Var);
        } else if (i == 1) {
            ClipsDraftPersistentStore clipsDraftPersistentStore2 = ClipsDraftPersistentStore.b;
            pd pdVar = new pd(lsdVar, 27);
            clipsDraftPersistentStore2.getClass();
            ClipsDraftPersistentStore.o(pdVar);
            jpd jpdVar = lsdVar.d;
            jpdVar.q(true);
            zd9 camera1View = jpdVar.c.getCamera1View();
            if (camera1View != null) {
                camera1View.C();
            }
        }
        dw20 dw20Var = lsdVar.g;
        if (dw20Var != null) {
            dw20Var.hide();
        }
        lsdVar.g = null;
    }
}
