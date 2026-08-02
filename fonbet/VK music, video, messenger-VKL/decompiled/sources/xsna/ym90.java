package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vkontakte.android.R;
import xsna.av20;
import xsna.dw20;

/* compiled from: PastAsrListBottomSheet.kt */
/* loaded from: classes7.dex */
public final class ym90 extends kq6 {
    public final Activity c;
    public final ev3 d;
    public final in90<hn90> e;

    public ym90(FragmentActivity fragmentActivity, ev3 ev3Var, in90 in90Var) {
        this.c = fragmentActivity;
        this.d = ev3Var;
        this.e = in90Var;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        av20.a aVar = new av20.a();
        dhr0.a.getClass();
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(dhr0.E()));
        Activity activity = this.c;
        aVar.d = new wm90(activity);
        aVar.e = new xm90(this, activity);
        av20 b = aVar.b();
        b.setItems(e43.l(new e520(R.id.action_download, R.drawable.vk_icon_download_outline_28, R.string.voip_asr_list_menu_download, 1, false, 0, 0, false, null, 0, null, false, 8176), new e520(R.id.action_remove, R.drawable.vk_icon_delete_outline_android_28, R.string.voip_asr_list_menu_remove, 2, false, R.color.vk_red, 0, false, null, 0, null, false, 8144)));
        dw20.b bVar = new dw20.b(activity, null);
        ev3 ev3Var = this.d;
        dw20.b x0 = bVar.w0(ev3Var.b).A0(Integer.valueOf(R.style.VkLegacyTypography_Caption1_Medium)).z0(8388611).B0(Integer.valueOf(cn70.b(12))).x0(Integer.valueOf(cn70.b(4)));
        String str = ev3Var.f;
        if (str != null) {
            dw20.b bVar2 = x0;
            if (str == null) {
                str = "";
            }
            bVar2.s0(str);
            e.a aVar2 = bVar2.d;
            aVar2.d0 = Integer.valueOf(R.style.VkLegacyTypography_Caption1_Regular);
            aVar2.e0 = 8388611;
            aVar2.f0 = Integer.valueOf(cn70.b(4));
            aVar2.g0 = Integer.valueOf(cn70.b(16));
        }
        return ((dw20.b) dw20.a.k(x0.a0(new nuv(this, 19)), b, 4)).I0("PastAsrListBottomSheet");
    }
}
