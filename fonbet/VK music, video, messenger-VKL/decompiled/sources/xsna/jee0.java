package xsna;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: PublishSettingsViewNew.kt */
/* loaded from: classes16.dex */
public final class jee0 extends FrameLayout {
    public final View b;

    public jee0(l7s l7sVar) {
        super(l7sVar, null, 0);
        LayoutInflater.from(l7sVar).inflate(R.layout.live_end_broadcast_settings_new, (ViewGroup) this, true);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        dhr0.a.getClass();
        setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, dhr0.s()));
        ((VkTopBar) findViewById(R.id.end_settings_top_bar)).setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.live_broadcast_end_screen_save_record_caption), null, null, null, null, 30), new VkTopBar.Middle.Text.c(new tlo0.f(R.string.live_broadcast_end_screen_save_to_my_clips_and_video), null, null, 30), null, null, 12));
        VkCell vkCell = (VkCell) findViewById(R.id.live_end_broadcast_settings_to_my_story_holder);
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(new tlo0.f(R.string.live_broadcast_end_screen_save_to_my_stories), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d(new tlo0.f(R.string.live_broadcast_end_screen_save_to_my_stories_desc), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.f(4, new r(24), fxc0.B().T().t()), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
        VkCell vkCell2 = (VkCell) findViewById(R.id.live_end_broadcast_settings_to_my_wall_holder);
        vkCell2.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(new tlo0.f(R.string.live_broadcast_end_screen_share_to_my_wall), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d(new tlo0.f(R.string.live_broadcast_end_screen_share_to_my_wall_desc), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        vkCell2.setRight(new VkCell.Right.d(new VkCell.Right.a.f(4, new fd90(3), fxc0.B().T().y()), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
        this.b = findViewById(R.id.live_end_broadcast_settings_positive_button);
    }

    public final View getAcceptBtn() {
        return this.b;
    }
}
