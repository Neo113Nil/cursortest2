package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpxd;", "", "Companion", "nxd", "oxd", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class pxd {
    public static final oxd Companion = new oxd();
    public static final i3y[] c;
    public final jsq0 a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new kpd(13)), a.b(lazyThreadSafetyMode, new kpd(14))};
    }

    public /* synthetic */ pxd(int i, jsq0 jsq0Var, List list) {
        this.a = (i & 1) == 0 ? ksq0.a : jsq0Var;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public static final /* synthetic */ void d(pxd pxdVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = c;
        if (F || !jl40.l(pxdVar.a, ksq0.a)) {
            yjdVar.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), pxdVar.a);
        }
        if (!yjdVar.F() && jl40.l(pxdVar.b, EmptyList.a)) {
            return;
        }
        yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), pxdVar.b);
    }

    /* renamed from: b, reason: from getter */
    public final List getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final jsq0 getA() {
        return this.a;
    }

    public pxd() {
        this.a = ksq0.a;
        this.b = EmptyList.a;
    }
}
