package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;

/* compiled from: Ext.kt */
/* loaded from: classes4.dex */
public final class zaq {
    public static final PostPrivacyData a(PostingState.Editing editing, cpc0 cpc0Var) {
        PostingContext postingContext = editing.c;
        boolean b = fkq0.b(postingContext.b.b);
        PostingSettings postingSettings = editing.d;
        boolean z = postingSettings.n;
        PostEditableData postEditableData = editing.i;
        PrivacyPostType privacyPostType = postEditableData.i;
        return new PostPrivacyData(b, z, privacyPostType, qfd0.b(postingContext.b.b, postingSettings, privacyPostType, cpc0Var), postingSettings.o, postEditableData.x, postEditableData.y, false);
    }
}
