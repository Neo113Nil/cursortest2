package com.yandex.go.navigator.rate_route;

import android.graphics.Bitmap;
import com.yandex.mapkit.geometry.Point;
import defpackage.as00;
import defpackage.bl00;
import defpackage.cm21;
import defpackage.cvq;
import defpackage.dms;
import defpackage.jl40;
import defpackage.js00;
import defpackage.kyh0;
import defpackage.le50;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o8l0;
import defpackage.p7i0;
import defpackage.p8l0;
import defpackage.par;
import defpackage.r4v;
import defpackage.rcc;
import defpackage.tcc;
import defpackage.zsq;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lle50;", ConfigConstants.CONFIG, "Ljs00;", "mapStyleConfig", "Lcm21;", "feedback", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lp8l0;", "<anonymous>", "(Lle50;Ljs00;Lcm21;Lru/yandex/taxi/theme/ThemeType;)Lp8l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.rate_route.RateRoutePresenter$attachView$1", f = "RateRoutePresenter.kt", l = {HProv.PP_CIPHEROID, 104, HProv.PP_SET_PIN, 113}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class RateRoutePresenter$attachView$1 extends SuspendLambda implements dms {
    final /* synthetic */ noh $streetAddressDeferred;
    int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ p7i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateRoutePresenter$attachView$1(p7i0 p7i0Var, noh nohVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = p7i0Var;
        this.$streetAddressDeferred = nohVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        RateRoutePresenter$attachView$1 rateRoutePresenter$attachView$1 = new RateRoutePresenter$attachView$1(this.this$0, this.$streetAddressDeferred, (Continuation) obj5);
        rateRoutePresenter$attachView$1.L$0 = (le50) obj;
        rateRoutePresenter$attachView$1.L$1 = (js00) obj2;
        rateRoutePresenter$attachView$1.L$2 = (cm21) obj3;
        rateRoutePresenter$attachView$1.L$3 = (ThemeType) obj4;
        return rateRoutePresenter$attachView$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0234, code lost:
    
        if (r7 == r3) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0163  */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0153 -> B:28:0x0154). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Iterator it;
        p7i0 p7i0Var;
        Collection collection;
        List list;
        Pair pair;
        EmptyList J0;
        p7i0 p7i0Var2;
        ListBuilder a;
        Point point;
        List list2;
        Collection collection2;
        List list3;
        Object b;
        ListBuilder listBuilder;
        List list4;
        Collection collection3;
        Point point2;
        Object a2;
        ListBuilder listBuilder2;
        List list5;
        Object k;
        int i2;
        List list6;
        le50 le50Var = (le50) this.L$0;
        js00 js00Var = (js00) this.L$1;
        cm21 cm21Var = (cm21) this.L$2;
        ThemeType themeType = (ThemeType) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        Object obj2 = null;
        if (i3 == 0) {
            kotlin.b.b(obj);
            String str = cm21Var.c;
            i = (str == null || str.length() == 0) ? kyh0.common_done : kyh0.navigator_rate_route_send_button;
            ArrayList arrayList = le50Var.e;
            p7i0 p7i0Var3 = this.this$0;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            it = arrayList.iterator();
            p7i0Var = p7i0Var3;
            collection = arrayList2;
            if (it.hasNext()) {
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = this.I$0;
                    list6 = (List) this.L$6;
                    list5 = (List) this.L$5;
                    list = (List) this.L$4;
                    kotlin.b.b(obj);
                    k = obj;
                    i2 = i4;
                    List list7 = list;
                    String str2 = le50Var.a;
                    String str3 = le50Var.b;
                    String str4 = le50Var.c;
                    String str5 = (String) this.this$0.M.getValue();
                    p7i0 p7i0Var4 = this.this$0;
                    return new p8l0((String) k, str2, str3, str4, list7, cm21Var, i2, new as00(list6, str5, p7i0Var4.L, (String) p7i0Var4.N.getValue(), list5, js00Var), themeType);
                }
                i = this.I$0;
                collection2 = (List) this.L$11;
                ?? r7 = (List) this.L$10;
                Point point3 = (Point) this.L$9;
                list3 = (List) this.L$6;
                list2 = (List) this.L$4;
                kotlin.b.b(obj);
                point2 = point3;
                a = r7;
                a2 = obj;
                a.add(new o8l0((bl00) a2, point2));
                pair = new Pair(collection2, ((ListBuilder) list3).j());
                list = list2;
                list5 = (List) pair.getFirst();
                List list8 = (List) pair.getSecond();
                noh nohVar = this.$streetAddressDeferred;
                this.L$0 = le50Var;
                this.L$1 = js00Var;
                this.L$2 = cm21Var;
                this.L$3 = themeType;
                this.L$4 = list;
                this.L$5 = list5;
                this.L$6 = list8;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = null;
                this.L$12 = null;
                this.L$13 = null;
                this.I$0 = i;
                this.label = 4;
                k = nohVar.k(this);
                if (k != coroutineSingletons) {
                    i2 = i;
                    list6 = list8;
                    List list72 = list;
                    String str22 = le50Var.a;
                    String str32 = le50Var.b;
                    String str42 = le50Var.c;
                    String str52 = (String) this.this$0.M.getValue();
                    p7i0 p7i0Var42 = this.this$0;
                    return new p8l0((String) k, str22, str32, str42, list72, cm21Var, i2, new as00(list6, str52, p7i0Var42.L, (String) p7i0Var42.N.getValue(), list5, js00Var), themeType);
                }
                return coroutineSingletons;
            }
            i = this.I$0;
            Collection collection4 = (List) this.L$12;
            ?? r8 = (List) this.L$11;
            point = (Point) this.L$10;
            ?? r13 = (List) this.L$8;
            list4 = (List) this.L$7;
            p7i0Var2 = (p7i0) this.L$6;
            ?? r5 = (List) this.L$5;
            list = (List) this.L$4;
            kotlin.b.b(obj);
            listBuilder = r8;
            collection3 = collection4;
            J0 = r5;
            b = obj;
            listBuilder2 = r13;
            listBuilder.add(new o8l0((bl00) b, point));
            ListBuilder listBuilder3 = listBuilder2;
            list2 = list;
            collection2 = collection3;
            a = listBuilder3;
            le50Var = le50Var;
            list3 = list4;
            point2 = (Point) kotlin.collections.a.b0(J0);
            if (point2 != null) {
                com.yandex.go.navigator.providers.b bVar = p7i0Var2.D;
                this.L$0 = le50Var;
                this.L$1 = js00Var;
                this.L$2 = cm21Var;
                this.L$3 = themeType;
                this.L$4 = list2;
                this.L$5 = null;
                this.L$6 = list3;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = point2;
                this.L$10 = a;
                this.L$11 = collection2;
                this.L$12 = null;
                this.L$13 = null;
                this.I$0 = i;
                this.label = 3;
                a2 = bVar.a(this);
            }
            pair = new Pair(collection2, ((ListBuilder) list3).j());
            list = list2;
            list5 = (List) pair.getFirst();
            List list82 = (List) pair.getSecond();
            noh nohVar2 = this.$streetAddressDeferred;
            this.L$0 = le50Var;
            this.L$1 = js00Var;
            this.L$2 = cm21Var;
            this.L$3 = themeType;
            this.L$4 = list;
            this.L$5 = list5;
            this.L$6 = list82;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.L$10 = null;
            this.L$11 = null;
            this.L$12 = null;
            this.L$13 = null;
            this.I$0 = i;
            this.label = 4;
            k = nohVar2.k(this);
            if (k != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        i = this.I$0;
        collection = (Collection) this.L$13;
        String str6 = (String) this.L$12;
        zsq zsqVar = (zsq) this.L$10;
        it = (Iterator) this.L$8;
        Collection collection5 = (Collection) this.L$7;
        p7i0Var = (p7i0) this.L$5;
        kotlin.b.b(obj);
        String str7 = str6;
        Object b2 = obj;
        collection.add(new cvq(str7, (Bitmap) b2, zsqVar.d));
        collection = collection5;
        obj2 = null;
        if (it.hasNext()) {
            zsqVar = (zsq) it.next();
            String str8 = jl40.l(zsqVar.a, cm21Var.a) ? zsqVar.b : zsqVar.c;
            str7 = zsqVar.a;
            r4v r4vVar = p7i0Var.H;
            this.L$0 = le50Var;
            this.L$1 = js00Var;
            this.L$2 = cm21Var;
            this.L$3 = themeType;
            this.L$4 = obj2;
            this.L$5 = p7i0Var;
            this.L$6 = obj2;
            this.L$7 = collection;
            this.L$8 = it;
            this.L$9 = obj2;
            this.L$10 = zsqVar;
            this.L$11 = obj2;
            this.L$12 = str7;
            this.L$13 = collection;
            this.I$0 = i;
            this.label = 1;
            b2 = ru.yandex.taxi.utils.a.b(r4vVar.a.b().b(((m7x0) r4vVar.b).a(str8)), this);
            if (b2 != coroutineSingletons) {
                collection5 = collection;
                collection.add(new cvq(str7, (Bitmap) b2, zsqVar.d));
                collection = collection5;
                obj2 = null;
                if (it.hasNext()) {
                    list = (List) collection;
                    par parVar = this.this$0.B;
                    int size = parVar.d.size();
                    EmptyList emptyList = EmptyList.a;
                    if (!(size > 1 ? kotlin.collections.a.J0(parVar.d) : emptyList).isEmpty()) {
                        long currentTimeMillis = System.currentTimeMillis() - parVar.f;
                        if (currentTimeMillis < 0) {
                            currentTimeMillis = 0;
                        }
                        if (currentTimeMillis > 60000) {
                            par parVar2 = this.this$0.B;
                            J0 = parVar2.d.size() > 1 ? kotlin.collections.a.J0(parVar2.d) : emptyList;
                            p7i0Var2 = this.this$0;
                            a = rcc.a();
                            point = (Point) kotlin.collections.a.R(J0);
                            if (point != null) {
                                com.yandex.go.navigator.providers.b bVar2 = p7i0Var2.D;
                                this.L$0 = le50Var;
                                this.L$1 = js00Var;
                                this.L$2 = cm21Var;
                                this.L$3 = themeType;
                                this.L$4 = list;
                                this.L$5 = J0;
                                this.L$6 = p7i0Var2;
                                this.L$7 = a;
                                this.L$8 = a;
                                this.L$9 = null;
                                this.L$10 = point;
                                this.L$11 = a;
                                this.L$12 = J0;
                                this.L$13 = null;
                                this.I$0 = i;
                                this.label = 2;
                                b = bVar2.b(this);
                                if (b != coroutineSingletons) {
                                    listBuilder = a;
                                    ListBuilder listBuilder4 = listBuilder;
                                    list4 = listBuilder4;
                                    collection3 = J0;
                                    listBuilder2 = listBuilder4;
                                    listBuilder.add(new o8l0((bl00) b, point));
                                    ListBuilder listBuilder32 = listBuilder2;
                                    list2 = list;
                                    collection2 = collection3;
                                    a = listBuilder32;
                                    le50Var = le50Var;
                                    list3 = list4;
                                    point2 = (Point) kotlin.collections.a.b0(J0);
                                    if (point2 != null) {
                                    }
                                    pair = new Pair(collection2, ((ListBuilder) list3).j());
                                    list = list2;
                                    list5 = (List) pair.getFirst();
                                    List list822 = (List) pair.getSecond();
                                    noh nohVar22 = this.$streetAddressDeferred;
                                    this.L$0 = le50Var;
                                    this.L$1 = js00Var;
                                    this.L$2 = cm21Var;
                                    this.L$3 = themeType;
                                    this.L$4 = list;
                                    this.L$5 = list5;
                                    this.L$6 = list822;
                                    this.L$7 = null;
                                    this.L$8 = null;
                                    this.L$9 = null;
                                    this.L$10 = null;
                                    this.L$11 = null;
                                    this.L$12 = null;
                                    this.L$13 = null;
                                    this.I$0 = i;
                                    this.label = 4;
                                    k = nohVar22.k(this);
                                    if (k != coroutineSingletons) {
                                    }
                                }
                            } else {
                                list2 = list;
                                collection2 = J0;
                                list3 = a;
                                point2 = (Point) kotlin.collections.a.b0(J0);
                                if (point2 != null) {
                                }
                                pair = new Pair(collection2, ((ListBuilder) list3).j());
                                list = list2;
                                list5 = (List) pair.getFirst();
                                List list8222 = (List) pair.getSecond();
                                noh nohVar222 = this.$streetAddressDeferred;
                                this.L$0 = le50Var;
                                this.L$1 = js00Var;
                                this.L$2 = cm21Var;
                                this.L$3 = themeType;
                                this.L$4 = list;
                                this.L$5 = list5;
                                this.L$6 = list8222;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.L$9 = null;
                                this.L$10 = null;
                                this.L$11 = null;
                                this.L$12 = null;
                                this.L$13 = null;
                                this.I$0 = i;
                                this.label = 4;
                                k = nohVar222.k(this);
                                if (k != coroutineSingletons) {
                                }
                            }
                        }
                    }
                    pair = new Pair(emptyList, emptyList);
                    list5 = (List) pair.getFirst();
                    List list82222 = (List) pair.getSecond();
                    noh nohVar2222 = this.$streetAddressDeferred;
                    this.L$0 = le50Var;
                    this.L$1 = js00Var;
                    this.L$2 = cm21Var;
                    this.L$3 = themeType;
                    this.L$4 = list;
                    this.L$5 = list5;
                    this.L$6 = list82222;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$10 = null;
                    this.L$11 = null;
                    this.L$12 = null;
                    this.L$13 = null;
                    this.I$0 = i;
                    this.label = 4;
                    k = nohVar2222.k(this);
                    if (k != coroutineSingletons) {
                    }
                }
            }
        }
        return coroutineSingletons;
    }
}
