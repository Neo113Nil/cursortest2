package xsna;

import android.content.ContextWrapper;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b7v implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b7v(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                gyh0 gyh0Var = (gyh0) this.c;
                c7v c7vVar = (c7v) this.d;
                Dialog dialog = (Dialog) this.e;
                ProfilesSimpleInfo profilesSimpleInfo = (ProfilesSimpleInfo) this.f;
                ImSearchItemLoggingInfo imSearchItemLoggingInfo = gyh0Var.b;
                if (imSearchItemLoggingInfo != null) {
                    c7vVar.l.t0(ImSearchAnalytics.ClickAction.TAP, imSearchItemLoggingInfo);
                }
                c7vVar.l.B0(dialog, profilesSimpleInfo, imSearchItemLoggingInfo);
                break;
            default:
                w1s0.l((ContextWrapper) this.c, (VideoFile) this.d, (String) this.e, (String) this.f, false, 96);
                ((ikv0) obj).a();
                break;
        }
        return s3q0.a;
    }
}
