package com.yandex.div.core.view2.errors;

import com.yandex.div.R$drawable;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ErrorViewModel.kt */
/* loaded from: classes7.dex */
public final class ErrorViewModel {
    private final int errorCount;
    private final String errorDetails;
    private final boolean showDetails;
    private final int warningCount;
    private final String warningDetails;

    public ErrorViewModel() {
        this(false, 0, 0, null, null, 31, null);
    }

    public static /* synthetic */ ErrorViewModel copy$default(ErrorViewModel errorViewModel, boolean z, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = errorViewModel.showDetails;
        }
        if ((i3 & 2) != 0) {
            i = errorViewModel.errorCount;
        }
        if ((i3 & 4) != 0) {
            i2 = errorViewModel.warningCount;
        }
        if ((i3 & 8) != 0) {
            str = errorViewModel.errorDetails;
        }
        if ((i3 & 16) != 0) {
            str2 = errorViewModel.warningDetails;
        }
        String str3 = str2;
        int i4 = i2;
        return errorViewModel.copy(z, i, i4, str, str3);
    }

    public final ErrorViewModel copy(boolean z, int i, int i2, String str, String str2) {
        return new ErrorViewModel(z, i, i2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorViewModel)) {
            return false;
        }
        ErrorViewModel errorViewModel = (ErrorViewModel) obj;
        return this.showDetails == errorViewModel.showDetails && this.errorCount == errorViewModel.errorCount && this.warningCount == errorViewModel.warningCount && epx.f(this.errorDetails, errorViewModel.errorDetails) && epx.f(this.warningDetails, errorViewModel.warningDetails);
    }

    public final int getCounterBackground() {
        int i = this.warningCount;
        return (i <= 0 || this.errorCount <= 0) ? (i == 0 && this.errorCount == 0) ? R$drawable.neutral_counter_background : i > 0 ? R$drawable.warning_counter_background : R$drawable.error_counter_background : R$drawable.warning_error_counter_background;
    }

    public final String getCounterText() {
        int i = this.errorCount;
        if (i <= 0 || this.warningCount <= 0) {
            int i2 = this.warningCount;
            return i2 > 0 ? String.valueOf(i2) : i > 0 ? String.valueOf(i) : "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.errorCount);
        sb.append('/');
        sb.append(this.warningCount);
        return sb.toString();
    }

    public final String getDetails() {
        if (this.errorCount <= 0 || this.warningCount <= 0) {
            return this.warningCount > 0 ? this.warningDetails : this.errorDetails;
        }
        return this.errorDetails + "\n\n" + this.warningDetails;
    }

    public final boolean getShowDetails() {
        return this.showDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.showDetails;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.warningDetails.hashCode() + urd0.a(shy.a(this.warningCount, shy.a(this.errorCount, r0 * 31, 31), 31), 31, this.errorDetails);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ErrorViewModel(showDetails=");
        sb.append(this.showDetails);
        sb.append(", errorCount=");
        sb.append(this.errorCount);
        sb.append(", warningCount=");
        sb.append(this.warningCount);
        sb.append(", errorDetails=");
        sb.append(this.errorDetails);
        sb.append(", warningDetails=");
        return ho8.a(sb, this.warningDetails, ')');
    }

    public ErrorViewModel(boolean z, int i, int i2, String str, String str2) {
        this.showDetails = z;
        this.errorCount = i;
        this.warningCount = i2;
        this.errorDetails = str;
        this.warningDetails = str2;
    }

    public /* synthetic */ ErrorViewModel(boolean z, int i, int i2, String str, String str2, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2);
    }
}
