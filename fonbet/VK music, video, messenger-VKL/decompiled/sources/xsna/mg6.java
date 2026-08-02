package xsna;

import android.content.Context;
import android.widget.TextView;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.location.js.bridge.api.events.GetGeodata$Parameters;
import com.vk.superapp.location.js.bridge.api.events.GetGeodata$Response;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: BaseLocationDelegate.kt */
/* loaded from: classes6.dex */
public class mg6 {
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public mg6(com.vk.superapp.base.js.bridge.b bVar, xwv0 xwv0Var) {
        this.b = bVar;
        this.c = xwv0Var;
        this.d = new bpn0(new sv0(3));
        this.e = new bpn0(new defpackage.g(this, 11));
        this.f = new bpn0(new defpackage.h(this, 7));
    }

    public mvp c() {
        return (mvp) ((bpn0) this.f).getValue();
    }

    public xwv0 d() {
        throw null;
    }

    public boolean h() {
        return ((Boolean) ((bpn0) this.d).getValue()).booleanValue();
    }

    public void j(String str) {
        com.vk.superapp.base.js.bridge.b.p(((d2n0) ((bpn0) this.e).getValue()).a, new JsMethod("VKWebAppGetGeodata"), new GetGeodata$Response(null, new GetGeodata$Response.Data(false, null, null, null, null, null, null, null, null, str, 510, null), str, 1, null), null, null, false, null, 52);
    }

    public void k(GetGeodata$Parameters getGeodata$Parameters, Context context) {
        io.reactivex.rxjava3.internal.operators.observable.z h;
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        if (epx.f(getGeodata$Parameters != null ? getGeodata$Parameters.d() : null, Boolean.TRUE)) {
            sex0 sex0Var = e370.l;
            (sex0Var != null ? sex0Var : null).getClass();
            h = oxz.b(context);
        } else {
            sex0 sex0Var2 = e370.l;
            h = (sex0Var2 != null ? sex0Var2 : null).h(context);
        }
        xwv0 d = d();
        if (d == null || (view = d.getView()) == null || (D6 = view.D6()) == null) {
            return;
        }
        D6.b(h.subscribe(new v8(new ri0(2, this, getGeodata$Parameters), 7), new x8(new qd1(2, this, getGeodata$Parameters), 3)));
    }

    public mg6(nao0 nao0Var, TextView textView, String str, int i, izs izsVar, int i2) {
        String str2;
        str = (i2 & 4) != 0 ? "" : str;
        boolean z = (i2 & 8) != 0;
        i = (i2 & 16) != 0 ? 0 : i;
        int l = krv0.l(R.attr.vk_ui_transparent_hover);
        izsVar = (i2 & 64) != 0 ? null : izsVar;
        this.b = nao0Var;
        this.c = izsVar;
        Context applicationContext = textView.getContext().getApplicationContext();
        this.d = applicationContext;
        this.f = msy.a(LazyThreadSafetyMode.NONE, new da50(this, 26));
        oao0 oao0Var = new oao0(i, l, new b8e0(this, 14), z);
        this.e = oao0Var;
        oao0Var.a(textView);
        izs izsVar2 = (izs) this.c;
        oao0Var.d((izsVar2 == null || (str2 = (String) izsVar2.invoke(str)) == null) ? applicationContext.getString(R.string.vk_auth_sign_up_terms_new, str) : str2);
    }
}
