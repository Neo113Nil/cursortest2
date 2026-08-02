package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public final /* synthetic */ class nx7 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List w;
    public final /* synthetic */ Map x;

    public /* synthetic */ nx7(List list, String str, List list2, Map map, int i) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.w = list2;
        this.x = map;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ip70 ip70Var = (ip70) obj;
                String str = this.c;
                if (str == null) {
                    str = "";
                }
                ip70Var.n1(str, this.b, this.w, this.x);
                break;
            default:
                ((ox7) obj).a.r(new nx7(this.b, this.c, this.w, this.x, 0));
                break;
        }
        return zy11Var;
    }
}
