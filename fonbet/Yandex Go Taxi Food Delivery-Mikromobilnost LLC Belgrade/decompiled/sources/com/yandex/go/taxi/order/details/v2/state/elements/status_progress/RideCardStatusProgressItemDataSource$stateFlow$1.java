package com.yandex.go.taxi.order.details.v2.state.elements.status_progress;

import com.yandex.go.slot.dto.b2;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$StatusProgress;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$StatusProgress$Trail$BoldTimer;
import com.yandex.go.taxi.order.models.api.response.b6;
import com.yandex.go.taxi.order.models.api.response.d6;
import com.yandex.go.taxi.order.models.api.response.progress_bar.ProgressBarDto;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import defpackage.bdc;
import defpackage.bok0;
import defpackage.cne0;
import defpackage.cvu0;
import defpackage.eok0;
import defpackage.evu0;
import defpackage.fok0;
import defpackage.ibk0;
import defpackage.jl40;
import defpackage.lbk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t7s;
import defpackage.ufu;
import defpackage.unk0;
import defpackage.vfk0;
import defpackage.vnk0;
import defpackage.wls;
import defpackage.wnk0;
import defpackage.xng0;
import defpackage.xnk0;
import defpackage.ynk0;
import defpackage.znk0;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "timer", "Lbok0;", "<anonymous>", "(J)Lbok0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.status_progress.RideCardStatusProgressItemDataSource$stateFlow$1", f = "RideCardStatusProgressItemDataSource.kt", l = {91, HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardStatusProgressItemDataSource$stateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardItemDto$StatusProgress $item;
    final /* synthetic */ String $orderId;
    final /* synthetic */ vfk0 $sourceType;
    final /* synthetic */ RideCardTimerDto $timerDto;
    int I$0;
    /* synthetic */ long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardStatusProgressItemDataSource$stateFlow$1(RideCardTimerDto rideCardTimerDto, a aVar, RideCardItemDto$StatusProgress rideCardItemDto$StatusProgress, String str, vfk0 vfk0Var, Continuation continuation) {
        super(2, continuation);
        this.$timerDto = rideCardTimerDto;
        this.this$0 = aVar;
        this.$item = rideCardItemDto$StatusProgress;
        this.$orderId = str;
        this.$sourceType = vfk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardStatusProgressItemDataSource$stateFlow$1 rideCardStatusProgressItemDataSource$stateFlow$1 = new RideCardStatusProgressItemDataSource$stateFlow$1(this.$timerDto, this.this$0, this.$item, this.$orderId, this.$sourceType, continuation);
        rideCardStatusProgressItemDataSource$stateFlow$1.J$0 = ((Number) obj).longValue();
        return rideCardStatusProgressItemDataSource$stateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardStatusProgressItemDataSource$stateFlow$1) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e6, code lost:
    
        if (r3 == null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0380  */
    /* JADX WARN: Type inference failed for: r0v52, types: [int] */
    /* JADX WARN: Type inference failed for: r0v55, types: [int] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [wnk0] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [aok0] */
    /* JADX WARN: Type inference failed for: r9v17 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        RideCardItemDto$StatusProgress.ExpiredDto expiredDto;
        long j2;
        CoroutineSingletons coroutineSingletons;
        long j3;
        boolean z;
        xnk0 xnk0Var;
        xnk0 xnk0Var2;
        vnk0 vnk0Var;
        boolean z2;
        RideCardItemDto$StatusProgress.StatusTextDto statusTextDto;
        RideCardItemDto$StatusProgress.StatusTextDto statusTextDto2;
        RideCardItemDto$StatusProgress.StatusTextDto statusTextDto3;
        long j4;
        Object e;
        CoroutineSingletons coroutineSingletons2;
        RideCardItemDto$StatusProgress.StatusTextDto statusTextDto4;
        long j5;
        RideCardItemDto$StatusProgress.StatusTextDto statusTextDto5;
        RideCardItemDto$StatusProgress.StatusTextDto statusTextDto6;
        Long valueOf;
        Long l;
        int i;
        Long valueOf2;
        Long l2;
        String str;
        Object obj2;
        CharSequence charSequence;
        ibk0 ibk0Var;
        ibk0 ibk0Var2;
        RideCardItemDto$StatusProgress.StatusTextDto statusTextDto7;
        CharSequence charSequence2;
        ibk0 ibk0Var3;
        xnk0 xnk0Var3;
        vnk0 vnk0Var2;
        FormattedText formattedText;
        Object e2;
        vnk0 vnk0Var3;
        CharSequence charSequence3;
        ibk0 ibk0Var4;
        ibk0 ibk0Var5;
        boolean z3;
        d6 d6Var;
        ?? r9;
        Object obj3;
        b2 b2Var;
        long j6 = this.J$0;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            RideCardTimerDto rideCardTimerDto = this.$timerDto;
            RideCardTimerDto.TimerType timerType = rideCardTimerDto != null ? rideCardTimerDto.a : null;
            Date c = this.this$0.d.c(rideCardTimerDto != null ? rideCardTimerDto.b : null);
            Long l3 = c != null ? new Long(c.getTime()) : null;
            long millis = (-1) * TimeUnit.SECONDS.toMillis(j6);
            List list = this.$item.f;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j = 0;
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    RideCardItemDto$StatusProgress.ExpiredDto expiredDto2 = (RideCardItemDto$StatusProgress.ExpiredDto) obj2;
                    j = 0;
                    Long l4 = expiredDto2.a;
                    if ((l4 != null ? l4.longValue() : 0L) > millis || expiredDto2.a == null) {
                        break;
                    }
                }
                expiredDto = (RideCardItemDto$StatusProgress.ExpiredDto) obj2;
            } else {
                j = 0;
            }
            expiredDto = this.$item.e;
            boolean z4 = timerType == RideCardTimerDto.TimerType.UNTIL && j6 <= j;
            bdc bdcVar = new bdc(xng0.textInvert);
            if (timerType == null || l3 == null) {
                j2 = j6;
                coroutineSingletons = coroutineSingletons3;
                j3 = millis;
                z = false;
                xnk0Var = new xnk0("–:––", "", bdcVar);
            } else {
                fok0 fok0Var = this.this$0.f;
                String str2 = this.$orderId;
                cne0 cne0Var = fok0Var.a;
                eok0 eok0Var = fok0Var.b;
                if (eok0Var != null && jl40.l(eok0Var.d, str2) && eok0Var.c == timerType) {
                    j2 = j6;
                    coroutineSingletons = coroutineSingletons3;
                    j3 = millis;
                    z = false;
                } else {
                    String l5 = cne0Var.l("RIDE_STATUS_TIME_FORMAT", null);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    coroutineSingletons = coroutineSingletons3;
                    sb.append("_");
                    sb.append(timerType);
                    sb.append("_");
                    String sb2 = sb.toString();
                    j3 = millis;
                    j2 = j6;
                    z = false;
                    if (l5 == null || !evu0.y(l5, sb2, false)) {
                        long j7 = j2 / 3600;
                        str = j7 >= 10 ? "%1$2d:%2$02d:%3$02d" : j7 > j ? "%1$01d:%2$02d:%3$02d" : (j2 - (j7 * 3600)) / 60 >= 10 ? "%1$02d:%2$02d" : "%1$01d:%2$02d";
                        cne0Var.r("RIDE_STATUS_TIME_FORMAT", sb2.concat(str));
                    } else {
                        str = cvu0.v(l5, sb2, "", false);
                    }
                    eok0Var = new eok0(str, (str.equals("%1$01d:%2$02d:%3$02d") || str.equals("%1$2d:%2$02d:%3$02d")) ? 3 : 2, timerType, str2);
                    fok0Var.b = eok0Var;
                }
                String str3 = eok0Var.a;
                int i3 = eok0Var.b;
                Pattern pattern = t7s.a;
                long j8 = j2 / 3600;
                long j9 = j2 - (3600 * j8);
                long j10 = j9 / 60;
                long j11 = j9 - (60 * j10);
                String format = i3 == 3 ? String.format(Locale.getDefault(), str3, Arrays.copyOf(new Object[]{Long.valueOf(j8), Long.valueOf(j10), Long.valueOf(j11)}, 3)) : String.format(Locale.getDefault(), str3, Arrays.copyOf(new Object[]{Long.valueOf(j10), Long.valueOf(j11)}, 2));
                xnk0Var = new xnk0(format, this.this$0.e.b(format), bdcVar);
            }
            xnk0Var2 = xnk0Var;
            ProgressBarDto progressBarDto = this.$item.g;
            if (progressBarDto != null) {
                int i4 = progressBarDto.a;
                a aVar = this.this$0;
                RideCardTimerDto rideCardTimerDto2 = this.$timerDto;
                Date c2 = aVar.d.c(rideCardTimerDto2 != null ? rideCardTimerDto2.b : null);
                if (c2 != null) {
                    j = c2.getTime();
                }
                RideCardTimerDto.TimerType timerType2 = rideCardTimerDto2 != null ? rideCardTimerDto2.a : null;
                int i5 = timerType2 == null ? -1 : unk0.a[timerType2.ordinal()];
                if (i5 == 1) {
                    valueOf = Long.valueOf(j);
                } else if (i5 != 2) {
                    l = null;
                    i = timerType2 != null ? unk0.a[timerType2.ordinal()] : -1;
                    if (i != 1) {
                        valueOf2 = Long.valueOf(j - i4);
                    } else if (i != 2) {
                        l2 = null;
                        vnk0Var = new vnk0(progressBarDto.a, ((ufu) aVar.b).a(new bdc(xng0.bgMain), progressBarDto.b), progressBarDto.c, l, l2, aVar.g, z4);
                    } else {
                        valueOf2 = Long.valueOf(j);
                    }
                    l2 = valueOf2;
                    vnk0Var = new vnk0(progressBarDto.a, ((ufu) aVar.b).a(new bdc(xng0.bgMain), progressBarDto.b), progressBarDto.c, l, l2, aVar.g, z4);
                } else {
                    valueOf = Long.valueOf(j + i4);
                }
                l = valueOf;
                if (timerType2 != null) {
                }
                if (i != 1) {
                }
                l2 = valueOf2;
                vnk0Var = new vnk0(progressBarDto.a, ((ufu) aVar.b).a(new bdc(xng0.bgMain), progressBarDto.b), progressBarDto.c, l, l2, aVar.g, z4);
            } else {
                vnk0Var = null;
            }
            z2 = z4;
            if (!z2) {
                statusTextDto = this.$item.c;
            } else {
                if (expiredDto != null && (statusTextDto6 = expiredDto.b) != null) {
                    statusTextDto2 = new RideCardItemDto$StatusProgress.StatusTextDto(statusTextDto6.a, this.$item.c.b);
                    if (z2) {
                        statusTextDto3 = this.$item.d;
                    } else if (expiredDto == null || (statusTextDto5 = expiredDto.c) == null) {
                        statusTextDto3 = null;
                    } else {
                        RideCardItemDto$StatusProgress.StatusTextDto statusTextDto8 = this.$item.d;
                        statusTextDto3 = new RideCardItemDto$StatusProgress.StatusTextDto(statusTextDto5.a, statusTextDto8 != null ? statusTextDto8.b : null);
                    }
                    c cVar = this.this$0.c;
                    FormattedText formattedText2 = statusTextDto2.a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = xnk0Var2;
                    this.L$5 = vnk0Var;
                    this.L$6 = statusTextDto2;
                    this.L$7 = statusTextDto3;
                    j4 = j2;
                    this.J$0 = j4;
                    this.J$1 = j3;
                    this.I$0 = z2 ? 1 : 0;
                    this.label = 1;
                    e = c.e(cVar, formattedText2, null, false, this, 30);
                    coroutineSingletons2 = coroutineSingletons;
                    if (e != coroutineSingletons2) {
                        statusTextDto4 = statusTextDto2;
                        j5 = j3;
                    }
                    return coroutineSingletons2;
                }
                statusTextDto = this.$item.c;
            }
            statusTextDto2 = statusTextDto;
            if (z2) {
            }
            c cVar2 = this.this$0.c;
            FormattedText formattedText22 = statusTextDto2.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = xnk0Var2;
            this.L$5 = vnk0Var;
            this.L$6 = statusTextDto2;
            this.L$7 = statusTextDto3;
            j4 = j2;
            this.J$0 = j4;
            this.J$1 = j3;
            this.I$0 = z2 ? 1 : 0;
            this.label = 1;
            e = c.e(cVar2, formattedText22, null, false, this, 30);
            coroutineSingletons2 = coroutineSingletons;
            if (e != coroutineSingletons2) {
            }
            return coroutineSingletons2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ?? r0 = this.I$0;
            ibk0Var4 = (ibk0) this.L$9;
            charSequence3 = (CharSequence) this.L$8;
            statusTextDto7 = (RideCardItemDto$StatusProgress.StatusTextDto) this.L$7;
            vnk0Var3 = (vnk0) this.L$5;
            xnk0Var2 = (xnk0) this.L$4;
            b.b(obj);
            z2 = r0;
            ibk0Var2 = null;
            z = false;
            e2 = obj;
            charSequence = charSequence3;
            xnk0Var3 = xnk0Var2;
            charSequence2 = (CharSequence) e2;
            ibk0Var3 = ibk0Var4;
            vnk0Var2 = vnk0Var3;
            if (statusTextDto7 != null || (b2Var = statusTextDto7.b) == null) {
                ibk0Var5 = ibk0Var2;
            } else {
                this.this$0.a.getClass();
                ibk0Var5 = lbk0.b(b2Var);
            }
            wnk0 wnk0Var = new wnk0(charSequence, ibk0Var3);
            ?? wnk0Var2 = charSequence2 != null ? new wnk0(charSequence2, ibk0Var5) : ibk0Var2;
            RideCardItemDto$StatusProgress rideCardItemDto$StatusProgress = this.$item;
            RideCardStatusProgressItemUiState$State rideCardStatusProgressItemUiState$State = (rideCardItemDto$StatusProgress.j != RideCardItemDto$StatusProgress.State.LOADING || z2) ? RideCardStatusProgressItemUiState$State.LOADING : RideCardStatusProgressItemUiState$State.REGULAR;
            a aVar2 = this.this$0;
            z3 = z2 ? true : z;
            d6Var = rideCardItemDto$StatusProgress.i;
            aVar2.getClass();
            if (!z3 && d6Var != null) {
                if (!(d6Var instanceof b6)) {
                    obj3 = znk0.a;
                } else if (d6Var instanceof RideCardItemDto$StatusProgress$Trail$BoldTimer) {
                    obj3 = new ynk0(((ufu) aVar2.b).h(new bdc(xng0.bgInvert), ((RideCardItemDto$StatusProgress$Trail$BoldTimer) d6Var).a));
                }
                r9 = obj3;
                RideCardItemDto$StatusProgress rideCardItemDto$StatusProgress2 = this.$item;
                return new bok0(rideCardItemDto$StatusProgress2.a, rideCardItemDto$StatusProgress2.b, vnk0Var2, wnk0Var, wnk0Var2, r9, xnk0Var3, rideCardStatusProgressItemUiState$State, this.$sourceType);
            }
            r9 = ibk0Var2;
            RideCardItemDto$StatusProgress rideCardItemDto$StatusProgress22 = this.$item;
            return new bok0(rideCardItemDto$StatusProgress22.a, rideCardItemDto$StatusProgress22.b, vnk0Var2, wnk0Var, wnk0Var2, r9, xnk0Var3, rideCardStatusProgressItemUiState$State, this.$sourceType);
        }
        ?? r02 = this.I$0;
        j5 = this.J$1;
        RideCardItemDto$StatusProgress.StatusTextDto statusTextDto9 = (RideCardItemDto$StatusProgress.StatusTextDto) this.L$7;
        statusTextDto4 = (RideCardItemDto$StatusProgress.StatusTextDto) this.L$6;
        vnk0 vnk0Var4 = (vnk0) this.L$5;
        xnk0 xnk0Var4 = (xnk0) this.L$4;
        b.b(obj);
        j4 = j6;
        vnk0Var = vnk0Var4;
        z2 = r02;
        statusTextDto3 = statusTextDto9;
        coroutineSingletons2 = coroutineSingletons3;
        xnk0Var2 = xnk0Var4;
        z = false;
        e = obj;
        charSequence = (CharSequence) e;
        b2 b2Var2 = statusTextDto4.b;
        if (b2Var2 != null) {
            this.this$0.a.getClass();
            ibk0Var = lbk0.b(b2Var2);
        } else {
            ibk0Var = null;
        }
        if (statusTextDto3 == null || (formattedText = statusTextDto3.a) == null) {
            ibk0Var2 = null;
            statusTextDto7 = statusTextDto3;
            charSequence2 = null;
            ibk0Var3 = ibk0Var;
            xnk0Var3 = xnk0Var2;
            vnk0Var2 = vnk0Var;
            if (statusTextDto7 != null) {
            }
            ibk0Var5 = ibk0Var2;
            wnk0 wnk0Var3 = new wnk0(charSequence, ibk0Var3);
            if (charSequence2 != null) {
            }
            RideCardItemDto$StatusProgress rideCardItemDto$StatusProgress3 = this.$item;
            RideCardStatusProgressItemUiState$State rideCardStatusProgressItemUiState$State2 = (rideCardItemDto$StatusProgress3.j != RideCardItemDto$StatusProgress.State.LOADING || z2) ? RideCardStatusProgressItemUiState$State.LOADING : RideCardStatusProgressItemUiState$State.REGULAR;
            a aVar22 = this.this$0;
            if (z2) {
            }
            d6Var = rideCardItemDto$StatusProgress3.i;
            aVar22.getClass();
            if (!z3) {
                if (!(d6Var instanceof b6)) {
                }
                r9 = obj3;
                RideCardItemDto$StatusProgress rideCardItemDto$StatusProgress222 = this.$item;
                return new bok0(rideCardItemDto$StatusProgress222.a, rideCardItemDto$StatusProgress222.b, vnk0Var2, wnk0Var3, wnk0Var2, r9, xnk0Var3, rideCardStatusProgressItemUiState$State2, this.$sourceType);
            }
            r9 = ibk0Var2;
            RideCardItemDto$StatusProgress rideCardItemDto$StatusProgress2222 = this.$item;
            return new bok0(rideCardItemDto$StatusProgress2222.a, rideCardItemDto$StatusProgress2222.b, vnk0Var2, wnk0Var3, wnk0Var2, r9, xnk0Var3, rideCardStatusProgressItemUiState$State2, this.$sourceType);
        }
        c cVar3 = this.this$0.c;
        ibk0Var2 = null;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = xnk0Var2;
        this.L$5 = vnk0Var;
        this.L$6 = null;
        this.L$7 = statusTextDto3;
        this.L$8 = charSequence;
        this.L$9 = ibk0Var;
        this.L$10 = null;
        this.J$0 = j4;
        this.J$1 = j5;
        this.I$0 = z2 ? 1 : 0;
        this.label = 2;
        ibk0 ibk0Var6 = ibk0Var;
        e2 = c.e(cVar3, formattedText, null, false, this, 30);
        if (e2 != coroutineSingletons2) {
            vnk0Var3 = vnk0Var;
            charSequence3 = charSequence;
            statusTextDto7 = statusTextDto3;
            ibk0Var4 = ibk0Var6;
            charSequence = charSequence3;
            xnk0Var3 = xnk0Var2;
            charSequence2 = (CharSequence) e2;
            ibk0Var3 = ibk0Var4;
            vnk0Var2 = vnk0Var3;
            if (statusTextDto7 != null) {
            }
            ibk0Var5 = ibk0Var2;
            wnk0 wnk0Var32 = new wnk0(charSequence, ibk0Var3);
            if (charSequence2 != null) {
            }
            RideCardItemDto$StatusProgress rideCardItemDto$StatusProgress32 = this.$item;
            RideCardStatusProgressItemUiState$State rideCardStatusProgressItemUiState$State22 = (rideCardItemDto$StatusProgress32.j != RideCardItemDto$StatusProgress.State.LOADING || z2) ? RideCardStatusProgressItemUiState$State.LOADING : RideCardStatusProgressItemUiState$State.REGULAR;
            a aVar222 = this.this$0;
            if (z2) {
            }
            d6Var = rideCardItemDto$StatusProgress32.i;
            aVar222.getClass();
            if (!z3) {
            }
            r9 = ibk0Var2;
            RideCardItemDto$StatusProgress rideCardItemDto$StatusProgress22222 = this.$item;
            return new bok0(rideCardItemDto$StatusProgress22222.a, rideCardItemDto$StatusProgress22222.b, vnk0Var2, wnk0Var32, wnk0Var2, r9, xnk0Var3, rideCardStatusProgressItemUiState$State22, this.$sourceType);
        }
        return coroutineSingletons2;
    }
}
