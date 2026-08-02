package com.yandex.go.external_service.preloader.data;

import com.yandex.go.external_service.preloader.data.models.Manifest;
import com.yandex.go.external_service.preloader.data.models.StaticInfo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p4j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.y6i0;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/external_service/preloader/data/models/StaticInfo;", "<anonymous>", "(Ltse;)Lcom/yandex/go/external_service/preloader/data/models/StaticInfo;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.external_service.preloader.data.ManifestRepository$preload$2", f = "ManifestRepository.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ManifestRepository$preload$2 extends SuspendLambda implements wls {
    final /* synthetic */ Set<String> $urls;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManifestRepository$preload$2(a aVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$urls = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ManifestRepository$preload$2 manifestRepository$preload$2 = new ManifestRepository$preload$2(this.this$0, this.$urls, continuation);
        manifestRepository$preload$2.L$0 = obj;
        return manifestRepository$preload$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ManifestRepository$preload$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x008a -> B:5:0x008d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection arrayList;
        a aVar;
        Iterator it;
        a aVar2;
        int i;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            p4j0 p4j0Var = this.this$0.a;
            int d = y6i0.d(p4j0Var.c, 1, this.$urls.size());
            a aVar3 = this.this$0;
            ArrayList F = kotlin.collections.a.F(this.$urls, d);
            a aVar4 = this.this$0;
            arrayList = new ArrayList();
            aVar = aVar4;
            it = F.iterator();
            aVar2 = aVar3;
            i = d;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            aVar2 = (a) this.L$8;
            it = (Iterator) this.L$5;
            arrayList = (Collection) this.L$4;
            aVar = (a) this.L$2;
            kotlin.b.b(obj);
            ycc.r((Iterable) obj, arrayList);
            if (it.hasNext()) {
                List list = (List) it.next();
                this.L$0 = tseVar;
                this.L$1 = null;
                this.L$2 = aVar;
                this.L$3 = null;
                this.L$4 = arrayList;
                this.L$5 = it;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = aVar2;
                this.I$0 = i;
                this.label = 1;
                obj = a.a(aVar, tseVar, list, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ycc.r((Iterable) obj, arrayList);
                if (it.hasNext()) {
                    aVar2.getClass();
                    List list2 = (List) arrayList;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ycc.r(((Manifest) it2.next()).a, arrayList2);
                    }
                    Set N0 = kotlin.collections.a.N0(arrayList2);
                    MapBuilder mapBuilder = new MapBuilder();
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        mapBuilder.putAll(((Manifest) it3.next()).b);
                    }
                    return new StaticInfo(N0, mapBuilder.j());
                }
            }
        }
    }
}
