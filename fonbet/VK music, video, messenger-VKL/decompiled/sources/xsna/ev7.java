package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.as7;
import xsna.dv7;
import xsna.iw7;
import xsna.mm7;
import xsna.xv7;

/* compiled from: BookingRecordsScreenFeature.kt */
/* loaded from: classes18.dex */
public final class ev7 extends wk50<nw7, iw7, dv7, xv7> {
    public final androidx.lifecycle.j f;
    public final zu7 g;
    public final f4z h;
    public final f4z i;
    public final f4z j;

    /* compiled from: BookingRecordsScreenFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingButton.Action.values().length];
            try {
                iArr[BookingButton.Action.Reschedule.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingButton.Action.Cancel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookingButton.Action.Other.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: BookingRecordsScreenFeature.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.records.BookingRecordsScreenFeature$loadRecords$1", f = "BookingRecordsScreenFeature.kt", l = {165}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ int $nextPage;
        final /* synthetic */ BookingScreenParams $params;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BookingScreenParams bookingScreenParams, int i, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$params = bookingScreenParams;
            this.$nextPage = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = ev7.this.new b(this.$params, this.$nextPage, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    zu7 zu7Var = ev7.this.g;
                    UserId userId = this.$params.b;
                    int i2 = this.$nextPage;
                    this.L$0 = yvjVar;
                    this.label = 1;
                    obj = zu7.d(zu7Var, userId, i2, this, 2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                zvj.e(yvjVar);
                ev7.this.T(new yv7(this.$nextPage, (cv7) obj));
            } catch (Exception e) {
                zvj.e(yvjVar);
                ev7.this.T(new zv7(this.$nextPage, e));
            }
            return s3q0.a;
        }
    }

    public ev7(dv7.f fVar, androidx.lifecycle.j jVar, zu7 zu7Var) {
        super(fVar, new gw7(iw7.b.b));
        this.f = jVar;
        this.g = zu7Var;
        this.h = new f4z();
        this.i = new f4z();
        this.j = new f4z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wk50
    public final void N(iw7 iw7Var, dv7 dv7Var) {
        BookingScreenParams bookingScreenParams;
        BookingScreenParams bookingScreenParams2;
        BookingScreenParams bookingScreenParams3;
        iw7 iw7Var2 = iw7Var;
        dv7 dv7Var2 = dv7Var;
        boolean z = dv7Var2 instanceof dv7.e;
        f4z f4zVar = this.h;
        Object[] objArr = false;
        if (z) {
            iw7.d dVar = iw7Var2 instanceof iw7.d ? (iw7.d) iw7Var2 : null;
            if ((dVar != null ? dVar.f : null) != null) {
                objArr = true;
            }
            if (objArr == true) {
                BookingScreenParams bookingScreenParams4 = dVar.d;
                f4zVar.b(new as7.m(bookingScreenParams4 != null ? BookingScreenParams.a(bookingScreenParams4, a.f.d.a, null, null, null, null, 0, null, 0, null, 131069) : null, true));
                return;
            } else {
                if (objArr == true) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(as7.b.a);
                return;
            }
        }
        if (dv7Var2 instanceof dv7.b) {
            f4zVar.b(new as7.a(null));
            return;
        }
        boolean z2 = dv7Var2 instanceof dv7.f;
        androidx.lifecycle.j jVar = this.f;
        if (z2) {
            BookingScreenParams bookingScreenParams5 = ((dv7.f) dv7Var2).b;
            T(new xv7.e(bookingScreenParams5));
            myc0.h(jVar, null, null, new gv7(this, bookingScreenParams5, null, dv7Var2, null), 3);
            return;
        }
        if (!(dv7Var2 instanceof dv7.g)) {
            if (dv7Var2 instanceof dv7.a) {
                myc0.h(jVar, null, null, new fv7(iw7Var2 instanceof iw7.d ? (iw7.d) iw7Var2 : null, this, null), 3);
                return;
            }
            if (dv7Var2 instanceof dv7.c) {
                T(xv7.a.b);
                return;
            } else if (dv7Var2 instanceof dv7.d) {
                X(iw7Var2 instanceof iw7.d ? (iw7.d) iw7Var2 : null, false);
                return;
            } else {
                if (!dv7Var2.equals(dv7.h.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                X(iw7Var2 instanceof iw7.d ? (iw7.d) iw7Var2 : null, true);
                return;
            }
        }
        dv7.g gVar = (dv7.g) dv7Var2;
        BookingRecord bookingRecord = gVar.c;
        int i = bookingRecord.o;
        int i2 = bookingRecord.b;
        BookingServiceType bookingServiceType = i == 0 ? BookingServiceType.INDIVIDUAL : BookingServiceType.GROUP;
        int i3 = a.$EnumSwitchMapping$0[gVar.b.ordinal()];
        f4z f4zVar2 = this.j;
        if (i3 == 1) {
            iw7.d dVar2 = iw7Var2 instanceof iw7.d ? (iw7.d) iw7Var2 : null;
            if (dVar2 == null || (bookingScreenParams = dVar2.d) == null) {
                return;
            }
            f4zVar2.b(new mm7.a.f(bookingScreenParams.b, Integer.valueOf(i2), bookingServiceType));
            UserId userId = bookingScreenParams.b;
            BookingSettings bookingSettings = bookingScreenParams.d;
            int i4 = a.m.d.a;
            List<BookingServiceModel> list = bookingRecord.e;
            BookingMaster bookingMaster = bookingRecord.f;
            String str = bookingRecord.h;
            f4zVar.b(new as7.m(new BookingScreenParams(userId, i4, bookingSettings, list, bookingMaster, false, new BookingScreenParams.DateTime(str, str, bookingRecord.i, null, null, bookingRecord.o), bookingRecord.n, bookingRecord.d, bookingRecord.c, bookingRecord.b, bookingRecord.p, 0, null, null, null, null, 127008, null), false));
            return;
        }
        if (i3 == 2) {
            iw7.d dVar3 = iw7Var2 instanceof iw7.d ? (iw7.d) iw7Var2 : null;
            if (dVar3 != null && (bookingScreenParams2 = dVar3.d) != null) {
                f4zVar2.b(new mm7.a.C3351a(bookingScreenParams2.b, Integer.valueOf(i2), bookingServiceType));
            }
            T(new xv7.b(bookingRecord));
            return;
        }
        if (i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        iw7.d dVar4 = iw7Var2 instanceof iw7.d ? (iw7.d) iw7Var2 : null;
        if (dVar4 == null || (bookingScreenParams3 = dVar4.d) == null) {
            return;
        }
        f4zVar.b(new as7.m(new BookingScreenParams(bookingScreenParams3.b, a.n.d.a, bookingScreenParams3.d, bookingRecord.e, bookingRecord.f, false, null, bookingRecord.n, bookingRecord.d, bookingRecord.c, bookingRecord.b, bookingRecord.p, 0, null, null, bookingRecord.o > 0 ? BookingServiceType.GROUP : BookingServiceType.INDIVIDUAL, null, 94240, null), false));
    }

    public final f4z U() {
        return this.j;
    }

    public final f4z V() {
        return this.i;
    }

    public final f4z W() {
        return this.h;
    }

    public final void X(iw7.d dVar, boolean z) {
        if (dVar == null) {
            return;
        }
        int i = dVar.c;
        BookingScreenParams bookingScreenParams = dVar.d;
        if (bookingScreenParams == null) {
            return;
        }
        if (!z) {
            i++;
        }
        T(new aw7(i));
        myc0.h(this.f, null, null, new b(bookingScreenParams, i, null), 3);
    }
}
