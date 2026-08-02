package com.ybsdk.core.design.spoiler;

import androidx.lifecycle.p;
import com.ybsdk.navigation.NavigationFragment;
import defpackage.bvf0;
import defpackage.tje;
import defpackage.uvt0;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public abstract class d {
    public static final r0 a;
    public static final r0 b;

    static {
        r0 c = bvf0.c(Boolean.FALSE);
        a = c;
        b = c;
    }

    public static void a(uvt0 uvt0Var, p pVar, NavigationFragment navigationFragment) {
        tje.N(pVar, null, null, new SpoilerStateHolder$init$1(uvt0Var, null), 3);
        new WeakReference(navigationFragment);
    }
}
