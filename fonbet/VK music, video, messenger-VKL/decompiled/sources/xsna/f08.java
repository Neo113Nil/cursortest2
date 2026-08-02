package xsna;

import com.vkontakte.android.R;
import com.vkontakte.android.attachments.BookingAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.eno0;

/* compiled from: BookingUnderMediaTransformer.kt */
/* loaded from: classes4.dex */
public final class f08 implements gn60<BookingAttachment, wm60> {
    public static List a(BookingAttachment bookingAttachment) {
        return Collections.singletonList(new ur8(new eno0.a(R.string.post_smb_booking_button_text, EmptyList.b), bookingAttachment));
    }
}
