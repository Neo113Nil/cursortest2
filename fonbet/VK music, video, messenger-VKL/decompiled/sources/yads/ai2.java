package yads;

/* loaded from: classes10.dex */
public enum ai2 {
    d("TIMEOUT", "The request failed to load due to a timeout"),
    e("INVALID_CONFIGURATION", "The provided configuration is invalid"),
    f("EMPTY_MEDIATION_DATA", "No mediation data was received. Possibly, Client Bidding adapters are not connected"),
    g("INVALID_FETCHED_DATA", "The fetched data is invalid");

    public final int b;
    public final String c;

    ai2(String str, String str2) {
        this.b = r2;
        this.c = str2;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }
}
