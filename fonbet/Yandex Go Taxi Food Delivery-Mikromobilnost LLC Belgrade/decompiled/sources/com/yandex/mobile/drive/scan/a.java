package com.yandex.mobile.drive.scan;

import com.yandex.mobile.drive.scan.service.d;
import defpackage.jdj;
import defpackage.jdm;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a {
    public final jdj a;
    public final boolean b;
    public final boolean c;
    public final jdm d = new jdm();

    public a(jdj jdjVar, boolean z, boolean z2) {
        this.a = jdjVar;
        this.b = z;
        this.c = z2;
    }

    public final Object a(Continuation continuation) {
        this.d.getClass();
        return d.a.c(new DriveDocUploader$uploadPendingDocuments$2(3, null), (ContinuationImpl) continuation);
    }
}
