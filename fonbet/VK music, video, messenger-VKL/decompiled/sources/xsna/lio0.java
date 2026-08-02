package xsna;

import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.common.collect.ImmutableList;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Objects;
import xsna.vr10;

/* compiled from: TextInformationFrame.java */
/* loaded from: classes12.dex */
public final class lio0 extends asv {

    @Nullable
    public final String b;
    public final ImmutableList<String> c;

    public lio0(String str, @Nullable String str2, com.google.common.collect.g gVar) {
        super(str);
        fxc0.p(!gVar.isEmpty());
        this.b = str2;
        ImmutableList<String> m = ImmutableList.m(gVar);
        this.c = m;
        m.get(0);
    }

    public static ArrayList d(String str) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // xsna.fi20.a
    public final void c(vr10.a aVar) {
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
                    c = '\r';
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
                if (str.equals("TEXT")) {
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
        ImmutableList<String> immutableList = this.c;
        try {
            switch (c) {
                case 0:
                case '\n':
                    aVar.c = immutableList.get(0);
                    break;
                case 1:
                case 11:
                    aVar.s = immutableList.get(0);
                    break;
                case 2:
                case '\r':
                    String str2 = immutableList.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    aVar.m = Integer.valueOf(parseInt);
                    aVar.n = Integer.valueOf(parseInt2);
                    break;
                case 3:
                case 18:
                    aVar.b = immutableList.get(0);
                    break;
                case 4:
                case 19:
                    aVar.d = immutableList.get(0);
                    break;
                case 5:
                case 20:
                    aVar.t = immutableList.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = immutableList.get(0);
                    String str4 = y2r0.a;
                    String[] split = str3.split(DomExceptionUtils.SEPARATOR, -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    aVar.h = Integer.valueOf(parseInt3);
                    aVar.i = valueOf;
                    break;
                case 7:
                case 17:
                    aVar.a = immutableList.get(0);
                    break;
                case '\b':
                case 16:
                    aVar.r = immutableList.get(0);
                    break;
                case '\t':
                case 22:
                    aVar.l = Integer.valueOf(Integer.parseInt(immutableList.get(0)));
                    break;
                case '\f':
                    Integer z = ipx.z(immutableList.get(0));
                    if (z != null) {
                        String a = dsv.a(z.intValue());
                        if (a != null) {
                            aVar.w = a;
                            break;
                        }
                    } else {
                        aVar.w = immutableList.get(0);
                        break;
                    }
                    break;
                case 14:
                    ArrayList d = d(immutableList.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.n = (Integer) d.get(2);
                            }
                        }
                        aVar.m = (Integer) d.get(1);
                    }
                    aVar.l = (Integer) d.get(0);
                    break;
                case 15:
                    ArrayList d2 = d(immutableList.get(0));
                    int size2 = d2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.q = (Integer) d2.get(2);
                            }
                        }
                        aVar.p = (Integer) d2.get(1);
                    }
                    aVar.o = (Integer) d2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lio0.class == obj.getClass()) {
            lio0 lio0Var = (lio0) obj;
            if (Objects.equals(this.a, lio0Var.a) && Objects.equals(this.b, lio0Var.b)) {
                ImmutableList<String> immutableList = lio0Var.c;
                ImmutableList<String> immutableList2 = this.c;
                immutableList2.getClass();
                if (qhz.a(immutableList2, immutableList)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int a = urd0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((a + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // xsna.asv
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
