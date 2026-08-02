package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.km, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4970km extends Y5 {
    public final L3 b;

    public C4970km(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager(), C5342za.k().f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.Y5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4996lm load(@NonNull X5 x5) {
        C4996lm c4996lm = (C4996lm) super.load(x5);
        C5100pm c5100pm = x5.a;
        c4996lm.d = c5100pm.f;
        c4996lm.e = c5100pm.g;
        C4944jm c4944jm = (C4944jm) x5.componentArguments;
        String str = c4944jm.a;
        if (str != null) {
            c4996lm.f = str;
            c4996lm.g = c4944jm.b;
        }
        Map<String, String> map = c4944jm.c;
        c4996lm.h = map;
        c4996lm.i = (D3) this.b.a(new D3(map, EnumC4801e8.c));
        C4944jm c4944jm2 = (C4944jm) x5.componentArguments;
        c4996lm.k = c4944jm2.d;
        c4996lm.j = c4944jm2.e;
        C5100pm c5100pm2 = x5.a;
        c4996lm.l = c5100pm2.p;
        c4996lm.m = c5100pm2.r;
        long j = c5100pm2.v;
        if (c4996lm.n == 0) {
            c4996lm.n = j;
        }
        return c4996lm;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C4996lm();
    }

    public C4970km(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager, @NonNull L3 l3) {
        super(context, str, safePackageManager);
        this.b = l3;
    }

    @NonNull
    public final C4996lm a() {
        return new C4996lm();
    }
}
