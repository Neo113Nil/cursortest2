package com.yandex.plus.core.network.uri;

import android.net.Uri;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public interface c {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object a(c cVar, Uri uri, ContinuationImpl continuationImpl) {
        UriPreparer$prepare$1 uriPreparer$prepare$1;
        int i;
        if (continuationImpl instanceof UriPreparer$prepare$1) {
            uriPreparer$prepare$1 = (UriPreparer$prepare$1) continuationImpl;
            int i2 = uriPreparer$prepare$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uriPreparer$prepare$1.label = i2 - Integer.MIN_VALUE;
                Object obj = uriPreparer$prepare$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uriPreparer$prepare$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Uri.Builder buildUpon = uri.buildUpon();
                    uriPreparer$prepare$1.L$0 = null;
                    uriPreparer$prepare$1.L$1 = null;
                    uriPreparer$prepare$1.L$2 = buildUpon;
                    uriPreparer$prepare$1.label = 1;
                    return ((a) cVar).b(buildUpon, uriPreparer$prepare$1) == coroutineSingletons ? coroutineSingletons : buildUpon;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Uri.Builder builder = (Uri.Builder) uriPreparer$prepare$1.L$2;
                kotlin.b.b(obj);
                return builder;
            }
        }
        uriPreparer$prepare$1 = new UriPreparer$prepare$1(cVar, continuationImpl);
        Object obj2 = uriPreparer$prepare$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uriPreparer$prepare$1.label;
        if (i != 0) {
        }
    }
}
