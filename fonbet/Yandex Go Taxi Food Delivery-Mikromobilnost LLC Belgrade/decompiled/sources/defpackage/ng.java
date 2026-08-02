package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.view.b;
import kotlin.a;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes14.dex */
public final class ng {
    public final SlideableModalView a;
    public final View b;
    public final lg c;
    public final i3y d;
    public final i3y e;

    public ng(SlideableModalView slideableModalView, View view, lg lgVar) {
        this.a = slideableModalView;
        this.b = view;
        this.c = lgVar;
        final int i = 0;
        this.d = a.a(new sls(this) { // from class: kg
            public final /* synthetic */ ng b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                ng ngVar = this.b;
                switch (i2) {
                    case 0:
                        Button button = new Button(ngVar.a.getContext());
                        button.setBackgroundColor(0);
                        button.setImportantForAccessibility(1);
                        lg lgVar2 = ngVar.c;
                        Integer num = (Integer) lgVar2.d;
                        button.setContentDescription(button.getContext().getString(num != null ? num.intValue() : kyh0.common_back));
                        c.z((sls) lgVar2.b, button);
                        int r = tje.r(mrg0.button_component_size_M, button.getContext());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(r, r, 8388659);
                        layoutParams.setMargins(0, -lgVar2.a, 0, 0);
                        button.setLayoutParams(layoutParams);
                        return button;
                    default:
                        Button button2 = new Button(ngVar.a.getContext());
                        button2.setBackgroundColor(0);
                        button2.setImportantForAccessibility(1);
                        lg lgVar3 = ngVar.c;
                        button2.setContentDescription(button2.getContext().getString(kyh0.shortcuts_show_more_button_description));
                        c.z((sls) lgVar3.c, button2);
                        button2.setLayoutParams(new FrameLayout.LayoutParams(-1, tje.r(mrg0.go_design_m_space, button2.getContext()), 80));
                        b.p(button2, new mg(0, ngVar));
                        tje.i(button2, 119, new y4(8, button2));
                        return button2;
                }
            }
        });
        final int i2 = 1;
        this.e = a.a(new sls(this) { // from class: kg
            public final /* synthetic */ ng b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                ng ngVar = this.b;
                switch (i22) {
                    case 0:
                        Button button = new Button(ngVar.a.getContext());
                        button.setBackgroundColor(0);
                        button.setImportantForAccessibility(1);
                        lg lgVar2 = ngVar.c;
                        Integer num = (Integer) lgVar2.d;
                        button.setContentDescription(button.getContext().getString(num != null ? num.intValue() : kyh0.common_back));
                        c.z((sls) lgVar2.b, button);
                        int r = tje.r(mrg0.button_component_size_M, button.getContext());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(r, r, 8388659);
                        layoutParams.setMargins(0, -lgVar2.a, 0, 0);
                        button.setLayoutParams(layoutParams);
                        return button;
                    default:
                        Button button2 = new Button(ngVar.a.getContext());
                        button2.setBackgroundColor(0);
                        button2.setImportantForAccessibility(1);
                        lg lgVar3 = ngVar.c;
                        button2.setContentDescription(button2.getContext().getString(kyh0.shortcuts_show_more_button_description));
                        c.z((sls) lgVar3.c, button2);
                        button2.setLayoutParams(new FrameLayout.LayoutParams(-1, tje.r(mrg0.go_design_m_space, button2.getContext()), 80));
                        b.p(button2, new mg(0, ngVar));
                        tje.i(button2, 119, new y4(8, button2));
                        return button2;
                }
            }
        });
    }

    public final void a() {
        ((View) this.d.getValue()).setVisibility(8);
    }

    public final void b() {
        ((View) this.e.getValue()).setVisibility(8);
    }

    public final void c(boolean z) {
        SlideableModalView slideableModalView = this.a;
        if (tje.L(slideableModalView.getContext()) && !slideableModalView.isCollapsed()) {
            i3y i3yVar = this.d;
            if (((View) i3yVar.getValue()).getParent() == null) {
                slideableModalView.addView((View) i3yVar.getValue(), 0);
            }
            ((View) i3yVar.getValue()).setVisibility(0);
            if (z) {
                slideableModalView.postDelayed(new jg(0, this), 300L);
            }
        }
    }

    public final void d() {
        SlideableModalView slideableModalView = this.a;
        if (tje.L(slideableModalView.getContext()) && !slideableModalView.isExpanded()) {
            i3y i3yVar = this.e;
            if (((View) i3yVar.getValue()).getParent() == null) {
                slideableModalView.addView((View) i3yVar.getValue());
            }
            ((View) i3yVar.getValue()).setVisibility(0);
            ((View) i3yVar.getValue()).requestApplyInsets();
        }
    }
}
