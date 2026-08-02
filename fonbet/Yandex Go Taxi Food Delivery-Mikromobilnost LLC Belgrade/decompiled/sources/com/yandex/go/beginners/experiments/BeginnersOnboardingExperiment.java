package com.yandex.go.beginners.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.tt4;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/beginners/experiments/BeginnersOnboardingExperiment;", "Lw96;", "Lc6z;", "Companion", "ServiceInfo", "com/yandex/go/beginners/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BeginnersOnboardingExperiment extends w96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] k;
    public static final BeginnersOnboardingExperiment l;
    public final Map b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final ServiceInfo i;
    public final boolean j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new tt4(20)), null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new tt4(21)), null, null};
        l = new BeginnersOnboardingExperiment(0);
    }

    public /* synthetic */ BeginnersOnboardingExperiment(int i, Map map, boolean z, boolean z2, String str, String str2, String str3, List list, ServiceInfo serviceInfo, boolean z3) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str3;
        }
        if ((i & 64) == 0) {
            this.h = EmptyList.a;
        } else {
            this.h = list;
        }
        if ((i & 128) == 0) {
            ServiceInfo.Companion.getClass();
            this.i = ServiceInfo.e;
        } else {
            this.i = serviceInfo;
        }
        if ((i & 256) == 0) {
            this.j = true;
        } else {
            this.j = z3;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/beginners/experiments/BeginnersOnboardingExperiment$ServiceInfo;", "", "Companion", "com/yandex/go/beginners/experiments/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class ServiceInfo {
        public static final c Companion = new c();
        public static final ServiceInfo e = new ServiceInfo(0);
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ ServiceInfo(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
        }

        public ServiceInfo(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public ServiceInfo() {
            this(0);
        }
    }

    public BeginnersOnboardingExperiment() {
        this(0);
    }

    public BeginnersOnboardingExperiment(int i) {
        Map f = kotlin.collections.b.f();
        ServiceInfo.Companion.getClass();
        this.b = f;
        this.c = false;
        this.d = false;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = EmptyList.a;
        this.i = ServiceInfo.e;
        this.j = true;
    }
}
