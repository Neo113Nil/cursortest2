package defpackage;

import android.view.ViewGroup;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class chu0 extends lys implements t7u {
    public static final /* synthetic */ int Z = 0;
    public static final /* synthetic */ int a0 = 0;
    public final /* synthetic */ int S = 1;
    public eiy T;
    public eiy U;
    public final GoFrameLayout V;
    public dpu W;

    public chu0(hnb hnbVar) {
        super(hnbVar);
        aiy aiyVar = aiy.a;
        this.T = aiyVar;
        this.U = aiyVar;
        GoFrameLayout goFrameLayout = new GoFrameLayout(this.a.getContext(), null, 0, 0, 14, null);
        goFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(tje.u(56, goFrameLayout.getContext()), tje.r(mrg0.list_item_component_size_XS, goFrameLayout.getContext())));
        this.V = goFrameLayout;
        this.W = new dpu(goFrameLayout, null);
        hnbVar.a.setLeadView(goFrameLayout);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        GoFrameLayout goFrameLayout = this.V;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                bhu0 bhu0Var = (bhu0) obj;
                inb inbVar = (inb) ((zo31) obj2);
                this.T = bhu0Var.d;
                this.U = bhu0Var.e;
                inbVar.a.setTitle(bhu0Var.b);
                inbVar.a.setSubtitle(bhu0Var.c);
                this.W = new dpu(goFrameLayout, bhu0Var.f);
                break;
            default:
                ahu0 ahu0Var = (ahu0) obj;
                hnb hnbVar = (hnb) ((zo31) obj2);
                this.T = ahu0Var.d;
                this.U = ahu0Var.e;
                hnbVar.a.setTitle(ahu0Var.b);
                ListItemComponent listItemComponent = hnbVar.a;
                listItemComponent.setSubtitle(ahu0Var.c);
                boolean z = ahu0Var.g;
                if (z) {
                    listItemComponent.setTrailMode(2);
                } else {
                    listItemComponent.setTrailMode(0);
                }
                listItemComponent.setClickable(z);
                this.W = new dpu(goFrameLayout, ahu0Var.f);
                break;
        }
    }

    @Override // defpackage.t7u
    public final eiy g() {
        switch (this.S) {
        }
        return this.T;
    }

    @Override // defpackage.t7u
    public final eiy k() {
        switch (this.S) {
        }
        return this.U;
    }

    @Override // defpackage.t7u
    public final epu x() {
        switch (this.S) {
        }
        return this.W;
    }

    public chu0(inb inbVar) {
        super(inbVar);
        aiy aiyVar = aiy.a;
        this.T = aiyVar;
        this.U = aiyVar;
        GoFrameLayout goFrameLayout = new GoFrameLayout(this.a.getContext(), null, 0, 0, 14, null);
        goFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(tje.u(56, goFrameLayout.getContext()), tje.r(mrg0.list_item_component_size_XS, goFrameLayout.getContext())));
        this.V = goFrameLayout;
        this.W = new dpu(goFrameLayout, null);
        inbVar.a.setLeadView(goFrameLayout);
    }
}
