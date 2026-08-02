package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import defpackage.ndl0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.piv;
import defpackage.riv;
import defpackage.zsy;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes11.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements zsy {
    private static final long serialVersionUID = 0;

    public static final class a extends ImmutableMultimap.a {
        public final ImmutableListMultimap b() {
            Map map = this.a;
            if (map == null) {
                return EmptyImmutableListMultimap.y;
            }
            Collection entrySet = ((CompactHashMap) map).entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                return EmptyImmutableListMultimap.y;
            }
            p pVar = (p) entrySet;
            ImmutableMap.a aVar = new ImmutableMap.a(pVar.b.size());
            Iterator it = pVar.iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ImmutableList g = ((ImmutableList.a) entry.getValue()).g();
                aVar.b(key, g);
                i += ((RegularImmutableList) g).w;
            }
            return new ImmutableListMultimap(aVar.a(), i);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(oyr.i(readInt, "Invalid key count "));
        }
        ImmutableMap.a aVar = new ImmutableMap.a();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            Objects.requireNonNull(readObject);
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException(oyr.i(readInt2, "Invalid value count "));
            }
            piv pivVar = ImmutableList.b;
            ImmutableList.a aVar2 = new ImmutableList.a();
            for (int i3 = 0; i3 < readInt2; i3++) {
                Object readObject2 = objectInputStream.readObject();
                Objects.requireNonNull(readObject2);
                aVar2.a(readObject2);
            }
            aVar.b(readObject, aVar2.g());
            i += readInt2;
        }
        try {
            ImmutableMap a2 = aVar.a();
            ndl0 ndl0Var = riv.a;
            ndl0Var.getClass();
            try {
                ((Field) ndl0Var.b).set(this, a2);
                ndl0 ndl0Var2 = riv.b;
                ndl0Var2.getClass();
                try {
                    ((Field) ndl0Var2.b).set(this, Integer.valueOf(i));
                } catch (IllegalAccessException e) {
                    ny61.f(e);
                }
            } catch (IllegalAccessException e2) {
                ny61.f(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(a().size());
        for (Map.Entry<K, V> entry : a().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public final ImmutableList f(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.w.get(obj);
        if (immutableList != null) {
            return immutableList;
        }
        piv pivVar = ImmutableList.b;
        return RegularImmutableList.x;
    }
}
