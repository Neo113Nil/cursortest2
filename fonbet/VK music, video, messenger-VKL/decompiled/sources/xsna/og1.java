package xsna;

import android.app.Activity;
import android.view.ViewGroup;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction;
import java.util.Iterator;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class og1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ og1(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) obj3;
                int i2 = AlbumDetailsFragment.p0;
                a.w wVar = new a.w((uh1) obj2, (Photo) obj);
                albumDetailsFragment.getClass();
                xn50.a.c(albumDetailsFragment, wVar);
                return s3q0.a;
            case 1:
                u9j.a(new MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction(MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction.EventType.MODAL_SYNC_CONTACTS_ACCEPT_IMPORT_CONTACTS, null));
                ((t9j) obj3).b((Activity) obj2, (z9j) obj);
                return s3q0.a;
            case 2:
                BaseVideoPlayer baseVideoPlayer = (BaseVideoPlayer) obj2;
                hk0 hk0Var = (hk0) obj;
                Iterator<OneVideoPlayer.c> it = ((one.video.player.j) obj3).b.iterator();
                while (it.hasNext()) {
                    it.next().c(baseVideoPlayer, hk0Var);
                }
                return s3q0.a;
            case 3:
                ((w6x) obj3).e.v(((u6x) obj2).d, (Throwable) obj);
                return s3q0.a;
            case 4:
                hs50 hs50Var = (hs50) obj3;
                return new jf0((ViewGroup) obj2, (p20) obj, null, hs50Var.E, hs50Var.F);
            default:
                ubb0 ubb0Var = (ubb0) obj3;
                UserId userId = (UserId) obj2;
                String str = (String) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + " pid=" + str});
                }
                return Integer.valueOf(ubb0Var.c.d(String.valueOf(userId.b), str));
        }
    }
}
