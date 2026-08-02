package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollToTopDelegate.kt */
/* loaded from: classes17.dex */
public interface qgh0 {

    /* compiled from: ScrollToTopDelegate.kt */
    public static final class a implements qgh0 {
        @Override // xsna.qgh0
        public final void a(RecyclerView recyclerView) {
            recyclerView.scrollToPosition(0);
        }
    }

    void a(RecyclerView recyclerView);
}
