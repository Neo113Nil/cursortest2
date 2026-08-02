package defpackage;

import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParserException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public abstract class prb1 {
    public static t550 a(TypedValue typedValue, t550 t550Var, t550 t550Var2, String str, String str2) {
        if (t550Var == null || t550Var == t550Var2) {
            return t550Var == null ? t550Var2 : t550Var;
        }
        StringBuilder v = b64.v("Type is ", str, " but found ", str2, Extension.COLON_SPACE);
        v.append(typedValue.data);
        throw new XmlPullParserException(v.toString());
    }

    public static final kdc b(e501 e501Var, wn70 wn70Var) {
        if (jl40.l(wn70Var, tn70.a)) {
            return e501Var.a;
        }
        if (wn70Var instanceof vn70) {
            return e501Var.b;
        }
        if (wn70Var instanceof rn70) {
            return e501Var.c;
        }
        if (wn70Var instanceof sn70) {
            return e501Var.d;
        }
        w511.b();
        return null;
    }
}
