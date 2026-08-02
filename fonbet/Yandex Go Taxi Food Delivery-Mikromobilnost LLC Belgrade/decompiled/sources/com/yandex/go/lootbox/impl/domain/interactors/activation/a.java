package com.yandex.go.lootbox.impl.domain.interactors.activation;

import com.yandex.go.lootbox.api.domain.entities.lootbox.content.LootBoxContentTypeEntity;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wnt;
import defpackage.zuj0;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.go.lootbox.impl.data.repository.activation.a a;
    public final zuj0 b;
    public final wnt c;
    public final tt2 d;

    public a(com.yandex.go.lootbox.impl.data.repository.activation.a aVar, zuj0 zuj0Var, wnt wntVar, tt2 tt2Var) {
        this.a = aVar;
        this.b = zuj0Var;
        this.c = wntVar;
        this.d = tt2Var;
    }

    public final Object a(String str, LootBoxContentTypeEntity lootBoxContentTypeEntity, String str2, String str3, SuspendLambda suspendLambda) {
        this.d.getClass();
        return tje.k0(uyj.a, new LootBoxActivationInteractorImpl$activateLootBox$2(this, str, lootBoxContentTypeEntity, str2, str3, null), suspendLambda);
    }
}
