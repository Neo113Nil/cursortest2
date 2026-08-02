package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.e1d;
import defpackage.m3f;
import defpackage.q1r;
import defpackage.yuf0;
import defpackage.zbr;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements e1d {
    @Override // defpackage.e1d
    public final Object k(yuf0 yuf0Var) {
        Context context = (Context) yuf0Var.a(Context.class);
        return new zbr(new m3f(context, new JniNativeApi(context), new q1r(context)), !(CommonUtils.e(context, "com.google.firebase.crashlytics.unity_version", "string") != 0));
    }
}
