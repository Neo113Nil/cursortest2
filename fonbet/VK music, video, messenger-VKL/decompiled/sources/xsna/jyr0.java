package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.ikv0;

/* compiled from: VideoActionsHelper.kt */
/* loaded from: classes2.dex */
public final class jyr0 {

    /* compiled from: VideoActionsHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoNotificationsStatus.values().length];
            try {
                iArr[VideoNotificationsStatus.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoNotificationsStatus.PREFERRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoNotificationsStatus.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(int i, int i2, Context context) {
        ikv0.a aVar = new ikv0.a(bwt0.u(context));
        aVar.t = new ikv0.c.C3058c(i, Integer.valueOf(R.attr.vk_ui_icon_contrast), (Size) null, 12);
        aVar.u = new ikv0.d(context.getString(i2), (String) null, (ikv0.d.a) null, 6);
        if (fxc0.B().J().E0()) {
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                aVar.g(1);
            }
        }
        pkv0.e(aVar);
        pkv0.f(aVar);
    }
}
