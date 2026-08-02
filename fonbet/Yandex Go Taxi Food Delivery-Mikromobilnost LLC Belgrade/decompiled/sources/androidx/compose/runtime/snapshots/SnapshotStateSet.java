package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d0a1;
import defpackage.fgx;
import defpackage.g5u0;
import defpackage.i2t0;
import defpackage.j5u0;
import defpackage.ny61;
import defpackage.o2b0;
import defpackage.o3t0;
import defpackage.p2b0;
import defpackage.q2t0;
import defpackage.vng;
import defpackage.w5u0;
import defpackage.x5u0;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u0000 8*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006:\u00019B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u0014J\u001d\u0010\"\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\bJ\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010\u0014J\u001d\u0010%\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b%\u0010\u0018J\u001d\u0010&\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b&\u0010\u0018J\u001f\u0010+\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.R$\u0010/\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8AX\u0080\u0004¢\u0006\f\u0012\u0004\b4\u0010\b\u001a\u0004\b3\u0010\u0010R\u0014\u00107\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010.¨\u0006:"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "T", "Landroid/os/Parcelable;", "Lg5u0;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "Lj5u0;", "value", "Lzy11;", "prependStateRecord", "(Lj5u0;)V", "", "toSet", "()Ljava/util/Set;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "toString", "()Ljava/lang/String;", "add", "addAll", "clear", "remove", "removeAll", "retainAll", "Landroid/os/Parcel;", "parcel", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "firstStateRecord", "Lj5u0;", "getFirstStateRecord", "()Lj5u0;", "getDebuggerDisplayValue", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "getSize", "size", "Companion", "o3t0", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SnapshotStateSet<T> implements Parcelable, g5u0, Set<T>, RandomAccess, fgx {
    public static final int $stable = 0;
    private j5u0 firstStateRecord;
    public static final o3t0 Companion = new o3t0();
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR = new Parcelable.ClassLoaderCreator<SnapshotStateSet<Object>>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateSet$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public SnapshotStateSet<Object> createFromParcel(Parcel parcel, ClassLoader loader) {
            SnapshotStateSet<Object> snapshotStateSet = new SnapshotStateSet<>();
            if (loader == null) {
                loader = SnapshotStateSet.class.getClassLoader();
            }
            int readInt = parcel.readInt();
            for (int i = 0; i < readInt; i++) {
                snapshotStateSet.add(parcel.readValue(loader));
            }
            return snapshotStateSet;
        }

        @Override // android.os.Parcelable.Creator
        public SnapshotStateSet<Object>[] newArray(int size) {
            return new SnapshotStateSet[size];
        }

        @Override // android.os.Parcelable.Creator
        public SnapshotStateSet<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }
    };

    public SnapshotStateSet() {
        o2b0 o2b0Var = o2b0.w;
        x5u0 x5u0Var = new x5u0(q2t0.j().g(), o2b0Var);
        if (q2t0.b.a() != null) {
            x5u0Var.b = new x5u0(1L, o2b0Var);
        }
        this.firstStateRecord = x5u0Var;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    private static final boolean retainAll$lambda$0(Collection collection, Set set) {
        return set.retainAll(kotlin.collections.a.N0(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T element) {
        int i;
        o2b0 o2b0Var;
        i2t0 j;
        boolean b;
        do {
            synchronized (d0a1.a) {
                x5u0 x5u0Var = (x5u0) q2t0.h((x5u0) getFirstStateRecord());
                i = x5u0Var.d;
                o2b0Var = x5u0Var.c;
            }
            o2b0 a = o2b0Var.a(element);
            if (a.equals(o2b0Var)) {
                return false;
            }
            x5u0 x5u0Var2 = (x5u0) getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                b = d0a1.b((x5u0) q2t0.w(x5u0Var2, this, j), i, a);
            }
            q2t0.n(j, this);
        } while (!b);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        int i;
        o2b0 o2b0Var;
        i2t0 j;
        boolean b;
        do {
            synchronized (d0a1.a) {
                x5u0 x5u0Var = (x5u0) q2t0.h((x5u0) getFirstStateRecord());
                i = x5u0Var.d;
                o2b0Var = x5u0Var.c;
            }
            p2b0 p2b0Var = new p2b0(o2b0Var);
            p2b0Var.addAll(elements);
            o2b0 b2 = p2b0Var.b();
            if (b2.equals(o2b0Var)) {
                return false;
            }
            x5u0 x5u0Var2 = (x5u0) getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                b = d0a1.b((x5u0) q2t0.w(x5u0Var2, this, j), i, b2);
            }
            q2t0.n(j, this);
        } while (!b);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        i2t0 j;
        x5u0 x5u0Var = (x5u0) getFirstStateRecord();
        synchronized (q2t0.c) {
            j = q2t0.j();
            x5u0 x5u0Var2 = (x5u0) q2t0.w(x5u0Var, this, j);
            synchronized (d0a1.a) {
                x5u0Var2.c = o2b0.w;
                x5u0Var2.d++;
            }
        }
        q2t0.n(j, this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return d0a1.e(this).c.contains(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        return d0a1.e(this).c.containsAll(elements);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Set<T> getDebuggerDisplayValue() {
        return ((x5u0) q2t0.h((x5u0) getFirstStateRecord())).c;
    }

    @Override // defpackage.g5u0
    public j5u0 getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public int getSize() {
        return d0a1.e(this).c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return d0a1.e(this).c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new w5u0(this, d0a1.e(this).c.iterator());
    }

    @Override // defpackage.g5u0
    public /* bridge */ /* synthetic */ j5u0 mergeRecords(j5u0 j5u0Var, j5u0 j5u0Var2, j5u0 j5u0Var3) {
        return null;
    }

    @Override // defpackage.g5u0
    public void prependStateRecord(j5u0 value) {
        value.b = getFirstStateRecord();
        this.firstStateRecord = (x5u0) value;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        int i;
        o2b0 o2b0Var;
        i2t0 j;
        boolean b;
        do {
            synchronized (d0a1.a) {
                x5u0 x5u0Var = (x5u0) q2t0.h((x5u0) getFirstStateRecord());
                i = x5u0Var.d;
                o2b0Var = x5u0Var.c;
            }
            o2b0 b2 = o2b0Var.b(element);
            if (b2.equals(o2b0Var)) {
                return false;
            }
            x5u0 x5u0Var2 = (x5u0) getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                b = d0a1.b((x5u0) q2t0.w(x5u0Var2, this, j), i, b2);
            }
            q2t0.n(j, this);
        } while (!b);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        int i;
        o2b0 o2b0Var;
        i2t0 j;
        boolean b;
        do {
            synchronized (d0a1.a) {
                x5u0 x5u0Var = (x5u0) q2t0.h((x5u0) getFirstStateRecord());
                i = x5u0Var.d;
                o2b0Var = x5u0Var.c;
            }
            p2b0 p2b0Var = new p2b0(o2b0Var);
            p2b0Var.removeAll(elements);
            o2b0 b2 = p2b0Var.b();
            if (b2.equals(o2b0Var)) {
                return false;
            }
            x5u0 x5u0Var2 = (x5u0) getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                b = d0a1.b((x5u0) q2t0.w(x5u0Var2, this, j), i, b2);
            }
            q2t0.n(j, this);
        } while (!b);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> elements) {
        int i;
        o2b0 o2b0Var;
        boolean retainAll$lambda$0;
        i2t0 j;
        boolean b;
        do {
            synchronized (d0a1.a) {
                x5u0 x5u0Var = (x5u0) q2t0.h((x5u0) getFirstStateRecord());
                i = x5u0Var.d;
                o2b0Var = x5u0Var.c;
            }
            if (o2b0Var == null) {
                ny61.r("No set to mutate");
                return false;
            }
            p2b0 p2b0Var = new p2b0(o2b0Var);
            retainAll$lambda$0 = retainAll$lambda$0(elements, p2b0Var);
            o2b0 b2 = p2b0Var.b();
            if (b2.equals(o2b0Var)) {
                break;
            }
            x5u0 x5u0Var2 = (x5u0) getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                b = d0a1.b((x5u0) q2t0.w(x5u0Var2, this, j), i, b2);
            }
            q2t0.n(j, this);
        } while (!b);
        return retainAll$lambda$0;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return vng.J(this);
    }

    public final Set<T> toSet() {
        return d0a1.e(this).c;
    }

    public String toString() {
        return "SnapshotStateSet(value=" + ((x5u0) q2t0.h((x5u0) getFirstStateRecord())).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Set<T> set = toSet();
        parcel.writeInt(size());
        Iterator<T> it = set.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) vng.K(this, tArr);
    }
}
