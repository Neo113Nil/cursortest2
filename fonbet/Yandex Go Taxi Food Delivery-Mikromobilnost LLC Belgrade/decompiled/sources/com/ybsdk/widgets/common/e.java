package com.ybsdk.widgets.common;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import defpackage.bks;

/* loaded from: classes4.dex */
public abstract class e {
    public final bks a;
    public final YbButtonViewGroup.b b;
    public final boolean c;

    public e(bks bksVar, YbButtonViewGroup.b bVar, int i) {
        bksVar = (i & 4) != 0 ? null : bksVar;
        bVar = (i & 8) != 0 ? null : bVar;
        boolean z = (i & 16) == 0;
        this.a = bksVar;
        this.b = bVar;
        this.c = z;
    }

    public YbButtonViewGroup.b a() {
        return this.b;
    }

    public abstract boolean b();

    public bks c() {
        return this.a;
    }

    public abstract Text d();

    public abstract Text e();
}
