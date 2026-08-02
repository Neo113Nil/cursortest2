package xsna;

import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketLinkAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.eno0;

/* compiled from: MarketLinkUnderMediaTransformer.kt */
/* loaded from: classes4.dex */
public final class p610 implements gn60<MarketLinkAttachment, wm60> {
    public static List a(MarketLinkAttachment marketLinkAttachment) {
        return Collections.singletonList(new ur8(new eno0.a(R.string.post_smb_market_link_button_text, EmptyList.b), marketLinkAttachment));
    }
}
