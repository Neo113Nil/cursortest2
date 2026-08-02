package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.sw50;

/* compiled from: VideoLinksHandlerImpl.kt */
/* loaded from: classes14.dex */
public final class lss0 implements sw50.r {
    public final ydt0 a;
    public final Object b;

    public lss0(ydt0 ydt0Var, Lazy lazy) {
        this.a = ydt0Var;
        this.b = msy.a(LazyThreadSafetyMode.NONE, new dei0(lazy, 27));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50.r
    public final Boolean a(Context context, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        Object obj;
        Iterator it = ((List) this.b.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((kss0) obj).a(peq0Var)) {
                break;
            }
        }
        kss0 kss0Var = (kss0) obj;
        if (kss0Var != null) {
            return kss0Var.b(peq0Var, this.a, context, launchContext, yp80Var);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50.r
    public final boolean b(peq0 peq0Var) {
        List list = (List) this.b.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((kss0) it.next()).a(peq0Var)) {
                return true;
            }
        }
        return false;
    }
}
