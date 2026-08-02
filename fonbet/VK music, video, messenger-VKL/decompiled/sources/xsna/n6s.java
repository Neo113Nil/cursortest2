package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FooterErrorViewProvider.java */
/* loaded from: classes3.dex */
public abstract class n6s {
    public static final a a = new a();

    /* compiled from: FooterErrorViewProvider.java */
    public class a extends n6s {
        @Override // xsna.n6s
        public final ee a(Context context, ViewGroup viewGroup) {
            return new rhl(context);
        }
    }

    /* compiled from: FooterErrorViewProvider.java */
    public static final class b extends c {
    }

    /* compiled from: FooterErrorViewProvider.java */
    public static abstract class c extends RecyclerView.e0 {
    }

    public abstract ee a(Context context, ViewGroup viewGroup);

    public RecyclerView.e0 b(@NonNull Context context, @NonNull ViewGroup viewGroup, xa80 xa80Var) {
        ee a2 = a(context, viewGroup);
        b bVar = new b(a2);
        ((ee) bVar.itemView).setRetryClickListener(xa80Var);
        a2.setLayoutParams(new RecyclerView.p(-1, -2));
        return bVar;
    }

    public int c() {
        return 2147483596;
    }
}
