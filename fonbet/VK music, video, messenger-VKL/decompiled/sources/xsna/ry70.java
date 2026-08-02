package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.o;
import okhttp3.p;

/* compiled from: OkHttpTransport.java */
/* loaded from: classes8.dex */
public final class ry70 {

    @NonNull
    public final tx70 a;

    @NonNull
    public final okhttp3.o b;

    @Nullable
    public final Map<String, String> c;

    /* compiled from: OkHttpTransport.java */
    public class a implements lb9 {
        public final /* synthetic */ jbg0 b;
        public final /* synthetic */ dwp c;

        public a(jbg0 jbg0Var, dwp dwpVar) {
            this.b = jbg0Var;
            this.c = dwpVar;
        }

        @Override // xsna.lb9
        public final void onFailure(okhttp3.d dVar, IOException iOException) {
            Objects.toString(iOException);
            this.c.b(iOException);
        }

        @Override // xsna.lb9
        public final void onResponse(okhttp3.d dVar, okhttp3.u uVar) throws IOException {
            Objects.toString(uVar);
            okhttp3.v vVar = uVar.h;
            this.b.c(vVar != null ? vVar.string() : "");
        }
    }

    public ry70(@Nullable Map<String, String> map) {
        tx70 tx70Var = new tx70();
        this.a = tx70Var;
        o.a aVar = new o.a();
        aVar.j = tx70Var;
        this.b = new okhttp3.o(aVar);
        this.c = map;
    }

    public final void a(String str, @Nullable jbg0 jbg0Var, @Nullable dwp dwpVar) {
        p.a aVar = new p.a();
        aVar.i(str);
        Map<String, String> map = this.c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
        }
        ((f8f0) this.b.a(aVar.b())).f9(new a(jbg0Var, dwpVar));
    }
}
