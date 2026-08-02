package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.ui.platform.m;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import defpackage.g131;
import defpackage.ldc;
import defpackage.ml6;
import defpackage.v2w;
import defpackage.zy11;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class m4m0 {
    public static f530 a(f530 f530Var, final ml6 ml6Var, ehr0 ehr0Var, int i) {
        if ((i & 2) != 0) {
            ehr0Var = qke.q;
        }
        final ehr0 ehr0Var2 = ehr0Var;
        return f530Var.k(new dh4(0L, ml6Var, ehr0Var2, m.b ? new tls() { // from class: androidx.compose.foundation.BackgroundKt$background$$inlined$debugInspectorInfo$1
            final /* synthetic */ float $alpha$inlined = 1.0f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                g131 g131Var = v2wVar.a;
                g131Var.b(CaretView.ALPHA_PROPERTY, Float.valueOf(this.$alpha$inlined));
                g131Var.b("brush", ml6.this);
                g131Var.b("shape", ehr0Var2);
                return zy11.a;
            }
        } : m.a(), 1));
    }

    public static final f530 b(f530 f530Var, final long j, final ehr0 ehr0Var) {
        return f530Var.k(new dh4(j, null, ehr0Var, m.b ? new tls() { // from class: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                g131 g131Var = v2wVar.a;
                g131Var.b("color", new ldc(j));
                g131Var.b("shape", ehr0Var);
                return zy11.a;
            }
        } : m.a(), 2));
    }

    public static sa90 c(Long l, Long l2) {
        if (l == null && l2 == null) {
            return new sa90(null, null);
        }
        if (l == null) {
            return new sa90(null, d(l2.longValue()));
        }
        if (l2 == null) {
            return new sa90(d(l.longValue()), null);
        }
        Calendar f = yv21.f();
        Calendar g = yv21.g(null);
        g.setTimeInMillis(l.longValue());
        Calendar g2 = yv21.g(null);
        g2.setTimeInMillis(l2.longValue());
        return g.get(1) == g2.get(1) ? g.get(1) == f.get(1) ? new sa90(e(l.longValue(), Locale.getDefault()), e(l2.longValue(), Locale.getDefault())) : new sa90(e(l.longValue(), Locale.getDefault()), g(l2.longValue(), Locale.getDefault())) : new sa90(g(l.longValue(), Locale.getDefault()), g(l2.longValue(), Locale.getDefault()));
    }

    public static String d(long j) {
        Calendar f = yv21.f();
        Calendar g = yv21.g(null);
        g.setTimeInMillis(j);
        return f.get(1) == g.get(1) ? e(j, Locale.getDefault()) : g(j, Locale.getDefault());
    }

    public static String e(long j, Locale locale) {
        return yv21.b("MMMd", locale).format(new Date(j));
    }

    public static int[] f(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static String g(long j, Locale locale) {
        return yv21.b("yMMMd", locale).format(new Date(j));
    }

    public static String h(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    public static String i(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] f = f(str2);
        if (f[0] != -1) {
            sb.append(str2);
            h(sb, f[1], f[2]);
            return sb.toString();
        }
        int[] f2 = f(str);
        if (f[3] == 0) {
            sb.append((CharSequence) str, 0, f2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (f[2] == 0) {
            sb.append((CharSequence) str, 0, f2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = f[1];
        if (i != 0) {
            int i2 = f2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return h(sb, f[1] + i2, i2 + f[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, f2[1]);
            sb.append(str2);
            int i3 = f2[1];
            return h(sb, i3, f[2] + i3);
        }
        int i4 = f2[0] + 2;
        int i5 = f2[1];
        if (i4 >= i5 || i5 != f2[2]) {
            int lastIndexOf = str.lastIndexOf(47, f2[2] - 1);
            int i6 = lastIndexOf == -1 ? f2[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return h(sb, f2[1], i6 + f[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = f2[1];
        return h(sb, i7, f[2] + i7 + 1);
    }

    public static Uri j(String str, String str2) {
        return Uri.parse(i(str, str2));
    }

    public static final PageHeaderEntity k(PageHeaderDto pageHeaderDto) {
        return new PageHeaderEntity(pageHeaderDto.getTitle(), pageHeaderDto.getDescription(), qxy0.c(pageHeaderDto.getImage(), null));
    }
}
