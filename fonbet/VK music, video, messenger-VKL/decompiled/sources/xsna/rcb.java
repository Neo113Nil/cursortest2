package xsna;

import com.vk.im.ui.components.common.AvatarAction;
import com.vkontakte.android.R;
import xsna.cwb0;

/* compiled from: ChannelSettingsVc.kt */
/* loaded from: classes16.dex */
public final class rcb extends xwb {
    public final ecb o;

    /* compiled from: ChannelSettingsVc.kt */
    public static final class a extends cwb0.s0 {
        public static final a e = new a(null, R.string.vkim_popup_channel_avatar_change_progress_desc, 5);
    }

    /* compiled from: ChannelSettingsVc.kt */
    public static final class b extends cwb0.s0 {
        public static final b e = new b(null, R.string.vkim_popup_channel_avatar_remove_progress_desc, 5);
    }

    /* compiled from: ChannelSettingsVc.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarAction.values().length];
            try {
                iArr[AvatarAction.REMOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcb(ecb ecbVar, kkm kkmVar) {
        super(ecbVar, kkmVar, R.string.vkim_channel_profile_channel_settings);
        ucp ucpVar = ucp.a;
        this.o = ecbVar;
    }

    @Override // xsna.xwb, xsna.kcb.a.InterfaceC3174a
    public final void R(boolean z) {
        this.o.R(z);
    }

    @Override // xsna.xwb, xsna.kcb.a.InterfaceC3174a
    public final void q0(String str) {
        this.o.q0(str);
    }
}
