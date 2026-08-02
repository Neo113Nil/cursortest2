package xsna;

import com.vk.superapp.api.dto.widgets.actions.WebSubscribeExtra;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class pqe0 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pqe0(com.vk.profile.questions.impl.h hVar, boolean z) {
        this.d = hVar;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.profile.questions.impl.h hVar = (com.vk.profile.questions.impl.h) this.d;
                Pair pair = (Pair) obj;
                int intValue = ((Number) pair.d()).intValue();
                List list = (List) pair.g();
                hVar.i = intValue;
                ArrayList arrayList = hVar.h;
                if (this.c) {
                    arrayList.clear();
                }
                arrayList.addAll(list);
                hVar.u7();
                break;
            default:
                WebSubscribeExtra.GroupClosedType groupClosedType = ((WebSubscribeExtra) this.d).f;
                if ((!this.c && groupClosedType == WebSubscribeExtra.GroupClosedType.CLOSED) || groupClosedType == WebSubscribeExtra.GroupClosedType.PRIVATE) {
                    cvk.u(R.string.community_send_request_toast, false);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ pqe0(boolean z, WebSubscribeExtra webSubscribeExtra) {
        this.c = z;
        this.d = webSubscribeExtra;
    }
}
