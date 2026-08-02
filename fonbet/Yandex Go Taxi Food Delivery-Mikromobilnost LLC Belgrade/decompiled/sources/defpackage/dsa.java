package defpackage;

import java.util.HashMap;

/* loaded from: classes12.dex */
public final /* synthetic */ class dsa implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ hsa b;

    public /* synthetic */ dsa(hsa hsaVar, int i) {
        this.a = i;
        this.b = hsaVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        hsa hsaVar = this.b;
        Integer num = (Integer) obj;
        num.getClass();
        switch (i) {
            case 0:
                em9 em9Var = hsaVar.G.a;
                em9Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("image_number", num);
                em9Var.a.a("Chargers.LocationCard.PhotoViewerScrolled", hashMap, 1, new HashMap());
                break;
            case 1:
                em9 em9Var2 = hsaVar.G.a;
                em9Var2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("image_number", num);
                em9Var2.a.a("Chargers.LocationCard.PhotoViewerClosed", hashMap2, 1, new HashMap());
                break;
            default:
                em9 em9Var3 = hsaVar.G.a;
                em9Var3.getClass();
                HashMap hashMap3 = new HashMap();
                hashMap3.put("image_number", num);
                em9Var3.a.a("Chargers.LocationCard.PhotosScrolled", hashMap3, 1, new HashMap());
                break;
        }
        return zy11Var;
    }
}
