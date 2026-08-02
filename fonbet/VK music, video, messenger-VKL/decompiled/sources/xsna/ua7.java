package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import xsna.fb7;
import xsna.ka7;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ua7 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ua7(RecyclerView.e0 e0Var, Object obj, int i) {
        this.b = i;
        this.c = e0Var;
        this.d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((va7) this.c).m.b(new fb7.b(((ib7) this.d).b, ka7.a.a));
                break;
            default:
                ghw ghwVar = (ghw) this.c;
                ehw ehwVar = (ehw) this.d;
                ghwVar.m.Z1(new uai0(ehwVar.a, ehwVar.b));
                break;
        }
    }
}
