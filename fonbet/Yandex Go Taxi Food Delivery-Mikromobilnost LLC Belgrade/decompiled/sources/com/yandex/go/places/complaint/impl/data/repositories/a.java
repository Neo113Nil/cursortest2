package com.yandex.go.places.complaint.impl.data.repositories;

import com.yandex.go.places.complaint.impl.data.api.ComplaintsInternalApi;
import com.yandex.go.places.complaint.impl.data.dto.ComplaintRequestParams;
import defpackage.cmt;
import defpackage.ny61;
import defpackage.pxc;
import defpackage.qxc;
import defpackage.yn3;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final yn3 a;

    public a(yn3 yn3Var) {
        this.a = yn3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, long j, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        ComplaintsRepository$sendComplaint$1 complaintsRepository$sendComplaint$1;
        int i;
        try {
            if (continuationImpl instanceof ComplaintsRepository$sendComplaint$1) {
                complaintsRepository$sendComplaint$1 = (ComplaintsRepository$sendComplaint$1) continuationImpl;
                int i2 = complaintsRepository$sendComplaint$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    complaintsRepository$sendComplaint$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = complaintsRepository$sendComplaint$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = complaintsRepository$sendComplaint$1.label;
                    if (i != 0) {
                        b.b(obj);
                        cmt<zy11> a = ((ComplaintsInternalApi) this.a.a.getValue()).a(str, new ComplaintRequestParams(16, j, str2, str3, str4));
                        complaintsRepository$sendComplaint$1.L$0 = null;
                        complaintsRepository$sendComplaint$1.L$1 = null;
                        complaintsRepository$sendComplaint$1.L$2 = null;
                        complaintsRepository$sendComplaint$1.L$3 = null;
                        complaintsRepository$sendComplaint$1.L$4 = null;
                        complaintsRepository$sendComplaint$1.J$0 = j;
                        complaintsRepository$sendComplaint$1.label = 1;
                        if (ru.yandex.taxi.network.api.a.a(a, null, complaintsRepository$sendComplaint$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return qxc.a;
                }
            }
            if (i != 0) {
            }
            return qxc.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new pxc(th);
        }
        complaintsRepository$sendComplaint$1 = new ComplaintsRepository$sendComplaint$1(this, continuationImpl);
        Object obj2 = complaintsRepository$sendComplaint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = complaintsRepository$sendComplaint$1.label;
    }
}
