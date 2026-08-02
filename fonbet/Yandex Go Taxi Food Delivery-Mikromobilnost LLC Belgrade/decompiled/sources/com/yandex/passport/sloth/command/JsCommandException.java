package com.yandex.passport.sloth.command;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/passport/sloth/command/JsCommandException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "methodName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "requestId", "c", "Lcom/yandex/passport/sloth/command/e;", "error", "Lcom/yandex/passport/sloth/command/e;", "a", "()Lcom/yandex/passport/sloth/command/e;", "passport-sloth_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JsCommandException extends Exception {
    private final e error;
    private final String methodName;
    private final String requestId;

    public JsCommandException(String str, String str2, e eVar) {
        super(eVar.a);
        this.methodName = str;
        this.requestId = str2;
        this.error = eVar;
    }

    /* renamed from: a, reason: from getter */
    public final e getError() {
        return this.error;
    }

    /* renamed from: b, reason: from getter */
    public final String getMethodName() {
        return this.methodName;
    }

    /* renamed from: c, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }
}
