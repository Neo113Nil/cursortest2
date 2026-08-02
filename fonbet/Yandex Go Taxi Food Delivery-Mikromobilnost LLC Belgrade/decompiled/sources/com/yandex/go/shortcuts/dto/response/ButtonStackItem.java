package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.xx;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ButtonStackItem;", "Lcom/yandex/go/shortcuts/dto/response/r2;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/o", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public class ButtonStackItem extends r2 {
    public static final o Companion = new o();
    public final String a;
    public final Title b;
    public final com.yandex.go.dto.response.q1 c;

    public ButtonStackItem(int i, String str, Title title, com.yandex.go.dto.response.q1 q1Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new Title(0);
        } else {
            this.b = title;
        }
        if ((i & 4) == 0) {
            this.c = com.yandex.go.dto.response.e0.INSTANCE;
        } else {
            this.c = q1Var;
        }
    }

    public static final /* synthetic */ void x(ButtonStackItem buttonStackItem, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(buttonStackItem.getA(), "")) {
            yjdVar.o(serialDescriptor, 0, buttonStackItem.getA());
        }
        if (yjdVar.F() || !jl40.l(buttonStackItem.getB(), new Title(0))) {
            yjdVar.e(serialDescriptor, 1, Title$$serializer.INSTANCE, buttonStackItem.getB());
        }
        if (!yjdVar.F() && jl40.l(buttonStackItem.getC(), com.yandex.go.dto.response.e0.INSTANCE)) {
            return;
        }
        yjdVar.e(serialDescriptor, 2, xx.f, buttonStackItem.getC());
    }

    /* renamed from: getAction, reason: from getter */
    public com.yandex.go.dto.response.q1 getC() {
        return this.c;
    }

    /* renamed from: v, reason: from getter */
    public String getA() {
        return this.a;
    }

    /* renamed from: w, reason: from getter */
    public Title getB() {
        return this.b;
    }

    public ButtonStackItem(String str, Title title, com.yandex.go.dto.response.q1 q1Var) {
        this.a = str;
        this.b = title;
        this.c = q1Var;
    }

    public ButtonStackItem() {
        this("", new Title(0), com.yandex.go.dto.response.e0.INSTANCE);
    }
}
