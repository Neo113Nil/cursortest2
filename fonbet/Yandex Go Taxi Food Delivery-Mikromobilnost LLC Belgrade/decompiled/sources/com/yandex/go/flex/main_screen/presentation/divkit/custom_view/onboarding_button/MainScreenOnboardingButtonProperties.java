package com.yandex.go.flex.main_screen.presentation.divkit.custom_view.onboarding_button;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qxz;
import flex.feature.sections.action.ScrollPositionSurrogate;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/MainScreenOnboardingButtonProperties;", "", "Companion", "FeedOnboardingButtonShowPolicy", "$serializer", "com/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MainScreenOnboardingButtonProperties {
    public static final b Companion = new b();
    public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(9))};
    public final String a;
    public final FeedOnboardingButtonShowPolicy b;
    public final String c;
    public final String d;
    public final String e;
    public final ScrollPositionSurrogate f;

    public /* synthetic */ MainScreenOnboardingButtonProperties(int i, String str, FeedOnboardingButtonShowPolicy feedOnboardingButtonShowPolicy, String str2, String str3, String str4, ScrollPositionSurrogate scrollPositionSurrogate) {
        ScrollPositionSurrogate scrollPositionSurrogate2;
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new FeedOnboardingButtonShowPolicy(0);
        } else {
            this.b = feedOnboardingButtonShowPolicy;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "top";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) != 0) {
            this.f = scrollPositionSurrogate;
            return;
        }
        try {
            scrollPositionSurrogate2 = ScrollPositionSurrogate.valueOf(this.d);
        } catch (Exception unused) {
            scrollPositionSurrogate2 = ScrollPositionSurrogate.TOP;
        }
        this.f = scrollPositionSurrogate2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/MainScreenOnboardingButtonProperties$FeedOnboardingButtonShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FeedOnboardingButtonShowPolicy {
        public static final c Companion = new c();
        public final String a;
        public final long b;
        public final Integer c;
        public final Integer d;

        public /* synthetic */ FeedOnboardingButtonShowPolicy(int i, String str, long j, Integer num, Integer num2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = 0L;
            } else {
                this.b = j;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num2;
            }
        }

        public FeedOnboardingButtonShowPolicy(int i) {
            this.a = "";
            this.b = 0L;
            this.c = null;
            this.d = null;
        }

        public FeedOnboardingButtonShowPolicy() {
            this(0);
        }
    }

    public MainScreenOnboardingButtonProperties() {
        ScrollPositionSurrogate scrollPositionSurrogate;
        FeedOnboardingButtonShowPolicy feedOnboardingButtonShowPolicy = new FeedOnboardingButtonShowPolicy(0);
        this.a = "";
        this.b = feedOnboardingButtonShowPolicy;
        this.c = null;
        this.d = "top";
        this.e = null;
        try {
            scrollPositionSurrogate = ScrollPositionSurrogate.valueOf("top");
        } catch (Exception unused) {
            scrollPositionSurrogate = ScrollPositionSurrogate.TOP;
        }
        this.f = scrollPositionSurrogate;
    }
}
