package xsna;

import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.fullscreen.helper.PhoneValidationPendingEvent;
import com.vk.core.serialize.Serializer;
import com.vk.fullscreenvideo.design.view.top.TopControlsView;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.log.L;
import com.vk.newsfeed.impl.discover.repository.TemporaryCache;
import com.vk.posting.presentation.video.h;
import com.vk.voip.ui.qr.ui.a;
import java.util.ArrayList;
import java.util.List;
import xsna.sx40;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class t9o0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ t9o0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Serializer.c<TemporaryCache> cVar = TemporaryCache.CREATOR;
                L.i((Throwable) obj);
                return s3q0.a;
            case 1:
                return ((pno0) obj).d().toString();
            case 2:
                List list = (List) obj;
                return new x6p0(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
            case 3:
                int i = TopControlsView.p;
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((sx40) obj) instanceof sx40.t);
            case 5:
                return ((com.vk.video.ui.discovery.minimizable.q) obj).m;
            case 6:
                tj50.a aVar = (tj50.a) obj;
                h0u0 e = aVar.e(u2t0.b);
                v2t0 v2t0Var = v2t0.b;
                ao8 ao8Var = ao8.d;
                return new h.a(e, aVar.a(v2t0Var, ao8Var), aVar.a(w2t0.b, ao8Var));
            case 7:
                return Boolean.valueOf(((MsgFromChannel) obj).Nb());
            case 8:
                VkPhoneValidationCompleteResult.Public r0 = new VkPhoneValidationCompleteResult.Public((String) obj);
                ArrayList arrayList = w3a0.a;
                w3a0.c(new PhoneValidationPendingEvent.Success(r0));
                return s3q0.a;
            case 9:
                return a.C2071a.a;
            case 10:
                return Boolean.valueOf(brm0.B(((StackTraceElement) obj).getClassName(), "java.lang", false));
            default:
                return s3q0.a;
        }
    }
}
