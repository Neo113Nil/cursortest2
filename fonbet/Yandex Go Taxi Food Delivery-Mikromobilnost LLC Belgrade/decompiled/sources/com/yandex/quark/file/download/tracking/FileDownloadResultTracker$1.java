package com.yandex.quark.file.download.tracking;

import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class FileDownloadResultTracker$1 extends FunctionReferenceImpl implements sls {
    public static final FileDownloadResultTracker$1 b = new FileDownloadResultTracker$1(0, 0, System.class, "currentTimeMillis", "currentTimeMillis()J");

    @Override // defpackage.sls
    public final Object invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
