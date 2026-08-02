package com.yandex.delivery.utils.storage.impl;

import android.content.Context;
import defpackage.dxf0;
import defpackage.g6s0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.kme0;
import defpackage.mme0;
import defpackage.ny61;
import defpackage.q2m0;
import defpackage.rle0;
import defpackage.tpr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes.dex */
public final class a {
    public static final g6s0 b = new g6s0();
    public static final rle0 c = jl40.I("delivery-form-modal-views", new dxf0(new q2m0(26)), null, null, 12);
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ShowCountPersistentDataStore$showCount$1 showCountPersistentDataStore$showCount$1;
        int i;
        Integer num;
        if (continuationImpl instanceof ShowCountPersistentDataStore$showCount$1) {
            showCountPersistentDataStore$showCount$1 = (ShowCountPersistentDataStore$showCount$1) continuationImpl;
            int i2 = showCountPersistentDataStore$showCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                showCountPersistentDataStore$showCount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = showCountPersistentDataStore$showCount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = showCountPersistentDataStore$showCount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr data = g6s0.a(b, this.a).getData();
                    showCountPersistentDataStore$showCount$1.L$0 = str;
                    showCountPersistentDataStore$showCount$1.label = 1;
                    obj = e.A(data, showCountPersistentDataStore$showCount$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) showCountPersistentDataStore$showCount$1.L$0;
                    kotlin.b.b(obj);
                }
                mme0 mme0Var = (mme0) obj;
                return new Integer((mme0Var != null || (num = (Integer) mme0Var.c(new kme0(g8e.o("pref_show_count", str)))) == null) ? 0 : num.intValue());
            }
        }
        showCountPersistentDataStore$showCount$1 = new ShowCountPersistentDataStore$showCount$1(this, continuationImpl);
        Object obj2 = showCountPersistentDataStore$showCount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = showCountPersistentDataStore$showCount$1.label;
        if (i != 0) {
        }
        mme0 mme0Var2 = (mme0) obj2;
        return new Integer((mme0Var2 != null || (num = (Integer) mme0Var2.c(new kme0(g8e.o("pref_show_count", str)))) == null) ? 0 : num.intValue());
    }
}
