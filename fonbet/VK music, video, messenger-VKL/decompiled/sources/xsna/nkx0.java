package xsna;

import java.util.ArrayList;

/* compiled from: GamesAchievementBlockModel.kt */
/* loaded from: classes17.dex */
public final class nkx0 {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public nkx0(String str, ArrayList arrayList, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkx0)) {
            return false;
        }
        nkx0 nkx0Var = (nkx0) obj;
        return epx.f(this.a, nkx0Var.a) && this.b.equals(nkx0Var.b) && epx.f(this.c, nkx0Var.c) && epx.f(this.d, nkx0Var.d) && epx.f(this.e, nkx0Var.e) && epx.f(this.f, nkx0Var.f);
    }

    public final int hashCode() {
        int a = urd0.a(qr.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhatInsideModalInfoModel(title=");
        sb.append(this.a);
        sb.append(", gifts=");
        sb.append(this.b);
        sb.append(", closeButtonLabel=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", rulesText=");
        sb.append(this.e);
        sb.append(", rulesLink=");
        return ho8.a(sb, this.f, ')');
    }
}
