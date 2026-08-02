package com.yandex.go.vault.domain;

import com.yandex.go.vault.data.b;
import defpackage.kr;
import defpackage.ny61;
import defpackage.wgr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final wgr a;
    public final b b;

    public a(wgr wgrVar, b bVar) {
        this.a = wgrVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ReloadDocumentInteractor$reload$1 reloadDocumentInteractor$reload$1;
        int i;
        wgr wgrVar;
        if (continuationImpl instanceof ReloadDocumentInteractor$reload$1) {
            reloadDocumentInteractor$reload$1 = (ReloadDocumentInteractor$reload$1) continuationImpl;
            int i2 = reloadDocumentInteractor$reload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                reloadDocumentInteractor$reload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = reloadDocumentInteractor$reload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = reloadDocumentInteractor$reload$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    reloadDocumentInteractor$reload$1.L$0 = null;
                    wgr wgrVar2 = this.a;
                    reloadDocumentInteractor$reload$1.L$1 = wgrVar2;
                    reloadDocumentInteractor$reload$1.label = 1;
                    Object a = this.b.a(str, reloadDocumentInteractor$reload$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        wgrVar = wgrVar2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                wgrVar = (wgr) reloadDocumentInteractor$reload$1.L$1;
                kotlin.b.b(obj);
                reloadDocumentInteractor$reload$1.L$0 = null;
                reloadDocumentInteractor$reload$1.L$1 = null;
                reloadDocumentInteractor$reload$1.label = 2;
                Object a2 = wgrVar.a((kr) obj, reloadDocumentInteractor$reload$1);
                return a2 != coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        reloadDocumentInteractor$reload$1 = new ReloadDocumentInteractor$reload$1(this, continuationImpl);
        Object obj2 = reloadDocumentInteractor$reload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = reloadDocumentInteractor$reload$1.label;
        if (i != 0) {
        }
        reloadDocumentInteractor$reload$1.L$0 = null;
        reloadDocumentInteractor$reload$1.L$1 = null;
        reloadDocumentInteractor$reload$1.label = 2;
        Object a22 = wgrVar.a((kr) obj2, reloadDocumentInteractor$reload$1);
        if (a22 != coroutineSingletons2) {
        }
    }
}
