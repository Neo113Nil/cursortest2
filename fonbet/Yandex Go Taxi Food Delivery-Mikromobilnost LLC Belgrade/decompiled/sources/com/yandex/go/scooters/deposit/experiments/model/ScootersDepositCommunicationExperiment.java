package com.yandex.go.scooters.deposit.experiments.model;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jrl0;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/deposit/experiments/model/ScootersDepositCommunicationExperiment;", "Lw96;", "Lc6z;", "Companion", "NotificationContent", "CommunicationContent", "com/yandex/go/scooters/deposit/experiments/model/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersDepositCommunicationExperiment extends w96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(15)), null, null};
    public static final ScootersDepositCommunicationExperiment g = new ScootersDepositCommunicationExperiment(0);
    public final boolean b;
    public final Map c;
    public final NotificationContent d;
    public final CommunicationContent e;

    public /* synthetic */ ScootersDepositCommunicationExperiment(int i, boolean z, Map map, NotificationContent notificationContent, CommunicationContent communicationContent) {
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
            this.d = new NotificationContent(0);
        } else {
            this.d = notificationContent;
        }
        if ((i & 8) == 0) {
            this.e = new CommunicationContent(0);
        } else {
            this.e = communicationContent;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/deposit/experiments/model/ScootersDepositCommunicationExperiment$NotificationContent;", "", "Companion", "$serializer", "com/yandex/go/scooters/deposit/experiments/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class NotificationContent {
        public static final c Companion = new c();
        public final String a;
        public final String b;
        public final int c;

        public /* synthetic */ NotificationContent(int i, int i2, String str, String str2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = 3;
            } else {
                this.c = i2;
            }
        }

        public NotificationContent(int i) {
            this.a = "";
            this.b = null;
            this.c = 3;
        }

        public NotificationContent() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/deposit/experiments/model/ScootersDepositCommunicationExperiment$CommunicationContent;", "", "Companion", "$serializer", "com/yandex/go/scooters/deposit/experiments/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CommunicationContent {
        public static final a Companion = new a();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ CommunicationContent(int i, String str, String str2, String str3) {
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
        }

        public CommunicationContent(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public CommunicationContent() {
            this(0);
        }
    }

    public ScootersDepositCommunicationExperiment() {
        this(0);
    }

    public ScootersDepositCommunicationExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        NotificationContent notificationContent = new NotificationContent(0);
        CommunicationContent communicationContent = new CommunicationContent(0);
        this.b = false;
        this.c = f2;
        this.d = notificationContent;
        this.e = communicationContent;
    }
}
