package com.yandex.payment.sdk.flex.impl;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.yandex.feedsdk.di.FeedSdkComponent;
import defpackage.ahr;
import defpackage.aks0;
import defpackage.bhr;
import defpackage.c690;
import defpackage.chr;
import defpackage.cnr0;
import defpackage.ehr;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h5x;
import defpackage.his0;
import defpackage.i3y;
import defpackage.i5x;
import defpackage.j5x;
import defpackage.k6x;
import defpackage.kir;
import defpackage.m5x;
import defpackage.ny61;
import defpackage.o6x;
import defpackage.p6x;
import defpackage.q6x;
import defpackage.r6x;
import defpackage.rkf;
import defpackage.skf;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u1m;
import defpackage.uza;
import defpackage.v4x;
import defpackage.w4x;
import defpackage.wul;
import defpackage.y6k;
import defpackage.ycc;
import defpackage.ywl;
import defpackage.zw01;
import defpackage.zy11;
import flex.feature.divkit.scaffold.DivKitScaffoldPadding;
import flex.feature.divkit.scaffold.ScaffoldAnimations;
import flex.section.divkit.DivkitSnippet;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class b implements ahr {
    public static final Pair i = new Pair(40, 40);
    public bhr f;
    public final i3y a = kotlin.a.a(new chr(this, 0));
    public final k6x b = new k6x();
    public final com.yandex.div.core.expression.variables.a c = new com.yandex.div.core.expression.variables.a(null);
    public final y6k d = new y6k();
    public final ArrayList e = new ArrayList();
    public final i3y g = kotlin.a.b(LazyThreadSafetyMode.NONE, new chr(this, 1));
    public final kotlinx.coroutines.sync.a h = gtq0.a();

    public static j5x b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return new w4x(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new o6x((String) obj);
        }
        if (obj instanceof Long) {
            return new i5x(((Number) obj).longValue());
        }
        if (obj instanceof Integer) {
            return new i5x(((Number) obj).intValue());
        }
        if (obj instanceof Double) {
            return new h5x(((Number) obj).doubleValue());
        }
        if (obj instanceof byte[]) {
            return new o6x(new String((byte[]) obj, uza.a));
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(b(it.next()));
            }
            return new v4x(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(zw01.class)) {
                field.setAccessible(true);
                j5x b = b(field.get(obj));
                if (b != null) {
                    linkedHashMap.put(field.getName(), b);
                }
            }
        }
        return new m5x(linkedHashMap);
    }

    public static q6x c(Object obj) {
        q6x c;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Map)) {
            return new p6x("*");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null && (c = c(entry.getValue())) != null) {
                linkedHashMap.put(str, c);
            }
        }
        return new r6x(linkedHashMap);
    }

    public static q6x f(q6x q6xVar, q6x q6xVar2) {
        if (q6xVar == null || !(q6xVar instanceof r6x) || !(q6xVar2 instanceof r6x)) {
            return q6xVar2;
        }
        Map map = ((r6x) q6xVar).a;
        Map map2 = ((r6x) q6xVar2).a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap.put(entry.getKey(), f((q6x) linkedHashMap.get(entry.getKey()), (q6x) entry.getValue()));
        }
        return new r6x(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v17, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(bhr bhrVar, ContinuationImpl continuationImpl) {
        FlexAdapterImpl$init$1 flexAdapterImpl$init$1;
        int i2;
        kotlinx.coroutines.sync.a aVar;
        bhr bhrVar2;
        bhr bhrVar3;
        try {
            if (continuationImpl instanceof FlexAdapterImpl$init$1) {
                flexAdapterImpl$init$1 = (FlexAdapterImpl$init$1) continuationImpl;
                int i3 = flexAdapterImpl$init$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    flexAdapterImpl$init$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = flexAdapterImpl$init$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = flexAdapterImpl$init$1.label;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        flexAdapterImpl$init$1.L$0 = bhrVar;
                        aVar = this.h;
                        flexAdapterImpl$init$1.L$1 = aVar;
                        flexAdapterImpl$init$1.I$0 = 0;
                        flexAdapterImpl$init$1.label = 1;
                        if (aVar.a(flexAdapterImpl$init$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) flexAdapterImpl$init$1.L$1;
                        bhr bhrVar4 = (bhr) flexAdapterImpl$init$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        bhrVar = bhrVar4;
                    }
                    this.f = bhrVar;
                    if (bhrVar == null) {
                        bhrVar = null;
                    }
                    bhrVar.e.a(new kir("transport_flex_init"));
                    bhrVar2 = this.f;
                    if (bhrVar2 == null) {
                        bhrVar2 = null;
                    }
                    tje.N(bhrVar2.h, null, null, new FlexAdapterImpl$init$2$1(this, null), 3);
                    flex.engine.a engine = ((FeedSdkComponent) ((a) this.a.getValue()).a.getValue()).getEngine();
                    bhrVar3 = this.f;
                    ViewGroup viewGroup = (bhrVar3 != null ? null : bhrVar3).c;
                    if (bhrVar3 == null) {
                        bhrVar3 = null;
                    }
                    engine.g(viewGroup, bhrVar3.b);
                    aVar.d(null);
                    return zy11.a;
                }
            }
            this.f = bhrVar;
            if (bhrVar == null) {
            }
            bhrVar.e.a(new kir("transport_flex_init"));
            bhrVar2 = this.f;
            if (bhrVar2 == null) {
            }
            tje.N(bhrVar2.h, null, null, new FlexAdapterImpl$init$2$1(this, null), 3);
            flex.engine.a engine2 = ((FeedSdkComponent) ((a) this.a.getValue()).a.getValue()).getEngine();
            bhrVar3 = this.f;
            ViewGroup viewGroup2 = (bhrVar3 != null ? null : bhrVar3).c;
            if (bhrVar3 == null) {
            }
            engine2.g(viewGroup2, bhrVar3.b);
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        flexAdapterImpl$init$1 = new FlexAdapterImpl$init$1(this, continuationImpl);
        Object obj2 = flexAdapterImpl$init$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = flexAdapterImpl$init$1.label;
        if (i2 != 0) {
        }
    }

    public final void e(String str, Map map, Map map2, Map map3) {
        Pair pair;
        int systemBars;
        Insets insets;
        bhr bhrVar = this.f;
        if (bhrVar == null) {
            bhrVar = null;
        }
        bhrVar.e.a(new kir("transport_flex_load_document"));
        bhr bhrVar2 = this.f;
        if (bhrVar2 == null) {
            bhrVar2 = null;
        }
        View decorView = bhrVar2.b.getWindow().getDecorView();
        bhr bhrVar3 = this.f;
        if (bhrVar3 == null) {
            bhrVar3 = null;
        }
        AppCompatActivity appCompatActivity = bhrVar3.b;
        if (Build.VERSION.SDK_INT < 30 || decorView.getRootWindowInsets() == null) {
            pair = i;
        } else {
            WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
            systemBars = WindowInsets.Type.systemBars();
            insets = rootWindowInsets.getInsets(systemBars);
            pair = new Pair(Integer.valueOf(Math.round(insets.top / (appCompatActivity.getResources().getDisplayMetrics().xdpi / 160.0f))), Integer.valueOf(Math.round(insets.bottom / (appCompatActivity.getResources().getDisplayMetrics().xdpi / 160.0f))));
        }
        rkf rkfVar = ((skf) this.g.getValue()).get();
        u1m u1mVar = new u1m(map2, str, map);
        bhr bhrVar4 = this.f;
        if (bhrVar4 == null) {
            bhrVar4 = null;
        }
        String str2 = bhrVar4.o;
        rkfVar.forward(u1mVar, str2 != null ? new ywl(new aks0(str2, null), new wul((DivkitSnippet) null, new DivKitScaffoldPadding(new c690(((Number) pair.c()).intValue())), (DivkitSnippet) null, new DivKitScaffoldPadding(new c690(((Number) pair.f()).intValue())), (DivkitSnippet) null, new his0("#00000000"), (ScaffoldAnimations) null, (DivkitSnippet) null, 213, (DefaultConstructorMarker) null), new cnr0(kotlin.collections.b.f()), null, null, null) : null, false, map3);
    }

    public final boolean g() {
        bhr bhrVar = this.f;
        FragmentManager fragmentManager = (bhrVar == null ? null : bhrVar).m;
        if (fragmentManager == null) {
            if (bhrVar == null) {
                bhrVar = null;
            }
            fragmentManager = bhrVar.b.getSupportFragmentManager();
        }
        boolean z = true;
        if (fragmentManager.K() < 1) {
            z = false;
        } else {
            fragmentManager.V();
        }
        ycc.A(this.e);
        return z;
    }

    public final void h(Map map) {
        this.b.d(new ehr(map, this));
    }
}
