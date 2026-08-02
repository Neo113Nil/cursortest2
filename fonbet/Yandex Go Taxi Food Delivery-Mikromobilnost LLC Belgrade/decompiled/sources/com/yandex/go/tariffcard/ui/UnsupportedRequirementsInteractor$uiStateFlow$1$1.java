package com.yandex.go.tariffcard.ui;

import androidx.media3.exoplayer.offline.DownloadService;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;
import defpackage.bdj0;
import defpackage.bqj0;
import defpackage.cdj0;
import defpackage.cjj0;
import defpackage.d6z;
import defpackage.dqe0;
import defpackage.evu0;
import defpackage.fnx0;
import defpackage.je70;
import defpackage.jl40;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q421;
import defpackage.r421;
import defpackage.v421;
import defpackage.vfx0;
import defpackage.x421;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.requirements.models.net.experiment.RequirementBubbleDto;

@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lb580;", DownloadService.KEY_REQUIREMENTS, "Lru/yandex/taxi/requirements/models/net/experiment/c;", "exp", "Lf6v;", "Lhmx0;", "Lv421;", "<anonymous>", "(Ljava/util/List;Lru/yandex/taxi/requirements/models/net/experiment/c;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.UnsupportedRequirementsInteractor$uiStateFlow$1$1", f = "UnsupportedRequirementsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UnsupportedRequirementsInteractor$uiStateFlow$1$1 extends SuspendLambda implements zls {
    final /* synthetic */ fnx0 $tariffSelection;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ x421 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedRequirementsInteractor$uiStateFlow$1$1(x421 x421Var, fnx0 fnx0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = x421Var;
        this.$tariffSelection = fnx0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UnsupportedRequirementsInteractor$uiStateFlow$1$1 unsupportedRequirementsInteractor$uiStateFlow$1$1 = new UnsupportedRequirementsInteractor$uiStateFlow$1$1(this.this$0, this.$tariffSelection, (Continuation) obj3);
        unsupportedRequirementsInteractor$uiStateFlow$1$1.L$0 = (List) obj;
        unsupportedRequirementsInteractor$uiStateFlow$1$1.L$1 = (ru.yandex.taxi.requirements.models.net.experiment.c) obj2;
        return unsupportedRequirementsInteractor$uiStateFlow$1$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bdj0 c;
        String str;
        List list;
        String str2;
        Object obj2;
        je70 b;
        String c2;
        Map map;
        RequirementBubbleDto requirementBubbleDto;
        List list2;
        String str3;
        Object obj3;
        r421 a;
        r421 a2;
        List list3 = (List) this.L$0;
        ru.yandex.taxi.requirements.models.net.experiment.c cVar = (ru.yandex.taxi.requirements.models.net.experiment.c) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str4 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        cjj0 cjj0Var = this.this$0.e;
        fnx0 fnx0Var = this.$tariffSelection;
        c = cjj0Var.c(fnx0Var.c, fnx0Var.d, list3, cVar, cdj0.a);
        x421 x421Var = this.this$0;
        bqj0 bqj0Var = x421Var.g;
        dqe0 dqe0Var = x421Var.f;
        boolean z = cVar.b;
        Map map2 = cVar.h;
        EmptyList emptyList = EmptyList.a;
        if (z) {
            ArrayList arrayList = new ArrayList();
            if (c.b() && (a2 = x421Var.a(cVar, "__preorder__", !arrayList.isEmpty())) != null) {
                arrayList.add(a2);
            }
            if (c.a() && (a = x421Var.a(cVar, "__order_for_other__", !arrayList.isEmpty())) != null) {
                arrayList.add(a);
            }
            Iterator it = c.b.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str5 = "";
                if (((List) pair.f()).isEmpty()) {
                    String str6 = (String) pair.c();
                    boolean z2 = !arrayList.isEmpty();
                    q421 q421Var = new q421(str6, str4);
                    RequirementBubbleDto requirementBubbleDto2 = (RequirementBubbleDto) map2.get(str6);
                    String str7 = requirementBubbleDto2 != null ? requirementBubbleDto2.d : str4;
                    if (str7 != null) {
                        str5 = d6z.Y(cVar, str7);
                        str = str4;
                    } else {
                        Zone c3 = dqe0Var.c();
                        if (c3 == null || (list2 = c3.k) == null) {
                            list2 = emptyList;
                        }
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                str = str4;
                                str3 = str;
                                break;
                            }
                            Iterator it3 = ((ZoneTariffInfo) it2.next()).o.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    str = str4;
                                    obj3 = str;
                                    break;
                                }
                                obj3 = it3.next();
                                str = str4;
                                if (jl40.l(((ru.yandex.taxi.requirements.models.net.c) obj3).c, str6)) {
                                    break;
                                }
                                str4 = str;
                            }
                            ru.yandex.taxi.requirements.models.net.c cVar2 = (ru.yandex.taxi.requirements.models.net.c) obj3;
                            if (cVar2 != null) {
                                str3 = cVar2.a;
                                break;
                            }
                            str4 = str;
                        }
                        if (str3 != null) {
                            str5 = str3;
                        }
                    }
                    String b2 = requirementBubbleDto2 != null ? bqj0Var.b(cVar, requirementBubbleDto2, q421Var.a) : bqj0Var.c(str5);
                    if (b2 == null) {
                        b2 = str5;
                    }
                    arrayList.add(new r421(str5, q421Var, z2, b2));
                } else {
                    str = str4;
                    for (String str8 : (List) pair.f()) {
                        String str9 = (String) pair.c();
                        boolean z3 = !arrayList.isEmpty();
                        RequirementBubbleDto requirementBubbleDto3 = (RequirementBubbleDto) map2.get(str9);
                        q421 q421Var2 = new q421(str9, str8);
                        Iterator it4 = it;
                        String str10 = (requirementBubbleDto3 == null || (map = requirementBubbleDto3.f) == null || (requirementBubbleDto = (RequirementBubbleDto) map.get(str8)) == null) ? str : requirementBubbleDto.d;
                        if (str10 == null) {
                            Zone c4 = dqe0Var.c();
                            if (c4 == null || (list = c4.k) == null) {
                                list = emptyList;
                            }
                            Iterator it5 = list.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    str2 = str;
                                    break;
                                }
                                Iterator it6 = it5;
                                Iterator it7 = ((ZoneTariffInfo) it5.next()).o.iterator();
                                while (true) {
                                    if (!it7.hasNext()) {
                                        obj2 = str;
                                        break;
                                    }
                                    obj2 = it7.next();
                                    Iterator it8 = it7;
                                    if (jl40.l(((ru.yandex.taxi.requirements.models.net.c) obj2).c, str9)) {
                                        break;
                                    }
                                    it7 = it8;
                                }
                                ru.yandex.taxi.requirements.models.net.c cVar3 = (ru.yandex.taxi.requirements.models.net.c) obj2;
                                if (cVar3 != null && (b = cVar3.b(str8)) != null) {
                                    str2 = b.a;
                                    break;
                                }
                                it5 = it6;
                            }
                        } else {
                            str2 = d6z.Y(cVar, str10);
                        }
                        if (requirementBubbleDto3 != null) {
                            bqj0Var.getClass();
                            RequirementBubbleDto requirementBubbleDto4 = (RequirementBubbleDto) requirementBubbleDto3.f.get(str8);
                            if (requirementBubbleDto4 == null) {
                                c2 = str;
                            } else {
                                String str11 = requirementBubbleDto4.e;
                                if (str11 != null) {
                                    c2 = d6z.Y(cVar, str11);
                                } else {
                                    String Y = d6z.Y(cVar, requirementBubbleDto4.b);
                                    if (evu0.J(Y)) {
                                        Y = str;
                                    }
                                    if (Y == null) {
                                        Y = bqj0Var.d(q421Var2.a);
                                    }
                                    c2 = bqj0Var.c(Y);
                                }
                            }
                        } else {
                            c2 = bqj0Var.c(str2);
                        }
                        String str12 = str2 == null ? "" : str2;
                        if (c2 != null) {
                            str2 = c2;
                        } else if (str2 == null) {
                            str2 = "";
                        }
                        arrayList.add(new r421(str12, q421Var2, z3, str2));
                        it = it4;
                    }
                }
                it = it;
                str4 = str;
            }
            emptyList = arrayList;
        }
        fnx0 fnx0Var2 = this.$tariffSelection;
        String str13 = fnx0Var2.c.b;
        v421 v421Var = new v421(emptyList);
        vfx0 vfx0Var = this.this$0.h;
        mi31 mi31Var = fnx0Var2.a;
        vfx0Var.getClass();
        return ru.yandex.taxi.requirements.utils.c.b(v421Var, vfx0.b(mi31Var));
    }
}
