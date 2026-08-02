package com.yandex.go.explorer.impl.ui.map;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.map.CameraPosition;
import defpackage.gh00;
import defpackage.guo;
import defpackage.i3y;
import defpackage.ito;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xto;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.ui.map.ExplorerPresenter$showWithUnviewedAnimation$1", f = "ExplorerPresenter.kt", l = {HProv.PP_SECURITY_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerPresenter$showWithUnviewedAnimation$1 extends SuspendLambda implements wls {
    int I$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerPresenter$showWithUnviewedAnimation$1(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerPresenter$showWithUnviewedAnimation$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerPresenter$showWithUnviewedAnimation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.go.explorer.impl.ui.map.d] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        final List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            if (!this.this$0.F.isEmpty()) {
                l lVar = this.this$0;
                if (lVar.G == lVar.B.d) {
                    i = 1;
                    l lVar2 = this.this$0;
                    if (i == 0) {
                        list = lVar2.F;
                        if (!list.isEmpty()) {
                            l lVar3 = this.this$0;
                            CameraPosition cameraPosition = ((gh00) lVar3.z).e.c;
                            if (cameraPosition.getZoom() > 16.0f) {
                                ((gh00) lVar3.z).g.k(new CameraPosition(cameraPosition.getTarget(), 16.0f, cameraPosition.getAzimuth(), cameraPosition.getTilt()), 500.0f, Animation.Type.SMOOTH, null);
                            }
                        }
                        guo guoVar = (guo) this.this$0.Dg();
                        final l lVar4 = this.this$0;
                        guoVar.ee(lVar4.B, new sls() { // from class: com.yandex.go.explorer.impl.ui.map.d
                            @Override // defpackage.sls
                            public final Object invoke() {
                                List list2 = list;
                                boolean isEmpty = list2.isEmpty();
                                l lVar5 = lVar4;
                                if (isEmpty) {
                                    tje.N(lVar5.Jg(), null, null, new ExplorerPresenter$markAllCellsAsViewed$1(lVar5, null), 3);
                                } else {
                                    tje.N(lVar5.Jg(), null, null, new ExplorerPresenter$showWithUnviewedAnimation$1$1$1(lVar5, list2, null), 3);
                                }
                                return zy11.a;
                            }
                        });
                        return zy11.a;
                    }
                    com.yandex.go.explorer.impl.data.repositories.a aVar = lVar2.x;
                    this.I$0 = i;
                    this.label = 1;
                    obj = aVar.c(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            i = 0;
            l lVar22 = this.this$0;
            if (i == 0) {
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        List list2 = (List) obj;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Long(((ito) it.next()).a));
        }
        i3y i3yVar = xto.a;
        list = kotlin.collections.a.J0(xto.b(this.this$0.B.d, kotlin.collections.a.N0(arrayList)));
        ((guo) this.this$0.Dg()).F9(list);
        if (!list.isEmpty()) {
        }
        guo guoVar2 = (guo) this.this$0.Dg();
        final l lVar42 = this.this$0;
        guoVar2.ee(lVar42.B, new sls() { // from class: com.yandex.go.explorer.impl.ui.map.d
            @Override // defpackage.sls
            public final Object invoke() {
                List list22 = list;
                boolean isEmpty = list22.isEmpty();
                l lVar5 = lVar42;
                if (isEmpty) {
                    tje.N(lVar5.Jg(), null, null, new ExplorerPresenter$markAllCellsAsViewed$1(lVar5, null), 3);
                } else {
                    tje.N(lVar5.Jg(), null, null, new ExplorerPresenter$showWithUnviewedAnimation$1$1$1(lVar5, list22, null), 3);
                }
                return zy11.a;
            }
        });
        return zy11.a;
    }
}
