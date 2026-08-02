package com.yandex.go.zone.dto.objects;

import defpackage.bhw0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SurgeBalanceContent;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/u5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SurgeBalanceContent {
    public static final u5 Companion = new u5();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(5)), null};
    public final List a;
    public final SurgeBalanceContentInfo b;

    public /* synthetic */ SurgeBalanceContent(int i, List list, SurgeBalanceContentInfo surgeBalanceContentInfo) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = new SurgeBalanceContentInfo(0);
        } else {
            this.b = surgeBalanceContentInfo;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurgeBalanceContent)) {
            return false;
        }
        SurgeBalanceContent surgeBalanceContent = (SurgeBalanceContent) obj;
        return jl40.l(this.a, surgeBalanceContent.a) && jl40.l(this.b, surgeBalanceContent.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SurgeBalanceContent(additionalIcons=" + this.a + ", info=" + this.b + Extension.C_BRAKE;
    }

    public SurgeBalanceContent() {
        this(0);
    }

    public SurgeBalanceContent(int i) {
        SurgeBalanceContentInfo surgeBalanceContentInfo = new SurgeBalanceContentInfo(0);
        this.a = EmptyList.a;
        this.b = surgeBalanceContentInfo;
    }
}
