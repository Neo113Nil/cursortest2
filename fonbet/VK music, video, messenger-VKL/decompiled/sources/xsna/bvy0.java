package xsna;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.o9y0;
import xsna.osy0;
import xsna.s8y0;

/* compiled from: SensorsDataRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class bvy0 implements yty0 {
    public final Handler a;
    public final n9y0 b;
    public final n9y0 c;
    public final n9y0 d;
    public o9y0.a e;
    public o9y0.b f;
    public o9y0.c g;
    public List<? extends com.vk.id.captcha.c.a.b> h = EmptyList.b;
    public boolean i;
    public boolean j;
    public boolean k;

    /* compiled from: SensorsDataRepositoryImpl.kt */
    public static final class a {

        /* compiled from: SensorsDataRepositoryImpl.kt */
        /* renamed from: xsna.bvy0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2626a extends FunctionReferenceImpl implements izs<float[], o9y0.a> {
            @Override // xsna.izs
            public final o9y0.a invoke(float[] fArr) {
                float[] fArr2 = fArr;
                ((o9y0.a.C3444a) this.receiver).getClass();
                return new o9y0.a(fArr2[0], fArr2[1], fArr2[2]);
            }
        }

        /* compiled from: SensorsDataRepositoryImpl.kt */
        public /* synthetic */ class b extends FunctionReferenceImpl implements izs<float[], o9y0.b> {
            @Override // xsna.izs
            public final o9y0.b invoke(float[] fArr) {
                float[] fArr2 = fArr;
                ((o9y0.b.a) this.receiver).getClass();
                return new o9y0.b(fArr2[0], fArr2[1], fArr2[2]);
            }
        }

        /* compiled from: SensorsDataRepositoryImpl.kt */
        public /* synthetic */ class c extends FunctionReferenceImpl implements izs<float[], o9y0.c> {
            @Override // xsna.izs
            public final o9y0.c invoke(float[] fArr) {
                ((o9y0.c.a) this.receiver).getClass();
                float f = fArr[0];
                return new o9y0.c(f, f, f);
            }
        }

        public static bvy0 a(Context context) {
            return new bvy0(s8y0.d.a().d, new n9y0(1, context, new C2626a(1, o9y0.a.e, o9y0.a.C3444a.class, "a", "a([F)Lcom/vk/id/captcha/c/a/a$a;", 0)), new n9y0(4, context, new b(1, o9y0.b.e, o9y0.b.a.class, "a", "a([F)Lcom/vk/id/captcha/c/a/a$b;", 0)), new n9y0(11, context, new c(1, o9y0.c.e, o9y0.c.a.class, "a", "a([F)Lcom/vk/id/captcha/c/a/a$c;", 0)));
        }
    }

    /* compiled from: SensorsDataRepositoryImpl.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.vk.id.captcha.c.a.b.h().length];
            try {
                iArr[com.vk.id.captcha.c.a.b.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.vk.id.captcha.c.a.b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.vk.id.captcha.c.a.b.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public bvy0(Handler handler, n9y0 n9y0Var, n9y0 n9y0Var2, n9y0 n9y0Var3) {
        this.a = handler;
        this.b = n9y0Var;
        this.c = n9y0Var2;
        this.d = n9y0Var3;
    }

    public static final /* synthetic */ void b(bvy0 bvy0Var, izs izsVar) {
        o9y0.a aVar = bvy0Var.e;
        o9y0.b bVar = bvy0Var.f;
        o9y0.c cVar = bvy0Var.g;
        ArrayList arrayList = new ArrayList();
        Iterator<? extends com.vk.id.captcha.c.a.b> it = bvy0Var.h.iterator();
        while (it.hasNext()) {
            int i = b.a[it.next().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && cVar != null && bvy0Var.k) {
                        arrayList.add(cVar);
                    }
                } else if (bVar != null && bvy0Var.j) {
                    arrayList.add(bVar);
                }
            } else if (aVar != null && bvy0Var.i) {
                arrayList.add(aVar);
            }
        }
        if (arrayList.size() == bvy0Var.h.size()) {
            bvy0Var.a.post(new he6(11, izsVar, arrayList));
            Iterator<? extends com.vk.id.captcha.c.a.b> it2 = bvy0Var.h.iterator();
            while (it2.hasNext()) {
                int i2 = b.a[it2.next().ordinal()];
                if (i2 == 1) {
                    bvy0Var.i = false;
                } else if (i2 == 2) {
                    bvy0Var.j = false;
                } else if (i2 == 3) {
                    bvy0Var.k = false;
                }
            }
        }
    }

    @Override // xsna.yty0
    public final void a(ArrayList arrayList, int i, osy0.a aVar) {
        this.h = arrayList;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i2 = b.a[((com.vk.id.captcha.c.a.b) it.next()).ordinal()];
            if (i2 == 1) {
                n9y0 n9y0Var = this.b;
                n9y0Var.b(i);
                n9y0Var.e = new yuy0(this, aVar);
            } else if (i2 == 2) {
                n9y0 n9y0Var2 = this.c;
                n9y0Var2.b(i);
                n9y0Var2.e = new zuy0(this, aVar);
            } else if (i2 == 3) {
                n9y0 n9y0Var3 = this.d;
                n9y0Var3.b(i);
                n9y0Var3.e = new avy0(this, aVar);
            }
        }
    }

    @Override // xsna.yty0
    public final void a() {
        this.b.a();
        this.c.a();
        this.d.a();
    }
}
