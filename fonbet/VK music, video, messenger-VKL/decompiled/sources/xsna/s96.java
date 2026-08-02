package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.List;

/* compiled from: AppItems.kt */
/* loaded from: classes6.dex */
public abstract class s96 extends d56 {
    public final List<WebApiApplication> b;

    public s96(List<WebApiApplication> list) {
        this.b = list;
    }

    @Override // xsna.d56
    public final boolean a(d56 d56Var) {
        if (d56Var instanceof wu9) {
            return epx.f(((wu9) d56Var).b, this.b);
        }
        return false;
    }

    @Override // xsna.d56
    public final boolean b(d56 d56Var) {
        return (d56Var instanceof wu9) && epx.f(((wu9) d56Var).b, this.b);
    }
}
