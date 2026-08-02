package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.superapp_carts.analytics.SuperappCartsAnalytics$ScreenState;
import com.yandex.go.superapp_carts.domain.loading.b;
import java.util.HashMap;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class h9w0 extends mao {
    public final q9w0 a;
    public final zuj0 b;
    public final h3y c;
    public final String w;
    public m2y x;

    public h9w0(q9w0 q9w0Var, zuj0 zuj0Var, p9w0 p9w0Var, h3y h3yVar) {
        this.a = q9w0Var;
        this.b = zuj0Var;
        this.c = h3yVar;
        this.w = p9w0Var.a;
    }

    public final m2y a() {
        m2y m2yVar = this.x;
        if (m2yVar != null) {
            return m2yVar;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        View O;
        GoConstraintLayout goConstraintLayout;
        final int i = 0;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(rkh0.superapp_cart_error_placeholder, viewGroup, false);
        int i2 = h8h0.error_info;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
        if (robotoTextView != null) {
            i2 = h8h0.reload_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, inflate);
            if (buttonComponent != null && (O = cma1.O((i2 = h8h0.top_view), inflate)) != null) {
                int i3 = h8h0.back_button;
                ClickableImageView clickableImageView = (ClickableImageView) cma1.O(i3, O);
                if (clickableImageView != null) {
                    i3 = h8h0.screen_title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, O);
                    if (robotoTextView2 != null) {
                        this.x = new m2y((GoConstraintLayout) inflate, robotoTextView, buttonComponent, new ho4((ViewGroup) O, (View) clickableImageView, (Object) robotoTextView2, 17));
                        RobotoTextView robotoTextView3 = (RobotoTextView) ((ho4) a().e).d;
                        int i4 = kyh0.superapp_cart_header_title;
                        avj0 avj0Var = (avj0) this.b;
                        robotoTextView3.setText(avj0Var.h(i4));
                        ((ClickableImageView) ((ho4) a().e).b).setDebounceClickListener(new Runnable(this) { // from class: g9w0
                            public final /* synthetic */ h9w0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i;
                                h9w0 h9w0Var = this.b;
                                switch (i5) {
                                    case 0:
                                        ((s9w0) h9w0Var.c.get()).a(SuperappCartsAnalytics$ScreenState.Error, h9w0Var.w);
                                        h9w0Var.a.a.r(new qu(9));
                                        break;
                                    default:
                                        s9w0 s9w0Var = (s9w0) h9w0Var.c.get();
                                        String str = h9w0Var.w;
                                        s9w0Var.getClass();
                                        HashMap hashMap = new HashMap();
                                        if (str != null) {
                                            hashMap.put("search_session_id", str);
                                        }
                                        s9w0Var.a.a("SuperappCarts.Reload.Tapped", hashMap, 1, new HashMap());
                                        b bVar = h9w0Var.a.a.H;
                                        if (bVar != null) {
                                            bVar.a(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ((RobotoTextView) a().b).setText(avj0Var.h(kyh0.superapp_cart_loading_error));
                        ((ButtonComponent) a().d).setText(avj0Var.h(kyh0.superapp_cart_reload_button_title));
                        final int i5 = 1;
                        ((ButtonComponent) a().d).setDebounceClickListener(new Runnable(this) { // from class: g9w0
                            public final /* synthetic */ h9w0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i5;
                                h9w0 h9w0Var = this.b;
                                switch (i52) {
                                    case 0:
                                        ((s9w0) h9w0Var.c.get()).a(SuperappCartsAnalytics$ScreenState.Error, h9w0Var.w);
                                        h9w0Var.a.a.r(new qu(9));
                                        break;
                                    default:
                                        s9w0 s9w0Var = (s9w0) h9w0Var.c.get();
                                        String str = h9w0Var.w;
                                        s9w0Var.getClass();
                                        HashMap hashMap = new HashMap();
                                        if (str != null) {
                                            hashMap.put("search_session_id", str);
                                        }
                                        s9w0Var.a.a("SuperappCarts.Reload.Tapped", hashMap, 1, new HashMap());
                                        b bVar = h9w0Var.a.a.H;
                                        if (bVar != null) {
                                            bVar.a(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        tje.k(112, (GoConstraintLayout) a().c);
                        m2y m2yVar = this.x;
                        if (m2yVar != null && (goConstraintLayout = (GoConstraintLayout) m2yVar.c) != null) {
                            OneShotPreDrawListener.add(goConstraintLayout, new ci(goConstraintLayout, 6));
                        }
                        return (GoConstraintLayout) a().c;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i3)));
                return null;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        this.x = null;
    }

    @Override // defpackage.mao
    public final void onDocumentError(azl azlVar) {
        CharSequence text;
        GoConstraintLayout goConstraintLayout;
        m2y m2yVar = this.x;
        if (m2yVar != null && (goConstraintLayout = (GoConstraintLayout) m2yVar.c) != null) {
            OneShotPreDrawListener.add(goConstraintLayout, new ci(goConstraintLayout, 6));
        }
        s9w0 s9w0Var = (s9w0) this.c.get();
        m2y m2yVar2 = this.x;
        String obj = (m2yVar2 == null || (text = ((RobotoTextView) m2yVar2.b).getText()) == null) ? null : text.toString();
        if (obj == null) {
            obj = "";
        }
        s9w0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("error_text", obj);
        String str = this.w;
        if (str != null) {
            hashMap.put("search_session_id", str);
        }
        s9w0Var.a.a("SuperappCarts.LoadingError.Shown", hashMap, 1, new HashMap());
    }

    @Override // defpackage.ws11
    public final /* bridge */ /* synthetic */ void onUpdateState(Object obj) {
    }
}
