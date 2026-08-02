package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.g0d;
import defpackage.j0d;
import defpackage.jx81;
import defpackage.vwi;
import defpackage.y2f;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        g0d b = j0d.b(y2f.class);
        b.c = "fire-cls-ndk";
        b.a(vwi.b(Context.class));
        b.g = new a();
        b.e(2);
        return Arrays.asList(b.c(), jx81.j("fire-cls-ndk", "20.0.3"));
    }
}
