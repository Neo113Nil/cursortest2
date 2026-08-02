package xsna;

import android.content.Context;
import android.os.Bundle;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.suggestions.api.model.SuggestionType;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsFragment;

/* compiled from: CommunitySuggestionsRouterImpl.kt */
/* loaded from: classes5.dex */
public final class m3i implements l3i {
    @Override // xsna.l3i
    public final void a(Context context, UserId userId, String str, String str2) {
        if (str == null) {
            str = "";
        }
        SuggestionType suggestionType = SuggestionType.SIMILAR;
        CommunitySuggestionsFragment.a aVar = new CommunitySuggestionsFragment.a(CommunitySuggestionsFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable(CommonConstant.RETKEY.USERID, userId);
        bundle.putString(NativeAdContent.ViewTag.AD_TITLE, str);
        bundle.putInt("ADMIN_LEVEL", 0);
        bundle.putString("REF", str2);
        bundle.putParcelable("SUGGESTIONS_TYPE", suggestionType);
        aVar.k(context);
    }
}
