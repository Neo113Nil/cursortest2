package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class a231 extends c231 {
    public final String b;
    public volatile Uri c;

    public a231(String str, Uri uri) {
        this.b = str;
        this.c = uri;
    }

    @Override // defpackage.c231
    public final String c() {
        return this.b;
    }

    public final void j(Uri uri) {
        synchronized (this) {
            if (jl40.l(this.c, uri)) {
                return;
            }
            this.c = uri;
            e(this);
        }
    }
}
