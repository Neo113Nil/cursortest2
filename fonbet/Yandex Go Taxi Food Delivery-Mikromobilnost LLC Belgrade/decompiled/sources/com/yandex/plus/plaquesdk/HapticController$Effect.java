package com.yandex.plus.plaquesdk;

import android.os.VibrationEffect;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/yandex/plus/plaquesdk/HapticController$Effect", "", "Lcom/yandex/plus/plaquesdk/HapticController$Effect;", "", "timings", "[J", "", "amplitudes", "[I", "fallbackTimings", "getFallbackTimings", "()[J", "", "vibrationEffect", "Ljava/lang/Object;", "CLICK", "TICK", "SELECT", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HapticController$Effect {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HapticController$Effect[] $VALUES;
    public static final HapticController$Effect CLICK;
    public static final HapticController$Effect SELECT;
    public static final HapticController$Effect TICK;
    private final int[] amplitudes;
    private final long[] fallbackTimings;
    private final long[] timings;
    private Object vibrationEffect;

    static {
        HapticController$Effect hapticController$Effect = new HapticController$Effect("CLICK", 0, new long[]{6}, new int[]{150}, new long[]{100});
        CLICK = hapticController$Effect;
        HapticController$Effect hapticController$Effect2 = new HapticController$Effect("TICK", 1, new long[]{6}, new int[]{100}, new long[]{100});
        TICK = hapticController$Effect2;
        HapticController$Effect hapticController$Effect3 = new HapticController$Effect("SELECT", 2, new long[]{10}, new int[]{55}, new long[]{50});
        SELECT = hapticController$Effect3;
        HapticController$Effect[] hapticController$EffectArr = {hapticController$Effect, hapticController$Effect2, hapticController$Effect3};
        $VALUES = hapticController$EffectArr;
        $ENTRIES = kotlin.enums.a.a(hapticController$EffectArr);
    }

    public HapticController$Effect(String str, int i, long[] jArr, int[] iArr, long[] jArr2) {
        this.timings = jArr;
        this.amplitudes = iArr;
        this.fallbackTimings = jArr2;
    }

    public static HapticController$Effect valueOf(String str) {
        return (HapticController$Effect) Enum.valueOf(HapticController$Effect.class, str);
    }

    public static HapticController$Effect[] values() {
        return (HapticController$Effect[]) $VALUES.clone();
    }

    public final VibrationEffect a(boolean z) {
        VibrationEffect createOneShot;
        if (this.vibrationEffect == null) {
            if (z) {
                createOneShot = VibrationEffect.createWaveform(this.timings, this.amplitudes, -1);
            } else {
                long[] jArr = this.fallbackTimings;
                createOneShot = jArr.length == 1 ? VibrationEffect.createOneShot(jArr[0], -1) : VibrationEffect.createWaveform(jArr, -1);
            }
            this.vibrationEffect = createOneShot;
        }
        return (VibrationEffect) this.vibrationEffect;
    }
}
