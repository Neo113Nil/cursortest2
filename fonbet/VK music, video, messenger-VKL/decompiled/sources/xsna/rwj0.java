package xsna;

import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: SiteNameExtractor.kt */
/* loaded from: classes2.dex */
public final class rwj0 {
    public static final rwj0 a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final wqo0 c;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(rwj0.class, "sb", "getSb()Ljava/lang/StringBuilder;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
        a = new rwj0();
        c = new wqo0(new dgc0(9));
    }

    public static final void a(CharSequence charSequence, StringBuilder sb) {
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '/') {
                if (!z) {
                    return;
                }
                i++;
                if (i == 2) {
                    z2 = true;
                    z = false;
                }
            } else {
                if (charAt == '?' || charAt == '#') {
                    return;
                }
                if (z2) {
                    sb.append(charAt);
                }
            }
        }
    }

    public static StringBuilder b() {
        qcy<Object> qcyVar = b[0];
        wqo0 wqo0Var = c;
        wqo0Var.getClass();
        return (StringBuilder) wqo0Var.get();
    }
}
