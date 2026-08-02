package com.yandex.go.taxi.order.change.requirements.repository;

import com.yandex.go.taxi.order.change.requirements.api.ChangeRequirementsApi;
import com.yandex.go.taxi.order.change.requirements.api.ChangeRequirementsRequest;
import com.yandex.go.taxi.order.change.requirements.api.ChangeRequirementsResponse;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.h3y;
import defpackage.jf9;
import defpackage.jv8;
import defpackage.kf9;
import defpackage.lf9;
import defpackage.mf9;
import defpackage.nf9;
import defpackage.ny61;
import defpackage.w511;
import defpackage.yu0;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.b;

/* loaded from: classes14.dex */
public final class a {
    public final h3y a;
    public final LinkedHashMap b = new LinkedHashMap();

    public a(h3y h3yVar) {
        this.a = h3yVar;
    }

    public static nf9 b(ChangeRequirementsResponse changeRequirementsResponse, String str) {
        int i = kf9.a[changeRequirementsResponse.a.ordinal()];
        if (i == 1) {
            return new lf9(str, changeRequirementsResponse.b);
        }
        if (i == 2 || i == 3) {
            return mf9.a;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl, b bVar) {
        ChangeRequirementsRepository$changeRequirements$1 changeRequirementsRepository$changeRequirements$1;
        int i;
        try {
            if (continuationImpl instanceof ChangeRequirementsRepository$changeRequirements$1) {
                changeRequirementsRepository$changeRequirements$1 = (ChangeRequirementsRepository$changeRequirements$1) continuationImpl;
                int i2 = changeRequirementsRepository$changeRequirements$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    changeRequirementsRepository$changeRequirements$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = changeRequirementsRepository$changeRequirements$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = changeRequirementsRepository$changeRequirements$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<ChangeRequirementsResponse> a = ((ChangeRequirementsApi) this.a.get()).a((String) this.b.computeIfAbsent(new jf9(str, bVar), new yu0(4, new jv8(17))), new ChangeRequirementsRequest(str, bVar));
                        changeRequirementsRepository$changeRequirements$1.L$0 = str;
                        changeRequirementsRepository$changeRequirements$1.L$1 = null;
                        changeRequirementsRepository$changeRequirements$1.L$2 = null;
                        changeRequirementsRepository$changeRequirements$1.L$3 = this;
                        changeRequirementsRepository$changeRequirements$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.b(a, null, changeRequirementsRepository$changeRequirements$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (a) changeRequirementsRepository$changeRequirements$1.L$3;
                        str = (String) changeRequirementsRepository$changeRequirements$1.L$0;
                        kotlin.b.b(obj);
                    }
                    ChangeRequirementsResponse changeRequirementsResponse = (ChangeRequirementsResponse) ((fmt) obj).a;
                    this.getClass();
                    return b(changeRequirementsResponse, str);
                }
            }
            if (i != 0) {
            }
            ChangeRequirementsResponse changeRequirementsResponse2 = (ChangeRequirementsResponse) ((fmt) obj).a;
            this.getClass();
            return b(changeRequirementsResponse2, str);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return mf9.a;
        }
        changeRequirementsRepository$changeRequirements$1 = new ChangeRequirementsRepository$changeRequirements$1(this, continuationImpl);
        Object obj2 = changeRequirementsRepository$changeRequirements$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeRequirementsRepository$changeRequirements$1.label;
    }
}
