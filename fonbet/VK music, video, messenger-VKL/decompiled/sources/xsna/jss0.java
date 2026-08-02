package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import java.text.NumberFormat;
import java.util.Locale;
import xsna.dw20;

/* compiled from: VideoLinkStatsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class jss0 extends kq6 {
    public final Context c;
    public final dz20 d;
    public final VideoFile e;

    public jss0(Context context, VideoFile videoFile, dz20 dz20Var) {
        this.c = context;
        this.d = dz20Var;
        this.e = videoFile;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        dw20.a c;
        o20 o20Var = new o20();
        o20Var.a = NumberFormat.getPercentInstance(Locale.US);
        VideoFile videoFile = this.e;
        o20Var.b = rsg0.y0(new qtt(videoFile.I0(), videoFile.o0()), null, null, 3).subscribe(new m20(new com.vk.im.engine.internal.api_commands.messages.a(o20Var, 2), 0), new n20(new com.vk.im.engine.internal.storage.delegates.messages.b(o20Var, 2), 0));
        Context context = this.c;
        dw20.b d0 = new dw20.b(context, null).v0(R.string.video_action_link_stat_sheet_title).a0(new a94(19, this, o20Var)).d0(new pis0(this, 3));
        View inflate = LayoutInflater.from(context).inflate(R.layout.video_action_link_stat_details_view, (ViewGroup) new FrameLayout(context), false);
        o20Var.d = (TextView) inflate.findViewById(R.id.view_count_value);
        o20Var.c = (TextView) inflate.findViewById(R.id.clicks_count_value);
        o20Var.e = (TextView) inflate.findViewById(R.id.clicks_ratio_count_value);
        o20Var.f = (TextView) inflate.findViewById(R.id.description);
        ViewGroup viewGroup = inflate instanceof ViewGroup ? (ViewGroup) inflate : null;
        o20Var.g = viewGroup;
        if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                bwt0.p0(childAt, R.id.progress == childAt.getId());
            }
        }
        c = d0.D0(inflate, false).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
        return ((dw20.b) c).I0("video_link_stats_bottom_sheet");
    }
}
