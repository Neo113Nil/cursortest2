package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import xsna.se50;

/* compiled from: MusicSingleItemAdapter.kt */
/* loaded from: classes3.dex */
public abstract class t550<T, VH extends se50<T>> extends etj0<T, VH> {

    /* compiled from: MusicSingleItemAdapter.kt */
    public static final class a<T, VH extends se50<T>> extends t550<T, VH> {
        public final izs<ViewGroup, VH> d;
        public final String e;

        public a(String str, izs izsVar) {
            this.d = izsVar;
            this.e = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return this.d.invoke(viewGroup);
        }

        public final String toString() {
            String str = this.e;
            return str == null ? super.toString() : str;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(VH vh, int i) {
        vh.V5("", false, i, this.c);
    }
}
