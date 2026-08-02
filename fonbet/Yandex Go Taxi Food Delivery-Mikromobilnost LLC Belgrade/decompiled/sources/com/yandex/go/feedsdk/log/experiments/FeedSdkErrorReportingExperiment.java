package com.yandex.go.feedsdk.log.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import defpackage.wmq;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/feedsdk/log/experiments/FeedSdkErrorReportingExperiment;", "Lw96;", "Companion", "com/yandex/go/feedsdk/log/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FeedSdkErrorReportingExperiment extends w96 {
    public static final a Companion = new a();
    public static final i3y[] g;
    public static final FeedSdkErrorReportingExperiment h;
    public final boolean b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final int f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new wmq(21)), kotlin.a.b(lazyThreadSafetyMode, new wmq(22)), kotlin.a.b(lazyThreadSafetyMode, new wmq(23)), null};
        h = new FeedSdkErrorReportingExperiment(0);
    }

    public /* synthetic */ FeedSdkErrorReportingExperiment(int i, boolean z, Set set, Set set2, Set set3, int i2) {
        this.b = (i & 1) == 0 ? false : z;
        int i3 = i & 2;
        EmptySet emptySet = EmptySet.a;
        if (i3 == 0) {
            this.c = emptySet;
        } else {
            this.c = set;
        }
        if ((i & 4) == 0) {
            this.d = emptySet;
        } else {
            this.d = set2;
        }
        if ((i & 8) == 0) {
            this.e = emptySet;
        } else {
            this.e = set3;
        }
        if ((i & 16) == 0) {
            this.f = 150;
        } else {
            this.f = i2;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public FeedSdkErrorReportingExperiment(int i) {
        this.b = false;
        EmptySet emptySet = EmptySet.a;
        this.c = emptySet;
        this.d = emptySet;
        this.e = emptySet;
        this.f = 150;
    }

    public FeedSdkErrorReportingExperiment() {
        this(0);
    }
}
