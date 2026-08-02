package defpackage;

import android.net.Uri;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;
import com.yandex.messaging.core.db.AppDatabaseRoom;
import com.yandex.messaging.core.db.AppDatabaseRoom_Impl;

/* loaded from: classes15.dex */
public final /* synthetic */ class gdf0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ gdf0(Uri uri) {
        this.a = 20;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).D();
            case 1:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).d0();
            case 2:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).p0();
            case 3:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).q();
            case 4:
                return ((AppDatabaseRoom) obj).e();
            case 5:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).w();
            case 6:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).g();
            case 7:
                ((AppDatabaseRoom) obj).flush();
                return zy11Var;
            case 8:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).l();
            case 9:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).r();
            case 10:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).V();
            case 11:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).f0();
            case 12:
                wkx wkxVar = (wkx) obj;
                wkxVar.a = 1332;
                wkxVar.a(0, Float.valueOf(0.0f)).b = cjf0.a;
                wkxVar.a(666, Float.valueOf(290.0f));
                return zy11Var;
            case 13:
                wkx wkxVar2 = (wkx) obj;
                wkxVar2.a = 1332;
                wkxVar2.a(666, Float.valueOf(0.0f)).b = cjf0.a;
                wkxVar2.a(wkxVar2.a, Float.valueOf(290.0f));
                return zy11Var;
            case 14:
                ldf ldfVar = cjf0.a;
                return zy11Var;
            case 15:
                cif0 cif0Var = cif0.c;
                kgx[] kgxVarArr = f.a;
                g gVar = d.c;
                kgx kgxVar = f.a[1];
                ((mnq0) obj).a(gVar, cif0Var);
                return zy11Var;
            case 16:
                ((prf0) obj).B();
                return zy11Var;
            case 17:
                ((prf0) obj).j0();
                return zy11Var;
            case 18:
                ((prf0) obj).j0();
                return zy11Var;
            case 19:
                ((prf0) obj).B();
                return zy11Var;
            case 20:
                ((prf0) obj).j0();
                return zy11Var;
            case 21:
                ((prf0) obj).B();
                return zy11Var;
            case 22:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 23:
                rev revVar = rev.o;
                return new pbv((dcv) null, (dcv) new ccv(iyg0.ybsdk_ic_merchant_logo_placeholder), (tev) revVar, (vfv) h2b1.G, (String) obj, false);
            case 24:
                return new pbv((String) obj, (ccv) null, rev.j, (dcv) null, (vfv) null, 58);
            case 25:
                return new pbv((String) obj, (ccv) null, rev.e, (dcv) null, (vfv) null, 58);
            case 26:
                return new pbv((String) obj, new ccv(txg0.ybsdk_ic_bank_placeholder_without_background), rev.k, new ccv(txg0.ybsdk_ic_bank_placeholder_without_background), (vfv) null, 48);
            case 27:
                return qca1.b((h9g0) obj);
            case 28:
                return qca1.c((h9g0) obj);
            default:
                rev revVar2 = rev.o;
                return new pbv((dcv) null, (dcv) new ccv(iyg0.ybsdk_ic_merchant_logo_placeholder), (tev) revVar2, (vfv) h2b1.G, (String) obj, false);
        }
    }

    public /* synthetic */ gdf0(int i) {
        this.a = i;
    }
}
