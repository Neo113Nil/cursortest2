package com.yandex.go.pin.api.v1;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.nf2;
import defpackage.pf2;
import defpackage.qf2;
import defpackage.w511;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0014\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/pin/api/v1/AnimatedPinView;", "Lcom/yandex/go/pin/api/v1/BasePinView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lnf2;", "getAnchoredValues", "()Lnf2;", "getFreeValues", "pinAnimatorStartValues", "", "animateTransitions", "()Z", "getAnimatedParams", "Companion", "pf2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnimatedPinView extends BasePinView {
    private static final pf2 Companion = new pf2();
    public static final int $stable = BasePinView.$stable;

    public AnimatedPinView(Context context) {
        super(context, null, 0, 6, null);
    }

    private final nf2 getAnchoredValues() {
        int i = qf2.a[getState().ordinal()];
        if (i == 1) {
            if (getIdleStateDrawable() == null) {
                nf2 a = pf2.a(Companion);
                a.b(AnimatedParams$Index.EYE_ALPHA, 1.0f);
                return a;
            }
            nf2 a2 = pf2.a(Companion);
            a2.b(AnimatedParams$Index.IDLE_IMAGE_ALPHA, 1.0f);
            return a2;
        }
        if (i == 2) {
            return pf2.b(Companion);
        }
        if (i == 3) {
            nf2 a3 = pf2.a(Companion);
            a3.c();
            return a3;
        }
        if (i == 4) {
            nf2 a4 = pf2.a(Companion);
            a4.b(AnimatedParams$Index.TEXT_SCALE, 1.0f);
            a4.b(AnimatedParams$Index.TEXT_ALPHA, 1.0f);
            return a4;
        }
        if (i != 5) {
            w511.b();
            return null;
        }
        nf2 a5 = pf2.a(Companion);
        a5.b(AnimatedParams$Index.ERROR_ALPHA, 1.0f);
        return a5;
    }

    private final nf2 getFreeValues() {
        int i = qf2.a[getState().ordinal()];
        if (i == 1) {
            if (getIdleStateDrawable() == null) {
                Companion.getClass();
                nf2 c = pf2.c();
                c.b(AnimatedParams$Index.EYE_ALPHA, 1.0f);
                return c;
            }
            Companion.getClass();
            nf2 c2 = pf2.c();
            c2.b(AnimatedParams$Index.IDLE_IMAGE_ALPHA, 1.0f);
            return c2;
        }
        if (i == 2) {
            return pf2.b(Companion);
        }
        if (i == 3) {
            Companion.getClass();
            nf2 c3 = pf2.c();
            c3.c();
            return c3;
        }
        if (i == 4) {
            Companion.getClass();
            nf2 c4 = pf2.c();
            c4.b(AnimatedParams$Index.TEXT_SCALE, 1.0f);
            c4.b(AnimatedParams$Index.TEXT_ALPHA, 1.0f);
            return c4;
        }
        if (i != 5) {
            w511.b();
            return null;
        }
        Companion.getClass();
        nf2 c5 = pf2.c();
        c5.b(AnimatedParams$Index.ERROR_ALPHA, 1.0f);
        return c5;
    }

    @Override // com.yandex.go.pin.api.v1.BasePinView
    public boolean animateTransitions() {
        return true;
    }

    @Override // com.yandex.go.pin.api.v1.BasePinView
    public nf2 getAnimatedParams() {
        return getAnchored() ? getAnchoredValues() : getFreeValues();
    }

    @Override // com.yandex.go.pin.api.v1.BasePinView
    public nf2 pinAnimatorStartValues() {
        Companion.getClass();
        nf2 c = pf2.c();
        c.b(AnimatedParams$Index.EYE_ALPHA, 1.0f);
        return c;
    }

    public AnimatedPinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
    }

    public AnimatedPinView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
