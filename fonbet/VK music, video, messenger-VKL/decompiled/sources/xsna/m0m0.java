package xsna;

import com.vk.design.inspector.dsl.LegoStatus;
import com.vk.dto.stickers.AnimatedStickerContent;
import com.vk.friends.discover.UsersDiscoverPresenter;
import com.vk.log.L;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.minimizable.VideoMiniPlayerState;
import com.vk.video.ui.discovery.minimizable.s;
import com.vk.voip.ui.qr.ui.a;
import java.io.File;
import java.util.List;
import xsna.it80;
import xsna.qr60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class m0m0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ m0m0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                k9l0 k9l0Var = (k9l0) obj;
                return Integer.valueOf(k9l0Var.l + k9l0Var.g);
            case 1:
                jmg0 jmg0Var = (jmg0) obj;
                bno bnoVar = new bno(jmg0Var, LegoStatus.Adopted);
                jmg0Var.a.add(bnoVar);
                int i = btm0.b;
                id3 id3Var = bnoVar.a;
                hd3.a(id3Var, i);
                hd3.b(id3Var, "✅");
                s3q0 s3q0Var = s3q0.a;
                bno bnoVar2 = new bno(jmg0Var, LegoStatus.NotAdopted);
                jmg0Var.a.add(bnoVar2);
                int i2 = btm0.c;
                id3 id3Var2 = bnoVar2.a;
                hd3.a(id3Var2, i2);
                hd3.b(id3Var2, "⚠️");
                s3q0 s3q0Var2 = s3q0.a;
                return s3q0.a;
            case 2:
                byte[] B = com.vk.core.files.a.B((File) obj, null);
                return B == null ? new byte[0] : B;
            case 3:
                return s3q0.a;
            case 4:
                hxq0 hxq0Var = (hxq0) obj;
                return new awq0(new qr60.a.f(hxq0Var.a, hxq0Var.b, hxq0Var.d));
            case 5:
                return new UsersDiscoverPresenter.a(null, (List) obj, false, null, null, 25);
            case 6:
                return sni.f(((AnimatedStickerContent) obj).c);
            case 7:
                Boolean bool = (Boolean) obj;
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_APP_STABILITY;
                videoFeatures.getClass();
                return com.vk.toggle.b.A.a(videoFeatures) ? bool : Boolean.FALSE;
            case 8:
                return new s.c(((VideoMiniPlayerState) obj).d.c);
            case 9:
                it80.b.getClass();
                return it80.a.a();
            case 10:
                return a.f.a;
            case 11:
                L.E((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 12:
                return ((fjw0) obj).a();
            default:
                return Boolean.valueOf(brm0.B(((StackTraceElement) obj).getClassName(), "io.reactivex.rxjava3", false));
        }
    }

    public /* synthetic */ m0m0(z1s0 z1s0Var) {
        this.b = 7;
    }
}
