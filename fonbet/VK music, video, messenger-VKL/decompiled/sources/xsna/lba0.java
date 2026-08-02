package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.imageloader.view.VKImageView;
import com.vk.stories.design.view.stickers.MetaHeaderLinearLayout;
import com.vk.stories.design.view.stickers.photo.PhotoWithCaptionViewGroup;
import com.vk.stories.design.view.stickers.post.PostAuthorView;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.bij;
import xsna.f5h0;
import xsna.nov;

/* compiled from: PhotoStickerRedesign.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class lba0 extends nxt0 implements d7g0, bij {
    public kba0 f;
    public final boolean g;
    public final View h;
    public final VKImageView i;
    public final PostAuthorView j;
    public final MetaHeaderLinearLayout k;
    public final TextView l;
    public final PostAuthorView m;
    public final PhotoWithCaptionViewGroup n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final AtomicBoolean t;
    public final CopyOnWriteArrayList<bij.a> u;

    /* compiled from: View.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            lba0.this.q();
        }
    }

    public lba0(Context context, kba0 kba0Var, boolean z) {
        super(context);
        this.f = kba0Var;
        this.g = z;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_photo_redesign_new, (ViewGroup) null);
        this.h = inflate;
        this.i = (VKImageView) inflate.findViewById(R.id.photo);
        this.j = (PostAuthorView) inflate.findViewById(R.id.photo_sticker_author);
        this.k = (MetaHeaderLinearLayout) inflate.findViewById(R.id.meta_header);
        this.l = (TextView) inflate.findViewById(R.id.meta_author_name);
        this.m = (PostAuthorView) inflate.findViewById(R.id.meta_subtitle);
        this.n = (PhotoWithCaptionViewGroup) inflate.findViewById(R.id.photo_container);
        this.t = new AtomicBoolean(false);
        this.u = new CopyOnWriteArrayList<>();
        addView(inflate);
        mba0 a2 = nba0.a(context, this.f);
        p(a2);
        o(a2);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new a());
        } else {
            q();
        }
    }

    private final int getAvailableHeight() {
        int i = a8c0.a;
        return a8c0.a(getParentHeight(), this.o);
    }

    private final int getAvailableWidth() {
        int i = a8c0.a;
        return a8c0.b(getParentWidth(), this.o);
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

    private final void setContentDescription(mba0 mba0Var) {
        String string = getContext().getString(mba0Var.h.a);
        String string2 = getContext().getString(mba0Var.h.b);
        Context context = getContext();
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
        storiesFeatures.getClass();
        setContentDescription(context.getString(com.vk.toggle.b.A.a(storiesFeatures) ? R.string.repost_accessibility_text_without_style : R.string.repost_accessibility_text, string, ((u75) j5g.Y(mba0Var.g)).a, string2));
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        this.q = true;
        float f = getContext().getResources().getDisplayMetrics().density;
        Bitmap createBitmap = Bitmap.createBitmap((int) (getWidth() * f), (int) (getHeight() * f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.scale(f, f);
        draw(canvas);
        l0u0 l0u0Var = new l0u0(createBitmap, getMeasuredWidth() * 2, this.f.e ? WebStickerType.REPLY : WebStickerType.PHOTO, "");
        kba0 kba0Var = this.f;
        l0u0Var.q = kba0Var.e ? g4g0.class : lba0.class;
        l0u0Var.s = new s6y(this, 22);
        l0u0Var.t = kba0Var;
        this.q = false;
        nov.a.b(this, l0u0Var);
        return l0u0Var;
    }

    @Override // xsna.nxt0, xsna.nov
    public nov E0(nov novVar) {
        if (novVar == null) {
            novVar = new lba0(getContext(), this.f, false);
        }
        return super.E0(novVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.k.setDraw(!this.q);
        super.draw(canvas);
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanRotate() {
        return !this.p;
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanScale() {
        return !this.p;
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanTranslateX() {
        return !this.p;
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanTranslateY() {
        return !this.p;
    }

    public final boolean getFromSharing() {
        return this.s;
    }

    public final kba0 getInfo() {
        return this.f;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return this.h.getMeasuredHeight();
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return this.h.getMeasuredWidth();
    }

    @Override // xsna.nxt0, xsna.nov
    public int getStickerLayerType() {
        return 3;
    }

    @Override // xsna.bij
    public final boolean h() {
        return this.t.get();
    }

    @Override // xsna.bij
    public final void j(y76 y76Var) {
        if (this.t.get()) {
            y76Var.invoke();
        } else {
            this.u.add(y76Var);
        }
    }

    @Override // xsna.bij
    public final void k(y76 y76Var) {
        this.u.remove(y76Var);
    }

    public final void o(mba0 mba0Var) {
        setContentDescription(mba0Var);
        boolean z = mba0Var.a;
        this.o = z;
        this.n.setFullscreen(z);
        bwt0.p0(this.j, mba0Var.e);
        bwt0.p0(this.k, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = this.g;
        View view = this.h;
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
        View view = this.h;
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void p(mba0 mba0Var) {
        this.l.setText(mba0Var.d);
        int i = mba0Var.c;
        PostAuthorView postAuthorView = this.m;
        postAuthorView.d(i);
        List<u75> list = mba0Var.g;
        postAuthorView.setAuthors(list);
        float f = mba0Var.b;
        VKImageView vKImageView = this.i;
        vKImageView.setAspectRatio(f);
        vKImageView.setActualScaleType(f5h0.f.a);
        vKImageView.getHierarchy().q(0);
        vKImageView.setDontLoadAgainIfSameResource(true);
        vKImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        StoryAttachImageView storyAttachImageView = vKImageView instanceof StoryAttachImageView ? (StoryAttachImageView) vKImageView : null;
        if (storyAttachImageView != null) {
            storyAttachImageView.setImageCornerRadius(cn70.c(16));
            storyAttachImageView.T0(mba0Var.f);
            storyAttachImageView.setOnBindCompleted(new e550(this, 6));
        }
        vKImageView.getHierarchy().u(RoundingParams.b(cn70.c(16)));
        PostAuthorView postAuthorView2 = this.j;
        postAuthorView2.d(i);
        postAuthorView2.setAuthors(list);
    }

    public final void q() {
        setStickerScale(1.0f);
        float originalWidth = getOriginalWidth();
        float originalHeight = getOriginalHeight();
        if (originalWidth == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || originalHeight == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.h.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getAvailableWidth()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getAvailableHeight()), Integer.MIN_VALUE));
        nov.a.i(this, ((getParentWidth() / 2.0f) - (getOriginalWidth() / 2.0f)) - pov.e(getStickerMatrix()), ((getParentHeight() / 2.0f) - (getOriginalHeight() / 2.0f)) - pov.f(getStickerMatrix()));
    }

    public final void setFromSharing(boolean z) {
        this.s = z;
    }

    public final void setInfo(kba0 kba0Var) {
        this.f = kba0Var;
    }

    public final void setMetaHeaderVisibility(boolean z) {
        this.k.animate().setDuration(195L).alpha((z && this.o) ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
    }

    @Override // xsna.nxt0, xsna.nov
    public void setRemovable(boolean z) {
        this.r = z;
    }

    @Override // xsna.nxt0, xsna.nov
    public final boolean v0() {
        return this.r;
    }
}
