package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import xsna.vga0;

/* renamed from: io.appmetrica.analytics.impl.qn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5127qn {
    public final C5332z0 a;
    public final Ro b;
    public final C5051o c;
    public final C4866gl d;
    public final Q5 e;
    public final C5062oa f;

    public C5127qn(C5332z0 c5332z0, Ro ro, C5051o c5051o, C4866gl c4866gl, Q5 q5, C5062oa c5062oa) {
        this.a = c5332z0;
        this.b = ro;
        this.c = c5051o;
        this.d = c4866gl;
        this.e = q5;
        this.f = c5062oa;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new vga0(12));
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C5127qn(C5332z0 c5332z0, Ro ro) {
        this(c5332z0, ro, C5030n4.l().a(), C5030n4.l().o(), C5030n4.l().h(), C5030n4.l().k());
    }
}
