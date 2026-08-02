package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.net.Uri;
import com.yandex.div.core.view2.Div2View;

/* loaded from: classes11.dex */
public final class lbk implements nbk {
    @Override // defpackage.nbk
    public final boolean a(String str, jbk jbkVar, Div2View div2View, rvo rvoVar) {
        ClipData clipData;
        if (jbkVar instanceof sak) {
            p5k p5kVar = ((sak) jbkVar).b.a;
            Object systemService = div2View.getContext().getSystemService("clipboard");
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager == null) {
                return true;
            }
            if (p5kVar instanceof n5k) {
                clipData = new ClipData("Copied text", new String[]{"text/plain"}, new ClipData.Item((String) ((n5k) p5kVar).b.a.a(rvoVar)));
            } else if (p5kVar instanceof o5k) {
                clipData = new ClipData("Copied url", new String[]{"text/uri-list"}, new ClipData.Item((Uri) ((o5k) p5kVar).b.a.a(rvoVar)));
            } else {
                w511.b();
            }
            clipboardManager.setPrimaryClip(clipData);
            return true;
        }
        return false;
    }
}
