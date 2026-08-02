package xsna;

import org.json.JSONArray;

/* compiled from: HttpResponse.java */
/* loaded from: classes13.dex */
public final class nkv {
    public final /* synthetic */ int a = 1;
    public int b;
    public Object c;

    public /* synthetic */ nkv() {
    }

    public String a() {
        return (String) this.c;
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b + "; " + ((JSONArray) this.c);
            default:
                return super.toString();
        }
    }

    public nkv(int i, String str) {
        this.b = i;
        this.c = str;
    }
}
