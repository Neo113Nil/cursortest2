package xsna;

import android.os.Trace;
import com.vk.common.links.spans.impl.LinksSpansComponentImpl;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.libvideo.api.di.VideoAutologinComponent;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import kotlin.Lazy;
import xsna.akq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class pxv implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pxv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (NotificationsSettingsComponent) ((g8m) obj).a(fpf0.a(NotificationsSettingsComponent.class));
            case 1:
                return zr.a("#started env with db ", (String) obj, " successfully");
            case 2:
                qcy<Object>[] qcyVarArr = LinksSpansComponentImpl.b;
                return new dik0((btq) ((Lazy) obj).getValue());
            case 3:
                return ((VideoAutologinComponent) m7m.a(((nx50) obj).b).a(fpf0.a(VideoAutologinComponent.class))).S6();
            case 4:
                qcy<Object>[] qcyVarArr2 = NewsFeedComponentImpl.D;
                nwy nwyVar = ((NewsFeedComponentImpl) obj).c;
                qcy<Object> qcyVar = NewsFeedComponentImpl.D[0];
                return (zix) ofx.a(((AppContextDiComponent) nwyVar.c()).a);
            case 5:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) obj;
                qcy<Object>[] qcyVarArr3 = OfflineAudioComponentImpl.M;
                return new vp40((jc50) offlineAudioComponentImpl.H.getValue(), ((sp40) offlineAudioComponentImpl.E.getValue()).getCache(), new ft70(offlineAudioComponentImpl), offlineAudioComponentImpl.I());
            case 6:
                ((yjq) ((nke0) obj).b.getValue()).b(akq.a.b);
                return s3q0.a;
            case 7:
                bhl0 bhl0Var = (bhl0) obj;
                Trace.beginSection(ndp0.f("lazy StorageManager.dialogBackgroundStorage"));
                try {
                    return new sam(bhl0Var.B());
                } finally {
                    Trace.endSection();
                }
            case 8:
                return Boolean.valueOf(dhr0.M() || com.vk.libvideo.api.minimizable.a.d((VideoMinimizableState) ((io.reactivex.rxjava3.subjects.d) ((i6q0) obj).c.getValue()).P0()));
            case 9:
                return Boolean.valueOf(((qks0) obj).a);
            default:
                return (pnf) ((bpn0) obj).getValue();
        }
    }
}
