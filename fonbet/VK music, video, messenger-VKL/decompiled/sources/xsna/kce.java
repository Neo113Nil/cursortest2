package xsna;

import android.view.View;
import com.vk.dto.common.ClipVideoFile;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import xsna.qvq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kce implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kce(t1r t1rVar, nj50 nj50Var, qvq.i iVar, boolean z) {
        this.d = nj50Var;
        this.e = iVar;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                lce lceVar = (lce) this.d;
                ClipVideoFile clipVideoFile = ((vee) this.e).a;
                VideoOverlayView videoOverlayView = (VideoOverlayView) obj;
                boolean z = this.c;
                if (z) {
                    videoOverlayView.Z4((i1t0) lceVar.o.getValue(), new VideoOverlayView.c.j(((a390) lceVar.p.getValue()).a(clipVideoFile.O0), ((s290) lceVar.q.getValue()).a(clipVideoFile.w2()), Integer.valueOf(R.drawable.vk_icon_hide_outline_shadow_medium_48), Integer.valueOf(iah0.a(0))));
                    videoOverlayView.X4(new com.vk.movika.sdk.base.utils.b(11));
                    videoOverlayView.V4(new qt0(14));
                    videoOverlayView.Y4(new tb4(7));
                }
                EmptyList emptyList = EmptyList.b;
                ArrayList arrayList = new ArrayList();
                emptyList.getClass();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(z ? 4 : 0);
                }
                videoOverlayView.setVisibility(z ? 0 : 8);
                break;
            default:
                t1r.g((nj50) this.d, (qvq.i) this.e, (qih0) obj, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ kce(boolean z, lce lceVar, vee veeVar) {
        this.c = z;
        this.d = lceVar;
        this.e = veeVar;
    }
}
