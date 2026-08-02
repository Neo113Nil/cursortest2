package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachGift;
import com.vk.log.L;
import com.vk.traceprofiler.TraceProfilerServiceImpl;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.history.friends.ui.b;
import org.json.JSONObject;
import xsna.h6x0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ygm0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ygm0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Can't get cached excluded users", (Throwable) obj));
                return s3q0.a;
            case 1:
                return ((CharSequence) obj).toString();
            case 2:
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                qgo0 qgo0Var = (qgo0) obj;
                Integer d = qgo0Var.d();
                if (d == null) {
                    return null;
                }
                int intValue = d.intValue();
                long j = qgo0Var.f;
                int i = qko0.c;
                return new ivl(((int) (j & 4294967295L)) - intValue, 0);
            case 4:
                Throwable th = (Throwable) obj;
                int i2 = TraceProfilerServiceImpl.d;
                com.vk.traceprofiler.a.a.a();
                vtc0 vtc0Var = com.vk.traceprofiler.a.g;
                if (vtc0Var != null) {
                    vtc0Var.invoke(th);
                }
                return s3q0.a;
            case 5:
                return ((fgp0) obj).f;
            case 6:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -1, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
            case 7:
                return Integer.valueOf((int) ((sq2) obj).a);
            case 8:
                return s3q0.a;
            case 9:
                return Boolean.valueOf(((it80) obj).a != 0);
            case 10:
                return new b.C2060b(((tj50.a) obj).a(tpw0.b, ao8.d));
            case 11:
                return h6x0.f.a;
            case 12:
                return ((JSONObject) obj).getJSONObject("response");
            default:
                Attach attach = (Attach) obj;
                return Boolean.valueOf((attach instanceof AttachGift) && ((AttachGift) attach).e());
        }
    }
}
