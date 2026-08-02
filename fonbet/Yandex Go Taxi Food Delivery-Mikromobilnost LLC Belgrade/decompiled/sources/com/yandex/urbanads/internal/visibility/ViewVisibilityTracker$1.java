package com.yandex.urbanads.internal.visibility;

import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class ViewVisibilityTracker$1 extends FunctionReferenceImpl implements sls {
    public static final ViewVisibilityTracker$1 b = new ViewVisibilityTracker$1(0, 0, System.class, "currentTimeMillis", "currentTimeMillis()J");

    @Override // defpackage.sls
    public final Object invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
