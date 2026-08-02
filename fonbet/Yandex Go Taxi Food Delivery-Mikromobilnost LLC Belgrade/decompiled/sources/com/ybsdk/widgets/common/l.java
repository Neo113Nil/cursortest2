package com.ybsdk.widgets.common;

import com.ybsdk.widgets.common.OperationProgressView;
import defpackage.qc70;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class l extends qc70 {
    public final OperationProgressView.StatusIcon a;

    public l(OperationProgressView.StatusIcon statusIcon) {
        this.a = statusIcon;
    }

    public final OperationProgressView.StatusIcon a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.a == ((l) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Result(icon=" + this.a + Extension.C_BRAKE;
    }
}
