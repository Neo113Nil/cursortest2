package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.im.engine.models.contacts.Contact;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ContactLastSeenFormatter.kt */
/* loaded from: classes2.dex */
public final class v8j {
    public static final v8j a = new v8j();

    @SuppressLint({"StaticFieldLeak"})
    public static final Context b;

    /* compiled from: ContactLastSeenFormatter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Contact.LastSeenStatus.values().length];
            try {
                iArr[Contact.LastSeenStatus.TODAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Contact.LastSeenStatus.RECENTLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Contact.LastSeenStatus.LONG_AGO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        b = context;
    }

    public static String a(Contact.LastSeenStatus lastSeenStatus) {
        int i = a.$EnumSwitchMapping$0[lastSeenStatus.ordinal()];
        Context context = b;
        if (i == 1) {
            return context.getString(R.string.vkim_last_seen_today);
        }
        if (i == 2) {
            return context.getString(R.string.vkim_last_seen_recently);
        }
        if (i == 3) {
            return context.getString(R.string.vkim_last_seen_long_ago);
        }
        throw new NoWhenBranchMatchedException();
    }
}
