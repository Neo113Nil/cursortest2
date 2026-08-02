package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import xsna.av20;
import xsna.dw20;

/* compiled from: VideoActionLinkBottomSheet.kt */
/* loaded from: classes2.dex */
public final class lxr0 extends kq6 {
    public final Activity c;
    public final dz20 d;
    public final kz20 e;
    public final VideoFile f;
    public final Object g = msy.a(LazyThreadSafetyMode.NONE, new bpc0(7));

    /* compiled from: VideoActionLinkBottomSheet.kt */
    public static final class a {
        public static final e520 a = new e520(R.id.video_action_link_open, 0, R.string.video_action_link_bottom_sheet_open, 0, false, 0, 0, false, null, 0, null, false, 8178);
        public static final e520 b = new e520(R.id.video_action_link_stat, 0, R.string.video_action_link_bottom_sheet_stat, 1, false, 0, 0, false, null, 0, null, false, 8178);
        public static final e520 c = new e520(R.id.video_action_link_remove, 0, R.string.video_action_link_bottom_sheet_remove, 2, false, 0, 0, false, null, 0, null, false, 8178);
    }

    public lxr0(Activity activity, dz20 dz20Var, kz20 kz20Var, VideoFile videoFile) {
        this.c = activity;
        this.d = dz20Var;
        this.e = kz20Var;
        this.f = videoFile;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        av20.a aVar = new av20.a();
        int i = dhr0.C().c;
        Activity activity = this.c;
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(new l7s(activity, i)));
        aVar.d = new in3(activity, 1);
        aVar.c(new kxr0(0, this, activity));
        av20 b = aVar.b();
        b.setItems(this.f.t0() ? e43.l(a.a, a.b, a.c) : Collections.singletonList(a.a));
        return ((dw20.b) dw20.a.k(new dw20.b(activity, null).u0(dhr0.C().c).a0(new mqe0(this, 23)).d0(new dbj0(this, 10)), b, 4)).I0("video_actions_link_details_bottom_sheet");
    }
}
