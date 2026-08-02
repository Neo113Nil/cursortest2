package defpackage;

import android.content.Context;
import android.util.Base64;
import java.util.Map;
import kotlin.collections.b;
import org.json.JSONException;
import yads.d02;
import yads.h01;

/* loaded from: classes7.dex */
public final class gh61 implements pv81 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public gh61(Context context, ge71 ge71Var) {
        this.b = new cf71(context, ge71Var);
    }

    @Override // defpackage.pv81
    public final Object a(gb81 gb81Var) {
        String str;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (kc71) ((pl61) obj).a(gb81Var);
            default:
                cf71 cf71Var = (cf71) obj;
                t281 t281Var = (t281) cf71Var.b;
                t281Var.a.getClass();
                byte[] bArr = gb81Var.b;
                Map map = gb81Var.c;
                Map f = map == null ? b.f() : map;
                t281Var.b.getClass();
                if (bArr != null) {
                    String b = ob71.b(f, h01.T);
                    if (b == null ? true : Boolean.parseBoolean(b)) {
                        try {
                            str = new String(Base64.decode(bArr, 0), uza.a);
                        } catch (Exception unused) {
                            str = new String(bArr, uza.a);
                        }
                    } else {
                        str = new String(bArr, uza.a);
                    }
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    return null;
                }
                if (map == null) {
                    map = b.f();
                }
                try {
                    return ((eo61) cf71Var.c).a(str, new zy2(map));
                } catch (JSONException e) {
                    ljo.b(e);
                    return null;
                } catch (d02 e2) {
                    ljo.b(e2);
                    return null;
                }
        }
    }

    public gh61(pl61 pl61Var) {
        this.b = pl61Var;
    }
}
