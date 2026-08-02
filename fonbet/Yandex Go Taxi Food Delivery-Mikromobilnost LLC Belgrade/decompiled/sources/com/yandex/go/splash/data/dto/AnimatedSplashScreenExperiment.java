package com.yandex.go.splash.data.dto;

import defpackage.gsq0;
import defpackage.i22;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.vn11;
import java.util.Calendar;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/splash/data/dto/AnimatedSplashScreenExperiment;", "Lvn11;", "Companion", "SplashAnimation", "com/yandex/go/splash/data/dto/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AnimatedSplashScreenExperiment implements vn11 {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i22(4))};
    public static final AnimatedSplashScreenExperiment d = new AnimatedSplashScreenExperiment(0);
    public final List b;

    public /* synthetic */ AnimatedSplashScreenExperiment(int i, List list) {
        if ((i & 1) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnimatedSplashScreenExperiment) && jl40.l(this.b, ((AnimatedSplashScreenExperiment) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return tse0.k("AnimatedSplashScreenExperiment(animations=", Extension.C_BRAKE, this.b);
    }

    public AnimatedSplashScreenExperiment(int i) {
        this.b = EmptyList.a;
    }

    public AnimatedSplashScreenExperiment() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/splash/data/dto/AnimatedSplashScreenExperiment$SplashAnimation;", "", "Companion", "$serializer", "com/yandex/go/splash/data/dto/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SplashAnimation {
        public static final b Companion = new b();
        public final String a;
        public final Calendar b;
        public final Calendar c;
        public final float d;
        public final int e;
        public final float f;

        public /* synthetic */ SplashAnimation(int i, String str, Calendar calendar, Calendar calendar2, float f, int i2, float f2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = calendar;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = calendar2;
            }
            if ((i & 8) == 0) {
                this.d = 0.0f;
            } else {
                this.d = f;
            }
            if ((i & 16) == 0) {
                this.e = 0;
            } else {
                this.e = i2;
            }
            if ((i & 32) == 0) {
                this.f = 0.0f;
            } else {
                this.f = f2;
            }
        }

        public SplashAnimation() {
            this.a = "";
            this.b = null;
            this.c = null;
            this.d = 0.0f;
            this.e = 0;
            this.f = 0.0f;
        }
    }
}
