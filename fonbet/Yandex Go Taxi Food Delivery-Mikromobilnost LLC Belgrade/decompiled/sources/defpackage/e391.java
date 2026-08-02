package defpackage;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import yads.kz1;

/* loaded from: classes7.dex */
public final class e391 implements dpk {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    @Override // defpackage.dpk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Integer valueOf;
        wn61 wn61Var = (wn61) this.a.get(div2View.get_divData());
        if (wn61Var == null) {
            return;
        }
        view.setVisibility(8);
        wn61Var.d.getClass();
        bpk a = rp71.a(egkVar, "view");
        if (a == null) {
            return;
        }
        wn61Var.e.getClass();
        JSONObject jSONObject = a.b;
        if (jSONObject != null) {
            try {
                valueOf = Integer.valueOf(jSONObject.getInt("position"));
            } catch (JSONException unused) {
            }
            if (valueOf == null) {
                ArrayList p = wn61Var.a.p();
                if (valueOf.intValue() < 0 || valueOf.intValue() >= p.size()) {
                    return;
                }
                hk61 hk61Var = (hk61) p.get(valueOf.intValue());
                xg81 k = wn61Var.f.k(view, new dn60(valueOf.intValue(), 17, (byte) 0));
                try {
                    y6k actionHandler = div2View.getActionHandler();
                    in81 in81Var = actionHandler instanceof in81 ? (in81) actionHandler : null;
                    if (in81Var == null) {
                        in81Var = new in81();
                        div2View.setActionHandler(in81Var);
                    }
                    ks81 ks81Var = wn61Var.c;
                    t171 t171Var = (t171) in81Var.a.b.get(valueOf);
                    if (t171Var == null) {
                        t171Var = new t171(ks81Var);
                        in81Var.a.a.put(valueOf, t171Var);
                    }
                    hk61Var.i(k, t171Var);
                    view.setVisibility(0);
                    return;
                } catch (kz1 e) {
                    wn61Var.b.d("Failed to bind DivKit Slider Inner Ad", e);
                    return;
                }
            }
            return;
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.dpk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean matches(egk egkVar) {
        Integer valueOf;
        bpk a = rp71.a(egkVar, "view");
        if (a == null) {
            return false;
        }
        JSONObject jSONObject = a.b;
        String str = null;
        if (jSONObject != null) {
            try {
                valueOf = Integer.valueOf(jSONObject.getInt("position"));
            } catch (JSONException unused) {
            }
            if (jSONObject != null) {
                try {
                    str = jSONObject.getString("view_name");
                } catch (JSONException unused2) {
                }
            }
            return valueOf != null && "native_ad_view".equals(str);
        }
        valueOf = null;
        if (jSONObject != null) {
        }
        if (valueOf != null) {
            return false;
        }
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }
}
