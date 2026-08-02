package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"La78;", "", "Companion", "z68", "x68", "y68", "carplates"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a78 {
    public static final y68 Companion = new y68();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new ij7(21))};
    public final int a;
    public final int b;
    public final Map c;

    public /* synthetic */ a78(Map map, int i, int i2, int i3) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
    }

    public final String toString() {
        return b64.r(b64.s(this.a, this.b, "CarPlatesFormatter{backgroundColor=", ", textColor=", ", fontStyles="), this.c, "}");
    }

    public a78(int i, int i2, Map map) {
        this.a = i;
        this.b = i2;
        this.c = map;
    }

    public a78() {
        this(0, 0, b.f());
    }
}
