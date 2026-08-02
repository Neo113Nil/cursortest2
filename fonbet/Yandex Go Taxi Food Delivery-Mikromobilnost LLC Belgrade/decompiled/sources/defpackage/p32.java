package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lp32;", "", "Companion", "l32", "n32", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p32 {
    public static final n32 Companion = new n32();
    public final String a;
    public final b b;

    public /* synthetic */ p32(int i, String str, b bVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bVar;
        }
    }

    public p32(String str, c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public p32() {
        this(null, null);
    }
}
