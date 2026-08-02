package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.ColorProgressBar;
import com.vk.core.view.ProgressView;
import com.vk.stories.design.view.stickers.MetaHeaderLinearLayout;
import com.vk.stories.design.view.stickers.photo.PhotoWithCaptionViewGroup;
import com.vk.stories.design.view.stickers.post.PostAuthorView;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import xsna.bij;
import xsna.nov;
import xsna.q4g0;
import xsna.s4g0;

/* compiled from: ReplyVideoStickerRedesign.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class r4g0 extends nxt0 implements d7g0, bij, vps0 {
    public q4g0 f;
    public final p4g0 g;
    public final boolean h;
    public final View i;
    public final PostAuthorView j;
    public final TextView k;
    public final MetaHeaderLinearLayout l;
    public final TextView m;
    public final PhotoWithCaptionViewGroup n;
    public final ProgressView o;
    public final ColorProgressBar p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final Drawable u;
    public final AtomicBoolean v;
    public final CopyOnWriteArrayList<bij.a> w;
    public boolean x;

    /* compiled from: View.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            r4g0.this.p();
        }
    }

    public r4g0(Context context, q4g0 q4g0Var, p4g0 p4g0Var, boolean z) {
        super(context);
        int i;
        this.f = q4g0Var;
        this.g = p4g0Var;
        this.h = z;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_photo_redesign, (ViewGroup) null);
        this.i = inflate;
        PostAuthorView postAuthorView = (PostAuthorView) inflate.findViewById(R.id.photo_sticker_author);
        this.j = postAuthorView;
        this.k = (TextView) inflate.findViewById(R.id.post_sticker_text);
        this.l = (MetaHeaderLinearLayout) inflate.findViewById(R.id.meta_header);
        TextView textView = (TextView) inflate.findViewById(R.id.meta_author_name);
        this.m = textView;
        PostAuthorView postAuthorView2 = (PostAuthorView) inflate.findViewById(R.id.meta_subtitle);
        PhotoWithCaptionViewGroup photoWithCaptionViewGroup = (PhotoWithCaptionViewGroup) inflate.findViewById(R.id.photo_container);
        this.n = photoWithCaptionViewGroup;
        ProgressView progressView = (ProgressView) inflate.findViewById(R.id.determinate_progress);
        this.o = progressView;
        ColorProgressBar colorProgressBar = (ColorProgressBar) inflate.findViewById(R.id.indeterminate_progress);
        this.p = colorProgressBar;
        this.r = true;
        this.u = dhr0.w(R.drawable.bg_post_sticker, bwt0.u(context));
        this.v = new AtomicBoolean(false);
        this.w = new CopyOnWriteArrayList<>();
        q4g0.b bVar = this.f.a;
        if (bVar instanceof q4g0.b.C3548b) {
            i = R.id.story_video_sticker;
        } else {
            if (!(bVar instanceof q4g0.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.id.clip_sticker;
        }
        setId(i);
        ViewParent parent = p4g0Var.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(p4g0Var);
        }
        photoWithCaptionViewGroup.removeViewAt(0);
        photoWithCaptionViewGroup.addView(p4g0Var, 0);
        addView(inflate);
        s4g0 a2 = t4g0.a(this.f);
        textView.setText(a2.c);
        int i2 = a2.b;
        postAuthorView2.d(i2);
        ArrayList arrayList = a2.f;
        postAuthorView2.setAuthors(arrayList);
        postAuthorView.d(i2);
        postAuthorView.setAuthors(arrayList);
        s0w0 s0w0Var = new s0w0(10.0f, 6);
        progressView.setOutlineProvider(s0w0Var);
        progressView.setClipToOutline(true);
        colorProgressBar.setOutlineProvider(s0w0Var);
        colorProgressBar.setClipToOutline(true);
        o(a2);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new a());
        } else {
            p();
        }
        bwt0.Q(this, R.id.clip_sticker_style_auto_test, this.f.e.a.i());
    }

    private final int getAvailableHeight() {
        int i = a8c0.a;
        return a8c0.a(getParentHeight(), this.q);
    }

    private final int getAvailableWidth() {
        int i = a8c0.a;
        return a8c0.b(getParentWidth(), this.q);
    }

    private final int getParentHeight() {
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        return view != null ? view.getHeight() : Math.min(1920, iah0.p(getContext()));
    }

    private final int getParentWidth() {
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        return view != null ? view.getWidth() : Math.min(1080, iah0.z(getContext()));
    }

    private final void setContentDescription(s4g0 s4g0Var) {
        String string = getContext().getString(s4g0Var.g.a);
        String string2 = getContext().getString(s4g0Var.g.b);
        Context context = getContext();
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
        storiesFeatures.getClass();
        setContentDescription(context.getString(com.vk.toggle.b.A.a(storiesFeatures) ? R.string.repost_accessibility_text_without_style : R.string.repost_accessibility_text, string, ((u75) j5g.Y(s4g0Var.f)).a, string2));
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        WebStickerType webStickerType;
        Matrix stickerMatrix = getStickerMatrix();
        p4g0 p4g0Var = this.g;
        p4g0Var.setStickerMatrix(stickerMatrix);
        p4g0Var.getCommons().e(getCommons().b());
        p4g0Var.getCommons().a(getCommons().f());
        this.t = true;
        q4g0.b bVar = this.f.a;
        if (epx.f(bVar, q4g0.b.C3548b.a)) {
            webStickerType = WebStickerType.REPLY;
        } else {
            if (!(bVar instanceof q4g0.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            webStickerType = WebStickerType.CLIP;
        }
        float f = getContext().getResources().getDisplayMetrics().density;
        Bitmap createBitmap = Bitmap.createBitmap((int) (getWidth() * f), (int) (getHeight() * f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.scale(f, f);
        draw(canvas);
        l0u0 l0u0Var = new l0u0(createBitmap, getMeasuredWidth() * 2, webStickerType, "");
        l0u0Var.q = r4g0.class;
        l0u0Var.s = new gd40(this, 20);
        l0u0Var.t = this.f;
        this.t = false;
        nov.a.b(this, l0u0Var);
        return l0u0Var;
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        p4g0 p4g0Var = this.g;
        p4g0 p4g0Var2 = (p4g0) p4g0Var.E0(null);
        p4g0Var2.setStickerMatrix(getStickerMatrix());
        p4g0Var2.setDraw(p4g0Var.getDraw());
        p4g0Var2.setFullscreen(p4g0Var.C);
        p4g0Var2.setHasMusic(p4g0Var.getHasMusic());
        p4g0Var2.getCommons().e(getCommons().b());
        p4g0Var2.getCommons().a(getCommons().f());
        return super.E0(new r4g0(getContext(), this.f, p4g0Var2, false));
    }

    @Override // xsna.vps0
    public final void b() {
        this.g.b();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.g.setDraw(!this.t);
        this.l.setDraw(!this.t);
        super.draw(canvas);
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanRotate() {
        return !this.s;
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanScale() {
        return !this.s;
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanTranslateX() {
        return !this.s;
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanTranslateY() {
        return !this.s;
    }

    public final q4g0 getInfo() {
        return this.f;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return this.i.getMeasuredHeight();
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return this.i.getMeasuredWidth();
    }

    @Override // xsna.nxt0, xsna.nov
    public int getStickerLayerType() {
        return 3;
    }

    public final p4g0 getVideo() {
        return this.g;
    }

    @Override // xsna.bij
    public final boolean h() {
        return this.v.get();
    }

    @Override // xsna.bij
    public final void j(y76 y76Var) {
        if (this.v.get()) {
            y76Var.invoke();
        } else {
            this.w.add(y76Var);
        }
    }

    @Override // xsna.bij
    public final void k(y76 y76Var) {
        this.w.remove(y76Var);
    }

    public final void o(s4g0 s4g0Var) {
        setContentDescription(s4g0Var);
        boolean z = s4g0Var.a;
        this.q = z;
        this.n.setFullscreen(z);
        bwt0.p0(this.j, s4g0Var.d);
        bwt0.p0(this.l, z);
        s4g0.b bVar = s4g0Var.e;
        boolean z2 = bVar.c;
        View view = this.i;
        if (z2) {
            view.setBackground(this.u);
            f4m.v(iah0.a(12), view);
        } else {
            view.setBackground(null);
            f4m.v(0, view);
        }
        boolean z3 = bVar.b;
        TextView textView = this.k;
        if (!z3) {
            bwt0.p0(textView, false);
            return;
        }
        textView.setText(bVar.a);
        textView.setMaxLines(2);
        bwt0.p0(textView, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = this.h;
        View view = this.i;
        if (z2) {
            view.layout(0, 0, getWidth(), getHeight());
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    @Override // xsna.nxt0, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getAvailableWidth()), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getAvailableHeight()), Integer.MIN_VALUE);
        View view = this.i;
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void p() {
        setStickerScale(1.0f);
        float originalWidth = getOriginalWidth();
        float originalHeight = getOriginalHeight();
        if (originalWidth == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || originalHeight == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.i.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getAvailableWidth()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getAvailableHeight()), Integer.MIN_VALUE));
        nov.a.i(this, ((getParentWidth() / 2.0f) - (getOriginalWidth() / 2.0f)) - pov.e(getStickerMatrix()), ((getParentHeight() / 2.0f) - (getOriginalHeight() / 2.0f)) - pov.f(getStickerMatrix()));
    }

    public final void setDeterminateProgress(boolean z) {
        this.r = z;
        bwt0.p0(this.o, z);
        bwt0.p0(this.p, !z);
    }

    public final void setInfo(q4g0 q4g0Var) {
        this.f = q4g0Var;
    }

    public final void setLoadingProgress(int i) {
        this.o.setProgressValue(i);
    }

    public final void setLoadingVisible(boolean z) {
        boolean z2 = false;
        bwt0.p0(this.o, z && this.r);
        if (z && !this.r) {
            z2 = true;
        }
        bwt0.p0(this.p, z2);
    }

    public final void setMetaHeaderVisibility(boolean z) {
        this.l.animate().setDuration(195L).alpha((z && this.q) ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
    }

    @Override // xsna.nxt0, xsna.nov
    public void setRemovable(boolean z) {
        this.x = z;
    }

    @Override // xsna.nxt0, xsna.nov
    public final boolean v0() {
        return this.x;
    }

    @Override // xsna.nxt0, xsna.nov
    public final void x0(RectF rectF, float f, float f2) {
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
    }
}
