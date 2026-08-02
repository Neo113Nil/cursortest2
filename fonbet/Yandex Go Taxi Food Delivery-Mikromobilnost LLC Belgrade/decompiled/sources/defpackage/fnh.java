package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.plus.core.config.Environment;

/* loaded from: classes8.dex */
public final class fnh implements uh21 {
    public final nfh a;
    public final String b;

    public fnh(nfh nfhVar, String str) {
        this.a = nfhVar;
        this.b = str;
    }

    @Override // defpackage.uh21
    public final Uri getUrl() {
        String str;
        nfh nfhVar = this.a;
        int i = nch.a[((Environment) nfhVar.c).ordinal()];
        if (i == 1) {
            str = (String) nfhVar.b;
        } else if (i == 2) {
            str = (String) nfhVar.a;
        } else {
            w511.b();
            str = null;
        }
        return new Uri.Builder().scheme(Constants.SCHEME).authority(str).path(this.b).build();
    }

    public /* synthetic */ fnh(nfh nfhVar) {
        this(nfhVar, "");
    }
}
