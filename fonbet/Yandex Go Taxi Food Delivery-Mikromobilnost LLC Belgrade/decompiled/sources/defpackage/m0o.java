package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.masstransit.ui.route.modal.expanded.adapter.Ellipse$Size;

/* loaded from: classes6.dex */
public final class m0o extends lys implements t7u {
    public static final /* synthetic */ int W = 0;
    public static final /* synthetic */ int Z = 0;
    public static final /* synthetic */ int a0 = 0;
    public static final /* synthetic */ int b0 = 0;
    public static final /* synthetic */ int c0 = 0;
    public final /* synthetic */ int S;
    public eiy T;
    public eiy U;
    public dpu V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0o(ListItemComponent listItemComponent, int i) {
        super(listItemComponent);
        this.S = i;
        aiy aiyVar = aiy.a;
        switch (i) {
            case 2:
                super(listItemComponent);
                this.T = aiyVar;
                this.U = aiyVar;
                GoFrameLayout goFrameLayout = new GoFrameLayout(((ListItemComponent) ((View) this.R)).getContext(), null, 0, 0, 14, null);
                goFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(tje.u(56, goFrameLayout.getContext()), tje.r(mrg0.list_item_component_size_XS, goFrameLayout.getContext())));
                this.V = new dpu(goFrameLayout, new frn(Ellipse$Size.SMALL, new bdc(xng0.bgMain)));
                ((ListItemComponent) ((View) this.R)).setLeadView(goFrameLayout);
                break;
            case 3:
            default:
                this.T = aiyVar;
                this.U = aiyVar;
                GoFrameLayout goFrameLayout2 = new GoFrameLayout(((ListItemComponent) ((View) this.R)).getContext(), null, 0, 0, 14, null);
                goFrameLayout2.setLayoutParams(new ViewGroup.LayoutParams(tje.u(56, goFrameLayout2.getContext()), tje.r(mrg0.list_item_component_size_XS, goFrameLayout2.getContext())));
                this.V = new dpu(goFrameLayout2, new frn(Ellipse$Size.SMALL, new bdc(xng0.bgMain)));
                ((ListItemComponent) ((View) this.R)).setLeadView(goFrameLayout2);
                ((ListItemComponent) ((View) this.R)).setMinHeight(c.d(asg0.mt_stop_selector_item_height, listItemComponent));
                break;
            case 4:
                super(listItemComponent);
                yhy yhyVar = yhy.a;
                this.T = yhyVar;
                this.U = yhyVar;
                this.V = new dpu(((ListItemComponent) ((View) this.R)).getLeadImageView(), null);
                break;
        }
    }

    @Override // defpackage.wys
    public final boolean X() {
        switch (this.S) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [kdc] */
    /* JADX WARN: Type inference failed for: r3v8, types: [kdc] */
    @Override // defpackage.wys
    public final void c(Object obj) {
        gdc gdcVar;
        int i = this.S;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                i0o i0oVar = (i0o) obj;
                ListItemComponent listItemComponent = (ListItemComponent) ((View) obj2);
                this.T = lob1.g(i0oVar.g);
                this.U = lob1.g(i0oVar.d);
                Ellipse$Size ellipse$Size = Ellipse$Size.BIG;
                k911 k911Var = i0oVar.g;
                gdc gdcVar2 = new gdc(mqg0.transparent);
                if (!(k911Var instanceof h911)) {
                    if (!(k911Var instanceof i911)) {
                        if (!jl40.l(k911Var, f911.a) && !jl40.l(k911Var, g911.a) && !jl40.l(k911Var, j911.a)) {
                            w511.b();
                            break;
                        } else {
                            gdcVar = null;
                        }
                    } else {
                        gdcVar = ((i911) k911Var).a;
                    }
                } else {
                    gdcVar = ((h911) k911Var).a;
                }
                if (gdcVar != null) {
                    gdcVar2 = gdcVar;
                }
                this.V = new dpu(listItemComponent.getLeadImageView(), new frn(ellipse$Size, gdcVar2));
                listItemComponent.setTitle(i0oVar.a);
                listItemComponent.setSubtitle(i0oVar.b);
                listItemComponent.setTrailCompanionText(i0oVar.c);
                listItemComponent.setContentDescription(i0oVar.e);
                break;
            case 1:
                xfu0 xfu0Var = (xfu0) obj;
                ListItemComponent listItemComponent2 = (ListItemComponent) ((View) obj2);
                this.T = xfu0Var.d;
                this.U = xfu0Var.e;
                listItemComponent2.setTitle(xfu0Var.b);
                listItemComponent2.setSubtitle(xfu0Var.c);
                break;
            case 2:
                m911 m911Var = (m911) obj;
                this.T = lob1.g(m911Var.b);
                this.U = lob1.g(m911Var.b);
                ((ListItemComponent) ((View) obj2)).setTitle(m911Var.a);
                break;
            case 3:
                yx11 yx11Var = (yx11) obj;
                ListItemComponent listItemComponent3 = (ListItemComponent) ((View) obj2);
                this.T = lob1.g(yx11Var.d);
                this.U = lob1.g(yx11Var.d);
                listItemComponent3.setTitle(yx11Var.a);
                listItemComponent3.setSubtitle(yx11Var.b);
                listItemComponent3.setContentDescription(yx11Var.c);
                break;
            default:
                nra0 nra0Var = (nra0) obj;
                ListItemComponent listItemComponent4 = (ListItemComponent) ((View) obj2);
                listItemComponent4.setTitle(nra0Var.a);
                listItemComponent4.setContentDescription(nra0Var.d);
                break;
        }
    }

    @Override // defpackage.t7u
    public final eiy g() {
        switch (this.S) {
            case 0:
                return this.T;
            case 1:
                return this.T;
            case 2:
                return this.T;
            case 3:
                return this.T;
            default:
                return (yhy) this.T;
        }
    }

    @Override // defpackage.t7u
    public final eiy k() {
        switch (this.S) {
            case 0:
                return this.U;
            case 1:
                return this.U;
            case 2:
                return this.U;
            case 3:
                return this.U;
            default:
                return (yhy) this.U;
        }
    }

    @Override // defpackage.t7u
    public final epu x() {
        switch (this.S) {
        }
        return this.V;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0o(View view, int i) {
        super(view);
        this.S = i;
    }
}
