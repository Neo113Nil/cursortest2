package defpackage;

import android.graphics.Color;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.s;
import defpackage.cel0;
import defpackage.rcl0;
import defpackage.zy11;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes12.dex */
public final class cel0 extends wys {
    public static final /* synthetic */ int Z = 0;
    public final ListItemComponent R;
    public final tls S;
    public final wls T;
    public final sgu0 U;
    public s V;
    public rcl0 W;

    public cel0(ListItemComponent listItemComponent, tls tlsVar, wls wlsVar, sgu0 sgu0Var) {
        super(listItemComponent);
        this.R = listItemComponent;
        this.S = tlsVar;
        this.T = wlsVar;
        this.U = sgu0Var;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        qcl0 qcl0Var = (qcl0) obj;
        final ne50 ne50Var = qcl0Var.a;
        boolean z = qcl0Var.b;
        final int F = F() - 1;
        String K = q5z.K(ne50Var.c);
        ListItemComponent listItemComponent = this.R;
        listItemComponent.setTitle(K);
        View trailViewAs = listItemComponent.getTrailViewAs(View.class);
        AppCompatImageView appCompatImageView = trailViewAs != null ? (AppCompatImageView) trailViewAs.findViewById(z5h0.stop_delete) : null;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(!z ? 0 : 8);
            c.z(new sls() { // from class: com.yandex.go.navigator.route_stops.b
                @Override // defpackage.sls
                public final Object invoke() {
                    cel0 cel0Var = cel0.this;
                    rcl0 rcl0Var = cel0Var.W;
                    if (rcl0Var != null && rcl0Var.d == 0) {
                        ((RouteStopsListAdapter$1) cel0Var.S).invoke(Integer.valueOf(F));
                    }
                    return zy11.a;
                }
            }, appCompatImageView);
        }
        View trailViewAs2 = listItemComponent.getTrailViewAs(View.class);
        AppCompatImageView appCompatImageView2 = trailViewAs2 != null ? (AppCompatImageView) trailViewAs2.findViewById(z5h0.stop_reorder) : null;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(z ? 8 : 0);
            appCompatImageView2.setOnTouchListener(new t8(17, this));
        }
        listItemComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.navigator.route_stops.c
            @Override // java.lang.Runnable
            public final void run() {
                cel0 cel0Var = cel0.this;
                rcl0 rcl0Var = cel0Var.W;
                if (rcl0Var == null || rcl0Var.d != 0) {
                    return;
                }
                ((RouteStopsListAdapter$2) cel0Var.T).invoke(Integer.valueOf(F), ne50Var);
            }
        });
    }

    public final void c0(int i, boolean z) {
        sgu0 sgu0Var = this.U;
        ListItemComponent listItemComponent = this.R;
        if (i == -1) {
            listItemComponent.setLeadImage(((ugu0) sgu0Var).a(-1));
            listItemComponent.setDividers(DividerPosition.NONE, DividerType.ICON);
        } else {
            listItemComponent.setLeadImage(((ugu0) sgu0Var).a(i));
            listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON);
        }
        if (z) {
            int c = c.c(xng0.bgMain, listItemComponent);
            listItemComponent.setBackgroundColor(Color.argb((int) (Color.alpha(c) * 0.5f), Color.red(c), Color.green(c), Color.blue(c)));
        } else {
            listItemComponent.setBackground(vng.t(dzg0.component_default_list_item_bg, listItemComponent.getContext()));
        }
    }
}
