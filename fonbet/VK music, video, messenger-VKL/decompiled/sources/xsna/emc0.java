package xsna;

import com.vk.dto.posting.DonutPostingSettings;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.DonutSettingsDialogConfig;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.fhc0;

/* compiled from: PostingSettingsViewNew.kt */
/* loaded from: classes4.dex */
public final class emc0 {
    public final /* synthetic */ dmc0 a;

    /* compiled from: PostingSettingsViewNew.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DonutSettingsDialogConfig.Mode.values().length];
            try {
                iArr[DonutSettingsDialogConfig.Mode.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DonutSettingsDialogConfig.Mode.Dones.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public emc0(dmc0 dmc0Var) {
        this.a = dmc0Var;
    }

    public final void a(DonutSettingsDialogConfig.Mode mode) {
        Object obj;
        DonutSettingsDialogConfig.Mode mode2;
        dmc0 dmc0Var = this.a;
        bpn0 bpn0Var = dmc0Var.g;
        int i = a.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            ((fhc0.e) bpn0Var.getValue()).k(dmc0Var.b);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ((fhc0.e) bpn0Var.getValue()).l(dmc0Var.b);
        }
        ylc0 ylc0Var = dmc0Var.c;
        if (ylc0Var != null) {
            xch b = ylc0Var.b();
            qdc0 qdc0Var = b.d;
            boolean z = mode == DonutSettingsDialogConfig.Mode.Dones;
            qdc0Var.j2(z);
            if (z) {
                Iterator<T> it = qdc0Var.B6().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((DonutPostingSettings.Duration) obj).b < 0) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                b.a((DonutPostingSettings.Duration) obj);
            } else {
                b.a(null);
            }
            List<PostingSettingsCommunityItem> list = b.g.a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (zif0 zif0Var : list) {
                if (zif0Var instanceof PostingSettingsCommunityItem.b) {
                    PostingSettingsCommunityItem.b bVar = (PostingSettingsCommunityItem.b) zif0Var;
                    DonutPostingSettings.Duration duration = bVar.c;
                    mode2 = mode;
                    zif0Var = PostingSettingsCommunityItem.b.d(bVar, mode2, (duration == null || !z) ? null : duration, false, false, false, 28);
                } else {
                    mode2 = mode;
                }
                arrayList.add(zif0Var);
                mode = mode2;
            }
            b.g = new rlc0(arrayList);
            b.b();
        }
    }
}
