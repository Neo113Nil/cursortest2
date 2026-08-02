package com.ybsdk.widgets.common;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.OperationProgressOverlayDialog;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oc70;
import defpackage.qc70;
import defpackage.rbv;

/* loaded from: classes3.dex */
public final class k {
    public static final k h = new k(oc70.a, null, OperationProgressOverlayDialog.TitleStyle.HEADLINE2, null, null, null, null);
    public final qc70 a;
    public final Text b;
    public final OperationProgressOverlayDialog.TitleStyle c;
    public final Text d;
    public final Text e;
    public final Text f;
    public final rbv g;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ k(defpackage.qc70 r9, com.ybsdk.core.utils.text.Text r10, com.ybsdk.widgets.common.OperationProgressOverlayDialog.TitleStyle r11, com.ybsdk.core.utils.text.Text r12, com.ybsdk.core.utils.text.Text r13, com.ybsdk.core.utils.text.Text r14, defpackage.rbv r15, int r16) {
        /*
            r8 = this;
            r0 = r16 & 4
            if (r0 == 0) goto L6
            com.ybsdk.widgets.common.OperationProgressOverlayDialog$TitleStyle r11 = com.ybsdk.widgets.common.OperationProgressOverlayDialog.TitleStyle.HEADLINE2
        L6:
            r3 = r11
            r11 = r16 & 8
            r0 = 0
            if (r11 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r12
        Lf:
            r11 = r16 & 16
            if (r11 == 0) goto L15
            r5 = r0
            goto L16
        L15:
            r5 = r13
        L16:
            r11 = r16 & 32
            if (r11 == 0) goto L1c
            r6 = r0
            goto L1d
        L1c:
            r6 = r14
        L1d:
            r11 = r16 & 64
            if (r11 == 0) goto L26
            r7 = r0
            r1 = r9
            r2 = r10
            r0 = r8
            goto L2a
        L26:
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
        L2a:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ybsdk.widgets.common.k.<init>(qc70, com.ybsdk.core.utils.text.Text, com.ybsdk.widgets.common.OperationProgressOverlayDialog$TitleStyle, com.ybsdk.core.utils.text.Text, com.ybsdk.core.utils.text.Text, com.ybsdk.core.utils.text.Text, rbv, int):void");
    }

    public final qc70 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return jl40.l(this.a, kVar.a) && jl40.l(this.b, kVar.b) && this.c == kVar.c && jl40.l(this.d, kVar.d) && jl40.l(this.e, kVar.e) && jl40.l(this.f, kVar.f) && jl40.l(this.g, kVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (text == null ? 0 : text.hashCode())) * 31)) * 31;
        Text text2 = this.d;
        int hashCode3 = (hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 31;
        Text text3 = this.e;
        int hashCode4 = (hashCode3 + (text3 == null ? 0 : text3.hashCode())) * 31;
        Text text4 = this.f;
        int hashCode5 = (hashCode4 + (text4 == null ? 0 : text4.hashCode())) * 31;
        rbv rbvVar = this.g;
        return Boolean.hashCode(false) + ((hashCode5 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(operationState=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", labelStyle=");
        sb.append(this.c);
        sb.append(", sublabel=");
        sb.append(this.d);
        sb.append(", actionButtonText=");
        ly3.C(sb, this.e, ", subActionButtonText=", this.f, ", subActionButtonImage=");
        sb.append(this.g);
        sb.append(", shouldSwitchActionButtonsPosition=false)");
        return sb.toString();
    }

    public k(qc70 qc70Var, Text text, OperationProgressOverlayDialog.TitleStyle titleStyle, Text text2, Text text3, Text text4, rbv rbvVar) {
        this.a = qc70Var;
        this.b = text;
        this.c = titleStyle;
        this.d = text2;
        this.e = text3;
        this.f = text4;
        this.g = rbvVar;
    }
}
