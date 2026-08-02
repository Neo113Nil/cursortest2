package xsna;

import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketMessageOwnerAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.eno0;

/* compiled from: MarketMessageOwnerUnderMediaTransformer.kt */
/* loaded from: classes4.dex */
public final class x710 implements gn60<MarketMessageOwnerAttachment, wm60> {
    public static List a(MarketMessageOwnerAttachment marketMessageOwnerAttachment) {
        return Collections.singletonList(new ur8(new eno0.a(R.string.post_smb_market_message_button_text, EmptyList.b), marketMessageOwnerAttachment));
    }
}
