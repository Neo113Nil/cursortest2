package defpackage;

import android.net.Uri;

/* loaded from: classes15.dex */
public abstract class eoc implements g2r {
    public final String a;
    public final Uri b;
    public final String c;
    public final boolean d;

    public eoc(Uri uri, String str, String str2, boolean z) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = z;
    }

    @Override // defpackage.g2r
    public final Uri a() {
        return this.b;
    }

    @Override // defpackage.g2r
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.g2r
    public final String getKey() {
        return this.c;
    }
}
