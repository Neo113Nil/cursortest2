package com.yandex.go.requirements.comment.summary.ui.v3.data;

import defpackage.bvf0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class h {
    public final r0 a = bvf0.c(new b(UpdateReason.Fill, UpdateSource.Initial, ""));

    public final void a(String str) {
        b bVar = new b(UpdateReason.Fill, UpdateSource.Initial, str);
        r0 r0Var = this.a;
        r0Var.getClass();
        r0Var.m(null, bVar);
    }

    public final void b(String str) {
        b bVar = new b(UpdateReason.Fill, UpdateSource.User, str);
        r0 r0Var = this.a;
        r0Var.getClass();
        r0Var.m(null, bVar);
    }

    public final void c(String str) {
        b bVar = new b(UpdateReason.Input, UpdateSource.User, str);
        r0 r0Var = this.a;
        r0Var.getClass();
        r0Var.m(null, bVar);
    }
}
