package com.ybsdk.feature.qr.payments.internal.screens.presentation.view;

import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.OperationStatusView;
import com.ybsdk.widgets.common.OperationProgressView;
import defpackage.rbv;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a {
    public final rbv a;
    public final OperationStatusView.Status b;
    public final OperationProgressView.StatusIcon c;

    public a(rbv rbvVar, OperationStatusView.Status status, OperationProgressView.StatusIcon statusIcon) {
        this.a = rbvVar;
        this.b = status;
        this.c = statusIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        OperationProgressView.StatusIcon statusIcon = this.c;
        return hashCode + (statusIcon == null ? 0 : statusIcon.hashCode());
    }

    public final String toString() {
        return "State(icon=" + this.a + ", operationStatus=" + this.b + ", statusIcon=" + this.c + Extension.C_BRAKE;
    }
}
