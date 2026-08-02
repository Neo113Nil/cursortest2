package com.yandex.go.morphlex.data;

import com.yandex.go.address.models.Address;
import com.yandex.go.morphlex.api.MorphlexScreenPayload$ParamType;
import com.yandex.go.morphlex.data.dto.MorphlexRequestDto;
import com.yandex.go.zone.model.Zone;
import defpackage.axm;
import defpackage.d0l0;
import defpackage.h830;
import defpackage.kmx0;
import defpackage.lv90;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.rfa0;
import defpackage.rpj0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/morphlex/data/dto/MorphlexRequestDto;", "<anonymous>", "(Ltse;)Lcom/yandex/go/morphlex/data/dto/MorphlexRequestDto;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.morphlex.data.MorphlexFlexConfigFactory$awaitMorphlexRequest$2", f = "MorphlexFlexConfigFactory.kt", l = {221, 226}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MorphlexFlexConfigFactory$awaitMorphlexRequest$2 extends SuspendLambda implements wls {
    final /* synthetic */ h830 $screen;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorphlexFlexConfigFactory$awaitMorphlexRequest$2(h830 h830Var, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$screen = h830Var;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MorphlexFlexConfigFactory$awaitMorphlexRequest$2 morphlexFlexConfigFactory$awaitMorphlexRequest$2 = new MorphlexFlexConfigFactory$awaitMorphlexRequest$2(this.$screen, this.this$0, continuation);
        morphlexFlexConfigFactory$awaitMorphlexRequest$2.L$0 = obj;
        return morphlexFlexConfigFactory$awaitMorphlexRequest$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MorphlexFlexConfigFactory$awaitMorphlexRequest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0064, code lost:
    
        if (r3 == r2) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0148 A[LOOP:0: B:29:0x0142->B:31:0x0148, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        Object s;
        Object k;
        MorphlexRequestDto.Location location;
        h830 h830Var;
        MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType;
        rfa0 rfa0Var;
        h830 h830Var2;
        List list;
        e eVar;
        h830 h830Var3;
        ArrayList arrayList;
        h830 h830Var4;
        MorphlexRequestDto.Location location2;
        MorphlexRequestDto.AdditionalPreorderInfo additionalPreorderInfo;
        String g;
        Zone c;
        zzs B;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Calendar calendar = null;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new MorphlexFlexConfigFactory$awaitMorphlexRequest$2$userLocationDeferred$1(this.$screen, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new MorphlexFlexConfigFactory$awaitMorphlexRequest$2$srcAddress$1(this.$screen, this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.label = 1;
            s = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                MorphlexRequestDto.Location location3 = (MorphlexRequestDto.Location) this.L$3;
                kotlin.b.b(obj);
                location = location3;
                k = obj;
                Address address = (Address) k;
                MorphlexRequestDto.Location location4 = (address != null || (B = address.B()) == null) ? null : new MorphlexRequestDto.Location(B.a, B.b);
                e eVar2 = this.this$0;
                h830Var = this.$screen;
                eVar2.getClass();
                morphlexScreenPayload$ParamType = MorphlexScreenPayload$ParamType.PAYMENT_METHOD;
                if (h830Var.a(morphlexScreenPayload$ParamType)) {
                    eVar2.t.b();
                    lv90 c2 = eVar2.p.a.c();
                    if (c2.a == null) {
                        if (h830Var.b(morphlexScreenPayload$ParamType)) {
                            eVar2.v.b(lv90.f);
                        }
                    }
                    rfa0Var = eVar2.s.a(c2, eVar2.p.a.e());
                    e eVar3 = this.this$0;
                    h830Var2 = this.$screen;
                    eVar3.getClass();
                    if (h830Var2.a(MorphlexScreenPayload$ParamType.ROUTE)) {
                        d0l0 d0l0Var = eVar3.p.a.G;
                        if (d0l0Var.h() != null) {
                            list = d0l0Var.a();
                            eVar = this.this$0;
                            h830Var3 = this.$screen;
                            eVar.getClass();
                            if (h830Var3.a(MorphlexScreenPayload$ParamType.TARIFF_REQUIREMENTS) && (c = eVar.p.c()) != null) {
                                String str = eVar.p.a.y;
                                Set<Map.Entry> entrySet = eVar.u.c(c, eVar.p.a.x).entrySet();
                                ArrayList arrayList2 = new ArrayList(tcc.n(entrySet, 10));
                                for (Map.Entry entry : entrySet) {
                                    String str2 = (String) entry.getKey();
                                    rpj0 rpj0Var = RequirementsParam.Companion;
                                    List list2 = (List) entry.getValue();
                                    rpj0Var.getClass();
                                    arrayList2.add(new kmx0(str2, rpj0.a(str, list2)));
                                }
                                arrayList = arrayList2;
                            } else {
                                arrayList = null;
                            }
                            e eVar4 = this.this$0;
                            h830 h830Var5 = this.$screen;
                            eVar4.getClass();
                            MorphlexRequestDto.OrderComment orderComment = (h830Var5.a(MorphlexScreenPayload$ParamType.ORDER_COMMENT) && (g = eVar4.w.g()) != null) ? new MorphlexRequestDto.OrderComment(g) : null;
                            e eVar5 = this.this$0;
                            h830 h830Var6 = this.$screen;
                            eVar5.getClass();
                            String str3 = h830Var6.a(MorphlexScreenPayload$ParamType.TARIFF_CLASS) ? null : eVar5.p.a.O.a;
                            e eVar6 = this.this$0;
                            h830 h830Var7 = this.$screen;
                            eVar6.getClass();
                            Calendar g2 = h830Var7.a(MorphlexScreenPayload$ParamType.PREORDER_DUE) ? null : eVar6.p.a.g();
                            e eVar7 = this.this$0;
                            h830Var4 = this.$screen;
                            axm axmVar = eVar7.q;
                            if (h830Var4.a(MorphlexScreenPayload$ParamType.ADDITIONAL_PREORDER_INFO)) {
                                additionalPreorderInfo = null;
                                location2 = location;
                            } else {
                                String str4 = axmVar.a.a.S.c;
                                String str5 = axmVar.a.a.R;
                                Boolean valueOf = Boolean.valueOf(eVar7.r.a());
                                Calendar calendar2 = axmVar.a.a.S.b;
                                if (calendar2 == null) {
                                    location2 = location;
                                } else {
                                    calendar = Calendar.getInstance();
                                    calendar.setTimeZone(calendar2.getTimeZone());
                                    location2 = location;
                                    calendar.setTimeInMillis(calendar2.getTimeInMillis());
                                }
                                additionalPreorderInfo = new MorphlexRequestDto.AdditionalPreorderInfo(str4, str5, valueOf, calendar);
                            }
                            return new MorphlexRequestDto(location2, location4, rfa0Var, str3, g2, additionalPreorderInfo, list, arrayList, orderComment, this.$screen.k);
                        }
                    }
                    list = null;
                    eVar = this.this$0;
                    h830Var3 = this.$screen;
                    eVar.getClass();
                    if (h830Var3.a(MorphlexScreenPayload$ParamType.TARIFF_REQUIREMENTS)) {
                        String str6 = eVar.p.a.y;
                        Set<Map.Entry> entrySet2 = eVar.u.c(c, eVar.p.a.x).entrySet();
                        ArrayList arrayList22 = new ArrayList(tcc.n(entrySet2, 10));
                        while (r1.hasNext()) {
                        }
                        arrayList = arrayList22;
                        e eVar42 = this.this$0;
                        h830 h830Var52 = this.$screen;
                        eVar42.getClass();
                        if (h830Var52.a(MorphlexScreenPayload$ParamType.ORDER_COMMENT)) {
                            e eVar52 = this.this$0;
                            h830 h830Var62 = this.$screen;
                            eVar52.getClass();
                            if (h830Var62.a(MorphlexScreenPayload$ParamType.TARIFF_CLASS)) {
                            }
                            e eVar62 = this.this$0;
                            h830 h830Var72 = this.$screen;
                            eVar62.getClass();
                            if (h830Var72.a(MorphlexScreenPayload$ParamType.PREORDER_DUE)) {
                            }
                            e eVar72 = this.this$0;
                            h830Var4 = this.$screen;
                            axm axmVar2 = eVar72.q;
                            if (h830Var4.a(MorphlexScreenPayload$ParamType.ADDITIONAL_PREORDER_INFO)) {
                            }
                            return new MorphlexRequestDto(location2, location4, rfa0Var, str3, g2, additionalPreorderInfo, list, arrayList, orderComment, this.$screen.k);
                        }
                        e eVar522 = this.this$0;
                        h830 h830Var622 = this.$screen;
                        eVar522.getClass();
                        if (h830Var622.a(MorphlexScreenPayload$ParamType.TARIFF_CLASS)) {
                        }
                        e eVar622 = this.this$0;
                        h830 h830Var722 = this.$screen;
                        eVar622.getClass();
                        if (h830Var722.a(MorphlexScreenPayload$ParamType.PREORDER_DUE)) {
                        }
                        e eVar722 = this.this$0;
                        h830Var4 = this.$screen;
                        axm axmVar22 = eVar722.q;
                        if (h830Var4.a(MorphlexScreenPayload$ParamType.ADDITIONAL_PREORDER_INFO)) {
                        }
                        return new MorphlexRequestDto(location2, location4, rfa0Var, str3, g2, additionalPreorderInfo, list, arrayList, orderComment, this.$screen.k);
                    }
                    arrayList = null;
                    e eVar422 = this.this$0;
                    h830 h830Var522 = this.$screen;
                    eVar422.getClass();
                    if (h830Var522.a(MorphlexScreenPayload$ParamType.ORDER_COMMENT)) {
                    }
                    e eVar5222 = this.this$0;
                    h830 h830Var6222 = this.$screen;
                    eVar5222.getClass();
                    if (h830Var6222.a(MorphlexScreenPayload$ParamType.TARIFF_CLASS)) {
                    }
                    e eVar6222 = this.this$0;
                    h830 h830Var7222 = this.$screen;
                    eVar6222.getClass();
                    if (h830Var7222.a(MorphlexScreenPayload$ParamType.PREORDER_DUE)) {
                    }
                    e eVar7222 = this.this$0;
                    h830Var4 = this.$screen;
                    axm axmVar222 = eVar7222.q;
                    if (h830Var4.a(MorphlexScreenPayload$ParamType.ADDITIONAL_PREORDER_INFO)) {
                    }
                    return new MorphlexRequestDto(location2, location4, rfa0Var, str3, g2, additionalPreorderInfo, list, arrayList, orderComment, this.$screen.k);
                }
                rfa0Var = null;
                e eVar32 = this.this$0;
                h830Var2 = this.$screen;
                eVar32.getClass();
                if (h830Var2.a(MorphlexScreenPayload$ParamType.ROUTE)) {
                }
                list = null;
                eVar = this.this$0;
                h830Var3 = this.$screen;
                eVar.getClass();
                if (h830Var3.a(MorphlexScreenPayload$ParamType.TARIFF_REQUIREMENTS)) {
                }
                arrayList = null;
                e eVar4222 = this.this$0;
                h830 h830Var5222 = this.$screen;
                eVar4222.getClass();
                if (h830Var5222.a(MorphlexScreenPayload$ParamType.ORDER_COMMENT)) {
                }
                e eVar52222 = this.this$0;
                h830 h830Var62222 = this.$screen;
                eVar52222.getClass();
                if (h830Var62222.a(MorphlexScreenPayload$ParamType.TARIFF_CLASS)) {
                }
                e eVar62222 = this.this$0;
                h830 h830Var72222 = this.$screen;
                eVar62222.getClass();
                if (h830Var72222.a(MorphlexScreenPayload$ParamType.PREORDER_DUE)) {
                }
                e eVar72222 = this.this$0;
                h830Var4 = this.$screen;
                axm axmVar2222 = eVar72222.q;
                if (h830Var4.a(MorphlexScreenPayload$ParamType.ADDITIONAL_PREORDER_INFO)) {
                }
                return new MorphlexRequestDto(location2, location4, rfa0Var, str3, g2, additionalPreorderInfo, list, arrayList, orderComment, this.$screen.k);
            }
            h = (noh) this.L$2;
            kotlin.b.b(obj);
            s = obj;
        }
        MorphlexRequestDto.Location location5 = (MorphlexRequestDto.Location) s;
        if (location5 == null && this.$screen.b(MorphlexScreenPayload$ParamType.GEO)) {
            return null;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = location5;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            location = location5;
            Address address2 = (Address) k;
            if (address2 != null) {
            }
            e eVar22 = this.this$0;
            h830Var = this.$screen;
            eVar22.getClass();
            morphlexScreenPayload$ParamType = MorphlexScreenPayload$ParamType.PAYMENT_METHOD;
            if (h830Var.a(morphlexScreenPayload$ParamType)) {
            }
            rfa0Var = null;
            e eVar322 = this.this$0;
            h830Var2 = this.$screen;
            eVar322.getClass();
            if (h830Var2.a(MorphlexScreenPayload$ParamType.ROUTE)) {
            }
            list = null;
            eVar = this.this$0;
            h830Var3 = this.$screen;
            eVar.getClass();
            if (h830Var3.a(MorphlexScreenPayload$ParamType.TARIFF_REQUIREMENTS)) {
            }
            arrayList = null;
            e eVar42222 = this.this$0;
            h830 h830Var52222 = this.$screen;
            eVar42222.getClass();
            if (h830Var52222.a(MorphlexScreenPayload$ParamType.ORDER_COMMENT)) {
            }
            e eVar522222 = this.this$0;
            h830 h830Var622222 = this.$screen;
            eVar522222.getClass();
            if (h830Var622222.a(MorphlexScreenPayload$ParamType.TARIFF_CLASS)) {
            }
            e eVar622222 = this.this$0;
            h830 h830Var722222 = this.$screen;
            eVar622222.getClass();
            if (h830Var722222.a(MorphlexScreenPayload$ParamType.PREORDER_DUE)) {
            }
            e eVar722222 = this.this$0;
            h830Var4 = this.$screen;
            axm axmVar22222 = eVar722222.q;
            if (h830Var4.a(MorphlexScreenPayload$ParamType.ADDITIONAL_PREORDER_INFO)) {
            }
            return new MorphlexRequestDto(location2, location4, rfa0Var, str3, g2, additionalPreorderInfo, list, arrayList, orderComment, this.$screen.k);
        }
        return coroutineSingletons;
    }
}
