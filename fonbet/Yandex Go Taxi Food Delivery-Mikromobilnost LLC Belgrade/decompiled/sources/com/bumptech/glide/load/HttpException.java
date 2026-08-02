package com.bumptech.glide.load;

import defpackage.qv10;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class HttpException extends IOException {
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public HttpException(int i, IOException iOException, String str) {
        super(qv10.h(i, str, ", status code: "), iOException);
        this.statusCode = i;
    }
}
