package xsna;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.List;
import xsna.yhq;

/* compiled from: ModelLoaderRegistry.java */
/* loaded from: classes12.dex */
public final class d330 {
    public final j540 a;
    public final a b;

    /* compiled from: ModelLoaderRegistry.java */
    public static class a {
        public final HashMap a = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: xsna.d330$a$a, reason: collision with other inner class name */
        public static class C2701a<Model> {
            public final List<b330<Model, ?>> a;

            public C2701a(List<b330<Model, ?>> list) {
                this.a = list;
            }
        }
    }

    public d330(@NonNull yhq.c cVar) {
        j540 j540Var = new j540(cVar);
        this.b = new a();
        this.a = j540Var;
    }
}
