package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj4e0;", "", "Companion", "h4e0", "i4e0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j4e0 {
    public static final i4e0 Companion = new i4e0();
    public final String a;
    public final m4e0 b;
    public final p4e0 c;

    public /* synthetic */ j4e0(int i, String str, m4e0 m4e0Var, p4e0 p4e0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = m4e0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = p4e0Var;
        }
    }

    public static final /* synthetic */ void d(j4e0 j4e0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || j4e0Var.a != null) {
            yjdVar.g(serialDescriptor, 0, auu0.a, j4e0Var.a);
        }
        if (yjdVar.F() || j4e0Var.b != null) {
            yjdVar.g(serialDescriptor, 1, k4e0.a, j4e0Var.b);
        }
        if (!yjdVar.F() && j4e0Var.c == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 2, n4e0.a, j4e0Var.c);
    }

    /* renamed from: a, reason: from getter */
    public final m4e0 getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final p4e0 getC() {
        return this.c;
    }

    public j4e0() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
