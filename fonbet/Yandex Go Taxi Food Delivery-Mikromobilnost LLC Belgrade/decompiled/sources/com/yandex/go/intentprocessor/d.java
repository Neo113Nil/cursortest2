package com.yandex.go.intentprocessor;

import android.net.Uri;
import defpackage.h3y;
import defpackage.ha1;
import defpackage.lg21;
import defpackage.mg21;
import defpackage.ny61;
import defpackage.og21;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class d {
    public final lg21 a;
    public final ha1 b;
    public final h3y c;

    public d(lg21 lg21Var, ha1 ha1Var, h3y h3yVar) {
        this.a = lg21Var;
        this.b = ha1Var;
        this.c = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri uri, ContinuationImpl continuationImpl) {
        IntentWebLinkInteractor$openWebLink$1 intentWebLinkInteractor$openWebLink$1;
        int i;
        Uri uri2;
        if (continuationImpl instanceof IntentWebLinkInteractor$openWebLink$1) {
            intentWebLinkInteractor$openWebLink$1 = (IntentWebLinkInteractor$openWebLink$1) continuationImpl;
            int i2 = intentWebLinkInteractor$openWebLink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intentWebLinkInteractor$openWebLink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intentWebLinkInteractor$openWebLink$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intentWebLinkInteractor$openWebLink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = (a) this.c.get();
                    intentWebLinkInteractor$openWebLink$1.L$0 = uri;
                    intentWebLinkInteractor$openWebLink$1.label = 1;
                    obj = aVar.a(uri, intentWebLinkInteractor$openWebLink$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = (Uri) intentWebLinkInteractor$openWebLink$1.L$0;
                    kotlin.b.b(obj);
                }
                uri2 = (Uri) obj;
                if (uri2 != null) {
                    uri = uri2;
                }
                ((mg21) this.a).b(uri);
                return zy11.a;
            }
        }
        intentWebLinkInteractor$openWebLink$1 = new IntentWebLinkInteractor$openWebLink$1(this, continuationImpl);
        Object obj3 = intentWebLinkInteractor$openWebLink$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intentWebLinkInteractor$openWebLink$1.label;
        if (i != 0) {
        }
        uri2 = (Uri) obj3;
        if (uri2 != null) {
        }
        ((mg21) this.a).b(uri);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Uri uri, ContinuationImpl continuationImpl) {
        IntentWebLinkInteractor$process$1 intentWebLinkInteractor$process$1;
        int i;
        if (continuationImpl instanceof IntentWebLinkInteractor$process$1) {
            intentWebLinkInteractor$process$1 = (IntentWebLinkInteractor$process$1) continuationImpl;
            int i2 = intentWebLinkInteractor$process$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intentWebLinkInteractor$process$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intentWebLinkInteractor$process$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intentWebLinkInteractor$process$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!og21.b(uri) || this.b.a(uri)) {
                        z = false;
                    } else {
                        intentWebLinkInteractor$process$1.L$0 = null;
                        intentWebLinkInteractor$process$1.label = 1;
                        if (a(uri, intentWebLinkInteractor$process$1) == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(z);
            }
        }
        intentWebLinkInteractor$process$1 = new IntentWebLinkInteractor$process$1(this, continuationImpl);
        Object obj3 = intentWebLinkInteractor$process$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intentWebLinkInteractor$process$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        return Boolean.valueOf(z2);
    }
}
