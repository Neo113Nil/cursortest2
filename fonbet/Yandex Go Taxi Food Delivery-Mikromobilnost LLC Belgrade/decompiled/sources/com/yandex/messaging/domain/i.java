package com.yandex.messaging.domain;

import com.yandex.messaging.core.net.entities.Metadata;
import defpackage.e920;
import defpackage.evu0;
import defpackage.f920;
import defpackage.ny61;
import defpackage.tga1;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f920 b;

    public i(vpr vprVar, f920 f920Var) {
        this.a = vprVar;
        this.b = f920Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MetadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1 metadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1;
        int i;
        Boolean bool;
        String str;
        if (continuation instanceof MetadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1) {
            metadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1 = (MetadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1) continuation;
            int i2 = metadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                metadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = metadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = metadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1.label;
                e920 e920Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Metadata metadata = (Metadata) obj;
                    boolean booleanValue = !tga1.e(this.b.c) ? true : (metadata == null || (bool = metadata.allowUnsafeMiniapp) == null) ? false : bool.booleanValue();
                    if (metadata != null && (str = metadata.miniappUrl) != null) {
                        if (evu0.J(str)) {
                            str = null;
                        }
                        if (str != null) {
                            e920Var = new e920(str, booleanValue);
                        }
                    }
                    metadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(e920Var, metadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        metadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1 = new MetadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1(this, continuation);
        Object obj22 = metadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = metadataInteractor$getChatMiniappMetadata$$inlined$map$1$2$1.label;
        e920 e920Var2 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
