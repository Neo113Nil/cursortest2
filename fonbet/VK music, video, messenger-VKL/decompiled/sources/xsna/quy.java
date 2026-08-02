package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: LazyLinearLayout.kt */
/* loaded from: classes2.dex */
public abstract class quy<Data> extends LinearLayout {
    public final vsy b;

    /* compiled from: LazyLinearLayout.kt */
    public final class a implements nsy<Data> {
        public a() {
        }

        @Override // xsna.nsy
        public final int a() {
            return quy.this.getChildCount();
        }

        @Override // xsna.nsy
        public final void b() {
            quy.this.b();
        }

        @Override // xsna.nsy
        public final void c(Data data) {
            quy.this.c(data);
        }
    }

    public quy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(Data data) {
        this.b.b(data);
    }

    public abstract void b();

    public abstract void c(Data data);

    public final Data getData() {
        return (Data) this.b.c;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.b.e(i);
        super.setVisibility(i);
    }

    public quy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = new vsy(new a());
        setVisibility(8);
    }
}
