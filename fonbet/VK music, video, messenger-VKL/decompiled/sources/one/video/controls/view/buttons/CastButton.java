package one.video.controls.view.buttons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls.view.buttons.CastButton;
import one.video.controls.view.state.CastButtonState;
import xsna.epx;
import xsna.hz9;
import xsna.iz9;
import xsna.jz9;
import xsna.ll7;
import xsna.lz9;
import xsna.msy;
import xsna.mz9;
import xsna.o7j;
import xsna.oqj;
import xsna.y3j;

/* compiled from: CastButton.kt */
/* loaded from: classes8.dex */
public final class CastButton extends oqj {
    public static final /* synthetic */ int g = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final y3j f;

    /* compiled from: CastButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CastButtonState.CastButtonConnectionState.values().length];
            try {
                iArr[CastButtonState.CastButtonConnectionState.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CastButtonState.CastButtonConnectionState.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CastButtonState.CastButtonConnectionState.CONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CastButtonState.CastButtonConnectionState.DISCONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CastButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.drawable.one_video_icon_cast_24, R.string.one_video_controls_button_cast);
        setImageTintList(ColorStateList.valueOf(context.getColor(R.color.one_video_white)));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, new hz9(context, 0));
        this.c = msy.a(lazyThreadSafetyMode, new ll7(context, 1));
        this.d = msy.a(lazyThreadSafetyMode, new iz9(context));
        this.e = msy.a(lazyThreadSafetyMode, new jz9(context, 0));
        this.f = new y3j(new o7j() { // from class: xsna.kz9
            @Override // xsna.o7j
            public final void accept(Object obj) {
                CastButton.U(CastButton.this, (CastButtonState) obj);
            }
        });
    }

    public static void U(CastButton castButton, CastButtonState castButtonState) {
        boolean z = castButtonState.a;
        castButton.setVisibility(z ? 0 : 8);
        if (z) {
            int i = a.$EnumSwitchMapping$0[castButtonState.b.ordinal()];
            if (i == 1) {
                castButton.b0(castButton.getConnectedCastDrawable());
                return;
            }
            if (i == 2) {
                castButton.W();
                return;
            }
            if (i == 3) {
                castButton.getConnectAnimation().registerAnimationCallback(new lz9(castButton));
                castButton.b0(castButton.getConnectAnimation());
                castButton.getConnectAnimation().start();
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                castButton.getDisconnectAnimation().registerAnimationCallback(new mz9(castButton));
                castButton.b0(castButton.getDisconnectAnimation());
                castButton.getDisconnectAnimation().start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final AnimatedVectorDrawable getConnectAnimation() {
        return (AnimatedVectorDrawable) this.b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Drawable getConnectedCastDrawable() {
        return (Drawable) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AnimatedVectorDrawable getDisconnectAnimation() {
        return (AnimatedVectorDrawable) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Drawable getDisconnectedCastDrawable() {
        return (Drawable) this.d.getValue();
    }

    public final void W() {
        b0(getDisconnectedCastDrawable());
    }

    public final void b0(Drawable drawable) {
        if (getConnectAnimation().isRunning()) {
            getConnectAnimation().clearAnimationCallbacks();
            getConnectAnimation().stop();
        }
        if (epx.f(drawable, getDisconnectedCastDrawable()) && getDisconnectAnimation().isRunning()) {
            return;
        }
        if (!epx.f(drawable, getDisconnectAnimation())) {
            getDisconnectAnimation().clearAnimationCallbacks();
            getDisconnectAnimation().stop();
        }
        setImageDrawable(drawable);
    }
}
