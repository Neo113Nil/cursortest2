package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnrz0;", "", "Companion", "lrz0", "mrz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class nrz0 {
    public static final mrz0 Companion = new mrz0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ nrz0(int i, String str, String str2, String str3) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
    }

    public static final /* synthetic */ void a(nrz0 nrz0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(nrz0Var.a, "")) {
            yjdVar.o(serialDescriptor, 0, nrz0Var.a);
        }
        if (yjdVar.F() || !jl40.l(nrz0Var.b, "")) {
            yjdVar.o(serialDescriptor, 1, nrz0Var.b);
        }
        if (!yjdVar.F() && jl40.l(nrz0Var.c, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 2, nrz0Var.c);
    }

    public nrz0() {
        this.a = "";
        this.b = "";
        this.c = "";
    }
}
