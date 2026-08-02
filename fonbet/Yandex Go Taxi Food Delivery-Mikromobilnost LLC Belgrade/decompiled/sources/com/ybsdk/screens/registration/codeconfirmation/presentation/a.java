package com.ybsdk.screens.registration.codeconfirmation.presentation;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.u8j0;
import defpackage.unr0;
import defpackage.ws51;
import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class a {
    public final CodeConfirmationParams.HeaderText a;
    public final Text b;
    public final CodeConfirmationParams.HeaderImage c;
    public final u8j0 d;
    public final long e;
    public final long f;
    public final int g;
    public final u8j0 h;
    public final String i;
    public final ws51 j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final CodeConfirmationViewState$CodeState n;

    public a(CodeConfirmationParams.HeaderText headerText, Text text, CodeConfirmationParams.HeaderImage headerImage, u8j0 u8j0Var, long j, long j2, int i, u8j0 u8j0Var2, String str, ws51 ws51Var, boolean z, boolean z2, boolean z3, CodeConfirmationViewState$CodeState codeConfirmationViewState$CodeState) {
        this.a = headerText;
        this.b = text;
        this.c = headerImage;
        this.d = u8j0Var;
        this.e = j;
        this.f = j2;
        this.g = i;
        this.h = u8j0Var2;
        this.i = str;
        this.j = ws51Var;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = codeConfirmationViewState$CodeState;
    }

    public static a a(a aVar, u8j0 u8j0Var, long j, long j2, int i, u8j0 u8j0Var2, String str, ws51 ws51Var, boolean z, CodeConfirmationViewState$CodeState codeConfirmationViewState$CodeState, int i2) {
        CodeConfirmationParams.HeaderText headerText = aVar.a;
        Text text = aVar.b;
        CodeConfirmationParams.HeaderImage headerImage = aVar.c;
        u8j0 u8j0Var3 = (i2 & 8) != 0 ? aVar.d : u8j0Var;
        long j3 = (i2 & 16) != 0 ? aVar.e : j;
        long j4 = (i2 & 32) != 0 ? aVar.f : j2;
        int i3 = (i2 & 64) != 0 ? aVar.g : i;
        u8j0 u8j0Var4 = (i2 & 128) != 0 ? aVar.h : u8j0Var2;
        String str2 = (i2 & 256) != 0 ? aVar.i : str;
        ws51 ws51Var2 = (i2 & 512) != 0 ? aVar.j : ws51Var;
        boolean z2 = aVar.k;
        u8j0 u8j0Var5 = u8j0Var3;
        long j5 = j3;
        long j6 = j4;
        int i4 = i3;
        u8j0 u8j0Var6 = u8j0Var4;
        String str3 = str2;
        ws51 ws51Var3 = ws51Var2;
        boolean z3 = aVar.l;
        boolean z4 = (i2 & 4096) != 0 ? aVar.m : z;
        CodeConfirmationViewState$CodeState codeConfirmationViewState$CodeState2 = (i2 & 8192) != 0 ? aVar.n : codeConfirmationViewState$CodeState;
        aVar.getClass();
        return new a(headerText, text, headerImage, u8j0Var5, j5, j6, i4, u8j0Var6, str3, ws51Var3, z2, z3, z4, codeConfirmationViewState$CodeState2);
    }

    public final boolean b() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && this.d.equals(aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && jl40.l(this.h, aVar.h) && this.i.equals(aVar.i) && jl40.l(this.j, aVar.j) && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        CodeConfirmationParams.HeaderImage headerImage = this.c;
        int b = oyr.b(this.g, qv10.c(qv10.c((this.d.hashCode() + ((hashCode2 + (headerImage == null ? 0 : headerImage.hashCode())) * 31)) * 31, 31, this.e), 31, this.f), 31);
        u8j0 u8j0Var = this.h;
        int b2 = unr0.b((b + (u8j0Var == null ? 0 : u8j0Var.hashCode())) * 31, 31, this.i);
        ws51 ws51Var = this.j;
        return this.n.hashCode() + unr0.e(unr0.e(unr0.e((b2 + (ws51Var != null ? ws51Var.hashCode() : 0)) * 31, 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodeConfirmationState(header=");
        sb.append(this.a);
        sb.append(", headerSubtitle=");
        sb.append(this.b);
        sb.append(", headerImage=");
        sb.append(this.c);
        sb.append(", otpRequestEntity=");
        sb.append(this.d);
        sb.append(", lastOtpRequestTime=");
        sb.append(this.e);
        x4e.A(this.f, ", currentTime=", ", attemptNumber=", sb);
        sb.append(this.g);
        sb.append(", codeValidation=");
        sb.append(this.h);
        sb.append(", currentCode=");
        sb.append(this.i);
        sb.append(", userInfo=");
        sb.append(this.j);
        sb.append(", avatarSignOut=");
        nnm.v(", signOutEnabled=", ", noAttemptsLeft=", sb, this.k, this.l);
        sb.append(this.m);
        sb.append(", codeStatus=");
        sb.append(this.n);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
