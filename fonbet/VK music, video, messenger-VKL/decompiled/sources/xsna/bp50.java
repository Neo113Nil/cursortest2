package xsna;

import android.content.Context;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MyTargetAdChoicesController.kt */
/* loaded from: classes2.dex */
public final class bp50 implements i620 {
    public fvy0 b;
    public final ArrayList<b520> c = new ArrayList<>();
    public a d;
    public boolean e;

    /* compiled from: MyTargetAdChoicesController.kt */
    public interface a {
        void a(Context context, ArrayList arrayList);
    }

    public final void a() {
        Object obj;
        Iterator<T> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((b520) obj).b, "cancel")) {
                    break;
                }
            }
        }
        b520 b520Var = (b520) obj;
        if (b520Var != null) {
            d(b520Var);
        }
    }

    @Override // xsna.i620
    public final a520 b() {
        return new b();
    }

    public final void c(String str) {
        b520 b520Var;
        fvy0 fvy0Var;
        Iterator<b520> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                b520Var = null;
                break;
            } else {
                b520Var = it.next();
                if (epx.f(b520Var.c, str)) {
                    break;
                }
            }
        }
        b520 b520Var2 = b520Var;
        if (b520Var2 == null || (fvy0Var = this.b) == null) {
            return;
        }
        fvy0Var.a(b520Var2);
    }

    public final void d(b520 b520Var) {
        fvy0 fvy0Var = this.b;
        if (fvy0Var != null) {
            fvy0Var.a(b520Var);
        }
    }

    /* compiled from: MyTargetAdChoicesController.kt */
    public static final class b implements a520 {
        public b() {
        }

        @Override // xsna.a520
        public final void a(fvy0 fvy0Var) {
            bp50.this.b = fvy0Var;
        }

        @Override // xsna.a520
        public final void b(b520 b520Var) {
            bp50.this.c.add(b520Var);
        }

        @Override // xsna.a520
        public final void c(Context context) {
            bp50 bp50Var = bp50.this;
            ArrayList arrayList = bp50Var.c;
            if (!bp50Var.e) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<b520> it = arrayList.iterator();
                while (it.hasNext()) {
                    b520 next = it.next();
                    b520 b520Var = next;
                    if (epx.f(b520Var.b, BuildConfig.FLAVOR) || epx.f(b520Var.b, "copy")) {
                        arrayList2.add(next);
                    }
                }
                arrayList = arrayList2;
            }
            a aVar = bp50Var.d;
            if (aVar != null) {
                aVar.a(context, arrayList);
            }
        }

        @Override // xsna.a520
        public final void dismiss() {
        }

        @Override // xsna.a520
        public final void d(String str) {
        }
    }
}
