package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class ozr {
    public final Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;
    public final int f;

    public ozr(String str, String str2) {
        this.a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.b = 0;
        this.c = Constants.MINIMAL_ERROR_STATUS_CODE;
        this.d = false;
        this.e = str2;
        this.f = 0;
    }

    public final String a() {
        if (g()) {
            return this.a.getAuthority();
        }
        return null;
    }

    public final int b() {
        return this.b;
    }

    public final Uri c() {
        return this.a;
    }

    public final String d() {
        return this.e;
    }

    public final int e() {
        return this.c;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return Objects.equals(this.a.getScheme(), "systemfont");
    }

    public ozr(Uri uri, int i, int i2, boolean z, int i3) {
        uri.getClass();
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = null;
        this.f = i3;
    }
}
