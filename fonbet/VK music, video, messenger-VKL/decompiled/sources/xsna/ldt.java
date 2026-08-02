package xsna;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppNotificationBadgeTypeDto;
import com.vk.api.generated.apps.dto.AppsCatalogListDto;
import com.vk.api.generated.apps.dto.AppsCollectionItemDto;
import com.vk.api.generated.apps.dto.AppsGetAndroidCatalogFilterDto;
import com.vk.api.generated.apps.dto.AppsGetCatalogFilterDto;
import com.vk.api.generated.apps.dto.AppsGetCollectionAppsResponseDto;
import com.vk.api.generated.apps.dto.AppsMarkBadgeAsClickedResponseDto;
import com.vk.api.generated.apps.dto.AppsMarkBadgeAsClickedTypeDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogGameDto;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.games.model.GamesCatalogNotificationBadgeType;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.games.model.SectionIdType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.vf3;

/* compiled from: GamesCatalogRepositoryImpl.kt */
/* loaded from: classes17.dex */
public final class ldt implements kdt {
    public final bdt a;
    public final cct b;
    public final fdt c;
    public final ykg d;
    public final q73 e;
    public final ovj f;
    public final Object g;
    public final Object h;

    /* compiled from: GamesCatalogRepositoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[GamesCatalogScreenTab.values().length];
            try {
                iArr[GamesCatalogScreenTab.CATALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GamesCatalogScreenTab.CATEGORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AppsAppNotificationBadgeTypeDto.values().length];
            try {
                iArr2[AppsAppNotificationBadgeTypeDto.NOTIFICATION_DISCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AppsAppNotificationBadgeTypeDto.NOTIFICATION_GIFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AppsAppNotificationBadgeTypeDto.NOTIFICATION_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[GamesCatalogNotificationBadgeType.values().length];
            try {
                iArr3[GamesCatalogNotificationBadgeType.NOTIFICATION_GIFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[GamesCatalogNotificationBadgeType.NOTIFICATION_DISCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[GamesCatalogNotificationBadgeType.NOTIFICATION_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: GamesCatalogRepositoryImpl.kt */
    @b6l(c = "com.vk.games.data.repository.GamesCatalogRepositoryImpl", f = "GamesCatalogRepositoryImpl.kt", l = {235}, m = "loadByFriendlyUrl")
    public static final class b extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ldt.this.l(null, 0, 0, this);
        }
    }

    /* compiled from: GamesCatalogRepositoryImpl.kt */
    @b6l(c = "com.vk.games.data.repository.GamesCatalogRepositoryImpl", f = "GamesCatalogRepositoryImpl.kt", l = {203}, m = "loadCollectionApps")
    public static final class c extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int label;
        /* synthetic */ Object result;

        public c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ldt.this.b(0, 0, 0, this);
        }
    }

    /* compiled from: GamesCatalogRepositoryImpl.kt */
    @b6l(c = "com.vk.games.data.repository.GamesCatalogRepositoryImpl", f = "GamesCatalogRepositoryImpl.kt", l = {155}, m = "loadSectionDetail")
    public static final class d extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public d(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ldt.this.m(null, null, null, 0, 0, this);
        }
    }

    /* compiled from: GamesCatalogRepositoryImpl.kt */
    @b6l(c = "com.vk.games.data.repository.GamesCatalogRepositoryImpl", f = "GamesCatalogRepositoryImpl.kt", l = {Sdk.SDKError.Reason.AD_EXPIRED_VALUE}, m = "markBadgeAsClicked")
    public static final class e extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public e(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ldt.this.j(null, null, this);
        }
    }

    /* compiled from: GamesCatalogRepositoryImpl.kt */
    @b6l(c = "com.vk.games.data.repository.GamesCatalogRepositoryImpl$readAllNotifications$2", f = "GamesCatalogRepositoryImpl.kt", l = {53}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public f() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new f(2, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                iz2 A = yfb.A(new ufx("apps.readAllNotifications", new eq(1), new com.vk.movika.sdk.base.model.history.b(2)));
                this.label = 1;
                if (evj.p(A, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public ldt(bdt bdtVar, cct cctVar, fdt fdtVar, ykg ykgVar, q73 q73Var) {
        ovj b2 = hqu0.b();
        this.a = bdtVar;
        this.b = cctVar;
        this.c = fdtVar;
        this.d = ykgVar;
        this.e = q73Var;
        this.f = b2;
        qe3 qe3Var = new qe3(24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, qe3Var);
        this.h = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.o0(18));
    }

    @Override // xsna.kdt
    public final void a() {
        cct cctVar = this.b;
        cctVar.a.clear();
        cctVar.b.clear();
        cctVar.c.clear();
        cctVar.d.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009d A[LOOP:0: B:11:0x0097->B:13:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.kdt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, int i2, int i3, spj<? super uat> spjVar) {
        c cVar;
        int i4;
        List<AppsMiniappsCatalogGameDto> e2;
        if (spjVar instanceof c) {
            cVar = (c) spjVar;
            int i5 = cVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cVar.label = i5 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = cVar.label;
                if (i4 != 0) {
                    kotlin.a.a(obj);
                    Integer num = new Integer(i3);
                    Integer num2 = new Integer(i2);
                    ufx ufxVar = new ufx("apps.getCollectionApps", new ao(3), new bo(3));
                    ufx.k(ufxVar, "collection_id", i, 0, 8);
                    ufx.k(ufxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 8);
                    ufxVar.f(num2.intValue(), 0, 100, "count");
                    iz2 A = yfb.A(ufxVar);
                    cVar.I$0 = i;
                    cVar.I$1 = i2;
                    cVar.I$2 = i3;
                    cVar.label = 1;
                    obj = evj.p(A, cVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                AppsGetCollectionAppsResponseDto appsGetCollectionAppsResponseDto = (AppsGetCollectionAppsResponseDto) obj;
                List<AppsAppDto> f2 = appsGetCollectionAppsResponseDto.f();
                ArrayList arrayList = new ArrayList(c5g.u(f2, 10));
                for (AppsAppDto appsAppDto : f2) {
                    this.d.getClass();
                    arrayList.add(ykg.c(appsAppDto));
                }
                cct cctVar = this.b;
                cctVar.a(arrayList);
                e2 = appsGetCollectionAppsResponseDto.e();
                if (e2 != null) {
                    cctVar.b(e2);
                }
                bdt bdtVar = this.a;
                bdtVar.getClass();
                AppsCollectionItemDto d2 = appsGetCollectionAppsResponseDto.d();
                return new uat(d2 == null ? d2.d() : null, het.a(bdtVar.c, appsGetCollectionAppsResponseDto.f()), !appsGetCollectionAppsResponseDto.f().isEmpty());
            }
        }
        cVar = new c((ContinuationImpl) spjVar);
        Object obj2 = cVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = cVar.label;
        if (i4 != 0) {
        }
        AppsGetCollectionAppsResponseDto appsGetCollectionAppsResponseDto2 = (AppsGetCollectionAppsResponseDto) obj2;
        List<AppsAppDto> f22 = appsGetCollectionAppsResponseDto2.f();
        ArrayList arrayList2 = new ArrayList(c5g.u(f22, 10));
        while (r9.hasNext()) {
        }
        cct cctVar2 = this.b;
        cctVar2.a(arrayList2);
        e2 = appsGetCollectionAppsResponseDto2.e();
        if (e2 != null) {
        }
        bdt bdtVar2 = this.a;
        bdtVar2.getClass();
        AppsCollectionItemDto d22 = appsGetCollectionAppsResponseDto2.d();
        return new uat(d22 == null ? d22.d() : null, het.a(bdtVar2.c, appsGetCollectionAppsResponseDto2.f()), !appsGetCollectionAppsResponseDto2.f().isEmpty());
    }

    @Override // xsna.kdt
    public final Object c(int i, obt obtVar) {
        Object k = myc0.k(this.f, new mdt(i, null), obtVar);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    @Override // xsna.kdt
    public final Object d(tbt tbtVar) {
        return myc0.k(this.f, new pdt(this, null), tbtVar);
    }

    @Override // xsna.kdt
    public final Object e(GamesCatalogScreenTab gamesCatalogScreenTab, int i, boolean z, cdt cdtVar) {
        return myc0.k(this.f, new odt(this, gamesCatalogScreenTab, 6, i, z, null), cdtVar);
    }

    @Override // xsna.kdt
    public final Object f(long j, nbt nbtVar) {
        ufx ufxVar = new ufx("apps.remove", new eq0(1), new k73(1));
        ufx.k(ufxVar, "id", (int) j, 0, 8);
        Object p = evj.p(yfb.A(ufxVar), nbtVar);
        return p == CoroutineSingletons.COROUTINE_SUSPENDED ? p : s3q0.a;
    }

    @Override // xsna.kdt
    public final Object g(spj<? super s3q0> spjVar) {
        Object k = myc0.k(this.f, new f(2, null), spjVar);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    @Override // xsna.kdt
    public final ey8 i(GamesCatalogScreenTab gamesCatalogScreenTab) {
        ey8 ey8Var = this.b.d.get(gamesCatalogScreenTab);
        if (ey8Var == null) {
            ey8Var = null;
        }
        return ey8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // xsna.kdt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(WebApiApplication webApiApplication, GamesCatalogNotificationBadgeType gamesCatalogNotificationBadgeType, spj<? super GamesCatalogNotificationBadgeType> spjVar) {
        e eVar;
        int i;
        AppsMarkBadgeAsClickedTypeDto appsMarkBadgeAsClickedTypeDto;
        AppsAppNotificationBadgeTypeDto d2;
        if (spjVar instanceof e) {
            eVar = (e) spjVar;
            int i2 = eVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.label = i2 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    int i3 = (int) webApiApplication.b;
                    String str = webApiApplication.w;
                    if (str == null) {
                        str = "";
                    }
                    int i4 = a.$EnumSwitchMapping$2[gamesCatalogNotificationBadgeType.ordinal()];
                    if (i4 == 1) {
                        appsMarkBadgeAsClickedTypeDto = AppsMarkBadgeAsClickedTypeDto.NOTIFICATION_GIFT;
                    } else if (i4 == 2) {
                        appsMarkBadgeAsClickedTypeDto = AppsMarkBadgeAsClickedTypeDto.NOTIFICATION_DISCOUNT;
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        appsMarkBadgeAsClickedTypeDto = AppsMarkBadgeAsClickedTypeDto.NOTIFICATION_UPDATE;
                    }
                    ufx ufxVar = new ufx("apps.markBadgeAsClicked", new fq(1), new gq(2));
                    ufx.k(ufxVar, "app_id", i3, 0, 8);
                    ufx.n(ufxVar, "track_code", str, 0, 12);
                    if (appsMarkBadgeAsClickedTypeDto != null) {
                        ufx.n(ufxVar, "type", appsMarkBadgeAsClickedTypeDto.i(), 0, 12);
                    }
                    iz2 A = yfb.A(ufxVar);
                    eVar.L$0 = null;
                    eVar.L$1 = null;
                    eVar.label = 1;
                    obj = evj.p(A, eVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                d2 = ((AppsMarkBadgeAsClickedResponseDto) obj).d();
                if (d2 != null) {
                    return null;
                }
                int i5 = a.$EnumSwitchMapping$1[d2.ordinal()];
                if (i5 == 1) {
                    return GamesCatalogNotificationBadgeType.NOTIFICATION_DISCOUNT;
                }
                if (i5 == 2) {
                    return GamesCatalogNotificationBadgeType.NOTIFICATION_GIFT;
                }
                if (i5 == 3) {
                    return GamesCatalogNotificationBadgeType.NOTIFICATION_UPDATE;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        eVar = new e((ContinuationImpl) spjVar);
        Object obj2 = eVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eVar.label;
        if (i != 0) {
        }
        d2 = ((AppsMarkBadgeAsClickedResponseDto) obj2).d();
        if (d2 != null) {
        }
    }

    @Override // xsna.kdt
    public final void k(GamesCatalogScreenTab gamesCatalogScreenTab) {
        cct cctVar = this.b;
        cctVar.getClass();
        try {
            cctVar.d.remove(gamesCatalogScreenTab);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bd A[LOOP:0: B:11:0x00b7->B:13:0x00bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.kdt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, int i, int i2, spj<? super uat> spjVar) {
        b bVar;
        int i3;
        ufx d2;
        List<AppsMiniappsCatalogGameDto> d3;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = bVar.label;
                if (i3 != 0) {
                    kotlin.a.a(obj);
                    if (((Boolean) this.h.getValue()).booleanValue()) {
                        String b2 = go9.b(DomExceptionUtils.SEPARATOR, str);
                        Integer num = new Integer(i2);
                        d2 = vf3.a.c((64497 & 2) != 0 ? null : num, new Integer(i), (64497 & 1024) != 0 ? null : b2, null, null, null);
                    } else {
                        d2 = vf3.a.d(new Integer(i2), new Integer(i), (64497 & 1024) != 0 ? null : go9.b(DomExceptionUtils.SEPARATOR, str), null, null, null);
                    }
                    iz2 A = yfb.A(d2);
                    bVar.L$0 = null;
                    bVar.I$0 = i;
                    bVar.I$1 = i2;
                    bVar.label = 1;
                    obj = evj.p(A, bVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                AppsCatalogListDto appsCatalogListDto = (AppsCatalogListDto) obj;
                List<AppsAppDto> e2 = appsCatalogListDto.e();
                ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
                for (AppsAppDto appsAppDto : e2) {
                    this.d.getClass();
                    arrayList.add(ykg.c(appsAppDto));
                }
                cct cctVar = this.b;
                cctVar.a(arrayList);
                d3 = appsCatalogListDto.d();
                if (d3 != null) {
                    cctVar.b(d3);
                }
                return this.a.a(appsCatalogListDto);
            }
        }
        bVar = new b((ContinuationImpl) spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = bVar.label;
        if (i3 != 0) {
        }
        AppsCatalogListDto appsCatalogListDto2 = (AppsCatalogListDto) obj2;
        List<AppsAppDto> e22 = appsCatalogListDto2.e();
        ArrayList arrayList2 = new ArrayList(c5g.u(e22, 10));
        while (r11.hasNext()) {
        }
        cct cctVar2 = this.b;
        cctVar2.a(arrayList2);
        d3 = appsCatalogListDto2.d();
        if (d3 != null) {
        }
        return this.a.a(appsCatalogListDto2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x012d A[LOOP:0: B:11:0x0127->B:13:0x012d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.kdt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(SectionIdType sectionIdType, Integer num, Integer num2, int i, int i2, spj<? super uat> spjVar) {
        d dVar;
        int i3;
        AppsGetCatalogFilterDto appsGetCatalogFilterDto;
        ufx d2;
        AppsGetAndroidCatalogFilterDto appsGetAndroidCatalogFilterDto;
        List<AppsMiniappsCatalogGameDto> d3;
        if (spjVar instanceof d) {
            dVar = (d) spjVar;
            int i4 = dVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar.label = i4 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = dVar.label;
                if (i3 != 0) {
                    kotlin.a.a(obj);
                    if (((Boolean) this.h.getValue()).booleanValue()) {
                        if (sectionIdType != null) {
                            if (sectionIdType.equals(SectionIdType.Installed.c)) {
                                appsGetAndroidCatalogFilterDto = AppsGetAndroidCatalogFilterDto.INSTALLED;
                            } else if (sectionIdType.equals(SectionIdType.New.c)) {
                                appsGetAndroidCatalogFilterDto = AppsGetAndroidCatalogFilterDto.NEW;
                            } else if (sectionIdType.equals(SectionIdType.Recommended.c)) {
                                appsGetAndroidCatalogFilterDto = AppsGetAndroidCatalogFilterDto.RECOMMENDED;
                            }
                            d2 = vf3.a.c((51185 & 2) == 0 ? null : new Integer(i2), new Integer(i), null, (51185 & 2048) == 0 ? null : num2, (51185 & 4096) == 0 ? null : num, (51185 & 8192) == 0 ? null : appsGetAndroidCatalogFilterDto);
                        }
                        appsGetAndroidCatalogFilterDto = null;
                        d2 = vf3.a.c((51185 & 2) == 0 ? null : new Integer(i2), new Integer(i), null, (51185 & 2048) == 0 ? null : num2, (51185 & 4096) == 0 ? null : num, (51185 & 8192) == 0 ? null : appsGetAndroidCatalogFilterDto);
                    } else {
                        if (sectionIdType != null) {
                            if (sectionIdType.equals(SectionIdType.Installed.c)) {
                                appsGetCatalogFilterDto = AppsGetCatalogFilterDto.INSTALLED;
                            } else if (sectionIdType.equals(SectionIdType.New.c)) {
                                appsGetCatalogFilterDto = AppsGetCatalogFilterDto.NEW;
                            } else if (sectionIdType.equals(SectionIdType.Recommended.c)) {
                                appsGetCatalogFilterDto = AppsGetCatalogFilterDto.RECOMMENDED;
                            }
                            d2 = vf3.a.d(new Integer(i2), new Integer(i), null, (51185 & 2048) == 0 ? null : num2, (51185 & 4096) == 0 ? null : num, (51185 & 8192) == 0 ? null : appsGetCatalogFilterDto);
                        }
                        appsGetCatalogFilterDto = null;
                        d2 = vf3.a.d(new Integer(i2), new Integer(i), null, (51185 & 2048) == 0 ? null : num2, (51185 & 4096) == 0 ? null : num, (51185 & 8192) == 0 ? null : appsGetCatalogFilterDto);
                    }
                    iz2 A = yfb.A(d2);
                    dVar.L$0 = null;
                    dVar.L$1 = null;
                    dVar.L$2 = null;
                    dVar.I$0 = i;
                    dVar.I$1 = i2;
                    dVar.label = 1;
                    obj = evj.p(A, dVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                AppsCatalogListDto appsCatalogListDto = (AppsCatalogListDto) obj;
                List<AppsAppDto> e2 = appsCatalogListDto.e();
                ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
                for (AppsAppDto appsAppDto : e2) {
                    this.d.getClass();
                    arrayList.add(ykg.c(appsAppDto));
                }
                cct cctVar = this.b;
                cctVar.a(arrayList);
                d3 = appsCatalogListDto.d();
                if (d3 != null) {
                    cctVar.b(d3);
                }
                return this.a.a(appsCatalogListDto);
            }
        }
        dVar = new d((ContinuationImpl) spjVar);
        Object obj2 = dVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = dVar.label;
        if (i3 != 0) {
        }
        AppsCatalogListDto appsCatalogListDto2 = (AppsCatalogListDto) obj2;
        List<AppsAppDto> e22 = appsCatalogListDto2.e();
        ArrayList arrayList2 = new ArrayList(c5g.u(e22, 10));
        while (r1.hasNext()) {
        }
        cct cctVar2 = this.b;
        cctVar2.a(arrayList2);
        d3 = appsCatalogListDto2.d();
        if (d3 != null) {
        }
        return this.a.a(appsCatalogListDto2);
    }

    @Override // xsna.kdt
    public final Object n(int i, vat vatVar) {
        return myc0.k(this.f, new ndt(this, i, 12, null), vatVar);
    }

    @Override // xsna.kdt
    public final Object o(vat vatVar) {
        return myc0.k(this.f, new qdt(this, null), vatVar);
    }
}
