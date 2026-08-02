package xsna;

import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.provider.CalendarContract;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.rfb;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class isa implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ isa(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                jsa jsaVar = (jsa) this.c;
                String str = (String) this.d;
                nk nkVar = new nk(8);
                jsaVar.getClass();
                jsa.c(nkVar);
                qaj0.c(jsaVar.b.c(), "changed_name", str);
                break;
            case 1:
                aeb aebVar = (aeb) this.c;
                wgb wgbVar = (wgb) this.d;
                rfb.a.b bVar = new rfb.a.b(aebVar, wgbVar.a, 30);
                gz9 gz9Var = wgbVar.b;
                gz9Var.a(new m84(3, wgbVar, aebVar));
                wgbVar.g.b(bVar);
                gz9Var.a(new lb6(3, wgbVar, aebVar));
                wgbVar.b(new on7(wgbVar, bVar, aebVar, 1));
                break;
            case 2:
                String str2 = (String) this.d;
                swj swjVar = (swj) this.c;
                String U = brm0.B(str2, "track_download_", false) ? drm0.U(str2, "track_download_") : brm0.B(str2, "chapter_download_", false) ? drm0.U(str2, "chapter_download_") : brm0.B(str2, "episode_download_", false) ? drm0.U(str2, "episode_download_") : null;
                if (U != null) {
                    swjVar.b.t(U, DownloadingState.Downloaded.b);
                    break;
                }
                break;
            case 3:
                vul vulVar = (vul) this.c;
                String str3 = (String) this.d;
                qz8 qz8Var = (qz8) vulVar.b;
                List<hfw0> b = qz8Var.b(str3);
                ArrayList arrayList = new ArrayList(c5g.u(b, 10));
                Iterator<T> it = b.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((hfw0) it.next()).a));
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(ContentProviderOperation.newDelete(ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, ((Number) it2.next()).longValue())).build());
                }
                try {
                    qz8Var.a.applyBatch("com.android.calendar", p4g.q(arrayList2));
                    break;
                } catch (OperationApplicationException e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    return;
                } catch (RemoteException e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                    return;
                }
            case 4:
                ((com.vk.newsfeed.posting.market_picker.presentation.base.view.f) this.c).i.remove(Integer.valueOf(((Photo) this.d).c));
                break;
            case 5:
                ((fq60) this.c).d((Context) this.d, new yo60.g.c(R.string.ads_url_copied));
                break;
            default:
                tys0.a.onNext(new Pair<>((UserId) this.c, (VideoNotificationsStatus) this.d));
                break;
        }
    }

    public /* synthetic */ isa(String str, swj swjVar) {
        this.b = 2;
        this.d = str;
        this.c = swjVar;
    }
}
