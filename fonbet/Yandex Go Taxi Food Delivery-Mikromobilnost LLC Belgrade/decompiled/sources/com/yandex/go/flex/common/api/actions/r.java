package com.yandex.go.flex.common.api.actions;

import defpackage.bcx;
import defpackage.gsq0;
import defpackage.i2v;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;

@bcx(discriminator = "type")
@gsq0
/* loaded from: classes.dex */
public abstract class r {
    public static final q Companion = new q();
    public static final i3y b = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i2v(21));
    public final String a;

    public /* synthetic */ r(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public r(String str) {
        this.a = str;
    }
}
