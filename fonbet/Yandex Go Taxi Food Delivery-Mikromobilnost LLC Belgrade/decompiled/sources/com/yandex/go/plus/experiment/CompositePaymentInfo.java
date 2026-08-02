package com.yandex.go.plus.experiment;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/plus/experiment/CompositePaymentInfo;", "", "Companion", "NotificationText", "$serializer", "com/yandex/go/plus/experiment/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompositePaymentInfo {
    public static final c Companion = new c();
    public final NotificationText a;
    public final String b;

    public /* synthetic */ CompositePaymentInfo(int i, NotificationText notificationText, String str) {
        this.a = (i & 1) == 0 ? new NotificationText(0) : notificationText;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/plus/experiment/CompositePaymentInfo$NotificationText;", "", "Companion", "$serializer", "com/yandex/go/plus/experiment/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class NotificationText {
        public static final d Companion = new d();
        public final boolean a;
        public final String b;

        public /* synthetic */ NotificationText(int i, String str, boolean z) {
            this.a = (i & 1) == 0 ? true : z;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public NotificationText(int i) {
            this.a = true;
            this.b = "";
        }

        public NotificationText() {
            this(0);
        }
    }

    public CompositePaymentInfo() {
        this(0);
    }

    public CompositePaymentInfo(int i) {
        this.a = new NotificationText(0);
        this.b = "";
    }
}
