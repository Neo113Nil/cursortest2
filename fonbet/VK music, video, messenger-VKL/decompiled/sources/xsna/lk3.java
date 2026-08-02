package xsna;

import io.opentelemetry.api.common.AttributeType;
import io.opentelemetry.api.common.ValueType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;

/* compiled from: ArrayBackedAttributesBuilder.java */
/* loaded from: classes11.dex */
public final class lk3 implements r94 {
    public final ArrayList a;

    /* compiled from: ArrayBackedAttributesBuilder.java */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ValueType.values().length];
            b = iArr;
            try {
                iArr[ValueType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ValueType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ValueType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ValueType.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[ValueType.ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[ValueType.KEY_VALUE_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[ValueType.BYTES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[ValueType.EMPTY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[AttributeType.values().length];
            a = iArr2;
            try {
                iArr2[AttributeType.STRING_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[AttributeType.LONG_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[AttributeType.DOUBLE_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[AttributeType.BOOLEAN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[AttributeType.VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public lk3() {
        this.a = new ArrayList();
    }

    public final jk3 e() {
        ArrayList arrayList = this.a;
        return (arrayList.size() != 2 || arrayList.get(0) == null) ? jk3.b(arrayList.toArray()) : new jk3(arrayList.toArray());
    }

    public final lk3 f(i94 i94Var, Object obj) {
        if (i94Var != null && !i94Var.getKey().isEmpty() && obj != null) {
            AttributeType type = i94Var.getType();
            AttributeType attributeType = AttributeType.VALUE;
            ArrayList arrayList = this.a;
            if (type == attributeType && (obj instanceof ljr0)) {
                ljr0 ljr0Var = (ljr0) obj;
                String key = i94Var.getKey();
                switch (a.b[ljr0Var.getType().ordinal()]) {
                    case 1:
                        f(xfx.a(AttributeType.STRING, key), (String) ljr0Var.getValue());
                        return this;
                    case 2:
                        f(xfx.a(AttributeType.LONG, key), (Long) ljr0Var.getValue());
                        return this;
                    case 3:
                        f(xfx.a(AttributeType.DOUBLE, key), (Double) ljr0Var.getValue());
                        return this;
                    case 4:
                        f(xfx.a(AttributeType.BOOLEAN, key), (Boolean) ljr0Var.getValue());
                        return this;
                    case 5:
                        List list = (List) ljr0Var.getValue();
                        if (!list.isEmpty()) {
                            ValueType type2 = ((ljr0) list.get(0)).getType();
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    switch (a.b[type2.ordinal()]) {
                                        case 1:
                                            attributeType = AttributeType.STRING_ARRAY;
                                            break;
                                        case 2:
                                            attributeType = AttributeType.LONG_ARRAY;
                                            break;
                                        case 3:
                                            attributeType = AttributeType.DOUBLE_ARRAY;
                                            break;
                                        case 4:
                                            attributeType = AttributeType.BOOLEAN_ARRAY;
                                            break;
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            attributeType = AttributeType.VALUE;
                                            break;
                                        default:
                                            throw new IllegalArgumentException("Unsupported element type: " + type2);
                                    }
                                } else if (((ljr0) it.next()).getType() != type2) {
                                    attributeType = AttributeType.VALUE;
                                }
                            }
                        }
                        int i = a.a[attributeType.ordinal()];
                        if (i == 1) {
                            ArrayList arrayList2 = new ArrayList(list.size());
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add((String) ((ljr0) it2.next()).getValue());
                            }
                            f(xfx.a(AttributeType.STRING_ARRAY, key), arrayList2);
                            return this;
                        }
                        if (i == 2) {
                            ArrayList arrayList3 = new ArrayList(list.size());
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add((Long) ((ljr0) it3.next()).getValue());
                            }
                            f(xfx.a(AttributeType.LONG_ARRAY, key), arrayList3);
                            return this;
                        }
                        if (i == 3) {
                            ArrayList arrayList4 = new ArrayList(list.size());
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                arrayList4.add((Double) ((ljr0) it4.next()).getValue());
                            }
                            f(xfx.a(AttributeType.DOUBLE_ARRAY, key), arrayList4);
                            return this;
                        }
                        if (i == 4) {
                            ArrayList arrayList5 = new ArrayList(list.size());
                            Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                arrayList5.add((Boolean) ((ljr0) it5.next()).getValue());
                            }
                            f(xfx.a(AttributeType.BOOLEAN_ARRAY, key), arrayList5);
                            return this;
                        }
                        if (i == 5) {
                            arrayList.add(i94Var);
                            arrayList.add(ljr0Var);
                            return this;
                        }
                        throw new IllegalArgumentException("Unexpected array attribute type: " + attributeType);
                    case 6:
                    case 7:
                    case 8:
                        arrayList.add(i94Var);
                        arrayList.add(ljr0Var);
                        return this;
                }
            }
            arrayList.add(i94Var);
            arrayList.add(obj);
        }
        return this;
    }

    public final lk3 g(q94 q94Var) {
        if (q94Var == null) {
            return this;
        }
        q94Var.forEach(new BiConsumer() { // from class: xsna.kk3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                lk3.this.f((i94) obj, obj2);
            }
        });
        return this;
    }

    public lk3(ArrayList arrayList) {
        this.a = arrayList;
    }
}
