package com.yandex.go.places.api.map;

import defpackage.bk21;
import defpackage.t691;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        b bVar = this.a;
        t691 t691Var = bVar.C;
        bk21 bk21Var = t691Var instanceof bk21 ? (bk21) t691Var : null;
        if (bk21Var != null) {
            bVar.D = tje.N(bVar.w, null, null, new UserAvatarPlaceholder$loadAvatar$1(bVar, bk21Var.a, null), 3);
        }
        return zy11.a;
    }
}
