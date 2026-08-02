package xsna;

import java.util.ArrayList;
import xsna.us2;

/* compiled from: InlineTextContent.kt */
/* loaded from: classes11.dex */
public final class s0x {
    public static final void a(us2.b bVar, String str, String str2) {
        if (str2.length() <= 0) {
            xzw.a("alternateText can't be an empty string.");
        }
        us2.b.a aVar = new us2.b.a(bVar.b.length(), 0, 4, new wpm0(str));
        ArrayList arrayList = bVar.c;
        arrayList.add(aVar);
        bVar.d.add(aVar);
        arrayList.size();
        bVar.g(str2);
        bVar.j();
    }
}
