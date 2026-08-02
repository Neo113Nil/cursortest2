package com.yandex.go.navigator.alt_select.traffic;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.SystemClock;
import defpackage.k4o;
import defpackage.w511;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/navigator/alt_select/traffic/CyclicTransitionDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Landroid/graphics/drawable/Drawable;", "first", "second", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "", "duration", "Lzy11;", "startTransition", "(I)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "currentAlpha", CA20Status.STATUS_USER_I, "fromAlpha", "toAlpha", "", "J", "startTime", "Lcom/yandex/go/navigator/alt_select/traffic/CyclicTransitionDrawable$State;", ClidProvider.STATE, "Lcom/yandex/go/navigator/alt_select/traffic/CyclicTransitionDrawable$State;", "State", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CyclicTransitionDrawable extends LayerDrawable implements Drawable.Callback {
    public static final int $stable = 8;
    private int currentAlpha;
    private long duration;
    private int fromAlpha;
    private long startTime;
    private State state;
    private int toAlpha;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/navigator/alt_select/traffic/CyclicTransitionDrawable$State;", "", "STARTING", "RUNNING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State RUNNING;
        public static final State STARTING;

        static {
            State state = new State("STARTING", 0);
            STARTING = state;
            State state2 = new State("RUNNING", 1);
            RUNNING = state2;
            State[] stateArr = {state, state2};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public CyclicTransitionDrawable(Drawable drawable, Drawable drawable2) {
        super(new Drawable[]{drawable, drawable2});
        setId(0, 0);
        setId(1, 1);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        State state = this.state;
        if (state == null) {
            state = null;
        }
        int i = a.a[state.ordinal()];
        if (i == 1) {
            this.startTime = SystemClock.uptimeMillis();
            this.currentAlpha = 0;
            this.state = State.RUNNING;
            z = false;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            if (this.startTime >= 0) {
                float uptimeMillis = (SystemClock.uptimeMillis() - this.startTime) / this.duration;
                z = uptimeMillis >= 1.0f;
                if (uptimeMillis > 1.0f) {
                    uptimeMillis = 1.0f;
                }
                this.currentAlpha = (int) (((this.toAlpha - r3) * uptimeMillis) + this.fromAlpha);
            } else {
                z = true;
            }
        }
        Drawable findDrawableByLayerId = findDrawableByLayerId(0);
        Drawable findDrawableByLayerId2 = findDrawableByLayerId(1);
        findDrawableByLayerId.setAlpha(255 - this.currentAlpha);
        findDrawableByLayerId.draw(canvas);
        findDrawableByLayerId.setAlpha(255);
        int i2 = this.currentAlpha;
        if (i2 > 0) {
            findDrawableByLayerId2.setAlpha(i2);
            findDrawableByLayerId2.draw(canvas);
            findDrawableByLayerId2.setAlpha(255);
        }
        if (z) {
            Drawable findDrawableByLayerId3 = findDrawableByLayerId(0);
            setDrawableByLayerId(0, findDrawableByLayerId(1));
            setDrawableByLayerId(1, findDrawableByLayerId3);
            this.state = State.STARTING;
        }
        invalidateSelf();
    }

    public final void startTransition(int duration) {
        this.fromAlpha = 0;
        this.toAlpha = 255;
        this.duration = duration;
        this.startTime = SystemClock.uptimeMillis();
        this.state = State.STARTING;
        invalidateSelf();
    }
}
