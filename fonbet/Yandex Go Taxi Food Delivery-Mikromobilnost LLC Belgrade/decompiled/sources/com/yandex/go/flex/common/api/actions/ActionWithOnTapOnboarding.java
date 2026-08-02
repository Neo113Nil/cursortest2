package com.yandex.go.flex.common.api.actions;

import defpackage.ar;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/ActionWithOnTapOnboarding;", "Lcom/yandex/go/flex/common/api/actions/n;", "Companion", "Onboarding", "$serializer", "com/yandex/go/flex/common/api/actions/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ActionWithOnTapOnboarding extends n {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ar(12))};
    public final Onboarding b;
    public final n c;

    public /* synthetic */ ActionWithOnTapOnboarding(int i, Onboarding onboarding, n nVar) {
        this.b = (i & 1) == 0 ? new Onboarding(0) : onboarding;
        if ((i & 2) == 0) {
            this.c = v0.b;
        } else {
            this.c = nVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionWithOnTapOnboarding)) {
            return false;
        }
        ActionWithOnTapOnboarding actionWithOnTapOnboarding = (ActionWithOnTapOnboarding) obj;
        return jl40.l(this.b, actionWithOnTapOnboarding.b) && jl40.l(this.c, actionWithOnTapOnboarding.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "ActionWithOnTapOnboarding(onboarding=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/ActionWithOnTapOnboarding$Onboarding;", "", "Companion", "ShowPolicy", "$serializer", "com/yandex/go/flex/common/api/actions/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Onboarding {
        public static final b Companion = new b();
        public final String a;
        public final ShowPolicy b;

        public /* synthetic */ Onboarding(int i, String str, ShowPolicy showPolicy) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = new ShowPolicy(0);
            } else {
                this.b = showPolicy;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) obj;
            return jl40.l(this.a, onboarding.a) && jl40.l(this.b, onboarding.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Onboarding(promoId=" + this.a + ", showPolicy=" + this.b + Extension.C_BRAKE;
        }

        public Onboarding() {
            this(0);
        }

        public Onboarding(int i) {
            ShowPolicy showPolicy = new ShowPolicy(0);
            this.a = "";
            this.b = showPolicy;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/ActionWithOnTapOnboarding$Onboarding$ShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class ShowPolicy {
            public static final c Companion = new c();
            public final String a;
            public final int b;
            public final int c;

            public /* synthetic */ ShowPolicy(int i, int i2, int i3, String str) {
                this.a = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.b = Integer.MAX_VALUE;
                } else {
                    this.b = i2;
                }
                if ((i & 4) == 0) {
                    this.c = Integer.MAX_VALUE;
                } else {
                    this.c = i3;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowPolicy)) {
                    return false;
                }
                ShowPolicy showPolicy = (ShowPolicy) obj;
                return jl40.l(this.a, showPolicy.a) && this.b == showPolicy.b && this.c == showPolicy.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
            }

            public final String toString() {
                return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "ShowPolicy(id=", this.a, ", maxShowCount=", ", maxWidgetUsageCount="));
            }

            public ShowPolicy(int i) {
                this.a = "";
                this.b = Integer.MAX_VALUE;
                this.c = Integer.MAX_VALUE;
            }

            public ShowPolicy() {
                this(0);
            }
        }
    }

    public ActionWithOnTapOnboarding() {
        Onboarding onboarding = new Onboarding(0);
        v0 v0Var = v0.b;
        this.b = onboarding;
        this.c = v0Var;
    }
}
