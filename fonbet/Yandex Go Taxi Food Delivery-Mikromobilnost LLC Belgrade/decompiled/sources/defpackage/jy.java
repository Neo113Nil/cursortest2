package defpackage;

import core.network.mapi.exception.MapiClientException;

/* loaded from: classes2.dex */
public final class jy implements iy {
    public final qeu a;

    public jy(qeu qeuVar) {
        this.a = qeuVar;
    }

    @Override // defpackage.iy
    public final void handleActionParseError(hx hxVar, String str, Throwable th) {
        this.a.t(hxVar, (MapiClientException) th);
    }

    @Override // defpackage.iy
    public final void handleActionRequestError(hx hxVar, String str, Throwable th, Integer num) {
        this.a.b(hxVar, (MapiClientException) th);
    }
}
