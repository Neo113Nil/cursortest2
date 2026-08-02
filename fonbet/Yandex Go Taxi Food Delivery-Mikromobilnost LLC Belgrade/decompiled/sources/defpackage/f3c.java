package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes15.dex */
public final class f3c {
    public final Context a;

    public f3c(Context context) {
        this.a = context;
    }

    public final boolean a(String str, String str2) {
        try {
            b().setPrimaryClip(ClipData.newPlainText(str, str2));
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final ClipboardManager b() {
        return (ClipboardManager) this.a.getSystemService("clipboard");
    }
}
