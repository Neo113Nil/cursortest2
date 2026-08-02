package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationListRedesignResponseDto;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsNotificationsStat$TypeNotificationItemClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.fou;
import xsna.ha70;
import xsna.jnu;
import xsna.kb70;
import xsna.vmu;
import xsna.vnu;

/* compiled from: GroupedNotificationListFeature.kt */
/* loaded from: classes4.dex */
public final class gnu extends wk50<eou, wnu, vmu, jnu> {
    public final vb70 f;
    public final fou g;
    public final f4z h;
    public final hpj i;
    public final s101 j;
    public final mi70 k;
    public final Object l;

    /* compiled from: GroupedNotificationListFeature.kt */
    @b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.grouped.GroupedNotificationListFeature$reloadData$1", f = "GroupedNotificationListFeature.kt", l = {Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $isRefresh;
        final /* synthetic */ wnu $state;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        final /* synthetic */ gnu this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, wnu wnuVar, gnu gnuVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$isRefresh = z;
            this.$state = wnuVar;
            this.this$0 = gnuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$isRefresh, this.$state, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Result.Failure failure;
            Object obj2;
            gnu gnuVar;
            boolean z;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    xl50 xl50Var = this.$isRefresh ? jnu.q.b : this.$state.i.isEmpty() ? jnu.p.b : null;
                    if (xl50Var != null) {
                        this.this$0.T(xl50Var);
                    }
                    gnuVar = this.this$0;
                    boolean z2 = this.$isRefresh;
                    this.L$0 = null;
                    this.L$1 = gnuVar;
                    this.Z$0 = z2;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    Object U = gnu.U(gnuVar, "0", this);
                    if (U == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z = z2;
                    obj = U;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = this.Z$0;
                    gnuVar = (gnu) this.L$1;
                    kotlin.a.a(obj);
                }
                NotificationsNotificationListRedesignResponseDto notificationsNotificationListRedesignResponseDto = (NotificationsNotificationListRedesignResponseDto) obj;
                gnuVar.T(new jnu.a(gnuVar.f.a(notificationsNotificationListRedesignResponseDto, null), notificationsNotificationListRedesignResponseDto.f(), z));
                if (z) {
                    gnuVar.k.a();
                }
                obj2 = s3q0.a;
            } catch (TimeoutCancellationException e) {
                failure = new Result.Failure(e);
                obj2 = failure;
                gnu gnuVar2 = this.this$0;
                if (Result.a(obj2) != null) {
                }
                this.this$0.T(new jnu.t(false));
                return s3q0.a;
            } catch (CancellationException e2) {
                throw e2;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
                obj2 = failure;
                gnu gnuVar22 = this.this$0;
                if (Result.a(obj2) != null) {
                }
                this.this$0.T(new jnu.t(false));
                return s3q0.a;
            }
            gnu gnuVar222 = this.this$0;
            if (Result.a(obj2) != null) {
                gnuVar222.T(jnu.f.b);
            }
            this.this$0.T(new jnu.t(false));
            return s3q0.a;
        }
    }

    public gnu(vb70 vb70Var, fou fouVar) {
        super(vmu.b.b, new tnu());
        this.f = vb70Var;
        this.g = fouVar;
        this.h = new f4z();
        this.i = zvj.a(hqu0.a());
        this.j = new s101();
        this.k = new mi70();
        this.l = msy.a(LazyThreadSafetyMode.NONE, new c6(11));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(gnu gnuVar, String str, ContinuationImpl continuationImpl) {
        enu enuVar;
        int i;
        gnuVar.getClass();
        if (continuationImpl instanceof enu) {
            enuVar = (enu) continuationImpl;
            int i2 = enuVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                enuVar.label = i2 - Integer.MIN_VALUE;
                Object obj = enuVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = enuVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    fnu fnuVar = new fnu(gnuVar, str, null);
                    enuVar.L$0 = null;
                    enuVar.label = 1;
                    obj = myc0.k(b, fnuVar, enuVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                gnuVar.T(new jnu.u(((NotificationsNotificationListRedesignResponseDto) obj).i()));
                return obj;
            }
        }
        enuVar = new enu(gnuVar, continuationImpl);
        Object obj2 = enuVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = enuVar.label;
        if (i != 0) {
        }
        gnuVar.T(new jnu.u(((NotificationsNotificationListRedesignResponseDto) obj2).i()));
        return obj2;
    }

    @Override // xsna.wk50
    public final void N(wnu wnuVar, vmu vmuVar) {
        String str;
        wnu wnuVar2 = wnuVar;
        vmu vmuVar2 = vmuVar;
        boolean equals = vmuVar2.equals(vmu.b.b);
        fou fouVar = this.g;
        if (equals) {
            if (fouVar instanceof fou.a) {
                T(new jnu.m(((fou.a) fouVar).b));
                T(jnu.l.b);
            }
            W(wnuVar2, false);
            return;
        }
        boolean equals2 = vmuVar2.equals(vmu.g.b);
        f4z f4zVar = this.h;
        if (equals2) {
            f4zVar.b(vnu.b.a);
            return;
        }
        if (vmuVar2.equals(vmu.i.b)) {
            if (fouVar instanceof fou.a) {
                fou.a aVar = (fou.a) fouVar;
                f4zVar.b(new vnu.c(aVar.a, aVar.b));
                return;
            }
            return;
        }
        boolean z = vmuVar2 instanceof vmu.d;
        mi70 mi70Var = this.k;
        if (z) {
            if (fouVar instanceof fou.a) {
                myc0.h(q1u.b, null, null, new hnu(this, ((fou.a) fouVar).a, null), 3);
            }
            mi70Var.a();
            return;
        }
        if (vmuVar2 instanceof vmu.e) {
            W(wnuVar2, ((vmu.e) vmuVar2).b);
            return;
        }
        if (vmuVar2.equals(vmu.a.b)) {
            T(jnu.d.b);
            return;
        }
        boolean equals3 = vmuVar2.equals(vmu.f.b);
        hpj hpjVar = this.i;
        if (equals3) {
            if (wnuVar2.i.isEmpty() || (str = wnuVar2.m) == null || str.length() == 0 || wnuVar2.o) {
                return;
            }
            T(new jnu.t(true));
            myc0.h(hpjVar, null, null, new dnu(this, wnuVar2, null), 3);
            return;
        }
        if (vmuVar2 instanceof vmu.h) {
            for (kb70 kb70Var : ((vmu.h) vmuVar2).b) {
                if (kb70Var instanceof kb70.d) {
                    String str2 = ((kb70.d) kb70Var).a;
                    LinkedHashSet<String> linkedHashSet = mi70Var.b;
                    if (!linkedHashSet.contains(str2)) {
                        linkedHashSet.add(str2);
                        mi70Var.a.add(str2);
                    }
                }
            }
            return;
        }
        if (vmuVar2 instanceof vmu.j) {
            String str3 = ((vmu.j) vmuVar2).b;
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.NOTIFICATIONS, null, null, null, null, null, 62, null), new MobileOfficialAppsNotificationsStat$TypeNotificationItemClick("cell", str3), 2)).q();
            return;
        }
        if (!(vmuVar2 instanceof vmu.c)) {
            throw new NoWhenBranchMatchedException();
        }
        ha70 ha70Var = ((vmu.c) vmuVar2).b;
        if (ha70Var instanceof ha70.x) {
            ha70.x xVar = (ha70.x) ha70Var;
            T(new jnu.n(new umu(xVar.a, xVar.b, xVar.c, xVar.d, new vmu.c(xVar.e))));
            return;
        }
        if (ha70Var instanceof ha70.f) {
            ha70.f fVar = (ha70.f) ha70Var;
            myc0.h(hpjVar, null, null, new ymu(fVar.c, this, fVar.a, fVar.b, null), 3);
            return;
        }
        if (ha70Var instanceof ha70.y) {
            T(jnu.o.b);
            return;
        }
        if (ha70Var instanceof ha70.c) {
            myc0.h(hpjVar, null, null, new anu(this, (ha70.c) ha70Var, null), 3);
            return;
        }
        if (ha70Var instanceof ha70.d) {
            myc0.h(hpjVar, null, null, new bnu(this, (ha70.d) ha70Var, null), 3);
            return;
        }
        if (ha70Var instanceof ha70.b) {
            myc0.h(hpjVar, null, null, new zmu(this, (ha70.b) ha70Var, wnuVar2, null), 3);
        } else if (ha70Var instanceof ha70.w) {
            myc0.h(hpjVar, null, null, new cnu(this, (ha70.w) ha70Var, null), 3);
        } else {
            f4zVar.b(new vnu.a(ha70Var));
        }
    }

    public final wj50<vnu> V() {
        return this.h;
    }

    public final void W(wnu wnuVar, boolean z) {
        if (wnuVar.o) {
            return;
        }
        T(new jnu.t(true));
        myc0.h(this.i, null, null, new a(z, wnuVar, this, null), 3);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        zvj.c(this.i, null);
    }
}
