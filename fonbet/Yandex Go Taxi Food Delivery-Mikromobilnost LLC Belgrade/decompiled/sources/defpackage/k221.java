package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.l;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public final class k221 extends AbstractList implements h7y, RandomAccess {
    public final l a;

    public k221(l lVar) {
        this.a = lVar;
    }

    @Override // defpackage.h7y
    public final void H0(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.h7y
    public final h7y L0() {
        return this;
    }

    @Override // defpackage.h7y
    public final List c() {
        return Collections.unmodifiableList(this.a.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        j221 j221Var = new j221();
        j221Var.b = this.a.iterator();
        return j221Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        i221 i221Var = new i221();
        i221Var.a = this.a.listIterator(i);
        return i221Var;
    }

    @Override // defpackage.h7y
    public final Object m2(int i) {
        return this.a.b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
