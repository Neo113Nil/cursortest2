package com.yandex.go.information.domain;

import android.net.Uri;
import defpackage.i4u;
import defpackage.jl40;
import defpackage.k3c;
import defpackage.kuv;
import defpackage.muq0;
import defpackage.ny61;
import defpackage.og21;
import defpackage.ouq0;
import defpackage.pj;
import defpackage.quv;
import defpackage.ruv;
import defpackage.scc;
import defpackage.suv;
import defpackage.tcc;
import defpackage.tse0;
import defpackage.ttv;
import defpackage.tuv;
import defpackage.utv;
import defpackage.uuv;
import defpackage.vtv;
import defpackage.w511;
import defpackage.wtv;
import defpackage.x4e;
import defpackage.xtv;
import defpackage.ytv;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class c {
    public final k3c a;
    public final com.yandex.go.about.domain.c b;
    public final i4u c;

    public c(k3c k3cVar, com.yandex.go.about.domain.c cVar, i4u i4uVar) {
        this.a = k3cVar;
        this.b = cVar;
        this.c = i4uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uuv uuvVar, kuv kuvVar, ContinuationImpl continuationImpl) {
        InformationUiActionInteractor$handleAction$1 informationUiActionInteractor$handleAction$1;
        int i;
        if (continuationImpl instanceof InformationUiActionInteractor$handleAction$1) {
            informationUiActionInteractor$handleAction$1 = (InformationUiActionInteractor$handleAction$1) continuationImpl;
            int i2 = informationUiActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                informationUiActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = informationUiActionInteractor$handleAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = informationUiActionInteractor$handleAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!jl40.l(uuvVar, quv.a)) {
                        if (uuvVar instanceof suv) {
                            String str = ((suv) uuvVar).a;
                            if (og21.b(Uri.parse(str))) {
                                CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
                                aVar.b = str;
                                aVar.h = true;
                                aVar.i = true;
                                aVar.j = true;
                                kuvVar.b(new UiWebViewConfig(aVar.a(), null, true, false, false, false, null, true, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 3800954, null));
                            } else {
                                kuvVar.h(str);
                            }
                        } else if (jl40.l(uuvVar, quv.b)) {
                            kuvVar.a();
                        } else if (uuvVar instanceof ruv) {
                            kuvVar.c(((ruv) uuvVar).a);
                        } else {
                            if (!(uuvVar instanceof tuv)) {
                                w511.b();
                                return null;
                            }
                            ytv ytvVar = ((tuv) uuvVar).a;
                            pj pjVar = (pj) this.c.a;
                            if (ytvVar instanceof utv) {
                                utv utvVar = (utv) ytvVar;
                                List list = utvVar.a;
                                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((muq0) it.next()).a);
                                }
                                ArrayList arrayList2 = utvVar.b;
                                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                                int i3 = 0;
                                for (Object obj2 : arrayList2) {
                                    int i4 = i3 + 1;
                                    if (i3 < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    ouq0 ouq0Var = (ouq0) obj2;
                                    arrayList3.add(new ttv(i3, ouq0Var.c, ouq0Var.a));
                                    i3 = i4;
                                }
                                pjVar.getClass();
                                HashMap hashMap = new HashMap();
                                hashMap.put("button_list", arrayList);
                                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(((ttv) it2.next()).d);
                                }
                                hashMap.put("service_list", arrayList4);
                                pjVar.a.a("Information.Loaded", hashMap, 1, new HashMap());
                            } else if (ytvVar instanceof xtv) {
                                xtv xtvVar = (xtv) ytvVar;
                                int i5 = xtvVar.a;
                                String str2 = xtvVar.b;
                                String str3 = xtvVar.c;
                                String value = xtvVar.d.getValue();
                                pjVar.getClass();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("position", Integer.valueOf(i5));
                                hashMap2.put("icon_tag_name", str2);
                                pjVar.a.a("Information.Tapped", hashMap2, 1, x4e.q(hashMap2, "name", str3, "type", value));
                            } else if (ytvVar instanceof vtv) {
                                ouq0 ouq0Var2 = ((vtv) ytvVar).a;
                                String str4 = ouq0Var2.a;
                                List list2 = ouq0Var2.f;
                                ArrayList arrayList5 = new ArrayList(tcc.n(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    arrayList5.add(((muq0) it3.next()).a);
                                }
                                pjVar.getClass();
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put(Constants.KEY_SERVICE, str4);
                                hashMap3.put("link_list", arrayList5);
                                pjVar.a.a("Information.Modal.Loaded", hashMap3, 1, new HashMap());
                            } else {
                                if (!(ytvVar instanceof wtv)) {
                                    w511.b();
                                    return null;
                                }
                                wtv wtvVar = (wtv) ytvVar;
                                String str5 = wtvVar.a;
                                String str6 = wtvVar.b;
                                String value2 = wtvVar.c.getValue();
                                pjVar.getClass();
                                HashMap hashMap4 = new HashMap();
                                hashMap4.put(Constants.KEY_SERVICE, str5);
                                hashMap4.put("name", str6);
                                pjVar.a.a("Information.Modal.Tapped", hashMap4, 1, tse0.r("type", hashMap4, value2));
                            }
                        }
                        return zy11.a;
                    }
                    informationUiActionInteractor$handleAction$1.L$0 = null;
                    informationUiActionInteractor$handleAction$1.L$1 = null;
                    informationUiActionInteractor$handleAction$1.label = 1;
                    obj = this.b.a(informationUiActionInteractor$handleAction$1);
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
                this.a.a(true, (String) obj, "text");
                return zy11.a;
            }
        }
        informationUiActionInteractor$handleAction$1 = new InformationUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj3 = informationUiActionInteractor$handleAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = informationUiActionInteractor$handleAction$1.label;
        if (i != 0) {
        }
        this.a.a(true, (String) obj3, "text");
        return zy11.a;
    }
}
