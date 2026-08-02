package com.yandex.go.superapp.searchbar.impl.domain;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.yandex.go.dto.response.e0;
import com.yandex.go.dto.response.q1;
import com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.fdw0;
import defpackage.gdw0;
import defpackage.gw00;
import defpackage.hdw0;
import defpackage.idw0;
import defpackage.jdw0;
import defpackage.jqr;
import defpackage.kdc;
import defpackage.kdw0;
import defpackage.ldw0;
import defpackage.mdw0;
import defpackage.ndw0;
import defpackage.ny61;
import defpackage.odw0;
import defpackage.pdc;
import defpackage.qdw0;
import defpackage.s8o;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tpr;
import defpackage.ufu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class h implements odw0 {
    public final Context a;
    public final qdw0 b;
    public final pdc c;
    public SuperappSearchbarExperiment d;

    public h(Context context, qdw0 qdw0Var, pdc pdcVar) {
        this.a = context;
        this.b = qdw0Var;
        this.c = pdcVar;
    }

    public static hdw0 d(SuperappSearchbarExperiment.Button button, tls tlsVar) {
        gdw0 gdw0Var;
        fdw0 fdw0Var = null;
        if (evu0.J(button.a)) {
            return null;
        }
        String str = button.a;
        String str2 = (String) tlsVar.invoke(button.d);
        q1 q1Var = button.e;
        q1 q1Var2 = !(q1Var instanceof e0) ? q1Var : null;
        SuperappSearchbarExperiment.RotatableIcon rotatableIcon = button.c;
        if (rotatableIcon != null) {
            String str3 = rotatableIcon.a;
            String str4 = rotatableIcon.b;
            gdw0Var = (evu0.J(str3) || evu0.J(str4)) ? null : new gdw0(str3, str4, rotatableIcon.c);
        } else {
            gdw0Var = null;
        }
        SuperappSearchbarExperiment.LottieAnimation lottieAnimation = button.b;
        if (lottieAnimation != null) {
            if (evu0.J(lottieAnimation.a)) {
                lottieAnimation = null;
            }
            if (lottieAnimation != null) {
                fdw0Var = new fdw0(lottieAnimation.b, lottieAnimation.a, lottieAnimation.c);
            }
        }
        return new hdw0(str, str2, q1Var2, fdw0Var, gdw0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SuperappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1 superappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1;
        int i;
        boolean z;
        if (continuationImpl instanceof SuperappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1) {
            superappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1 = (SuperappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1) continuationImpl;
            int i2 = superappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SuperappSearchbarExperiment superappSearchbarExperiment = this.d;
                    if (superappSearchbarExperiment != null) {
                        z = superappSearchbarExperiment.i;
                        return Boolean.valueOf(z);
                    }
                    superappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1.label = 1;
                    obj = this.b.a.b(superappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1);
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
                z = ((SuperappSearchbarExperiment) obj).i;
                return Boolean.valueOf(z);
            }
        }
        superappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1 = new SuperappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1(this, continuationImpl);
        Object obj2 = superappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSearchbarConfigurationRepositoryImpl$isBlurEnabled$1.label;
        if (i != 0) {
        }
        z = ((SuperappSearchbarExperiment) obj2).i;
        return Boolean.valueOf(z);
    }

    public final g b() {
        return new g(new jqr(com.yandex.go.coroutines.b.d(this.b.a.a(), new SuperappSearchbarConfigurationRepositoryImpl$special$$inlined$start$1(this, null)), new SuperappSearchbarConfigurationRepositoryImpl$isEnabledFlow$2(this, null), 3));
    }

    public final tpr c() {
        return kotlinx.coroutines.flow.e.t(new e(new jqr(com.yandex.go.coroutines.b.d(this.b.a.a(), new SuperappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$start$1(this, null)), new SuperappSearchbarConfigurationRepositoryImpl$observeConfiguration$2(this, null), 3), this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ndw0 e(SuperappSearchbarExperiment superappSearchbarExperiment) {
        mdw0 mdw0Var;
        mdw0 a;
        Iterator it;
        Iterator it2;
        String str;
        boolean z = superappSearchbarExperiment.c;
        SuperappSearchbarExperiment.Searchbar searchbar = superappSearchbarExperiment.d;
        if (!z) {
            return null;
        }
        SuperappSearchbarExperiment.Searchbar.AnimatedText animatedText = searchbar.b;
        SuperappSearchbarExperiment.Searchbar.AnimatedText animatedText2 = searchbar.b;
        if (animatedText != null) {
            Map map = animatedText.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                SuperappSearchbarExperiment.Searchbar.AnimatedText.Item item = (SuperappSearchbarExperiment.Searchbar.AnimatedText.Item) entry.getValue();
                String a2 = item.getA();
                if (a2 == null) {
                    a2 = "";
                }
                String Y = d6z.Y(superappSearchbarExperiment, a2);
                if (evu0.J(Y)) {
                    Y = null;
                }
                String str2 = Y != null ? Y : "";
                kdc i = ((ufu) this.c).i(item.getB());
                if (i != null) {
                    SpannableString spannableString = new SpannableString(str2);
                    spannableString.setSpan(new ForegroundColorSpan(s8o.m(i, this.a)), 0, str2.length(), 17);
                    str2 = spannableString;
                }
                linkedHashMap.put(key, new idw0(str2));
            }
            List list = animatedText2.b;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                List a3 = ((SuperappSearchbarExperiment.Searchbar.AnimatedText.Keyframe) it3.next()).getA();
                if (a3 == null) {
                    a3 = EmptyList.a;
                }
                arrayList.add(new jdw0(a3));
            }
            String str3 = animatedText2.c;
            if (str3 != null) {
                String Y2 = d6z.Y(superappSearchbarExperiment, str3);
                if (evu0.J(Y2)) {
                    Y2 = null;
                }
                str = Y2;
            } else {
                str = null;
            }
            long j = animatedText2.d;
            long j2 = animatedText2.e;
            long j3 = animatedText2.f;
            long j4 = animatedText2.g;
            Integer num = animatedText2.i;
            a = new kdw0(linkedHashMap, arrayList, str, j, j2, j3, j4, (num == null || num.intValue() < 0) ? null : num);
        } else {
            String Y3 = d6z.Y(superappSearchbarExperiment, searchbar.a);
            if (evu0.J(Y3)) {
                Y3 = null;
            }
            if (Y3 == null) {
                Y3 = null;
            }
            if (Y3 == null) {
                mdw0Var = null;
                String Y4 = d6z.Y(superappSearchbarExperiment, searchbar.c);
                String str4 = evu0.J(Y4) ? Y4 : null;
                String str5 = searchbar.d;
                String str6 = evu0.J(str5) ? str5 : null;
                q1 q1Var = searchbar.e;
                q1 q1Var2 = q1Var instanceof e0 ? q1Var : null;
                List list2 = superappSearchbarExperiment.e;
                ArrayList arrayList2 = new ArrayList();
                it = list2.iterator();
                while (it.hasNext()) {
                    hdw0 d = d((SuperappSearchbarExperiment.Button) it.next(), new SuperappSearchbarConfigurationRepositoryImpl$toConfiguration$7$1(superappSearchbarExperiment));
                    if (d != null) {
                        arrayList2.add(d);
                    }
                }
                List A0 = kotlin.collections.a.A0(arrayList2, 2);
                List list3 = superappSearchbarExperiment.f;
                ArrayList arrayList3 = new ArrayList();
                it2 = list3.iterator();
                while (it2.hasNext()) {
                    hdw0 d2 = d((SuperappSearchbarExperiment.Button) it2.next(), new SuperappSearchbarConfigurationRepositoryImpl$toConfiguration$8$1(superappSearchbarExperiment));
                    if (d2 != null) {
                        arrayList3.add(d2);
                    }
                }
                return new ndw0(mdw0Var, str4, str6, q1Var2, A0, kotlin.collections.a.A0(arrayList3, 2), d(superappSearchbarExperiment.g, new SuperappSearchbarConfigurationRepositoryImpl$toConfiguration$9(superappSearchbarExperiment)), superappSearchbarExperiment.h);
            }
            a = ldw0.a(Y3);
        }
        mdw0Var = a;
        String Y42 = d6z.Y(superappSearchbarExperiment, searchbar.c);
        if (evu0.J(Y42)) {
        }
        String str52 = searchbar.d;
        if (evu0.J(str52)) {
        }
        q1 q1Var3 = searchbar.e;
        if (q1Var3 instanceof e0) {
        }
        List list22 = superappSearchbarExperiment.e;
        ArrayList arrayList22 = new ArrayList();
        it = list22.iterator();
        while (it.hasNext()) {
        }
        List A02 = kotlin.collections.a.A0(arrayList22, 2);
        List list32 = superappSearchbarExperiment.f;
        ArrayList arrayList32 = new ArrayList();
        it2 = list32.iterator();
        while (it2.hasNext()) {
        }
        return new ndw0(mdw0Var, str4, str6, q1Var2, A02, kotlin.collections.a.A0(arrayList32, 2), d(superappSearchbarExperiment.g, new SuperappSearchbarConfigurationRepositoryImpl$toConfiguration$9(superappSearchbarExperiment)), superappSearchbarExperiment.h);
    }
}
