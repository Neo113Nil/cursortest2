package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: FooterProviders.kt */
/* loaded from: classes7.dex */
public final class z6s {
    public static final b a = new b();
    public static final a b = new a();

    /* compiled from: FooterProviders.kt */
    public static final class a extends n6s {
        @Override // xsna.n6s
        public final ee a(Context context, ViewGroup viewGroup) {
            edv edvVar = new edv(context, null, 0);
            edvVar.d = 0L;
            edvVar.c(context);
            return edvVar;
        }

        @Override // xsna.n6s
        public final RecyclerView.e0 b(Context context, ViewGroup viewGroup, xa80 xa80Var) {
            ee a = a(context, viewGroup);
            c cVar = new c(a);
            a.setRetryClickListener(xa80Var);
            a.setLayoutParams(new RecyclerView.p(-2, -1));
            return cVar;
        }

        @Override // xsna.n6s
        public final int c() {
            return 2147483593;
        }
    }

    /* compiled from: FooterProviders.kt */
    public static final class b extends x6s {

        /* compiled from: FooterProviders.kt */
        public static final class a extends RecyclerView.e0 {
        }

        @Override // xsna.x6s
        public final View a(Context context, ViewGroup viewGroup) {
            return LayoutInflater.from(context).inflate(R.layout.horizontal_pagination_list_loading, viewGroup, false);
        }

        @Override // xsna.x6s
        public final RecyclerView.e0 b(Context context, ViewGroup viewGroup) {
            return new a(a(context, viewGroup));
        }

        @Override // xsna.x6s
        public final int c() {
            return 2147483594;
        }
    }

    /* compiled from: FooterProviders.kt */
    public static final class c extends RecyclerView.e0 {
    }
}
