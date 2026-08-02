package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import java.util.ArrayList;

/* compiled from: TabsAdapter.kt */
/* loaded from: classes15.dex */
public final class cyn0 extends s680<jsn0> {
    public final a d;
    public final c e;
    public final ArrayList<b> f;

    /* compiled from: TabsAdapter.kt */
    public interface a {
        float a();

        int position();
    }

    /* compiled from: TabsAdapter.kt */
    public static final class b {
        public final int a;
        public final int b;
        public final boolean c;
        public final gzs<FragmentImpl> d;
        public String e;

        public b() {
            throw null;
        }

        public b(int i, int i2, gzs gzsVar, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabInfo(iconResId=");
            sb.append(this.a);
            sb.append(", titleResId=");
            sb.append(this.b);
            sb.append(", allowHorizontalScroll=");
            sb.append(this.c);
            sb.append(", fragmentFactoryMethod=");
            return uf3.d(sb, this.d, ')');
        }
    }

    /* compiled from: TabsAdapter.kt */
    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f) + shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabTheme(inactiveBackgroundColor=");
            sb.append(this.a);
            sb.append(", activeBackgroundColor=");
            sb.append(this.b);
            sb.append(", inactiveIconColor=");
            sb.append(this.c);
            sb.append(", activeIconColor=");
            sb.append(this.d);
            sb.append(", inactiveTextColor=");
            sb.append(this.e);
            sb.append(", activeTextColor=");
            return vu5.b(sb, this.f, ')');
        }
    }

    public cyn0(a aVar, c cVar) {
        this.c = null;
        this.d = aVar;
        this.e = cVar;
        this.f = new ArrayList<>();
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.f.get(i).b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        jsn0 jsn0Var = (jsn0) e0Var;
        b bVar = this.f.get(i);
        qtn0 qtn0Var = (qtn0) jsn0Var.itemView;
        int adapterPosition = jsn0Var.getAdapterPosition();
        a aVar = jsn0Var.l;
        int position = aVar.position();
        float a2 = aVar.a();
        qtn0Var.b.setImageResource(bVar.a);
        qtn0Var.c.setText(bVar.b);
        qtn0Var.d.setVisibility(8);
        qtn0Var.a(a2, adapterPosition, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        jsn0 jsn0Var = new jsn0(viewGroup.getContext(), this.d, this.e);
        bwt0.i0(jsn0Var.itemView, new g84(24, this, jsn0Var));
        return jsn0Var;
    }
}
