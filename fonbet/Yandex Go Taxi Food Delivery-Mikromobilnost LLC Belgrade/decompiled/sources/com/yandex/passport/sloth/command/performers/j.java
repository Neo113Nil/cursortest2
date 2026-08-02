package com.yandex.passport.sloth.command.performers;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.command.data.d0;
import defpackage.a82;
import defpackage.iqn;
import defpackage.jl40;
import defpackage.rk31;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j implements com.yandex.passport.sloth.command.q {
    public final Context a;

    public j(Context context) {
        this.a = context;
    }

    @Override // com.yandex.passport.sloth.command.q
    public final Object a(Object obj, Continuation continuation) {
        Vibrator vibrator;
        d0 d0Var = (d0) obj;
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            VibratorManager h = rk31.n(systemService) ? a82.h(systemService) : null;
            if (h != null) {
                vibrator = h.getDefaultVibrator();
            }
            vibrator = null;
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            if (systemService2 instanceof Vibrator) {
                vibrator = (Vibrator) systemService2;
            }
            vibrator = null;
        }
        Boolean valueOf = vibrator != null ? Boolean.valueOf(vibrator.hasVibrator()) : null;
        long[] K0 = kotlin.collections.a.K0(d0Var.a);
        List list = d0Var.b;
        boolean z = false;
        if (!jl40.l(valueOf, Boolean.TRUE) || K0.length == 0 || K0.length != list.size()) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Vibration is not possible: hasVibrator = " + valueOf + ", vibrationPattern = " + K0 + ", vibrationAmplitude = " + list, 8);
            }
            return new iqn(new com.yandex.passport.sloth.command.a(false));
        }
        try {
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf((int) (((Number) it.next()).floatValue() * 255.0f)));
            }
            vibrator.vibrate(VibrationEffect.createWaveform(K0, kotlin.collections.a.I0(arrayList), -1));
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Successful performVibration", 8);
            }
            z = true;
        } catch (Exception e) {
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.INFO, null, "Failed performVibration", e);
            }
        }
        return new iqn(new com.yandex.passport.sloth.command.a(z));
    }
}
