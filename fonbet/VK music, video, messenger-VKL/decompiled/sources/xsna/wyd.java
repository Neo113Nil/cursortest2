package xsna;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.dto.clips.model.ClipsEditorInitParams;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.clips.model.ClipsEditorSessionParams;
import com.vk.dto.clips.upload.ClipsEditorUploadParams;
import com.vk.photo.editor.features.colorgrading.ColorGradingTool;
import com.vk.photo.editor.views.ToolButton;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import xsna.vyd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class wyd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object g;

    public /* synthetic */ wyd(Object obj, Object obj2, Object obj3, KeyEvent.Callback callback, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = callback;
        this.g = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                vyd.a aVar = (vyd.a) this.c;
                xyd xydVar = (xyd) this.d;
                ClipsEditorSessionParams clipsEditorSessionParams = (ClipsEditorSessionParams) this.e;
                Activity activity = (Activity) this.f;
                vyd.c cVar = (vyd.c) this.g;
                String str = aVar.a;
                ((ClipsDraftPersistentStore) obj).getClass();
                ClipsDraftPersistentStore.v(str);
                ClipsDraftVk k = ClipsDraftPersistentStore.k();
                if (k != null) {
                    ClipsDraftCommonData clipsDraftCommonData = k.b;
                    ClipsEditorInputData b = w0e.b(k, false);
                    MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint a = wrp.a(clipsDraftCommonData.k);
                    Integer num = aVar.b;
                    int intValue = num != null ? num.intValue() : new SecureRandom().nextInt(Integer.MAX_VALUE);
                    xydVar.a.j(new kbk(a, intValue, true, aVar.c));
                    xydVar.c(activity, new ClipsEditorInitParams(b, new ClipsEditorUploadParams(intValue, null, null, clipsDraftCommonData.d.size(), null, null, null, null, null, false, null, null, null, 0, false, false, false, false, null, wrp.b(a), null, null, null, null, null, null, 66584566, null), clipsEditorSessionParams), cVar);
                    break;
                } else {
                    tv4.b("Trying to open clips editor without draft", com.vk.metrics.eventtracking.b.a);
                    break;
                }
            default:
                ColorGradingTool colorGradingTool = (ColorGradingTool) this.c;
                HashMap hashMap = (HashMap) this.d;
                HashMap hashMap2 = (HashMap) this.e;
                ToolButton toolButton = (ToolButton) this.f;
                FrameLayout frameLayout = (FrameLayout) this.g;
                gzs<s3q0> gzsVar = (gzs) obj;
                colorGradingTool.J(gzsVar);
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((ToolButton) it.next()).setSelected(false);
                }
                Iterator it2 = hashMap2.values().iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).setVisibility(8);
                }
                toolButton.setSelected(true);
                frameLayout.setVisibility(0);
                gzsVar.invoke();
                break;
        }
        return s3q0.a;
    }
}
