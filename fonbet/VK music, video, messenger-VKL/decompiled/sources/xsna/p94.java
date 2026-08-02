package xsna;

import io.opentelemetry.api.common.ValueType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* compiled from: AttributeUtil.java */
/* loaded from: classes8.dex */
public final class p94 {
    public static boolean a(Collection collection, Predicate predicate) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!predicate.test(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static Object b(int i, Object obj) {
        if (i != Integer.MAX_VALUE) {
            if (obj instanceof List) {
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(b(i, it.next()));
                }
                return arrayList;
            }
            if (obj instanceof String) {
                String str = (String) obj;
                return str.length() < i ? obj : str.substring(0, i);
            }
            if (obj instanceof ljr0) {
                return c((ljr0) obj, i);
            }
        }
        return obj;
    }

    public static ljr0<?> c(ljr0<?> ljr0Var, final int i) {
        ValueType type = ljr0Var.getType();
        if (type == ValueType.STRING) {
            String str = (String) ljr0Var.getValue();
            if (str.length() <= i) {
                return ljr0Var;
            }
            String substring = str.substring(0, i);
            Objects.requireNonNull(substring, "value must not be null");
            return new akr0(substring);
        }
        if (type == ValueType.BYTES) {
            ByteBuffer byteBuffer = (ByteBuffer) ljr0Var.getValue();
            if (byteBuffer.remaining() <= i) {
                return ljr0Var;
            }
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return new ojr0(Arrays.copyOf(bArr, i));
        }
        if (type == ValueType.ARRAY) {
            List list = (List) ljr0Var.getValue();
            if (a(list, new Predicate() { // from class: xsna.k94
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return p94.e((ljr0) obj, i);
                }
            })) {
                return ljr0Var;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c((ljr0) it.next(), i));
            }
            return new mjr0(Collections.unmodifiableList(arrayList));
        }
        if (type != ValueType.KEY_VALUE_LIST) {
            return ljr0Var;
        }
        List<iey> list2 = (List) ljr0Var.getValue();
        if (a(list2, new Predicate() { // from class: xsna.l94
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return p94.e(((iey) obj).getValue(), i);
            }
        })) {
            return ljr0Var;
        }
        ArrayList arrayList2 = new ArrayList(list2.size());
        for (iey ieyVar : list2) {
            arrayList2.add(new cn5(ieyVar.getKey(), c(ieyVar.getValue(), i)));
        }
        iey[] ieyVarArr = (iey[]) arrayList2.toArray(new iey[0]);
        Objects.requireNonNull(ieyVarArr, "value must not be null");
        ArrayList arrayList3 = new ArrayList(ieyVarArr.length);
        arrayList3.addAll(Arrays.asList(ieyVarArr));
        return new key(Collections.unmodifiableList(arrayList3));
    }

    public static boolean d(final int i, Object obj) {
        if (obj instanceof List) {
            return a((List) obj, new Predicate() { // from class: xsna.o94
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return p94.d(i, obj2);
                }
            });
        }
        if (obj instanceof String) {
            return ((String) obj).length() < i;
        }
        if (obj instanceof ljr0) {
            return e((ljr0) obj, i);
        }
        return true;
    }

    public static boolean e(ljr0<?> ljr0Var, final int i) {
        ValueType type = ljr0Var.getType();
        if (type == ValueType.STRING) {
            return ((String) ljr0Var.getValue()).length() < i;
        }
        if (type == ValueType.BYTES) {
            return ((ByteBuffer) ljr0Var.getValue()).remaining() <= i;
        }
        if (type == ValueType.ARRAY) {
            return a((List) ljr0Var.getValue(), new Predicate() { // from class: xsna.m94
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return p94.e((ljr0) obj, i);
                }
            });
        }
        if (type == ValueType.KEY_VALUE_LIST) {
            return a((List) ljr0Var.getValue(), new Predicate() { // from class: xsna.n94
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return p94.e(((iey) obj).getValue(), i);
                }
            });
        }
        return true;
    }
}
