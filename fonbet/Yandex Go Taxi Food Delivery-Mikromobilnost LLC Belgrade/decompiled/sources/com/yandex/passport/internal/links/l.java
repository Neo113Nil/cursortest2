package com.yandex.passport.internal.links;

import com.yandex.passport.internal.ui.sloth.webcard.q0;
import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.u40;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes15.dex */
public final /* synthetic */ class l implements u40, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinksHandlingActivity b;

    public /* synthetic */ l(LinksHandlingActivity linksHandlingActivity, int i) {
        this.a = i;
        this.b = linksHandlingActivity;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        int i = this.a;
        LinksHandlingActivity linksHandlingActivity = this.b;
        switch (i) {
            case 0:
                linksHandlingActivity.processWebCardResult((q0) obj);
                break;
            default:
                linksHandlingActivity.processWebCardResult((q0) obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof u40) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof u40) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
        }
        return new FunctionReferenceImpl(1, this.b, LinksHandlingActivity.class, "processWebCardResult", "processWebCardResult(Lcom/yandex/passport/internal/ui/sloth/webcard/WebCardResult;)V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
