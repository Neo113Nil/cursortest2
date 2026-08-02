package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class wws0 {

    @NonNull
    public final String a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @NonNull
    public final String d;

    @NonNull
    public final String e;

    @NonNull
    public final String f;

    @NonNull
    public final String g;

    public wws0(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMotionItem{id='");
        sb.append(this.a);
        sb.append("', price='");
        sb.append(this.b);
        sb.append("', oldPrice='");
        sb.append(this.c);
        sb.append("', currency='");
        sb.append(this.d);
        sb.append("', image='");
        sb.append(this.e);
        sb.append("', text='");
        sb.append(this.f);
        sb.append("', ctaText='");
        return i5s.a(sb, this.g, "'}");
    }
}
