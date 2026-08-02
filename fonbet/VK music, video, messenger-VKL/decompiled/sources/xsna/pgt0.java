package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.design.view.endview.VideoEndView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VideoSimilarCompleteView.kt */
/* loaded from: classes2.dex */
public final class pgt0 extends gqy<a> {
    public final b A;
    public final boolean u;
    public final boolean v;
    public final gzs<qul> w;
    public final Object x;
    public final Object y;
    public final qul z;

    /* compiled from: VideoSimilarCompleteView.kt */
    public static final class a {
        public final com.vk.libvideo.design.view.endview.a a;
        public final View.OnClickListener b;
        public final List<hfz> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(com.vk.libvideo.design.view.endview.a aVar, View.OnClickListener onClickListener, List<? extends hfz> list) {
            this.a = aVar;
            this.b = onClickListener;
            this.c = list;
        }
    }

    /* compiled from: VideoSimilarCompleteView.kt */
    public final class b extends RecyclerView.n {
        public final int b = iah0.a(6);

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            boolean z = childAdapterPosition == 0;
            qul qulVar = pgt0.this.z;
            boolean z2 = childAdapterPosition == (qulVar != null ? qulVar.getItemCount() : 0) - 1;
            int i = this.b;
            if (z) {
                rect.set(i, 0, 0, 0);
            } else if (z2) {
                rect.set(0, 0, i, 0);
            } else {
                super.getItemOffsets(rect, view, recyclerView, a0Var);
            }
        }
    }

    public pgt0() {
        throw null;
    }

    public pgt0(Context context, boolean z, boolean z2, gzs gzsVar) {
        super(context);
        this.u = z;
        this.v = z2;
        this.w = gzsVar;
        q6s0 q6s0Var = new q6s0(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.x = msy.a(lazyThreadSafetyMode, q6s0Var);
        this.y = msy.a(lazyThreadSafetyMode, new afl0(this, 20));
        this.z = gzsVar != null ? (qul) gzsVar.invoke() : null;
        this.A = new b();
        this.t.getClass();
        if (vsy.d()) {
            P4();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VideoEndView getEndView() {
        return (VideoEndView) this.x.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RecyclerView getSimilarRecycler() {
        return (RecyclerView) this.y.getValue();
    }

    public final void P4() {
        VideoEndView videoEndView = new VideoEndView(getContext(), null);
        videoEndView.setId(R.id.end_view);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        videoEndView.setGravity(1);
        videoEndView.setLayoutParams(bVar);
        bwt0.p0(videoEndView.d, false);
        bwt0.p0(videoEndView.f, this.v);
        videoEndView.setIconsSize(VideoEndView.IconSize.DP_28);
        addView(videoEndView);
        if (this.u) {
            RecyclerView recyclerView = new RecyclerView(getContext());
            recyclerView.setId(R.id.similar_recycler);
            ConstraintLayout.b bVar2 = new ConstraintLayout.b(-1, -2);
            ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = iah0.a(12);
            recyclerView.setLayoutParams(bVar2);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView.setAdapter(this.z);
            recyclerView.addItemDecoration(this.A);
            addView(recyclerView);
        }
        androidx.constraintlayout.widget.b bVar3 = new androidx.constraintlayout.widget.b();
        bVar3.i(this);
        bVar3.k(getEndView().getId(), 3, 0, 3);
        bVar3.k(getEndView().getId(), 6, 0, 6);
        bVar3.k(getEndView().getId(), 7, 0, 7);
        RecyclerView similarRecycler = getSimilarRecycler();
        if (similarRecycler != null) {
            bVar3.k(getEndView().getId(), 4, similarRecycler.getId(), 3);
            bVar3.k(similarRecycler.getId(), 4, 0, 4);
        } else {
            bVar3.k(getEndView().getId(), 4, 0, 4);
        }
        bVar3.b(this);
    }

    public final void Q4(Object obj) {
        a aVar = (a) obj;
        com.vk.libvideo.design.view.endview.a aVar2 = aVar.a;
        View.OnClickListener onClickListener = aVar.b;
        List<hfz> list = aVar.c;
        setOnClickListener(onClickListener);
        getEndView().setButtonsOnClickListener(onClickListener);
        getEndView().c(aVar2.c(), false);
        bwt0.p0(getEndView().d, false);
        if (this.u) {
            qul qulVar = this.z;
            if (qulVar != null) {
                qulVar.setItems(list);
            }
            if (qulVar != null) {
                qulVar.notifyDataSetChanged();
            }
            if (!list.isEmpty()) {
                cp2.c(getSimilarRecycler(), 100L, 0L, null, null, 14);
                return;
            }
            RecyclerView similarRecycler = getSimilarRecycler();
            if (similarRecycler != null) {
                f4m.j(similarRecycler);
            }
        }
    }
}
