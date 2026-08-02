package com.yandex.go.morphlex.network;

import defpackage.gsq0;
import defpackage.lwj0;
import defpackage.zn11;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/morphlex/network/MorphlexScenarioContextResponse;", "Llwj0;", "Companion", "$serializer", "com/yandex/go/morphlex/network/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MorphlexScenarioContextResponse extends lwj0 {
    public static final c Companion = new c();
    public final zn11 a;

    public /* synthetic */ MorphlexScenarioContextResponse(int i, zn11 zn11Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = zn11Var;
        }
    }

    @Override // defpackage.lwj0
    /* renamed from: e, reason: from getter */
    public final zn11 getA() {
        return this.a;
    }

    public MorphlexScenarioContextResponse() {
        this.a = null;
    }
}
