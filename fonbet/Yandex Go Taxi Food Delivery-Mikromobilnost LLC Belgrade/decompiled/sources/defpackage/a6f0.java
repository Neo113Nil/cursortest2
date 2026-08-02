package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.yandex.messaging.core.db.AppDatabaseRoom;
import com.yandex.messaging.core.db.AppDatabaseRoom_Impl;
import com.ybsdk.feature.main.internal.widgets.ProductCardListView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class a6f0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ a6f0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onProductClickListener$lambda$1;
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                for (int i = 0; i < size; i++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            case 1:
                onProductClickListener$lambda$1 = ProductCardListView.onProductClickListener$lambda$1((n7f0) obj);
                return onProductClickListener$lambda$1;
            case 2:
                ((Boolean) obj).getClass();
                int i2 = p9f0.O;
                return zy11.a;
            case 3:
                return new pbv((String) obj, (ccv) null, rev.e, (dcv) null, (vfv) null, 58);
            case 4:
                return new pbv((String) obj, (ccv) null, rev.e, (dcv) null, (vfv) null, 58);
            case 5:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).c();
            case 6:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).j();
            case 7:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).m();
            case 8:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).b0();
            case 9:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).a();
            case 10:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).e0();
            case 11:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).A();
            case 12:
                return Long.valueOf(((AppDatabaseRoom) obj).i());
            case 13:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).n0();
            case 14:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).n();
            case 15:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).l0();
            case 16:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).y();
            case 17:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).W();
            case 18:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).X();
            case 19:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).O();
            case 20:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).s();
            case 21:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).H();
            case 22:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).Q();
            case 23:
                return ((AppDatabaseRoom) obj).S0();
            case 24:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).p();
            case 25:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).I();
            case 26:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).f();
            case 27:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).h();
            case 28:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).k();
            default:
                return ((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).N();
        }
    }
}
