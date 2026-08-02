package defpackage;

import android.util.Pair;
import androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class ilo {
    public static final Pattern c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final ArrayList f;
    public final ArrayList a;
    public final ByteOrder b;

    static {
        glo gloVar = new glo(0);
        gloVar.b = 0;
        f = Collections.list(gloVar);
    }

    public ilo() {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        glo gloVar = new glo(1);
        gloVar.b = 0;
        this.a = Collections.list(gloVar);
        this.b = byteOrder;
    }

    public static Pair a(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair a = a(split[0]);
            if (((Integer) a.first).intValue() == 2) {
                return a;
            }
            for (int i = 1; i < split.length; i++) {
                Pair a2 = a(split[i]);
                int intValue = (((Integer) a2.first).equals(a.first) || ((Integer) a2.second).equals(a.first)) ? ((Integer) a.first).intValue() : -1;
                int intValue2 = (((Integer) a.second).intValue() == -1 || !(((Integer) a2.first).equals(a.second) || ((Integer) a2.second).equals(a.second))) ? -1 : ((Integer) a.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    a = new Pair(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    a = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return a;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public final void b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        c(str, str2, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x014a, code lost:
    
        if (r9 != r7) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0309  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str, String str2, List list) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        elo eloVar;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str3 = str;
        String str4 = str2;
        int i13 = 5;
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
            boolean find = d.matcher(str4).find();
            boolean find2 = e.matcher(str4).find();
            if (str4.length() != 19 || (!find && !find2)) {
                sgb1.g(5, "ExifData");
                return;
            } else if (find2) {
                str4 = str4.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        int i14 = 3;
        int i15 = 2;
        int i16 = 1;
        if (str4 != null && llo.e.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = c.matcher(str4);
                if (!matcher.find()) {
                    sgb1.g(5, "ExifData");
                    return;
                }
                StringBuilder sb = new StringBuilder();
                String group = matcher.group(1);
                group.getClass();
                sb.append(Integer.parseInt(group));
                sb.append("/1,");
                String group2 = matcher.group(2);
                group2.getClass();
                sb.append(Integer.parseInt(group2));
                sb.append("/1,");
                String group3 = matcher.group(3);
                group3.getClass();
                sb.append(Integer.parseInt(group3));
                sb.append("/1");
                str4 = sb.toString();
            } else {
                try {
                    str4 = ((long) (Double.parseDouble(str4) * 10000.0d)) + "/10000";
                } catch (NumberFormatException unused) {
                    sgb1.g(5, "ExifData");
                    return;
                }
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (true) {
            ylo[] yloVarArr = llo.c;
            if (i18 >= 4) {
                return;
            }
            ylo yloVar = (ylo) ((HashMap) f.get(i18)).get(str3);
            if (yloVar != null) {
                int i19 = yloVar.d;
                int i20 = yloVar.c;
                if (str4 == null) {
                    ((Map) list.get(i18)).remove(str3);
                } else {
                    Pair a = a(str4);
                    int i21 = -1;
                    if (i20 != ((Integer) a.first).intValue() && i20 != ((Integer) a.second).intValue()) {
                        if (i19 == -1 || (i19 != ((Integer) a.first).intValue() && i19 != ((Integer) a.second).intValue())) {
                            if (i20 != i16) {
                                if (i20 != 7) {
                                }
                            }
                        }
                        ByteOrder byteOrder = this.b;
                        switch (i19) {
                            case 1:
                                int i22 = i17;
                                i4 = i14;
                                i3 = i15;
                                int i23 = i16;
                                i = i13;
                                Map map = (Map) list.get(i18);
                                Charset charset = elo.d;
                                i2 = i23;
                                if (str4.length() == i2) {
                                    i5 = i22;
                                    if (str4.charAt(i5) >= '0' && str4.charAt(i5) <= '1') {
                                        byte[] bArr = new byte[i2];
                                        bArr[i5] = (byte) (str4.charAt(i5) - MoneyInputEditView.DEFAULT_VALUE);
                                        eloVar = new elo(i2, i2, bArr);
                                        map.put(str3, eloVar);
                                        break;
                                    }
                                } else {
                                    i5 = i22;
                                }
                                byte[] bytes = str4.getBytes(elo.d);
                                eloVar = new elo(i2, bytes.length, bytes);
                                map.put(str3, eloVar);
                                break;
                            case 2:
                            case 7:
                                int i24 = i17;
                                i4 = i14;
                                int i25 = i16;
                                i = i13;
                                Map map2 = (Map) list.get(i18);
                                Charset charset2 = elo.d;
                                byte[] bytes2 = str4.concat("\u0000").getBytes(elo.d);
                                i3 = 2;
                                map2.put(str3, new elo(2, bytes2.length, bytes2));
                                i2 = i25;
                                i5 = i24;
                                break;
                            case 3:
                                i6 = i17;
                                int i26 = i14;
                                int i27 = i16;
                                i = i13;
                                String[] split = str4.split(",", -1);
                                int length = split.length;
                                int[] iArr = new int[length];
                                for (int i28 = i6; i28 < split.length; i28++) {
                                    iArr[i28] = Integer.parseInt(split[i28]);
                                }
                                Map map3 = (Map) list.get(i18);
                                ByteBuffer wrap = ByteBuffer.wrap(new byte[elo.f[i26] * length]);
                                wrap.order(byteOrder);
                                for (int i29 = i6; i29 < length; i29++) {
                                    wrap.putShort((short) iArr[i29]);
                                }
                                i4 = i26;
                                map3.put(str3, new elo(i4, length, wrap.array()));
                                i2 = i27;
                                i5 = i6;
                                i3 = 2;
                                break;
                            case 4:
                                i6 = i17;
                                i7 = i14;
                                i8 = i16;
                                i = i13;
                                String[] split2 = str4.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i30 = i6; i30 < split2.length; i30++) {
                                    jArr[i30] = Long.parseLong(split2[i30]);
                                }
                                ((Map) list.get(i18)).put(str3, elo.b(jArr, byteOrder));
                                i2 = i8;
                                i4 = i7;
                                i5 = i6;
                                i3 = 2;
                                break;
                            case 5:
                                i6 = i17;
                                i7 = i14;
                                int i31 = i13;
                                i8 = i16;
                                String[] split3 = str4.split(",", -1);
                                int length2 = split3.length;
                                ti6[] ti6VarArr = new ti6[length2];
                                int i32 = i6;
                                while (i32 < split3.length) {
                                    String[] split4 = split3[i32].split("/", i21);
                                    ti6[] ti6VarArr2 = ti6VarArr;
                                    int i33 = i32;
                                    ti6VarArr2[i33] = new ti6((long) Double.parseDouble(split4[i6]), (long) Double.parseDouble(split4[i8]), 3, (byte) 0);
                                    i32 = i33 + 1;
                                    ti6VarArr = ti6VarArr2;
                                    i21 = -1;
                                }
                                ti6[] ti6VarArr3 = ti6VarArr;
                                Map map4 = (Map) list.get(i18);
                                ByteBuffer wrap2 = ByteBuffer.wrap(new byte[elo.f[i31] * length2]);
                                wrap2.order(byteOrder);
                                for (int i34 = i6; i34 < length2; i34++) {
                                    ti6 ti6Var = ti6VarArr3[i34];
                                    wrap2.putInt((int) ti6Var.b);
                                    wrap2.putInt((int) ti6Var.c);
                                }
                                i = i31;
                                map4.put(str3, new elo(i, length2, wrap2.array()));
                                i2 = i8;
                                i4 = i7;
                                i5 = i6;
                                i3 = 2;
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                int i35 = i16;
                                i = i13;
                                i2 = i35;
                                i4 = i14;
                                i3 = i15;
                                i5 = i17;
                                break;
                            case 9:
                                i9 = i17;
                                i10 = i14;
                                i11 = i13;
                                i12 = i16;
                                String[] split5 = str4.split(",", -1);
                                int length3 = split5.length;
                                int[] iArr2 = new int[length3];
                                for (int i36 = i9; i36 < split5.length; i36++) {
                                    iArr2[i36] = Integer.parseInt(split5[i36]);
                                }
                                Map map5 = (Map) list.get(i18);
                                ByteBuffer wrap3 = ByteBuffer.wrap(new byte[elo.f[9] * length3]);
                                wrap3.order(byteOrder);
                                for (int i37 = i9; i37 < length3; i37++) {
                                    wrap3.putInt(iArr2[i37]);
                                }
                                map5.put(str3, new elo(9, length3, wrap3.array()));
                                i2 = i12;
                                i4 = i10;
                                i5 = i9;
                                i = i11;
                                i3 = 2;
                                break;
                            case 10:
                                i12 = i16;
                                String[] split6 = str4.split(",", -1);
                                int length4 = split6.length;
                                ti6[] ti6VarArr4 = new ti6[length4];
                                int i38 = i17;
                                while (i38 < split6.length) {
                                    String[] split7 = split6[i38].split("/", -1);
                                    ti6VarArr4[i38] = new ti6((long) Double.parseDouble(split7[i17]), (long) Double.parseDouble(split7[i12]), 3, (byte) 0);
                                    i38++;
                                    i14 = i14;
                                    i17 = i17;
                                    i13 = i13;
                                    split6 = split6;
                                }
                                i9 = i17;
                                i10 = i14;
                                i11 = i13;
                                Map map6 = (Map) list.get(i18);
                                ByteBuffer wrap4 = ByteBuffer.wrap(new byte[elo.f[10] * length4]);
                                wrap4.order(byteOrder);
                                for (int i39 = i9; i39 < length4; i39++) {
                                    ti6 ti6Var2 = ti6VarArr4[i39];
                                    wrap4.putInt((int) ti6Var2.b);
                                    wrap4.putInt((int) ti6Var2.c);
                                }
                                map6.put(str3, new elo(10, length4, wrap4.array()));
                                i2 = i12;
                                i4 = i10;
                                i5 = i9;
                                i = i11;
                                i3 = 2;
                                break;
                            case 12:
                                String[] split8 = str4.split(",", -1);
                                int length5 = split8.length;
                                double[] dArr = new double[length5];
                                for (int i40 = i17; i40 < split8.length; i40++) {
                                    dArr[i40] = Double.parseDouble(split8[i40]);
                                }
                                Map map7 = (Map) list.get(i18);
                                ByteBuffer wrap5 = ByteBuffer.wrap(new byte[elo.f[12] * length5]);
                                wrap5.order(byteOrder);
                                int i41 = i17;
                                while (i41 < length5) {
                                    wrap5.putDouble(dArr[i41]);
                                    i41++;
                                    i16 = i16;
                                }
                                int i42 = i16;
                                map7.put(str3, new elo(12, length5, wrap5.array()));
                                i4 = i14;
                                i = i13;
                                i3 = 2;
                                i2 = i42;
                                i5 = i17;
                                break;
                        }
                        i18++;
                        int i43 = i;
                        i16 = i2;
                        i13 = i43;
                        i17 = i5;
                        i14 = i4;
                        i15 = i3;
                    }
                    i19 = i20;
                    ByteOrder byteOrder2 = this.b;
                    switch (i19) {
                    }
                    i18++;
                    int i432 = i;
                    i16 = i2;
                    i13 = i432;
                    i17 = i5;
                    i14 = i4;
                    i15 = i3;
                }
            }
            int i44 = i16;
            i = i13;
            i2 = i44;
            i4 = i14;
            i3 = i15;
            i5 = i17;
            i18++;
            int i4322 = i;
            i16 = i2;
            i13 = i4322;
            i17 = i5;
            i14 = i4;
            i15 = i3;
        }
    }

    public final void d(float f2) {
        c("FocalLength", ((long) (f2 * 1000.0f)) + "/1000", this.a);
    }

    public final void e(int i) {
        String valueOf = String.valueOf(3);
        ArrayList arrayList = this.a;
        c("SensitivityType", valueOf, arrayList);
        c("PhotographicSensitivity", String.valueOf(Math.min(65535, i)), arrayList);
    }

    public final void f(int i) {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else if (i == 90) {
            i2 = 6;
        } else if (i == 180) {
            i2 = 3;
        } else if (i != 270) {
            sgb1.g(5, "ExifData");
            i2 = 0;
        } else {
            i2 = 8;
        }
        c("Orientation", String.valueOf(i2), this.a);
    }

    public final void g(ExifData$WhiteBalanceMode exifData$WhiteBalanceMode) {
        int ordinal = exifData$WhiteBalanceMode.ordinal();
        c("WhiteBalance", ordinal != 0 ? ordinal != 1 ? null : String.valueOf(1) : String.valueOf(0), this.a);
    }
}
