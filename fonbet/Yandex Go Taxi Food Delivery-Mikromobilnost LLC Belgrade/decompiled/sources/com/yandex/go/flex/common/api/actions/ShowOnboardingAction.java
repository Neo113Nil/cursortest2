package com.yandex.go.flex.common.api.actions;

import defpackage.dwq0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.s7s0;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/ShowOnboardingAction;", "Lcom/yandex/go/flex/common/api/actions/n;", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/m0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ShowOnboardingAction extends n {
    public static final m0 Companion = new m0();
    public static final i3y[] g;
    public final FormattedText b;
    public final FormattedText c;
    public final String d;
    public final String e;
    public final kotlinx.serialization.json.c f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new dwq0(29)), kotlin.a.b(lazyThreadSafetyMode, new s7s0(0)), null, null, null};
    }

    public /* synthetic */ ShowOnboardingAction(int i, FormattedText formattedText, FormattedText formattedText2, String str, String str2, kotlinx.serialization.json.c cVar) {
        this.b = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText2;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = cVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowOnboardingAction)) {
            return false;
        }
        ShowOnboardingAction showOnboardingAction = (ShowOnboardingAction) obj;
        return jl40.l(this.b, showOnboardingAction.b) && jl40.l(this.c, showOnboardingAction.c) && jl40.l(this.d, showOnboardingAction.d) && jl40.l(this.e, showOnboardingAction.e) && jl40.l(this.f, showOnboardingAction.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.c(this.b.a.hashCode() * 31, 31, this.c.a), 31, this.d), 31, this.e);
        kotlinx.serialization.json.c cVar = this.f;
        return b + (cVar == null ? 0 : cVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder r = defpackage.n.r("ShowOnboardingAction(title=", this.b, ", subtitle=", this.c, ", shortcutId=");
        g8e.D(r, this.d, ", onboardingId=", this.e, ", analyticsPayload=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    public ShowOnboardingAction() {
        FormattedText formattedText = FormattedText.c;
        this.b = formattedText;
        this.c = formattedText;
        this.d = "";
        this.e = "";
        this.f = null;
    }
}
