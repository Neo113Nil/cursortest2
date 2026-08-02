package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.xplat.xflags.MissingVariableError;
import com.yandex.xplat.xflags.UnknownOperationError;
import io.appmetrica.analytics.AppMetrica;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class mf1 implements jun, sm60, man, k120, mvo {
    public static final mf1 A;
    public static final mf1 B;
    public static final mf1 C;
    public static final mf1 D;
    public static final mf1 E;
    public static final mf1 F;
    public static final mf1 c;
    public static final mf1 w;
    public static final mf1 x;
    public static final mf1 y;
    public static final mf1 z;
    public final /* synthetic */ int a;
    public String b;

    static {
        int i = 0;
        byte b = 0;
        c = new mf1(b, i, "TINK");
        w = new mf1(b, i, "CRUNCHY");
        x = new mf1(b, i, "LEGACY");
        y = new mf1(b, i, "NO_PREFIX");
        int i2 = 1;
        z = new mf1(b, i2, "TINK");
        A = new mf1(b, i2, "CRUNCHY");
        B = new mf1(b, i2, "NO_PREFIX");
        int i3 = 2;
        C = new mf1(b, i3, JCP.RAW_PREFIX);
        D = new mf1(b, i3, "FULL");
        int i4 = 3;
        E = new mf1(b, i4, "FOLD");
        F = new mf1(b, i4, "HINGE");
    }

    public mf1(gff gffVar, int i) {
        this.a = i;
        switch (i) {
            case 17:
                this.b = gffVar.f;
                break;
            default:
                this.b = gffVar.f;
                break;
        }
    }

    public static mf1 n(ef90 ef90Var) {
        String str;
        ef90Var.L(2);
        int y2 = ef90Var.y();
        int i = y2 >> 1;
        int y3 = ((ef90Var.y() >> 3) & 31) | ((y2 & 1) << 5);
        int i2 = 8;
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder t = qv10.t(str);
        String str2 = Extension.DOT_CHAR;
        t.append(i < 10 ? ".0" : Extension.DOT_CHAR);
        t.append(i);
        if (y3 < 10) {
            str2 = ".0";
        }
        return new mf1((byte) 0, i2, unr0.m(y3, str2, t));
    }

    @Override // defpackage.man
    public int a(int i) {
        return -1;
    }

    @Override // defpackage.man
    public boolean b(int i) {
        return false;
    }

    @Override // defpackage.jun
    public boolean c(CharSequence charSequence, int i, int i2, jp11 jp11Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.b)) {
            return true;
        }
        jp11Var.c = (jp11Var.c & 3) | 4;
        return false;
    }

    @Override // defpackage.man
    public char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // defpackage.mvo
    public b231 d(Map map) {
        switch (this.a) {
            case 23:
                throw new UnknownOperationError(this.b);
            default:
                String str = this.b;
                if (map.containsKey(str)) {
                    return (b231) map.get(str);
                }
                throw new MissingVariableError(str);
        }
    }

    public void e(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            ny61.f(e);
        }
    }

    public ag1 f() {
        if (this.b != null) {
            return new ag1(this);
        }
        ny61.g("Product type must be set");
        return null;
    }

    public String g() {
        return this.b;
    }

    @Override // defpackage.jun
    public Object getResult() {
        return this;
    }

    public String h() {
        return this.b;
    }

    public String i(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        e(sb, it);
        return sb.toString();
    }

    @Override // defpackage.k120
    public Object j() {
        String str = this.b;
        return Boolean.valueOf(str.startsWith("https://passport.yandex.ru/auth/link") || str.startsWith("https://passport-rc.yandex.ru/auth/link"));
    }

    @Override // defpackage.k120
    public /* bridge */ /* synthetic */ Object k() {
        return Boolean.FALSE;
    }

    @Override // defpackage.k120
    public /* bridge */ /* synthetic */ Object l() {
        return Boolean.FALSE;
    }

    @Override // defpackage.man
    public int length() {
        return this.b.length();
    }

    @Override // defpackage.k120
    public /* bridge */ /* synthetic */ Object m() {
        return Boolean.FALSE;
    }

    @Override // defpackage.k120
    public Object o() {
        return Boolean.valueOf(this.b.startsWith("https://passport-test.yandex.ru/auth/link"));
    }

    public void p(String str) {
        this.b = str;
    }

    @Override // defpackage.sm60
    public String q() {
        return b64.p(new StringBuilder("expected '"), this.b, '\'');
    }

    public String r() {
        return this.b;
    }

    @Override // defpackage.k120
    public /* bridge */ /* synthetic */ Object s() {
        return Boolean.FALSE;
    }

    @Override // defpackage.man
    public CharSequence subSequence(int i, int i2) {
        return this.b.subSequence(i, i2);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            case 3:
                return this.b;
            case 16:
                return this.b;
            case 26:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ mf1(int i) {
        this.a = i;
    }

    public /* synthetic */ mf1(bg1 bg1Var) {
        this.a = 20;
        this.b = bg1Var.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mf1(String str, int i, int i2) {
        this((byte) 0, 5, str);
        this.a = i2;
        switch (i2) {
            case 26:
                this.b = str;
                break;
            default:
                break;
        }
    }

    public mf1(Context context) {
        this.a = 14;
        this.b = AppMetrica.getUuid(context);
    }

    public mf1(String str) {
        this.a = 13;
        str.getClass();
        this.b = str;
    }

    public /* synthetic */ mf1(byte b, int i, String str) {
        this.a = i;
        this.b = str;
    }
}
