package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.e3m;
import xsna.msw0;

/* compiled from: VoipMediaSettingDialogParticipantWatchTogetherMapper.kt */
/* loaded from: classes7.dex */
public final class tsw0 implements msw0.b {
    public final Context a;
    public final String b;

    /* compiled from: VoipMediaSettingDialogParticipantWatchTogetherMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaOptionState.values().length];
            try {
                iArr[MediaOptionState.UNMUTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaOptionState.UNMUTED_BUT_MUTED_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaOptionState.MUTED_PERMANENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public tsw0(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // xsna.msw0.b
    public final boolean a(msw0.c cVar) {
        int i = a.$EnumSwitchMapping$0[cVar.b.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.msw0.b
    public final String b(msw0.c cVar) {
        int i;
        int i2 = a.$EnumSwitchMapping$0[cVar.b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = R.string.voip_media_setting_dialog_participant_watch_together_title_disable;
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.voip_media_setting_dialog_participant_watch_together_title_enable;
        }
        return this.a.getString(i, this.b);
    }

    @Override // xsna.msw0.b
    public final String c(msw0.c cVar) {
        int i;
        int i2 = a.$EnumSwitchMapping$0[cVar.b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = R.string.voip_media_setting_dialog_disable_once;
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.voip_media_setting_dialog_participant_video_button_enable;
        }
        return this.a.getString(i);
    }

    @Override // xsna.msw0.b
    public final String d(msw0.c cVar) {
        int i = a.$EnumSwitchMapping$0[cVar.b.ordinal()];
        if (i == 1 || i == 2) {
            return this.a.getString(R.string.voip_media_setting_dialog_disable_permanent);
        }
        if (i == 3 || i == 4) {
            return "";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.msw0.b
    public final Drawable getIcon() {
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(R.drawable.vk_icon_videocam_outline_56, this.a);
        if (a2 != null) {
            return a2;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
