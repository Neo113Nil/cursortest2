package xsna;

import android.content.Context;
import com.vk.photo.editor.domain.LowMemoryException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.ba00;

/* compiled from: FilterRepository.kt */
/* loaded from: classes4.dex */
public final class mdr {
    public final ba00 a;
    public final utk0 b;
    public final b8f0 c;
    public final utk0 d;
    public final b8f0 e;
    public final utk0 f;
    public final b8f0 g;
    public final wi50 h;
    public final AtomicBoolean i;
    public final a j;

    /* compiled from: FilterRepository.kt */
    public static final class a implements ba00.a {
        public a() {
        }

        @Override // xsna.ba00.a
        public final void a(ArrayList arrayList) {
            utk0 utk0Var = mdr.this.b;
            utk0Var.getClass();
            utk0Var.i(null, arrayList);
        }

        @Override // xsna.ba00.a
        public final void b() {
            utk0 utk0Var = mdr.this.d;
            Boolean bool = Boolean.TRUE;
            utk0Var.getClass();
            utk0Var.i(null, bool);
        }

        @Override // xsna.ba00.a
        public final void c() {
            utk0 utk0Var = mdr.this.d;
            Boolean bool = Boolean.FALSE;
            utk0Var.getClass();
            utk0Var.i(null, bool);
        }

        @Override // xsna.ba00.a
        public final void d(LowMemoryException lowMemoryException) {
            utk0 utk0Var = mdr.this.f;
            utk0Var.getClass();
            utk0Var.i(null, lowMemoryException);
        }
    }

