package com.yandex.go.environment;

import defpackage.c6z;
import defpackage.dvw0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/environment/SwitchNetworkEnvironmentExperiment;", "Ln96;", "Lc6z;", "Companion", "Modal", "com/yandex/go/environment/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchNetworkEnvironmentExperiment extends n96 implements c6z {
    public static final c Companion = new c();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(4)), null, null, null};
    public final boolean b;
    public final Map c;
    public final String d;
    public final boolean e;
    public final Modal f;

    static {
        new SwitchNetworkEnvironmentExperiment(0);
    }

    public /* synthetic */ SwitchNetworkEnvironmentExperiment(int i, boolean z, Map map, String str, boolean z2, Modal modal) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = "default";
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = modal;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getE() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/environment/SwitchNetworkEnvironmentExperiment$Modal;", "", "Companion", "$serializer", "com/yandex/go/environment/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class Modal {
        public static final d Companion = new d();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ Modal(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getD() {
            return this.d;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: c, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: d, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public Modal() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    public SwitchNetworkEnvironmentExperiment() {
        this(0);
    }

    public SwitchNetworkEnvironmentExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = "default";
        this.e = false;
        this.f = null;
    }
}
