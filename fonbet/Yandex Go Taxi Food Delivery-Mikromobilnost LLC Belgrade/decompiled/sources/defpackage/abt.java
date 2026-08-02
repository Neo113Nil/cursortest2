package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes12.dex */
public final class abt {
    public static final zat Companion = new zat();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new sss(7)), null};
    public final String a;
    public final List b;
    public final String c;

    public /* synthetic */ abt(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, yat.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = str2;
    }
}
