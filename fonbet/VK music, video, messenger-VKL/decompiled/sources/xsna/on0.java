package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vkontakte.android.R;
import ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException;
import xsna.dw20;

/* compiled from: AddRoomToCallErrorShower.kt */
/* loaded from: classes7.dex */
public final class on0 {

    /* compiled from: AddRoomToCallErrorShower.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddByLinkFailedException.Reason.values().length];
            try {
                iArr[AddByLinkFailedException.Reason.LINK_OUTDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddByLinkFailedException.Reason.QR_WRONG_PREFIX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddByLinkFailedException.Reason.QR_NO_USER_ID_PARAMETER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AddByLinkFailedException.Reason.QR_GENERAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AddByLinkFailedException.Reason.WRONG_SIGNATURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AddByLinkFailedException.Reason.MALFORMED_QR_URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static dw20 a(Context context, Throwable th, gzs gzsVar) {
        if (th instanceof AddByLinkFailedException) {
            switch (a.$EnumSwitchMapping$0[((AddByLinkFailedException) th).getReason().ordinal()]) {
                case 1:
                    return c(context, R.string.voip_error_device_link_outdated_title, R.string.voip_error_device_link_outdated, gzsVar);
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return c(context, R.string.voip_error_device_invalid_link_title, R.string.voip_error_device_invalid_link, gzsVar);
                default:
                    return b(R.string.voip_error_cannot_invite_by_link, context, gzsVar);
            }
        }
        if (!(th instanceof VKApiExecutionException)) {
            zk70.e(th);
            return null;
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
        int s = vKApiExecutionException.s();
        return s != 954 ? s != 977 ? s != 1008 ? b(zk70.a(vKApiExecutionException).h(), context, gzsVar) : b(R.string.voip_error_device_already_in_call, context, gzsVar) : c(context, R.string.voip_error_device_link_outdated_title, R.string.voip_error_device_link_outdated, gzsVar) : b(R.string.voip_error_device_invalid_call_link, context, gzsVar);
    }

    public static dw20 b(int i, Context context, gzs gzsVar) {
        return new dw20.b(context, null).v0(i).M(R.drawable.vk_icon_error_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).a0(new defpackage.j(gzsVar, 5)).h0(R.string.voip_add_room_to_call_error_ok_button, new defpackage.k(gzsVar, 3)).I0(null);
    }

    public static dw20 c(Context context, int i, int i2, gzs gzsVar) {
        return ((dw20.b) dw20.a.Q(new dw20.b(context, null).v0(i), i2)).M(R.drawable.vk_icon_error_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).a0(new mn0(0, gzsVar)).h0(R.string.voip_add_room_to_call_error_ok_button, new nn0(0, gzsVar)).I0(null);
    }
}
