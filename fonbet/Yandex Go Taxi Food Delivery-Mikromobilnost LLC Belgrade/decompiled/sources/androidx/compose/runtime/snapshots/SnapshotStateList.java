package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a9;
import defpackage.akt;
import defpackage.b9;
import defpackage.c3b0;
import defpackage.d6z;
import defpackage.g5u0;
import defpackage.i2t0;
import defpackage.is8;
import defpackage.j3t0;
import defpackage.j5u0;
import defpackage.jl40;
import defpackage.khe0;
import defpackage.n2b0;
import defpackage.oyu0;
import defpackage.q2t0;
import defpackage.t4u0;
import defpackage.v4u0;
import defpackage.vng;
import defpackage.zfx;
import defpackage.zws0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 U*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006:\u0001VB\u0017\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010!J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001cH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u0010\u0017J\u001f\u00103\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00105\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u000bJ\u0017\u00108\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b8\u0010\u0017J\u001d\u00109\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b9\u0010\u001bJ\u0017\u0010:\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b:\u0010\u001fJ\u001d\u0010;\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b;\u0010\u001bJ \u0010<\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c¢\u0006\u0004\b>\u0010?J-\u0010D\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u001cH\u0000¢\u0006\u0004\bB\u0010CJ\u001f\u0010H\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u001cH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u001cH\u0016¢\u0006\u0004\bJ\u0010KR$\u0010L\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010KR \u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118AX\u0080\u0004¢\u0006\f\u0012\u0004\bS\u0010\u000b\u001a\u0004\bR\u0010\u0013¨\u0006W"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Lg5u0;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Ln2b0;", "persistentList", "<init>", "(Ln2b0;)V", "()V", "Lj5u0;", "value", "Lzy11;", "prependStateRecord", "(Lj5u0;)V", "", "toList", "()Ljava/util/List;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "removeRange", "(II)V", "start", "end", "retainAllInRange$runtime", "(Ljava/util/Collection;II)I", "retainAllInRange", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "firstStateRecord", "Lj5u0;", "getFirstStateRecord", "()Lj5u0;", "getSize", "size", "getDebuggerDisplayValue", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "Companion", "j3t0", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements Parcelable, g5u0, List<T>, RandomAccess, zfx {
    public static final int $stable = 0;
    private j5u0 firstStateRecord;
    public static final j3t0 Companion = new j3t0();
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new SnapshotStateList$Companion$CREATOR$1();

    public SnapshotStateList(n2b0 n2b0Var) {
        i2t0 j = q2t0.j();
        v4u0 v4u0Var = new v4u0(j.g(), n2b0Var);
        if (!(j instanceof akt)) {
            v4u0Var.b = new v4u0(1L, n2b0Var);
        }
        this.firstStateRecord = v4u0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addAll$lambda$0(int i, Collection collection, List list) {
        return list.addAll(i, collection);
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retainAll$lambda$0(Collection collection, List list) {
        return list.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        int i;
        n2b0 n2b0Var;
        i2t0 j;
        boolean e;
        do {
            synchronized (d6z.c) {
                v4u0 v4u0Var = (v4u0) q2t0.h((v4u0) getFirstStateRecord());
                i = v4u0Var.d;
                n2b0Var = v4u0Var.c;
            }
            n2b0 add = n2b0Var.add((Object) element);
            if (add.equals(n2b0Var)) {
                return false;
            }
            v4u0 v4u0Var2 = (v4u0) getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                e = d6z.e((v4u0) q2t0.w(v4u0Var2, this, j), i, add, true);
            }
            q2t0.n(j, this);
        } while (!e);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        int i;
        n2b0 n2b0Var;
        i2t0 j;
        boolean e;
        do {
            synchronized (d6z.c) {
                v4u0 v4u0Var = (v4u0) q2t0.h((v4u0) getFirstStateRecord());
                i = v4u0Var.d;
                n2b0Var = v4u0Var.c;
            }
            n2b0 addAll = n2b0Var.addAll((Collection) elements);
            if (jl40.l(addAll, n2b0Var)) {
                return false;
            }
            v4u0 v4u0Var2 = (v4u0) getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                e = d6z.e((v4u0) q2t0.w(v4u0Var2, this, j), i, addAll, true);
            }
            q2t0.n(j, this);
        } while (!e);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        i2t0 j;
        v4u0 v4u0Var = (v4u0) getFirstStateRecord();
        synchronized (q2t0.c) {
            j = q2t0.j();
            v4u0 v4u0Var2 = (v4u0) q2t0.w(v4u0Var, this, j);
            synchronized (d6z.c) {
                v4u0Var2.c = zws0.b;
                v4u0Var2.d++;
                v4u0Var2.e++;
            }
        }
        q2t0.n(j, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return d6z.G(this).c.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        return d6z.G(this).c.containsAll(elements);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public T get(int index) {
        return (T) d6z.G(this).c.get(index);
    }

    public final List<T> getDebuggerDisplayValue() {
        return ((v4u0) q2t0.h((v4u0) getFirstStateRecord())).c;
    }

    @Override // defpackage.g5u0
    public j5u0 getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public int getSize() {
        return d6z.G(this).c.size();
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return d6z.G(this).c.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return d6z.G(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return d6z.G(this).c.lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new t4u0(this, 0);
    }

    @Override // defpackage.g5u0
    public /* bridge */ /* synthetic */ j5u0 mergeRecords(j5u0 j5u0Var, j5u0 j5u0Var2, j5u0 j5u0Var3) {
        return null;
    }

    @Override // defpackage.g5u0
    public void prependStateRecord(j5u0 value) {
        value.b = getFirstStateRecord();
        this.firstStateRecord = (v4u0) value;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int i;
        n2b0 n2b0Var;
        i2t0 j;
        boolean e;
        do {
            synchronized (d6z.c) {
                v4u0 v4u0Var = (v4u0) q2t0.h((v4u0) getFirstStateRecord());
                i = v4u0Var.d;
                n2b0Var = v4u0Var.c;
            }
            b9 b9Var = (b9) n2b0Var;
            int indexOf = b9Var.indexOf(element);
            n2b0 n2b0Var2 = b9Var;
            if (indexOf != -1) {
                n2b0Var2 = b9Var.h1(indexOf);
            }
            if (jl40.l(n2b0Var2, n2b0Var)) {
                return false;
            }
            v4u0 v4u0Var2 = (v4u0) getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                e = d6z.e((v4u0) q2t0.w(v4u0Var2, this, j), i, n2b0Var2, true);
            }
            q2t0.n(j, this);
        } while (!e);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        int i;
        n2b0 n2b0Var;
        i2t0 j;
        boolean e;
        do {
            synchronized (d6z.c) {
                v4u0 v4u0Var = (v4u0) q2t0.h((v4u0) getFirstStateRecord());
                i = v4u0Var.d;
                n2b0Var = v4u0Var.c;
            }
            n2b0 O0 = ((b9) n2b0Var).O0(new a9(0, elements));
            if (jl40.l(O0, n2b0Var)) {
                return false;
            }
            v4u0 v4u0Var2 = (v4u0) getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                e = d6z.e((v4u0) q2t0.w(v4u0Var2, this, j), i, O0, true);
            }
            q2t0.n(j, this);
        } while (!e);
        return true;
    }

    public T removeAt(int index) {
        int i;
        n2b0 n2b0Var;
        i2t0 j;
        boolean e;
        T t = get(index);
        do {
            synchronized (d6z.c) {
                v4u0 v4u0Var = (v4u0) q2t0.h((v4u0) getFirstStateRecord());
                i = v4u0Var.d;
                n2b0Var = v4u0Var.c;
            }
            n2b0 h1 = n2b0Var.h1(index);
            if (jl40.l(h1, n2b0Var)) {
                break;
            }
            v4u0 v4u0Var2 = (v4u0) getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                e = d6z.e((v4u0) q2t0.w(v4u0Var2, this, j), i, h1, true);
            }
            q2t0.n(j, this);
        } while (!e);
        return t;
    }

    public final void removeRange(int fromIndex, int toIndex) {
        int i;
        n2b0 n2b0Var;
        i2t0 j;
        boolean e;
        do {
            synchronized (d6z.c) {
                v4u0 v4u0Var = (v4u0) q2t0.h((v4u0) getFirstStateRecord());
                i = v4u0Var.d;
                n2b0Var = v4u0Var.c;
            }
            c3b0 builder = n2b0Var.builder();
            builder.subList(fromIndex, toIndex).clear();
            n2b0 a = builder.a();
            if (jl40.l(a, n2b0Var)) {
                return;
            }
            v4u0 v4u0Var2 = (v4u0) getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                e = d6z.e((v4u0) q2t0.w(v4u0Var2, this, j), i, a, true);
            }
            q2t0.n(j, this);
        } while (!e);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> elements) {
        return d6z.P(this, new a9(2, elements));
    }

    public final int retainAllInRange$runtime(Collection<? extends T> elements, int start, int end) {
        int i;
        n2b0 n2b0Var;
        i2t0 j;
        boolean e;
        int size = size();
        do {
            synchronized (d6z.c) {
                v4u0 v4u0Var = (v4u0) q2t0.h((v4u0) getFirstStateRecord());
                i = v4u0Var.d;
                n2b0Var = v4u0Var.c;
            }
            c3b0 builder = n2b0Var.builder();
            builder.subList(start, end).retainAll(elements);
            n2b0 a = builder.a();
            if (jl40.l(a, n2b0Var)) {
                break;
            }
            v4u0 v4u0Var2 = (v4u0) getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                e = d6z.e((v4u0) q2t0.w(v4u0Var2, this, j), i, a, true);
            }
            q2t0.n(j, this);
        } while (!e);
        return size - size();
    }

    @Override // java.util.List
    public T set(int index, T element) {
        int i;
        n2b0 n2b0Var;
        i2t0 j;
        boolean e;
        T t = get(index);
        do {
            synchronized (d6z.c) {
                v4u0 v4u0Var = (v4u0) q2t0.h((v4u0) getFirstStateRecord());
                i = v4u0Var.d;
                n2b0Var = v4u0Var.c;
            }
            n2b0 n2b0Var2 = n2b0Var.set(index, (Object) element);
            if (n2b0Var2.equals(n2b0Var)) {
                break;
            }
            v4u0 v4u0Var2 = (v4u0) getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                e = d6z.e((v4u0) q2t0.w(v4u0Var2, this, j), i, n2b0Var2, false);
            }
            q2t0.n(j, this);
        } while (!e);
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public List<T> subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            khe0.a("fromIndex or toIndex are out of bounds");
        }
        return new oyu0(this, fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return vng.J(this);
    }

    public final List<T> toList() {
        return d6z.G(this).c;
    }

    public String toString() {
        return "SnapshotStateList(value=" + ((v4u0) q2t0.h((v4u0) getFirstStateRecord())).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        List<T> list = toList();
        int size = list.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            parcel.writeValue(list.get(i));
        }
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) vng.K(this, tArr);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int index) {
        return new t4u0(this, index);
    }

    public SnapshotStateList() {
        this(zws0.b);
    }

    @Override // java.util.List
    public void add(int index, T element) {
        int i;
        n2b0 n2b0Var;
        i2t0 j;
        boolean e;
        do {
            synchronized (d6z.c) {
                v4u0 v4u0Var = (v4u0) q2t0.h((v4u0) getFirstStateRecord());
                i = v4u0Var.d;
                n2b0Var = v4u0Var.c;
            }
            n2b0 add = n2b0Var.add(index, (Object) element);
            if (add.equals(n2b0Var)) {
                return;
            }
            v4u0 v4u0Var2 = (v4u0) getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                e = d6z.e((v4u0) q2t0.w(v4u0Var2, this, j), i, add, true);
            }
            q2t0.n(j, this);
        } while (!e);
    }

    @Override // java.util.List
    public boolean addAll(int index, Collection<? extends T> elements) {
        return d6z.P(this, new is8(index, elements, 14));
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }
}
