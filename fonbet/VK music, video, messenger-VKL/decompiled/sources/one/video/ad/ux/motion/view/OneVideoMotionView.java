package one.video.ad.ux.motion.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.ad.ux.motion.view.util.VideoMotionLayoutManager;
import xsna.ba30;
import xsna.sws0;
import xsna.tws0;
import xsna.x5r0;
import xsna.xws0;
import xsna.zjw;

/* compiled from: OneVideoMotionView.kt */
/* loaded from: classes8.dex */
public final class OneVideoMotionView extends ConstraintLayout {
    public final ProgressBar A;
    public final tws0 B;
    public final VideoMotionLayoutManager C;
    public zjw D;
    public sws0 E;
    public boolean F;
    public final int t;
    public final int u;
    public final int v;
    public final RecyclerView w;
    public final View x;
    public final View y;
    public final OneVideoMotionHeaderView z;

    /* compiled from: OneVideoMotionView.kt */
    public final class a implements xws0 {
        public a() {
        }

        @Override // xsna.xws0
        public final sws0 a() {
            return OneVideoMotionView.this.getController();
        }

        @Override // xsna.xws0
        public final zjw b() {
            return OneVideoMotionView.this.getImageLoader();
        }
    }

    public OneVideoMotionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.one_video_motion_view, (ViewGroup) this, true);
        this.t = R.id.video_motion_header_place_view;
        this.u = R.id.video_motion_footer_place_view;
        this.v = R.id.video_motion_header_view;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.video_motion_recycler_view);
        this.w = recyclerView;
        this.x = findViewById(R.id.video_motion_header_place_view);
        this.y = findViewById(R.id.video_motion_footer_place_view);
        OneVideoMotionHeaderView oneVideoMotionHeaderView = (OneVideoMotionHeaderView) findViewById(R.id.video_motion_header_view);
        this.z = oneVideoMotionHeaderView;
        this.A = (ProgressBar) findViewById(R.id.video_motion_progress_view);
        a aVar = new a();
        tws0 tws0Var = new tws0(aVar);
        this.B = tws0Var;
        VideoMotionLayoutManager videoMotionLayoutManager = new VideoMotionLayoutManager(0, false);
        this.C = videoMotionLayoutManager;
        setBackgroundColor(context.getColor(R.color.one_video_black));
        setClickable(true);
        setFocusable(true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(videoMotionLayoutManager);
        recyclerView.setAdapter(tws0Var);
        oneVideoMotionHeaderView.setProvider(aVar);
        Q4();
        P4();
    }

    private final int getFooterHeight() {
        Object obj = x5r0.a;
        return (int) x5r0.a(this.F ? 56 : 36, 1);
    }

    private final int getHeaderHeight() {
        Object obj = x5r0.a;
        return (int) x5r0.a(this.F ? 64 : 1, 1);
    }

    public final void P4() {
        View view = this.y;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = getFooterHeight();
        view.setLayoutParams(layoutParams);
        View view2 = this.x;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        layoutParams2.height = getHeaderHeight();
        view2.setLayoutParams(layoutParams2);
        int i = this.F ? this.t : this.u;
        b bVar = new b();
        bVar.i(this);
        int i2 = this.v;
        bVar.k(i2, 3, i, 3);
        bVar.k(i2, 6, i, 6);
        bVar.k(i2, 4, i, 4);
        bVar.k(i2, 7, i, 7);
        bVar.b(this);
    }

    public final void Q4() {
        Object obj = x5r0.a;
        int a2 = (int) x5r0.a(this.F ? 16 : 12, 1);
        int a3 = (int) x5r0.a(this.F ? 8 : 6, 1);
        this.w.setPadding(a3, a2, a3, a2);
    }

    public final void T4(ba30 ba30Var) {
        List list;
        if (ba30Var == null || (list = ba30Var.e) == null) {
            list = EmptyList.b;
        }
        this.B.submitList(list);
        int i = ba30Var != null ? ba30Var.b : 0;
        ProgressBar progressBar = this.A;
        progressBar.setMax(i);
        progressBar.setProgress(ba30Var != null ? ba30Var.c : 0);
        this.z.Q4(ba30Var != null ? ba30Var.d : null);
    }

    public final sws0 getController() {
        return this.E;
    }

    public final zjw getImageLoader() {
        return this.D;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        RecyclerView recyclerView = this.w;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.width = size;
        Object obj = x5r0.a;
        layoutParams.height = Math.min(recyclerView.getPaddingBottom() + recyclerView.getPaddingTop() + ((int) x5r0.a(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 1)) + ((int) x5r0.a(this.F ? 56 : 20, 1)), size2 - (this.F ? getHeaderHeight() + getFooterHeight() : getFooterHeight()));
        recyclerView.setLayoutParams(layoutParams);
        super.onMeasure(i, i2);
    }

    public final void setController(sws0 sws0Var) {
        this.E = sws0Var;
    }

    public final void setFullscreen(boolean z) {
        if (this.F == z) {
            return;
        }
        this.F = z;
        Q4();
        P4();
        this.C.r = z;
        tws0 tws0Var = this.B;
        if (tws0Var.d != z) {
            tws0Var.d = z;
            tws0Var.notifyDataSetChanged();
        }
        this.z.setFullscreen(z);
    }

    public final void setImageLoader(zjw zjwVar) {
        this.D = zjwVar;
    }
}
