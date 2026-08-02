package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: FooterLoadingViewProvider.java */
/* loaded from: classes3.dex */
public abstract class x6s {
    public static final a a = new a();

    /* compiled from: FooterLoadingViewProvider.java */
    public class a extends x6s {
        @Override // xsna.x6s
        public final View a(Context context, ViewGroup viewGroup) {
            return LayoutInflater.from(context).inflate(R.layout.vk_view_default_list_loading, viewGroup, false);
        }
    }

    /* compiled from: FooterLoadingViewProvider.java */
    public static final class b extends RecyclerView.e0 {
    }

    public abstract View a(Context context, ViewGroup viewGroup);

    public RecyclerView.e0 b(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        View a2 = a(context, viewGroup);
        ViewGroup.LayoutParams d = d();
        b bVar = new b(a2);
        a2.setLayoutParams(d);
        return bVar;
    }

    public int c() {
        return 2147483597;
    }

    public ViewGroup.LayoutParams d() {
        return new RecyclerView.p(-1, -2);
    }
}
