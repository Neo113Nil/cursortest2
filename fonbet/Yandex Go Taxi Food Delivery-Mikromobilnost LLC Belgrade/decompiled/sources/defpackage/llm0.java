package defpackage;

import android.bluetooth.le.ScanFilter;
import android.os.ParcelUuid;
import java.util.ArrayList;
import java.util.Iterator;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Identifier;
import org.altbeacon.beacon.Region;

/* loaded from: classes4.dex */
public class llm0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0190  */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(ArrayList arrayList) {
        byte b;
        byte b2;
        byte[] bArr;
        byte[] bArr2;
        Iterator it;
        int i;
        ArrayList arrayList2 = new ArrayList();
        Long l = null;
        arrayList2.add(null);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Region region = (Region) it2.next();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                BeaconParser beaconParser = (BeaconParser) it3.next();
                ?? identifiers = region == null ? l : region.getIdentifiers();
                ArrayList arrayList4 = new ArrayList();
                long longValue = beaconParser.i().longValue();
                int k = beaconParser.k();
                int j = beaconParser.j();
                byte[] n = BeaconParser.n(true, (j - k) + 1, longValue);
                int i2 = 0;
                if (identifiers == 0 || identifiers.size() <= 0 || identifiers.get(0) == null || beaconParser.i().longValue() != 533) {
                    b = -1;
                } else {
                    int[] h = beaconParser.h();
                    b = -1;
                    if (h.length > 0) {
                        int i3 = h[0];
                        klm0 klm0Var = new klm0();
                        klm0Var.c = i3;
                        int i4 = identifiers.size() == 2 ? 20 : 18;
                        if (identifiers.size() == 3) {
                            i4 = 22;
                        }
                        byte[] bArr3 = new byte[i4];
                        klm0Var.d = bArr3;
                        bArr3[0] = n[0];
                        bArr3[1] = n[1];
                        byte[] f = ((Identifier) identifiers.get(0)).f();
                        for (int i5 = 0; i5 < f.length; i5++) {
                            klm0Var.d[i5 + 2] = f[i5];
                        }
                        if (identifiers.size() > 1 && identifiers.get(1) != null) {
                            byte[] f2 = ((Identifier) identifiers.get(1)).f();
                            for (int i6 = 0; i6 < f2.length; i6++) {
                                klm0Var.d[i6 + 18] = f2[i6];
                            }
                        }
                        if (identifiers.size() > 2 && identifiers.get(2) != null) {
                            byte[] f3 = ((Identifier) identifiers.get(2)).f();
                            for (int i7 = 0; i7 < f3.length; i7++) {
                                klm0Var.d[i7 + 20] = f3[i7];
                            }
                        }
                        klm0Var.e = new byte[i4];
                        for (int i8 = 0; i8 < i4; i8++) {
                            klm0Var.e[i8] = -1;
                        }
                        klm0Var.a = l;
                        klm0Var.b = new byte[0];
                        arrayList4.add(klm0Var);
                        Iterator it4 = it2;
                        Region region2 = region;
                        int i9 = i2;
                        it = arrayList4.iterator();
                        while (it.hasNext()) {
                            klm0 klm0Var2 = (klm0) it.next();
                            ScanFilter.Builder builder = new ScanFilter.Builder();
                            Long l2 = klm0Var2.a;
                            if (l2 != null) {
                                builder.setServiceUuid(ParcelUuid.fromString(String.format("0000%04X-0000-1000-8000-00805f9b34fb", l2)), ParcelUuid.fromString("FFFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF"));
                                i = i9;
                            } else {
                                byte[] bArr4 = klm0Var2.b;
                                if (bArr4.length != 0) {
                                    i = i9;
                                    builder.setServiceUuid(ParcelUuid.fromString(Identifier.a(bArr4, i, 16, true).toString()), ParcelUuid.fromString("FFFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF"));
                                } else {
                                    i = i9;
                                    builder.setServiceUuid(null);
                                    builder.setManufacturerData(klm0Var2.c, klm0Var2.d, klm0Var2.e);
                                }
                            }
                            arrayList3.add(builder.build());
                            i9 = i;
                        }
                        it2 = it4;
                        region = region2;
                        l = null;
                    }
                }
                int[] h2 = beaconParser.h();
                int length = h2.length;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = h2[i10];
                    klm0 klm0Var3 = new klm0();
                    Long l3 = beaconParser.l();
                    Iterator it5 = it2;
                    int i12 = j - 1;
                    Region region3 = region;
                    byte[] bArr5 = new byte[i2];
                    byte[] bArr6 = new byte[i2];
                    if (i12 > 0) {
                        bArr2 = new byte[i12];
                        bArr = new byte[i12];
                        b2 = i2;
                        for (int i13 = 2; i13 <= j; i13++) {
                            int i14 = i13 - 2;
                            if (i13 < k) {
                                bArr2[i14] = b2;
                                bArr[i14] = b2;
                            } else {
                                bArr2[i14] = n[i13 - k];
                                bArr[i14] = b;
                            }
                        }
                    } else {
                        b2 = i2;
                        bArr = bArr6;
                        bArr2 = bArr5;
                    }
                    klm0Var3.c = i11;
                    klm0Var3.d = bArr2;
                    klm0Var3.e = bArr;
                    klm0Var3.a = l3;
                    klm0Var3.b = beaconParser.m();
                    arrayList4.add(klm0Var3);
                    i10++;
                    it2 = it5;
                    region = region3;
                    i2 = b2;
                }
                Iterator it42 = it2;
                Region region22 = region;
                int i92 = i2;
                it = arrayList4.iterator();
                while (it.hasNext()) {
                }
                it2 = it42;
                region = region22;
                l = null;
            }
        }
        return arrayList3;
    }
}
