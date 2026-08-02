package xsna;

import com.vkontakte.android.attachments.DonutLinkAttachment;
import java.util.Collections;
import java.util.List;
import xsna.eno0;

/* compiled from: DonutLinkUnderMediaTransformer.kt */
/* loaded from: classes4.dex */
public final class q0o implements gn60<DonutLinkAttachment, wm60> {
    public static List a(DonutLinkAttachment donutLinkAttachment) {
        String str = donutLinkAttachment.h;
        if (str == null) {
            str = "";
        }
        return Collections.singletonList(new ur8(new eno0.b(str), donutLinkAttachment));
    }
}
