package com.yandex.div.core.view2;

import android.view.View;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class AccessibilityListDelegate$firstChild$1 extends FunctionReferenceImpl implements tls {
    public static final AccessibilityListDelegate$firstChild$1 b = new AccessibilityListDelegate$firstChild$1(1, 0, View.class, "getTop", "getTop()I");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Integer.valueOf(((View) obj).getTop());
    }
}
