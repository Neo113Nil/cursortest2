package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.HashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes10.dex */
public final /* synthetic */ class k6d implements dms {
    public final /* synthetic */ int a;

    public /* synthetic */ k6d(int i) {
        this.a = i;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        int i3 = this.a;
        zy11 zy11Var = zy11.a;
        switch (i3) {
            case 0:
                lly0 lly0Var = (lly0) obj;
                aly0 aly0Var = (aly0) obj2;
                sls slsVar = (sls) obj3;
                fid fidVar = (fid) obj4;
                int intValue = ((Integer) obj5).intValue();
                l6d l6dVar = l6d.a;
                if ((intValue & 6) == 0) {
                    i = intValue | ((intValue & 8) == 0 ? ((bts) fidVar).k(lly0Var) : fidVar.e(lly0Var) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= (intValue & 64) == 0 ? ((bts) fidVar).k(aly0Var) : fidVar.e(aly0Var) ? 32 : 16;
                }
                if ((intValue & 384) == 0) {
                    i |= fidVar.e(slsVar) ? 256 : 128;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(i & 1, (i & 1171) != 1170)) {
                    btsVar.Y();
                    break;
                } else {
                    cmh.c(lly0Var, aly0Var, slsVar, btsVar, i & 1022);
                    break;
                }
            case 1:
                lly0 lly0Var2 = (lly0) obj;
                aly0 aly0Var2 = (aly0) obj2;
                sls slsVar2 = (sls) obj3;
                fid fidVar2 = (fid) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                l6d l6dVar2 = l6d.a;
                if ((intValue2 & 6) == 0) {
                    i2 = intValue2 | ((intValue2 & 8) == 0 ? ((bts) fidVar2).k(lly0Var2) : fidVar2.e(lly0Var2) ? 4 : 2);
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= (intValue2 & 64) == 0 ? ((bts) fidVar2).k(aly0Var2) : fidVar2.e(aly0Var2) ? 32 : 16;
                }
                if ((intValue2 & 384) == 0) {
                    i2 |= fidVar2.e(slsVar2) ? 256 : 128;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
                    btsVar2.Y();
                    break;
                } else {
                    cmh.c(lly0Var2, aly0Var2, slsVar2, btsVar2, i2 & 1022);
                    break;
                }
            case 2:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                asy0 asy0Var = (asy0) obj5;
                String obj6 = ((CharSequence) obj4).subSequence(asy0.f(asy0Var.a), asy0.e(asy0Var.a)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                break;
            case 3:
                kf00.d((kf00) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, 16);
                break;
            case 4:
                ((kf00) obj).e((String) obj2, (String) obj3, (String) obj4, null, (String) obj5);
                break;
            case 5:
                kf00 kf00Var = (kf00) obj;
                String str = (String) obj2;
                String str2 = (String) obj3;
                String str3 = (String) obj4;
                String str4 = (String) obj5;
                HashMap A = oyr.A(kf00Var);
                if (str != null) {
                    A.put("mode", str);
                }
                if (str2 != null) {
                    A.put(MetaDataField.SCREEN_FIELD, str2);
                }
                if (str3 != null) {
                    A.put("parking_id", str3);
                }
                if (str4 != null) {
                    A.put("provider", str4);
                }
                kf00Var.a.a("Map.ScooterParking.Shown", A, 1, new HashMap());
                break;
            default:
                ((kf00) obj).c((String) obj2, (String) obj3, (String) obj4, (String) obj5);
                break;
        }
        return zy11Var;
    }
}
