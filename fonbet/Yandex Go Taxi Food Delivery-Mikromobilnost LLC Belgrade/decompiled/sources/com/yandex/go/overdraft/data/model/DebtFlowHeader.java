package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.ief;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/DebtFlowHeader;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DebtFlowHeader {
    public static final l Companion = new l();
    public final DebtFlowHeaderText a;
    public final DebtFlowHeaderText b;
    public final String c;
    public final boolean d;
    public final t0 e;
    public final ief f;
    public final LoadingNextStepHeader g;

    public /* synthetic */ DebtFlowHeader(int i, DebtFlowHeaderText debtFlowHeaderText, DebtFlowHeaderText debtFlowHeaderText2, String str, boolean z, t0 t0Var, ief iefVar, LoadingNextStepHeader loadingNextStepHeader) {
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
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = s0.INSTANCE;
        } else {
            this.e = t0Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = iefVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = loadingNextStepHeader;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebtFlowHeader)) {
            return false;
        }
        DebtFlowHeader debtFlowHeader = (DebtFlowHeader) obj;
        return jl40.l(this.a, debtFlowHeader.a) && jl40.l(this.b, debtFlowHeader.b) && jl40.l(this.c, debtFlowHeader.c) && this.d == debtFlowHeader.d && jl40.l(this.e, debtFlowHeader.e) && jl40.l(this.f, debtFlowHeader.f) && jl40.l(this.g, debtFlowHeader.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        DebtFlowHeaderText debtFlowHeaderText = this.b;
        int hashCode2 = (this.e.hashCode() + unr0.e(unr0.b((hashCode + (debtFlowHeaderText == null ? 0 : debtFlowHeaderText.hashCode())) * 31, 31, this.c), 31, this.d)) * 31;
        ief iefVar = this.f;
        int hashCode3 = (hashCode2 + (iefVar == null ? 0 : iefVar.hashCode())) * 31;
        LoadingNextStepHeader loadingNextStepHeader = this.g;
        return hashCode3 + (loadingNextStepHeader != null ? loadingNextStepHeader.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebtFlowHeader(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        tse0.y(this.c, ", isLoading=", ", tapAction=", sb, this.d);
        sb.append(this.e);
        sb.append(", currencyRulesDto=");
        sb.append(this.f);
        sb.append(", loadingNextStepHeader=");
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public DebtFlowHeader() {
        DebtFlowHeaderText.Companion.getClass();
        s0 s0Var = s0.INSTANCE;
        this.a = DebtFlowHeaderText.c;
        this.b = null;
        this.c = "";
        this.d = false;
        this.e = s0Var;
        this.f = null;
        this.g = null;
    }
}
