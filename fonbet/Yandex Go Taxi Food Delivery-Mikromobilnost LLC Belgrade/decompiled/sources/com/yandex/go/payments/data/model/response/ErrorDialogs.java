package com.yandex.go.payments.data.model.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/ErrorDialogs;", "", "Companion", "ErrorDialog", "com/yandex/go/payments/data/model/response/i0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ErrorDialogs {
    public static final i0 Companion = new i0();
    public static final ErrorDialogs c;
    public final ErrorDialog a;
    public final ErrorDialog b;

    static {
        b bVar = ActionButton.Companion;
        c = new ErrorDialogs(0);
    }

    public ErrorDialogs(int i, ErrorDialog errorDialog, ErrorDialog errorDialog2) {
        if ((i & 1) == 0) {
            ErrorDialog.Companion.getClass();
            errorDialog = ErrorDialog.e;
        }
        this.a = errorDialog;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = errorDialog2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorDialogs)) {
            return false;
        }
        ErrorDialogs errorDialogs = (ErrorDialogs) obj;
        return jl40.l(this.a, errorDialogs.a) && jl40.l(this.b, errorDialogs.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ErrorDialog errorDialog = this.b;
        return hashCode + (errorDialog == null ? 0 : errorDialog.hashCode());
    }

    public final String toString() {
        return "ErrorDialogs(defaultError=" + this.a + ", openBankProblem=" + this.b + Extension.C_BRAKE;
    }

    public ErrorDialogs() {
        this(0);
    }

    public ErrorDialogs(int i) {
        ErrorDialog.Companion.getClass();
        this.a = ErrorDialog.e;
        this.b = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/ErrorDialogs$ErrorDialog;", "", "Companion", "com/yandex/go/payments/data/model/response/j0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ErrorDialog {
        public static final j0 Companion = new j0();
        public static final ErrorDialog e;
        public final String a;
        public final String b;
        public final String c;
        public final ActionButton d;

        static {
            b bVar = ActionButton.Companion;
            e = new ErrorDialog(0);
        }

        public ErrorDialog(int i, String str, String str2, String str3, ActionButton actionButton) {
            this.a = (i & 1) == 0 ? null : str;
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
            if ((i & 8) != 0) {
                this.d = actionButton;
            } else {
                ActionButton.Companion.getClass();
                this.d = ActionButton.d;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorDialog)) {
                return false;
            }
            ErrorDialog errorDialog = (ErrorDialog) obj;
            return jl40.l(this.a, errorDialog.a) && jl40.l(this.b, errorDialog.b) && jl40.l(this.c, errorDialog.c) && jl40.l(this.d, errorDialog.d);
        }

        public final int hashCode() {
            String str = this.a;
            return this.d.hashCode() + unr0.b(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder v = b64.v("ErrorDialog(iconTag=", this.a, ", title=", this.b, ", descriptions=");
            v.append(this.c);
            v.append(", mainButton=");
            v.append(this.d);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public ErrorDialog() {
            this(0);
        }

        public ErrorDialog(int i) {
            ActionButton.Companion.getClass();
            ActionButton actionButton = ActionButton.d;
            this.a = null;
            this.b = "";
            this.c = "";
            this.d = actionButton;
        }
    }
}
