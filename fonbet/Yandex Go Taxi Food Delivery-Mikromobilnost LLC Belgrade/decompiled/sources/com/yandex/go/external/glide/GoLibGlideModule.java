package com.yandex.go.external.glide;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import defpackage.h3y;
import defpackage.h6r;
import defpackage.i5m;
import defpackage.l0b;
import defpackage.nw60;
import defpackage.pt2;
import defpackage.qt2;
import defpackage.ynt;
import defpackage.yt2;
import defpackage.zzf;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/external/glide/GoLibGlideModule;", "Lyt2;", "<init>", "()V", "glide"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GoLibGlideModule extends yt2 {
    @Override // defpackage.qcy
    public final void a(Context context, Glide glide, Registry registry) {
        qt2 dependencyProvider;
        Object applicationContext = context.getApplicationContext();
        pt2 pt2Var = applicationContext instanceof pt2 ? (pt2) applicationContext : null;
        h6r h6rVar = (h6r) ((pt2Var == null || (dependencyProvider = pt2Var.dependencyProvider()) == null) ? null : dependencyProvider.a());
        h3y a = h6rVar != null ? i5m.a(((zzf) h6rVar).Z2) : null;
        if (a != null) {
            registry.j(new nw60(new ynt(0, a.a(new l0b(a, 2)))));
        }
    }
}
