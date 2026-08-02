package yads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class c73 extends x21 {
    public static final Parcelable.Creator<c73> CREATOR = new b73();
    public final String c;
    public final String d;

    public c73(Parcel parcel) {
        super((String) mc3.a((Object) parcel.readString()));
        this.c = parcel.readString();
        this.d = (String) mc3.a((Object) parcel.readString());
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
        if (obj != null && c73.class == obj.getClass()) {
            c73 c73Var = (c73) obj;
            if (mc3.a(this.b, c73Var.b) && mc3.a(this.c, c73Var.c) && mc3.a(this.d, c73Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a = k4.a(this.b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.c;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.x21
    public final String toString() {
        return this.b + ": description=" + this.c + ": value=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public c73(String str, String str2, String str3) {
        super(str);
        this.c = str2;
        this.d = str3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // yads.tt1
    public final void a(jn1 jn1Var) {
        char c;
        String str = this.b;
        str.getClass();
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
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    jn1Var.c = this.d;
                    break;
                case 1:
                case 11:
                    jn1Var.x = this.d;
                    break;
                case 2:
                case '\f':
                    int parseInt = Integer.parseInt(this.d.substring(2, 4));
                    int parseInt2 = Integer.parseInt(this.d.substring(0, 2));
                    jn1Var.r = Integer.valueOf(parseInt);
                    jn1Var.s = Integer.valueOf(parseInt2);
                    break;
                case 3:
                case 17:
                    jn1Var.b = this.d;
                    break;
                case 4:
                case 18:
                    jn1Var.d = this.d;
                    break;
                case 5:
                case 19:
                    jn1Var.y = this.d;
                    break;
                case 6:
                case 20:
                    String str2 = this.d;
                    int i = mc3.a;
                    String[] split = str2.split(DomExceptionUtils.SEPARATOR, -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    jn1Var.m = Integer.valueOf(parseInt3);
                    jn1Var.n = valueOf;
                    break;
                case 7:
                case 16:
                    jn1Var.a = this.d;
                    break;
                case '\b':
                case 15:
                    jn1Var.w = this.d;
                    break;
                case '\t':
                case 21:
                    jn1Var.q = Integer.valueOf(Integer.parseInt(this.d));
                    break;
                case '\r':
                    ArrayList a = a(this.d);
                    int size = a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                jn1Var.s = (Integer) a.get(2);
                            }
                        }
                        jn1Var.r = (Integer) a.get(1);
                    }
                    jn1Var.q = (Integer) a.get(0);
                    break;
                case 14:
                    ArrayList a2 = a(this.d);
                    int size2 = a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                jn1Var.v = (Integer) a2.get(2);
                            }
                        }
                        jn1Var.u = (Integer) a2.get(1);
                    }
                    jn1Var.t = (Integer) a2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
