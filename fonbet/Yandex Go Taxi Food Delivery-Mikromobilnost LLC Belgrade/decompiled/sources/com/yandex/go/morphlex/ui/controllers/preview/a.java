package com.yandex.go.morphlex.ui.controllers.preview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.ci;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.duh0;
import defpackage.ejh0;
import defpackage.hbp0;
import defpackage.ho4;
import defpackage.ny61;
import defpackage.pjm0;
import defpackage.plr;
import defpackage.tje;
import defpackage.wgr;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RoundedCornersImageView;

/* loaded from: classes12.dex */
public final class a extends pjm0 {
    public final wgr a;
    public final plr b;
    public ho4 c;
    public final hbp0 w = new hbp0(new czo0(14), a.class.getSimpleName(), null);

    public a(wgr wgrVar, plr plrVar) {
        this.a = wgrVar;
        this.b = plrVar;
    }

    @Override // defpackage.pjm0
    public final ViewGroup a(View view) {
        return (GoFrameLayout) b().d;
    }

    public final ho4 b() {
        ho4 ho4Var = this.c;
        if (ho4Var != null) {
            return ho4Var;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        this.w.a();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(duh0.morphlex_preview_scaffold, viewGroup, false);
        int i = ejh0.close_button;
        RoundedCornersImageView roundedCornersImageView = (RoundedCornersImageView) cma1.O(i, inflate);
        if (roundedCornersImageView != null) {
            i = ejh0.loading_feed_sdk_root;
            GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
            if (goFrameLayout != null) {
                this.c = new ho4((GoFrameLayout) inflate, roundedCornersImageView, goFrameLayout, 9);
                if (this.b.a) {
                    tje.k(48, (GoFrameLayout) b().c);
                    GoFrameLayout goFrameLayout2 = (GoFrameLayout) b().c;
                    OneShotPreDrawListener.add(goFrameLayout2, new ci(goFrameLayout2, 2));
                }
                c.z(new MorphlexPreviewScaffoldController$onCreateView$1$1(0, this, a.class, "onClose", "onClose()V", 0), (RoundedCornersImageView) b().b);
                return (GoFrameLayout) b().c;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        this.w.b();
        this.c = null;
    }

    @Override // defpackage.ws11
    public final /* bridge */ /* synthetic */ void onUpdateState(Object obj) {
    }
}
