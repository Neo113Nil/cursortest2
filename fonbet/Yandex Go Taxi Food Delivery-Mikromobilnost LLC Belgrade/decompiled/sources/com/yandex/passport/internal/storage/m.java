package com.yandex.passport.internal.storage;

import defpackage.btq0;
import defpackage.mdh;
import defpackage.mx11;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zy11;
import java.io.FileInputStream;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class m implements btq0 {
    public static final m a = new m();

    @Override // defpackage.btq0
    public final /* bridge */ /* synthetic */ Object a() {
        return EmptySet.a;
    }

    @Override // defpackage.btq0
    public final Object b(FileInputStream fileInputStream, Continuation continuation) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new UidWithTtlSetSerializer$readFrom$2(fileInputStream, null), continuation);
    }

    @Override // defpackage.btq0
    public final Object c(Object obj, mx11 mx11Var, Continuation continuation) {
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new UidWithTtlSetSerializer$writeTo$2(mx11Var, (Set) obj, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
