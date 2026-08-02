package com.yandex.messaging.internal.view.timeline.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.messaging.internal.entities.MessageReactions;
import defpackage.fxa1;
import defpackage.hta1;
import defpackage.iai0;
import defpackage.jai0;
import defpackage.jng0;
import defpackage.kjs0;
import defpackage.mp11;
import defpackage.tj91;
import defpackage.tje;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0014¢\u0006\u0004\b$\u0010%J7\u0010,\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000fH\u0014¢\u0006\u0004\b0\u0010\u0017J\u000f\u00101\u001a\u00020\u000fH\u0014¢\u0006\u0004\b1\u0010\u0017R\u0016\u00102\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00108\u001a\b\u0018\u000107R\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R$\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R$\u0010?\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R$\u0010A\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>R$\u0010D\u001a\u00020C2\u0006\u0010:\u001a\u00020C8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010<R\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010<R\u0016\u0010N\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010<R\u0016\u0010O\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010<R\u0016\u0010P\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010<R\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010<R\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010UR\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010V¨\u0006W"}, d2 = {"Lcom/yandex/messaging/internal/view/timeline/overlay/ReactionsView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "end", "borderWidth", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "drawReactionBg", "(IILandroid/graphics/Canvas;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "drawReaction", "(Landroid/graphics/drawable/Drawable;ILandroid/graphics/Canvas;)I", "prefetch", "()V", "Lmp11;", "typefaceProvider", "Ljai0;", "reactionDrawables", "setup", "(Lmp11;Ljai0;)V", "Lcom/yandex/messaging/internal/entities/MessageReactions;", "reactions", "setReactions", "(Lcom/yandex/messaging/internal/entities/MessageReactions;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onDraw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "onDetachedFromWindow", "imageBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Paint;", "textPaint", "Landroid/graphics/Paint;", "Liai0;", "drawables", "Liai0;", "value", "firstReaction", CA20Status.STATUS_USER_I, "getFirstReaction$messaging_core_internal_release", "()I", "secondReaction", "getSecondReaction$messaging_core_internal_release", "thirdReaction", "getThirdReaction$messaging_core_internal_release", "", "countString", "Ljava/lang/String;", "getCountString$messaging_core_internal_release", "()Ljava/lang/String;", "", "textTop", "F", "textEnd", "stickerTop", "stickerBottom", "stickerEnd", "stickerOverflow", "imageSize", "imageBackgroundSize", "", "layoutTime", "J", "Lmp11;", "Ljai0;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReactionsView extends View {
    public static final int $stable = 8;
    private String countString;
    private iai0 drawables;
    private int firstReaction;
    private Drawable imageBackgroundDrawable;
    private int imageBackgroundSize;
    private int imageSize;
    private long layoutTime;
    private jai0 reactionDrawables;
    private int secondReaction;
    private int stickerBottom;
    private int stickerEnd;
    private int stickerOverflow;
    private int stickerTop;
    private float textEnd;
    private final Paint textPaint;
    private float textTop;
    private int thirdReaction;
    private mp11 typefaceProvider;

    public /* synthetic */ ReactionsView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    private final int drawReaction(Drawable drawable, int end, Canvas canvas) {
        boolean b = tj91.b(this);
        if (b) {
            drawable.setBounds(end, this.stickerTop, this.imageSize + end, this.stickerBottom);
        } else {
            drawable.setBounds(end - this.imageSize, this.stickerTop, end, this.stickerBottom);
        }
        drawable.draw(canvas);
        int i = this.imageSize;
        return !b ? end - (i - this.stickerOverflow) : (i - this.stickerOverflow) + end;
    }

    private final void drawReactionBg(int end, int borderWidth, Canvas canvas) {
        boolean b = tj91.b(this);
        Drawable drawable = this.imageBackgroundDrawable;
        if (b) {
            if (drawable == null) {
                drawable = null;
            }
            drawable.setBounds(end - borderWidth, this.stickerTop - borderWidth, end + this.imageSize + borderWidth, this.stickerBottom + borderWidth);
        } else {
            if (drawable == null) {
                drawable = null;
            }
            drawable.setBounds((end - this.imageSize) - borderWidth, this.stickerTop - borderWidth, end + borderWidth, this.stickerBottom + borderWidth);
        }
        Drawable drawable2 = this.imageBackgroundDrawable;
        (drawable2 != null ? drawable2 : null).draw(canvas);
    }

    private final void prefetch() {
        int i;
        iai0 iai0Var = this.drawables;
        if (iai0Var == null || (i = this.firstReaction) <= 0) {
            return;
        }
        iai0Var.c(i);
        int i2 = this.secondReaction;
        if (i2 > 0) {
            iai0Var.c(i2);
            int i3 = this.thirdReaction;
            if (i3 > 0) {
                iai0Var.c(i3);
            }
        }
    }

    /* renamed from: getCountString$messaging_core_internal_release, reason: from getter */
    public final String getCountString() {
        return this.countString;
    }

    /* renamed from: getFirstReaction$messaging_core_internal_release, reason: from getter */
    public final int getFirstReaction() {
        return this.firstReaction;
    }

    /* renamed from: getSecondReaction$messaging_core_internal_release, reason: from getter */
    public final int getSecondReaction() {
        return this.secondReaction;
    }

    /* renamed from: getThirdReaction$messaging_core_internal_release, reason: from getter */
    public final int getThirdReaction() {
        return this.thirdReaction;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        jai0 jai0Var = this.reactionDrawables;
        if (jai0Var == null) {
            jai0Var = null;
        }
        ReactionsView$onAttachedToWindow$1 reactionsView$onAttachedToWindow$1 = new ReactionsView$onAttachedToWindow$1(0, this, ReactionsView.class, "invalidate", "invalidate()V", 0);
        jai0Var.getClass();
        tje.e();
        this.drawables = new iai0(jai0Var, reactionsView$onAttachedToWindow$1);
        prefetch();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        iai0 iai0Var = this.drawables;
        if (iai0Var != null) {
            iai0Var.close();
        }
        this.drawables = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.textEnd;
        int i = this.stickerEnd;
        canvas.drawText(this.countString, f, this.textTop, this.textPaint);
        int i2 = (this.imageBackgroundSize - this.imageSize) / 2;
        int i3 = this.thirdReaction;
        if (i3 > 0) {
            i = drawReaction(this.drawables.a(i3), i, canvas);
            drawReactionBg(i, i2, canvas);
        }
        int i4 = this.secondReaction;
        if (i4 > 0) {
            i = drawReaction(this.drawables.a(i4), i, canvas);
            drawReactionBg(i, i2, canvas);
        }
        int i5 = this.firstReaction;
        if (i5 > 0) {
            drawReaction(this.drawables.a(i5), i, canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        int i = right - left;
        int i2 = bottom - top;
        int measureText = (int) this.textPaint.measureText(this.countString);
        boolean b = tj91.b(this);
        float d = !b ? i - kjs0.d(7) : kjs0.d(7) + measureText;
        this.textEnd = d;
        this.stickerEnd = !b ? (((int) d) - measureText) - kjs0.b(4) : kjs0.b(7) + measureText + kjs0.b(4);
        this.textTop = kjs0.d(16);
        this.stickerTop = kjs0.b(4);
        this.stickerBottom = i2 - kjs0.b(4);
        this.stickerOverflow = kjs0.b(2);
        this.imageSize = kjs0.b(16);
        this.imageBackgroundSize = kjs0.b(20);
        this.layoutTime = SystemClock.elapsedRealtimeNanos();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(kjs0.b(6) + kjs0.b(4) + ((kjs0.b(16) - kjs0.b(2)) * (this.thirdReaction > 0 ? 2 : this.secondReaction > 0 ? 1 : 0)) + kjs0.b(16) + kjs0.b(4) + ((int) this.textPaint.measureText(this.countString)), kjs0.b(24));
    }

    public final void setReactions(MessageReactions reactions) {
        this.countString = hta1.a(reactions.sumCount);
        this.firstReaction = reactions.first;
        this.secondReaction = reactions.second;
        this.thirdReaction = reactions.third;
        prefetch();
        forceLayout();
        requestLayout();
    }

    public final void setup(mp11 typefaceProvider, jai0 reactionDrawables) {
        this.typefaceProvider = typefaceProvider;
        this.reactionDrawables = reactionDrawables;
        setElevation(kjs0.d(2));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = kjs0.d(9);
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(fxa1.c(jng0.messagingChatMessageOverlayColor, getContext()).data);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        this.imageBackgroundDrawable = shapeDrawable;
        this.textPaint.setTextSize(kjs0.e(12));
        this.textPaint.setColor(fxa1.c(jng0.messagingCommonTextSecondaryColor, getContext()).data);
        this.textPaint.setAntiAlias(true);
        this.textPaint.setTextAlign(Paint.Align.RIGHT);
        this.textPaint.setTypeface(typefaceProvider.a());
    }

    public ReactionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ReactionsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ReactionsView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public ReactionsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.textPaint = new Paint(1);
        this.countString = "";
    }
}
