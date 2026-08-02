package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lg3e0;", "", "Companion", "e3e0", "f3e0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g3e0 {
    public static final f3e0 Companion = new f3e0();
    public final String a;
    public final u2t b;
    public final j3e0 c;

    public /* synthetic */ g3e0(int i, String str, u2t u2tVar, j3e0 j3e0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = u2tVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = j3e0Var;
        }
    }

    public static final /* synthetic */ void d(g3e0 g3e0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || g3e0Var.a != null) {
            yjdVar.g(serialDescriptor, 0, auu0.a, g3e0Var.a);
        }
        if (yjdVar.F() || g3e0Var.b != null) {
            yjdVar.g(serialDescriptor, 1, u2t.Companion.serializer(), g3e0Var.b);
        }
        if (!yjdVar.F() && g3e0Var.c == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 2, h3e0.a, g3e0Var.c);
    }

    /* renamed from: a, reason: from getter */
    public final u2t getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final j3e0 getC() {
        return this.c;
    }

    public g3e0() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
