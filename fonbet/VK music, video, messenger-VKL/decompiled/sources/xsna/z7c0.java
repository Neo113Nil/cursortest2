package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.stickers.MetaHeaderLinearLayout;
import com.vk.stories.design.view.stickers.photo.PhotoWithCaptionViewGroup;
import com.vk.stories.design.view.stickers.post.PostAuthorView;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.bij;
import xsna.e8c0;
import xsna.nov;
import xsna.u7c0;

/* compiled from: PostStickerRedesign.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class z7c0 extends nxt0 implements p7c0, d7g0, bij {
    public int A;
    public u7c0 f;
    public final boolean g;
    public final gzs<s3q0> h;
    public final View i;
    public final ViewGroup j;
    public final PostAuthorView k;
    public final TextView l;
    public final MetaHeaderLinearLayout m;
    public final TextView n;
    public final PhotoWithCaptionViewGroup o;
    public final Drawable p;
    public final i0c0 q;
    public final n0c0 r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final AtomicBoolean v;
    public final CopyOnWriteArrayList<bij.a> w;
    public String x;
    public Bitmap y;
    public boolean z;

    public z7c0() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7c0(Context context, u7c0 u7c0Var, gzs gzsVar, int i) {
        super(context);
        boolean z = (i & 4) == 0;
        gzsVar = (i & 8) != 0 ? new a44(28) : gzsVar;
        this.f = u7c0Var;
        this.g = z;
        this.h = gzsVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_post_redesign, (ViewGroup) null);
        this.i = inflate;
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.post_sticker_attachment_container);
        this.j = viewGroup;
        PostAuthorView postAuthorView = (PostAuthorView) inflate.findViewById(R.id.post_sticker_author);
        this.k = postAuthorView;
        TextView textView = (TextView) inflate.findViewById(R.id.post_sticker_text);
        this.l = textView;
        this.m = (MetaHeaderLinearLayout) inflate.findViewById(R.id.meta_header);
        TextView textView2 = (TextView) inflate.findViewById(R.id.meta_author_name);
        this.n = textView2;
        PostAuthorView postAuthorView2 = (PostAuthorView) inflate.findViewById(R.id.meta_subtitle);
        PhotoWithCaptionViewGroup photoWithCaptionViewGroup = (PhotoWithCaptionViewGroup) inflate.findViewById(R.id.post_container);
        this.o = photoWithCaptionViewGroup;
        this.p = dhr0.w(R.drawable.bg_post_sticker, bwt0.u(context));
        i0c0 i0c0Var = new i0c0();
        this.q = i0c0Var;
        this.r = new n0c0(i0c0Var);
        this.v = new AtomicBoolean(false);
        this.w = new CopyOnWriteArrayList<>();
        this.A = 255;
        setId(R.id.post_sticker);
        addView(inflate);
        e8c0 a = d8c0.a(this.f);
        e8c0.c cVar = a.b;
        int i2 = cVar.c;
        postAuthorView.d(i2);
        ArrayList arrayList = cVar.b;
        postAuthorView.setAuthors(arrayList);
        textView2.setText(((u75) j5g.Y(arrayList)).a);
        postAuthorView2.d(i2);
        postAuthorView2.setAuthors(arrayList);
        e8c0.e eVar = a.c;
        boolean z2 = eVar.d;
        CharSequence charSequence = eVar.a;
        photoWithCaptionViewGroup.setOnlyText(z2);
        if (z2) {
            bwt0.p0(textView, false);
            TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.sticker_post_redesign_only_text, (ViewGroup) null);
            textView3.setText(charSequence);
            textView3.setMaxLines(eVar.b);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (textView3.isLaidOut()) {
                getOnBindCompleted().invoke();
            } else {
                textView3.addOnLayoutChangeListener(new x7c0(this));
            }
            viewGroup.addView(textView3);
        } else {
            bwt0.p0(textView, true);
            textView.setText(charSequence);
        }
        o(a);
        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
        if (isLaidOut()) {
            q();
        } else {
            addOnLayoutChangeListener(new y7c0(this));
        }
    }

    private final int getAvailableHeight() {
        int i = a8c0.a;
        return a8c0.a(getParentHeight(), this.s);
    }

    private final int getAvailableWidth() {
        int i = a8c0.a;
        return a8c0.b(getParentWidth(), this.s);
    }

    private final int getParentHeight() {
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        return view != null ? view.getHeight() : iah0.p(getContext());
    }

    private final int getParentWidth() {
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        return view != null ? view.getWidth() : iah0.z(getContext());
    }

    private final void setContentDescription(e8c0 e8c0Var) {
        String string = getContext().getString(e8c0Var.e.a);
        String string2 = getContext().getString(e8c0Var.e.b);
        Context context = getContext();
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
        storiesFeatures.getClass();
        setContentDescription(context.getString(com.vk.toggle.b.A.a(storiesFeatures) ? R.string.repost_accessibility_text_without_style : R.string.repost_accessibility_text, string, ((u75) j5g.Y(e8c0Var.b.b)).a, string2));
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        this.u = true;
        WebStickerType stickerTypeForRendering = getStickerTypeForRendering();
        Class<? extends nov> stickerCreatorForRendering = getStickerCreatorForRendering();
        float f = getContext().getResources().getDisplayMetrics().density;
        Bitmap createBitmap = Bitmap.createBitmap((int) (getWidth() * f), (int) (getHeight() * f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.scale(f, f);
        draw(canvas);
        l0u0 l0u0Var = new l0u0(createBitmap, getMeasuredWidth() * 2, stickerTypeForRendering, "");
        l0u0Var.q = stickerCreatorForRendering;
        l0u0Var.s = new so40(this, 13);
        l0u0Var.t = this.f;
        this.u = false;
        nov.a.b(this, l0u0Var);
        return l0u0Var;
    }

    @Override // xsna.nxt0, xsna.nov
    public nov E0(nov novVar) {
        if (novVar == null) {
            novVar = new z7c0(getContext(), this.f, null, 12);
        }
        return super.E0(novVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.m.setDraw(!this.u);
        super.draw(canvas);
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanRotate() {
        return !this.t;
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanScale() {
        return !this.t;
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanTranslateX() {
        return !this.t;
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanTranslateY() {
        return !this.t;
    }

    public Bitmap getContentImageBitmap() {
        return this.y;
    }

    @Override // xsna.p7c0
    public String getContentImageUrl() {
        return this.x;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMaxScaleLimit() {
        return 1.5f;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMinScaleLimit() {
        return 0.3f;
    }

    public gzs<s3q0> getOnBindCompleted() {
        return this.h;
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
    public int getStickerAlpha() {
        return this.A;
    }

    public Class<? extends nov> getStickerCreatorForRendering() {
        return z7c0.class;
    }

    public final u7c0 getStickerInfo() {
        return this.f;
    }

    @Override // xsna.nxt0, xsna.nov
    public int getStickerLayerType() {
        return 3;
    }

    public WebStickerType getStickerTypeForRendering() {
        return WebStickerType.POST;
    }

    @Override // xsna.bij
    public final boolean h() {
        return this.v.get();
    }

    @Override // xsna.p7c0
    public final void i() {
        n0c0 n0c0Var = this.r;
        n0c0Var.a.clear();
        n0c0Var.b.clear();
        n0c0Var.c.clear();
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

    @Override // xsna.v4l0
    public final u7c0 m() {
        return this.f;
    }

    public final void o(e8c0 e8c0Var) {
        setContentDescription(e8c0Var);
        e8c0.d dVar = e8c0Var.a;
        q7c0 q7c0Var = e8c0Var.d.a;
        this.s = dVar.c;
        e8c0.c cVar = e8c0Var.b;
        boolean z = cVar.a;
        PostAuthorView postAuthorView = this.k;
        bwt0.p0(postAuthorView, z);
        postAuthorView.setAuthors(cVar.b);
        e8c0.e eVar = e8c0Var.c;
        boolean z2 = eVar.d;
        TextView textView = this.l;
        if (z2) {
            p();
            bwt0.p0(textView, false);
        } else {
            textView.setText(eVar.a);
            textView.setMaxLines(eVar.b);
            bwt0.p0(textView, eVar.c);
        }
        View a = this.r.a(this.f, q7c0Var, false, new w7c0(this, new jw30(this, 15)));
        if (a != null) {
            ViewGroup viewGroup = this.j;
            if (s101.r(viewGroup)) {
                viewGroup.removeAllViews();
                viewGroup.addView(a);
            } else {
                viewGroup.addView(a);
            }
        }
        bwt0.p0(this.m, dVar.c);
        int i = dVar.b;
        View view = this.i;
        f4m.v(i, view);
        if (dVar.a) {
            view.setBackground(this.p);
        } else {
            view.setBackground(null);
        }
        Context h = this.f.j.a.h();
        int i2 = a8c0.a;
        int maxScaleLimit = (int) (1080 * getMaxScaleLimit());
        u7c0.a aVar = this.f.g;
        this.q.getClass();
        setContentImageUrl(i0c0.a(h, q7c0Var, aVar, maxScaleLimit));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = this.g;
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
        this.v.set(true);
        CopyOnWriteArrayList<bij.a> copyOnWriteArrayList = this.w;
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((bij.a) it.next()).invoke();
        }
        copyOnWriteArrayList.clear();
        getOnBindCompleted().invoke();
    }

    public final void q() {
        setStickerScale(1.0f);
        float originalWidth = getOriginalWidth();
        float originalHeight = getOriginalHeight();
        if (originalWidth == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || originalHeight == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.i.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getAvailableWidth()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getAvailableHeight()), Integer.MIN_VALUE));
        nov.a.i(this, ((getParentWidth() / 2.0f) - (getOriginalWidth() / 2.0f)) - pov.e(getStickerMatrix()), ((getParentHeight() / 2.0f) - (getOriginalHeight() / 2.0f)) - pov.f(getStickerMatrix()));
    }

    @Override // xsna.p7c0
    public void setContentImageBitmap(Bitmap bitmap) {
        this.y = bitmap;
        u7c0 u7c0Var = this.f;
        u7c0.d dVar = u7c0Var.f;
        if (dVar != null) {
            dVar.d.e = bitmap;
        }
        u7c0Var.g.e = bitmap;
        o(d8c0.a(u7c0Var));
        q();
    }

    public void setContentImageUrl(String str) {
        this.x = str;
    }

    public final void setMetaHeaderVisibility(boolean z) {
        this.m.animate().setDuration(195L).alpha((z && this.s) ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
    }

    @Override // xsna.nxt0, xsna.nov
    public void setRemovable(boolean z) {
        this.z = z;
    }

    @Override // xsna.nxt0, xsna.nov
    public void setStickerAlpha(int i) {
        this.i.setAlpha(i / 255.0f);
        this.A = i;
    }

    public final void setStickerInfo(u7c0 u7c0Var) {
        this.f = u7c0Var;
    }

    @Override // xsna.v4l0
    public final void update(u7c0 u7c0Var) {
        u7c0 u7c0Var2 = u7c0Var;
        this.f = u7c0Var2;
        e8c0 a = d8c0.a(u7c0Var2);
        this.o.setFullscreen(a.a.c);
        o(a);
        this.t = false;
        q();
        xaq.a(this, new k7z(this, 24));
    }

    @Override // xsna.nxt0, xsna.nov
    public final boolean v0() {
        return this.z;
    }
}
