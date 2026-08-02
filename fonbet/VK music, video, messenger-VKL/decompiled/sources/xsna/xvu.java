package xsna;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class xvu {

    @NonNull
    public final String a;

    @NonNull
    public final String b;

    @NonNull
    public final String c;

    @NonNull
    public final String d;

    @NonNull
    public final String e;

    public xvu(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Header{icon='");
        sb.append(this.a);
        sb.append("', title='");
        sb.append(this.b);
        sb.append("', linkText='");
        sb.append(this.c);
        sb.append("', ageRestrictionText='");
        sb.append(this.d);
        sb.append("', adDisclaimerText='");
        return i5s.a(sb, this.e, "'}");
    }
}