    public mdr(ba00 ba00Var, z900 z900Var) {
        this.a = ba00Var;
        utk0 a2 = vtk0.a(EmptyList.b);
        this.b = a2;
        this.c = rsr.f(a2);
        utk0 a3 = vtk0.a(Boolean.FALSE);
        this.d = a3;
        this.e = rsr.f(a3);
        utk0 a4 = vtk0.a(null);
        this.f = a4;
        this.g = rsr.f(a4);
        this.h = bay.a();
        this.i = new AtomicBoolean(false);
        this.j = new a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (f(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, ContinuationImpl continuationImpl) {
        idr idrVar;
        int i;
        if (continuationImpl instanceof idr) {
            idrVar = (idr) continuationImpl;
            int i2 = idrVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                idrVar.label = i2 - Integer.MIN_VALUE;
                Object obj = idrVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = idrVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    idrVar.L$0 = null;
                    idrVar.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        for (y900 y900Var : (List) obj) {
                            if (y900Var.b()) {
                                return z900.b(y900Var);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    kotlin.a.a(obj);
                }
                jdr jdrVar = new jdr(2, null);
                idrVar.L$0 = null;
                idrVar.label = 2;
                obj = rsr.o(this.c, jdrVar, idrVar);
            }
        }
        idrVar = new idr(this, continuationImpl);
        Object obj3 = idrVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = idrVar.label;
        if (i != 0) {
        }
        jdr jdrVar2 = new jdr(2, null);
        idrVar.L$0 = null;
        idrVar.label = 2;
        obj3 = rsr.o(this.c, jdrVar2, idrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, ContinuationImpl continuationImpl) {
        kdr kdrVar;
        int i2;
        Iterator it;
        Iterable u0;
        if (continuationImpl instanceof kdr) {
            kdrVar = (kdr) continuationImpl;
            int i3 = kdrVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kdrVar.label = i3 - Integer.MIN_VALUE;
                Object obj = kdrVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = kdrVar.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    ldr ldrVar = new ldr(2, null);
                    kdrVar.I$0 = i;
                    kdrVar.label = 1;
                    obj = rsr.o(this.c, ldrVar, kdrVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = kdrVar.I$0;
                    kotlin.a.a(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (y900 y900Var : (List) obj) {
                    if (y900Var instanceof v900) {
                        u0 = Collections.singletonList(y900Var);
                    } else {
                        if (!(y900Var instanceof w900)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        u0 = j5g.u0(((w900) y900Var).f, Collections.singletonList(y900Var));
                    }
                    g5g.y(u0, arrayList);
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((y900) next).a() == i) {
                        return next;
                    }
                }
                return null;
            }
        }
        kdrVar = new kdr(this, continuationImpl);
        Object obj2 = kdrVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = kdrVar.label;
        if (i2 != 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r7.hasNext()) {
        }
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, ContinuationImpl continuationImpl) {
        ndr ndrVar;
        int i2;
        y900 y900Var;
        if (continuationImpl instanceof ndr) {
            ndrVar = (ndr) continuationImpl;
            int i3 = ndrVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ndrVar.label = i3 - Integer.MIN_VALUE;
                Object obj = ndrVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = ndrVar.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    ndrVar.I$0 = i;
                    ndrVar.label = 1;
                    obj = b(i, ndrVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                y900Var = (y900) obj;
                if (y900Var != null) {
                    this.a.c(y900Var);
                }
                return s3q0.a;
            }
        }
        ndrVar = new ndr(this, continuationImpl);
        Object obj3 = ndrVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = ndrVar.label;
        if (i2 != 0) {
        }
        y900Var = (y900) obj3;
        if (y900Var != null) {
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, ContinuationImpl continuationImpl) {
        odr odrVar;
        int i2;
        y900 y900Var;
        if (continuationImpl instanceof odr) {
            odrVar = (odr) continuationImpl;
            int i3 = odrVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                odrVar.label = i3 - Integer.MIN_VALUE;
                Object obj = odrVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = odrVar.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    odrVar.I$0 = i;
                    odrVar.label = 1;
                    obj = b(i, odrVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                y900Var = (y900) obj;
                if (y900Var != null) {
                    this.a.d(y900Var);
                }
                return s3q0.a;
            }
        }
        odrVar = new odr(this, continuationImpl);
        Object obj3 = odrVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = odrVar.label;
        if (i2 != 0) {
        }
        y900Var = (y900) obj3;
        if (y900Var != null) {
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, ContinuationImpl continuationImpl) {
        pdr pdrVar;
        int i2;
        y900 y900Var;
        if (continuationImpl instanceof pdr) {
            pdrVar = (pdr) continuationImpl;
            int i3 = pdrVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pdrVar.label = i3 - Integer.MIN_VALUE;
                Object obj = pdrVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = pdrVar.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    pdrVar.I$0 = i;
                    pdrVar.label = 1;
                    obj = b(i, pdrVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                y900Var = (y900) obj;
                if (y900Var != null) {
                    this.a.a(y900Var);
                }
                return s3q0.a;
            }
        }
        pdrVar = new pdr(this, continuationImpl);
        Object obj3 = pdrVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = pdrVar.label;
        if (i2 != 0) {
        }
        y900Var = (y900) obj3;
        if (y900Var != null) {
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Context context, ContinuationImpl continuationImpl) {
        qdr qdrVar;
        int i;
        AtomicBoolean atomicBoolean;
        if (continuationImpl instanceof qdr) {
            qdrVar = (qdr) continuationImpl;
            int i2 = qdrVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qdrVar.label = i2 - Integer.MIN_VALUE;
                Object obj = qdrVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qdrVar.label;
                wi50 wi50Var = this.h;
                if (i != 0) {
                    kotlin.a.a(obj);
                    qdrVar.L$0 = context;
                    qdrVar.label = 1;
                    if (wi50Var.b(qdrVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = (Context) qdrVar.L$0;
                    kotlin.a.a(obj);
                }
                atomicBoolean = this.i;
                if (atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    wi50Var.c(null);
                    myc0.h(zvj.a(iyx.a()), null, null, new rdr(this, context, null), 3);
                } else {
                    wi50Var.c(null);
                }
                return s3q0.a;
            }
        }
        qdrVar = new qdr(this, continuationImpl);
        Object obj2 = qdrVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qdrVar.label;
        wi50 wi50Var2 = this.h;
        if (i != 0) {
        }
        atomicBoolean = this.i;
        if (atomicBoolean.get()) {
        }
        return s3q0.a;
    }
}
