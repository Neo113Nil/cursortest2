package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: VkUiCopyTextCommand.kt */
/* loaded from: classes6.dex */
public final class rvv0 extends dvv0 {
    @Override // xsna.dvv0
    public final void a(String str) {
        ((ClipboardManager) jgn0.a().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Text", new JSONObject(str).optString("text")));
        r6y r6yVar = this.b;
        if (r6yVar != null) {
            bex0.a.b(r6yVar, JsApiMethodType.COPY_TEXT, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
        }
    }
}
