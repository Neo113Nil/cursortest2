package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.List;
import java.util.Map;

/* compiled from: CatalogCache.kt */
/* loaded from: classes6.dex */
public final class v2a {
    public static final v2a a = new v2a();
    public static volatile a.b b;

    /* compiled from: CatalogCache.kt */
    public static abstract class a {

        /* compiled from: CatalogCache.kt */
        /* renamed from: xsna.v2a$a$a, reason: collision with other inner class name */
        public static final class C3866a extends a {
            public static final C3866a a = new C3866a();
        }

        /* compiled from: CatalogCache.kt */
        public static final class b extends a {
            public final List<x7a> a;
            public final Map<Long, WebApiApplication> b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(List<? extends x7a> list, Map<Long, WebApiApplication> map) {
                this.a = list;
                this.b = map;
            }
        }
    }
}
