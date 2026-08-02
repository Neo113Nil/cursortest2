package com.yandex.go.feedsdk.log;

import com.yandex.go.feedsdk.log.c;
import com.yandex.go.feedsdk.log.experiments.FeedSdkErrorReportingExperiment;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.jst;
import defpackage.lqq;
import defpackage.mdh;
import defpackage.qoh;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xby;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class c {
    public final qoh a;
    public final i3y b;
    public final i3y c;
    public final i3y d;
    public final i3y e;

    public c(tse tseVar, tt2 tt2Var, lqq lqqVar) {
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        GoFeedSdkErrorLoggerFactoryFactory$experimentProvider$1 goFeedSdkErrorLoggerFactoryFactory$experimentProvider$1 = new GoFeedSdkErrorLoggerFactoryFactory$experimentProvider$1(lqqVar, null);
        final int i = 2;
        this.a = tje.h(tseVar, mdhVar, null, goFeedSdkErrorLoggerFactoryFactory$experimentProvider$1, 2);
        this.b = kotlin.a.a(new sls() { // from class: com.yandex.go.feedsdk.log.b
            @Override // defpackage.sls
            public final Object invoke() {
                return (FeedSdkErrorReportingExperiment) tje.Y(EmptyCoroutineContext.a, new GoFeedSdkErrorLoggerFactoryFactory$experiment$2$1(c.this, null));
            }
        });
        final int i2 = 0;
        this.c = kotlin.a.a(new sls(this) { // from class: nnt
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                c cVar = this.b;
                switch (i3) {
                    case 0:
                        Set set = ((FeedSdkErrorReportingExperiment) cVar.b.getValue()).c;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            Regex a = c.a((String) it.next());
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        return arrayList;
                    case 1:
                        Set set2 = ((FeedSdkErrorReportingExperiment) cVar.b.getValue()).d;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            Regex a2 = c.a((String) it2.next());
                            if (a2 != null) {
                                arrayList2.add(a2);
                            }
                        }
                        return arrayList2;
                    default:
                        Set set3 = ((FeedSdkErrorReportingExperiment) cVar.b.getValue()).e;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = set3.iterator();
                        while (it3.hasNext()) {
                            Regex a3 = c.a((String) it3.next());
                            if (a3 != null) {
                                arrayList3.add(a3);
                            }
                        }
                        return arrayList3;
                }
            }
        });
        final int i3 = 1;
        this.d = kotlin.a.a(new sls(this) { // from class: nnt
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i3;
                c cVar = this.b;
                switch (i32) {
                    case 0:
                        Set set = ((FeedSdkErrorReportingExperiment) cVar.b.getValue()).c;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            Regex a = c.a((String) it.next());
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        return arrayList;
                    case 1:
                        Set set2 = ((FeedSdkErrorReportingExperiment) cVar.b.getValue()).d;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            Regex a2 = c.a((String) it2.next());
                            if (a2 != null) {
                                arrayList2.add(a2);
                            }
                        }
                        return arrayList2;
                    default:
                        Set set3 = ((FeedSdkErrorReportingExperiment) cVar.b.getValue()).e;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = set3.iterator();
                        while (it3.hasNext()) {
                            Regex a3 = c.a((String) it3.next());
                            if (a3 != null) {
                                arrayList3.add(a3);
                            }
                        }
                        return arrayList3;
                }
            }
        });
        this.e = kotlin.a.a(new sls(this) { // from class: nnt
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i;
                c cVar = this.b;
                switch (i32) {
                    case 0:
                        Set set = ((FeedSdkErrorReportingExperiment) cVar.b.getValue()).c;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            Regex a = c.a((String) it.next());
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        return arrayList;
                    case 1:
                        Set set2 = ((FeedSdkErrorReportingExperiment) cVar.b.getValue()).d;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            Regex a2 = c.a((String) it2.next());
                            if (a2 != null) {
                                arrayList2.add(a2);
                            }
                        }
                        return arrayList2;
                    default:
                        Set set3 = ((FeedSdkErrorReportingExperiment) cVar.b.getValue()).e;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = set3.iterator();
                        while (it3.hasNext()) {
                            Regex a3 = c.a((String) it3.next());
                            if (a3 != null) {
                                arrayList3.add(a3);
                            }
                        }
                        return arrayList3;
                }
            }
        });
    }

    public static Regex a(String str) {
        try {
            return new Regex(str);
        } catch (Throwable th) {
            xby.l(jst.e, "FEED_SDK", null, th, g8e.o("invalid regexp: ", str), 2);
            return null;
        }
    }
}
