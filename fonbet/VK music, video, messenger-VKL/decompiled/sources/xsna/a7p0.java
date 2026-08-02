package xsna;

import android.graphics.Typeface;
import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.users.User;
import com.vk.libvideo.impl.di.VideoNotificationsPermissionComponentImpl;
import java.lang.annotation.Annotation;
import java.util.regex.Pattern;
import xsna.w2x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class a7p0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ a7p0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return Typeface.create("sans-serif-medium", 0);
            case 2:
                Serializer.c<User> cVar = User.CREATOR;
                return Pattern.compile("id\\d+$");
            case 3:
                return new ayn();
            case 4:
                qcy<Object>[] qcyVarArr = VideoNotificationsPermissionComponentImpl.c;
                return new aa70();
            case 5:
                return new tub0(fpf0.a(izs.class), new Annotation[0]);
            case 6:
                return s3q0.a;
            case 7:
                int i = o1x0.g1;
                return new f3x0();
            default:
                com.vk.voip.ui.c.b.n(com.vk.voip.ui.c.N);
                com.vk.voip.ui.c.U().b(new w2x0.a(false, 7));
                return s3q0.a;
        }
    }
}
