package xsna;

import android.view.View;
import com.vk.log.L;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.q8v;
import xsna.xn50;

/* compiled from: AudioRestrictionInteractorImpl.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class pw4 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                hc5 hc5Var = (hc5) this.receiver;
                hc5Var.getClass();
                xn50.a.c(hc5Var, (ec5) obj);
                break;
            case 2:
                String str = (String) obj;
                ((ojd) this.receiver).getClass();
                break;
            case 3:
                com.vk.im.ui.components.dialogs_list.c cVar = (com.vk.im.ui.components.dialogs_list.c) this.receiver;
                f9w f9wVar = com.vk.im.ui.components.dialogs_list.c.B;
                cVar.getClass();
                com.vk.im.ui.components.dialogs_list.c.B.a((Throwable) obj);
                break;
            case 4:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                break;
            case 5:
                w920 w920Var = (w920) this.receiver;
                w920Var.g.debug(new sim(w920Var, 18));
                w920Var.l.onNext(new q8v.c((w8v) obj));
                w920Var.j();
                break;
            case 6:
                com.vk.photos.root.photoflow.presentation.h hVar = (com.vk.photos.root.photoflow.presentation.h) obj;
                if (((com.vk.photos.root.photoflow.presentation.g) this.receiver).e.a(hVar.b)) {
                    break;
                }
                break;
            case 7:
                L.i((Throwable) obj);
                break;
            case 8:
                u2b0 u2b0Var = ((feb0) this.receiver).a;
                break;
            case 9:
                ((View) this.receiver).setBackgroundColor(((Number) obj).intValue());
                break;
            default:
                L.i((Throwable) obj);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw4(Object obj, int i) {
        super(1, obj, sw4.class, "updateRestrictionsInfo", "updateRestrictionsInfo(Ljava/util/List;)Lio/reactivex/rxjava3/core/Completable;", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, ojd.class, "mapToImage", "mapToImage(Ljava/lang/String;)Lcom/vk/dto/common/Image;", 0);
                break;
            case 3:
                super(1, obj, com.vk.im.ui.components.dialogs_list.c.class, "onLoadMemberError", "onLoadMemberError(Ljava/lang/Throwable;)V", 0);
                break;
            case 4:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 5:
            case 9:
            default:
                break;
            case 6:
                super(1, obj, com.vk.photos.root.photoflow.presentation.g.class, "buildPhotoTags", "buildPhotoTags(Lcom/vk/photos/root/photoflow/presentation/PhotoFlowState;)Ljava/util/List;", 0);
                break;
            case 7:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 8:
                super(1, obj, feb0.class, "isPlaying", "isPlaying(Lcom/vk/dto/music/MusicTrack;)Z", 0);
                break;
            case 10:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}
