package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.amq;
import xsna.xlq;

/* compiled from: FastShareLayout.kt */
/* loaded from: classes6.dex */
public final class zlq extends LinearLayout {
    public final Paint b;
    public final RectF c;
    public final int[] d;
    public int e;
    public izs<? super Integer, s3q0> f;
    public gzs<s3q0> g;
    public amq h;

    public zlq(Context context) {
        super(context, null, 0);
        Paint paint = new Paint(1);
        paint.setColor(dhr0.Y(R.attr.vk_ui_avatar_overlay, context));
        paint.setStyle(Paint.Style.FILL);
        this.b = paint;
        this.c = new RectF();
        this.d = new int[2];
        this.e = -1;
        this.f = new qb(25);
        this.g = new uv0(13);
        setId(R.id.fast_share_popup_preview_area);
        setOrientation(0);
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        float f = 8;
        setPadding(iah0.a(f), 0, iah0.a(f), 0);
        this.h = amq.a.a;
    }

    public final void a(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        getLocationOnScreen(this.d);
        int i = 0;
        float f = rawX - r2[0];
        float f2 = rawY - r2[1];
        float f3 = 8;
        if (f2 >= (getHeight() - ((iah0.a(f3) * 2) + iah0.a(40))) - iah0.a(10)) {
            if (f2 <= iah0.a(20) + getHeight()) {
                int childCount = getChildCount();
                while (i < childCount) {
                    View childAt = getChildAt(i);
                    if (f >= childAt.getLeft()) {
                        if (f <= iah0.a(f3) + childAt.getRight()) {
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        i = -1;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                int i2 = this.e;
                if (i2 == -1 || !(this.h instanceof amq.b)) {
                    this.g.invoke();
                } else {
                    this.f.invoke(Integer.valueOf(i2));
                }
                b(-1);
                return;
            }
            if (action != 2) {
                if (action != 3) {
                    return;
                }
                this.g.invoke();
                b(-1);
                return;
            }
        }
        b(i);
    }

    public final void b(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        if (i != -1) {
            performHapticFeedback(4);
        }
        boolean z = this.e != -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!(i3 < getChildCount())) {
                return;
            }
            int i4 = i3 + 1;
            View childAt = getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int i5 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            ylq ylqVar = childAt instanceof ylq ? (ylq) childAt : null;
            if (ylqVar != null) {
                boolean z2 = i2 == this.e;
                float f = z2 ? 1.25f : 1.0f;
                float f2 = z2 ? -iah0.a(28) : 0.0f;
                float f3 = (z2 || !z) ? 1.0f : 0.7f;
                float f4 = z2 ? 1.0f : 0.0f;
                ylqVar.animate().translationY(f2).setDuration(150L).start();
                ylqVar.d.animate().scaleX(f).scaleY(f).alpha(f3).setDuration(150L).start();
                ylqVar.c.animate().alpha(f4).setDuration(150L).start();
            }
            i3 = i4;
            i2 = i5;
        }
    }

    public final gzs<s3q0> getOnCancel() {
        return this.g;
    }

    public final izs<Integer, s3q0> getOnSuccess() {
        return this.f;
    }

    public final amq getState() {
        return this.h;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.c;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getHeight() - ((iah0.a(8) * 2) + iah0.a(40)), width, height);
        float f = 32;
        canvas.drawRoundRect(rectF, iah0.a(f), iah0.a(f), this.b);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a(motionEvent);
        return true;
    }

    public final void setOnCancel(gzs<s3q0> gzsVar) {
        this.g = gzsVar;
    }

    public final void setOnSuccess(izs<? super Integer, s3q0> izsVar) {
        this.f = izsVar;
    }

