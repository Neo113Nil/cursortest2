package com.yandex.go.superapp.searchbar.impl.presentation;

import com.yandex.go.dto.response.Action$Deeplink;
import com.yandex.go.dto.response.q1;
import com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.i;
import com.yandex.go.superapp.searchbar.impl.domain.c;
import com.yandex.go.superapp.searchbar.impl.domain.h;
import com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment;
import defpackage.ad5;
import defpackage.aew0;
import defpackage.bew0;
import defpackage.cew0;
import defpackage.dew0;
import defpackage.eew0;
import defpackage.fdw0;
import defpackage.few0;
import defpackage.gci0;
import defpackage.gdw0;
import defpackage.gew0;
import defpackage.gw00;
import defpackage.hdw0;
import defpackage.hew0;
import defpackage.ibw0;
import defpackage.idw0;
import defpackage.iew0;
import defpackage.jdw0;
import defpackage.jew0;
import defpackage.k7x0;
import defpackage.kdw0;
import defpackage.ldw0;
import defpackage.m7x0;
import defpackage.mdw0;
import defpackage.msb1;
import defpackage.ndw0;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.rcc;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.udw0;
import defpackage.v2f0;
import defpackage.w2f0;
import defpackage.w511;
import defpackage.x2f0;
import defpackage.y2f0;
import defpackage.ydw0;
import defpackage.z2f0;
import defpackage.zdw0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class a extends ad5 {
    public final pwy0 A;
    public final ibw0 B;
    public final c C;
    public final i D;
    public final com.yandex.go.superapp.searchbar.impl.router.a E;
    public final LinkedHashSet F;
    public final h x;
    public final k7x0 y;
    public final ru.yandex.taxi.widget.c z;

    public a(h hVar, k7x0 k7x0Var, ru.yandex.taxi.widget.c cVar, pwy0 pwy0Var, ibw0 ibw0Var, c cVar2, i iVar, com.yandex.go.superapp.searchbar.impl.router.a aVar) {
        super(udw0.class);
        this.x = hVar;
        this.y = k7x0Var;
        this.z = cVar;
        this.A = pwy0Var;
        this.B = ibw0Var;
        this.C = cVar2;
        this.D = iVar;
        this.E = aVar;
        this.F = new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(a aVar, ndw0 ndw0Var, ydw0 ydw0Var, Float f, ContinuationImpl continuationImpl) {
        SuperappSearchbarPresenter$createUiState$1 superappSearchbarPresenter$createUiState$1;
        int i;
        z2f0 z2f0Var;
        Object obj;
        Float f2;
        z2f0 z2f0Var2;
        ndw0 ndw0Var2 = ndw0Var;
        ydw0 ydw0Var2 = ydw0Var;
        aVar.getClass();
        if (continuationImpl instanceof SuperappSearchbarPresenter$createUiState$1) {
            superappSearchbarPresenter$createUiState$1 = (SuperappSearchbarPresenter$createUiState$1) continuationImpl;
            int i2 = superappSearchbarPresenter$createUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSearchbarPresenter$createUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappSearchbarPresenter$createUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSearchbarPresenter$createUiState$1.label;
                if (i != 0) {
                    b.b(obj2);
                    if (!ydw0Var2.a || ndw0Var2 == null) {
                        return new zdw0(ndw0Var2 != null && ndw0Var2.h, ydw0Var2.b);
                    }
                    mdw0 mdw0Var = ndw0Var2.a;
                    if (mdw0Var instanceof ldw0) {
                        z2f0Var = new y2f0(((ldw0) mdw0Var).a);
                    } else if (mdw0Var instanceof kdw0) {
                        kdw0 kdw0Var = (kdw0) mdw0Var;
                        LinkedHashMap linkedHashMap = kdw0Var.a;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            linkedHashMap2.put(entry.getKey(), new v2f0(((idw0) entry.getValue()).a));
                        }
                        ArrayList arrayList = kdw0Var.b;
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new w2f0(((jdw0) it.next()).a));
                        }
                        z2f0Var = new x2f0(linkedHashMap2, arrayList2, kdw0Var.c, kdw0Var.d, kdw0Var.e, kdw0Var.f, kdw0Var.g, kdw0Var.h);
                    } else {
                        if (mdw0Var != null) {
                            w511.b();
                            return null;
                        }
                        z2f0Var = null;
                    }
                    ru.yandex.taxi.widget.c cVar = aVar.z;
                    ListBuilder a = rcc.a();
                    String str = ndw0Var2.c;
                    if (str != null) {
                        a.add(new FormattedText.d(str, FormattedText.VerticalAlignment.CENTER, null, 16, 36));
                    }
                    String str2 = ndw0Var2.b;
                    if (str2 != null) {
                        a.add(new FormattedText.h(str2, null, null, null, null, null, 2046));
                    }
                    FormattedText formattedText = new FormattedText(a.j());
                    superappSearchbarPresenter$createUiState$1.L$0 = ndw0Var2;
                    superappSearchbarPresenter$createUiState$1.L$1 = ydw0Var2;
                    superappSearchbarPresenter$createUiState$1.L$2 = f;
                    superappSearchbarPresenter$createUiState$1.L$3 = z2f0Var;
                    superappSearchbarPresenter$createUiState$1.label = 1;
                    Object i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, superappSearchbarPresenter$createUiState$1, 30);
                    if (i3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = i3;
                    f2 = f;
                    z2f0Var2 = z2f0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj3 = superappSearchbarPresenter$createUiState$1.L$3;
                    Float f3 = (Float) superappSearchbarPresenter$createUiState$1.L$2;
                    ydw0 ydw0Var3 = (ydw0) superappSearchbarPresenter$createUiState$1.L$1;
                    ndw0 ndw0Var3 = (ndw0) superappSearchbarPresenter$createUiState$1.L$0;
                    b.b(obj2);
                    z2f0Var2 = obj3;
                    ndw0Var2 = ndw0Var3;
                    obj = obj2;
                    f2 = f3;
                    ydw0Var2 = ydw0Var3;
                }
                CharSequence charSequence = (CharSequence) obj;
                q1 q1Var = ndw0Var2.d;
                List list = ndw0Var2.e;
                ArrayList arrayList3 = new ArrayList(tcc.n(list, 10));
                int i4 = 0;
                for (Object obj4 : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        scc.m();
                        throw null;
                    }
                    arrayList3.add(aVar.Pg((hdw0) obj4, SuperappSearchbarUiState$Visible$Button$ButtonGroup.Lead, i4, f2));
                    i4 = i5;
                }
                List list2 = ndw0Var2.f;
                ArrayList arrayList4 = new ArrayList(tcc.n(list2, 10));
                int i6 = 0;
                for (Object obj5 : list2) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        scc.m();
                        throw null;
                    }
                    arrayList4.add(aVar.Pg((hdw0) obj5, SuperappSearchbarUiState$Visible$Button$ButtonGroup.Trail, i6, f2));
                    i6 = i7;
                }
                hdw0 hdw0Var = ndw0Var2.g;
                return new jew0(z2f0Var2, charSequence, q1Var, arrayList3, arrayList4, hdw0Var == null ? aVar.Pg(hdw0Var, SuperappSearchbarUiState$Visible$Button$ButtonGroup.Collapsed, 0, f2) : null, ydw0Var2.b, ndw0Var2.h);
            }
        }
        superappSearchbarPresenter$createUiState$1 = new SuperappSearchbarPresenter$createUiState$1(aVar, continuationImpl);
        Object obj22 = superappSearchbarPresenter$createUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSearchbarPresenter$createUiState$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj;
        q1 q1Var2 = ndw0Var2.d;
        List list3 = ndw0Var2.e;
        ArrayList arrayList32 = new ArrayList(tcc.n(list3, 10));
        int i42 = 0;
        while (r8.hasNext()) {
        }
        List list22 = ndw0Var2.f;
        ArrayList arrayList42 = new ArrayList(tcc.n(list22, 10));
        int i62 = 0;
        while (r6.hasNext()) {
        }
        hdw0 hdw0Var2 = ndw0Var2.g;
        return new jew0(z2f0Var2, charSequence2, q1Var2, arrayList32, arrayList42, hdw0Var2 == null ? aVar.Pg(hdw0Var2, SuperappSearchbarUiState$Visible$Button$ButtonGroup.Collapsed, 0, f2) : null, ydw0Var2.b, ndw0Var2.h);
    }

    public static String Mg(q1 q1Var) {
        Action$Deeplink action$Deeplink = q1Var instanceof Action$Deeplink ? (Action$Deeplink) q1Var : null;
        if (action$Deeplink != null) {
            return action$Deeplink.a;
        }
        return null;
    }

    public static String Ng(q1 q1Var) {
        return q1Var.a().toString().toLowerCase(Locale.ROOT);
    }

    public final void Lg(com.yandex.go.superapp.searchbar.impl.ui.b bVar) {
        Bg(bVar);
        h hVar = this.x;
        SuperappSearchbarExperiment superappSearchbarExperiment = hVar.d;
        ndw0 e = superappSearchbarExperiment != null ? hVar.e(superappSearchbarExperiment) : null;
        if (e != null) {
            tje.N(Jg(), null, CoroutineStart.UNDISPATCHED, new SuperappSearchbarPresenter$renderInitialUiStateImmediately$1(this, e, null), 1);
        }
        tpr c = hVar.c();
        gci0 gci0Var = this.D.c;
        tje.N(Jg(), null, null, new SuperappSearchbarPresenter$attachView$$inlined$collectIn$1(e.m(c, gci0Var, this.A.a(), this.C.c(c, gci0Var), new SuperappSearchbarPresenter$attachView$1(this, null)), null, bVar), 3);
    }

    public final void Og(gew0 gew0Var) {
        if (gew0Var instanceof eew0) {
            return;
        }
        if (!(gew0Var instanceof few0)) {
            w511.b();
            return;
        }
        if (this.F.add(((few0) gew0Var).a)) {
            h hVar = this.x;
            SuperappSearchbarExperiment superappSearchbarExperiment = hVar.d;
            ndw0 e = superappSearchbarExperiment != null ? hVar.e(superappSearchbarExperiment) : null;
            if (e == null) {
                return;
            }
            tje.N(Jg(), null, null, new SuperappSearchbarPresenter$onLottieAnimationFinished$1(this, e, null), 3);
        }
    }

    public final iew0 Pg(hdw0 hdw0Var, SuperappSearchbarUiState$Visible$Button$ButtonGroup superappSearchbarUiState$Visible$Button$ButtonGroup, int i, Float f) {
        hew0 hew0Var;
        cew0 bew0Var;
        hew0 few0Var;
        fdw0 fdw0Var = hdw0Var.d;
        Float f2 = null;
        if (fdw0Var != null) {
            String str = fdw0Var.a;
            dew0 dew0Var = new dew0(superappSearchbarUiState$Visible$Button$ButtonGroup, i, str);
            if (this.F.contains(dew0Var)) {
                few0Var = msb1.V;
            } else {
                boolean z = fdw0Var.c;
                Integer num = fdw0Var.b;
                few0Var = z ? new few0(dew0Var, str, num) : new eew0(dew0Var, str, num);
            }
            hew0Var = few0Var;
        } else {
            hew0Var = null;
        }
        String str2 = hdw0Var.a;
        String str3 = hdw0Var.b;
        q1 q1Var = hdw0Var.c;
        gdw0 gdw0Var = hdw0Var.e;
        k7x0 k7x0Var = this.y;
        if (gdw0Var != null) {
            m7x0 m7x0Var = (m7x0) k7x0Var;
            String a = m7x0Var.a(gdw0Var.a);
            String a2 = m7x0Var.a(gdw0Var.b);
            if (!(hew0Var instanceof gew0)) {
                Float f3 = gdw0Var.c;
                if (f != null) {
                    f2 = Float.valueOf(-(f.floatValue() - (f3 != null ? f3.floatValue() : 0.0f)));
                }
            }
            bew0Var = new aew0(a, a2, f2);
        } else {
            bew0Var = new bew0(((m7x0) k7x0Var).a(str2));
        }
        return new iew0(str2, str3, q1Var, bew0Var, hew0Var);
    }
}
