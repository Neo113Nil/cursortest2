package yads;

import android.view.View;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ikn;
import xsna.zkn;

/* loaded from: classes10.dex */
public final class b23 implements DivExtensionHandler {
    public final jp2 a;
    public final lh0 b;
    public final kq0 c;
    public final lq0 d;
    public final ConcurrentHashMap e;

    public /* synthetic */ b23(jp2 jp2Var) {
        this(jp2Var, new lh0(), new kq0(), new lq0());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // com.yandex.div.core.extension.DivExtensionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ikn iknVar) {
        Integer valueOf;
        d23 d23Var = (d23) this.e.get(div2View.getDivData());
        if (d23Var == null) {
            return;
        }
        view.setVisibility(8);
        d23Var.d.getClass();
        zkn a = lh0.a(iknVar, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (a == null) {
            return;
        }
        d23Var.e.getClass();
        JSONObject jSONObject = a.b;
        if (jSONObject != null) {
            try {
                valueOf = Integer.valueOf(jSONObject.getInt(X3.i.L));
            } catch (JSONException unused) {
            }
            if (valueOf == null) {
                ArrayList i = d23Var.a.i();
                if (valueOf.intValue() < 0 || valueOf.intValue() >= i.size()) {
                    return;
                }
                x12 x12Var = (x12) i.get(valueOf.intValue());
                s22 a2 = d23Var.f.a(view, new la2(valueOf.intValue()));
                try {
                    rz2 a3 = xg0.a(div2View);
                    yf0 yf0Var = d23Var.c;
                    pu puVar = (pu) a3.a.b.get(valueOf);
                    if (puVar == null) {
                        puVar = new pu(yf0Var);
                        a3.a.a.put(valueOf, puVar);
                    }
                    x12Var.a(a2, puVar);
                    view.setVisibility(0);
                    return;
                } catch (k12 e) {
                    d23Var.b.reportError("Failed to bind DivKit Slider Inner Ad", e);
                    return;
                }
            }
            return;
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.yandex.div.core.extension.DivExtensionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean matches(ikn iknVar) {
        Integer valueOf;
        this.b.getClass();
        zkn a = lh0.a(iknVar, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (a == null) {
            return false;
        }
        JSONObject jSONObject = a.b;
        this.c.getClass();
        String str = null;
        if (jSONObject != null) {
            try {
                valueOf = Integer.valueOf(jSONObject.getInt(X3.i.L));
            } catch (JSONException unused) {
            }
            this.d.getClass();
            if (jSONObject != null) {
                try {
                    str = jSONObject.getString("view_name");
                } catch (JSONException unused2) {
                }
            }
            return valueOf != null && "native_ad_view".equals(str);
        }
        valueOf = null;
        this.d.getClass();
        if (jSONObject != null) {
        }
        if (valueOf != null) {
            return false;
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ikn iknVar) {
    }

    public b23(jp2 jp2Var, lh0 lh0Var, kq0 kq0Var, lq0 lq0Var) {
        this.a = jp2Var;
        this.b = lh0Var;
        this.c = kq0Var;
        this.d = lq0Var;
        this.e = new ConcurrentHashMap();
    }
}
