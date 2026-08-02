package sg.bigo.ads.ad.banner;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes9.dex */
public final class f {
    private final List<WeakReference<sg.bigo.ads.d.c>> a;

    public static class a {
        private static f a = new f(0);
    }

    private f() {
        this.a = new LinkedList();
    }

    public final boolean a(@NonNull sg.bigo.ads.d.c cVar) {
        if (cVar.isExpired() || cVar.p() || cVar.i) {
            return false;
        }
        synchronized (this.a) {
            try {
                Iterator<WeakReference<sg.bigo.ads.d.c>> it = this.a.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    sg.bigo.ads.d.c cVar2 = it.next().get();
                    if (cVar2 == cVar) {
                        z = true;
                    } else {
                        if (cVar2 != null && !cVar2.isExpired() && !cVar2.p() && !cVar2.i) {
                        }
                        it.remove();
                    }
                }
                if (z || this.a.size() >= 3) {
                    return false;
                }
                this.a.add(new WeakReference<>(cVar));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(@NonNull sg.bigo.ads.d.c cVar) {
        if (cVar == null) {
            return false;
        }
        synchronized (this.a) {
            try {
                Iterator<WeakReference<sg.bigo.ads.d.c>> it = this.a.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == cVar) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ f(byte b) {
        this();
    }
}
