package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.exoplayer.hls.playlist.a;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
public final class lch implements cou {
    public final /* synthetic */ mch a;

    public lch(mch mchVar) {
        this.a = mchVar;
    }

    @Override // defpackage.cou
    public final boolean a(Uri uri, swy swyVar, boolean z) {
        a aVar;
        mch mchVar = this.a;
        HashMap hashMap = mchVar.w;
        if (mchVar.E == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ynu ynuVar = mchVar.C;
            int i = tw21.a;
            List list = ynuVar.e;
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                a aVar2 = (a) hashMap.get(((xnu) list.get(i3)).a);
                if (aVar2 != null && elapsedRealtime < aVar2.A) {
                    i2++;
                }
            }
            rwy fallbackSelectionFor = mchVar.c.getFallbackSelectionFor(new qwy(1, 0, mchVar.C.e.size(), i2), swyVar);
            if (fallbackSelectionFor != null && fallbackSelectionFor.a == 2 && (aVar = (a) hashMap.get(uri)) != null) {
                a.a(aVar, fallbackSelectionFor.b);
            }
        }
        return false;
    }

    @Override // defpackage.cou
    public final void b() {
        this.a.x.remove(this);
    }
}
