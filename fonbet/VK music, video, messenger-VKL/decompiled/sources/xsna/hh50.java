package xsna;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: OrderedScatterSet.kt */
/* loaded from: classes11.dex */
public final class hh50<E> extends xx80<E> implements pcy {
    public final gh50<E> c;

    /* compiled from: OrderedScatterSet.kt */
    public static final class a implements Iterator<E>, gcy {
        public int b = -1;
        public final vki0 c;
        public final /* synthetic */ hh50<E> d;

        /* compiled from: OrderedScatterSet.kt */
        @b6l(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
        /* renamed from: xsna.hh50$a$a, reason: collision with other inner class name */
        public static final class C2996a extends RestrictedSuspendLambda implements wzs<ali0<? super E>, spj<? super s3q0>, Object> {
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ hh50<E> this$0;
            final /* synthetic */ a this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2996a(hh50<E> hh50Var, a aVar, spj<? super C2996a> spjVar) {
                super(2, spjVar);
                this.this$0 = hh50Var;
                this.this$1 = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C2996a c2996a = new C2996a(this.this$0, this.this$1, spjVar);
                c2996a.L$0 = obj;
                return c2996a;
            }

            @Override // xsna.wzs
            public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
                return ((C2996a) create((ali0) obj, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0065 -> B:5:0x0020). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                long[] jArr;
                int i;
                ali0 ali0Var;
                a aVar;
                hh50<E> hh50Var;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    kotlin.a.a(obj);
                    ali0 ali0Var2 = (ali0) this.L$0;
                    hh50<E> hh50Var2 = this.this$0;
                    gh50<E> gh50Var = hh50Var2.c;
                    a aVar2 = this.this$1;
                    jArr = gh50Var.c;
                    i = gh50Var.e;
                    ali0Var = ali0Var2;
                    aVar = aVar2;
                    hh50Var = hh50Var2;
                    if (i != Integer.MAX_VALUE) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = this.I$0;
                    long[] jArr2 = (long[]) this.L$3;
                    hh50Var = (hh50) this.L$2;
                    a aVar3 = (a) this.L$1;
                    ali0Var = (ali0) this.L$0;
                    kotlin.a.a(obj);
                    aVar = aVar3;
                    jArr = jArr2;
                    i = i3;
                    if (i != Integer.MAX_VALUE) {
                        i3 = (int) ((jArr[i] >> 31) & 2147483647L);
                        aVar.b = i;
                        Object obj2 = hh50Var.c.b[i];
                        this.L$0 = ali0Var;
                        this.L$1 = aVar;
                        this.L$2 = hh50Var;
                        this.L$3 = jArr;
                        this.I$0 = i3;
                        this.label = 1;
                        if (ali0Var.a(obj2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i = i3;
                        if (i != Integer.MAX_VALUE) {
                            return s3q0.a;
                        }
                    }
                }
            }
        }

        public a(hh50<E> hh50Var) {
            this.d = hh50Var;
            this.c = g5z.b(new C2996a(hh50Var, this, null));
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
                this.d.c.h(i);
                this.b = -1;
            }
        }
    }

    public hh50(gh50<E> gh50Var) {
        super(gh50Var);
        this.c = gh50Var;
    }

    @Override // xsna.xx80, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.c.b(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xx80, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        gh50<E> gh50Var = this.c;
        int i = gh50Var.g;
        for (Object obj : collection) {
            int d = gh50Var.d(obj);
            gh50Var.b[d] = obj;
            long[] jArr = gh50Var.c;
            int i2 = gh50Var.d;
            jArr[d] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((d & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            gh50Var.d = d;
            if (gh50Var.e == Integer.MAX_VALUE) {
                gh50Var.e = d;
            }
        }
        return i != gh50Var.g;
    }

    @Override // xsna.xx80, java.util.Set, java.util.Collection
    public final void clear() {
        this.c.c();
    }

    @Override // xsna.xx80, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(this);
    }

    @Override // xsna.xx80, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.c.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        r14 = -1;
     */
    @Override // xsna.xx80, java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection<? extends Object> collection) {
        int i;
        gh50<E> gh50Var = this.c;
        int i2 = gh50Var.g;
        Iterator<T> it = collection.iterator();
        while (true) {
            int i3 = 1;
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i5 = hashCode ^ (hashCode << 16);
            int i6 = i5 & 127;
            int i7 = gh50Var.f;
            int i8 = (i5 >>> 7) & i7;
            while (true) {
                long[] jArr = gh50Var.a;
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                int i11 = i3;
                int i12 = i4;
                long j = (((-i10) >> 63) & (jArr[i9 + i3] << (64 - i10))) | (jArr[i9] >>> i10);
                long j2 = (i6 * 72340172838076673L) ^ j;
                long j3 = -9187201950435737472L;
                long j4 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j4 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j4) >> 3) + i8) & i7;
                    long j5 = j3;
                    if (epx.f(gh50Var.b[i], next)) {
                        break;
                    }
                    j4 &= j4 - 1;
                    j3 = j5;
                }
                i4 = i12 + 8;
                i8 = (i8 + i4) & i7;
                i3 = i11;
            }
            if (i >= 0) {
                gh50Var.h(i);
            }
        }
        return i2 != gh50Var.g;
    }

    @Override // xsna.xx80, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        return this.c.i(collection);
    }
}
