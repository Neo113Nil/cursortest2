package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.feed.core.models.MyTargetAdsComplainOptions;
import com.vk.feed.core.models.MyTargetBrandLiftSurvey;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.LinkedHashMap;

/* compiled from: AdsSdkRouter.kt */
/* loaded from: classes3.dex */
public interface n11 {
    void a(cro0 cro0Var, String str, String str2, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr);

    void b(Context context, NewsEntry newsEntry, String[] strArr, boolean z);

    void c(Context context, NewsEntry newsEntry, String str, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr, boolean z);

    void d(cro0 cro0Var, String str, String str2, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr);

    void e(Context context, MyTargetBrandLiftSurvey myTargetBrandLiftSurvey, NewsEntry newsEntry, LinkedHashMap linkedHashMap, boolean z);

    void f(Activity activity, SdkVideoFile sdkVideoFile, String str, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr);

    void g(Activity activity, SdkVideoFile sdkVideoFile, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr);

    void h(l7s l7sVar, SdkVideoFile sdkVideoFile, String str, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr);
}
