package com.yandex.go.taxi.intercity.dashboard.impl.experiment;

import defpackage.b64;
import defpackage.c6z;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i2v;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.xn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/experiment/IntercityDashboardFeedbackExperiment;", "Lxn11;", "Lc6z;", "Companion", "Reason", "com/yandex/go/taxi/intercity/dashboard/impl/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class IntercityDashboardFeedbackExperiment implements xn11, c6z {
    public static final a Companion = new a();
    public static final i3y[] k;
    public static final IntercityDashboardFeedbackExperiment l;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final Map j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new i2v(14)), kotlin.a.b(lazyThreadSafetyMode, new i2v(15))};
        l = new IntercityDashboardFeedbackExperiment(0);
    }

    public /* synthetic */ IntercityDashboardFeedbackExperiment(int i, boolean z, boolean z2, int i2, String str, String str2, String str3, String str4, List list, Map map) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 4) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
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
            this.h = "";
        } else {
            this.h = str4;
        }
        if ((i & 128) == 0) {
            this.i = EmptyList.a;
        } else {
            this.i = list;
        }
        if ((i & 256) == 0) {
            this.j = kotlin.collections.b.f();
        } else {
            this.j = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercityDashboardFeedbackExperiment)) {
            return false;
        }
        IntercityDashboardFeedbackExperiment intercityDashboardFeedbackExperiment = (IntercityDashboardFeedbackExperiment) obj;
        return this.b == intercityDashboardFeedbackExperiment.b && this.c == intercityDashboardFeedbackExperiment.c && this.d == intercityDashboardFeedbackExperiment.d && jl40.l(this.e, intercityDashboardFeedbackExperiment.e) && jl40.l(this.f, intercityDashboardFeedbackExperiment.f) && jl40.l(this.g, intercityDashboardFeedbackExperiment.g) && jl40.l(this.h, intercityDashboardFeedbackExperiment.h) && jl40.l(this.i, intercityDashboardFeedbackExperiment.i) && jl40.l(this.j, intercityDashboardFeedbackExperiment.j);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getM() {
        return this.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + unr0.c(unr0.b(unr0.b(unr0.b(unr0.b(oyr.b(this.d, unr0.e(Boolean.hashCode(this.b) * 31, 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder u = qv10.u("IntercityDashboardFeedbackExperiment(enabled=", ", shouldShuffleReasons=", ", feedbackDisplayIntervalDays=", this.b, this.c);
        smw0.t(this.d, ", headerTitleTk=", this.e, ", commentPlaceholderTitleTk=", u);
        g8e.D(u, this.f, ", cancelButtonTitleTk=", this.g, ", doneButtonTitleTk=");
        tse0.x(this.h, ", reasons=", ", l10n=", u, this.i);
        return b64.r(u, this.j, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/experiment/IntercityDashboardFeedbackExperiment$Reason;", "", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Reason {
        public static final b Companion = new b();
        public final String a;
        public final String b;

        public /* synthetic */ Reason(int i, String str, String str2) {
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reason)) {
                return false;
            }
            Reason reason = (Reason) obj;
            return jl40.l(this.a, reason.a) && jl40.l(this.b, reason.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("Reason(titleTk=", this.a, ", imageTag=", this.b, Extension.C_BRAKE);
        }

        public Reason() {
            this.a = "";
            this.b = "";
        }
    }

    public IntercityDashboardFeedbackExperiment() {
        this(0);
    }

    public IntercityDashboardFeedbackExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = false;
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = EmptyList.a;
        this.j = f;
    }
}
