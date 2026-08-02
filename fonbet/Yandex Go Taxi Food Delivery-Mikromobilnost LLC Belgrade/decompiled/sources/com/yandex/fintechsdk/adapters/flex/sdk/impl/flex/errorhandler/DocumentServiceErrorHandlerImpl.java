package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.errorhandler;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.utils.DocumentQueryMappingKt;
import defpackage.r2m;
import defpackage.u1m;
import defpackage.vg5;
import defpackage.wg5;
import kotlin.Metadata;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/errorhandler/DocumentServiceErrorHandlerImpl;", "Lr2m;", "Lvg5;", "errorHandler", "<init>", "(Lvg5;)V", "Lu1m;", "query", "", "requestId", "", "throwable", "Lzy11;", "handleDocumentParseError", "(Lu1m;Ljava/lang/String;Ljava/lang/Throwable;)V", "", Constants.INTENT_PARAM_RESPONSE_CODE, "handleDocumentRequestError", "(Lu1m;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Integer;)V", "Lvg5;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DocumentServiceErrorHandlerImpl implements r2m {
    private final vg5 errorHandler;

    public DocumentServiceErrorHandlerImpl(vg5 vg5Var) {
        this.errorHandler = vg5Var;
    }

    @Override // defpackage.r2m
    public void handleDocumentParseError(u1m query, String requestId, Throwable throwable) {
        vg5 vg5Var = this.errorHandler;
        DocumentQueryMappingKt.toBduiQuery(query);
        ((wg5) vg5Var).a.onError(throwable);
    }

    @Override // defpackage.r2m
    public void handleDocumentRequestError(u1m query, String requestId, Throwable throwable, Integer responseCode) {
        vg5 vg5Var = this.errorHandler;
        DocumentQueryMappingKt.toBduiQuery(query);
        ((wg5) vg5Var).a.onError(throwable);
    }
}
