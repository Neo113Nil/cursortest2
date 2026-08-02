package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: SoundControl.kt */
/* loaded from: classes2.dex */
public interface wfk0 {

    /* compiled from: SoundControl.kt */
    public static final class a implements wfk0 {
        public final View b;

        public a(View view) {
            this.b = view;
        }

        @Override // xsna.wfk0
        public final void a(dko dkoVar) {
            View view = this.b;
            Drawable a = dkoVar.a(view.getContext());
            if (view instanceof ImageView) {
                ((ImageView) view).setImageDrawable(a);
            } else {
                view.setBackground(a);
            }
        }

        @Override // xsna.wfk0
        public final View b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return br.b(new StringBuilder("SoundControlView(control="), this.b, ')');
        }
    }

    void a(dko dkoVar);

    View b();
}
