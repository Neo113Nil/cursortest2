package xsna;

import android.content.Context;
import android.os.Trace;
import android.widget.FrameLayout;

/* compiled from: LazyFrameLayout.kt */
/* loaded from: classes2.dex */
public abstract class qqy<Data> extends FrameLayout {
    public final vsy b;

    /* compiled from: LazyFrameLayout.kt */
    public final class a implements nsy<Data> {
        public a() {
        }

        @Override // xsna.nsy
        public final int a() {
            return qqy.this.getChildCount();
        }

        @Override // xsna.nsy
        public final void b() {
            qqy.this.b();
        }

        @Override // xsna.nsy
        public final void c(Data data) {
            qqy.this.c(data);
        }
    }

    public qqy(Context context) {
        super(context, null, 0);
        this.b = new vsy(new a());
        setVisibility(8);
    }

    public final void a(Data data) {
        Trace.beginSection("LazyFrameLayout.bind");
        try {
            this.b.b(data);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
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
}
