package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.primitives.a;
import com.yandex.go.sql.BaseDatabaseHelper;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class bpy0 extends x5v {
    public final String b;
    public final ImmutableList c;

    /* JADX WARN: Multi-variable type inference failed */
    public bpy0(String str, String str2, List list) {
        super(str);
        d6z.l(!((AbstractCollection) list).isEmpty());
        this.b = str2;
        ImmutableList l = ImmutableList.l(list);
        this.c = l;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bpy0.class != obj.getClass()) {
            return false;
        }
        bpy0 bpy0Var = (bpy0) obj;
        return this.a.equals(bpy0Var.a) && Objects.equals(this.b, bpy0Var.b) && this.c.equals(bpy0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((b + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s820
    public final void populateMediaMetadata(qe10 qe10Var) {
        char c;
        String str = this.a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = HexString.LF;
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals(BaseDatabaseHelper.TYPE_TEXT)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        ImmutableList immutableList = this.c;
        try {
            switch (c) {
                case 0:
                case '\n':
                    qe10Var.c = (CharSequence) immutableList.get(0);
                    break;
                case 1:
                case 11:
                    qe10Var.s = (CharSequence) immutableList.get(0);
                    break;
                case 2:
                case '\r':
                    String str2 = (String) immutableList.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    qe10Var.m = Integer.valueOf(parseInt);
                    qe10Var.n = Integer.valueOf(parseInt2);
                    break;
                case 3:
                case 18:
                    qe10Var.b = (CharSequence) immutableList.get(0);
                    break;
                case 4:
                case 19:
                    qe10Var.d = (CharSequence) immutableList.get(0);
                    break;
                case 5:
                case 20:
                    qe10Var.t = (CharSequence) immutableList.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = (String) immutableList.get(0);
                    int i = tw21.a;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    qe10Var.h = Integer.valueOf(parseInt3);
                    qe10Var.i = valueOf;
                    break;
                case 7:
                case 17:
                    qe10Var.a = (CharSequence) immutableList.get(0);
                    break;
                case '\b':
                case 16:
                    qe10Var.r = (CharSequence) immutableList.get(0);
                    break;
                case '\t':
                case 22:
                    qe10Var.l = Integer.valueOf(Integer.parseInt((String) immutableList.get(0)));
                    break;
                case '\f':
                    Integer f = a.f((String) immutableList.get(0));
                    if (f != null) {
                        String a = z5v.a(f.intValue());
                        if (a != null) {
                            qe10Var.w = a;
                            break;
                        }
                    } else {
                        qe10Var.w = (CharSequence) immutableList.get(0);
                        break;
                    }
                    break;
                case 14:
                    ArrayList a2 = a((String) immutableList.get(0));
                    int size = a2.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                qe10Var.n = (Integer) a2.get(2);
                            }
                        }
                        qe10Var.m = (Integer) a2.get(1);
                    }
                    qe10Var.l = (Integer) a2.get(0);
                    break;
                case 15:
                    ArrayList a3 = a((String) immutableList.get(0));
                    int size2 = a3.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                qe10Var.q = (Integer) a3.get(2);
                            }
                        }
                        qe10Var.p = (Integer) a3.get(1);
                    }
                    qe10Var.o = (Integer) a3.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // defpackage.x5v
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
