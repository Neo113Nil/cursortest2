package xsna;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class er01 {
    public String a = null;

    @Nullable
    public Boolean b = null;

    @Nullable
    public Boolean c = null;

    public final void a(String str) {
        this.a = str;
    }

    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void c() {
        this.c = Boolean.TRUE;
    }

    public final or01 d() {
        Boolean bool = this.b;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.c != null) {
            return new or01(this.a, bool.booleanValue(), this.c.booleanValue());
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }
}
