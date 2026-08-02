package defpackage;

import com.yandex.go.scooters.driver_license.a;
import java.util.ArrayList;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* loaded from: classes13.dex */
public final class cjn0 implements v8p0 {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ a c;

    public cjn0(ArrayList arrayList, a aVar) {
        this.b = arrayList;
        this.c = aVar;
    }

    @Override // defpackage.v8p0
    public final void onPageStarted(String str) {
        if (!evu0.y(str, UgcLiveVideoData.UgcLiveStatus.FINISHED, false)) {
            ArrayList arrayList = this.b;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
                return;
            }
        }
        this.c.D.d("driver_license", "");
    }
}
