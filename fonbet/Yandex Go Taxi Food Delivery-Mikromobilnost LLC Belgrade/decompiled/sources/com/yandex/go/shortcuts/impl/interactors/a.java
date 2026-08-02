package com.yandex.go.shortcuts.impl.interactors;

import com.yandex.go.shortcuts.dto.request.MarkNotifyParam;
import com.yandex.go.shortcuts.models.ShortcutClickAction;
import com.yandex.go.shortcuts.models.ShortcutClickInfo;
import defpackage.bvf0;
import defpackage.d2c;
import defpackage.hst;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jst;
import defpackage.m6i0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yaf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a implements d2c {
    public final e a;
    public final com.yandex.go.shortcuts.impl.preferences.a b;
    public final ru.yandex.taxi.jobs.b c;
    public final m6i0 d;
    public final ike e;

    public a(e eVar, com.yandex.go.shortcuts.impl.preferences.a aVar, ru.yandex.taxi.jobs.b bVar, m6i0 m6i0Var, tt2 tt2Var) {
        this.a = eVar;
        this.b = aVar;
        this.c = bVar;
        this.d = m6i0Var;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.e = bvf0.a(mdh.b.plus(jl40.a()));
    }

    public final MarkNotifyParam a(String str, Set set) {
        Set<ShortcutClickInfo> set2 = set;
        ArrayList arrayList = new ArrayList(tcc.n(set2, 10));
        for (ShortcutClickInfo shortcutClickInfo : set2) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new MarkNotifyParam.AdditionalProperty("shortcut_id", shortcutClickInfo.a));
            arrayList2.add(new MarkNotifyParam.AdditionalProperty("grid_id", shortcutClickInfo.c));
            arrayList2.add(new MarkNotifyParam.AdditionalProperty("shortcut_type", shortcutClickInfo.d));
            String str2 = shortcutClickInfo.e;
            if (str2 != null && str2.length() != 0) {
                arrayList2.add(new MarkNotifyParam.AdditionalProperty("promo_id", str2));
            }
            arrayList.add(new MarkNotifyParam.MarkNotifyItem(shortcutClickInfo.a, shortcutClickInfo.b, arrayList2));
        }
        this.d.getClass();
        return new MarkNotifyParam(UUID.randomUUID().toString(), arrayList, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ClickedProductsInteractorImpl$hasDataToSend$1 clickedProductsInteractorImpl$hasDataToSend$1;
        int i;
        if (continuationImpl instanceof ClickedProductsInteractorImpl$hasDataToSend$1) {
            clickedProductsInteractorImpl$hasDataToSend$1 = (ClickedProductsInteractorImpl$hasDataToSend$1) continuationImpl;
            int i2 = clickedProductsInteractorImpl$hasDataToSend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clickedProductsInteractorImpl$hasDataToSend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = clickedProductsInteractorImpl$hasDataToSend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clickedProductsInteractorImpl$hasDataToSend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    clickedProductsInteractorImpl$hasDataToSend$1.label = 1;
                    obj = this.b.b(clickedProductsInteractorImpl$hasDataToSend$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(!((Collection) obj).isEmpty());
            }
        }
        clickedProductsInteractorImpl$hasDataToSend$1 = new ClickedProductsInteractorImpl$hasDataToSend$1(this, continuationImpl);
        Object obj2 = clickedProductsInteractorImpl$hasDataToSend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clickedProductsInteractorImpl$hasDataToSend$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Collection) obj2).isEmpty());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(3:18|19|20))(4:21|22|23|(1:25)(1:14)))(1:26))(1:40)|27|(4:29|30|(3:32|23|(0))|25)|14))|43|6|7|(0)(0)|27|(0)|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0054, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.yandex.go.shortcuts.impl.interactors.a] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ClickedProductsInteractorImpl$sendData$1 clickedProductsInteractorImpl$sendData$1;
        int i;
        Set set;
        Set set2;
        if (continuationImpl instanceof ClickedProductsInteractorImpl$sendData$1) {
            clickedProductsInteractorImpl$sendData$1 = (ClickedProductsInteractorImpl$sendData$1) continuationImpl;
            int i2 = clickedProductsInteractorImpl$sendData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clickedProductsInteractorImpl$sendData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = clickedProductsInteractorImpl$sendData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clickedProductsInteractorImpl$sendData$1.label;
                zy11 zy11Var = zy11.a;
                com.yandex.go.shortcuts.impl.preferences.a aVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    clickedProductsInteractorImpl$sendData$1.L$0 = str;
                    clickedProductsInteractorImpl$sendData$1.label = 1;
                    obj = aVar.b(clickedProductsInteractorImpl$sendData$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            set2 = (Set) clickedProductsInteractorImpl$sendData$1.L$1;
                            kotlin.b.b(obj);
                            clickedProductsInteractorImpl$sendData$1.L$0 = null;
                            clickedProductsInteractorImpl$sendData$1.L$1 = set2;
                            clickedProductsInteractorImpl$sendData$1.label = 3;
                            return aVar.d(set2, clickedProductsInteractorImpl$sendData$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
                        }
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    str = (String) clickedProductsInteractorImpl$sendData$1.L$0;
                    kotlin.b.b(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    try {
                        e eVar = this.a;
                        MarkNotifyParam a = a(str, set);
                        clickedProductsInteractorImpl$sendData$1.L$0 = null;
                        clickedProductsInteractorImpl$sendData$1.L$1 = set;
                        clickedProductsInteractorImpl$sendData$1.label = 2;
                        if (eVar.a(a, clickedProductsInteractorImpl$sendData$1) != coroutineSingletons) {
                            set2 = set;
                            clickedProductsInteractorImpl$sendData$1.L$0 = null;
                            clickedProductsInteractorImpl$sendData$1.L$1 = set2;
                            clickedProductsInteractorImpl$sendData$1.label = 3;
                            if (aVar.d(set2, clickedProductsInteractorImpl$sendData$1) != coroutineSingletons) {
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        this = set;
                        jst.e.k(th, "Error sending mark-notify");
                        if (s8o.u(th)) {
                            clickedProductsInteractorImpl$sendData$1.L$0 = null;
                            clickedProductsInteractorImpl$sendData$1.L$1 = null;
                            clickedProductsInteractorImpl$sendData$1.L$2 = null;
                            clickedProductsInteractorImpl$sendData$1.label = 4;
                            if (aVar.d((Collection) this, clickedProductsInteractorImpl$sendData$1) == coroutineSingletons) {
                            }
                        }
                    }
                }
            }
        }
        clickedProductsInteractorImpl$sendData$1 = new ClickedProductsInteractorImpl$sendData$1(this, continuationImpl);
        Object obj2 = clickedProductsInteractorImpl$sendData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clickedProductsInteractorImpl$sendData$1.label;
        zy11 zy11Var2 = zy11.a;
        com.yandex.go.shortcuts.impl.preferences.a aVar2 = this.b;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
    }

    public final void d(String str, String str2, String str3, String str4, ShortcutClickAction shortcutClickAction, yaf0 yaf0Var) {
        hst hstVar = jst.e;
        String.format("shortcutClicked %s", Arrays.copyOf(new Object[]{str}, 1));
        hstVar.getClass();
        ShortcutClickInfo shortcutClickInfo = new ShortcutClickInfo(str, shortcutClickAction, str3, str2, str4, UUID.randomUUID().toString());
        String.format("orderClicked %s", Arrays.copyOf(new Object[]{str}, 1));
        com.yandex.go.coroutines.b.g(this.e, null, null, new ClickedProductsInteractorImpl$addShortcutClickedJob$1(this, shortcutClickInfo, yaf0Var, null), 3);
    }
}
