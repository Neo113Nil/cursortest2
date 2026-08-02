package xsna;

import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class m1l0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Parcelable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m1l0(int i, Parcelable parcelable, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = obj;
        this.d = parcelable;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 unpromoteParticipant$lambda$0;
        switch (this.b) {
            case 0:
                unpromoteParticipant$lambda$0 = StereoRoomManagerImpl.unpromoteParticipant$lambda$0((StereoRoomManagerImpl) this.c, (ParticipantId) this.d, (gzs) this.e, (izs) this.f);
                return unpromoteParticipant$lambda$0;
            default:
                qgp0 qgp0Var = (qgp0) this.c;
                UserId userId = (UserId) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", y57.a("mid=", str, " url=", str2)});
                }
                qgp0Var.b.c(String.valueOf(userId.b), str, str2);
                return s3q0.a;
        }
    }
}
