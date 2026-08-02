package com.yandex.passport.data.exceptions;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/passport/data/exceptions/EbsBackendErrorsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "", "errors", "Ljava/util/List;", "a", "()Ljava/util/List;", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EbsBackendErrorsException extends Exception {
    private final List<String> errors;

    public EbsBackendErrorsException(List list) {
        super(kotlin.collections.a.X(list, ",", null, null, null, 62));
        this.errors = list;
    }

    /* renamed from: a, reason: from getter */
    public final List getErrors() {
        return this.errors;
    }
}
