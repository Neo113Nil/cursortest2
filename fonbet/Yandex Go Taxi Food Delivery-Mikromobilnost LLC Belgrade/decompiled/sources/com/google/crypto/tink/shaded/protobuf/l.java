package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import defpackage.h7y;
import defpackage.k221;
import defpackage.nqw;
import defpackage.o9;
import defpackage.qqw;
import defpackage.w511;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public class l extends o9 implements h7y, RandomAccess {
    public final ArrayList b;

    static {
        new l().a = false;
    }

    public l(int i) {
        this(new ArrayList(i));
    }

    @Override // defpackage.h7y
    public final void H0(ByteString byteString) {
        a();
        this.b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.h7y
    public final h7y L0() {
        return this.a ? new k221(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.o9, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof h7y) {
            collection = ((h7y) collection).c();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // defpackage.h7y
    public final List c() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.o9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof ByteString)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, qqw.a);
            if (u.a.R(0, bArr.length, bArr)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        ByteString byteString = (ByteString) obj;
        Charset charset = qqw.a;
        if (byteString.size() == 0) {
            str = "";
        } else {
            ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
            str = new String(literalByteString.bytes, literalByteString.k(), literalByteString.size(), charset);
        }
        ByteString.LiteralByteString literalByteString2 = (ByteString.LiteralByteString) byteString;
        int k = literalByteString2.k();
        byte[] bArr2 = literalByteString2.bytes;
        if (u.a.R(k, literalByteString2.size() + k, bArr2)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // defpackage.h7y
    public final Object m2(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.o9, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof ByteString)) {
            return new String((byte[]) remove, qqw.a);
        }
        ByteString byteString = (ByteString) remove;
        Charset charset = qqw.a;
        if (byteString.size() == 0) {
            return "";
        }
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        return new String(literalByteString.bytes, literalByteString.k(), literalByteString.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ByteString)) {
            return new String((byte[]) obj2, qqw.a);
        }
        ByteString byteString = (ByteString) obj2;
        Charset charset = qqw.a;
        if (byteString.size() == 0) {
            return "";
        }
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        return new String(literalByteString.bytes, literalByteString.k(), literalByteString.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.nqw
    public final nqw w(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            w511.q();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new l(arrayList2);
    }

    public l() {
        this(10);
    }

    public l(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // defpackage.o9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
