package com.yandex.messaging.internal.storage;

import defpackage.fi9;
import defpackage.sb7;
import defpackage.tpr;

/* loaded from: classes15.dex */
public abstract class h {
    public static final fi9 a(sb7 sb7Var) {
        return kotlinx.coroutines.flow.e.i(new CacheObserverKt$chatListChangedFlow$1(sb7Var, null));
    }

    public static final fi9 b(sb7 sb7Var) {
        return kotlinx.coroutines.flow.e.i(new CacheObserverKt$chatOrganizationsChangesFlow$1(sb7Var, null));
    }

    public static final tpr c(sb7 sb7Var) {
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.i(new CacheObserverKt$chatTranslationFlow$1(sb7Var, null)));
    }

    public static final fi9 d(sb7 sb7Var) {
        return kotlinx.coroutines.flow.e.i(new CacheObserverKt$chatViewChangesFlow$3(sb7Var, null));
    }

    public static final fi9 e(sb7 sb7Var) {
        return kotlinx.coroutines.flow.e.i(new CacheObserverKt$contactListChangedFlow$1(sb7Var, null));
    }

    public static final fi9 f(sb7 sb7Var) {
        return kotlinx.coroutines.flow.e.i(new CacheObserverKt$personalInfoChangesFlow$1(sb7Var, null));
    }

    public static final fi9 g(sb7 sb7Var) {
        return kotlinx.coroutines.flow.e.i(new CacheObserverKt$threadListChangedFlow$1(sb7Var, null));
    }

    public static final fi9 h(sb7 sb7Var) {
        return kotlinx.coroutines.flow.e.i(new CacheObserverKt$unreadChangesFlow$1(sb7Var, null));
    }

    public static final fi9 i(sb7 sb7Var, String str) {
        return kotlinx.coroutines.flow.e.i(new CacheObserverKt$userChangesFlow$1(sb7Var, str, null));
    }
}
