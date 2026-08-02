package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* loaded from: classes11.dex */
public final class rz3 {
    public final m900<b, a> a = new m900<>(16);
    public final ph50<b, a> b = h5h0.b();
    public final xa4 c = new xa4(25);

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @vby
    public static final class a {
        public final Object a;

        public /* synthetic */ a(Object obj) {
            this.a = obj;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return epx.f(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "AsyncTypefaceResult(result=" + this.a + ')';
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    public static final class b {
        public final n4s a;
        public final Object b;

        public b(n4s n4sVar, Object obj) {
            this.a = n4sVar;
            this.b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Object obj = this.b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(font=");
            sb.append(this.a);
            sb.append(", loaderKey=");
            return k73.c(sb, this.b, ')');
        }
    }

    public static void a(rz3 rz3Var, n4s n4sVar, v82 v82Var, Object obj) {
        rz3Var.getClass();
        v82Var.getClass();
        Object obj2 = null;
        b bVar = new b(n4sVar, null);
        synchronized (rz3Var.c) {
            try {
                if (obj == null) {
                    rz3Var.b.p(bVar, new a(obj2));
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    rz3Var.a.put(bVar, new a(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(n4s n4sVar, v82 v82Var, ey3 ey3Var, ContinuationImpl continuationImpl) {
        sz3 sz3Var;
        int i;
        boolean z;
        b bVar;
        if (continuationImpl instanceof sz3) {
            sz3Var = (sz3) continuationImpl;
            int i2 = sz3Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sz3Var.label = i2 - Integer.MIN_VALUE;
                Object obj = sz3Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sz3Var.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.a.a(obj);
                    v82Var.getClass();
                    b bVar2 = new b(n4sVar, null);
                    synchronized (this.c) {
                        try {
                            a aVar = this.a.get(bVar2);
                            if (aVar == null) {
                                aVar = this.b.d(bVar2);
                            }
                            if (aVar != null) {
                                return aVar.a;
                            }
                            s3q0 s3q0Var = s3q0.a;
                            sz3Var.L$0 = bVar2;
                            z = false;
                            sz3Var.Z$0 = false;
                            sz3Var.label = 1;
                            Object invoke = ey3Var.invoke(sz3Var);
                            if (invoke == obj2) {
                                return obj2;
                            }
                            obj = invoke;
                            bVar = bVar2;
                        } finally {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = sz3Var.Z$0;
                    bVar = (b) sz3Var.L$0;
                    kotlin.a.a(obj);
                }
                synchronized (this.c) {
                    try {
                        if (obj == null) {
                            this.b.p(bVar, new a(obj3));
                        } else if (z) {
                            this.b.p(bVar, new a(obj));
                        } else {
                            this.a.put(bVar, new a(obj));
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                    } finally {
                    }
                }
                return obj;
            }
        }
        sz3Var = new sz3(this, continuationImpl);
        Object obj4 = sz3Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sz3Var.label;
        Object obj32 = null;
        if (i != 0) {
        }
        synchronized (this.c) {
        }
    }
}
