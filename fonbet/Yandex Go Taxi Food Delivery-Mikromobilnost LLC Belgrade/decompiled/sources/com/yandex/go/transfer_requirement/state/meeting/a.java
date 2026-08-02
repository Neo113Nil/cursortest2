package com.yandex.go.transfer_requirement.state.meeting;

import android.graphics.drawable.Drawable;
import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.bvf0;
import defpackage.ny61;
import defpackage.pkf;
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
        MeetingSectionUiStateMapper$loadIcon$1 meetingSectionUiStateMapper$loadIcon$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof MeetingSectionUiStateMapper$loadIcon$1) {
            meetingSectionUiStateMapper$loadIcon$1 = (MeetingSectionUiStateMapper$loadIcon$1) continuationImpl;
            int i2 = meetingSectionUiStateMapper$loadIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                meetingSectionUiStateMapper$loadIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = meetingSectionUiStateMapper$loadIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = meetingSectionUiStateMapper$loadIcon$1.label;
                if (i != 0) {
                    b.b(obj);
                    e eVar = aVar.b;
                    meetingSectionUiStateMapper$loadIcon$1.L$0 = str;
                    meetingSectionUiStateMapper$loadIcon$1.label = 1;
                    obj = e.f(eVar, str, null, meetingSectionUiStateMapper$loadIcon$1, 6);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) meetingSectionUiStateMapper$loadIcon$1.L$0;
                    b.b(obj);
                }
                return pkf.g((Drawable) obj, str, null);
            }
        }
        meetingSectionUiStateMapper$loadIcon$1 = new MeetingSectionUiStateMapper$loadIcon$1(aVar, continuationImpl);
        Object obj2 = meetingSectionUiStateMapper$loadIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = meetingSectionUiStateMapper$loadIcon$1.label;
        if (i != 0) {
        }
        return pkf.g((Drawable) obj2, str, null);
    }

    public final Object b(TransferRequirementExperiment.Card.MeetingSectionDto meetingSectionDto, String str, String str2, Map map, Continuation continuation) {
        return bvf0.n(new MeetingSectionUiStateMapper$map$2(map, meetingSectionDto, this, str2, str, null), continuation);
    }
}
