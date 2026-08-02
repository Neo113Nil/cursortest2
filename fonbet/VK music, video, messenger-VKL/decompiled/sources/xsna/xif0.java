package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.fb80;

/* compiled from: RecyclerHolderVisibilityTracker.kt */
/* loaded from: classes4.dex */
public final class xif0 extends fb80<Object> {
    public final float d;
    public final float e;

    public /* synthetic */ xif0(RecyclerView recyclerView) {
        this(recyclerView, 0.4f, 0.4f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        RecyclerView recyclerView = this.b;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i));
            if (findContainingViewHolder != 0 && (findContainingViewHolder instanceof y4u0)) {
                ((y4u0) findContainingViewHolder).B5(fco0.f(recyclerView, findContainingViewHolder.itemView, this.d, this.e, true));
            }
        }
    }

    public final void b() {
        RecyclerView recyclerView = this.b;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i));
            y4u0 y4u0Var = findContainingViewHolder instanceof y4u0 ? (y4u0) findContainingViewHolder : null;
            if (y4u0Var != null) {
                y4u0Var.onDestroy();
            }
        }
    }

    public xif0(RecyclerView recyclerView, float f, float f2) {
        super(recyclerView, new a());
        this.d = f;
        this.e = f2;
    }

    /* compiled from: RecyclerHolderVisibilityTracker.kt */
    public static final class a implements fb80.b<Object> {
        @Override // xsna.fb80.b
        public final void d(NewsEntry newsEntry, fb80.c cVar) {
        }

        @Override // xsna.fb80.b
        public final void n(Object obj, long j, long j2) {
        }
    }
}
