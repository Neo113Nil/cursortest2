package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: MusicJustInflateAdapter.kt */
/* loaded from: classes3.dex */
public class nl40 extends etj0<Object, se50<Object>> {
    public static final Object f = new Object();
    public final int d = R.layout.music_ui_progress;
    public LayoutInflater e;

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public nl40() {
        this.c = f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((se50) e0Var).V5("", false, i, this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.e;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            this.e = layoutInflater;
        }
        return new a(layoutInflater.inflate(this.d, viewGroup, false));
    }

    /* compiled from: MusicJustInflateAdapter.kt */
    public static final class a<T> extends se50<T> {
        @Override // xsna.se50
        public final void b6(T t) {
        }
    }
}
