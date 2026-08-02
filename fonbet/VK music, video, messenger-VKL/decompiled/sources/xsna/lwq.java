package xsna;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError;

/* compiled from: FeedApiTimelineLoadingBuilderImpl.kt */
/* loaded from: classes4.dex */
public final class lwq implements Runnable {
    public final /* synthetic */ iwq b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Exception d;

    public lwq(iwq iwqVar, String str, Exception exc) {
        this.b = iwqVar;
        this.c = str;
        this.d = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.c;
        if (str == null) {
            str = "Undefined";
        }
        Exception exc = this.d;
        String message = exc.getMessage();
        if (message == null) {
            message = "Empty " + fpf0.a(exc.getClass()).l() + " error.";
        }
        this.b.r.add(MobileOfficialAppsFeedStat$FeedTimelineEvent.a.a(new MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError(str, message)));
    }
}
