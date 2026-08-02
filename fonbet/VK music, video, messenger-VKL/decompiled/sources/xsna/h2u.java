package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.awu;

/* compiled from: GlobalSearchSectionHeader.kt */
/* loaded from: classes7.dex */
public final class h2u<T> extends awu.b<T> {
    public int a;

    /* compiled from: GlobalSearchSectionHeader.kt */
    public static final class a extends axu {
    }

    @Override // xsna.awu.b
    public final int a() {
        return 10;
    }

    @Override // xsna.awu.b
    public final RecyclerView.e0 c(ViewGroup viewGroup) {
        a aVar = new a(viewGroup);
        bwt0.Z(R.attr.vk_ui_background_content, aVar.itemView);
        ((TextView) aVar.itemView).setText(R.string.search_global);
        return aVar;
    }

    @Override // xsna.awu.b
    public final boolean d(T t) {
        return false;
    }

    @Override // xsna.awu.b
    public final boolean e(T t) {
        return this.a == 0;
    }

    @Override // xsna.awu.b
    public final boolean f(int i, Object obj, Object obj2) {
        return i == this.a;
    }

    @Override // xsna.awu.b
    public final void b(RecyclerView.e0 e0Var) {
    }
}
