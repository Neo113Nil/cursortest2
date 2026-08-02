package xsna;

import xsna.cbv0;

/* compiled from: VkPayCheckoutEndpointRouter.kt */
/* loaded from: classes6.dex */
public final class ibv0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public ibv0(cbv0.a aVar) {
        String str = aVar.b;
        String str2 = aVar.a;
        this.a = zr.a("https://", str, "/vksdk/v1/devtools/signmrch");
        this.b = zr.a("https://", str2, "/pin_check_code");
        this.c = zr.a("https://", str2, "/transaction_status");
        this.d = zr.a("https://", str2, "/init");
        this.e = zr.a("https://", str2, "/bind_delete");
        this.f = zr.a("https://", str2, "/pin_set");
        this.g = zr.a("https://", str2, "/pay");
        this.h = zr.a("https://", str2, "/pin_forgot");
        this.i = zr.a("https://", str2, "/token_create");
        this.j = zr.a("https://", str2, "/wallet_create");
    }
}
