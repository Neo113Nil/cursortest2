package com.yandex.go.scooters.ignition.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.s3n0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionResponse;", "", "Companion", "Notification", "Beacon", "RideParams", "$serializer", "com/yandex/go/scooters/ignition/data/model/x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersIgnitionResponse {
    public static final x Companion = new x();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s3n0(26)), null};
    public final ief a;
    public final Notification b;
    public final List c;
    public final RideParams d;

    public /* synthetic */ ScootersIgnitionResponse(int i, ief iefVar, Notification notification, List list, RideParams rideParams) {
        this.a = (i & 1) == 0 ? ief.e : iefVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = notification;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = rideParams;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionResponse$Notification;", "", "Companion", "$serializer", "com/yandex/go/scooters/ignition/data/model/y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Notification {
        public static final y Companion = new y();
        public final FormattedText a;
        public final FormattedText b;

        public /* synthetic */ Notification(int i, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
        }

        public Notification() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionResponse$RideParams;", "", "Companion", "$serializer", "com/yandex/go/scooters/ignition/data/model/z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RideParams {
        public static final z Companion = new z();
        public final String a;
        public final String b;

        public /* synthetic */ RideParams(int i, String str, String str2) {
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

        public RideParams() {
            this.a = "";
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionResponse$Beacon;", "", "Companion", "$serializer", "com/yandex/go/scooters/ignition/data/model/w", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Beacon {
        public static final w Companion = new w();
        public final String a;
        public final Integer b;
        public final Integer c;

        public /* synthetic */ Beacon(int i, Integer num, Integer num2, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num2;
            }
        }

        /* renamed from: a, reason: from getter */
        public final Integer getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final Integer getC() {
            return this.c;
        }

        /* renamed from: c, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public Beacon() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public ScootersIgnitionResponse() {
        this.a = ief.e;
        this.b = null;
        this.c = EmptyList.a;
        this.d = null;
    }
}
