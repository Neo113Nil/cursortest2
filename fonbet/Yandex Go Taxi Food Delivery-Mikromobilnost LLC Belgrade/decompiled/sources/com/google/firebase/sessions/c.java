package com.google.firebase.sessions;

import defpackage.fse;
import defpackage.gfo;
import defpackage.hcr;
import defpackage.ny61;
import defpackage.p2f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class c {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final com.google.firebase.a a;
    public final hcr b;
    public final com.google.firebase.sessions.settings.b c;
    public final gfo d;
    public final fse e;

    public c(com.google.firebase.a aVar, hcr hcrVar, com.google.firebase.sessions.settings.b bVar, gfo gfoVar, fse fseVar) {
        this.a = aVar;
        this.b = hcrVar;
        this.c = bVar;
        this.d = gfoVar;
        this.e = fseVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        if (r6.b(r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004d, code lost:
    
        if (r6 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ContinuationImpl continuationImpl) {
        SessionFirelogPublisherImpl$shouldLogSession$1 sessionFirelogPublisherImpl$shouldLogSession$1;
        int i;
        Collection values;
        Iterator it;
        cVar.getClass();
        if (continuationImpl instanceof SessionFirelogPublisherImpl$shouldLogSession$1) {
            sessionFirelogPublisherImpl$shouldLogSession$1 = (SessionFirelogPublisherImpl$shouldLogSession$1) continuationImpl;
            int i2 = sessionFirelogPublisherImpl$shouldLogSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sessionFirelogPublisherImpl$shouldLogSession$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sessionFirelogPublisherImpl$shouldLogSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sessionFirelogPublisherImpl$shouldLogSession$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.google.firebase.sessions.api.a aVar = com.google.firebase.sessions.api.a.a;
                    sessionFirelogPublisherImpl$shouldLogSession$1.L$0 = cVar;
                    sessionFirelogPublisherImpl$shouldLogSession$1.label = 1;
                    obj = aVar.b(sessionFirelogPublisherImpl$shouldLogSession$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cVar = (c) sessionFirelogPublisherImpl$shouldLogSession$1.L$0;
                        kotlin.b.b(obj);
                        com.google.firebase.sessions.settings.b bVar = cVar.c;
                        Boolean c = bVar.a.c();
                        if (c != null) {
                            z = c.booleanValue();
                        } else {
                            Boolean c2 = bVar.b.c();
                            if (c2 != null) {
                                z = c2.booleanValue();
                            }
                        }
                        if (z) {
                            return f <= cVar.c.a() ? Boolean.TRUE : Boolean.FALSE;
                        }
                        return Boolean.FALSE;
                    }
                    cVar = (c) sessionFirelogPublisherImpl$shouldLogSession$1.L$0;
                    kotlin.b.b(obj);
                }
                values = ((Map) obj).values();
                if ((values instanceof Collection) || !values.isEmpty()) {
                    it = values.iterator();
                    while (it.hasNext()) {
                        if (((p2f) it.next()).a.c()) {
                            com.google.firebase.sessions.settings.b bVar2 = cVar.c;
                            sessionFirelogPublisherImpl$shouldLogSession$1.L$0 = cVar;
                            sessionFirelogPublisherImpl$shouldLogSession$1.label = 2;
                        }
                    }
                }
                return Boolean.FALSE;
            }
        }
        sessionFirelogPublisherImpl$shouldLogSession$1 = new SessionFirelogPublisherImpl$shouldLogSession$1(cVar, continuationImpl);
        Object obj2 = sessionFirelogPublisherImpl$shouldLogSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sessionFirelogPublisherImpl$shouldLogSession$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        values = ((Map) obj2).values();
        if (values instanceof Collection) {
        }
        it = values.iterator();
        while (it.hasNext()) {
        }
        return Boolean.FALSE;
    }
}
