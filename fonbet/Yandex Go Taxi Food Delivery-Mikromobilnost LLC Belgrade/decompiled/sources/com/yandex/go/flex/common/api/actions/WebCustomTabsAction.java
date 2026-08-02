package com.yandex.go.flex.common.api.actions;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/WebCustomTabsAction;", "Lcom/yandex/go/flex/common/api/actions/n;", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/w0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WebCustomTabsAction extends n {
    public static final w0 Companion = new w0();
    public final String b;
    public final Boolean c;

    public /* synthetic */ WebCustomTabsAction(int i, String str, Boolean bool) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebCustomTabsAction)) {
            return false;
        }
        WebCustomTabsAction webCustomTabsAction = (WebCustomTabsAction) obj;
        return jl40.l(this.b, webCustomTabsAction.b) && jl40.l(this.c, webCustomTabsAction.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.c;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "WebCustomTabsAction(url=" + this.b + ", wrapAuthUrl=" + this.c + Extension.C_BRAKE;
    }

    public WebCustomTabsAction() {
        this.b = null;
        this.c = null;
    }
}
