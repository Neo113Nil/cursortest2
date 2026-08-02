package xsna;

import com.vk.stat.sak.scheme.SchemeStatSak$TypeDebugStatsItem;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class s03 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ s03(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                new x6l(new SchemeStatSak$TypeDebugStatsItem((String) obj, null, null, ((JSONObject) obj2).toString(), 6, null), false).q();
                return s3q0.a;
            case 1:
                return Boolean.valueOf(epx.f(obj, obj2));
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
        }
    }
}
