package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.rsf;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/DebtFlow;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DebtFlow {
    public static final k Companion = new k();
    public static final i3y[] h = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rsf(14)), null, null, null};
    public final DebtFlowHeader a;
    public final e b;
    public final DebtFlowNotification c;
    public final List d;
    public final DebtInfo e;
    public final CvvInfo f;
    public final OverdraftDto g;

    public /* synthetic */ DebtFlow(int i, DebtFlowHeader debtFlowHeader, e eVar, DebtFlowNotification debtFlowNotification, List list, DebtInfo debtInfo, CvvInfo cvvInfo, OverdraftDto overdraftDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = debtFlowHeader;
        }
        if ((i & 2) == 0) {
            this.b = d.INSTANCE;
        } else {
            this.b = eVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = debtFlowNotification;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = debtInfo;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = cvvInfo;
        }
        if ((i & 64) != 0) {
            this.g = overdraftDto;
        } else {
            OverdraftDto.Companion.getClass();
            this.g = OverdraftDto.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebtFlow)) {
            return false;
        }
        DebtFlow debtFlow = (DebtFlow) obj;
        return jl40.l(this.a, debtFlow.a) && jl40.l(this.b, debtFlow.b) && jl40.l(this.c, debtFlow.c) && jl40.l(this.d, debtFlow.d) && jl40.l(this.e, debtFlow.e) && jl40.l(this.f, debtFlow.f) && jl40.l(this.g, debtFlow.g);
    }

    public final int hashCode() {
        DebtFlowHeader debtFlowHeader = this.a;
        int hashCode = (this.b.hashCode() + ((debtFlowHeader == null ? 0 : debtFlowHeader.hashCode()) * 31)) * 31;
        DebtFlowNotification debtFlowNotification = this.c;
        int c = unr0.c((hashCode + (debtFlowNotification == null ? 0 : debtFlowNotification.hashCode())) * 31, 31, this.d);
        DebtInfo debtInfo = this.e;
        int hashCode2 = (c + (debtInfo == null ? 0 : debtInfo.hashCode())) * 31;
        CvvInfo cvvInfo = this.f;
        return this.g.hashCode() + ((hashCode2 + (cvvInfo != null ? cvvInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebtFlow(header=" + this.a + ", autoAction=" + this.b + ", notification=" + this.c + ", topNotification=" + this.d + ", debtInfo=" + this.e + ", cvvInfo=" + this.f + ", overdraft=" + this.g + Extension.C_BRAKE;
    }

    public DebtFlow() {
        d dVar = d.INSTANCE;
        OverdraftDto.Companion.getClass();
        this.a = null;
        this.b = dVar;
        this.c = null;
        this.d = EmptyList.a;
        this.e = null;
        this.f = null;
        this.g = OverdraftDto.b;
    }
}
