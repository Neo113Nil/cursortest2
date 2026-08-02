package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import kotlin.a;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class ck5 extends lys implements t7u {
    public static final /* synthetic */ int a0 = 0;
    public final int S;
    public final i3y T;
    public final i3y U;
    public eiy V;
    public eiy W;
    public epu Z;

    public ck5(ListItemComponent listItemComponent) {
        super(listItemComponent);
        int r = tje.r(mrg0.list_item_component_size_XS, ((ListItemComponent) ((View) this.R)).getContext());
        this.S = r;
        final int i = 0;
        this.T = a.a(new sls(this) { // from class: bk5
            public final /* synthetic */ ck5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                ck5 ck5Var = this.b;
                switch (i2) {
                    case 0:
                        GoImageView goImageView = new GoImageView(((ListItemComponent) ((View) ck5Var.R)).getContext(), null, 0, 6, null);
                        goImageView.setScaleType(ImageView.ScaleType.CENTER);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tje.u(56, goImageView.getContext()), ck5Var.S);
                        layoutParams.gravity = 17;
                        goImageView.setLayoutParams(layoutParams);
                        return goImageView;
                    default:
                        GoFrameLayout goFrameLayout = new GoFrameLayout(((ListItemComponent) ((View) ck5Var.R)).getContext(), null, 0, 0, 14, null);
                        goFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(tje.u(56, goFrameLayout.getContext()), ck5Var.S));
                        goFrameLayout.addView((GoImageView) ck5Var.T.getValue());
                        return goFrameLayout;
                }
            }
        });
        final int i2 = 1;
        this.U = a.a(new sls(this) { // from class: bk5
            public final /* synthetic */ ck5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                ck5 ck5Var = this.b;
                switch (i22) {
                    case 0:
                        GoImageView goImageView = new GoImageView(((ListItemComponent) ((View) ck5Var.R)).getContext(), null, 0, 6, null);
                        goImageView.setScaleType(ImageView.ScaleType.CENTER);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tje.u(56, goImageView.getContext()), ck5Var.S);
                        layoutParams.gravity = 17;
                        goImageView.setLayoutParams(layoutParams);
                        return goImageView;
                    default:
                        GoFrameLayout goFrameLayout = new GoFrameLayout(((ListItemComponent) ((View) ck5Var.R)).getContext(), null, 0, 0, 14, null);
                        goFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(tje.u(56, goFrameLayout.getContext()), ck5Var.S));
                        goFrameLayout.addView((GoImageView) ck5Var.T.getValue());
                        return goFrameLayout;
                }
            }
        });
        aiy aiyVar = aiy.a;
        this.V = aiyVar;
        this.W = aiyVar;
        this.Z = new dpu(((ListItemComponent) ((View) this.R)).getLeadImageView(), null);
        ((ListItemComponent) ((View) this.R)).setMinHeight(r);
        ((ListItemComponent) ((View) this.R)).setClickable(false);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        zj5 zj5Var = (zj5) obj;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) this.R);
        this.V = lob1.g(zj5Var.d);
        this.W = lob1.g(zj5Var.h);
        i3y i3yVar = this.U;
        ((GoFrameLayout) i3yVar.getValue()).removeAllViews();
        obm obmVar = zj5Var.a;
        if (obmVar == null) {
            this.Z = new dpu((GoFrameLayout) i3yVar.getValue(), null);
        } else {
            GoFrameLayout goFrameLayout = (GoFrameLayout) i3yVar.getValue();
            i3y i3yVar2 = this.T;
            goFrameLayout.addView((GoImageView) i3yVar2.getValue());
            this.Z = new cpu((GoImageView) i3yVar2.getValue(), (GoFrameLayout) i3yVar.getValue());
            ((GoImageView) i3yVar2.getValue()).setImageDrawable(obmVar.b);
            listItemComponent.setLeadView((GoFrameLayout) i3yVar.getValue());
        }
        listItemComponent.setTitle(zj5Var.b);
        listItemComponent.setTrailCompanionText(zj5Var.c);
        listItemComponent.setContentDescription(zj5Var.e);
    }

    @Override // defpackage.t7u
    public final eiy g() {
        return this.V;
    }

    @Override // defpackage.t7u
    public final eiy k() {
        return this.W;
    }

    @Override // defpackage.t7u
    public final epu x() {
        return this.Z;
    }
}
