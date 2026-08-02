package com.yandex.div.data;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/data/VariableDeclarationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VariableDeclarationException extends RuntimeException {
    public VariableDeclarationException(String str, int i) {
        super((i & 1) != 0 ? null : str, null);
    }

    public VariableDeclarationException() {
        this(null, 3);
    }
}
