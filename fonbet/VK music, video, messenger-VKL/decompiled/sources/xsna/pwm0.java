package xsna;

import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.video.ui.discovery.minimizable.c;
import java.util.Iterator;

/* compiled from: SubscribePromoDelegate.kt */
/* loaded from: classes7.dex */
public final class pwm0 {
    public final gsq0 a;
    public final skj0 b;
    public final fks0 c;
    public final c71 d;
    public boolean e;
    public io.reactivex.rxjava3.disposables.c f;
    public final io.reactivex.rxjava3.subjects.d<Boolean> g;

    public pwm0(gsq0 gsq0Var, skj0 skj0Var, fks0 fks0Var) {
        c71 c71Var = new c71();
        this.a = gsq0Var;
        this.b = skj0Var;
        this.c = fks0Var;
        this.d = c71Var;
        this.g = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
    }

    public static AboutVideoItem.d a(com.vk.video.ui.discovery.minimizable.q qVar) {
        Object obj;
        Iterator<T> it = qVar.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((hfz) obj) instanceof AboutVideoItem.d) {
                break;
            }
        }
        if (obj instanceof AboutVideoItem.d) {
            return (AboutVideoItem.d) obj;
        }
        return null;
    }

    public final void b() {
        c71 c71Var = this.d;
        if (c71Var.d.get() != null) {
            c71Var.a();
        }
        this.g.onNext(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this.b.invoke(new c.d(4, bool, bool, null));
    }
}
