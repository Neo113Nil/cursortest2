package kotlin.uuid;

import xsna.xy6;

/* compiled from: Uuid.kt */
/* loaded from: classes8.dex */
public class b extends a {
    public static final void c(int i, String str, String str2) {
        StringBuilder b = xy6.b(i, "Expected ", str2, " at index ", ", but was '");
        b.append(str.charAt(i));
        b.append('\'');
        throw new IllegalArgumentException(b.toString());
    }
}
