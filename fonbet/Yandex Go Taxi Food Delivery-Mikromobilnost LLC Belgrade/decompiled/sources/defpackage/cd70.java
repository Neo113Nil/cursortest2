package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcd70;", "", "Companion", "ad70", "bd70", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class cd70 {
    public static final bd70 Companion = new bd70();
    public final uc4 a;
    public final String b;
    public final String c;
    public final ed70 d;

    public /* synthetic */ cd70(int i, uc4 uc4Var, String str, String str2, ed70 ed70Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = uc4Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = ed70Var;
        }
    }

    public static final /* synthetic */ void c(cd70 cd70Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || cd70Var.a != null) {
            yjdVar.g(serialDescriptor, 0, uc4.Companion.serializer(), cd70Var.a);
        }
        if (yjdVar.F() || cd70Var.b != null) {
            yjdVar.g(serialDescriptor, 1, auu0.a, cd70Var.b);
        }
        if (yjdVar.F() || cd70Var.c != null) {
            yjdVar.g(serialDescriptor, 2, auu0.a, cd70Var.c);
        }
        if (!yjdVar.F() && cd70Var.d == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 3, kd70.e, cd70Var.d);
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final uc4 getA() {
        return this.a;
    }

    public cd70() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
