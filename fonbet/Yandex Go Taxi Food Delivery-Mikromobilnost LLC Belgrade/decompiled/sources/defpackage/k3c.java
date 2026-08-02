package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.PersistableBundle;

/* loaded from: classes9.dex */
public final class k3c {
    public final Context a;

    public k3c(Context context) {
        this.a = context;
    }

    public final boolean a(boolean z, CharSequence charSequence, String str) {
        ClipboardManager clipboardManager = (ClipboardManager) this.a.getSystemService("clipboard");
        if (clipboardManager == null) {
            return false;
        }
        ClipData newPlainText = ClipData.newPlainText(str, charSequence);
        if (z) {
            ClipDescription description = newPlainText.getDescription();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", true);
            description.setExtras(persistableBundle);
        }
        clipboardManager.setPrimaryClip(newPlainText);
        return true;
    }
}
