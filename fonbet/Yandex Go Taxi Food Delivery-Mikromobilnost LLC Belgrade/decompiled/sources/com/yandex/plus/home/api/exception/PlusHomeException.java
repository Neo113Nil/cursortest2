package com.yandex.plus.home.api.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/plus/home/api/exception/PlusHomeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "plus-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public class PlusHomeException extends RuntimeException {
    public PlusHomeException(int i) {
        super((i & 1) != 0 ? null : "Google billing config is null", null);
    }

    public PlusHomeException() {
        this(3);
    }
}
