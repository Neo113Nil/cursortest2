package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.position_confirmation.j;
import com.yandex.go.route.interactor.c;
import kotlin.a;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;

/* loaded from: classes13.dex */
public final class e6g implements wgg0, dz41 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;

    public e6g(Resources resources) {
        this.e = resources;
        final int i = 0;
        this.a = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                e6g e6gVar = this.b;
                switch (i2) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i2 = 2;
        this.b = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i3 = 4;
        this.c = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i4 = 5;
        this.d = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i5 = 6;
        this.f = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i5;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i6 = 7;
        this.g = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i6;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i7 = 8;
        this.h = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i7;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i8 = 9;
        this.i = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i8;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i9 = 11;
        this.j = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i9;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i10 = 12;
        this.k = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i10;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i11 = 10;
        this.l = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i11;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i12 = 13;
        this.m = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i12;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i13 = 14;
        this.n = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i13;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i14 = 15;
        this.o = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i14;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i15 = 16;
        this.p = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i15;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i16 = 17;
        this.q = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i16;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i17 = 18;
        this.r = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i17;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i18 = 19;
        this.s = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i18;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i19 = 20;
        this.t = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i19;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i20 = 1;
        this.u = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i20;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        final int i21 = 3;
        this.v = a.a(new sls(this) { // from class: uyt0
            public final /* synthetic */ e6g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i21;
                e6g e6gVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_m_space));
                    case 1:
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((Number) ((i3y) e6gVar.i).getValue()).intValue());
                        marginLayoutParams.topMargin = ((Number) ((i3y) e6gVar.j).getValue()).intValue();
                        marginLayoutParams.bottomMargin = ((Number) ((i3y) e6gVar.k).getValue()).intValue();
                        return marginLayoutParams;
                    case 2:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 3:
                        i3y i3yVar = (i3y) e6gVar.d;
                        return new ViewGroup.MarginLayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    case 4:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 10.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 5:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 44.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 6:
                        return Float.valueOf(TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 7:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 1.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 8:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 9:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 10:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 11:
                        return Integer.valueOf(((Resources) e6gVar.e).getDimensionPixelSize(mrg0.go_design_s_space));
                    case 12:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 13:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 2.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 14:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 15:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 9.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 16:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 4.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 17:
                        return Integer.valueOf((int) TypedValue.applyDimension(1, 6.0f, ((Resources) e6gVar.e).getDisplayMetrics()));
                    case 18:
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams2.topMargin = ((Number) ((i3y) e6gVar.p).getValue()).intValue();
                        marginLayoutParams2.setMarginEnd(((Number) ((i3y) e6gVar.q).getValue()).intValue());
                        return marginLayoutParams2;
                    case 19:
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams3.setMarginStart(((Number) ((i3y) e6gVar.n).getValue()).intValue());
                        marginLayoutParams3.topMargin = ((Number) ((i3y) e6gVar.o).getValue()).intValue();
                        return marginLayoutParams3;
                    default:
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams4.setMarginStart(((Number) ((i3y) e6gVar.l).getValue()).intValue());
                        marginLayoutParams4.topMargin = ((Number) ((i3y) e6gVar.m).getValue()).intValue();
                        return marginLayoutParams4;
                }
            }
        });
        this.w = a.a(new fet0(i9));
    }

    public void a(boolean z) {
        ((j) this.b).a();
        Address g = ((c) this.c).g();
        zzs B = g != null ? g.B() : null;
        if (z || B == null) {
            return;
        }
        ((uy41) this.d).a(B, false);
    }

    public void b(zzs zzsVar) {
        ((uy41) this.d).a(zzsVar, true);
        ((xit0) this.s).a();
        c9l0 c9l0Var = (c9l0) this.i;
        if (c9l0Var.b()) {
            c9l0Var.a.a().c(RouteSelectorModalView.class, true, null);
        }
        ((net0) this.v).d();
        if (((ou7) this.f).b()) {
            ((wit0) ((tft0) this.t).a(true)).c(((gh00) ((ah00) this.u)).e.b(), "auto", PositionInitAction.MAP);
        }
        ((xvw) this.m).a();
        ((r) this.l).g();
    }

    public /* synthetic */ e6g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22, Object obj23) {
        this.e = obj;
        this.a = obj2;
        this.b = obj3;
        this.c = obj4;
        this.d = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
        this.i = obj9;
        this.j = obj10;
        this.k = obj11;
        this.l = obj12;
        this.m = obj13;
        this.n = obj14;
        this.o = obj15;
        this.p = obj16;
        this.q = obj17;
        this.r = obj18;
        this.s = obj19;
        this.t = obj20;
        this.u = obj21;
        this.v = obj22;
        this.w = obj23;
    }
}
