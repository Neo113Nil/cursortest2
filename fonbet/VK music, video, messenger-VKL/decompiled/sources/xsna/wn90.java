package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import xsna.av20;
import xsna.dw20;

/* compiled from: PastBroadcastsBottomSheet.kt */
/* loaded from: classes7.dex */
public final class wn90 extends kq6 {
    public final Activity c;
    public final VideoFile d;
    public final so90<ro90> e;

    public wn90(FragmentActivity fragmentActivity, VideoFile videoFile, so90 so90Var) {
        this.c = fragmentActivity;
        this.d = videoFile;
        this.e = so90Var;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        av20.a aVar = new av20.a();
        dhr0.a.getClass();
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(dhr0.E()));
        Activity activity = this.c;
        aVar.d = new un90(activity);
        aVar.e = new vn90(this, activity);
        av20 b = aVar.b();
        b.setItems(e43.l(new e520(R.id.action_edit, R.drawable.vk_icon_edit_outline_28, R.string.video_edit, 1, false, 0, 0, false, null, 0, null, false, 8176), new e520(R.id.action_share, R.drawable.vk_icon_share_outline_28, R.string.video_share, 2, false, 0, 0, false, null, 0, null, false, 8176), new e520(R.id.action_remove, R.drawable.vk_icon_delete_outline_android_28, R.string.video_remove, 3, false, R.color.vk_red, 0, false, null, 0, null, false, 8144)));
        return ((dw20.b) dw20.a.k(new dw20.b(activity, null).a0(new b010(this, 22)), b, 4)).I0("past_broadcasts_options");
    }
}
