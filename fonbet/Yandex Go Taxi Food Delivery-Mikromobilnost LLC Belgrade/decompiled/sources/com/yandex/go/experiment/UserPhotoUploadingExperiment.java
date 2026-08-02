package com.yandex.go.experiment;

import defpackage.c6z;
import defpackage.gn11;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.xn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/experiment/UserPhotoUploadingExperiment;", "Lxn11;", "Lc6z;", "Companion", "NotificationParameters", "com/yandex/go/experiment/c", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserPhotoUploadingExperiment implements xn11, c6z {
    public static final c Companion = new c();
    public static final i3y[] g;
    public static final UserPhotoUploadingExperiment h;
    public final boolean b;
    public final Map c;
    public final double d;
    public final double e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new gn11(22)), null, null, kotlin.a.b(lazyThreadSafetyMode, new gn11(23))};
        h = new UserPhotoUploadingExperiment(0);
    }

    public /* synthetic */ UserPhotoUploadingExperiment(int i, boolean z, Map map, double d, double d2, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = 0.8d;
        } else {
            this.d = d;
        }
        if ((i & 8) == 0) {
            this.e = 0.9d;
        } else {
            this.e = d2;
        }
        if ((i & 16) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public UserPhotoUploadingExperiment() {
        this(0);
    }

    public UserPhotoUploadingExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = 0.8d;
        this.e = 0.9d;
        this.f = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/experiment/UserPhotoUploadingExperiment$NotificationParameters;", "", "Companion", "$serializer", "com/yandex/go/experiment/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class NotificationParameters {
        public static final d Companion = new d();
        public final int a;
        public final boolean b;
        public final String c;
        public final String d;
        public final String e;
        public final Integer f;
        public final String g;

        public /* synthetic */ NotificationParameters(int i, int i2, boolean z, String str, String str2, String str3, Integer num, String str4) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str3;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = num;
            }
            if ((i & 64) == 0) {
                this.g = "";
            } else {
                this.g = str4;
            }
        }

        /* renamed from: a, reason: from getter */
        public final int getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        /* renamed from: c, reason: from getter */
        public final Integer getF() {
            return this.f;
        }

        /* renamed from: d, reason: from getter */
        public final String getE() {
            return this.e;
        }

        /* renamed from: e, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: f, reason: from getter */
        public final String getG() {
            return this.g;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getB() {
            return this.b;
        }

        public NotificationParameters() {
            this.a = 0;
            this.b = false;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = "";
        }
    }
}
