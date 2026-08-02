package defpackage;

import android.net.Uri;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.navigator.compose.button.CustomButtonStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class b791 {
    public static final r501 a = new r501(12);

    public static final void a(final f530 f530Var, ButtonSize buttonSize, CustomButtonStyle customButtonStyle, final sls slsVar, final e68 e68Var, fid fidVar, final int i, final int i2) {
        int i3;
        final ButtonSize buttonSize2;
        final CustomButtonStyle customButtonStyle2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2034439333);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.c(buttonSize == null ? -1 : buttonSize.ordinal()) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.c(customButtonStyle != null ? customButtonStyle.ordinal() : -1) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= (32768 & i) == 0 ? btsVar.k(e68Var) : btsVar.e(e68Var) ? 16384 : 8192;
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                if (i4 != 0) {
                    buttonSize = ButtonSize.L;
                }
                if (i5 != 0) {
                    customButtonStyle = CustomButtonStyle.Blur80;
                }
            } else {
                btsVar.Y();
            }
            buttonSize2 = buttonSize;
            final CustomButtonStyle customButtonStyle3 = customButtonStyle;
            btsVar.u();
            boolean z = e68Var.b;
            boolean z2 = e68Var.a;
            if (!z) {
                v = btsVar.v();
                if (v != null) {
                    final int i6 = 0;
                    wlsVar = new wls() { // from class: re90
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = i6;
                            zy11 zy11Var = zy11.a;
                            int i8 = i;
                            switch (i7) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(i8 | 1);
                                    b791.a(f530Var, buttonSize2, customButtonStyle3, slsVar, e68Var, (fid) obj, O, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(i8 | 1);
                                    b791.a(f530Var, buttonSize2, customButtonStyle3, slsVar, e68Var, (fid) obj, O2, i2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            y4b1.a(f530Var, customButtonStyle3, buttonSize2, slsVar, wwg.S(356800339, true, new q07(tje.n(z2 ? new up2(zp2.a) : AppColor$Palette.TextInvert, btsVar), z2 ? new up2(rzo.f(4279856122L)) : AppColor$Palette.Text, 5), btsVar), btsVar, (i3 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | ((i3 >> 3) & 112) | ((i3 << 3) & 896) | (i3 & 7168), 0);
            customButtonStyle2 = customButtonStyle3;
        } else {
            btsVar.Y();
            buttonSize2 = buttonSize;
            customButtonStyle2 = customButtonStyle;
        }
        v = btsVar.v();
        if (v != null) {
            final int i7 = 1;
            wlsVar = new wls() { // from class: re90
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i72 = i7;
                    zy11 zy11Var = zy11.a;
                    int i8 = i;
                    switch (i72) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(i8 | 1);
                            b791.a(f530Var, buttonSize2, customButtonStyle2, slsVar, e68Var, (fid) obj, O, i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(i8 | 1);
                            b791.a(f530Var, buttonSize2, customButtonStyle2, slsVar, e68Var, (fid) obj, O2, i2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void b(Uri uri, boolean z) {
        if (z) {
            try {
                List c = c(uri);
                if (c.isEmpty()) {
                    return;
                }
                trp0 trp0Var = trp0.a;
                trp0.e(new pqp0(uri.toString(), e6b1.e(uri).name(), c.toString()));
            } catch (Throwable unused) {
            }
        }
    }

    public static final List c(Uri uri) {
        List<String> W;
        List W2;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.length() == 0) {
            return EmptyList.a;
        }
        W = evu0.W(encodedQuery, new String[]{"&"}, (r2 & 4) != 0 ? 0 : 2);
        ArrayList arrayList = new ArrayList();
        Pattern compile = Pattern.compile("^[A-Za-z0-9\\-_\\.~%]*$");
        for (String str : W) {
            W2 = evu0.W(str, new String[]{"="}, (r2 & 4) != 0 ? 0 : 2);
            String str2 = (String) W2.get(0);
            String str3 = W2.size() > 1 ? (String) W2.get(1) : "";
            if (!compile.matcher(str2).matches()) {
                arrayList.add(str);
            } else if (!compile.matcher(str3).matches()) {
                arrayList.add(str);
            } else if (evu0.y(str2, "%", false) && !e(str2)) {
                arrayList.add(str);
            } else if (evu0.y(str3, "%", false) && !e(str3)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static final boolean d(kn21 kn21Var) {
        int i = gn21.a[kn21Var.a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return true;
        }
        w511.b();
        return false;
    }

    public static final boolean e(String str) {
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '%') {
                if (i + 2 < str.length()) {
                    int i2 = i + 1;
                    i += 3;
                    String substring = str.substring(i2, i);
                    try {
                        rza.a(16);
                        Integer.parseInt(substring, 16);
                    } catch (NumberFormatException unused) {
                    }
                }
                return false;
            }
            i++;
        }
        return true;
    }
}
