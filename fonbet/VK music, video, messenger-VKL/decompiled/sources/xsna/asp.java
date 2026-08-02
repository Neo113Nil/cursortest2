package xsna;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.RandomAccess;
import kotlin.enums.EnumEntriesSerializationProxy;
import xsna.ff;

/* compiled from: EnumEntries.kt */
/* loaded from: classes11.dex */
public final class asp<T extends Enum<T>> extends ff<T> implements zrp<T>, RandomAccess, Serializable {
    private final T[] entries;

    public asp(T[] tArr) {
        this.entries = tArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.entries);
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        return ((Enum) rl3.S(r4.ordinal(), this.entries)) == r4;
    }

    @Override // xsna.ff, java.util.List
    public final Object get(int i) {
        ff.a aVar = ff.Companion;
        int length = this.entries.length;
        aVar.getClass();
        ff.a.b(i, length);
        return this.entries[i];
    }

    @Override // xsna.ff, xsna.qd
    public final int getSize() {
        return this.entries.length;
    }

    @Override // xsna.ff, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        if (((Enum) rl3.S(ordinal, this.entries)) == r4) {
            return ordinal;
        }
        return -1;
    }

    @Override // xsna.ff, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        if (((Enum) rl3.S(ordinal, this.entries)) == r4) {
            return ordinal;
        }
        return -1;
    }
}
