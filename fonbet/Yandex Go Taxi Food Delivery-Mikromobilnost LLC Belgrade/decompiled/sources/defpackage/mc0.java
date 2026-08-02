package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.messaging.ui.settings.folder.addChat.g;
import java.util.List;

/* loaded from: classes11.dex */
public final /* synthetic */ class mc0 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ mc0(f530 f530Var, rz20 rz20Var, gz20 gz20Var, v2o v2oVar, ymo ymoVar, boolean z, boolean z2, zls zlsVar, a aVar, int i, int i2) {
        this.b = f530Var;
        this.z = rz20Var;
        this.A = gz20Var;
        this.B = v2oVar;
        this.C = ymoVar;
        this.c = z;
        this.w = z2;
        this.D = zlsVar;
        this.E = aVar;
        this.x = i;
        this.y = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        Object obj6 = this.B;
        Object obj7 = this.A;
        Object obj8 = this.z;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(this.y | 1);
                g.e((String) obj8, (tls) obj7, (List) obj4, (tls) obj6, (tls) obj5, (pa90) obj3, this.x, this.c, this.w, this.b, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(this.x | 1);
                cx20.a(this.b, (rz20) obj8, (gz20) obj7, (v2o) obj6, (ymo) obj5, this.c, this.w, (zls) obj4, (a) obj3, (fid) obj, O2, this.y);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ mc0(String str, tls tlsVar, List list, tls tlsVar2, tls tlsVar3, pa90 pa90Var, int i, boolean z, boolean z2, f530 f530Var, int i2) {
        this.z = str;
        this.A = tlsVar;
        this.D = list;
        this.B = tlsVar2;
        this.C = tlsVar3;
        this.E = pa90Var;
        this.x = i;
        this.c = z;
        this.w = z2;
        this.b = f530Var;
        this.y = i2;
    }
}
