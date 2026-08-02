package xsna;

import android.content.Context;
import android.content.res.Resources;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vkontakte.android.R;

/* compiled from: SubtitleFormatter.kt */
/* loaded from: classes2.dex */
public final class r0n0 {
    public final Context a;
    public final bpn0 b = new bpn0(new in60(this, 24));
    public final bpn0 c = new bpn0(new ta50(9));

    /* compiled from: SubtitleFormatter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Peer.Type.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Peer.Type.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Peer.Type.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public r0n0(Context context) {
        this.a = context;
    }

    public final String a(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        if (dialog != null && profilesSimpleInfo != null) {
            ChatSettings Hb = dialog.Hb();
            boolean tc = dialog.tc();
            Context context = this.a;
            if (tc) {
                if (Hb != null) {
                    if (Hb.j) {
                        return context.getString(R.string.vkim_msg_header_channel_left);
                    }
                    Resources resources = context.getResources();
                    int i = Hb.f;
                    return resources.getQuantityString(R.plurals.vkim_msg_header_channel_count, i, Integer.valueOf(i));
                }
            } else if (!dialog.uc()) {
                Peer.Type Ed = dialog.Ed();
                int i2 = Ed == null ? -1 : a.$EnumSwitchMapping$0[Ed.ordinal()];
                if (i2 == 1) {
                    qtd0 Ab = profilesSimpleInfo.Ab(dialog.Sb());
                    return (Ab == null || !Ab.ka()) ? (Ab == null || !Ab.t6()) ? imj0.d((gp80) this.b.getValue(), Ab) : context.getString(R.string.vkim_chat_profile_user_banned) : context.getString(R.string.vkim_chat_profile_user_deactivated);
                }
                if (i2 == 2) {
                    qtd0 Ab2 = profilesSimpleInfo.Ab(dialog.Sb());
                    if (Ab2 != null) {
                        return ((g3a0) this.c.getValue()).a(Ab2.c5());
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        profilesSimpleInfo.Ab(dialog.Sb());
                        return "";
                    }
                } else if (profilesSimpleInfo.Ab(dialog.Sb()) != null) {
                    return context.getString(R.string.vkim_group);
                }
            } else if (Hb != null) {
                if (Hb.j) {
                    return context.getString(R.string.vkim_msg_header_chat_is_left);
                }
                if (Hb.i) {
                    return context.getString(R.string.vkim_msg_header_chat_is_kicked);
                }
                Resources resources2 = context.getResources();
                int i3 = Hb.f;
                return resources2.getQuantityString(R.plurals.vkim_msg_header_chat_count, i3, Integer.valueOf(i3));
            }
        }
        return "";
    }

    public final String b(Dialog dialog, int i) {
        ChatSettings Hb;
        if (dialog == null || (Hb = dialog.Hb()) == null) {
            return "";
        }
        int i2 = Hb.f;
        boolean z = Hb.j;
        Context context = this.a;
        return z ? context.getString(R.string.vkim_msg_header_chat_is_left) : Hb.i ? context.getString(R.string.vkim_msg_header_chat_is_kicked) : context.getResources().getQuantityString(R.plurals.vkim_msg_header_chat_count_with_online, i2, Integer.valueOf(i2), Integer.valueOf(Math.min(i2, i)));
    }
}
