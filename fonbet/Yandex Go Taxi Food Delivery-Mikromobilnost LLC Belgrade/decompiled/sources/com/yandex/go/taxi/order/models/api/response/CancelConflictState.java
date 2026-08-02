package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/CancelConflictState;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/p", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CancelConflictState {
    public static final p Companion = new p();
    public final CancelConflictStateError a;

    public /* synthetic */ CancelConflictState(int i, CancelConflictStateError cancelConflictStateError) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = cancelConflictStateError;
        }
    }

    public final String toString() {
        CancelConflictStateErrorText cancelConflictStateErrorText;
        CancelConflictStateErrorText cancelConflictStateErrorText2;
        CancelConflictStateErrorText cancelConflictStateErrorText3;
        CancelConflictStateError cancelConflictStateError = this.a;
        String str = cancelConflictStateError != null ? cancelConflictStateError.a : null;
        String str2 = cancelConflictStateError != null ? cancelConflictStateError.b : null;
        String str3 = (cancelConflictStateError == null || (cancelConflictStateErrorText3 = cancelConflictStateError.c) == null) ? null : cancelConflictStateErrorText3.a;
        String str4 = (cancelConflictStateError == null || (cancelConflictStateErrorText2 = cancelConflictStateError.c) == null) ? null : cancelConflictStateErrorText2.b;
        String str5 = (cancelConflictStateError == null || (cancelConflictStateErrorText = cancelConflictStateError.c) == null) ? null : cancelConflictStateErrorText.c;
        CancelRules cancelRules = cancelConflictStateError != null ? cancelConflictStateError.d : null;
        StringBuilder v = b64.v("CancelConflictState1(cancelState=", str, ", code=", str2, ", title=");
        g8e.D(v, str3, ", message=", str4, ", messageSupport=");
        v.append(str5);
        v.append(", cancelRules=");
        v.append(cancelRules);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public CancelConflictState() {
        this.a = null;
    }
}
