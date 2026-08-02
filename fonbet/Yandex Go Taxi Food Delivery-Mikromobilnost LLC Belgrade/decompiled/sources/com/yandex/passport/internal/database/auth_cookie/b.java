package com.yandex.passport.internal.database.auth_cookie;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.database.PassportDatabase_Impl;
import defpackage.auu0;
import defpackage.p53;
import defpackage.rbx;
import defpackage.sbx;
import defpackage.z2o;
import defpackage.zfs;
import java.util.List;

/* loaded from: classes8.dex */
public final class b extends z2o {
    public final /* synthetic */ d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, PassportDatabase_Impl passportDatabase_Impl) {
        super(passportDatabase_Impl);
        this.d = dVar;
    }

    @Override // defpackage.hjv
    public final String c() {
        return "INSERT OR REPLACE INTO `modern_auth_cookie` (`uid`,`cookies`,`domain`) VALUES (?,?,?)";
    }

    @Override // defpackage.z2o
    public final void m(zfs zfsVar, Object obj) {
        f fVar = (f) obj;
        d dVar = this.d;
        com.yandex.passport.internal.database.converters.b bVar = dVar.c;
        Uid d = fVar.d();
        bVar.getClass();
        rbx rbxVar = sbx.d;
        zfsVar.m0(1, rbxVar.c(d, com.yandex.passport.internal.serialization.a.a));
        com.yandex.passport.internal.database.converters.a aVar = dVar.d;
        List b = fVar.b();
        aVar.getClass();
        rbxVar.getClass();
        zfsVar.m0(2, rbxVar.c(b, new p53(auu0.a, 0)));
        if (fVar.c() == null) {
            zfsVar.p(3);
        } else {
            zfsVar.m0(3, fVar.c());
        }
    }
}
