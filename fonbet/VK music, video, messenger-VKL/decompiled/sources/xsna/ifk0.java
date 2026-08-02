package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: SortingListHolder.kt */
/* loaded from: classes18.dex */
public final class ifk0 extends RecyclerView.e0 {
    public static final /* synthetic */ int q = 0;
    public final ViewGroup l;
    public final TextView m;
    public final ImageView n;
    public a o;
    public izs<? super a, s3q0> p;

    /* compiled from: SortingListHolder.kt */
    public static final class a {
        public final boolean a;
        public final String b;
        public final String c;

        public a(boolean z, String str, String str2) {
            this.a = z;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SortItem(selected=");
            sb.append(this.a);
            sb.append(", idSort=");
            sb.append(this.b);
            sb.append(", title=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public ifk0(ViewGroup viewGroup) {
        super(viewGroup);
        this.l = viewGroup;
        this.m = (TextView) viewGroup.findViewById(R.id.title);
        this.n = (ImageView) viewGroup.findViewById(R.id.selected_icon);
        jjc.g(viewGroup, new qz40(this, 27));
    }
}
