package xsna;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;

/* compiled from: OtpClipboardManager.kt */
/* loaded from: classes15.dex */
public final class l090 {
    public final Context a;
    public String b;

    public l090(Context context) {
        this.a = context;
    }

    public final String a() {
        ClipData primaryClip;
        ClipDescription description;
        CharSequence text;
        String obj;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) this.a.getSystemService("clipboard");
            if (!clipboardManager.hasPrimaryClip() || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() == 0) {
                return null;
            }
            ClipDescription description2 = primaryClip.getDescription();
            if ((description2 == null || !description2.hasMimeType("text/plain")) && ((description = primaryClip.getDescription()) == null || !description.hasMimeType("text/html"))) {
                return null;
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt == null || (text = itemAt.getText()) == null || (obj = text.toString()) == null) {
                return null;
            }
            return brm0.y(obj, "\\s", "");
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean b(String str) {
        return (str == null || str.equals(this.b) || drm0.N(str)) ? false : true;
    }
}
