package xsna;

import android.view.View;
import android.widget.Toast;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Attachment;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.tooltips.VideoTooltip;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stickers.roulette.StickersRouletteFragment;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import one.video.ad.ux.controls.OneVideoAdControlsViewNew;
import xsna.cs00;
import xsna.msf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cnw implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cnw(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var;
        String str;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((fnw) obj).e.a(null);
                break;
            case 1:
                zr00 zr00Var = (zr00) obj;
                xr00 xr00Var = zr00Var.v;
                if (xr00Var != null) {
                    zr00Var.l.a(new cs00.e(xr00Var.b, zr00Var.n));
                    break;
                }
                break;
            case 2:
                ((dw20) obj).hide();
                break;
            case 3:
                int i2 = OneVideoAdControlsViewNew.E;
                OneVideoAdBaseControls.a listener = ((OneVideoAdControlsViewNew) obj).getListener();
                if (listener != null) {
                    listener.c();
                    break;
                }
                break;
            case 4:
                ev90 ev90Var = (ev90) obj;
                Attachment attachment = ev90Var.d;
                if (attachment != null && (x64Var = ev90Var.o) != null) {
                    x64Var.c(attachment);
                    break;
                }
                break;
            case 5:
                rsf0 rsf0Var = (rsf0) obj;
                try {
                    String string = gnj.a(rsf0Var.c.getContext()).getString("com.vk.sdk.RELATED_PROFILE_PREFIX", null);
                    if (string != null) {
                        if (!drm0.N(string)) {
                            r2 = string;
                        }
                    }
                } catch (Throwable unused) {
                }
                if (r2 == null) {
                    r2 = "vkid_";
                }
                rsf0Var.d.invoke(new msf0.n(r2.concat("forgot_pincode")));
                break;
            case 6:
                ((awk0) obj).a.a(bxk0.b);
                break;
            case 7:
                StickersRouletteFragment stickersRouletteFragment = (StickersRouletteFragment) obj;
                SearchStatsLoggingInfo searchStatsLoggingInfo = stickersRouletteFragment.i0;
                if (searchStatsLoggingInfo != null && (str = searchStatsLoggingInfo.f) != null) {
                    SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, null, null, null, str, null, 46, null), new MobileOfficialAppsSearchStat$TypeSearchClickItem(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.BUY_OUT, null, null, null, null, 30, null), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c, b, uzp0Var.a).q();
                }
                ocl0 ocl0Var = (ocl0) stickersRouletteFragment.S;
                if (ocl0Var != null) {
                    obl0 e = g2v.d().e(stickersRouletteFragment.kn());
                    SearchStatsLoggingInfo searchStatsLoggingInfo2 = stickersRouletteFragment.i0;
                    ocl0Var.M0(e, searchStatsLoggingInfo2 != null ? searchStatsLoggingInfo2.f : null, stickersRouletteFragment.j0);
                    break;
                }
                break;
            case 8:
                Toast.makeText(((b5p0) obj).itemView.getContext(), "Target click!", 0).show();
                break;
            case 9:
                lps0 lps0Var = (lps0) obj;
                x64 x64Var2 = lps0Var.o;
                if (x64Var2 != null) {
                    x64Var2.c(lps0Var.d);
                    break;
                }
                break;
            case 10:
                ((VideoTooltip.a) obj).onClick();
                break;
            default:
                ((m5o0) obj).invoke();
                break;
        }
    }
}
