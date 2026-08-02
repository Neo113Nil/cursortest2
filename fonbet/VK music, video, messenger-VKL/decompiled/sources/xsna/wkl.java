package xsna;

import android.net.Uri;
import android.os.SystemClock;
import com.vk.dto.common.ImageSize;
import com.vk.voip.ui.members.VoipDataProvider;
import java.util.concurrent.Callable;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class wkl implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wkl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        switch (this.b) {
            case 0:
                ((bll) this.c).d = Long.valueOf(SystemClock.elapsedRealtime());
                return s3q0.a;
            case 1:
                ImageSize imageSize = (ImageSize) this.c;
                if (imageSize == null || (str = imageSize.d.d) == null) {
                    return null;
                }
                return Uri.parse(str);
            default:
                String str2 = (String) this.c;
                it80.a aVar = it80.b;
                com.vk.voip.ui.c.b.getClass();
                VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
                if (voipDataProvider == null) {
                    voipDataProvider = null;
                }
                whr0 f = voipDataProvider.f(str2, false);
                aVar.getClass();
                return new it80(f);
        }
    }
}
