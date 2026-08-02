package xsna;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkPicture;
import com.vkontakte.android.R;

/* compiled from: NowView.kt */
/* loaded from: classes16.dex */
public final class pl70 extends FrameLayout implements il70 {
    public RecyclerView b;
    public hl70 c;
    public final VkPicture d;
    public FrameLayout e;
    public io.reactivex.rxjava3.disposables.c f;
    public boolean g;
    public final Rect h;
    public Animator i;

    public pl70(Context context) {
        super(context, null, 0);
        this.g = true;
        this.h = new Rect();
        LayoutInflater.from(getContext()).inflate(R.layout.live_now_view, (ViewGroup) this, true);
        this.b = (RecyclerView) findViewById(R.id.live_now_recycler);
        VkPicture vkPicture = (VkPicture) findViewById(R.id.live_now_button);
        this.d = vkPicture;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.live_now_holder);
        this.e = frameLayout;
        frameLayout.setVisibility(4);
        this.b.setClipChildren(true);
        this.e.setClipChildren(true);
        this.b.setHorizontalFadingEdgeEnabled(true);
        setClipChildren(true);
        this.b.getViewTreeObserver().addOnPreDrawListener(new ml70(this));
        vkPicture.setOnClickListener(new u01(this, 8));
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.setOrientation(0);
        this.b.setLayoutManager(linearLayoutManager);
        this.b.addOnScrollListener(new ol70(this));
    }

    public final Rect getClipRect() {
        return this.h;
    }

    @Override // xsna.il70
    public boolean getExpanded() {
        return this.g;
    }

    public final FrameLayout getHolder() {
        return this.e;
    }

    public final RecyclerView getRecycler() {
        return this.b;
    }

    public final io.reactivex.rxjava3.disposables.c getScrollToStartDisposable() {
        return this.f;
    }

    public final Animator getVa() {
        return this.i;
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.il70
    public final void p4(int i) {
        pro0.c(new ja70(i, this));
    }

    @Override // xsna.rr6
    public final void release() {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public void setExpanded(boolean z) {
        this.g = z;
    }

    public final void setHolder(FrameLayout frameLayout) {
        this.e = frameLayout;
    }

    public final void setRecycler(RecyclerView recyclerView) {
        this.b = recyclerView;
    }

    public final void setScrollToStartDisposable(io.reactivex.rxjava3.disposables.c cVar) {
        this.f = cVar;
    }

    public final void setVa(Animator animator) {
        this.i = animator;
    }

    @Override // xsna.il70
    public void setupAdapter(RecyclerView.Adapter<RecyclerView.e0> adapter) {
        this.b.setAdapter(adapter);
    }

    @Override // xsna.rr6
    public hl70 getPresenter() {
        return this.c;
    }

    @Override // xsna.rr6
    public void setPresenter(hl70 hl70Var) {
        this.c = hl70Var;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.rr6
    public final void pause() {
    }

    @Override // xsna.rr6
    public final void resume() {
    }
}
