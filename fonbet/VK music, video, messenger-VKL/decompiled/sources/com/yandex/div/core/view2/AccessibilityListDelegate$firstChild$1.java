package com.yandex.div.core.view2;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;

/* compiled from: AccessibilityListDelegate.kt */
/* loaded from: classes7.dex */
public /* synthetic */ class AccessibilityListDelegate$firstChild$1 extends FunctionReferenceImpl implements izs<View, Integer> {
    public static final AccessibilityListDelegate$firstChild$1 INSTANCE = new AccessibilityListDelegate$firstChild$1();

    public AccessibilityListDelegate$firstChild$1() {
        super(1, View.class, "getTop", "getTop()I", 0);
    }

    @Override // xsna.izs
    public final Integer invoke(View view) {
        return Integer.valueOf(view.getTop());
    }
}
