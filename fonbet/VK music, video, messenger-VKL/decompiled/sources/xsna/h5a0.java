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
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.dto.common.restrictions.Restriction;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.api.models.AlbumStickerStyle;
import com.vk.stories.design.view.stickers.post.PostAuthorView;
import com.vk.stories.design.view.stickers.post.RoundedFrameLayout;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.i5a0;
import xsna.nov;

/* compiled from: PhotoAlbumSticker.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class h5a0 extends nxt0 implements v4l0, d7g0 {
    public static final int r = iah0.a(36);
    public i5a0 f;
    public final boolean g;
    public final View h;
    public final StoryAttachImageView i;
    public final VKImageView j;
    public final TextView k;
    public final ImageView l;
    public final PostAuthorView m;
    public final Drawable n;
    public final jwx o;
    public boolean p;
    public int q;

    /* compiled from: PhotoAlbumSticker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlbumStickerStyle.values().length];
            try {
                iArr[AlbumStickerStyle.Miniature.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlbumStickerStyle.Preview.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            h5a0.this.o();
        }
    }

    public h5a0(Context context, i5a0 i5a0Var, boolean z) {
        super(context);
        this.f = i5a0Var;
        this.g = z;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_photo_album, (ViewGroup) null);
        this.h = inflate;
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) inflate.findViewById(R.id.image_container);
        StoryAttachImageView storyAttachImageView = (StoryAttachImageView) inflate.findViewById(R.id.cover_image);
        this.i = storyAttachImageView;
        this.j = (VKImageView) inflate.findViewById(R.id.restriction_icon);
        this.k = (TextView) inflate.findViewById(R.id.restriction_text);
        this.l = (ImageView) inflate.findViewById(R.id.multiple_photos_indicator);
        this.m = (PostAuthorView) inflate.findViewById(R.id.album_owner);
        this.n = dhr0.w(R.drawable.bg_post_sticker, bwt0.u(context));
        this.o = new jwx(5, 60);
        this.q = 255;
        setId(R.id.story_photo_album_sticker);
        roundedFrameLayout.setCornerRadius(iah0.b(16.0f));
        storyAttachImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        storyAttachImageView.getHierarchy().u(RoundingParams.b(iah0.b(16.0f)));
        storyAttachImageView.getHierarchy().q(0);
        addView(inflate);
        p(this.f, true);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (isLaidOut()) {
            o();
        } else {
            addOnLayoutChangeListener(new b());
        }
    }

    private final int getAvailableHeight() {
        return (int) (iah0.p(getContext()) * 0.75d);
    }

    private final int getAvailableWidth() {
        return (int) (iah0.z(getContext()) * 0.75d);
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

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
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
        l0u0Var.s = new rf20(this, 9);
        l0u0Var.t = this.f;
        nov.a.b(this, l0u0Var);
        return l0u0Var;
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new h5a0(getContext(), this.f, false));
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMaxScaleLimit() {
        return 1.5f;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMinScaleLimit() {
        return 0.3f;
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
    public int getStickerAlpha() {
        return this.q;
    }

    public final Class<? extends nov> getStickerCreatorForRendering() {
        return h5a0.class;
    }

    public final i5a0 getStickerInfo() {
        return this.f;
    }

    @Override // xsna.nxt0, xsna.nov
    public int getStickerLayerType() {
        return 3;
    }

    public final WebStickerType getStickerTypeForRendering() {
        return WebStickerType.PHOTO_ALBUM;
    }

    @Override // xsna.v4l0
    public final Object m() {
        return this.f;
    }

    public final void o() {
        setStickerScale(1.0f);
        float originalWidth = getOriginalWidth();
        float originalHeight = getOriginalHeight();
        if (originalWidth == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || originalHeight == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.h.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getAvailableWidth()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getAvailableHeight()), Integer.MIN_VALUE));
        nov.a.i(this, ((getParentWidth() / 2.0f) - (getOriginalWidth() / 2.0f)) - pov.e(getStickerMatrix()), ((getParentHeight() / 2.0f) - (getOriginalHeight() / 2.0f)) - pov.f(getStickerMatrix()));
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

    public final void p(i5a0 i5a0Var, boolean z) {
        int i;
        String str = i5a0Var.f;
        this.f = i5a0Var;
        String string = getContext().getString(R.string.accessibility_album);
        Context context = getContext();
        i5a0.a aVar = i5a0Var.i;
        AlbumStickerStyle albumStickerStyle = aVar.a;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[albumStickerStyle.ordinal()];
        if (i2 == 1) {
            i = R.string.repost_style_miniature;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.repost_style_preview;
        }
        String string2 = context.getString(i);
        Context context2 = getContext();
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
        storiesFeatures.getClass();
        setContentDescription(context2.getString(com.vk.toggle.b.A.a(storiesFeatures) ? R.string.repost_accessibility_text_without_style : R.string.repost_accessibility_text, string, str, string2));
        float f = i5a0Var.d;
        StoryAttachImageView storyAttachImageView = this.i;
        storyAttachImageView.setAspectRatio(f);
        Restriction restriction = i5a0Var.h;
        VKImageView vKImageView = this.j;
        TextView textView = this.k;
        if (restriction != null) {
            egi.f(vKImageView, r, restriction);
            textView.setText(restriction.b);
            textView.setVisibility(0);
            vKImageView.setVisibility(0);
            storyAttachImageView.setPostprocessor(this.o);
        } else {
            vKImageView.setVisibility(8);
            textView.setVisibility(8);
            textView.setText("");
            storyAttachImageView.setPostprocessor(null);
        }
        storyAttachImageView.T0(i5a0Var.c);
        PostAuthorView postAuthorView = this.m;
        postAuthorView.d(R.string.sticker_type_prefix_album);
        postAuthorView.setAuthors(Collections.singletonList(new u75(i5a0Var.g, str)));
        postAuthorView.setVisibility(!drm0.N(str) ? 0 : 8);
        int i3 = iArr[aVar.a.ordinal()];
        View view = this.h;
        if (i3 == 1) {
            view.setBackground(this.n);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            view.setBackground(null);
        }
        this.l.setVisibility(i5a0Var.e > 1 ? 0 : 8);
        o();
        if (z) {
            xaq.a(this, new re40(this, 7));
            return;
        }
        o1l0 accessibilityListener = getAccessibilityListener();
        if (accessibilityListener != null) {
            ((kdl0) accessibilityListener).a(this);
        }
    }

    @Override // xsna.nxt0, xsna.nov
    public void setRemovable(boolean z) {
        this.p = z;
    }

    @Override // xsna.nxt0, xsna.nov
    public void setStickerAlpha(int i) {
        this.h.setAlpha(i / 255.0f);
        this.q = i;
    }

    public final void setStickerInfo(i5a0 i5a0Var) {
        this.f = i5a0Var;
    }

    @Override // xsna.nxt0, xsna.nov
    public final boolean v0() {
        return this.p;
    }
}
