package xsna;

import android.content.Context;
import com.vk.channels.impl.channel_screen.RefreshInfo;
import com.vkontakte.android.R;

/* compiled from: RefreshInfoProcessor.kt */
/* loaded from: classes16.dex */
public final class kpf0 {
    public final Context a;

    /* compiled from: RefreshInfoProcessor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshInfo.values().length];
            try {
                iArr[RefreshInfo.REFRESHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RefreshInfo.WAIT_FOR_NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RefreshInfo.DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RefreshInfo.CONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kpf0(Context context) {
        this.a = context;
    }

    public final String a(RefreshInfo refreshInfo) {
        int i = a.$EnumSwitchMapping$0[refreshInfo.ordinal()];
        Context context = this.a;
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? context.getString(R.string.vkim_sync_state_connecting_dots) : context.getString(R.string.vkim_sync_state_connecting_dots) : context.getString(R.string.vkim_sync_state_wait_for_network_dots) : context.getString(R.string.vkim_sync_state_refreshing_dots);
    }
}
