package sg.bigo.ads.dh;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public final class b {
    final int a;
    final int b;
    public final String c;

    @Nullable
    public final String d;
    public final String e;
    private final int f;
    private final int g;

    public b(int i, int i2, int i3, int i4, @NonNull String str, @Nullable String str2, @Nullable String str3) {
        this.a = i;
        this.b = i2;
        this.g = i4;
        this.c = str;
        this.f = i3;
        this.d = str2;
        this.e = str3;
    }

    public final boolean a() {
        return TextUtils.equals(this.d, "application/javascript");
    }
}
