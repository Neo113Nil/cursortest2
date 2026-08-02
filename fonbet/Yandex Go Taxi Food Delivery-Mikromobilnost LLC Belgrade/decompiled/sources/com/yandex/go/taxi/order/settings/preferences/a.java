package com.yandex.go.taxi.order.settings.preferences;

import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.a20;
import defpackage.cmt;
import defpackage.loq0;
import defpackage.ny61;
import defpackage.sk7;
import defpackage.w2r0;
import defpackage.zy11;
import java.util.Calendar;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a extends a20 {
    public final /* synthetic */ w2r0 c;

    public a(w2r0 w2r0Var) {
        this.c = w2r0Var;
    }

    @Override // defpackage.a20
    public final String a() {
        return "set don't call";
    }

    @Override // defpackage.a20
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj, Continuation continuation) {
        return e(str, (ContinuationImpl) continuation, ((Boolean) obj).booleanValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl, boolean z) {
        SetDontCallPreferences$SendDontCallDelegate$update$1 setDontCallPreferences$SendDontCallDelegate$update$1;
        int i;
        if (continuationImpl instanceof SetDontCallPreferences$SendDontCallDelegate$update$1) {
            setDontCallPreferences$SendDontCallDelegate$update$1 = (SetDontCallPreferences$SendDontCallDelegate$update$1) continuationImpl;
            int i2 = setDontCallPreferences$SendDontCallDelegate$update$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setDontCallPreferences$SendDontCallDelegate$update$1.label = i2 - Integer.MIN_VALUE;
                Object obj = setDontCallPreferences$SendDontCallDelegate$update$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setDontCallPreferences$SendDontCallDelegate$update$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    w2r0 w2r0Var = this.c;
                    sk7 a = w2r0Var.f.a(str);
                    cmt<OrderChangesDto.PendingChangeDto> d = w2r0Var.e.d(new loq0((String) a.b, (String) a.c, (Calendar) a.w, z));
                    setDontCallPreferences$SendDontCallDelegate$update$1.L$0 = null;
                    setDontCallPreferences$SendDontCallDelegate$update$1.L$1 = null;
                    setDontCallPreferences$SendDontCallDelegate$update$1.Z$0 = z;
                    setDontCallPreferences$SendDontCallDelegate$update$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(d, null, setDontCallPreferences$SendDontCallDelegate$update$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        setDontCallPreferences$SendDontCallDelegate$update$1 = new SetDontCallPreferences$SendDontCallDelegate$update$1(this, continuationImpl);
        Object obj2 = setDontCallPreferences$SendDontCallDelegate$update$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setDontCallPreferences$SendDontCallDelegate$update$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
