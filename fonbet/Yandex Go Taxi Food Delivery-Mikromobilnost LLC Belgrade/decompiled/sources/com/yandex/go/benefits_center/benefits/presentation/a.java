package com.yandex.go.benefits_center.benefits.presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.b;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.azl;
import defpackage.cma1;
import defpackage.do5;
import defpackage.ghh0;
import defpackage.hn5;
import defpackage.ho4;
import defpackage.js4;
import defpackage.mao;
import defpackage.ny61;
import defpackage.rrh0;
import defpackage.tje;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes12.dex */
public final class a extends mao {
    public final hn5 a;
    public final String b;
    public ho4 c;

    public a(hn5 hn5Var, String str) {
        this.a = hn5Var;
        this.b = str;
    }

    public final ho4 a() {
        ho4 ho4Var = this.c;
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
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(rrh0.benefits_center_error_placeholder, viewGroup, false);
        int i = ghh0.icon;
        if (((GoImageView) cma1.O(i, inflate)) != null) {
            i = ghh0.reload_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = ghh0.subtitle;
                if (((AppCompatTextView) cma1.O(i, inflate)) != null) {
                    i = ghh0.title;
                    if (((AppCompatTextView) cma1.O(i, inflate)) != null && (O = cma1.O((i = ghh0.top_view), inflate)) != null) {
                        this.c = new ho4((GoConstraintLayout) inflate, buttonComponent, do5.o(O), 1);
                        ((ButtonComponent) a().b).setDebounceClickListener(new js4(11, this.a));
                        c.z(new BenefitsCenterErrorViewController$onCreateView$2(0, this.a, hn5.class, "exit", "exit()V", 0), ((do5) a().d).c);
                        String str = this.b;
                        if (str != null) {
                            ((do5) a().d).d.setText(str);
                        }
                        tje.k(112, (GoConstraintLayout) a().c);
                        ho4 ho4Var = this.c;
                        if (ho4Var != null && (goConstraintLayout = (GoConstraintLayout) ho4Var.c) != null) {
                            WeakHashMap weakHashMap = b.a;
                            if (goConstraintLayout.isAttachedToWindow()) {
                                goConstraintLayout.requestApplyInsets();
                            } else {
                                goConstraintLayout.addOnAttachStateChangeListener(new BenefitsCenterErrorViewController$applyInsets$$inlined$doOnAttach$1(goConstraintLayout));
                            }
                        }
                        return (GoConstraintLayout) a().c;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        this.c = null;
    }

    @Override // defpackage.mao
    public final void onDocumentError(azl azlVar) {
        GoConstraintLayout goConstraintLayout;
        ho4 ho4Var = this.c;
        if (ho4Var == null || (goConstraintLayout = (GoConstraintLayout) ho4Var.c) == null) {
            return;
        }
        WeakHashMap weakHashMap = b.a;
        if (goConstraintLayout.isAttachedToWindow()) {
            goConstraintLayout.requestApplyInsets();
        } else {
            goConstraintLayout.addOnAttachStateChangeListener(new BenefitsCenterErrorViewController$applyInsets$$inlined$doOnAttach$1(goConstraintLayout));
        }
    }

    @Override // defpackage.ws11
    public final /* bridge */ /* synthetic */ void onUpdateState(Object obj) {
    }
}
