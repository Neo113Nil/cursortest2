package xsna;

import com.vk.catalog2.common.dto.api.di.CatalogComponent;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.im.chat.clips.decoration.impl.di.DialogClipsContextImpl;
import com.vk.music.player.MusicPlaybackQueueComponentImpl;
import com.vk.topics.impl.di.TopicsComponentImpl;
import com.vk.video.focus.impl.di.VideoFocusComponentImpl;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.ExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class u0f implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ u0f(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 s3q0Var;
        ExecutorService b;
        switch (this.b) {
            case 0:
                return new DialogClipsContextImpl.a();
            case 1:
                return ((ClassifiedsComponent) ((k7m) m7m.f(m820.b)).a(fpf0.a(ClassifiedsComponent.class))).dc();
            case 2:
                return new MusicPlaybackQueueComponentImpl.a();
            case 3:
                return e43.l(Integer.valueOf(cn70.b(48)), Integer.valueOf(cn70.b(72)), -1);
            case 4:
                return new d2f0();
            case 5:
                return Boolean.valueOf(com.vk.toggle.d.E("feed"));
            case 6:
                s3q0Var = s3q0.a;
                return s3q0Var;
            case 7:
                b = asu0.a.b((r5 & 2) != 0 ? 1 : 5, (r5 & 4) != 0 ? 0L : 1000L, "firebase-initialize-thread");
                return b;
            case 8:
                return "api.".concat(a0a.d);
            case 9:
                VKApplication.a aVar = VKApplication.c;
                return new pzv0(((CatalogComponent) m7m.e().a(fpf0.a(CatalogComponent.class))).Ce());
            case 10:
                VKApplication.a aVar2 = VKApplication.c;
                return m7m.e();
            case 11:
                qcy<Object>[] qcyVarArr = VideoFocusComponentImpl.c;
                return new zfs();
            case 12:
                return jjc.d();
            case 13:
                return new TopicsComponentImpl.a();
            case 14:
                return (String) com.vk.core.apps.a.c(null, "com.vk.ok_api_key");
            case 15:
                return new jsa(new os9(new i8c0(14), 2));
            default:
                return new nnl();
        }
    }

    public /* synthetic */ u0f(VKApplication vKApplication, int i) {
        this.b = i;
    }
}
