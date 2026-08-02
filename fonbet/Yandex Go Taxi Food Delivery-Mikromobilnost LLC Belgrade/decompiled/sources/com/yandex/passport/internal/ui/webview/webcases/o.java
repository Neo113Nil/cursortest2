package com.yandex.passport.internal.ui.webview.webcases;

import android.os.Bundle;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class o {
    public final WebViewActivity a;
    public final com.yandex.passport.internal.network.client.c b;
    public final Environment c;
    public final Bundle d;

    public o(WebViewActivity webViewActivity, com.yandex.passport.internal.network.client.c cVar, Environment environment, Bundle bundle) {
        this.a = webViewActivity;
        this.b = cVar;
        this.c = environment;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.a == oVar.a && jl40.l(this.b, oVar.b) && this.c == oVar.c && this.d.equals(oVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WebCaseParams(activity=" + this.a + ", clientChooser=" + this.b + ", environment=" + this.c + ", data=" + this.d + ')';
    }
}
