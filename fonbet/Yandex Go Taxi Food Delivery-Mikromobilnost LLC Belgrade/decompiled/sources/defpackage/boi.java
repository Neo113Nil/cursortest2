package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class boi {
    public final String a;
    public final sti b;
    public final tpr c;

    public boi(String str, sti stiVar, tpr tprVar) {
        this.a = str;
        this.b = stiVar;
        this.c = tprVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boi)) {
            return false;
        }
        boi boiVar = (boi) obj;
        return jl40.l(this.a, boiVar.a) && jl40.l(this.b, boiVar.b) && this.c.equals(boiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DeliverySddIntervalsArgs(tariffClass=" + this.a + ", intervalsListScreen=" + this.b + ", deliveryIntervalsFlow=" + this.c + Extension.C_BRAKE;
    }
}
