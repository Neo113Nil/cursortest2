package com.yandex.go.multimodal_route.store;

import com.yandex.go.multimodal_route.experiement.c;
import com.yandex.go.multimodal_route.network.models.MultimodalRoutesOrderDto;
import com.yandex.go.multimodal_route.network.models.MultimodalRoutesOrderPartDto;
import com.yandex.go.multimodal_route.service.MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$1;
import defpackage.ck;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.on2;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wr40;
import defpackage.yu40;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a {
    public final yu40 a;
    public final c b;
    public final tt2 c;
    public final wr40 d;
    public final i3y e;

    public a(on2 on2Var, yu40 yu40Var, c cVar, tt2 tt2Var, wr40 wr40Var) {
        this.a = yu40Var;
        this.b = cVar;
        this.c = tt2Var;
        this.d = wr40Var;
        this.e = kotlin.a.a(new ck(on2Var, 16));
    }

    public final Object a(List list, MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$1.AnonymousClass1 anonymousClass1) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new MultimodalHasOrdersRepositoryImpl$checkIfIdsInMultimodalStore$2(list, this, null), anonymousClass1);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final boolean b(String str, String str2) {
        Object obj;
        String b;
        yu40 yu40Var = this.a;
        Iterator it = yu40Var.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            MultimodalRoutesOrderDto multimodalRoutesOrderDto = (MultimodalRoutesOrderDto) obj;
            if (jl40.l(multimodalRoutesOrderDto.getB().getB(), str) || (multimodalRoutesOrderDto.getB().getC() != null && jl40.l(multimodalRoutesOrderDto.getB().getC(), str2))) {
                break;
            }
        }
        MultimodalRoutesOrderDto multimodalRoutesOrderDto2 = (MultimodalRoutesOrderDto) obj;
        if (multimodalRoutesOrderDto2 != null && ((b = multimodalRoutesOrderDto2.getB().getB()) == null || b.length() == 0)) {
            yu40Var.a(MultimodalRoutesOrderDto.a(multimodalRoutesOrderDto2, MultimodalRoutesOrderPartDto.a(multimodalRoutesOrderDto2.getB(), str)));
        }
        return multimodalRoutesOrderDto2 != null;
    }
}
