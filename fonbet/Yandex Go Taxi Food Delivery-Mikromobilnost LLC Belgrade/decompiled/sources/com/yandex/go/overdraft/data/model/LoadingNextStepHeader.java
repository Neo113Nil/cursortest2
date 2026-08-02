package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/LoadingNextStepHeader;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LoadingNextStepHeader {
    public static final u Companion = new u();
    public final DebtFlowHeaderText a;
    public final DebtFlowHeaderText b;
    public final String c;

    public LoadingNextStepHeader(int i, DebtFlowHeaderText debtFlowHeaderText, DebtFlowHeaderText debtFlowHeaderText2, String str) {
        if ((i & 1) == 0) {
            DebtFlowHeaderText.Companion.getClass();
            debtFlowHeaderText = DebtFlowHeaderText.c;
        }
        this.a = debtFlowHeaderText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = debtFlowHeaderText2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final DebtFlowHeaderText getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final DebtFlowHeaderText getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingNextStepHeader)) {
            return false;
        }
        LoadingNextStepHeader loadingNextStepHeader = (LoadingNextStepHeader) obj;
        return jl40.l(this.a, loadingNextStepHeader.a) && jl40.l(this.b, loadingNextStepHeader.b) && jl40.l(this.c, loadingNextStepHeader.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        DebtFlowHeaderText debtFlowHeaderText = this.b;
        return this.c.hashCode() + ((hashCode + (debtFlowHeaderText == null ? 0 : debtFlowHeaderText.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadingNextStepHeader(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public LoadingNextStepHeader() {
        DebtFlowHeaderText.Companion.getClass();
        this.a = DebtFlowHeaderText.c;
        this.b = null;
        this.c = "";
    }
}
