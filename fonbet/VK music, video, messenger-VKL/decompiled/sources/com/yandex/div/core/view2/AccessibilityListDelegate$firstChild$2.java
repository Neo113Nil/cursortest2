package com.yandex.div.core.view2;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;

/* compiled from: AccessibilityListDelegate.kt */
/* loaded from: classes7.dex */
public /* synthetic */ class AccessibilityListDelegate$firstChild$2 extends FunctionReferenceImpl implements izs<View, Integer> {
    public static final AccessibilityListDelegate$firstChild$2 INSTANCE = new AccessibilityListDelegate$firstChild$2();

    public AccessibilityListDelegate$firstChild$2() {
        super(1, View.class, "getLeft", "getLeft()I", 0);
    }

    @Override // xsna.izs
    public final Integer invoke(View view) {
        return Integer.valueOf(view.getLeft());
    }
}
