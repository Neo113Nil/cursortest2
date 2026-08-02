package com.yandex.go.taxi.order.cancel.v3.ui;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.zone.dto.objects.CancelReasonsGrouped;
import defpackage.az7;
import defpackage.bz7;
import defpackage.cz7;
import defpackage.jfv;
import defpackage.jl40;
import defpackage.mja1;
import defpackage.ny61;
import defpackage.ovi0;
import defpackage.qy7;
import defpackage.ry7;
import defpackage.sy7;
import defpackage.vpr;
import defpackage.xy7;
import defpackage.yy7;
import defpackage.zy11;
import defpackage.zy7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public b(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1 cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        xy7 xy7Var;
        CancelReasonsGrouped.Comment.CommentModal commentModal;
        Iterator it;
        az7 az7Var;
        bz7 bz7Var;
        Iterator it2;
        ovi0 ovi0Var;
        Object zy7Var;
        if (continuation instanceof CancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1) {
            cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1 = (CancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1.label;
                bz7 bz7Var2 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    CancelReasonsGrouped cancelReasonsGrouped = (CancelReasonsGrouped) pair.getFirst();
                    qy7 qy7Var = (qy7) pair.getSecond();
                    this.b.a.getClass();
                    List list = cancelReasonsGrouped.c;
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        CancelReasonsGrouped.Group group = (CancelReasonsGrouped.Group) it3.next();
                        List list2 = cancelReasonsGrouped.b;
                        String str = group.a;
                        if (str == null) {
                            bz7Var = bz7Var2;
                            it = it3;
                        } else {
                            Set N0 = kotlin.collections.a.N0(group.d);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list2) {
                                if (kotlin.collections.a.G(N0, ((CancelReasonsGrouped.CancelReason) obj3).c)) {
                                    arrayList2.add(obj3);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it4 = arrayList2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                CancelReasonsGrouped.CancelReason cancelReason = (CancelReasonsGrouped.CancelReason) it4.next();
                                String str2 = cancelReason.c;
                                if (str2 == null) {
                                    zy7Var = bz7Var2;
                                    it2 = it3;
                                } else {
                                    boolean z = str2.equals(qy7Var.a) && str.equals(qy7Var.b);
                                    AppColor$Palette appColor$Palette = z ? AppColor$Palette.TextInvert : AppColor$Palette.Text;
                                    String str3 = cancelReason.a;
                                    if (str3 != null) {
                                        it2 = it3;
                                        ovi0Var = mja1.a(str3, new jfv(appColor$Palette), 4);
                                    } else {
                                        it2 = it3;
                                        ovi0Var = null;
                                    }
                                    zy7Var = new zy7(str2, z, ovi0Var, cancelReason.b, appColor$Palette, z ? AppColor$Palette.BgInvert : AppColor$Palette.BgMinor, new ry7(str2, str));
                                }
                                if (zy7Var != null) {
                                    arrayList3.add(zy7Var);
                                }
                                it3 = it2;
                                bz7Var2 = null;
                            }
                            it = it3;
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it5 = arrayList3.iterator();
                            while (it5.hasNext()) {
                                Object next = it5.next();
                                if (hashSet.add(((zy7) next).a)) {
                                    arrayList4.add(next);
                                }
                            }
                            if (arrayList4.isEmpty()) {
                                bz7Var = null;
                            } else {
                                CancelReasonsGrouped.Group.RatingBar ratingBar = group.c;
                                if (ratingBar != null) {
                                    if (!jl40.l(qy7Var.b, str)) {
                                        ratingBar = null;
                                    }
                                    if (ratingBar != null) {
                                        Integer num = qy7Var.c;
                                        az7Var = new az7(ratingBar.a, num != null ? num.intValue() : 0, str);
                                        bz7Var = new bz7(str, group.b, arrayList4, az7Var);
                                    }
                                }
                                az7Var = null;
                                bz7Var = new bz7(str, group.b, arrayList4, az7Var);
                            }
                        }
                        if (bz7Var != null) {
                            arrayList.add(bz7Var);
                        }
                        it3 = it;
                        bz7Var2 = null;
                    }
                    String str4 = cancelReasonsGrouped.a;
                    CancelReasonsGrouped.Comment comment = cancelReasonsGrouped.d;
                    if (comment == null || (commentModal = comment.b) == null) {
                        xy7Var = null;
                    } else {
                        String str5 = qy7Var.d;
                        String str6 = comment.a;
                        if (str6 == null || str5 != null) {
                            str6 = null;
                        }
                        xy7Var = new xy7(str6, str5, new sy7(commentModal, str5));
                    }
                    cz7 cz7Var = new cz7(str4, arrayList, xy7Var, new yy7(cancelReasonsGrouped.e));
                    cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(cz7Var, cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1 = new CancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelReasonsV3UiStateInteractor$special$$inlined$map$1$2$1.label;
        bz7 bz7Var22 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
