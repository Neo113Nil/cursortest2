package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PhotosLinkProcessorDelegate.kt */
/* loaded from: classes11.dex */
public final class ofa0 implements iaz {
    public final Set<iaz> a;

    public ofa0(pga0 pga0Var, b25 b25Var) {
        this.a = rl3.y0(new iaz[]{new lea0(pga0Var, b25Var), new ip1(pga0Var), new yfa0(pga0Var), new cha0(pga0Var), new yca0(), new f860()});
    }

    @Override // xsna.iaz
    public final boolean a(peq0 peq0Var) {
        Set<iaz> set = this.a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (((iaz) it.next()).a(peq0Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.iaz
    public final boolean b(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        for (iaz iazVar : this.a) {
            if (iazVar.a(peq0Var)) {
                return iazVar.b(context, uri, launchContext, yp80Var, peq0Var);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
