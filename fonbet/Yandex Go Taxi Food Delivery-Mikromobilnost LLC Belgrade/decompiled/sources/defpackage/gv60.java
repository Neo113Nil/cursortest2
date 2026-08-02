package defpackage;

import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes10.dex */
public final /* synthetic */ class gv60 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ gv60(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        float f = this.c;
        float f2 = this.b;
        v2w v2wVar = (v2w) obj;
        switch (i) {
            case 0:
                v2wVar.getClass();
                g131 g131Var = v2wVar.a;
                g131Var.b(RemoteBioParameters.X, new y7m(f2));
                g131Var.b(RemoteBioParameters.Y, new y7m(f));
                break;
            default:
                v2wVar.getClass();
                g131 g131Var2 = v2wVar.a;
                g131Var2.b("horizontal", new y7m(f2));
                g131Var2.b("vertical", new y7m(f));
                break;
        }
        return zy11Var;
    }
}
