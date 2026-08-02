package com.yandex.go.something_wrong_screen.experiment;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/something_wrong_screen/experiment/OnboardingConfig;", "", "Companion", "com/yandex/go/something_wrong_screen/experiment/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnboardingConfig {
    public static final b Companion = new b();
    public static final OnboardingConfig d = new OnboardingConfig(0);
    public final boolean a;
    public final String b;
    public final String c;

    public /* synthetic */ OnboardingConfig(String str, int i, String str2, boolean z) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
    }

    public OnboardingConfig(int i) {
        this.a = false;
        this.b = "";
        this.c = "";
    }

    public OnboardingConfig() {
        this(0);
    }
}
