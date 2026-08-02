package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhyd;", "", "Companion", "dyd", "fyd", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class hyd {
    public static final fyd Companion = new fyd();
    public static final i3y[] c;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new kpd(16)), a.b(lazyThreadSafetyMode, new kpd(18))};
    }

    public /* synthetic */ hyd(List list, List list2, int i) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
    }

    public static final /* synthetic */ void d(hyd hydVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        boolean F = yjdVar.F();
        EmptyList emptyList = EmptyList.a;
        i3y[] i3yVarArr = c;
        if (F || !jl40.l(hydVar.a, emptyList)) {
            yjdVar.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), hydVar.a);
        }
        if (!yjdVar.F() && jl40.l(hydVar.b, emptyList)) {
            return;
        }
        yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), hydVar.b);
    }

    /* renamed from: b, reason: from getter */
    public final List getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final List getA() {
        return this.a;
    }

    public final String toString() {
        return xvz.l("ConditionalAction(conditions=", this.a, ", actions=", this.b, Extension.C_BRAKE);
    }

    public hyd(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hyd() {
        this(r0, r0);
        EmptyList emptyList = EmptyList.a;
    }
}
