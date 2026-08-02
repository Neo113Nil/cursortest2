package xsna;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: ScatterSet.kt */
/* loaded from: classes11.dex */
public final class rh50<E> extends fzi0<E> implements pcy {
    public final qh50<E> c;

    /* compiled from: ScatterSet.kt */
    public static final class a implements Iterator<E>, gcy {
        public int b = -1;
        public final vki0 c;
        public final /* synthetic */ rh50<E> d;

        /* compiled from: ScatterSet.kt */
        @b6l(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1188}, m = "invokeSuspend")
        /* renamed from: xsna.rh50$a$a, reason: collision with other inner class name */
        public static final class C3608a extends RestrictedSuspendLambda implements wzs<ali0<? super E>, spj<? super s3q0>, Object> {
            int I$0;
            int I$1;
            int I$2;
            int I$3;
            long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ rh50<E> this$0;
            final /* synthetic */ a this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3608a(rh50<E> rh50Var, a aVar, spj<? super C3608a> spjVar) {
                super(2, spjVar);
                this.this$0 = rh50Var;
                this.this$1 = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C3608a c3608a = new C3608a(this.this$0, this.this$1, spjVar);
                c3608a.L$0 = obj;
                return c3608a;
            }

            @Override // xsna.wzs
            public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
                return ((C3608a) create((ali0) obj, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x006f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x009b -> B:5:0x009e). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0057 -> B:15:0x00aa). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:6:0x006d). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0076 -> B:5:0x009e). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                ali0 ali0Var;
                rh50<E> rh50Var;
                a aVar;
                long[] jArr;
                int length;
                int i;
                long j;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    kotlin.a.a(obj);
                    ali0Var = (ali0) this.L$0;
                    rh50Var = this.this$0;
                    qh50<E> qh50Var = rh50Var.c;
                    aVar = this.this$1;
                    jArr = qh50Var.a;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i = 0;
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i != length) {
                        }
                    }
                    return s3q0.a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = this.I$3;
                int i4 = this.I$2;
                long j2 = this.J$0;
                int i5 = this.I$1;
                int i6 = this.I$0;
                long[] jArr2 = (long[]) this.L$3;
                rh50<E> rh50Var2 = (rh50) this.L$2;
                a aVar2 = (a) this.L$1;
                ali0 ali0Var2 = (ali0) this.L$0;
                kotlin.a.a(obj);
                j2 >>= 8;
                i3++;
                if (i3 < i4) {
                    if (i4 == 8) {
                        int i7 = i6;
                        i = i5;
                        length = i7;
                        jArr = jArr2;
                        rh50Var = rh50Var2;
                        aVar = aVar2;
                        ali0Var = ali0Var2;
                        if (i != length) {
                            i++;
                            j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8 - ((~(i - length)) >>> 31);
                                int i9 = i;
                                i6 = length;
                                i5 = i9;
                                ali0Var2 = ali0Var;
                                i3 = 0;
                                rh50Var2 = rh50Var;
                                jArr2 = jArr;
                                i4 = i8;
                                aVar2 = aVar;
                                j2 = j;
                                if (i3 < i4) {
                                    if ((255 & j2) < 128) {
                                        int i10 = (i5 << 3) + i3;
                                        aVar2.b = i10;
                                        Object obj2 = rh50Var2.c.b[i10];
                                        this.L$0 = ali0Var2;
                                        this.L$1 = aVar2;
                                        this.L$2 = rh50Var2;
                                        this.L$3 = jArr2;
                                        this.I$0 = i6;
                                        this.I$1 = i5;
                                        this.J$0 = j2;
                                        this.I$2 = i4;
                                        this.I$3 = i3;
                                        this.label = 1;
                                        if (ali0Var2.a(obj2, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                    j2 >>= 8;
                                    i3++;
                                    if (i3 < i4) {
                                    }
                                }
                            }
                            if (i != length) {
                            }
                        }
                    }
                    return s3q0.a;
                }
            }
        }

        public a(rh50<E> rh50Var) {
            this.d = rh50Var;
            this.c = g5z.b(new C3608a(rh50Var, this, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            return (E) this.c.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.b;
            if (i != -1) {
                this.d.c.n(i);
                this.b = -1;
            }
        }
    }

    public rh50(qh50<E> qh50Var) {
        super(qh50Var);
        this.c = qh50Var;
    }

    @Override // xsna.fzi0, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.c.e(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fzi0, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        qh50<E> qh50Var = this.c;
        int i = qh50Var.d;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            qh50Var.k(it.next());
        }
        return i != qh50Var.d;
    }

    @Override // xsna.fzi0, java.util.Set, java.util.Collection
    public final void clear() {
        this.c.f();
    }

    @Override // xsna.fzi0, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(this);
    }

    @Override // xsna.fzi0, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.c.m(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fzi0, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        qh50<E> qh50Var = this.c;
        int i = qh50Var.d;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            qh50Var.j(it.next());
        }
        return i != qh50Var.d;
    }

    @Override // xsna.fzi0, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        qh50<E> qh50Var = this.c;
        Object[] objArr = qh50Var.b;
        int i = qh50Var.d;
        long[] jArr = qh50Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!j5g.P(collection, objArr[i5])) {
                                qh50Var.n(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != qh50Var.d;
    }
}
