package xsna;

import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.DownloadRequest;
import com.vk.dto.common.id.UserId;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import xsna.ju70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class lpy implements io.reactivex.rxjava3.functions.l, fco {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lpy(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.fco
    public androidx.media3.exoplayer.offline.d a(DownloadRequest downloadRequest) {
        OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) this.c;
        bpn0 bpn0Var = offlineAudioComponentImpl.h;
        qcy<Object>[] qcyVarArr = OfflineAudioComponentImpl.M;
        if (!ju70.a.c(downloadRequest.c.toString())) {
            return new onw(downloadRequest, (a.b) bpn0Var.getValue(), new zos(13));
        }
        a.b bVar = (a.b) bpn0Var.getValue();
        asu0.a.getClass();
        return new fu70(downloadRequest, bVar, asu0.q(), offlineAudioComponentImpl.Ef());
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.b0) ((kpy) this.c).invoke(obj);
            default:
                return (UserId) ((p27) this.c).invoke(obj);
        }
    }
}
