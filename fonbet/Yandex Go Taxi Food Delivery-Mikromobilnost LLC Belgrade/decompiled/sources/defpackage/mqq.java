package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class mqq extends mao implements nwy0 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public Object c;

    public mqq(h3y h3yVar, h3y h3yVar2) {
        this.b = h3yVar;
        this.c = h3yVar2;
    }

    private final void a(View view) {
    }

    private final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    private final /* bridge */ /* synthetic */ void c(Object obj) {
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        int i = 1;
        switch (this.a) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(ykh0.feed_sdk_error_view, viewGroup, false);
                int i2 = o8h0.error_root;
                if (((LinearLayout) cma1.O(i2, inflate)) != null) {
                    i2 = o8h0.retry_button;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, inflate);
                    if (buttonComponent != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                        buttonComponent.setDebounceClickListener(new ejp(i, this));
                        c.C(m810.b(ofp0.c * 0.9f), nestedScrollView);
                        break;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                break;
            default:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(duh0.morphlex_default_error, viewGroup, false);
                int i3 = ejh0.button_layout;
                if (((BottomEdgeButtonLayout) cma1.O(i3, inflate2)) != null) {
                    i3 = ejh0.close_button;
                    ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i3, inflate2);
                    if (buttonComponent2 != null) {
                        i3 = ejh0.icon;
                        if (((AppCompatImageView) cma1.O(i3, inflate2)) != null) {
                            i3 = ejh0.reload;
                            ButtonComponent buttonComponent3 = (ButtonComponent) cma1.O(i3, inflate2);
                            if (buttonComponent3 != null) {
                                i3 = ejh0.subtitle;
                                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, inflate2);
                                if (robotoTextView != null) {
                                    i3 = ejh0.title;
                                    if (((RobotoTextView) cma1.O(i3, inflate2)) != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate2;
                                        this.c = new ho4(constraintLayout, buttonComponent2, buttonComponent3, robotoTextView);
                                        buttonComponent2.setVisibility(0);
                                        buttonComponent2.setDebounceClickListener(new o730(this, i));
                                        buttonComponent3.setDebounceClickListener(new o730(this, 2));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
                break;
        }
        return null;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.c = null;
                break;
        }
    }

    @Override // defpackage.mao
    public final void onDocumentError(azl azlVar) {
        switch (this.a) {
            case 0:
                r0 r0Var = ((hqq) ((h3y) this.c).get()).a;
                Boolean bool = Boolean.TRUE;
                r0Var.getClass();
                r0Var.m(null, bool);
                break;
            default:
                ho4 ho4Var = (ho4) this.c;
                if (ho4Var != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) ho4Var.c;
                    ButtonComponent buttonComponent = (ButtonComponent) ho4Var.b;
                    buttonComponent.setText(constraintLayout.getContext().getString(kyh0.marketplace_reload));
                    buttonComponent.setDebounceClickListener(new o730(this, 0));
                    ((RobotoTextView) ho4Var.d).setText(constraintLayout.getContext().getString(kyh0.marketplace_reload_later));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ws11
    public final /* bridge */ /* synthetic */ void onUpdateState(Object obj) {
        int i = this.a;
    }

    public mqq(at20 at20Var) {
        this.b = at20Var;
    }
}
