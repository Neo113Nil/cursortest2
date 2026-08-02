package com.yandex.go.something_wrong_screen.experiment;

import defpackage.c6z;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import defpackage.tqs0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/something_wrong_screen/experiment/SomethingWrongScreenExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/something_wrong_screen/experiment/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SomethingWrongScreenExperiment extends n96 implements c6z {
    public static final d Companion = new d();
    public static final i3y[] i = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(23)), null, null, null, null, null};
    public static final SomethingWrongScreenExperiment j = new SomethingWrongScreenExperiment(0);
    public final boolean b;
    public final Map c;
    public final ShakeConfig d;
    public final DeeplinkConfig e;
    public final OnboardingConfig f;
    public final String g;
    public final String h;

    public /* synthetic */ SomethingWrongScreenExperiment(int i2, boolean z, Map map, ShakeConfig shakeConfig, DeeplinkConfig deeplinkConfig, OnboardingConfig onboardingConfig, String str, String str2) {
        this.b = (i2 & 1) == 0 ? false : z;
        if ((i2 & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = ShakeConfig.f;
        } else {
            this.d = shakeConfig;
        }
        if ((i2 & 8) == 0) {
            this.e = DeeplinkConfig.f;
        } else {
            this.e = deeplinkConfig;
        }
        if ((i2 & 16) == 0) {
            this.f = OnboardingConfig.d;
        } else {
            this.f = onboardingConfig;
        }
        if ((i2 & 32) == 0) {
            this.g = "";
        } else {
            this.g = str;
        }
        if ((i2 & 64) == 0) {
            this.h = "";
        } else {
            this.h = str2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final String c(String str, String str2) {
        String str3 = this.g;
        if (!evu0.y(str3, "$COUNTRY$", false)) {
            return cvu0.v(str3, "$LANGUAGE$", str, false);
        }
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        return cvu0.v(cvu0.v(str3, "$LANGUAGE$", str, false), "$COUNTRY$", str2, false);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public SomethingWrongScreenExperiment() {
        this(0);
    }

    public SomethingWrongScreenExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = ShakeConfig.f;
        this.e = DeeplinkConfig.f;
        this.f = OnboardingConfig.d;
        this.g = "";
        this.h = "";
    }
}
