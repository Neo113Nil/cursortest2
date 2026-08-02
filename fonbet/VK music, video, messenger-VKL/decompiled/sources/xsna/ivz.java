package xsna;

import android.content.Context;
import android.os.SystemClock;
import com.my.tracker.MyTracker;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveInteractiveTime;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragment;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ivz implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ivz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                ((LocalMediaPickerFragment) this.c).V.invoke(new PostingAction$TechStats$Picker$SaveInteractiveTime(MobileOfficialAppsFeedStat$PickerType.PHOTO, SystemClock.elapsedRealtime()));
                return s3q0.a;
            case 1:
                return MyTracker.getInstanceId((Context) this.c);
            default:
                ((grt0) this.c).w();
                return s3q0.a;
        }
    }
}
