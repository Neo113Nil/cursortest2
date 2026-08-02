package xsna;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: LazyConstraintLayout.kt */
/* loaded from: classes2.dex */
public abstract class gqy<Data> extends ConstraintLayout {
    public final vsy t;

    /* compiled from: LazyConstraintLayout.kt */
    public final class a implements nsy<Data> {
        public final /* synthetic */ pgt0 a;

        public a(pgt0 pgt0Var) {
            this.a = pgt0Var;
        }

        @Override // xsna.nsy
        public final int a() {
            return this.a.getChildCount();
        }

        @Override // xsna.nsy
        public final void b() {
            this.a.P4();
        }

        @Override // xsna.nsy
        public final void c(Data data) {
            this.a.Q4(data);
        }
    }

    public gqy(Context context) {
        super(context, null, 0);
        this.t = new vsy(new a((pgt0) this));
        setVisibility(8);
    }

    public final Data getData() {
        return (Data) this.t.c;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.t.e(i);
        super.setVisibility(i);
    }
}
