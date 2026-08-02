package defpackage;

/* loaded from: classes9.dex */
public final class o0j {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public o0j(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0j)) {
            return false;
        }
        o0j o0jVar = (o0j) obj;
        return this.a.equals(o0jVar.a) && this.b.equals(o0jVar.b) && this.c.equals(o0jVar.c) && this.d.equals(o0jVar.d);
    }

    public final int hashCode() {
        return ((((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31) - 226192458) * 31) + 1110476115;
    }

    public final String toString() {
        return g8e.r(b64.v("DestinationTitleConfig(travelTimeWithArrivalTime=", this.a, ", travelTimeTemplate=", this.b, ", missingTravelTimeTemplate="), this.c, ", loadingTemplate=", this.d, ", travelTimePlaceholder=$TRAVEL_TIME$, timePlaceholder=$TIME$)");
    }
}
