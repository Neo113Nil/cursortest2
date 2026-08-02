package xsna;

import com.vk.dto.common.VideoFile;
import java.util.LinkedHashSet;

/* compiled from: VideoHistoryRecordRepositoryImpl.kt */
/* loaded from: classes14.dex */
public final class kps0 {
    public final uft0 a;
    public final LinkedHashSet b = new LinkedHashSet();

    public kps0(uft0 uft0Var) {
        this.a = uft0Var;
        ver0.a(new io.reactivex.rxjava3.internal.operators.observable.i0(wjs0.b.b0(wxr0.class), new cxd0(new wep0(3), 11)).subscribe(new o060(new m2l0(this, 19), 21)));
    }

    public final void a(VideoFile videoFile) {
        if (this.b.add(videoFile.a1())) {
            String a1 = videoFile.a1();
            String C1 = videoFile.C1();
            this.a.getClass();
            tfx tfxVar = new tfx("video.addViewingHistoryRecord", new ohl0(5), new wul0(4));
            tfx.o(tfxVar, "video_id", a1, 0, 0, 12);
            if (C1 != null) {
                tfx.o(tfxVar, "access_key", C1, 0, 0, 12);
            }
            ver0.a(itg0.m(rsg0.T(yfb.x(tfxVar))));
        }
    }
}
