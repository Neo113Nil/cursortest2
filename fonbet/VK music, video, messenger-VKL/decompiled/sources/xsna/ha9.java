package xsna;

import android.content.Context;
import com.vk.im.engine.models.CallState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CallStatusFormatter.kt */
/* loaded from: classes2.dex */
public final class ha9 {
    public final Context a;
    public final StringBuilder b = new StringBuilder();
    public final coo c;

    /* compiled from: CallStatusFormatter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CallState.values().length];
            try {
                iArr[CallState.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallState.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CallState.DECLINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ha9(Context context) {
        this.a = context;
        this.c = new coo(context);
    }

    public final String a(boolean z, int i, CallState callState, boolean z2) {
        StringBuilder sb = this.b;
        coo cooVar = this.c;
        Context context = this.a;
        if (!z) {
            int i2 = a.$EnumSwitchMapping$0[callState.ordinal()];
            if (i2 != 1) {
                return i2 != 2 ? context.getString(R.string.vkim_msg_list_call_missed) : context.getString(R.string.vkim_msg_list_call_error);
            }
            sb.setLength(0);
            if (z2) {
                cooVar.d(i, sb);
            } else {
                cooVar.getClass();
                coo.b(i, sb);
            }
            return sb.toString();
        }
        int i3 = a.$EnumSwitchMapping$0[callState.ordinal()];
        if (i3 == 1) {
            sb.setLength(0);
            if (z2) {
                cooVar.d(i, sb);
            } else {
                cooVar.getClass();
                coo.b(i, sb);
            }
            return sb.toString();
        }
        if (i3 == 2) {
            return context.getString(R.string.vkim_msg_list_call_error);
        }
        if (i3 == 3) {
            return context.getString(R.string.vkim_msg_list_call_cancelled);
        }
        if (i3 == 4) {
            return context.getString(R.string.vkim_msg_list_call_declined);
        }
        throw new NoWhenBranchMatchedException();
    }
}
