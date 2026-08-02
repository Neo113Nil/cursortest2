package xsna;

import android.os.Looper;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.u3z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class p6z0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p6z0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.b) {
            case 0:
                kbz0 kbz0Var = (kbz0) this.c;
                sp50 sp50Var = (sp50) this.d;
                kiw kiwVar = kbz0Var.a;
                WeakHashMap weakHashMap = o2z0.c;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    gu8.e(null, "ImageLoaderUtils: Method cancel called from worker thread");
                } else {
                    Iterator it = weakHashMap.keySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ImageView imageView = (ImageView) it.next();
                            if (weakHashMap.get(imageView) == kiwVar) {
                                o2z0.d(kiwVar, imageView);
                            }
                        }
                    }
                }
                sp50Var.a.set(true);
                sp50Var.c.onError(new Exception(com.vk.movika.sdk.base.model.history.b.b(4, "Loading Error [", "] ", "Loading was canceled")));
                break;
            default:
                zfz0 zfz0Var = (zfz0) this.c;
                t8z0 t8z0Var = (t8z0) this.d;
                u3z0.a aVar = (u3z0.a) this.e;
                String str2 = (String) this.f;
                zfz0Var.getClass();
                if (t8z0Var != null) {
                    if (aVar == null || !aVar.a() || (str = aVar.b) == null) {
                        str = null;
                    }
                    if (str != null) {
                        str2 = str;
                    }
                    t8z0Var.accept(str2);
                    break;
                }
                break;
        }
    }
}
