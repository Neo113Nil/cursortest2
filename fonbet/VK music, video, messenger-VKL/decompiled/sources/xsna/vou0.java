package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: VkCxHubLinkProcessorDelegate.kt */
/* loaded from: classes11.dex */
public final class vou0 implements iaz {
    public final Set<wou0> a = Collections.singleton(new wou0());

    @Override // xsna.iaz
    public final boolean a(peq0 peq0Var) {
        if (!naz.y(peq0Var.h())) {
            return false;
        }
        Set<wou0> set = this.a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (((wou0) it.next()).a(peq0Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.iaz
    public final boolean b(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        for (wou0 wou0Var : this.a) {
            if (wou0Var.a(peq0Var)) {
                wou0Var.b(context, uri, launchContext, yp80Var, peq0Var);
                return true;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
