package xsna;

import android.os.Parcelable;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.holders.group.GroupSubscriptionState;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.video.VideoOwner;
import com.vkontakte.android.R;
import java.util.HashSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lmu implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lmu(l0x l0xVar, gzs gzsVar, boolean z) {
        this.b = 1;
        this.d = l0xVar;
        this.e = gzsVar;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.group.a$a] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Group group = (Group) this.d;
                com.vk.catalog2.common.ui.holders.group.a aVar = (com.vk.catalog2.common.ui.holders.group.a) this.e;
                if ((this.c || !group.n()) && !group.C()) {
                    aVar.b.d();
                } else {
                    cvk.u(R.string.community_send_request_toast, false);
                }
                aVar.f = (group.j || group.C == 4) ? GroupSubscriptionState.RecentlySubscribed : GroupSubscriptionState.NotSubscribed;
                aVar.f();
                break;
            case 1:
                l0x l0xVar = (l0x) this.d;
                gzs gzsVar = (gzs) this.e;
                VideoFile videoFile = l0xVar.g;
                ViewGroup viewGroup = l0xVar.a;
                VideoFile videoFile2 = videoFile == null ? null : videoFile;
                if (videoFile == null) {
                    videoFile = null;
                }
                int o0 = videoFile.o0();
                VideoFile videoFile3 = l0xVar.g;
                if (videoFile3 == null) {
                    videoFile3 = null;
                }
                VideoOwner videoOwner = new VideoOwner(videoFile2, o0, videoFile3.I0());
                ljz ljzVar = new ljz(viewGroup.getContext(), null, 0);
                ljzVar.e = new HashSet();
                ljzVar.setDisplayComments(Boolean.valueOf(l0xVar.c));
                ljzVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ljzVar.setExternalSpectatorsView(l0xVar.b);
                com.vk.libvideo.live.impl.views.live.b bVar = new com.vk.libvideo.live.impl.views.live.b(ljzVar);
                bVar.a0 = l0xVar.d;
                bVar.e1(videoOwner);
                bVar.Q = true;
                bVar.setActive(true);
                bVar.R = false;
                bVar.v0(new nnz(ljzVar, new com.vk.libvideo.autoplay.a(false, null, null, false, false, false, null, null, null, null, null, null, false, null, 524287), new qt9(1, gzsVar)));
                if ((((Boolean) gzsVar.invoke()).booleanValue() && this.c) || videoOwner.f.z0()) {
                    bVar.resume();
                }
                ljzVar.setPresenter((oiz) bVar);
                ljzVar.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                viewGroup.addView(ljzVar);
                ljzVar.animate().alpha(1.0f).setDuration(800L).start();
                l0xVar.f = ljzVar;
                break;
            default:
                ((io.reactivex.rxjava3.subjects.f) ((jul0) this.e).c.getValue()).onNext(new ywm0((UserId) this.d, this.c));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lmu(boolean z, Parcelable parcelable, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = parcelable;
        this.e = obj;
    }
}
