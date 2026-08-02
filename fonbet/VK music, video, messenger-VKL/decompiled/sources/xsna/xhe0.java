package xsna;

import com.vk.dto.Push;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PushHandlerBridge.kt */
/* loaded from: classes15.dex */
public interface xhe0 {
    static {
        Object obj = a.a;
    }

    void b();

    void c(Push push);

    void d();

    /* compiled from: PushHandlerBridge.kt */
    public static final class a {
        public static final Object a = msy.a(LazyThreadSafetyMode.NONE, new xk70(5));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final xhe0 getSTUB() {
            return (xhe0) a.getValue();
        }

        /* compiled from: PushHandlerBridge.kt */
        /* renamed from: xsna.xhe0$a$a, reason: collision with other inner class name */
        public static final class C4004a implements xhe0 {
            @Override // xsna.xhe0
            public final void b() {
            }

            @Override // xsna.xhe0
            public final void d() {
            }

            @Override // xsna.xhe0
            public final void a(String str) {
            }

            @Override // xsna.xhe0
            public final void c(Push push) {
            }
        }
    }

    default void a(String str) {
    }
}
