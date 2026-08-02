package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;

/* compiled from: AnimojiDependency.kt */
/* loaded from: classes7.dex */
public interface or2 {

    /* compiled from: AnimojiDependency.kt */
    public interface a {

        /* compiled from: AnimojiDependency.kt */
        /* renamed from: xsna.or2$a$a, reason: collision with other inner class name */
        public interface InterfaceC3466a {
            UserId a();

            CallId b();

            xdw0 c();

            void d(String str);

            boolean e();
        }

        o5x0 a(InterfaceC3466a interfaceC3466a);
    }

    io.reactivex.rxjava3.core.q<Object> a();

    void b();

    boolean c();

    void d(UserId userId);

    a e();

    w5w0 f(b6w0 b6w0Var, UserId userId);

    String g();
}
