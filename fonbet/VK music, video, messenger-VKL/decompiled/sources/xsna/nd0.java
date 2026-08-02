package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.libvideo.api.ad.AdChoice;

/* compiled from: AdChoiceHandlerImpl.kt */
/* loaded from: classes14.dex */
public final class nd0 implements md0 {
    public final maz a;

    public nd0(maz mazVar) {
        this.a = mazVar;
    }

    @Override // xsna.md0
    public final boolean a(Context context, AdChoice adChoice) {
        ClipboardManager clipboardManager;
        AdChoice.a aVar = adChoice.c;
        if (aVar instanceof AdChoice.a.b) {
            String str = ((AdChoice.a.b) aVar).a;
            Object systemService = context.getSystemService("clipboard");
            if (systemService != null) {
                clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str));
                    return false;
                }
            }
        } else if (aVar instanceof AdChoice.a.c) {
            String str2 = ((AdChoice.a.c) aVar).a;
            Object systemService2 = context.getSystemService("clipboard");
            if (systemService2 != null) {
                clipboardManager = systemService2 instanceof ClipboardManager ? (ClipboardManager) systemService2 : null;
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(str2, str2));
                    return false;
                }
            }
        } else {
            if (aVar instanceof AdChoice.a.d) {
                maz.c(this.a, context, ((AdChoice.a.d) aVar).a, LaunchContext.A, null, null, 24);
                return true;
            }
            if (aVar instanceof AdChoice.a.C1193a) {
                return true;
            }
        }
        return false;
    }
}
