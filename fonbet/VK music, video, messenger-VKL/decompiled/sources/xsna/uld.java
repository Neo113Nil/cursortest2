package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import one.video.exo.offline.DownloadInfo;
import org.json.JSONObject;
import xsna.ozs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class uld implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uld(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6 A[Catch: Exception -> 0x00c7, TryCatch #0 {Exception -> 0x00c7, blocks: (B:28:0x0080, B:30:0x0095, B:32:0x009f, B:34:0x00ad, B:36:0x00b6, B:37:0x00c9, B:39:0x00d0), top: B:27:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0 A[Catch: Exception -> 0x00c7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c7, blocks: (B:28:0x0080, B:30:0x0095, B:32:0x009f, B:34:0x00ad, B:36:0x00b6, B:37:0x00c9, B:39:0x00d0), top: B:27:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0071 A[SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        VideoFileOld videoFileOld;
        czs0 czs0Var;
        String str;
        switch (this.b) {
            case 0:
                zld zldVar = (zld) this.c;
                return zldVar.f.a().b().a(zldVar.b, zldVar.i);
            default:
                ozs0 ozs0Var = (ozs0) this.c;
                Map<String, DownloadInfo> u = ozs0Var.u();
                ArrayList arrayList = new ArrayList(u.size());
                Iterator<Map.Entry<String, DownloadInfo>> it = u.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    DownloadInfo downloadInfo = (DownloadInfo) next;
                    if (downloadInfo.b.length != 0 && downloadInfo.c != DownloadInfo.State.STATE_REMOVING) {
                        arrayList2.add(next);
                    }
                }
                List D0 = j5g.D0(new ozs0.f(), arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = D0.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            czs0 czs0Var2 = (czs0) it4.next();
                            if (czs0Var2.a.N != null ? !((b3o) ozs0Var.b.getValue()).d(r7.b) : false) {
                                Context context = e43.a;
                                if (context == null) {
                                    context = null;
                                }
                                VideoFileOld videoFileOld2 = czs0Var2.a;
                                String string = context.getString(R.string.video_donut_not_paid_restriction_title);
                                Image image = Image.d;
                                videoFileOld2.O0 = new VideoRestriction(string, "", false, null, false, image, image, 0, "");
                            }
                            arrayList4.add(czs0Var2);
                        }
                        return arrayList4;
                    }
                    DownloadInfo downloadInfo2 = (DownloadInfo) it3.next();
                    try {
                        str = (String) j5g.k0(drm0.c0(downloadInfo2.a, new String[]{" | "}, 0, 6));
                    } catch (Exception e) {
                        L.i(e);
                        videoFileOld = null;
                    }
                    if (str != null) {
                        hls0 hls0Var = (hls0) ozs0Var.o.getValue();
                        JSONObject jSONObject = hls0Var != null ? (JSONObject) hls0Var.a(str).c() : null;
                        if (jSONObject != null) {
                            videoFileOld = new VideoFileOld(jSONObject);
                            if (videoFileOld == null) {
                                videoFileOld = new VideoFileOld(new JSONObject(y2r0.r(downloadInfo2.b)));
                            }
                            if (videoFileOld.R0 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                videoFileOld.R0 = 1.0f;
                            }
                            czs0Var = videoFileOld != null ? new czs0(videoFileOld, downloadInfo2) : null;
                            if (czs0Var == null) {
                                arrayList3.add(czs0Var);
                            }
                        }
                    }
                    videoFileOld = null;
                    if (videoFileOld == null) {
                    }
                    if (videoFileOld.R0 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    }
                    if (videoFileOld != null) {
                    }
                    if (czs0Var == null) {
                    }
                }
                break;
        }
    }
}
