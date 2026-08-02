package com.yandex.go.transfer_requirement.state.service_section;

import android.graphics.drawable.Drawable;
import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.bvf0;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.yo01;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a {
    public final c a;
    public final e b;

    public a(c cVar, e eVar) {
        this.a = cVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        ServiceSectionUiStateMapper$loadIcon$1 serviceSectionUiStateMapper$loadIcon$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ServiceSectionUiStateMapper$loadIcon$1) {
            serviceSectionUiStateMapper$loadIcon$1 = (ServiceSectionUiStateMapper$loadIcon$1) continuationImpl;
            int i2 = serviceSectionUiStateMapper$loadIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                serviceSectionUiStateMapper$loadIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = serviceSectionUiStateMapper$loadIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = serviceSectionUiStateMapper$loadIcon$1.label;
                if (i != 0) {
                    b.b(obj);
                    e eVar = aVar.b;
                    serviceSectionUiStateMapper$loadIcon$1.L$0 = str;
                    serviceSectionUiStateMapper$loadIcon$1.label = 1;
                    obj = e.f(eVar, str, null, serviceSectionUiStateMapper$loadIcon$1, 6);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) serviceSectionUiStateMapper$loadIcon$1.L$0;
                    b.b(obj);
                }
                return pkf.g((Drawable) obj, str, null);
            }
        }
        serviceSectionUiStateMapper$loadIcon$1 = new ServiceSectionUiStateMapper$loadIcon$1(aVar, continuationImpl);
        Object obj2 = serviceSectionUiStateMapper$loadIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = serviceSectionUiStateMapper$loadIcon$1.label;
        if (i != 0) {
        }
        return pkf.g((Drawable) obj2, str, null);
    }

    public final Object b(TransferRequirementExperiment.Card.ServiceSectionDto serviceSectionDto, yo01 yo01Var, boolean z, Map map, Continuation continuation) {
        return bvf0.n(new ServiceSectionUiStateMapper$map$2(serviceSectionDto, z, this, yo01Var, map, null), continuation);
    }
}
