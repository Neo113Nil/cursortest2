package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes4.dex */
public final class e3y {
    public static final d3y Companion = new d3y();
    public static final i3y[] f = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new vix(22))};
    public final String a;
    public final boolean b;
    public final String c;
    public final d1u d;
    public final List e;

    public /* synthetic */ e3y(int i, String str, boolean z, String str2, d1u d1uVar, List list) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, c3y.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = d1uVar;
        this.e = list;
    }

    public e3y(String str, boolean z, String str2, d1u d1uVar, List list) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = d1uVar;
        this.e = list;
    }
}
