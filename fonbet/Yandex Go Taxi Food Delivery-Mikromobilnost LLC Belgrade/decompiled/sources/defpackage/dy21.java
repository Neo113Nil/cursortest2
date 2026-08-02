package defpackage;

/* loaded from: classes9.dex */
public class dy21 extends cy21 {
    public static final void c(int i, String str, String str2) {
        StringBuilder u = b64.u(i, "Expected ", str2, " at index ", ", but was '");
        u.append(str.charAt(i));
        u.append('\'');
        throw new IllegalArgumentException(u.toString());
    }
}
