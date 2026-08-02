package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.g8e;
import defpackage.kcp;
import defpackage.kjz;
import defpackage.nt00;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.w511;
import defpackage.x4e;
import defpackage.xex;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class FastJsonResponse {
    public static final void c(StringBuilder sb, Field field, Object obj) {
        int i = field.zaa;
        if (i == 11) {
            Class cls = field.zag;
            cvw.l(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(xex.a((String) obj));
            sb.append("\"");
        }
    }

    public static final void d(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + str + ") has a null value, but expected a primitive");
        }
    }

    public static final Object zaD(Field field, Object obj) {
        return field.zak != null ? field.zaf(obj) : obj;
    }

    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(Field field, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends FastJsonResponse> void addConcreteTypeInternal(Field field, String str, T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public final void b(Field field, Object obj) {
        int i = field.zac;
        Object zae = field.zae(obj);
        String str = field.zae;
        switch (i) {
            case 0:
                if (zae == null) {
                    d(str);
                    break;
                } else {
                    setIntegerInternal(field, str, ((Integer) zae).intValue());
                    break;
                }
            case 1:
                zaf(field, str, (BigInteger) zae);
                break;
            case 2:
                if (zae == null) {
                    d(str);
                    break;
                } else {
                    setLongInternal(field, str, ((Long) zae).longValue());
                    break;
                }
            case 3:
            default:
                ny61.r(oyr.i(i, "Unsupported type for conversion: "));
                break;
            case 4:
                if (zae == null) {
                    d(str);
                    break;
                } else {
                    zan(field, str, ((Double) zae).doubleValue());
                    break;
                }
            case 5:
                zab(field, str, (BigDecimal) zae);
                break;
            case 6:
                if (zae == null) {
                    d(str);
                    break;
                } else {
                    setBooleanInternal(field, str, ((Boolean) zae).booleanValue());
                    break;
                }
            case 7:
                setStringInternal(field, str, (String) zae);
                break;
            case 8:
            case 9:
                if (zae == null) {
                    d(str);
                    break;
                } else {
                    setDecodedBytesInternal(field, str, (byte[]) zae);
                    break;
                }
        }
    }

    public abstract Map<String, Field<?, ?>> getFieldMappings();

    public Object getFieldValue(Field field) {
        String str = field.zae;
        if (field.zag == null) {
            return getValueObject(str);
        }
        boolean z = getValueObject(str) == null;
        String str2 = field.zae;
        if (!z) {
            ny61.r(g8e.o("Concrete field shouldn't be value object: ", str2));
            return null;
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e) {
            ny61.j(e);
            return null;
        }
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(Field field) {
        if (field.zac != 11) {
            return isPrimitiveFieldSet(field.zae);
        }
        if (field.zad) {
            w511.x("Concrete type arrays not supported");
            return false;
        }
        w511.x("Concrete types not supported");
        return false;
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(Field<?, ?> field, String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(Field<?, ?> field, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(Field<?, ?> field, String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(Field<?, ?> field, String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(Field<?, ?> field, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(Field<?, ?> field, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(Field<?, ?> field, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                Object zaD = zaD(field, getFieldValue(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                x4e.C(sb, "\"", str, "\":");
                if (zaD != null) {
                    switch (field.zac) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) zaD, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) zaD, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            nt00.a(sb, (HashMap) zaD);
                            break;
                        default:
                            if (field.zab) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        c(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                c(sb, field, zaD);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final void zaA(Field field, String str) {
        if (field.zak != null) {
            b(field, str);
        } else {
            setStringInternal(field, field.zae, str);
        }
    }

    public final void zaB(Field field, Map map) {
        if (field.zak != null) {
            b(field, map);
        } else {
            setStringMapInternal(field, field.zae, map);
        }
    }

    public final void zaC(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            b(field, arrayList);
        } else {
            setStringsInternal(field, field.zae, arrayList);
        }
    }

    public final void zaa(Field field, BigDecimal bigDecimal) {
        if (field.zak != null) {
            b(field, bigDecimal);
        } else {
            zab(field, field.zae, bigDecimal);
        }
    }

    public void zab(Field field, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            b(field, arrayList);
        } else {
            zad(field, field.zae, arrayList);
        }
    }

    public void zad(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(Field field, BigInteger bigInteger) {
        if (field.zak != null) {
            b(field, bigInteger);
        } else {
            zaf(field, field.zae, bigInteger);
        }
    }

    public void zaf(Field field, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            b(field, arrayList);
        } else {
            zah(field, field.zae, arrayList);
        }
    }

    public void zah(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(Field field, boolean z) {
        if (field.zak != null) {
            b(field, Boolean.valueOf(z));
        } else {
            setBooleanInternal(field, field.zae, z);
        }
    }

    public final void zaj(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            b(field, arrayList);
        } else {
            zak(field, field.zae, arrayList);
        }
    }

    public void zak(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(Field field, byte[] bArr) {
        if (field.zak != null) {
            b(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.zae, bArr);
        }
    }

    public final void zam(Field field, double d) {
        if (field.zak != null) {
            b(field, Double.valueOf(d));
        } else {
            zan(field, field.zae, d);
        }
    }

    public void zan(Field field, String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            b(field, arrayList);
        } else {
            zap(field, field.zae, arrayList);
        }
    }

    public void zap(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(Field field, float f) {
        if (field.zak != null) {
            b(field, Float.valueOf(f));
        } else {
            zar(field, field.zae, f);
        }
    }

    public void zar(Field field, String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            b(field, arrayList);
        } else {
            zat(field, field.zae, arrayList);
        }
    }

    public void zat(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(Field field, int i) {
        if (field.zak != null) {
            b(field, Integer.valueOf(i));
        } else {
            setIntegerInternal(field, field.zae, i);
        }
    }

    public final void zav(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            b(field, arrayList);
        } else {
            zaw(field, field.zae, arrayList);
        }
    }

    public void zaw(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(Field field, long j) {
        if (field.zak != null) {
            b(field, Long.valueOf(j));
        } else {
            setLongInternal(field, field.zae, j);
        }
    }

    public final void zay(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            b(field, arrayList);
        } else {
            zaz(field, field.zae, arrayList);
        }
    }

    public void zaz(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();
        protected final int zaa;
        protected final boolean zab;
        protected final int zac;
        protected final boolean zad;
        protected final String zae;
        protected final int zaf;
        protected final Class zag;
        protected final String zah;
        private final int zai;
        private zan zaj;
        private final kcp zak;

        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaaVar) {
            this.zai = i;
            this.zaa = i2;
            this.zab = z;
            this.zac = i3;
            this.zad = z2;
            this.zae = str;
            this.zaf = i4;
            if (str2 == null) {
                this.zag = null;
                this.zah = null;
            } else {
                this.zag = SafeParcelResponse.class;
                this.zah = str2;
            }
            if (zaaVar == null) {
                this.zak = null;
            } else {
                this.zak = zaaVar.zab();
            }
        }

        public static Field<byte[], byte[]> forBase64(String str, int i) {
            return new Field<>(8, false, 8, false, str, i, null, null);
        }

        public static Field<Boolean, Boolean> forBoolean(String str, int i) {
            return new Field<>(6, false, 6, false, str, i, null, null);
        }

        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(String str, int i, Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i, cls, null);
        }

        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(String str, int i, Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i, cls, null);
        }

        public static Field<Double, Double> forDouble(String str, int i) {
            return new Field<>(4, false, 4, false, str, i, null, null);
        }

        public static Field<Float, Float> forFloat(String str, int i) {
            return new Field<>(3, false, 3, false, str, i, null, null);
        }

        public static Field<Integer, Integer> forInteger(String str, int i) {
            return new Field<>(0, false, 0, false, str, i, null, null);
        }

        public static Field<Long, Long> forLong(String str, int i) {
            return new Field<>(2, false, 2, false, str, i, null, null);
        }

        public static Field<String, String> forString(String str, int i) {
            return new Field<>(7, false, 7, false, str, i, null, null);
        }

        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(String str, int i) {
            return new Field<>(10, false, 10, false, str, i, null, null);
        }

        public static Field<ArrayList<String>, ArrayList<String>> forStrings(String str, int i) {
            return new Field<>(7, true, 7, true, str, i, null, null);
        }

        public static Field withConverter(String str, int i, kcp kcpVar, boolean z) {
            kcpVar.zaa();
            kcpVar.zab();
            return new Field(7, z, 0, false, str, i, null, kcpVar);
        }

        public int getSafeParcelableFieldId() {
            return this.zaf;
        }

        public final String toString() {
            kjz kjzVar = new kjz(this);
            kjzVar.b(Integer.valueOf(this.zai), "versionCode");
            kjzVar.b(Integer.valueOf(this.zaa), "typeIn");
            kjzVar.b(Boolean.valueOf(this.zab), "typeInArray");
            kjzVar.b(Integer.valueOf(this.zac), "typeOut");
            kjzVar.b(Boolean.valueOf(this.zad), "typeOutArray");
            kjzVar.b(this.zae, "outputFieldName");
            kjzVar.b(Integer.valueOf(this.zaf), "safeParcelFieldId");
            kjzVar.b(zag(), "concreteTypeName");
            Class cls = this.zag;
            if (cls != null) {
                kjzVar.b(cls.getCanonicalName(), "concreteType.class");
            }
            kcp kcpVar = this.zak;
            if (kcpVar != null) {
                kjzVar.b(kcpVar.getClass().getCanonicalName(), "converterName");
            }
            return kjzVar.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.zai;
            int n0 = bb1.n0(parcel, 20293);
            bb1.m0(1, parcel, 4);
            parcel.writeInt(i2);
            int i3 = this.zaa;
            bb1.m0(2, parcel, 4);
            parcel.writeInt(i3);
            boolean z = this.zab;
            bb1.m0(3, parcel, 4);
            parcel.writeInt(z ? 1 : 0);
            int i4 = this.zac;
            bb1.m0(4, parcel, 4);
            parcel.writeInt(i4);
            boolean z2 = this.zad;
            bb1.m0(5, parcel, 4);
            parcel.writeInt(z2 ? 1 : 0);
            bb1.g0(parcel, 6, this.zae, false);
            int safeParcelableFieldId = getSafeParcelableFieldId();
            bb1.m0(7, parcel, 4);
            parcel.writeInt(safeParcelableFieldId);
            bb1.g0(parcel, 8, zag(), false);
            bb1.f0(parcel, 9, zaa(), i, false);
            bb1.o0(parcel, n0);
        }

        public final zaa zaa() {
            kcp kcpVar = this.zak;
            if (kcpVar == null) {
                return null;
            }
            return zaa.zaa(kcpVar);
        }

        public final Field zab() {
            return new Field(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, zaa());
        }

        public final FastJsonResponse zad() throws InstantiationException, IllegalAccessException {
            cvw.l(this.zag);
            Class cls = this.zag;
            if (cls != SafeParcelResponse.class) {
                return (FastJsonResponse) cls.newInstance();
            }
            cvw.l(this.zah);
            cvw.m(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.zaj, this.zah);
        }

        public final Object zae(Object obj) {
            cvw.l(this.zak);
            Object zac = this.zak.zac(obj);
            cvw.l(zac);
            return zac;
        }

        public final Object zaf(Object obj) {
            cvw.l(this.zak);
            return this.zak.zad(obj);
        }

        public final String zag() {
            String str = this.zah;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final Map zah() {
            cvw.l(this.zah);
            cvw.l(this.zaj);
            Map zab = this.zaj.zab(this.zah);
            cvw.l(zab);
            return zab;
        }

        public final void zai(zan zanVar) {
            this.zaj = zanVar;
        }

        public final boolean zaj() {
            return this.zak != null;
        }

        public Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls, kcp kcpVar) {
            this.zai = 1;
            this.zaa = i;
            this.zab = z;
            this.zac = i2;
            this.zad = z2;
            this.zae = str;
            this.zaf = i3;
            this.zag = cls;
            if (cls == null) {
                this.zah = null;
            } else {
                this.zah = cls.getCanonicalName();
            }
            this.zak = kcpVar;
        }
    }
}
