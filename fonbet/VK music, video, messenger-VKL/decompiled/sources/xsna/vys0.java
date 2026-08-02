package xsna;

import androidx.recyclerview.widget.m;
import java.util.List;
import one.video.exo.offline.DownloadInfo;

/* compiled from: VideoOfflineExtendedItem.kt */
/* loaded from: classes2.dex */
public final class vys0 extends m.b {
    public final /* synthetic */ List<wys0> b;
    public final /* synthetic */ List<wys0> c;

    public vys0(List<wys0> list, List<wys0> list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        wys0 wys0Var = this.b.get(i);
        wys0 wys0Var2 = this.c.get(i2);
        DownloadInfo downloadInfo = wys0Var.b;
        DownloadInfo.State state = downloadInfo.c;
        DownloadInfo downloadInfo2 = wys0Var2.b;
        return state == downloadInfo2.c && downloadInfo.g == downloadInfo2.g && wys0Var.c == wys0Var2.c;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        return epx.f(this.b.get(i).a.r1(), this.c.get(i2).a.r1());
    }

    @Override // androidx.recyclerview.widget.m.b
    public final Object getChangePayload(int i, int i2) {
        return this.c.get(i2).b;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getNewListSize() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getOldListSize() {
        return this.b.size();
    }
}
