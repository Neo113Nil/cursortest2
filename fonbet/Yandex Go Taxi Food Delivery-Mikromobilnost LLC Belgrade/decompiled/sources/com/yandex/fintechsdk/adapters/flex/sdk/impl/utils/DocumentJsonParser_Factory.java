package com.yandex.fintechsdk.adapters.flex.sdk.impl.utils;

import defpackage.d0m;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class DocumentJsonParser_Factory implements v7p {
    private final xvf0 documentJsonProvider;

    private DocumentJsonParser_Factory(xvf0 xvf0Var) {
        this.documentJsonProvider = xvf0Var;
    }

    public static DocumentJsonParser_Factory create(xvf0 xvf0Var) {
        return new DocumentJsonParser_Factory(xvf0Var);
    }

    public static DocumentJsonParser newInstance(d0m d0mVar) {
        return new DocumentJsonParser(d0mVar);
    }

    @Override // defpackage.yvf0
    public DocumentJsonParser get() {
        return newInstance((d0m) this.documentJsonProvider.get());
    }
}
