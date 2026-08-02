package com.yandex.go.due.data.api.dto;

import com.yandex.go.order.state.instructions.InstructionItemButton;
import com.yandex.go.order.state.instructions.ScheduledOrderItemAction;
import defpackage.gsq0;
import defpackage.x3w;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due/data/api/dto/AsapTimeBanner;", "Lx3w;", "Companion", "$serializer", "com/yandex/go/due/data/api/dto/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AsapTimeBanner implements x3w {
    public static final c Companion = new c();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ AsapTimeBanner(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
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
    }

    @Override // defpackage.x3w
    /* renamed from: a */
    public final InstructionItemButton getE() {
        return null;
    }

    @Override // defpackage.x3w
    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // defpackage.x3w
    /* renamed from: getAction */
    public final ScheduledOrderItemAction getF() {
        return null;
    }

    @Override // defpackage.x3w
    /* renamed from: getSubtitle, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // defpackage.x3w
    /* renamed from: getTitle, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public AsapTimeBanner() {
        this.a = "";
        this.b = "";
        this.c = "";
    }
}
