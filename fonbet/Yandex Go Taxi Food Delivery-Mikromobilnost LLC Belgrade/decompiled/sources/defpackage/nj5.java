package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class nj5 extends lys implements t7u {
    public static final /* synthetic */ int a0 = 0;
    public static final /* synthetic */ int b0 = 0;
    public final /* synthetic */ int S;
    public eiy T;
    public final aiy U;
    public final GoImageView V;
    public final FrameLayout W;
    public epu Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj5(ListItemComponent listItemComponent, int i) {
        super(listItemComponent);
        this.S = i;
        aiy aiyVar = aiy.a;
        switch (i) {
            case 1:
                super(listItemComponent);
                this.T = aiyVar;
                this.U = aiyVar;
                GoImageView goImageView = new GoImageView(((ListItemComponent) ((View) this.R)).getContext(), null, 0, 6, null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                goImageView.setLayoutParams(layoutParams);
                this.V = goImageView;
                FrameLayout frameLayout = new FrameLayout(((ListItemComponent) ((View) this.R)).getContext());
                lob1.b(frameLayout);
                frameLayout.addView(goImageView);
                this.W = frameLayout;
                this.Z = new dpu(frameLayout, null);
                ((ListItemComponent) ((View) this.R)).setLeadView(frameLayout);
                break;
            default:
                this.U = aiyVar;
                this.T = aiyVar;
                GoImageView goImageView2 = new GoImageView(((ListItemComponent) ((View) this.R)).getContext(), null, 0, 6, null);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                goImageView2.setLayoutParams(layoutParams2);
                this.V = goImageView2;
                FrameLayout frameLayout2 = new FrameLayout(((ListItemComponent) ((View) this.R)).getContext());
                lob1.b(frameLayout2);
                frameLayout2.addView(goImageView2);
                this.W = frameLayout2;
                this.Z = new dpu(frameLayout2, null);
                ((ListItemComponent) ((View) this.R)).setLeadView(frameLayout2);
                break;
        }
    }

    @Override // defpackage.wys
    public final boolean X() {
        switch (this.S) {
        }
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        GoImageView goImageView = this.V;
        Object obj2 = this.R;
        FrameLayout frameLayout = this.W;
        switch (i) {
            case 0:
                hj5 hj5Var = (hj5) obj;
                ListItemComponent listItemComponent = (ListItemComponent) ((View) obj2);
                this.T = lob1.g(hj5Var.f);
                obm obmVar = hj5Var.c;
                goImageView.setImageDrawable(obmVar != null ? obmVar.b : null);
                goImageView.setImageTintList(obmVar != null ? ColorStateList.valueOf(qje.t(R.attr.textColor, listItemComponent.getContext())) : null);
                this.Z = obmVar == null ? new dpu(frameLayout, null) : new cpu(goImageView, frameLayout);
                listItemComponent.setTitle(hj5Var.a);
                listItemComponent.setTrailCompanionText(hj5Var.b);
                listItemComponent.setContentDescription(hj5Var.e);
                break;
            default:
                jar jarVar = (jar) obj;
                ListItemComponent listItemComponent2 = (ListItemComponent) ((View) obj2);
                this.T = lob1.g(jarVar.e);
                obm obmVar2 = jarVar.c;
                goImageView.setImageDrawable(obmVar2 != null ? obmVar2.b : null);
                this.Z = obmVar2 == null ? new dpu(frameLayout, null) : new cpu(goImageView, frameLayout);
                listItemComponent2.setTitle(jarVar.a);
                listItemComponent2.setTrailCompanionText(jarVar.b);
                listItemComponent2.setContentDescription(jarVar.d);
                break;
        }
    }

    @Override // defpackage.t7u
    public final eiy g() {
        switch (this.S) {
            case 0:
                return this.U;
            default:
                return this.T;
        }
    }

    @Override // defpackage.t7u
    public final eiy k() {
        switch (this.S) {
            case 0:
                return this.T;
            default:
                return this.U;
        }
    }

    @Override // defpackage.t7u
    public final epu x() {
        switch (this.S) {
        }
        return this.Z;
    }
}
