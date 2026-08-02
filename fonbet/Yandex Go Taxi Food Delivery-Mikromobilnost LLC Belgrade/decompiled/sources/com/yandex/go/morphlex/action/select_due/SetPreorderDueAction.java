package com.yandex.go.morphlex.action.select_due;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.kr;
import defpackage.oyr;
import defpackage.vfc;
import java.util.Calendar;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/morphlex/action/select_due/SetPreorderDueAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/morphlex/action/select_due/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SetPreorderDueAction extends kr {
    public static final a Companion = new a();
    public final Calendar a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Boolean e;
    public final String f;
    public final String g;

    public /* synthetic */ SetPreorderDueAction(int i, Calendar calendar, String str, String str2, Integer num, Boolean bool, String str3, String str4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = calendar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetPreorderDueAction)) {
            return false;
        }
        SetPreorderDueAction setPreorderDueAction = (SetPreorderDueAction) obj;
        return jl40.l(this.a, setPreorderDueAction.a) && jl40.l(this.b, setPreorderDueAction.b) && jl40.l(this.c, setPreorderDueAction.c) && jl40.l(this.d, setPreorderDueAction.d) && jl40.l(this.e, setPreorderDueAction.e) && jl40.l(this.f, setPreorderDueAction.f) && jl40.l(this.g, setPreorderDueAction.g);
    }

    public final int hashCode() {
        Calendar calendar = this.a;
        int hashCode = (calendar == null ? 0 : calendar.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetPreorderDueAction(due=");
        sb.append(this.a);
        sb.append(", preorderCalculationId=");
        sb.append(this.b);
        sb.append(", preorderRequestId=");
        vfc.w(this.d, this.c, ", duePrecisionMinutes=", ", forceSoonOrder=", sb);
        sb.append(this.e);
        sb.append(", tariffClassOverride=");
        sb.append(this.f);
        sb.append(", verticalIdOverride=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }

    public SetPreorderDueAction() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
