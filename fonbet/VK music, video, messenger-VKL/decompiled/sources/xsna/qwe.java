package xsna;

import android.content.Context;
import android.view.View;
import com.vk.clips.edit.privacy.PrivacyViewer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;

/* compiled from: ClipsPrivacy.kt */
/* loaded from: classes.dex */
public interface qwe {
    PostingVisibilityMode a();

    List<PrivacySetting.PrivacyRule> b(PostingVisibilityMode postingVisibilityMode);

    List<PrivacySetting.PrivacyRule> c(boolean z, boolean z2);

    boolean d(VideoFile videoFile);

    io.reactivex.rxjava3.core.x<String> e(Context context, PrivacySetting privacySetting, List<UserId> list, List<Integer> list2, PrivacyViewer privacyViewer);

    void f(PostingVisibilityMode postingVisibilityMode);

    String g(Context context);

    PostingVisibilityMode h();

    String i();

    void j(l7s l7sVar, View view, VideoFile videoFile, izs izsVar);

    String k(Context context, List<UserId> list, List<Integer> list2);

    void l(l7s l7sVar, VideoFile videoFile);

    boolean m(VideoFile videoFile);

    Integer n(VideoFile videoFile);

    void o(Context context, ht htVar, gzs gzsVar, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen);

    PostingVisibilityMode p(PrivacySetting privacySetting);
}
