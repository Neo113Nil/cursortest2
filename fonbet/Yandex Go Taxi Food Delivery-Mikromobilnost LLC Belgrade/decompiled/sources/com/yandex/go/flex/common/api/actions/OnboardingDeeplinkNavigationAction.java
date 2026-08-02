package com.yandex.go.flex.common.api.actions;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/OnboardingDeeplinkNavigationAction;", "Lcom/yandex/go/flex/common/api/actions/n;", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/a0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OnboardingDeeplinkNavigationAction extends n {
    public static final a0 Companion = new a0();
    public final String b;

    public /* synthetic */ OnboardingDeeplinkNavigationAction(int i, String str) {
        if ((i & 1) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnboardingDeeplinkNavigationAction) && jl40.l(this.b, ((OnboardingDeeplinkNavigationAction) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("OnboardingDeeplinkNavigationAction(link=", this.b, Extension.C_BRAKE);
    }

    public OnboardingDeeplinkNavigationAction() {
        this.b = "";
    }
}
