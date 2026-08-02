package com.yandex.go.splash.v2;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.s7s0;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/splash/v2/SplashScreenV2Experiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/splash/v2/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SplashScreenV2Experiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] h = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s7s0(24)), null, null, null, null};
    public static final SplashScreenV2Experiment i = new SplashScreenV2Experiment(0);
    public final boolean b;
    public final Map c;
    public final boolean d;
    public final String e;
    public final String f;
    public final int g;

    public /* synthetic */ SplashScreenV2Experiment(int i2, int i3, String str, String str2, Map map, boolean z, boolean z2) {
        this.b = (i2 & 1) == 0 ? true : z;
        this.c = (i2 & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i2 & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        this.e = (i2 & 8) == 0 ? "" : str;
        if ((i2 & 16) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i2 & 32) == 0) {
            this.g = 1500;
        } else {
            this.g = i3;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public SplashScreenV2Experiment() {
        this(0);
    }

    public SplashScreenV2Experiment(int i2) {
        Map f = kotlin.collections.b.f();
        this.b = true;
        this.c = f;
        this.d = false;
        this.e = "";
        this.f = null;
        this.g = 1500;
    }
}
