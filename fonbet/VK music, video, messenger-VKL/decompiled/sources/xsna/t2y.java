package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.ui.image.VKImageController;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import xsna.bex0;
import xsna.dw20;
import xsna.e3m;
import xsna.ifu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class t2y implements izs {
    public final /* synthetic */ w2y b;
    public final /* synthetic */ co0 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ t2y(w2y w2yVar, co0 co0Var, boolean z) {
        this.b = w2yVar;
        this.c = co0Var;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WebApiApplication v;
        WebApiApplication v2;
        WebImageSize a;
        gvv0 view;
        Long y;
        boolean z;
        FragmentManager supportFragmentManager;
        gvv0 view2;
        w2y w2yVar = this.b;
        x6y x6yVar = w2yVar.a;
        if (((Boolean) obj).booleanValue()) {
            fvv0 fvv0Var = w2yVar.b;
            co0 co0Var = this.c;
            ifu0 ifu0Var = null;
            if (fvv0Var == null || (y = fvv0Var.y()) == null) {
                int i = w2y.d;
                fvv0 fvv0Var2 = w2yVar.b;
                Activity B0 = (fvv0Var2 == null || (view = fvv0Var2.getView()) == null) ? null : view.B0();
                fvv0 fvv0Var3 = w2yVar.b;
                String str = (fvv0Var3 == null || (v2 = fvv0Var3.v()) == null || (a = v2.d.a(i)) == null) ? null : a.b;
                fvv0 fvv0Var4 = w2yVar.b;
                String str2 = (fvv0Var4 == null || (v = fvv0Var4.v()) == null) ? null : v.c;
                if (B0 != null && str != null && str2 != null) {
                    fvv0 fvv0Var5 = w2yVar.b;
                    int i2 = (fvv0Var5 == null || !fvv0Var5.h()) ? R.string.vk_apps_add_app_to_chat_full_dialog_title : R.string.vk_apps_add_game_to_chat_full_dialog_title;
                    fvv0 fvv0Var6 = w2yVar.b;
                    int i3 = (fvv0Var6 == null || !fvv0Var6.h()) ? R.string.vk_apps_add_app_to_chat_full_dialog_subtitle : R.string.vk_apps_add_game_to_chat_full_dialog_subtitle;
                    ifx0 ifx0Var = e370.c;
                    if (ifx0Var == null) {
                        ifx0Var = null;
                    }
                    VKImageController<View> create = ifx0Var.b().create(B0);
                    ((com.vk.core.ui.image.c) create).getView().setImportantForAccessibility(2);
                    ((dw20.b) dw20.a.g0(new dw20.b(B0, null), new klw(create, str), false, 6)).Q0(i, i).w0(B0.getString(i2, str2)).r0(i3).h0(R.string.vk_apps_add_app_to_chat_full_dialog_button, new nef(co0Var, 16)).X(new sim(w2yVar, 13)).I0(null);
                }
            } else {
                long longValue = y.longValue();
                fvv0 fvv0Var7 = w2yVar.b;
                Long valueOf = fvv0Var7 != null ? Long.valueOf(fvv0Var7.getAppId()) : null;
                fvv0 fvv0Var8 = w2yVar.b;
                Activity B02 = (fvv0Var8 == null || (view2 = fvv0Var8.getView()) == null) ? null : view2.B0();
                if (valueOf != null && B02 != null) {
                    long longValue2 = valueOf.longValue();
                    fvv0 fvv0Var9 = w2yVar.b;
                    int i4 = (fvv0Var9 == null || !fvv0Var9.h()) ? R.drawable.vk_icon_services_outline_56 : R.drawable.vk_icon_game_outline_56;
                    fvv0 fvv0Var10 = w2yVar.b;
                    int i5 = (fvv0Var10 == null || !fvv0Var10.h()) ? R.string.vk_apps_add_app_to_chat_dialog_title : R.string.vk_apps_add_game_to_chat_dialog_title;
                    Context context = B02;
                    while (true) {
                        z = context instanceof FragmentActivity;
                        if (z || !(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    FragmentActivity fragmentActivity = (FragmentActivity) (z ? (Activity) context : null);
                    if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
                        ifu0 ifu0Var2 = new ifu0();
                        String string = B02.getString(i5);
                        e3m.a aVar = e3m.a;
                        ifu0Var2.f1 = new ifu0.a(string, new baf0(m33.a(i4, B02), e3m.f(R.attr.vk_ui_text_accent, B02)), B02.getString(R.string.vk_apps_add_app_to_chat_dialog_positive_button), B02.getString(R.string.vk_apps_add_app_to_chat_dialog_negative_button), new v2y(w2yVar, B02, longValue, longValue2, co0Var, this.d, ifu0Var2));
                        ifu0Var2.Td(supportFragmentManager, null);
                        ifu0Var = ifu0Var2;
                    }
                }
                if (ifu0Var == null) {
                    bex0.a.a(x6yVar, JsApiMethodType.ADD_MINI_APP_SNIPPET_TO_CHAT, VkAppsErrors.Client.UNKNOWN_ERROR, null, null, null, 60);
                    s3q0 s3q0Var = s3q0.a;
                }
            }
        } else {
            bex0.a.a(x6yVar, JsApiMethodType.ADD_MINI_APP_SNIPPET_TO_CHAT, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
        }
        return s3q0.a;
    }
}
