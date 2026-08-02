package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes18.dex */
public final class iwt0 {

    /* JADX WARN: Incorrect field signature: TT; */
    /* compiled from: ViewExt.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ izs<T, s3q0> c;

        /* JADX WARN: Incorrect types in method signature: (TT;Lxsna/izs<-TT;Lxsna/s3q0;>;)V */
        public a(View view, izs izsVar) {
            this.b = view;
            this.c = izsVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            View view2 = this.b;
            view2.removeOnLayoutChangeListener(this);
            this.c.invoke(view2);
        }
    }

    public static final <T extends View> void a(T t, izs<? super T, s3q0> izsVar) {
        if (t.getMeasuredHeight() > 0 || t.getMeasuredWidth() > 0) {
            izsVar.invoke(t);
        } else {
            t.addOnLayoutChangeListener(new a(t, izsVar));
        }
    }
}
