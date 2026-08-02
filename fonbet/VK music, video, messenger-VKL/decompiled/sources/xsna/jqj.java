package xsna;

import java.util.Map;

/* compiled from: ControllerListener2.kt */
/* loaded from: classes12.dex */
public interface jqj<INFO> {

    /* compiled from: ControllerListener2.kt */
    public static final class a {
        public Map<String, ? extends Object> a;
        public Map<String, ? extends Object> b;
        public Map<String, ? extends Object> c;
        public Map<String, ? extends Object> d;
        public Object e;
    }

    void a(Object obj, String str);

    void b(String str);

    void c(String str, Object obj, a aVar);

    void d(String str, a aVar);

    void e(String str, Throwable th, a aVar);

    void f(String str, INFO info, a aVar);
}
