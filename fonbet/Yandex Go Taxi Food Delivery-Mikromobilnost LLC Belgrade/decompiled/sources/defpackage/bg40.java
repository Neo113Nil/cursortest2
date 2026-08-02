package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lbg40;", "", "Companion", "ag40", "zf40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class bg40 {
    public static final ag40 Companion = new ag40();
    public static final i3y[] b;
    public static final bg40 c;
    public final List a;

    static {
        xg40 xg40Var = yg40.Companion;
        b = new i3y[]{a.b(LazyThreadSafetyMode.PUBLICATION, new e540(20))};
        c = new bg40(0);
    }

    public /* synthetic */ bg40(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bg40) && jl40.l(this.a, ((bg40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("MtTrainScheduleDto(items=", Extension.C_BRAKE, this.a);
    }

    public bg40(int i) {
        this.a = EmptyList.a;
    }

    public bg40() {
        this(0);
    }
}
