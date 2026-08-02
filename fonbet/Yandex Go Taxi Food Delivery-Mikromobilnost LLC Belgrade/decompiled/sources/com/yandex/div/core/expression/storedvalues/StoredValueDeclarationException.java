package com.yandex.div.core.expression.storedvalues;

import kotlin.Metadata;
import org.json.JSONException;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/expression/storedvalues/StoredValueDeclarationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StoredValueDeclarationException extends RuntimeException {
    public StoredValueDeclarationException(String str, IllegalArgumentException illegalArgumentException, int i) {
        super((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : illegalArgumentException);
    }

    public StoredValueDeclarationException() {
        this(null, null, 3);
    }

    public StoredValueDeclarationException(String str, JSONException jSONException) {
        super(str, jSONException);
    }
}
