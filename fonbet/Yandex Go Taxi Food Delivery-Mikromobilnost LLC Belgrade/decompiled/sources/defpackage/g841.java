package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes10.dex */
public final class g841 extends mao {
    public final mj31 a;
    public final cst b;
    public final boolean c;
    public ho4 w;

    public g841(mj31 mj31Var, cst cstVar, boolean z) {
        this.a = mj31Var;
        this.b = cstVar;
        this.c = z;
    }

    public final ho4 a() {
        ho4 ho4Var = this.w;
        if (ho4Var != null) {
            return ho4Var;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        View O;
        GoConstraintLayout goConstraintLayout;
        final int i = 0;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(mlh0.wallet_error_placeholder, viewGroup, false);
        int i2 = c9h0.description;
        if (((RobotoTextView) cma1.O(i2, inflate)) != null) {
            i2 = c9h0.icon;
            if (((GoImageView) cma1.O(i2, inflate)) != null) {
                i2 = c9h0.reload_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, inflate);
                if (buttonComponent != null) {
                    i2 = c9h0.title;
                    if (((RobotoTextView) cma1.O(i2, inflate)) != null && (O = cma1.O((i2 = c9h0.top_view), inflate)) != null) {
                        int i3 = c9h0.back_button;
                        ClickableImageView clickableImageView = (ClickableImageView) cma1.O(i3, O);
                        if (clickableImageView == null) {
                            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i3)));
                            return null;
                        }
                        final int i4 = 1;
                        this.w = new ho4((GoConstraintLayout) inflate, buttonComponent, new zuq0((GoFrameLayout) O, clickableImageView, 1), 22);
                        ((GoConstraintLayout) a().c).setClickable(true);
                        ButtonComponent buttonComponent2 = (ButtonComponent) a().b;
                        final mj31 mj31Var = this.a;
                        buttonComponent2.setDebounceClickListener(new Runnable() { // from class: f841
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i;
                                mj31 mj31Var2 = mj31Var;
                                switch (i5) {
                                    case 0:
                                        ((n0) mj31Var2.c).g(zy11.a);
                                        break;
                                    default:
                                        ((sls) mj31Var2.b).invoke();
                                        break;
                                }
                            }
                        });
                        ((zuq0) a().d).c.setImageResource(this.c ? dzg0.chevron_up : dzg0.ic_arrow_left);
                        ((zuq0) a().d).c.setDebounceClickListener(new Runnable() { // from class: f841
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i4;
                                mj31 mj31Var2 = mj31Var;
                                switch (i5) {
                                    case 0:
                                        ((n0) mj31Var2.c).g(zy11.a);
                                        break;
                                    default:
                                        ((sls) mj31Var2.b).invoke();
                                        break;
                                }
                            }
                        });
                        tje.k(112, (GoConstraintLayout) a().c);
                        ho4 ho4Var = this.w;
                        if (ho4Var != null && (goConstraintLayout = (GoConstraintLayout) ho4Var.c) != null) {
                            OneShotPreDrawListener.add(goConstraintLayout, new ci(goConstraintLayout, 8));
                        }
                        return (GoConstraintLayout) a().c;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        this.w = null;
    }

    @Override // defpackage.mao
    public final void onDocumentError(azl azlVar) {
        GoConstraintLayout goConstraintLayout;
        String azlVar2 = azlVar.toString();
        cst cstVar = this.b;
        cstVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.KEY_MESSAGE, azlVar2);
        cstVar.a.a("GoWallet.LoadingFailed", hashMap, 1, new HashMap());
        ho4 ho4Var = this.w;
        if (ho4Var == null || (goConstraintLayout = (GoConstraintLayout) ho4Var.c) == null) {
            return;
        }
        OneShotPreDrawListener.add(goConstraintLayout, new ci(goConstraintLayout, 8));
    }

    @Override // defpackage.ws11
    public final /* bridge */ /* synthetic */ void onUpdateState(Object obj) {
    }
}
