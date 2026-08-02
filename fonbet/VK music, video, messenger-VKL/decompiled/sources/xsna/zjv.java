package xsna;

import java.util.List;

/* compiled from: HttpPipelineFactory.kt */
/* loaded from: classes2.dex */
public final class zjv {

    /* compiled from: HttpPipelineFactory.kt */
    public static final class a {
        public final int a;
        public final ckv b;
        public final yjv c;

        public a(int i, ckv ckvVar, yjv yjvVar) {
            this.a = i;
            this.b = ckvVar;
            this.c = yjvVar;
        }

        public final yjv a() {
            return this.c;
        }

        public final ckv b() {
            return this.b;
        }

        public final mkv c(ckv ckvVar) {
            int i = this.a + 1;
            yjv yjvVar = this.c;
            List<ojv> list = yjvVar.e;
            ojv ojvVar = (ojv) j5g.b0(i, list);
            if (ojvVar != null) {
                return ojvVar.a(new a(i, ckvVar, yjvVar));
            }
            throw new IllegalStateException(go9.c("Seem's like there's no interceptor, which really executes the request, so chain cannot be completed. Interceptors: ", list));
        }
    }

    public static a a(som0 som0Var, kjy kjyVar, ckv ckvVar, List list) {
        return new a(-1, ckvVar, new yjv(som0Var, new wiv(), kjyVar, ckvVar, list));
    }
}
