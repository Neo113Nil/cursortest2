package xsna;

import android.graphics.Bitmap;
import com.vk.core.util.TrafficSaverInfo;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import xsna.sr10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class rr10 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rr10(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        switch (this.b) {
            case 0:
                TrafficSaverInfo trafficSaverInfo = (TrafficSaverInfo) this.c;
                sr10 sr10Var = (sr10) this.d;
                int i = sr10.b.$EnumSwitchMapping$0[trafficSaverInfo.ordinal()];
                if (i == 1) {
                    str = "last_shown_disable_traffic_saver_pref";
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "last_shown_enable_traffic_saver_pref";
                }
                sr10Var.b().edit().putLong(str, System.currentTimeMillis()).apply();
                return s3q0.a;
            default:
                hs50 hs50Var = (hs50) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                zmk zmkVar = hs50Var.a0;
                if (zmkVar == null) {
                    return null;
                }
                zmkVar.d(bitmap);
                return s3q0.a;
        }
    }
}
