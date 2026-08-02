package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Le5f;", "", "Companion", "d5f", "c5f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class e5f {
    public static final d5f Companion = new d5f();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new cue(3))};
    public static final e5f e = new e5f(0);
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ e5f(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5f)) {
            return false;
        }
        e5f e5fVar = (e5f) obj;
        return jl40.l(this.a, e5fVar.a) && jl40.l(this.b, e5fVar.b) && jl40.l(this.c, e5fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(b64.v("CreateFavoriteAddressInfo(title=", this.a, ", subtitle=", this.b, ", buttons="), this.c, Extension.C_BRAKE);
    }

    public e5f(int i) {
        this.a = "";
        this.b = "";
        this.c = EmptyList.a;
    }

    public e5f() {
        this(0);
    }
}
