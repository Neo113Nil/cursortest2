package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.ReactionView;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.nov;

/* compiled from: StoryReactionSticker.kt */
/* loaded from: classes6.dex */
public final class abm0 extends nxt0 {
    public final View f;
    public final ReactionView g;
    public Boolean h;
    public y0f0 i;

    /* compiled from: ViewExt.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            abm0.o(abm0.this);
        }
    }

    public abm0(Context context) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_reaction, (ViewGroup) null);
        this.f = inflate;
        this.g = (ReactionView) inflate.findViewById(R.id.reaction);
        addView(inflate);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (isLaidOut()) {
            o(this);
        } else {
            addOnLayoutChangeListener(new a());
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

    public static final void o(abm0 abm0Var) {
        abm0Var.setStickerScale(1.0f);
        float originalWidth = abm0Var.getOriginalWidth();
        float originalHeight = abm0Var.getOriginalHeight();
        if (originalWidth == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || originalHeight == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        abm0Var.f.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(abm0Var.getAvailableWidth()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(abm0Var.getAvailableHeight()), Integer.MIN_VALUE));
        nov.a.i(abm0Var, ((abm0Var.getParentWidth() / 2.0f) - (abm0Var.getOriginalWidth() / 2.0f)) - pov.e(abm0Var.getStickerMatrix()), ((abm0Var.getParentHeight() / 2.0f) - (abm0Var.getOriginalHeight() / 2.0f)) - pov.f(abm0Var.getStickerMatrix()));
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        WebStickerType stickerTypeForRendering = getStickerTypeForRendering();
        Class<? extends nov> stickerCreatorForRendering = getStickerCreatorForRendering();
        l0u0 l0u0Var = new l0u0(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888), getMeasuredWidth() * 2, stickerTypeForRendering, "");
        l0u0Var.q = stickerCreatorForRendering;
        l0u0Var.s = new vpj0(this, 5);
        int reactionId = getReactionId();
        Boolean bool = this.h;
        l0u0Var.t = new vjc(reactionId, bool != null ? bool.booleanValue() : true);
        nov.a.b(this, l0u0Var);
        return l0u0Var;
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new abm0(getContext()));
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanRotate() {
        return false;
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanScale() {
        return false;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return this.f.getMeasuredHeight();
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return this.f.getMeasuredWidth();
    }

    public final y0f0 getReaction() {
        return this.i;
    }

    public final int getReactionId() {
        y0f0 y0f0Var = this.i;
        if (y0f0Var != null) {
            return y0f0Var.a;
        }
        return 0;
    }

    public final Class<? extends nov> getStickerCreatorForRendering() {
        return abm0.class;
    }

    public final WebStickerType getStickerTypeForRendering() {
        return WebStickerType.REACTION;
    }

    public final Boolean getWithBlackBackground() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f.layout(i, i2, i3, i4);
    }

    @Override // xsna.nxt0, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getAvailableWidth()), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getAvailableHeight()), Integer.MIN_VALUE);
        View view = this.f;
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void setReaction(y0f0 y0f0Var) {
        this.i = y0f0Var;
    }

    public final void setWithBlackBackground(Boolean bool) {
        this.h = bool;
    }
}
