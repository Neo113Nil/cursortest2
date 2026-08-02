package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/DebtFlowNotification;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DebtFlowNotification {
    public static final n Companion = new n();
    public final DebtNotificationWindow a;

    public /* synthetic */ DebtFlowNotification(int i, DebtNotificationWindow debtNotificationWindow) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = debtNotificationWindow;
        }
    }

    /* renamed from: a, reason: from getter */
    public final DebtNotificationWindow getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DebtFlowNotification) && jl40.l(this.a, ((DebtFlowNotification) obj).a);
    }

    public final int hashCode() {
        DebtNotificationWindow debtNotificationWindow = this.a;
        if (debtNotificationWindow == null) {
            return 0;
        }
        return debtNotificationWindow.hashCode();
    }

    public final String toString() {
        return "DebtFlowNotification(window=" + this.a + Extension.C_BRAKE;
    }

    public DebtFlowNotification() {
        this.a = null;
    }
}
