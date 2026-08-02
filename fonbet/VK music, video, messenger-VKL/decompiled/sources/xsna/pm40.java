package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.sw50;

/* compiled from: MusicLinksHandlerImpl.kt */
/* loaded from: classes3.dex */
public final class pm40 implements sw50.i {
    public final a550 a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new lg(24));

    public pm40(a550 a550Var) {
        this.a = a550Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50.i
    public final Boolean a(Context context, LaunchContext launchContext, peq0 peq0Var) {
        Object obj;
        Iterator it = ((List) this.b.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((om40) obj).a(peq0Var)) {
                break;
            }
        }
        om40 om40Var = (om40) obj;
        if (om40Var == null) {
            return null;
        }
        om40Var.b(peq0Var, this.a, context, launchContext);
        return Boolean.TRUE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50.i
    public final boolean b(peq0 peq0Var) {
        List list = (List) this.b.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((om40) it.next()).a(peq0Var)) {
                return true;
            }
        }
        return false;
    }
}
