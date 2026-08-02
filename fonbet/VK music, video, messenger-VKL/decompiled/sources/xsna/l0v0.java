package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.webapp.fragments.ReportFragment;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* compiled from: VkImReportBridge.kt */
/* loaded from: classes7.dex */
public final class l0v0 implements obw {
    public static final l0v0 a = new l0v0();

    /* compiled from: VkImReportBridge.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChannelType.values().length];
            try {
                iArr[ChannelType.COMMUNITY_CHANNEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChannelType.PERSONAL_CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.obw
    public final void a(Context context, long j, int i, ChannelType channelType) {
        String str;
        int i2 = a.$EnumSwitchMapping$0[channelType.ordinal()];
        if (i2 == 1) {
            str = "channel";
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("Can report only community and personal channels posts");
            }
            str = "user_channel_post";
        }
        int i3 = ReportFragment.a0;
        ReportFragment.a a2 = ReportFragment.b.a();
        a2.K(str);
        a2.G(new UserId(j));
        a2.D(i);
        a2.s(true);
        a2.k(context);
    }

    public final void b(Context context, UserId userId, List<Integer> list) {
        int i = ReportFragment.a0;
        ReportFragment.a a2 = ReportFragment.b.a();
        a2.K("message");
        if (list.size() == 1) {
            a2.D(((Number) j5g.Y(list)).intValue());
        } else {
            a2.m = a2.m.buildUpon().appendQueryParameter("object_ids", j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62)).build();
            a2.N();
        }
        a2.G(userId);
        a2.s(true);
        a2.k(context);
    }
}
