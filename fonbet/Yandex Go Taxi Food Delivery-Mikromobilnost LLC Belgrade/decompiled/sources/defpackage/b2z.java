package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import defpackage.vmr0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class b2z {
    public final vmr0 a;
    public final w53 b = new w53();
    public final vmr0.a c = new vmr0.a();
    public int d;
    public int e;
    public int f;

    public b2z(vmr0 vmr0Var) {
        this.a = vmr0Var;
    }

    public final void a() {
        synchronized (this) {
            try {
                Iterator it = this.b.entrySet().iterator();
                while (it.hasNext()) {
                    String str = (String) ((Map.Entry) it.next()).getKey();
                    this.a.a.e(new Pair(this.c, str));
                }
                this.b.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, Bitmap bitmap, Uri uri) {
        this.a.a.d(new Pair(this.c, str), bitmap);
        synchronized (this) {
            this.b.put(str, new z1z(new WeakReference(bitmap), uri));
            int i = this.f + 1;
            this.f = i;
            if (i % 1024 == 0) {
                Iterator it = this.b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((z1z) ((Map.Entry) it.next()).getValue()).a.get() == null) {
                        it.remove();
                    }
                }
            }
        }
    }
}
