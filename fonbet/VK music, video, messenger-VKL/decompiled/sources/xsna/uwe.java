package xsna;

import com.vk.clips.edit.privacy.PrivacyViewer;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.posting.PostingVisibilityMode;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsPrivacyInteractor.kt */
/* loaded from: classes17.dex */
public interface uwe {
    static Object g(uwe uweVar, PrivacySetting privacySetting, SuspendLambda suspendLambda) {
        EmptyList emptyList = EmptyList.b;
        return uweVar.e(privacySetting, emptyList, emptyList, PrivacyViewer.SETTING, suspendLambda);
    }

    PostingVisibilityMode a();

    List<PrivacySetting.PrivacyRule> b(PostingVisibilityMode postingVisibilityMode);

    List<PrivacySetting.PrivacyRule> c(boolean z, boolean z2);

    List<PrivacySetting.PrivacyRule> d(boolean z, boolean z2);

    Object e(PrivacySetting privacySetting, List list, List list2, PrivacyViewer privacyViewer, ContinuationImpl continuationImpl);

    void f(PostingVisibilityMode postingVisibilityMode);
}
