package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.bb1;
import defpackage.cma1;
import defpackage.cvw;
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
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();
    private final int zaa;
    private final Parcel zab;
    private final int zac;
    private final zan zad;
    private final String zae;
    private int zaf;
    private int zag;

    private SafeParcelResponse(SafeParcelable safeParcelable, zan zanVar, String str) {
        this.zaa = 1;
        Parcel obtain = Parcel.obtain();
        this.zab = obtain;
        safeParcelable.writeToParcel(obtain, 0);
        this.zac = 1;
        cvw.l(zanVar);
        this.zad = zanVar;
        cvw.l(str);
        this.zae = str;
        this.zaf = 2;
    }

    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse from(T t) {
        String canonicalName = t.getClass().getCanonicalName();
        cvw.l(canonicalName);
        zan zanVar = new zan(t.getClass());
        zaF(zanVar, t);
        zanVar.zac();
        zanVar.zad();
        return new SafeParcelResponse(t, zanVar, canonicalName);
    }

    private static void zaF(zan zanVar, FastJsonResponse fastJsonResponse) {
        Class<?> cls = fastJsonResponse.getClass();
        if (zanVar.zaf(cls)) {
            return;
        }
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        zanVar.zae(cls, fieldMappings);
        Iterator<String> it = fieldMappings.keySet().iterator();
        while (it.hasNext()) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(it.next());
            Class cls2 = field.zag;
            if (cls2 != null) {
                try {
                    zaF(zanVar, (FastJsonResponse) cls2.newInstance());
                } catch (IllegalAccessException e) {
                    Class cls3 = field.zag;
                    cvw.l(cls3);
                    ny61.h("Could not access object of type ".concat(String.valueOf(cls3.getCanonicalName())), e);
                    return;
                } catch (InstantiationException e2) {
                    Class cls4 = field.zag;
                    cvw.l(cls4);
                    ny61.h("Could not instantiate an object of type ".concat(String.valueOf(cls4.getCanonicalName())), e2);
                    return;
                }
            }
        }
    }

    private final void zaG(FastJsonResponse.Field field) {
        if (field.zaf == -1) {
            ny61.r("Field does not have a valid safe parcelable field id.");
            return;
        }
        Parcel parcel = this.zab;
        if (parcel == null) {
            ny61.r("Internal Parcel object is null.");
            return;
        }
        int i = this.zaf;
        if (i == 0) {
            this.zag = bb1.n0(parcel, 20293);
            this.zaf = 1;
        } else {
            if (i == 1) {
                return;
            }
            ny61.r("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
        }
    }

    private final void zaH(StringBuilder sb, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel obtain;
        BigInteger[] bigIntegerArr;
        long[] createLongArray;
        double[] createDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] createBooleanArray;
        Parcel[] parcelArr;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).getSafeParcelableFieldId(), entry);
        }
        sb.append('{');
        int P0 = cma1.P0(parcel);
        boolean z = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (field.zaj()) {
                    int i = field.zac;
                    switch (i) {
                        case 0:
                            zaJ(sb, field, FastJsonResponse.zaD(field, Integer.valueOf(cma1.r0(parcel, readInt))));
                            break;
                        case 1:
                            int w0 = cma1.w0(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (w0 == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + w0);
                                bigInteger2 = new BigInteger(createByteArray);
                            }
                            zaJ(sb, field, FastJsonResponse.zaD(field, bigInteger2));
                            break;
                        case 2:
                            zaJ(sb, field, FastJsonResponse.zaD(field, Long.valueOf(cma1.u0(parcel, readInt))));
                            break;
                        case 3:
                            zaJ(sb, field, FastJsonResponse.zaD(field, Float.valueOf(cma1.o0(parcel, readInt))));
                            break;
                        case 4:
                            zaJ(sb, field, FastJsonResponse.zaD(field, Double.valueOf(cma1.m0(parcel, readInt))));
                            break;
                        case 5:
                            zaJ(sb, field, FastJsonResponse.zaD(field, cma1.r(parcel, readInt)));
                            break;
                        case 6:
                            zaJ(sb, field, FastJsonResponse.zaD(field, Boolean.valueOf(cma1.k0(parcel, readInt))));
                            break;
                        case 7:
                            zaJ(sb, field, FastJsonResponse.zaD(field, cma1.z(parcel, readInt)));
                            break;
                        case 8:
                        case 9:
                            zaJ(sb, field, FastJsonResponse.zaD(field, cma1.t(parcel, readInt)));
                            break;
                        case 10:
                            Bundle s = cma1.s(parcel, readInt);
                            HashMap hashMap = new HashMap();
                            for (String str2 : s.keySet()) {
                                String string = s.getString(str2);
                                cvw.l(string);
                                hashMap.put(str2, string);
                            }
                            zaJ(sb, field, FastJsonResponse.zaD(field, hashMap));
                            break;
                        case 11:
                            ny61.g("Method does not accept concrete type.");
                            return;
                        default:
                            ny61.g(oyr.i(i, "Unknown field out type = "));
                            return;
                    }
                } else if (field.zad) {
                    sb.append("[");
                    switch (field.zac) {
                        case 0:
                            int[] w = cma1.w(parcel, readInt);
                            int length = w.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 != 0) {
                                    sb.append(",");
                                }
                                sb.append(w[i2]);
                            }
                            break;
                        case 1:
                            int w02 = cma1.w0(parcel, readInt);
                            int dataPosition2 = parcel.dataPosition();
                            if (w02 == 0) {
                                bigIntegerArr = null;
                            } else {
                                int readInt2 = parcel.readInt();
                                bigIntegerArr = new BigInteger[readInt2];
                                for (int i3 = 0; i3 < readInt2; i3++) {
                                    bigIntegerArr[i3] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(dataPosition2 + w02);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i4 = 0; i4 < length2; i4++) {
                                if (i4 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigIntegerArr[i4]);
                            }
                            break;
                        case 2:
                            int w03 = cma1.w0(parcel, readInt);
                            int dataPosition3 = parcel.dataPosition();
                            if (w03 == 0) {
                                createLongArray = null;
                            } else {
                                createLongArray = parcel.createLongArray();
                                parcel.setDataPosition(dataPosition3 + w03);
                            }
                            int length3 = createLongArray.length;
                            for (int i5 = 0; i5 < length3; i5++) {
                                if (i5 != 0) {
                                    sb.append(",");
                                }
                                sb.append(createLongArray[i5]);
                            }
                            break;
                        case 3:
                            float[] v = cma1.v(parcel, readInt);
                            int length4 = v.length;
                            for (int i6 = 0; i6 < length4; i6++) {
                                if (i6 != 0) {
                                    sb.append(",");
                                }
                                sb.append(v[i6]);
                            }
                            break;
                        case 4:
                            int w04 = cma1.w0(parcel, readInt);
                            int dataPosition4 = parcel.dataPosition();
                            if (w04 == 0) {
                                createDoubleArray = null;
                            } else {
                                createDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(dataPosition4 + w04);
                            }
                            int length5 = createDoubleArray.length;
                            for (int i7 = 0; i7 < length5; i7++) {
                                if (i7 != 0) {
                                    sb.append(",");
                                }
                                sb.append(createDoubleArray[i7]);
                            }
                            break;
                        case 5:
                            int w05 = cma1.w0(parcel, readInt);
                            int dataPosition5 = parcel.dataPosition();
                            if (w05 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int readInt3 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[readInt3];
                                for (int i8 = 0; i8 < readInt3; i8++) {
                                    bigDecimalArr[i8] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(dataPosition5 + w05);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i9 = 0; i9 < length6; i9++) {
                                if (i9 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigDecimalArr[i9]);
                            }
                            break;
                        case 6:
                            int w06 = cma1.w0(parcel, readInt);
                            int dataPosition6 = parcel.dataPosition();
                            if (w06 == 0) {
                                createBooleanArray = null;
                            } else {
                                createBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(dataPosition6 + w06);
                            }
                            int length7 = createBooleanArray.length;
                            for (int i10 = 0; i10 < length7; i10++) {
                                if (i10 != 0) {
                                    sb.append(",");
                                }
                                sb.append(createBooleanArray[i10]);
                            }
                            break;
                        case 7:
                            String[] A = cma1.A(parcel, readInt);
                            int length8 = A.length;
                            for (int i11 = 0; i11 < length8; i11++) {
                                if (i11 != 0) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(A[i11]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            w511.x("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            return;
                        case 11:
                            int w07 = cma1.w0(parcel, readInt);
                            int dataPosition7 = parcel.dataPosition();
                            if (w07 == 0) {
                                parcelArr = null;
                            } else {
                                int readInt4 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[readInt4];
                                for (int i12 = 0; i12 < readInt4; i12++) {
                                    int readInt5 = parcel.readInt();
                                    if (readInt5 != 0) {
                                        int dataPosition8 = parcel.dataPosition();
                                        Parcel obtain2 = Parcel.obtain();
                                        obtain2.appendFrom(parcel, dataPosition8, readInt5);
                                        parcelArr2[i12] = obtain2;
                                        parcel.setDataPosition(dataPosition8 + readInt5);
                                    } else {
                                        parcelArr2[i12] = null;
                                    }
                                }
                                parcel.setDataPosition(dataPosition7 + w07);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i13 = 0; i13 < length9; i13++) {
                                if (i13 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i13].setDataPosition(0);
                                zaH(sb, field.zah(), parcelArr[i13]);
                            }
                            break;
                        default:
                            ny61.r("Unknown field type out.");
                            return;
                    }
                    sb.append("]");
                } else {
                    switch (field.zac) {
                        case 0:
                            sb.append(cma1.r0(parcel, readInt));
                            break;
                        case 1:
                            int w08 = cma1.w0(parcel, readInt);
                            int dataPosition9 = parcel.dataPosition();
                            if (w08 == 0) {
                                bigInteger = null;
                            } else {
                                byte[] createByteArray2 = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition9 + w08);
                                bigInteger = new BigInteger(createByteArray2);
                            }
                            sb.append(bigInteger);
                            break;
                        case 2:
                            sb.append(cma1.u0(parcel, readInt));
                            break;
                        case 3:
                            sb.append(cma1.o0(parcel, readInt));
                            break;
                        case 4:
                            sb.append(cma1.m0(parcel, readInt));
                            break;
                        case 5:
                            sb.append(cma1.r(parcel, readInt));
                            break;
                        case 6:
                            sb.append(cma1.k0(parcel, readInt));
                            break;
                        case 7:
                            String z2 = cma1.z(parcel, readInt);
                            sb.append("\"");
                            sb.append(xex.a(z2));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] t = cma1.t(parcel, readInt);
                            sb.append("\"");
                            sb.append(t == null ? null : Base64.encodeToString(t, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] t2 = cma1.t(parcel, readInt);
                            sb.append("\"");
                            sb.append(t2 == null ? null : Base64.encodeToString(t2, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle s2 = cma1.s(parcel, readInt);
                            Set<String> keySet = s2.keySet();
                            sb.append("{");
                            boolean z3 = true;
                            for (String str3 : keySet) {
                                if (!z3) {
                                    sb.append(",");
                                }
                                x4e.C(sb, "\"", str3, "\":\"");
                                sb.append(xex.a(s2.getString(str3)));
                                sb.append("\"");
                                z3 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            int w09 = cma1.w0(parcel, readInt);
                            int dataPosition10 = parcel.dataPosition();
                            if (w09 == 0) {
                                obtain = null;
                            } else {
                                obtain = Parcel.obtain();
                                obtain.appendFrom(parcel, dataPosition10, w09);
                                parcel.setDataPosition(dataPosition10 + w09);
                            }
                            obtain.setDataPosition(0);
                            zaH(sb, field.zah(), obtain);
                            break;
                        default:
                            ny61.r("Unknown field type out");
                            return;
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != P0) {
            throw new SafeParcelReader$ParseException(oyr.i(P0, "Overread allowed size end="), parcel);
        }
        sb.append('}');
    }

    private static final void zaI(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                break;
            case 7:
                sb.append("\"");
                cvw.l(obj);
                sb.append(xex.a(obj.toString()));
                sb.append("\"");
                break;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                sb.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb.append("\"");
                break;
            case 9:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb.append("\"");
                break;
            case 10:
                cvw.l(obj);
                nt00.a(sb, (HashMap) obj);
                break;
            case 11:
                ny61.g("Method does not accept concrete type.");
                break;
            default:
                ny61.g(oyr.i(i, "Unknown type = "));
                break;
        }
    }

    private static final void zaJ(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        if (!field.zab) {
            zaI(sb, field.zaa, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            zaI(sb, field.zaa, arrayList.get(i));
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList<T> arrayList) {
        zaG(field);
        ArrayList arrayList2 = new ArrayList();
        cvw.l(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((SafeParcelResponse) arrayList.get(i)).zaE());
        }
        Parcel parcel = this.zab;
        int n0 = bb1.n0(parcel, field.getSafeParcelableFieldId());
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i2);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        bb1.o0(parcel, n0);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field field, String str, T t) {
        zaG(field);
        Parcel zaE = ((SafeParcelResponse) t).zaE();
        Parcel parcel = this.zab;
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (zaE == null) {
            bb1.m0(safeParcelableFieldId, parcel, 0);
            return;
        }
        int n0 = bb1.n0(parcel, safeParcelableFieldId);
        parcel.appendFrom(zaE, 0, zaE.dataSize());
        bb1.o0(parcel, n0);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        zan zanVar = this.zad;
        if (zanVar == null) {
            return null;
        }
        String str = this.zae;
        cvw.l(str);
        return zanVar.zab(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setBooleanInternal(FastJsonResponse.Field<?, ?> field, String str, boolean z) {
        zaG(field);
        Parcel parcel = this.zab;
        bb1.m0(field.getSafeParcelableFieldId(), parcel, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> field, String str, byte[] bArr) {
        zaG(field);
        bb1.V(this.zab, field.getSafeParcelableFieldId(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(FastJsonResponse.Field<?, ?> field, String str, int i) {
        zaG(field);
        Parcel parcel = this.zab;
        bb1.m0(field.getSafeParcelableFieldId(), parcel, 4);
        parcel.writeInt(i);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setLongInternal(FastJsonResponse.Field<?, ?> field, String str, long j) {
        zaG(field);
        Parcel parcel = this.zab;
        bb1.m0(field.getSafeParcelableFieldId(), parcel, 8);
        parcel.writeLong(j);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(FastJsonResponse.Field<?, ?> field, String str, String str2) {
        zaG(field);
        bb1.g0(this.zab, field.getSafeParcelableFieldId(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringMapInternal(FastJsonResponse.Field<?, ?> field, String str, Map<String, String> map) {
        zaG(field);
        Bundle bundle = new Bundle();
        cvw.l(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        bb1.U(this.zab, field.getSafeParcelableFieldId(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        zaG(field);
        cvw.l(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i);
        }
        bb1.h0(this.zab, field.getSafeParcelableFieldId(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        cvw.m(this.zad, "Cannot convert to JSON on client side.");
        Parcel zaE = zaE();
        zaE.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.zae;
        cvw.l(str);
        Map zab = this.zad.zab(str);
        cvw.l(zab);
        zaH(sb, zab, zaE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zaa;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        Parcel zaE = zaE();
        if (zaE != null) {
            int n02 = bb1.n0(parcel, 2);
            parcel.appendFrom(zaE, 0, zaE.dataSize());
            bb1.o0(parcel, n02);
        }
        bb1.f0(parcel, 3, this.zac != 0 ? this.zad : null, i, false);
        bb1.o0(parcel, n0);
    }

    public final Parcel zaE() {
        int i = this.zaf;
        if (i == 0) {
            int n0 = bb1.n0(this.zab, 20293);
            this.zag = n0;
            bb1.o0(this.zab, n0);
            this.zaf = 2;
        } else if (i == 1) {
            bb1.o0(this.zab, this.zag);
            this.zaf = 2;
        }
        return this.zab;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zab(FastJsonResponse.Field field, String str, BigDecimal bigDecimal) {
        zaG(field);
        Parcel parcel = this.zab;
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (bigDecimal == null) {
            bb1.m0(safeParcelableFieldId, parcel, 0);
            return;
        }
        int n0 = bb1.n0(parcel, safeParcelableFieldId);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        bb1.o0(parcel, n0);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zad(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        cvw.l(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = (BigDecimal) arrayList.get(i);
        }
        Parcel parcel = this.zab;
        int n0 = bb1.n0(parcel, field.getSafeParcelableFieldId());
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(bigDecimalArr[i2].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i2].scale());
        }
        bb1.o0(parcel, n0);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaf(FastJsonResponse.Field field, String str, BigInteger bigInteger) {
        zaG(field);
        Parcel parcel = this.zab;
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (bigInteger == null) {
            bb1.m0(safeParcelableFieldId, parcel, 0);
            return;
        }
        int n0 = bb1.n0(parcel, safeParcelableFieldId);
        parcel.writeByteArray(bigInteger.toByteArray());
        bb1.o0(parcel, n0);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zah(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        cvw.l(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = (BigInteger) arrayList.get(i);
        }
        Parcel parcel = this.zab;
        int n0 = bb1.n0(parcel, field.getSafeParcelableFieldId());
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(bigIntegerArr[i2].toByteArray());
        }
        bb1.o0(parcel, n0);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zak(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        cvw.l(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
        }
        Parcel parcel = this.zab;
        int n0 = bb1.n0(parcel, field.getSafeParcelableFieldId());
        parcel.writeBooleanArray(zArr);
        bb1.o0(parcel, n0);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zan(FastJsonResponse.Field field, String str, double d) {
        zaG(field);
        Parcel parcel = this.zab;
        bb1.m0(field.getSafeParcelableFieldId(), parcel, 8);
        parcel.writeDouble(d);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zap(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        cvw.l(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        Parcel parcel = this.zab;
        int n0 = bb1.n0(parcel, field.getSafeParcelableFieldId());
        parcel.writeDoubleArray(dArr);
        bb1.o0(parcel, n0);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zar(FastJsonResponse.Field field, String str, float f) {
        zaG(field);
        Parcel parcel = this.zab;
        bb1.m0(field.getSafeParcelableFieldId(), parcel, 4);
        parcel.writeFloat(f);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zat(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        cvw.l(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) arrayList.get(i)).floatValue();
        }
        bb1.Y(this.zab, field.getSafeParcelableFieldId(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaw(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        cvw.l(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        bb1.b0(this.zab, field.getSafeParcelableFieldId(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaz(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        cvw.l(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        Parcel parcel = this.zab;
        int n0 = bb1.n0(parcel, field.getSafeParcelableFieldId());
        parcel.writeLongArray(jArr);
        bb1.o0(parcel, n0);
    }

    public SafeParcelResponse(int i, Parcel parcel, zan zanVar) {
        this.zaa = i;
        cvw.l(parcel);
        this.zab = parcel;
        this.zac = 2;
        this.zad = zanVar;
        this.zae = zanVar == null ? null : zanVar.zaa();
        this.zaf = 2;
    }

    public SafeParcelResponse(zan zanVar, String str) {
        this.zaa = 1;
        this.zab = Parcel.obtain();
        this.zac = 0;
        cvw.l(zanVar);
        this.zad = zanVar;
        cvw.l(str);
        this.zae = str;
        this.zaf = 0;
    }
}
