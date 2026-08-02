package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.feed.core.models.MyTargetAdsComplainOptions;
import com.vk.feed.core.models.MyTargetBrandLiftSurvey;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.mytarget.report.MyTargetReportFragment;
import java.util.LinkedHashMap;
import xsna.et50;

/* compiled from: AdsSdkRouterImpl.kt */
/* loaded from: classes3.dex */
public final class o11 implements n11 {
    public final ps50 a;
    public final r5g0 b;

    public o11(ps50 ps50Var, r5g0 r5g0Var) {
        this.a = ps50Var;
        this.b = r5g0Var;
    }

    @Override // xsna.n11
    public final void a(cro0 cro0Var, String str, String str2, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr) {
        MyTargetReportFragment.a aVar = new MyTargetReportFragment.a();
        Bundle bundle = aVar.j;
        if (str != null) {
            bundle.putString("CLOSE_ADS_CHOICES_URL", str);
        }
        bundle.putParcelableArray("ADS_CHOICES_WITH_ID", myTargetAdsComplainOptionsArr);
        bundle.putString("AD_UNIQUE_KEY", str2);
        aVar.k(cro0Var);
    }

    @Override // xsna.n11
    public final void b(Context context, NewsEntry newsEntry, String[] strArr, boolean z) {
        MyTargetReportFragment.a aVar = new MyTargetReportFragment.a();
        Bundle bundle = aVar.j;
        bundle.putStringArray("KEY_COMPLAIN_AD_CHOICE_OPTIONS", strArr);
        if (z) {
            bundle.putInt("ENTRY_HASH_ENABLED", newsEntry.hashCode());
            this.b.b(newsEntry);
        } else {
            bundle.putParcelable("ADS_NEWS_ITEM", newsEntry);
        }
        aVar.k(context);
    }

    @Override // xsna.n11
    public final void c(Context context, NewsEntry newsEntry, String str, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr, boolean z) {
        MyTargetReportFragment.a aVar = new MyTargetReportFragment.a();
        Bundle bundle = aVar.j;
        bundle.putString("CLOSE_ADS_CHOICES_URL", str);
        bundle.putParcelableArray("ADS_CHOICES_WITH_ID", myTargetAdsComplainOptionsArr);
        if (z) {
            bundle.putInt("ENTRY_HASH_ENABLED", newsEntry.hashCode());
            this.b.b(newsEntry);
        } else {
            bundle.putParcelable("ADS_NEWS_ITEM", newsEntry);
        }
        aVar.k(context);
    }

    @Override // xsna.n11
    public final void d(cro0 cro0Var, String str, String str2, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr) {
        ps50 ps50Var = this.a;
        ps50Var.a(str2, myTargetAdsComplainOptionsArr, null, str);
        ps50Var.c(cro0Var);
    }

    @Override // xsna.n11
    public final void e(Context context, MyTargetBrandLiftSurvey myTargetBrandLiftSurvey, NewsEntry newsEntry, LinkedHashMap linkedHashMap, boolean z) {
        et50.a aVar = new et50.a(context, null);
        aVar.e = myTargetBrandLiftSurvey;
        aVar.g = linkedHashMap;
        if (z) {
            aVar.h = newsEntry != null ? Integer.valueOf(newsEntry.hashCode()) : null;
            if (newsEntry != null) {
                this.b.b(newsEntry);
            }
        } else {
            aVar.f = newsEntry;
        }
        aVar.I0(null);
    }

    @Override // xsna.n11
    public final void f(Activity activity, SdkVideoFile sdkVideoFile, String str, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr) {
        MyTargetReportFragment.a aVar = new MyTargetReportFragment.a();
        Bundle bundle = aVar.j;
        bundle.putParcelable("ADS_VIDEO_ITEM", sdkVideoFile);
        bundle.putString("CLOSE_ADS_CHOICES_URL", str);
        bundle.putParcelableArray("ADS_CHOICES_WITH_ID", myTargetAdsComplainOptionsArr);
        aVar.k(activity);
    }

    @Override // xsna.n11
    public final void g(Activity activity, SdkVideoFile sdkVideoFile, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr) {
        MyTargetReportFragment.a aVar = new MyTargetReportFragment.a();
        Bundle bundle = aVar.j;
        bundle.putParcelable("ADS_VIDEO_ITEM", sdkVideoFile);
        bundle.putParcelableArray("ADS_CHOICES_WITH_ID", myTargetAdsComplainOptionsArr);
        aVar.k(activity);
    }

    @Override // xsna.n11
    public final void h(l7s l7sVar, SdkVideoFile sdkVideoFile, String str, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr) {
        ps50 ps50Var = this.a;
        ps50Var.a(str, myTargetAdsComplainOptionsArr, sdkVideoFile, null);
        ps50Var.c(l7sVar);
    }
}
