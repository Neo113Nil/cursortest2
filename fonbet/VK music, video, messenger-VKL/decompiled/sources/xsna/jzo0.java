package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: TitleHolder.kt */
/* loaded from: classes7.dex */
public final class jzo0 extends vif0<Object> {
    public static final /* synthetic */ int o = 0;
    public final TextView n;

    /* compiled from: TitleHolder.kt */
    public static final class a {
        public static jzo0 a(ViewGroup viewGroup) {
            jzo0 jzo0Var = new jzo0(R.layout.title_holder, viewGroup);
            int a = iah0.a(44);
            TextView textView = jzo0Var.n;
            textView.setMinHeight(a);
            jno0.c(textView, R.attr.vk_ui_text_secondary);
            textView.setAllCaps(true);
            return jzo0Var;
        }
    }

    /* compiled from: TitleHolder.kt */
    public static final class b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Data(text=null, onClickListener=null)";
        }
    }

    public jzo0(int i, ViewGroup viewGroup) {
        super(viewGroup, i, 0);
        this.n = (TextView) this.itemView.findViewById(R.id.title_holder);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        boolean z = obj instanceof Integer;
        TextView textView = this.n;
        if (z) {
            u1u0.i(textView, obj, false);
            return;
        }
        if (obj instanceof String) {
            u1u0.i(textView, obj, false);
            return;
        }
        if (obj instanceof CharSequence) {
            u1u0.i(textView, obj, false);
            return;
        }
        if (obj instanceof b) {
            View view = this.itemView;
            b bVar = (b) obj;
            bVar.getClass();
            view.setOnClickListener(null);
            bVar.getClass();
            u1u0.i(textView, null, false);
        }
    }
}
