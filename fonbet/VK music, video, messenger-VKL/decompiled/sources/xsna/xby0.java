package xsna;

import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class xby0 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        jhy0 jhy0Var = (jhy0) obj;
        long j = jhy0Var.b;
        long j2 = jhy0Var.a;
        if (((int) ((j - j2) + 1)) == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            return sb.toString();
        }
        return j + "-" + j2;
    }
}
