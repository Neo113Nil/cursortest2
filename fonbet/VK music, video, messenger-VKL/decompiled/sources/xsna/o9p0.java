package xsna;

import android.content.Context;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class o9p0 implements izs {
    public final /* synthetic */ yp80 b;
    public final /* synthetic */ UserId c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;

    public /* synthetic */ o9p0(int i, int i2, Context context, UserId userId, yp80 yp80Var) {
        this.b = yp80Var;
        this.c = userId;
        this.d = i;
        this.e = i2;
        this.f = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ii7 ii7Var;
        VKList<ii7> vKList = ((fj7) obj).a;
        if (vKList != null && (ii7Var = (ii7) j5g.a0(vKList)) != null) {
            t6g0 t6g0Var = t6g0.b;
            gxh b = t6g0.b();
            UserId userId = this.c;
            Group C0 = b.C0(userId);
            boolean z = C0 != null ? C0.i : false;
            BoardTopicViewFragment.a aVar = new BoardTopicViewFragment.a(this.d, userId, ii7Var.b);
            int i = this.e;
            if (i != 0) {
                aVar.j.putInt(SignalingProtocol.KEY_OFFSET, i);
            }
            aVar.A(ii7Var.c, true);
            aVar.z((ii7Var.g & 1) > 0);
            aVar.y(z);
            aVar.k(this.f);
        }
        yp80 yp80Var = this.b;
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
        return s3q0.a;
    }
}
