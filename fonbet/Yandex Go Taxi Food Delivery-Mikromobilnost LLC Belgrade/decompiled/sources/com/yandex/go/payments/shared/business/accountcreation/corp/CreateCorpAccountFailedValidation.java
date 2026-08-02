package com.yandex.go.payments.shared.business.accountcreation.corp;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/CreateCorpAccountFailedValidation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "", "fieldMap", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreateCorpAccountFailedValidation extends RuntimeException {
    private final Map<String, String> fieldMap;

    public CreateCorpAccountFailedValidation(LinkedHashMap linkedHashMap) {
        this.fieldMap = linkedHashMap;
    }

    /* renamed from: a, reason: from getter */
    public final Map getFieldMap() {
        return this.fieldMap;
    }
}
