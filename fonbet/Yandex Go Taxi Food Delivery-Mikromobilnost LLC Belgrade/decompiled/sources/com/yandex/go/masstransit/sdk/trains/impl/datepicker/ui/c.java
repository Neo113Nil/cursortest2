package com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui;

import androidx.compose.runtime.f;
import com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.c;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.qxi;
import defpackage.sls;
import defpackage.tig0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final class c {
    public final boolean a;
    public final int b;
    public final androidx.compose.foundation.lazy.b c;
    public final qxi d;
    public final qxi e;
    public final oz40 f;

    public c(boolean z, int i) {
        this.a = z;
        this.b = i;
        final int i2 = 0;
        this.c = new androidx.compose.foundation.lazy.b(z ? i + 1073741823 : i, 2, i2);
        this.d = f.d(new sls(this) { // from class: qx41
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                Object obj = null;
                r1 = null;
                Integer valueOf = null;
                c cVar = this.b;
                switch (i3) {
                    case 0:
                        s6y j = cVar.c.j();
                        if (j.k.isEmpty()) {
                            return null;
                        }
                        Iterator it = j.k.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                n6y n6yVar = (n6y) next;
                                if ((((t6y) n6yVar).o + ((t6y) n6yVar).p) - j.l > ((int) (j.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2) {
                                    obj = next;
                                }
                            }
                        }
                        return (n6y) obj;
                    default:
                        boolean z2 = cVar.a;
                        qxi qxiVar = cVar.d;
                        if (z2) {
                            n6y n6yVar2 = (n6y) qxiVar.getValue();
                            if (n6yVar2 != null) {
                                valueOf = Integer.valueOf(((t6y) n6yVar2).a - 1073741823);
                            }
                        } else {
                            n6y n6yVar3 = (n6y) qxiVar.getValue();
                            if (n6yVar3 != null) {
                                valueOf = Integer.valueOf(((t6y) n6yVar3).a);
                            }
                        }
                        return Integer.valueOf(valueOf != null ? valueOf.intValue() : cVar.b);
                }
            }
        });
        final int i3 = 1;
        this.e = f.d(new sls(this) { // from class: qx41
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i3;
                Object obj = null;
                valueOf = null;
                Integer valueOf = null;
                c cVar = this.b;
                switch (i32) {
                    case 0:
                        s6y j = cVar.c.j();
                        if (j.k.isEmpty()) {
                            return null;
                        }
                        Iterator it = j.k.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                n6y n6yVar = (n6y) next;
                                if ((((t6y) n6yVar).o + ((t6y) n6yVar).p) - j.l > ((int) (j.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2) {
                                    obj = next;
                                }
                            }
                        }
                        return (n6y) obj;
                    default:
                        boolean z2 = cVar.a;
                        qxi qxiVar = cVar.d;
                        if (z2) {
                            n6y n6yVar2 = (n6y) qxiVar.getValue();
                            if (n6yVar2 != null) {
                                valueOf = Integer.valueOf(((t6y) n6yVar2).a - 1073741823);
                            }
                        } else {
                            n6y n6yVar3 = (n6y) qxiVar.getValue();
                            if (n6yVar3 != null) {
                                valueOf = Integer.valueOf(((t6y) n6yVar3).a);
                            }
                        }
                        return Integer.valueOf(valueOf != null ? valueOf.intValue() : cVar.b);
                }
            }
        });
        this.f = f.j(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, ContinuationImpl continuationImpl) {
        WheelDatePickerState$animateScrollToItemInternal$1 wheelDatePickerState$animateScrollToItemInternal$1;
        int i2;
        if (continuationImpl instanceof WheelDatePickerState$animateScrollToItemInternal$1) {
            wheelDatePickerState$animateScrollToItemInternal$1 = (WheelDatePickerState$animateScrollToItemInternal$1) continuationImpl;
            int i3 = wheelDatePickerState$animateScrollToItemInternal$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wheelDatePickerState$animateScrollToItemInternal$1.label = i3 - Integer.MIN_VALUE;
                Object obj = wheelDatePickerState$animateScrollToItemInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = wheelDatePickerState$animateScrollToItemInternal$1.label;
                oz40 oz40Var = this.f;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    oz40Var.setValue(Boolean.TRUE);
                    wheelDatePickerState$animateScrollToItemInternal$1.I$0 = i;
                    wheelDatePickerState$animateScrollToItemInternal$1.label = 1;
                    tig0 tig0Var = androidx.compose.foundation.lazy.b.y;
                    if (this.c.f(i, 0, wheelDatePickerState$animateScrollToItemInternal$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                oz40Var.setValue(Boolean.FALSE);
                return zy11.a;
            }
        }
        wheelDatePickerState$animateScrollToItemInternal$1 = new WheelDatePickerState$animateScrollToItemInternal$1(this, continuationImpl);
        Object obj2 = wheelDatePickerState$animateScrollToItemInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = wheelDatePickerState$animateScrollToItemInternal$1.label;
        oz40 oz40Var2 = this.f;
        if (i2 != 0) {
        }
        oz40Var2.setValue(Boolean.FALSE);
        return zy11.a;
    }

    public final int b(int i) {
        int intValue = ((Number) this.e.getValue()).intValue();
        int i2 = intValue % i;
        int i3 = i2 + (i & (((i2 ^ i) & ((-i2) | i2)) >> 31));
        return i3 >= 0 ? i3 : intValue - i3;
    }

    public c() {
        this(false, 0);
    }
}
