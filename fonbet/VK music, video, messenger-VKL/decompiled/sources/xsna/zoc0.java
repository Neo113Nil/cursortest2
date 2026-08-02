package xsna;

import android.os.SystemClock;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Posting$SaveInteractiveTime;
import java.util.concurrent.Callable;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics;
import ru.ok.android.webrtc.utils.PreferencesHelper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zoc0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zoc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Long tryToReport$lambda$0;
        switch (this.b) {
            case 0:
                ((apc0) this.c).c.invoke(new PostingAction$TechStats$Posting$SaveInteractiveTime(SystemClock.elapsedRealtime()));
                return s3q0.a;
            default:
                tryToReport$lambda$0 = SupportedCodecsStatistics.tryToReport$lambda$0((PreferencesHelper) this.c);
                return tryToReport$lambda$0;
        }
    }
}
