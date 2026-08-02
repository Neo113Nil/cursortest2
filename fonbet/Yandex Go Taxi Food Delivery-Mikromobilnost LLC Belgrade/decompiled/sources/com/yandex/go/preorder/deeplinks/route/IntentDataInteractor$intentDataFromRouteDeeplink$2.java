package com.yandex.go.preorder.deeplinks.route;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.go.preorder.deeplinks.route.IntentData;
import com.yandex.go.taxi.order.models.api.affiliate.AffiliateInfo;
import defpackage.c2l0;
import defpackage.d580;
import defpackage.evu0;
import defpackage.ffp;
import defpackage.h0h;
import defpackage.h4l0;
import defpackage.jl40;
import defpackage.lsw;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.q0h;
import defpackage.qoh;
import defpackage.qq80;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4e;
import defpackage.xnt;
import defpackage.zy11;
import defpackage.zzs;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.SerializationException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/preorder/deeplinks/route/IntentData;", "<anonymous>", "(Ltse;)Lcom/yandex/go/preorder/deeplinks/route/IntentData;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.deeplinks.route.IntentDataInteractor$intentDataFromRouteDeeplink$2", f = "IntentDataInteractor.kt", l = {60, MSException.ERROR_INVALID_PASSWORD, MSException.ERROR_INVALID_PARAMETER, HProv.ALG_SID_KECCAK_224, HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class IntentDataInteractor$intentDataFromRouteDeeplink$2 extends SuspendLambda implements wls {
    final /* synthetic */ c2l0 $deeplink;
    final /* synthetic */ Uri $uri;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentDataInteractor$intentDataFromRouteDeeplink$2(b bVar, Uri uri, c2l0 c2l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$uri = uri;
        this.$deeplink = c2l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IntentDataInteractor$intentDataFromRouteDeeplink$2 intentDataInteractor$intentDataFromRouteDeeplink$2 = new IntentDataInteractor$intentDataFromRouteDeeplink$2(this.this$0, this.$uri, this.$deeplink, continuation);
        intentDataInteractor$intentDataFromRouteDeeplink$2.L$0 = obj;
        return intentDataInteractor$intentDataFromRouteDeeplink$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntentDataInteractor$intentDataFromRouteDeeplink$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0153, code lost:
    
        if (r3 == r2) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f1  */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        noh h;
        noh h2;
        d580 d580Var;
        String str;
        Set set;
        Object s;
        int i;
        int i2;
        qq80 qq80Var;
        noh nohVar;
        Set set2;
        int i3;
        int i4;
        List W;
        zzs zzsVar;
        Object k;
        noh nohVar2;
        d580 d580Var2;
        Object k2;
        zzs zzsVar2;
        int i5;
        noh nohVar3;
        List list;
        Object k3;
        int i6;
        int i7;
        zzs zzsVar3;
        zzs zzsVar4;
        String str2;
        IntentData.SummaryState summaryState;
        String str3;
        int i8;
        lsw lswVar;
        String str4;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = this.label;
        if (i9 == 0) {
            kotlin.b.b(obj);
            this.this$0.b.a.a.a("LaunchIntentRoute", x4e.p(Constants.DEEPLINK, h4l0.a(this.$uri.toString())), 1, new HashMap());
            ru.yandex.taxi.favorites.data.repo.a aVar = this.this$0.d;
            this.L$0 = tseVar;
            this.label = 1;
            c = aVar.c(false, this);
        } else {
            if (i9 != 1) {
                if (i9 == 2) {
                    i2 = this.I$3;
                    i4 = this.I$2;
                    int i10 = this.I$1;
                    i = this.I$0;
                    Set set3 = (Set) this.L$9;
                    qq80 qq80Var2 = (qq80) this.L$8;
                    d580 d580Var3 = (d580) this.L$6;
                    h2 = (noh) this.L$5;
                    h = (noh) this.L$4;
                    nohVar = (noh) this.L$3;
                    kotlin.b.b(obj);
                    i3 = i10;
                    d580Var = d580Var3;
                    s = obj;
                    qq80Var = qq80Var2;
                    set2 = set3;
                    zzsVar = (zzs) s;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = nohVar;
                    this.L$4 = null;
                    this.L$5 = h2;
                    this.L$6 = d580Var;
                    this.L$7 = null;
                    this.L$8 = qq80Var;
                    this.L$9 = set2;
                    this.L$10 = zzsVar;
                    this.I$0 = i;
                    this.I$1 = i3;
                    this.I$2 = i4;
                    this.I$3 = i2;
                    this.label = 3;
                    k = h.k(this);
                    if (k != coroutineSingletons) {
                        nohVar2 = h2;
                        d580Var2 = d580Var;
                        zzs zzsVar5 = (zzs) k;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = nohVar2;
                        this.L$6 = d580Var2;
                        this.L$7 = null;
                        this.L$8 = qq80Var;
                        this.L$9 = set2;
                        this.L$10 = zzsVar;
                        this.L$11 = zzsVar5;
                        this.I$0 = i;
                        this.I$1 = i3;
                        this.I$2 = i4;
                        this.I$3 = i2;
                        this.label = 4;
                        k2 = nohVar.k(this);
                        if (k2 != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i9 == 3) {
                    i2 = this.I$3;
                    i4 = this.I$2;
                    i3 = this.I$1;
                    i = this.I$0;
                    zzsVar = (zzs) this.L$10;
                    set2 = (Set) this.L$9;
                    qq80Var = (qq80) this.L$8;
                    d580Var2 = (d580) this.L$6;
                    nohVar2 = (noh) this.L$5;
                    nohVar = (noh) this.L$3;
                    kotlin.b.b(obj);
                    k = obj;
                    zzs zzsVar52 = (zzs) k;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = nohVar2;
                    this.L$6 = d580Var2;
                    this.L$7 = null;
                    this.L$8 = qq80Var;
                    this.L$9 = set2;
                    this.L$10 = zzsVar;
                    this.L$11 = zzsVar52;
                    this.I$0 = i;
                    this.I$1 = i3;
                    this.I$2 = i4;
                    this.I$3 = i2;
                    this.label = 4;
                    k2 = nohVar.k(this);
                    if (k2 != coroutineSingletons) {
                        int i11 = i;
                        zzsVar2 = zzsVar52;
                        i5 = i11;
                        nohVar3 = nohVar2;
                        list = (List) k2;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = d580Var2;
                        this.L$7 = null;
                        this.L$8 = qq80Var;
                        this.L$9 = set2;
                        this.L$10 = zzsVar;
                        this.L$11 = zzsVar2;
                        this.L$12 = list;
                        this.I$0 = i5;
                        this.I$1 = i3;
                        this.I$2 = i4;
                        this.I$3 = i2;
                        this.label = 5;
                        k3 = nohVar3.k(this);
                        if (k3 != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i9 != 4) {
                    if (i9 != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = this.I$3;
                    i6 = this.I$2;
                    i7 = this.I$1;
                    i5 = this.I$0;
                    list = (List) this.L$12;
                    zzs zzsVar6 = (zzs) this.L$11;
                    zzs zzsVar7 = (zzs) this.L$10;
                    set2 = (Set) this.L$9;
                    qq80Var = (qq80) this.L$8;
                    d580Var2 = (d580) this.L$6;
                    kotlin.b.b(obj);
                    k3 = obj;
                    zzsVar3 = zzsVar6;
                    zzsVar4 = zzsVar7;
                    int i12 = i5;
                    List list2 = list;
                    Set set4 = set2;
                    qq80 qq80Var3 = qq80Var;
                    String str5 = (String) k3;
                    if (d580Var2 != null || (r4 = d580Var2.a) == null) {
                        List list3 = EmptyList.a;
                    }
                    List list4 = list3;
                    AffiliateInfo s2 = this.this$0.a.s(this.$uri);
                    c2l0 c2l0Var = this.$deeplink;
                    String str6 = c2l0Var.d;
                    String str7 = c2l0Var.b;
                    String str8 = c2l0Var.z;
                    String str9 = c2l0Var.A;
                    Boolean bool = c2l0Var.r;
                    boolean booleanValue = bool == null ? bool.booleanValue() : false;
                    c2l0 c2l0Var2 = this.$deeplink;
                    String str10 = c2l0Var2.s;
                    String str11 = c2l0Var2.t;
                    String str12 = c2l0Var2.u;
                    String str13 = c2l0Var2.v;
                    a aVar2 = IntentData.SummaryState.Companion;
                    str2 = c2l0Var2.e;
                    aVar2.getClass();
                    summaryState = IntentData.SummaryState.EXPANDED;
                    if (!jl40.l(summaryState.getValue(), str2)) {
                        summaryState = IntentData.SummaryState.COLLAPSED;
                    }
                    IntentData.SummaryState summaryState2 = summaryState;
                    c2l0 c2l0Var3 = this.$deeplink;
                    String str14 = c2l0Var3.w;
                    b bVar = this.this$0;
                    str3 = c2l0Var3.y;
                    bVar.getClass();
                    if (str3 != null) {
                        if (evu0.J(str3)) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            q0h q0hVar = bVar.g;
                            Uri parse = Uri.parse(str3);
                            if (q0hVar.c(parse)) {
                                String authority = parse.getAuthority();
                                if (authority == null || evu0.J(authority)) {
                                    i8 = i2;
                                    str4 = "";
                                } else {
                                    i8 = i2;
                                    str4 = authority.toLowerCase(Locale.ROOT);
                                }
                                h0h d = q0hVar.d(str4);
                                if (d != null) {
                                    lswVar = new lsw(d, parse);
                                    return new IntentData(zzsVar4, zzsVar3, list2, list4, s2, str6, str7, str8, str9, str10, str11, str12, str13, summaryState2, booleanValue, str14, i7 == 0, str5, i12, i6 == 0, i8 == 0, lswVar, this.$deeplink.x, qq80Var3, set4);
                                }
                                lswVar = null;
                                return new IntentData(zzsVar4, zzsVar3, list2, list4, s2, str6, str7, str8, str9, str10, str11, str12, str13, summaryState2, booleanValue, str14, i7 == 0, str5, i12, i6 == 0, i8 == 0, lswVar, this.$deeplink.x, qq80Var3, set4);
                            }
                        }
                    }
                    i8 = i2;
                    lswVar = null;
                    return new IntentData(zzsVar4, zzsVar3, list2, list4, s2, str6, str7, str8, str9, str10, str11, str12, str13, summaryState2, booleanValue, str14, i7 == 0, str5, i12, i6 == 0, i8 == 0, lswVar, this.$deeplink.x, qq80Var3, set4);
                }
                i2 = this.I$3;
                i4 = this.I$2;
                int i13 = this.I$1;
                int i14 = this.I$0;
                zzsVar2 = (zzs) this.L$11;
                zzs zzsVar8 = (zzs) this.L$10;
                Set set5 = (Set) this.L$9;
                qq80 qq80Var4 = (qq80) this.L$8;
                d580 d580Var4 = (d580) this.L$6;
                nohVar3 = (noh) this.L$5;
                kotlin.b.b(obj);
                i5 = i14;
                zzsVar = zzsVar8;
                set2 = set5;
                qq80Var = qq80Var4;
                d580Var2 = d580Var4;
                i3 = i13;
                k2 = obj;
                list = (List) k2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = d580Var2;
                this.L$7 = null;
                this.L$8 = qq80Var;
                this.L$9 = set2;
                this.L$10 = zzsVar;
                this.L$11 = zzsVar2;
                this.L$12 = list;
                this.I$0 = i5;
                this.I$1 = i3;
                this.I$2 = i4;
                this.I$3 = i2;
                this.label = 5;
                k3 = nohVar3.k(this);
                if (k3 != coroutineSingletons) {
                    i6 = i4;
                    i7 = i3;
                    zzsVar3 = zzsVar2;
                    zzsVar4 = zzsVar;
                    int i122 = i5;
                    List list22 = list;
                    Set set42 = set2;
                    qq80 qq80Var32 = qq80Var;
                    String str52 = (String) k3;
                    if (d580Var2 != null) {
                    }
                    List list32 = EmptyList.a;
                    List list42 = list32;
                    AffiliateInfo s22 = this.this$0.a.s(this.$uri);
                    c2l0 c2l0Var4 = this.$deeplink;
                    String str62 = c2l0Var4.d;
                    String str72 = c2l0Var4.b;
                    String str82 = c2l0Var4.z;
                    String str92 = c2l0Var4.A;
                    Boolean bool2 = c2l0Var4.r;
                    if (bool2 == null) {
                    }
                    c2l0 c2l0Var22 = this.$deeplink;
                    String str102 = c2l0Var22.s;
                    String str112 = c2l0Var22.t;
                    String str122 = c2l0Var22.u;
                    String str132 = c2l0Var22.v;
                    a aVar22 = IntentData.SummaryState.Companion;
                    str2 = c2l0Var22.e;
                    aVar22.getClass();
                    summaryState = IntentData.SummaryState.EXPANDED;
                    if (!jl40.l(summaryState.getValue(), str2)) {
                    }
                    IntentData.SummaryState summaryState22 = summaryState;
                    c2l0 c2l0Var32 = this.$deeplink;
                    String str142 = c2l0Var32.w;
                    b bVar2 = this.this$0;
                    str3 = c2l0Var32.y;
                    bVar2.getClass();
                    if (str3 != null) {
                    }
                    i8 = i2;
                    lswVar = null;
                    return new IntentData(zzsVar4, zzsVar3, list22, list42, s22, str62, str72, str82, str92, str102, str112, str122, str132, summaryState22, booleanValue, str142, i7 == 0, str52, i122, i6 == 0, i8 == 0, lswVar, this.$deeplink.x, qq80Var32, set42);
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
            c = obj;
        }
        ffp ffpVar = (ffp) c;
        List list5 = ffpVar != null ? ffpVar.a : null;
        qoh h3 = tje.h(tseVar, null, null, new IntentDataInteractor$intentDataFromRouteDeeplink$2$sourcePointDeferred$1(this.this$0, this.$deeplink, list5, null), 3);
        qoh h4 = tje.h(tseVar, null, null, new IntentDataInteractor$intentDataFromRouteDeeplink$2$additionalPointsDeferred$1(this.this$0, this.$uri, null), 3);
        h = tje.h(tseVar, null, null, new IntentDataInteractor$intentDataFromRouteDeeplink$2$destinationPointDeferred$1(this.this$0, this.$deeplink, list5, null), 3);
        h2 = tje.h(tseVar, null, null, new IntentDataInteractor$intentDataFromRouteDeeplink$2$organizationNameUriDeferred$1(this.this$0, this.$deeplink, null), 3);
        Integer num = this.$deeplink.m;
        int intValue = num != null ? num.intValue() : -1;
        Boolean bool3 = this.$deeplink.n;
        ?? booleanValue2 = bool3 != null ? bool3.booleanValue() : 0;
        Boolean bool4 = this.$deeplink.o;
        ?? booleanValue3 = bool4 != null ? bool4.booleanValue() : 0;
        Boolean bool5 = this.$deeplink.p;
        ?? booleanValue4 = bool5 != null ? bool5.booleanValue() : 0;
        b bVar3 = this.this$0;
        c2l0 c2l0Var5 = this.$deeplink;
        bVar3.getClass();
        String str15 = c2l0Var5.q;
        if (str15 != null && !evu0.J(str15)) {
            try {
                d580Var = (d580) ((xnt) bVar3.c).c(str15, d580.Companion.serializer());
            } catch (ClassCastException | SerializationException unused) {
            }
            String queryParameter = this.$uri.getQueryParameter("origin_type");
            qq80 qq80Var5 = queryParameter == null ? new qq80(queryParameter) : qq80.b;
            str = this.$deeplink.f;
            if (str == null) {
                W = evu0.W(str, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                set = kotlin.collections.a.N0(W);
            } else {
                set = null;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = h4;
            this.L$4 = h;
            this.L$5 = h2;
            this.L$6 = d580Var;
            this.L$7 = null;
            this.L$8 = qq80Var5;
            this.L$9 = set;
            this.I$0 = intValue;
            this.I$1 = booleanValue2;
            this.I$2 = booleanValue3;
            this.I$3 = booleanValue4;
            this.label = 2;
            s = h3.s(this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (s != coroutineSingletons) {
                i = intValue;
                i2 = booleanValue4;
                qq80Var = qq80Var5;
                nohVar = h4;
                set2 = set;
                i3 = booleanValue2;
                i4 = booleanValue3;
                zzsVar = (zzs) s;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar;
                this.L$4 = null;
                this.L$5 = h2;
                this.L$6 = d580Var;
                this.L$7 = null;
                this.L$8 = qq80Var;
                this.L$9 = set2;
                this.L$10 = zzsVar;
                this.I$0 = i;
                this.I$1 = i3;
                this.I$2 = i4;
                this.I$3 = i2;
                this.label = 3;
                k = h.k(this);
                if (k != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        d580Var = null;
        String queryParameter2 = this.$uri.getQueryParameter("origin_type");
        if (queryParameter2 == null) {
        }
        str = this.$deeplink.f;
        if (str == null) {
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h4;
        this.L$4 = h;
        this.L$5 = h2;
        this.L$6 = d580Var;
        this.L$7 = null;
        this.L$8 = qq80Var5;
        this.L$9 = set;
        this.I$0 = intValue;
        this.I$1 = booleanValue2;
        this.I$2 = booleanValue3;
        this.I$3 = booleanValue4;
        this.label = 2;
        s = h3.s(this);
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (s != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
