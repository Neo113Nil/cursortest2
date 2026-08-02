package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationListRedesignResponseDto;
import com.vk.notifications.list.impl.presentation.base.mvi.common.NotificationCategoryTab;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.wb70;

/* compiled from: NotificationListFeatureV2.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.feature.NotificationListFeatureV2$executeDataLoad$2", f = "NotificationListFeatureV2.kt", l = {371, 390, 399}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class xa70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ int $markAsReadBeforeTime;
    final /* synthetic */ o870 $page;
    final /* synthetic */ int $pageIndex;
    final /* synthetic */ NotificationCategoryTab $pendingCategoryId;
    final /* synthetic */ dc70 $state;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ wa70 this$0;

    /* compiled from: NotificationListFeatureV2.kt */
    @b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.feature.NotificationListFeatureV2$executeDataLoad$2$categoriesAsync$1", f = "NotificationListFeatureV2.kt", l = {366}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super List<? extends zi70>>, Object> {
        int label;
        final /* synthetic */ wa70 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wa70 wa70Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = wa70Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super List<? extends zi70>> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            ua70 ua70Var = this.this$0.o;
            this.label = 1;
            Serializable b = ua70Var.b(this);
            return b == coroutineSingletons ? coroutineSingletons : b;
        }
    }

    /* compiled from: NotificationListFeatureV2.kt */
    @b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.feature.NotificationListFeatureV2$executeDataLoad$2$friendRequestAsync$1", f = "NotificationListFeatureV2.kt", l = {360}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super yos>, Object> {
        int label;
        final /* synthetic */ wa70 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wa70 wa70Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = wa70Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super yos> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            wa70 wa70Var = this.this$0;
            this.label = 1;
            wa70Var.getClass();
            Object k = myc0.k(hqu0.b(), new ya70(2, null), this);
            return k == coroutineSingletons ? coroutineSingletons : k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa70(dc70 dc70Var, o870 o870Var, wa70 wa70Var, int i, NotificationCategoryTab notificationCategoryTab, int i2, boolean z, spj<? super xa70> spjVar) {
        super(2, spjVar);
        this.$state = dc70Var;
        this.$page = o870Var;
        this.this$0 = wa70Var;
        this.$pageIndex = i;
        this.$pendingCategoryId = notificationCategoryTab;
        this.$markAsReadBeforeTime = i2;
        this.$isRefresh = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        xa70 xa70Var = new xa70(this.$state, this.$page, this.this$0, this.$pageIndex, this.$pendingCategoryId, this.$markAsReadBeforeTime, this.$isRefresh, spjVar);
        xa70Var.L$0 = obj;
        return xa70Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xa70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x019a, code lost:
    
        if (r0 == r7) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f3, code lost:
    
        if (r0 == r7) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Type inference failed for: r4v21, types: [xsna.zrl] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int intValue;
        asl aslVar;
        asl b2;
        List<zi70> list;
        Object J;
        int i2;
        int i3;
        NotificationCategoryTab notificationCategoryTab;
        int i4;
        int i5;
        boolean z;
        int i6;
        Object c0;
        List<zi70> list2;
        int i7;
        zrl zrlVar;
        NotificationsNotificationListRedesignResponseDto notificationsNotificationListRedesignResponseDto;
        Object H;
        mzp0 mzp0Var;
        int h;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.label;
        yos yosVar = null;
        if (i8 == 0) {
            kotlin.a.a(obj);
            i = this.$state.i == 0 ? 1 : 0;
            Integer num = this.$page.f;
            if (!this.$isRefresh) {
                num = null;
            }
            intValue = num != null ? num.intValue() : 0;
            wa70 wa70Var = this.this$0;
            if (i != 0) {
                wa70Var.Y().getClass();
                if (he70.a() == null) {
                    aslVar = myc0.b(yvjVar, null, null, new b(this.this$0, null), 3);
                    wa70 wa70Var2 = this.this$0;
                    dc70 dc70Var = this.$state;
                    wa70Var2.Y().getClass();
                    b2 = (he70.b() || !dc70Var.h.isEmpty()) ? null : myc0.b(yvjVar, null, null, new a(this.this$0, null), 3);
                    if (b2 != null) {
                        list = null;
                        int i9 = i;
                        i2 = intValue;
                        asl aslVar2 = aslVar;
                        ua70 ua70Var = this.this$0.o;
                        i3 = this.$pageIndex;
                        notificationCategoryTab = this.$pendingCategoryId;
                        ua70Var.getClass();
                        if (notificationCategoryTab != null && list != null) {
                            i3 = ua70.a(list, notificationCategoryTab);
                        }
                        i4 = i3;
                        zi70 zi70Var = (zi70) j5g.b0(i4, list != null ? this.$state.h : list);
                        String str = zi70Var == null ? zi70Var.a : null;
                        i5 = this.$markAsReadBeforeTime;
                        if (i5 <= 0) {
                            i6 = i5;
                            z = true;
                        } else if (i9 == 0 || i4 != 0) {
                            z = true;
                            i6 = 0;
                        } else {
                            z = true;
                            i6 = i2;
                        }
                        String str2 = str;
                        wa70 wa70Var3 = this.this$0;
                        boolean z2 = i9 == 0 ? z : false;
                        boolean z3 = this.$isRefresh;
                        dc70 dc70Var2 = this.$state;
                        wa70Var3.getClass();
                        boolean b0 = wa70.b0(dc70Var2);
                        this.L$0 = null;
                        this.L$1 = aslVar2;
                        this.L$2 = null;
                        this.L$3 = list;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.I$0 = i9;
                        this.I$1 = i2;
                        this.I$2 = i4;
                        this.I$3 = i6;
                        this.label = 2;
                        c0 = wa70Var3.c0(null, b0, str2, i6, !z3 && z2 && i4 == 0 && i6 == 0, this);
                        if (c0 != coroutineSingletons) {
                            list2 = list;
                            i7 = i9;
                            zrlVar = aslVar2;
                            notificationsNotificationListRedesignResponseDto = (NotificationsNotificationListRedesignResponseDto) c0;
                            if (zrlVar != null) {
                            }
                            wa70 wa70Var4 = this.this$0;
                            boolean z4 = this.$isRefresh;
                            wa70Var4.o.getClass();
                            if (list2 != null) {
                            }
                            if (list2 != null) {
                            }
                            wa70Var4.T(new wb70.a(i4, wa70Var4.f.a(notificationsNotificationListRedesignResponseDto, yosVar), notificationsNotificationListRedesignResponseDto.f(), z4, notificationsNotificationListRedesignResponseDto.i()));
                            mzp0Var = this.this$0.h;
                            if (mzp0Var != null) {
                            }
                            if (this.$isRefresh) {
                            }
                            return s3q0.a;
                        }
                        return coroutineSingletons;
                    }
                    this.L$0 = null;
                    this.L$1 = aslVar;
                    this.L$2 = null;
                    this.I$0 = i;
                    this.I$1 = intValue;
                    this.label = 1;
                    J = b2.J(this);
                }
            } else {
                wa70Var.getClass();
            }
            aslVar = null;
            wa70 wa70Var22 = this.this$0;
            dc70 dc70Var3 = this.$state;
            wa70Var22.Y().getClass();
            if (he70.b()) {
            }
            if (b2 != null) {
            }
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i10 = this.I$2;
                    notificationsNotificationListRedesignResponseDto = (NotificationsNotificationListRedesignResponseDto) this.L$6;
                    list2 = (List) this.L$3;
                    kotlin.a.a(obj);
                    i4 = i10;
                    H = obj;
                    yosVar = (yos) H;
                    wa70 wa70Var42 = this.this$0;
                    boolean z42 = this.$isRefresh;
                    wa70Var42.o.getClass();
                    if (list2 != null && i4 > (h = e43.h(list2))) {
                        i4 = h;
                    }
                    if (list2 != null) {
                        wa70Var42.T(new wb70.n(list2));
                        wa70Var42.T(new wb70.p(i4));
                    }
                    wa70Var42.T(new wb70.a(i4, wa70Var42.f.a(notificationsNotificationListRedesignResponseDto, yosVar), notificationsNotificationListRedesignResponseDto.f(), z42, notificationsNotificationListRedesignResponseDto.i()));
                    mzp0Var = this.this$0.h;
                    if (mzp0Var != null) {
                        mzp0Var.c(false);
                    }
                    if (this.$isRefresh) {
                        this.this$0.m.a();
                    }
                    return s3q0.a;
                }
                int i11 = this.I$3;
                int i12 = this.I$2;
                int i13 = this.I$1;
                i7 = this.I$0;
                List<zi70> list3 = (List) this.L$3;
                zrlVar = (zrl) this.L$1;
                kotlin.a.a(obj);
                i4 = i12;
                i2 = i13;
                list2 = list3;
                i6 = i11;
                c0 = obj;
                notificationsNotificationListRedesignResponseDto = (NotificationsNotificationListRedesignResponseDto) c0;
                if (zrlVar != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = list2;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = notificationsNotificationListRedesignResponseDto;
                    this.I$0 = i7;
                    this.I$1 = i2;
                    this.I$2 = i4;
                    this.I$3 = i6;
                    this.label = 3;
                    H = zrlVar.H(this);
                }
                wa70 wa70Var422 = this.this$0;
                boolean z422 = this.$isRefresh;
                wa70Var422.o.getClass();
                if (list2 != null) {
                    i4 = h;
                }
                if (list2 != null) {
                }
                wa70Var422.T(new wb70.a(i4, wa70Var422.f.a(notificationsNotificationListRedesignResponseDto, yosVar), notificationsNotificationListRedesignResponseDto.f(), z422, notificationsNotificationListRedesignResponseDto.i()));
                mzp0Var = this.this$0.h;
                if (mzp0Var != null) {
                }
                if (this.$isRefresh) {
                }
                return s3q0.a;
            }
            int i14 = this.I$1;
            i = this.I$0;
            ?? r4 = (zrl) this.L$1;
            kotlin.a.a(obj);
            aslVar = r4;
            intValue = i14;
            J = obj;
        }
        list = (List) J;
        int i92 = i;
        i2 = intValue;
        asl aslVar22 = aslVar;
        ua70 ua70Var2 = this.this$0.o;
        i3 = this.$pageIndex;
        notificationCategoryTab = this.$pendingCategoryId;
        ua70Var2.getClass();
        if (notificationCategoryTab != null) {
            i3 = ua70.a(list, notificationCategoryTab);
        }
        i4 = i3;
        zi70 zi70Var2 = (zi70) j5g.b0(i4, list != null ? this.$state.h : list);
        if (zi70Var2 == null) {
        }
        i5 = this.$markAsReadBeforeTime;
        if (i5 <= 0) {
        }
        String str22 = str;
        wa70 wa70Var32 = this.this$0;
        if (i92 == 0) {
        }
        boolean z32 = this.$isRefresh;
        dc70 dc70Var22 = this.$state;
        wa70Var32.getClass();
        boolean b02 = wa70.b0(dc70Var22);
        this.L$0 = null;
        this.L$1 = aslVar22;
        this.L$2 = null;
        this.L$3 = list;
        this.L$4 = null;
        this.L$5 = null;
        this.I$0 = i92;
        this.I$1 = i2;
        this.I$2 = i4;
        this.I$3 = i6;
        this.label = 2;
        c0 = wa70Var32.c0(null, b02, str22, i6, !z32 && z2 && i4 == 0 && i6 == 0, this);
        if (c0 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
