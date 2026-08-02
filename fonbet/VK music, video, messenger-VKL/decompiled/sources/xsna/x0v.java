package xsna;

import com.vk.auth.ui.VkAuthExtendedEditText;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import xsna.n6v;
import xsna.p6v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class x0v implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x0v(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((io.reactivex.rxjava3.subjects.d) this.c).onNext(Boolean.TRUE);
                break;
            case 1:
                q6v q6vVar = (q6v) this.c;
                n6v.a aVar = (n6v.a) obj;
                if (aVar != null && !((ArrayList) aVar.a()).isEmpty()) {
                    com.vk.metrics.eventtracking.b.a.a(new Exception(go9.b("Hijacking apps found: ", j5g.g0(aVar.a(), StringUtils.PROCESS_POSTFIX_DELIMITER, null, null, 0, null, 62))));
                    p6v.a.a(q6vVar.b, aVar.c(), aVar.b(), aVar.a());
                    break;
                } else {
                    break;
                }
            default:
                VkAuthExtendedEditText vkAuthExtendedEditText = (VkAuthExtendedEditText) this.c;
                vkAuthExtendedEditText.a(vkAuthExtendedEditText.b.isFocused());
                break;
        }
        return s3q0.a;
    }
}
