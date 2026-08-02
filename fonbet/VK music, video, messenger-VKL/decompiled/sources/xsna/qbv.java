package xsna;

import com.vk.dto.hints.Hint;
import com.vk.dto.newsfeed.discover.DiscoverCategory;
import com.vk.home.HomeFragment2;
import java.util.List;
import java.util.concurrent.Callable;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qbv implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qbv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                HomeFragment2 homeFragment2 = (HomeFragment2) obj;
                int i2 = HomeFragment2.x0;
                if (homeFragment2.ko()) {
                    List<DiscoverCategory> list = homeFragment2.h0;
                    List<Hint> list2 = homeFragment2.i0;
                    if (list != null && list2 != null) {
                        homeFragment2.po(list, list2);
                    }
                }
                return s3q0.a;
            case 1:
                return ((jq40) obj).j();
            default:
                ((com.vk.voip.ui.c) obj).getClass();
                CallsAudioDeviceInfo P0 = com.vk.voip.ui.c.I.P0();
                return P0 == null ? CallsAudioDeviceInfo.Companion.getNONE() : P0;
        }
    }
}
