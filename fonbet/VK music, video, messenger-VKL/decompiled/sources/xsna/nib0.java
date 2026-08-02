package xsna;

import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import xsna.k840;

/* compiled from: PodcastPlaybackSpeedBottomSheetContentView.kt */
/* loaded from: classes3.dex */
public final class nib0 extends LinearLayout {
    public final TextView b;
    public final RecyclerView c;
    public final androidx.recyclerview.widget.w d;
    public int e;
    public final StringBuffer f;
    public final FieldPosition g;
    public final DecimalFormat h;
    public final GradientDrawable i;
    public final GradientDrawable j;
    public final baf0 k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public boolean p;
    public final io.reactivex.rxjava3.disposables.b q;
    public final u2b0 r;
    public final LinearLayoutManager s;
    public final mib0 t;

    public nib0(ContextWrapper contextWrapper) {
        super(contextWrapper, null, 0);
        this.d = new androidx.recyclerview.widget.w();
        this.e = -1;
        this.f = new StringBuffer();
        this.g = new FieldPosition(0);
        this.h = new DecimalFormat("#.#");
        this.l = e3m.a(R.dimen.music_podcasts_speed_handler_width, contextWrapper);
        this.m = e3m.a(R.dimen.music_podcasts_speed_handler_height, contextWrapper);
        this.n = e3m.a(R.dimen.music_podcasts_speed_item_width, contextWrapper);
        float f = iah0.f().density * 4.0f;
        this.o = Math.round(f) != ((int) Math.floor((double) f));
        this.q = new io.reactivex.rxjava3.disposables.b();
        this.r = k840.a.g().b();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.s = linearLayoutManager;
        mib0 mib0Var = new mib0(this);
        this.t = mib0Var;
        LayoutInflater.from(contextWrapper).inflate(R.layout.music_podcast_playback_speed, this);
        setOrientation(1);
        setDuplicateParentStateEnabled(false);
        this.b = (TextView) findViewById(R.id.value);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.controls);
        this.c = recyclerView;
        recyclerView.setAdapter(new pya0(new d410(this, 20)));
        recyclerView.setLayoutManager(linearLayoutManager);
        bwt0.V(this, new da50(this, 12));
        recyclerView.addOnScrollListener(mib0Var);
        dhr0.a.getClass();
        int[] iArr = {dhr0.f.a(R.attr.vk_ui_background_modal, contextWrapper), 0};
        this.i = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, iArr);
        this.j = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, iArr);
        this.k = dhr0.t.b(R.drawable.music_podcast_speed_handler, R.attr.vk_ui_icon_accent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSnapPosition() {
        View findSnapView;
        RecyclerView.o layoutManager = this.c.getLayoutManager();
        if (layoutManager == null || (findSnapView = this.d.findSnapView(layoutManager)) == null) {
            return -1;
        }
        return layoutManager.getPosition(findSnapView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        RecyclerView recyclerView = this.c;
        int left = recyclerView.getLeft();
        int top = recyclerView.getTop();
        int right = recyclerView.getRight();
        int bottom = recyclerView.getBottom();
        int paddingLeft = recyclerView.getPaddingLeft() + left;
        GradientDrawable gradientDrawable = this.i;
        gradientDrawable.setBounds(left, top, paddingLeft, bottom);
        gradientDrawable.draw(canvas);
        int paddingRight = right - recyclerView.getPaddingRight();
        GradientDrawable gradientDrawable2 = this.j;
        gradientDrawable2.setBounds(paddingRight, top, right, bottom);
        gradientDrawable2.draw(canvas);
        int i = top + (this.o ? 1 : 0);
        int i2 = this.l;
        int round = Math.round((right - i2) / 2.0f);
        int i3 = this.m + i;
        baf0 baf0Var = this.k;
        baf0Var.setBounds(round, i, i2 + round, i3);
        baf0Var.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.q.dispose();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth() / 2;
        RecyclerView recyclerView = this.c;
        if (measuredWidth == recyclerView.getPaddingLeft() && measuredWidth == recyclerView.getPaddingRight()) {
            return;
        }
        recyclerView.setPadding(measuredWidth, 0, measuredWidth, 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int snapPosition = getSnapPosition();
        if (snapPosition >= 0) {
            mib0 mib0Var = this.t;
            RecyclerView recyclerView = this.c;
            recyclerView.removeOnScrollListener(mib0Var);
            bwt0.V(recyclerView, new kor(this, snapPosition, 2));
        }
        super.onSizeChanged(i, i2, i3, i4);
    }
}
