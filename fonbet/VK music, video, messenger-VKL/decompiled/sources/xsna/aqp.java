package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: ScatterMap.kt */
/* loaded from: classes11.dex */
public final class aqp<K, V> implements Set<Map.Entry<? extends K, ? extends V>>, gcy {
    public final g5h0<K, V> b;

    /* compiled from: ScatterMap.kt */
    @b6l(c = "androidx.collection.Entries$iterator$1", f = "ScatterMap.kt", l = {1414}, m = "invokeSuspend")
    public static final class a extends RestrictedSuspendLambda implements wzs<ali0<? super Map.Entry<? extends K, ? extends V>>, spj<? super s3q0>, Object> {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ aqp<K, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(aqp<K, V> aqpVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = aqpVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
            return ((a) create((ali0) obj, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x009a -> B:6:0x009f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0053 -> B:7:0x0065). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ad -> B:17:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x006e -> B:5:0x009d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ali0 ali0Var;
            aqp<K, V> aqpVar;
            long[] jArr;
            int length;
            int i;
            long j;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            int i3 = 8;
            if (i2 == 0) {
                kotlin.a.a(obj);
                ali0Var = (ali0) this.L$0;
                aqpVar = this.this$0;
                jArr = aqpVar.b.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i = 0;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    }
                }
                return s3q0.a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = this.I$3;
            int i5 = this.I$2;
            long j2 = this.J$0;
            i = this.I$1;
            int i6 = this.I$0;
            long[] jArr2 = (long[]) this.L$2;
            aqp<K, V> aqpVar2 = (aqp) this.L$1;
            ali0 ali0Var2 = (ali0) this.L$0;
            kotlin.a.a(obj);
            int i7 = i3;
            j2 >>= i7;
            i4++;
            i3 = i7;
            if (i4 < i5) {
                int i8 = i3;
                if (i5 == i8) {
                    length = i6;
                    jArr = jArr2;
                    aqpVar = aqpVar2;
                    ali0Var = ali0Var2;
                    if (i != length) {
                        i++;
                        i3 = i8;
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            aqpVar2 = aqpVar;
                            i5 = 8 - ((~(i - length)) >>> 31);
                            ali0Var2 = ali0Var;
                            i4 = 0;
                            jArr2 = jArr;
                            i6 = length;
                            j2 = j;
                            if (i4 < i5) {
                                if ((255 & j2) < 128) {
                                    int i9 = (i << 3) + i4;
                                    g5h0<K, V> g5h0Var = aqpVar2.b;
                                    i7 = i3;
                                    cl00 cl00Var = new cl00(g5h0Var.b[i9], g5h0Var.c[i9]);
                                    this.L$0 = ali0Var2;
                                    this.L$1 = aqpVar2;
                                    this.L$2 = jArr2;
                                    this.I$0 = i6;
                                    this.I$1 = i;
                                    this.J$0 = j2;
                                    this.I$2 = i5;
                                    this.I$3 = i4;
                                    this.label = 1;
                                    if (ali0Var2.a(cl00Var, this) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    j2 >>= i7;
                                    i4++;
                                    i3 = i7;
                                    if (i4 < i5) {
                                    }
                                }
                                int i72 = i3;
                                j2 >>= i72;
                                i4++;
                                i3 = i72;
                                if (i4 < i5) {
                                }
                            }
                        } else {
                            i8 = i3;
                            if (i != length) {
                            }
                        }
                    }
                }
                return s3q0.a;
            }
        }
    }

    public aqp(g5h0<K, V> g5h0Var) {
        this.b = g5h0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return epx.f(this.b.d(entry.getKey()), entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!epx.f(this.b.d(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.b.f();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return g5z.b(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.b.e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return z4g.h(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) z4g.i(this, tArr);
    }
}
