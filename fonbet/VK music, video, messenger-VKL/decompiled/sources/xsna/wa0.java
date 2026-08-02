package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import xsna.va0;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes11.dex */
public final class wa0 extends va0<String[], Uri> {
    @Override // xsna.va0
    public final Intent a(Context context, String[] strArr) {
        return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
    }

    @Override // xsna.va0
    public final /* bridge */ /* synthetic */ va0.a<Uri> b(Context context, String[] strArr) {
        return null;
    }

    @Override // xsna.va0
    public final Uri c(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
