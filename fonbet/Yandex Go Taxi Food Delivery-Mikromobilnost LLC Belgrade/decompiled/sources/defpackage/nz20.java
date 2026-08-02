package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnz20;", "", "Companion", "lz20", "mz20", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class nz20 {
    public static final mz20 Companion = new mz20();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new um20(14))};
    public final String a;
    public final List b;

    public /* synthetic */ nz20(int i, String str, List list) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz20)) {
            return false;
        }
        nz20 nz20Var = (nz20) obj;
        return jl40.l(this.a, nz20Var.a) && jl40.l(this.b, nz20Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nnm.h("ModalRatioHeightServiceDto(service=", this.a, ", configs=", Extension.C_BRAKE, this.b);
    }

    public nz20(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public nz20() {
        this(null, EmptyList.a);
    }
}
