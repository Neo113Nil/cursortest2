package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: FooterEmptyViewProvider.java */
/* loaded from: classes3.dex */
public abstract class h6s {
    public static final a a = new a();

    /* compiled from: FooterEmptyViewProvider.java */
    public class a extends h6s {
        @Override // xsna.h6s
        public final View a(Context context, ViewGroup viewGroup) {
            phl phlVar = new phl(context);
            phlVar.a(context);
            phlVar.setTitle(R.string.liblists_empty_list);
            return phlVar;
        }
    }

    /* compiled from: FooterEmptyViewProvider.java */
    public final class b extends RecyclerView.e0 {
    }

    public abstract View a(@NonNull Context context, @NonNull ViewGroup viewGroup);

    public RecyclerView.e0 b(Context context, ViewGroup viewGroup) {
        View a2 = a(context, viewGroup);
        b bVar = new b(a2);
        a2.setLayoutParams(new RecyclerView.p(-1, -2));
        return bVar;
    }
}
