package defpackage;

/* loaded from: classes8.dex */
public final class o8g implements xvf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p8g b;

    public /* synthetic */ o8g(p8g p8gVar, int i) {
        this.a = i;
        this.b = p8gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        p8g p8gVar = this.b;
        switch (i) {
            case 0:
                return new j0g(p8gVar.b, p8gVar.c);
            case 1:
                return new y7g(p8gVar.b, p8gVar.c);
            case 2:
                return new z7g(p8gVar.b, p8gVar.c);
            case 3:
                return new q8g(p8gVar.b, p8gVar.c);
            case 4:
                return new u8g(p8gVar.b, p8gVar.c);
            case 5:
                return new a9g(p8gVar.b, p8gVar.c);
            case 6:
                return new i8g(p8gVar.b, p8gVar.c);
            case 7:
                return new r501(16, p8gVar.b, p8gVar.c);
            default:
                return new x7g(p8gVar.b, p8gVar.c);
        }
    }
}
