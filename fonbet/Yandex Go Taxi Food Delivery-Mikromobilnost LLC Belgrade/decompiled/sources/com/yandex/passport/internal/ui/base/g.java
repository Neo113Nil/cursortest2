package com.yandex.passport.internal.ui.base;

import com.yandex.passport.internal.analytics.a0;
import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.pq60;
import defpackage.tls;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements pq60, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ g(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.pq60
    public final /* synthetic */ void a(Object obj) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(obj);
                break;
            case 1:
                ((a0) tlsVar).invoke(obj);
                break;
            default:
                ((com.yandex.passport.internal.ui.domik.common.a) tlsVar).invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof pq60) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof pq60) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof pq60) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                return tlsVar;
            case 1:
                return (a0) tlsVar;
            default:
                return (com.yandex.passport.internal.ui.domik.common.a) tlsVar;
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
