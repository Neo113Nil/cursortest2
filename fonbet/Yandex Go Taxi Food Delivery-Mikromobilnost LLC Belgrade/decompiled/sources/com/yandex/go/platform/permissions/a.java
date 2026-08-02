package com.yandex.go.platform.permissions;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import defpackage.ffx;
import defpackage.lza0;
import defpackage.p0b0;
import defpackage.tza0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class a implements lza0, tza0, p0b0 {
    public final Activity a;
    public final n0 b = ffx.c(0, 32, null, 5);

    public a(ComponentActivity componentActivity) {
        this.a = componentActivity;
    }

    public final Object a(int i, ContinuationImpl continuationImpl) {
        return e.x(this.b, new PermissionsController$awaitResult$2(i, null), continuationImpl);
    }
}
