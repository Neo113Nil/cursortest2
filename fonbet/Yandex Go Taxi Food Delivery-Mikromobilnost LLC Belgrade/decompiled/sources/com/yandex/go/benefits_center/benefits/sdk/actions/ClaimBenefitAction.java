package com.yandex.go.benefits_center.benefits.sdk.actions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kr;
import defpackage.qje;
import defpackage.y99;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/benefits_center/benefits/sdk/actions/ClaimBenefitAction;", "Lcom/yandex/go/benefits_center/benefits/sdk/actions/c;", "Companion", "$serializer", "com/yandex/go/benefits_center/benefits/sdk/actions/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClaimBenefitAction extends c {
    public static final d Companion = new d();
    public static final i3y[] f = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y99(12))};
    public final String b;
    public final String c;
    public final String d;
    public final kr e;

    public /* synthetic */ ClaimBenefitAction(int i, String str, String str2, String str3, kr krVar) {
        if (8 != (i & 8)) {
            qje.Z(i, 8, ClaimBenefitAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        this.e = krVar;
    }
}
