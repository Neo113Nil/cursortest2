package xsna;

import android.content.Context;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.sw50;

/* compiled from: ClipsLinksHandlerImpl.kt */
/* loaded from: classes17.dex */
public final class kke implements sw50.b, w8i {
    public final ClipsRouter b;
    public final Object c;
    public final List<pje> d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public kke(ClipsRouter clipsRouter, Lazy lazy) {
        EmptyList emptyList = EmptyList.b;
        this.b = clipsRouter;
        this.c = lazy;
        this.d = emptyList;
        com.vk.newsfeed.posting.mediapicker.photovk.base.a aVar = new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, aVar);
        this.f = msy.a(lazyThreadSafetyMode, new f1(this, 21));
        this.g = msy.a(lazyThreadSafetyMode, new ng1(this, 21));
        this.h = msy.a(lazyThreadSafetyMode, new yc(this, 25));
        this.i = msy.a(lazyThreadSafetyMode, new j1(this, 28));
        this.j = msy.a(lazyThreadSafetyMode, new hd(this, 22));
        this.k = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.f(this, 23));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50.b
    public final Boolean a(Context context, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        Object obj;
        Iterator it = ((List) this.k.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((pje) obj).a(peq0Var)) {
                break;
            }
        }
        pje pjeVar = (pje) obj;
        if (pjeVar != null) {
            return Boolean.valueOf(pjeVar.b(peq0Var, this.b, context, launchContext, yp80Var));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50.b
    public final boolean b(peq0 peq0Var) {
        List list = (List) this.k.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((pje) it.next()).a(peq0Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final zof c() {
        return (zof) this.e.getValue();
    }
}
