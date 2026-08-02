package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.internal.screens.common.TransferContactsUtils$Companion$ElementsType;
import com.ybsdk.feature.transfer.version2.internal.screens.common.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class ph01 {
    public final a a;
    public final TransferContactsUtils$Companion$ElementsType b;
    public final Regex c = new Regex("^\\+?[0-9 ()-]{0,15}$");

    public ph01(a aVar, TransferContactsUtils$Companion$ElementsType transferContactsUtils$Companion$ElementsType) {
        this.a = aVar;
        this.b = transferContactsUtils$Companion$ElementsType;
    }

    public final bj01 a() {
        ury uryVar;
        int i = oh01.a[this.b.ordinal()];
        if (i == 1) {
            uryVar = zi01.a;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            uryVar = eu20.a;
        }
        return new bj01(uryVar, unr0.h(Text.Companion, dzh0.ybsdk_transfer_choose_from_device_contacts), null, new vno(vxg0.ybsdk_default_avatar, 7), Integer.valueOf(vxg0.ybsdk_ic_arrow_select), false, 192);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f8, code lost:
    
        if (r0.b(r2, r3, r13) != null) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List b(String str, List list) {
        boolean z;
        boolean z2;
        int i;
        char charAt;
        boolean h = this.c.h(str);
        a aVar = this.a;
        aVar.getClass();
        String d = kfb0.d(str);
        boolean z3 = 0;
        String c = aVar.c(str, false);
        List d2 = a.d(c);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        for (int i2 = 0; i2 < lowerCase.length() && (charAt = lowerCase.charAt(i2)) != 1100 && charAt != 1098; i2++) {
        }
        if (d.length() == 0 && c.length() == 0) {
            return evu0.J(str) ? list : EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            v9e v9eVar = (v9e) obj;
            jfb0 jfb0Var = v9eVar.b;
            String str2 = v9eVar.a;
            ho01 ho01Var = aVar.a;
            boolean z4 = true;
            if (ho01Var.a) {
                if (d.length() > 0) {
                    String b = jfb0Var.b();
                    if (evu0.y(b, d, z3)) {
                        z = h;
                    } else if (h && d.length() >= ho01Var.c.a) {
                        int length = d.length();
                        List list2 = aVar.c;
                        if (list2.isEmpty()) {
                            z = h;
                            i = z3;
                        } else {
                            go01 go01Var = (go01) kotlin.collections.a.P(list2);
                            Iterator it = list2.iterator();
                            go01 go01Var2 = go01Var;
                            while (true) {
                                if (!it.hasNext()) {
                                    z = h;
                                    break;
                                }
                                go01 go01Var3 = (go01) it.next();
                                z = h;
                                if (length < go01Var3.a) {
                                    break;
                                }
                                go01Var2 = go01Var3;
                                h = z;
                            }
                            i = go01Var2.b;
                        }
                    }
                    z4 = true;
                    break;
                }
                z = h;
                if (!z) {
                    for (int i3 = 0; i3 < str.length(); i3++) {
                        char charAt2 = str.charAt(i3);
                        if (!Character.isLetterOrDigit(charAt2) && !rza.b(charAt2)) {
                            z4 = evu0.y(str2, str, true);
                            break;
                        }
                    }
                }
                if (c.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null && !evu0.J(str2)) {
                    String c2 = aVar.c(str2, false);
                    if (c2.length() != 0) {
                        if (!evu0.y(c2, c, false)) {
                            int length2 = c.length();
                            int i4 = ho01Var.b.a;
                            if (length2 >= i4) {
                                for (int i5 = 0; i5 < c.length(); i5++) {
                                    char charAt3 = c.charAt(i5);
                                    if (charAt3 == 1100 || charAt3 == 1098) {
                                        z2 = true;
                                        break;
                                    }
                                }
                                z2 = false;
                                if (!z2) {
                                    c2 = aVar.c(str2, true);
                                }
                                String c3 = !z2 ? aVar.c(c, true) : c;
                                if (!evu0.y(c2, c3, false)) {
                                    List d3 = a.d(c2);
                                    if (d2.size() <= 1) {
                                        int a = aVar.a(c3.length());
                                        List<String> list3 = d3;
                                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                            for (String str3 : list3) {
                                                if (str3.length() < i4 || aVar.b(a, c3, str3) == null) {
                                                }
                                            }
                                        }
                                    } else {
                                        List<String> list4 = d2;
                                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                            for (String str4 : list4) {
                                                if (str4.length() < i4) {
                                                    List list5 = d3;
                                                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                                        Iterator it2 = list5.iterator();
                                                        while (it2.hasNext()) {
                                                            if (evu0.y((String) it2.next(), str4, false)) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int a2 = aVar.a(str4.length());
                                                    List<String> list6 = d3;
                                                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                                                        for (String str5 : list6) {
                                                            if (str5.length() < i4 || aVar.b(a2, str4, str5) == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z4 = true;
                        break;
                    }
                }
                z4 = false;
                break;
            }
            if (evu0.J(str) || evu0.y(str2, str, true) || (d.length() > 0 && evu0.y(jfb0Var.b(), d, z3))) {
                z = h;
            } else {
                z = h;
                z4 = z3;
            }
            if (z4) {
                arrayList.add(obj);
            }
            h = z;
            z3 = 0;
        }
        return arrayList;
    }
}
