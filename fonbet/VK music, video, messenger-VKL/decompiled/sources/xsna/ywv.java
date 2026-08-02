package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: ImAutoPlayProvider.kt */
/* loaded from: classes2.dex */
public final class ywv implements ai5 {
    public final RecyclerView b;
    public final zwv c;

    public ywv(RecyclerView recyclerView, zwv zwvVar) {
        this.b = recyclerView;
        this.c = zwvVar;
    }

    @Override // xsna.ai5
    public final y9t0 Eh(int i) {
        VideoFile A;
        Object adapter = this.b.getAdapter();
        String str = null;
        qwv qwvVar = adapter instanceof qwv ? (qwv) adapter : null;
        if (qwvVar == null) {
            return null;
        }
        Attach b = qwvVar.b(i);
        zwv zwvVar = this.c;
        zwvVar.getClass();
        yg5 a = zwv.a(b);
        String a2 = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.IM);
        String str2 = zwvVar.a;
        AttachWithVideo attachWithVideo = b instanceof AttachWithVideo ? (AttachWithVideo) b : null;
        if (attachWithVideo != null && (A = attachWithVideo.A()) != null) {
            str = A.r();
        }
        return new y9t0(a, new ni5(a2, str2, str, 8));
    }

    @Override // xsna.dkf0
    public final int getAdapterOffset() {
        return 0;
    }

    @Override // xsna.dkf0
    public final int getItemCount() {
        RecyclerView.Adapter adapter = this.b.getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    @Override // xsna.dkf0
    public final RecyclerView getRecyclerView() {
        return this.b;
    }

    @Override // xsna.ai5
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }
}
