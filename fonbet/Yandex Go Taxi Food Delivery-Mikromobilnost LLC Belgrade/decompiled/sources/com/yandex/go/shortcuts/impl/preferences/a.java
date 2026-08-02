package com.yandex.go.shortcuts.impl.preferences;

import com.yandex.go.shortcuts.models.ShortcutClickInfo;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.iid0;
import defpackage.kgx;
import defpackage.ny61;
import defpackage.p53;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zy11;
import java.util.Collection;
import java.util.Set;
import kotlin.b;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes8.dex */
public final class a {
    public static final /* synthetic */ kgx[] e = {new MutablePropertyReference1Impl("clickedShortcutsJson", 0, "getClickedShortcutsJson()Ljava/lang/String;", a.class)};
    public static final p53 f = new p53(ShortcutClickInfo.Companion.serializer(), 1);
    public final wnt a;
    public final cne0 b;
    public final iid0 c;
    public final kotlinx.coroutines.sync.a d;

    public a(wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        cne0 a = dne0Var.a("products");
        this.b = a;
        this.c = new iid0(a, "ru.yandex.taxi.shortcuts.preferences.ProductsPreferences.clickedShortcuts");
        this.d = gtq0.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v6, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ShortcutClickInfo shortcutClickInfo, ContinuationImpl continuationImpl) {
        ProductsPreferences$addClickedShortcut$1 productsPreferences$addClickedShortcut$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof ProductsPreferences$addClickedShortcut$1) {
                productsPreferences$addClickedShortcut$1 = (ProductsPreferences$addClickedShortcut$1) continuationImpl;
                int i2 = productsPreferences$addClickedShortcut$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    productsPreferences$addClickedShortcut$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = productsPreferences$addClickedShortcut$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = productsPreferences$addClickedShortcut$1.label;
                    if (i != 0) {
                        b.b(obj);
                        productsPreferences$addClickedShortcut$1.L$0 = shortcutClickInfo;
                        aVar = this.d;
                        productsPreferences$addClickedShortcut$1.L$1 = aVar;
                        productsPreferences$addClickedShortcut$1.label = 1;
                        if (aVar.a(productsPreferences$addClickedShortcut$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) productsPreferences$addClickedShortcut$1.L$1;
                        ShortcutClickInfo shortcutClickInfo2 = (ShortcutClickInfo) productsPreferences$addClickedShortcut$1.L$0;
                        b.b(obj);
                        aVar = r6;
                        shortcutClickInfo = shortcutClickInfo2;
                    }
                    Set M0 = kotlin.collections.a.M0(c());
                    M0.add(shortcutClickInfo);
                    this.c.setValue(this, e[0], ((xnt) this.a).e(M0, f));
                    aVar.d(null);
                    return zy11.a;
                }
            }
            Set M02 = kotlin.collections.a.M0(c());
            M02.add(shortcutClickInfo);
            this.c.setValue(this, e[0], ((xnt) this.a).e(M02, f));
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        productsPreferences$addClickedShortcut$1 = new ProductsPreferences$addClickedShortcut$1(this, continuationImpl);
        Object obj2 = productsPreferences$addClickedShortcut$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsPreferences$addClickedShortcut$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ProductsPreferences$getClickedShortcuts$1 productsPreferences$getClickedShortcuts$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof ProductsPreferences$getClickedShortcuts$1) {
                productsPreferences$getClickedShortcuts$1 = (ProductsPreferences$getClickedShortcuts$1) continuationImpl;
                int i2 = productsPreferences$getClickedShortcuts$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    productsPreferences$getClickedShortcuts$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = productsPreferences$getClickedShortcuts$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = productsPreferences$getClickedShortcuts$1.label;
                    if (i != 0) {
                        b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.d;
                        productsPreferences$getClickedShortcuts$1.L$0 = aVar;
                        productsPreferences$getClickedShortcuts$1.label = 1;
                        if (aVar.a(productsPreferences$getClickedShortcuts$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) productsPreferences$getClickedShortcuts$1.L$0;
                        b.b(obj);
                    }
                    return c();
                }
            }
            return c();
        } finally {
            g050Var.d(null);
        }
        productsPreferences$getClickedShortcuts$1 = new ProductsPreferences$getClickedShortcuts$1(this, continuationImpl);
        Object obj2 = productsPreferences$getClickedShortcuts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsPreferences$getClickedShortcuts$1.label;
        if (i != 0) {
        }
    }

    public final Set c() {
        String str = (String) this.c.getValue(this, e[0]);
        if (str != null) {
            Set set = (Set) ((xnt) this.a).c(str, f);
            if (set != null) {
                return set;
            }
        }
        return EmptySet.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v9, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Collection collection, ContinuationImpl continuationImpl) {
        ProductsPreferences$removeClickedShortcuts$1 productsPreferences$removeClickedShortcuts$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof ProductsPreferences$removeClickedShortcuts$1) {
                productsPreferences$removeClickedShortcuts$1 = (ProductsPreferences$removeClickedShortcuts$1) continuationImpl;
                int i2 = productsPreferences$removeClickedShortcuts$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    productsPreferences$removeClickedShortcuts$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = productsPreferences$removeClickedShortcuts$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = productsPreferences$removeClickedShortcuts$1.label;
                    if (i != 0) {
                        b.b(obj);
                        productsPreferences$removeClickedShortcuts$1.L$0 = collection;
                        aVar = this.d;
                        productsPreferences$removeClickedShortcuts$1.L$1 = aVar;
                        productsPreferences$removeClickedShortcuts$1.label = 1;
                        if (aVar.a(productsPreferences$removeClickedShortcuts$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) productsPreferences$removeClickedShortcuts$1.L$1;
                        Collection collection2 = (Collection) productsPreferences$removeClickedShortcuts$1.L$0;
                        b.b(obj);
                        aVar = r6;
                        collection = collection2;
                    }
                    Set M0 = kotlin.collections.a.M0(c());
                    M0.removeAll(kotlin.collections.a.N0(collection));
                    this.c.setValue(this, e[0], ((xnt) this.a).e(M0, f));
                    aVar.d(null);
                    return zy11.a;
                }
            }
            Set M02 = kotlin.collections.a.M0(c());
            M02.removeAll(kotlin.collections.a.N0(collection));
            this.c.setValue(this, e[0], ((xnt) this.a).e(M02, f));
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        productsPreferences$removeClickedShortcuts$1 = new ProductsPreferences$removeClickedShortcuts$1(this, continuationImpl);
        Object obj2 = productsPreferences$removeClickedShortcuts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsPreferences$removeClickedShortcuts$1.label;
        if (i != 0) {
        }
    }
}
