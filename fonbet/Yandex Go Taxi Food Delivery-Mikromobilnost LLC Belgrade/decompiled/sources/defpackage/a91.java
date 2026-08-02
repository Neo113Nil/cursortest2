package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class a91 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ String c;

    public /* synthetic */ a91(String str, tls tlsVar) {
        this.a = 8;
        this.c = str;
        this.b = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new n21(str));
                break;
            case 1:
                tlsVar.invoke(str);
                break;
            case 2:
                tlsVar.invoke(new or5(str));
                break;
            case 3:
                tlsVar.invoke(new qr5(str));
                break;
            case 4:
                tlsVar.invoke(new rr5(str));
                break;
            case 5:
                tlsVar.invoke(new z9a(str));
                break;
            case 6:
                tlsVar.invoke(str);
                break;
            case 7:
                tlsVar.invoke(str);
                break;
            case 8:
                if (str != null) {
                    tlsVar.invoke(new f940(str));
                    break;
                }
                break;
            case 9:
                tlsVar.invoke(str);
                break;
            case 10:
                tlsVar.invoke(new d940(str));
                break;
            case 11:
                tlsVar.invoke(str);
                break;
            case 12:
                tlsVar.invoke(new ebe0(str));
                break;
            case 13:
                tlsVar.invoke(new xwl0(str));
                break;
            case 14:
                tlsVar.invoke(new nzo0(str));
                break;
            default:
                tlsVar.invoke(new x911(str));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ a91(tls tlsVar, String str, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = str;
    }
}
