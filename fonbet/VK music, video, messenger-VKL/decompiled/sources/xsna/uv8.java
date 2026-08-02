package xsna;

import android.R;
import android.app.Activity;
import android.os.Handler;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class uv8 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ uv8(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                t6g0 t6g0Var = t6g0.b;
                t6g0.d().v(o25.a().c().b, booleanValue);
                return s3q0.a;
            case 1:
                Handler handler = x93.a;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                ucp ucpVar = ucp.a;
                if (b != null) {
                    ucp.f(b.findViewById(R.id.content));
                }
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((DeprecatedAttachActivity) obj).Y1());
            case 3:
                SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.XOWNER_STAT_INFO.h(), null, (String) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -6, 3, null);
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = schemeStat$TypeDevNullItem;
                l5mVar.q();
                return s3q0.a;
            default:
                asu0.a.getClass();
                return asu0.w();
        }
    }
}
