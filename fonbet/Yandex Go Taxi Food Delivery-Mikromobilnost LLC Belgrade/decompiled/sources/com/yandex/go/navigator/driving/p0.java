package com.yandex.go.navigator.driving;

import android.net.Uri;
import com.yandex.mapkit.Attribution;
import com.yandex.mapkit.road_events.RoadEventMetadata;
import com.yandex.mapkit.road_events.RoadEventsManager;
import defpackage.b621;
import defpackage.cvu0;
import defpackage.dvw;
import defpackage.g6u;
import defpackage.gpv;
import defpackage.j18;
import defpackage.mth;
import defpackage.ny61;
import defpackage.o400;
import defpackage.oav0;
import defpackage.q290;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wsk0;
import defpackage.z521;
import defpackage.zuj0;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class p0 {
    public final com.yandex.go.navigator.domain.o a;
    public final b621 b;
    public final r c;
    public final q290 d;
    public final com.yandex.go.navigator.events.g e;
    public final tt2 f;
    public final gpv g;
    public final zuj0 h;
    public final LinkedHashMap i;

    public p0(com.yandex.go.navigator.domain.o oVar, b621 b621Var, r rVar, q290 q290Var, com.yandex.go.navigator.events.g gVar, tt2 tt2Var, gpv gpvVar, zuj0 zuj0Var, wsk0 wsk0Var) {
        this.a = oVar;
        this.b = b621Var;
        this.c = rVar;
        this.d = q290Var;
        this.e = gVar;
        this.f = tt2Var;
        this.g = gpvVar;
        this.h = zuj0Var;
        wsk0Var.getClass();
        this.i = wsk0.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(p0 p0Var, String str, ContinuationImpl continuationImpl) {
        UpcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1 upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1;
        int i;
        p0Var.getClass();
        if (continuationImpl instanceof UpcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1) {
            upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1 = (UpcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1) continuationImpl;
            int i2 = upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.navigator.events.g gVar = p0Var.e;
                    upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.L$0 = str;
                    upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.label = 1;
                    obj = gVar.a(upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str = (String) upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.L$0;
                    kotlin.b.b(obj);
                }
                RoadEventsManager roadEventsManager = (RoadEventsManager) obj;
                upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.L$0 = str;
                upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.L$1 = roadEventsManager;
                upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1));
                j18Var.u();
                j18Var.w(new oav0(6, roadEventsManager.requestEventInfo(str, new z521(j18Var))));
                Object s = j18Var.s();
                return s != coroutineSingletons ? coroutineSingletons : s;
            }
        }
        upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1 = new UpcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1(p0Var, continuationImpl);
        Object obj2 = upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.label;
        if (i != 0) {
        }
        RoadEventsManager roadEventsManager2 = (RoadEventsManager) obj2;
        upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.L$0 = str;
        upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.L$1 = roadEventsManager2;
        upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(upcomingRoadEventNotificationContentRepository$getRoadEventMetadata$1));
        j18Var2.u();
        j18Var2.w(new oav0(6, roadEventsManager2.requestEventInfo(str, new z521(j18Var2))));
        Object s2 = j18Var2.s();
        if (s2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(p0 p0Var, String str, ContinuationImpl continuationImpl) {
        UpcomingRoadEventNotificationContentRepository$isCreatedByProvider$1 upcomingRoadEventNotificationContentRepository$isCreatedByProvider$1;
        int i;
        RoadEventMetadata roadEventMetadata;
        Attribution.Author author;
        String uri;
        Uri parse;
        p0Var.getClass();
        if (continuationImpl instanceof UpcomingRoadEventNotificationContentRepository$isCreatedByProvider$1) {
            upcomingRoadEventNotificationContentRepository$isCreatedByProvider$1 = (UpcomingRoadEventNotificationContentRepository$isCreatedByProvider$1) continuationImpl;
            int i2 = upcomingRoadEventNotificationContentRepository$isCreatedByProvider$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upcomingRoadEventNotificationContentRepository$isCreatedByProvider$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upcomingRoadEventNotificationContentRepository$isCreatedByProvider$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upcomingRoadEventNotificationContentRepository$isCreatedByProvider$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p0Var.f.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    UpcomingRoadEventNotificationContentRepository$isCreatedByProvider$metadata$1 upcomingRoadEventNotificationContentRepository$isCreatedByProvider$metadata$1 = new UpcomingRoadEventNotificationContentRepository$isCreatedByProvider$metadata$1(p0Var, str, null);
                    upcomingRoadEventNotificationContentRepository$isCreatedByProvider$1.L$0 = null;
                    upcomingRoadEventNotificationContentRepository$isCreatedByProvider$1.label = 1;
                    obj = tje.k0(g6uVar, upcomingRoadEventNotificationContentRepository$isCreatedByProvider$metadata$1, upcomingRoadEventNotificationContentRepository$isCreatedByProvider$1);
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
                roadEventMetadata = (RoadEventMetadata) obj;
                if (roadEventMetadata != null || (author = roadEventMetadata.getAuthor()) == null || (uri = author.getUri()) == null || (parse = Uri.parse(uri)) == null) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(parse.isOpaque() && cvu0.x(parse.getSchemeSpecificPart(), "uuid", false));
            }
        }
        upcomingRoadEventNotificationContentRepository$isCreatedByProvider$1 = new UpcomingRoadEventNotificationContentRepository$isCreatedByProvider$1(p0Var, continuationImpl);
        Object obj2 = upcomingRoadEventNotificationContentRepository$isCreatedByProvider$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upcomingRoadEventNotificationContentRepository$isCreatedByProvider$1.label;
        if (i != 0) {
        }
        roadEventMetadata = (RoadEventMetadata) obj2;
        if (roadEventMetadata != null) {
        }
        return Boolean.FALSE;
    }

    public final kotlinx.coroutines.flow.m0 c() {
        return new kotlinx.coroutines.flow.m0(new mth(this.a.g, 6), new g0(this.b.b, this), new UpcomingRoadEventNotificationContentRepository$nextRoadEventWithDistanceFlow$1(3, null));
    }
}
