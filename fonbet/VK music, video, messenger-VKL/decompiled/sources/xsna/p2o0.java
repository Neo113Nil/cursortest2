package xsna;

import android.view.View;
import com.vk.common.links.LaunchContext;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.entries.TagsSuggestions;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: TagsSuggestionsInfoHolder.kt */
/* loaded from: classes4.dex */
public final class p2o0 extends qi6<TagsSuggestions> implements View.OnClickListener {
    @Override // xsna.qi6
    public final /* bridge */ /* synthetic */ void E6(TagsSuggestions tagsSuggestions) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TagsSuggestions q6;
        String str;
        if (jjc.b()) {
            return;
        }
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.tags_suggestions_more_close_btn) {
            pla.e().b().b(HintId.INFO_BUBBLE_NEWSFEED_TAGS_INFO.getId());
            TagsSuggestions q62 = q6();
            if (q62 != null) {
                hd60.a().w().e(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, new lb60(q62));
                return;
            }
            return;
        }
        if (valueOf == null || valueOf.intValue() != R.id.tags_suggestions_more_text || (q6 = q6()) == null || (str = q6.l) == null) {
            return;
        }
        maz.c(xwk.d().e(), this.itemView.getContext(), str, LaunchContext.A, null, null, 24);
    }
}
