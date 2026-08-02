package com.yandex.plus.glide;

import defpackage.a5d0;
import defpackage.ait;
import defpackage.bdp;
import defpackage.tls;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class GlideImageLoader$wrap$1 extends FunctionReferenceImpl implements tls {
    public GlideImageLoader$wrap$1(b bVar) {
        super(1, bVar, b.class, "getPlusImageConsumerTarget", "getPlusImageConsumerTarget(Lcom/yandex/plus/core/imageloader/PlusImageConsumer;)Lcom/yandex/plus/glide/GlideImageLoader$PlusImageConsumerTarget;", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        a5d0 a5d0Var = (a5d0) obj;
        b bVar = (b) this.receiver;
        WeakHashMap weakHashMap = bVar.b;
        ait aitVar = (ait) weakHashMap.get(a5d0Var);
        if (aitVar != null) {
            return aitVar;
        }
        ait aitVar2 = new ait(a5d0Var, new bdp(19, bVar, a5d0Var));
        weakHashMap.put(a5d0Var, aitVar2);
        return aitVar2;
    }
}