    public final void setState(amq amqVar) {
        Drawable drawable;
        Drawable mutate;
        this.h = amqVar;
        removeAllViews();
        amq amqVar2 = this.h;
        int i = 8;
        int i2 = -2;
        if (amqVar2 instanceof amq.a) {
            for (int i3 = 0; i3 < 5; i3++) {
                View ylqVar = new ylq(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (i3 > 0) {
                    layoutParams.setMarginStart(iah0.a(8));
                }
                ylqVar.setLayoutParams(layoutParams);
                addView(ylqVar);
            }
            return;
        }
        if (!(amqVar2 instanceof amq.b)) {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = 0;
        for (Object obj : ((amq.b) amqVar2).a) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                e43.t();
                throw null;
            }
            xlq xlqVar = (xlq) obj;
            ylq ylqVar2 = new ylq(getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, -1);
            if (i4 > 0) {
                layoutParams2.setMarginStart(iah0.a(i));
            }
            ylqVar2.setLayoutParams(layoutParams2);
            ylqVar2.getTitle().setText(xlqVar.getName());
            if (xlqVar instanceof xlq.c) {
                xlq.c cVar = (xlq.c) xlqVar;
                String str = cVar.c;
                Drawable drawable2 = (str == null || drm0.N(str)) ? cVar.d : null;
                if (drawable2 != null) {
                    ylqVar2.getAvatar().J0(drawable2, ImageView.ScaleType.FIT_XY);
                } else {
                    Drawable a = m33.a(R.drawable.user_placeholder, ylqVar2.getContext());
                    if (a != null) {
                        a.setTint(ylqVar2.getContext().getColor(R.color.vk_gray_600));
                    } else {
                        a = null;
                    }
                    ylqVar2.getAvatar().setPlaceholderImage(a);
                }
                ylqVar2.getAvatar().o0(str, null);
            } else if (xlqVar instanceof xlq.a) {
                xlq.a aVar = (xlq.a) xlqVar;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                Paint paint = shapeDrawable.getPaint();
                dhr0.a.getClass();
                paint.setColor(e3m.f(R.attr.vk_ui_background_secondary, dhr0.s()));
                float f = 40;
                shapeDrawable.setIntrinsicWidth(iah0.a(f));
                shapeDrawable.setIntrinsicHeight(iah0.a(f));
                s3q0 s3q0Var = s3q0.a;
                Drawable a2 = m33.a(R.drawable.vk_icon_narrative_active_outline_24, dhr0.s());
                if (a2 != null) {
                    a2.setTint(dhr0.s().getColor(R.color.vk_gray_600));
                } else {
                    a2 = null;
                }
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, a2});
                layerDrawable.setLayerSize(0, -1, -1);
                layerDrawable.setLayerGravity(1, 17);
                ylqVar2.getAvatar().o0(aVar.c, null);
                ylqVar2.getAvatar().setPlaceholderImage(layerDrawable);
                if (aVar.d) {
                    ylqVar2.getAvatar().Q0(new com.vk.core.view.components.avatar.badge.a(ylqVar2.getContext().getDrawable(R.drawable.vk_icon_check_circle_fill_dark_16), false, VkAvatarBadge.Alignment.BottomRight, (String) null, 24));
                }
            } else {
                if (!(xlqVar instanceof xlq.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                Paint paint2 = shapeDrawable2.getPaint();
                dhr0.a.getClass();
                paint2.setColor(e3m.f(R.attr.vk_ui_background_secondary, dhr0.s()));
                float f2 = 40;
                shapeDrawable2.setIntrinsicWidth(iah0.a(f2));
                shapeDrawable2.setIntrinsicHeight(iah0.a(f2));
                Drawable a3 = m33.a(R.drawable.vk_icon_more_vertical_24, ylqVar2.getContext());
                if (a3 == null || (mutate = a3.mutate()) == null) {
                    drawable = null;
                } else {
                    mutate.setTint(dhr0.Y(R.attr.vk_ui_icon_tertiary, ylqVar2.getContext()));
                    drawable = mutate;
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable2, drawable});
                layerDrawable2.setLayerSize(0, iah0.a(f2), iah0.a(f2));
                if (drawable != null) {
                    layerDrawable2.setLayerGravity(1, 17);
                }
                ylqVar2.getAvatar().setImageDrawable(layerDrawable2);
            }
            addView(ylqVar2);
            i4 = i5;
            i = 8;
            i2 = -2;
        }
    }
}
