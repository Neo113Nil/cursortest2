package xsna;

import xsna.us2;

/* compiled from: ExpandTextContent.kt */
/* loaded from: classes18.dex */
public final class w7q {
    public static final us2 a(String str, String str2) {
        us2.b bVar = new us2.b();
        boolean f = myc0.f(str);
        boolean z = str2 == null || str2.length() == 0;
        if (f && !z) {
            bVar.f(str);
            bVar.g(" · ");
            bVar.g(str2);
        } else if (f) {
            bVar.f(str);
        } else if (!z) {
            bVar.g(str2);
        }
        return bVar.n();
    }
}
