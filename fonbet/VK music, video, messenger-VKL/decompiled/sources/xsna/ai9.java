package xsna;

import com.vk.dto.stories.model.StoryViewAction;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CameraDownloadDelegate.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class ai9 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ ai9(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((cm9) this.receiver).bf();
                break;
            default:
                sbl0 sbl0Var = (sbl0) this.receiver;
                sbl0Var.getClass();
                sbl0Var.c(y8g0.e(R.string.messages_sent));
                anm0 anm0Var = (anm0) sbl0Var.m.getValue();
                MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = MobileOfficialAppsConStoriesStat$ViewEntryPoint.QUESTION_STORY;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER;
                anm0Var.P(mobileOfficialAppsConStoriesStat$ViewEntryPoint, com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen), com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen));
                sbl0Var.d(StoryViewAction.QUESTION_SEND_MESSAGE);
                break;
        }
        return s3q0.a;
    }

    public ai9(Object obj) {
        super(0, obj, sbl0.class, "messageSendCallback", "messageSendCallback()V", 0);
    }
}
