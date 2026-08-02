package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.entities.OrdData;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsArguments;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.tlo0;

/* compiled from: SettingsViewStateMapper.kt */
/* loaded from: classes7.dex */
public final class y3j0 implements izs<SettingsState, o3j0> {
    public final SettingsArguments b;

    public y3j0(SettingsArguments settingsArguments) {
        this.b = settingsArguments;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o3j0 invoke(SettingsState settingsState) {
        boolean z;
        List<VideoFile> list;
        b64 b64Var;
        SettingsState settingsState2 = settingsState;
        VideoFile videoFile = this.b.i;
        if (videoFile != null) {
            gpt0 gpt0Var = gpt0.a;
            if (gpt0.B(videoFile)) {
                z = true;
                list = settingsState2.b;
                Boolean bool = settingsState2.h;
                Boolean bool2 = settingsState2.g;
                Boolean bool3 = settingsState2.f;
                if (list == null) {
                    List<VideoFile> list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    for (VideoFile videoFile2 : list2) {
                        arrayList.add(new s44(videoFile2.a1(), ixj0.h(videoFile2.getImage().b)));
                    }
                    b64Var = new b64(arrayList);
                } else {
                    b64Var = null;
                }
                boolean z2 = settingsState2.c;
                zzi0 zzi0Var = bool3 == null ? new zzi0(tq.h(tlo0.Companion, R.string.setting_compress_title), new tlo0.f(R.string.setting_compress_subtitle), bool3.booleanValue()) : null;
                zzi0 zzi0Var2 = bool2 == null ? new zzi0(tq.h(tlo0.Companion, R.string.setting_show_on_community_main_title), new tlo0.f(R.string.setting_show_on_community_main_subtitle), bool2.booleanValue()) : null;
                zzi0 zzi0Var3 = bool != null ? new zzi0(tq.h(tlo0.Companion, R.string.setting_show_on_user_main_title), new tlo0.f(R.string.setting_show_on_user_main_subtitle), bool.booleanValue()) : null;
                zzi0 zzi0Var4 = zzi0Var2;
                zzi0 zzi0Var5 = zzi0Var3;
                tlo0.f h = tq.h(tlo0.Companion, R.string.video_ord_title);
                OrdData ordData = settingsState2.i;
                return new o3j0(z, b64Var, z2, zzi0Var, zzi0Var4, zzi0Var5, new uzi0(h, (ordData == null && ordData.b) ? new tlo0.f(R.string.video_ord_added) : new tlo0.f(R.string.video_ord_not_added), false), settingsState2.j);
            }
        }
        z = false;
        list = settingsState2.b;
        Boolean bool4 = settingsState2.h;
        Boolean bool22 = settingsState2.g;
        Boolean bool32 = settingsState2.f;
        if (list == null) {
        }
        boolean z22 = settingsState2.c;
        if (bool32 == null) {
        }
        if (bool22 == null) {
        }
        if (bool4 != null) {
        }
        zzi0 zzi0Var42 = zzi0Var2;
        zzi0 zzi0Var52 = zzi0Var3;
        tlo0.f h2 = tq.h(tlo0.Companion, R.string.video_ord_title);
        OrdData ordData2 = settingsState2.i;
        return new o3j0(z, b64Var, z22, zzi0Var, zzi0Var42, zzi0Var52, new uzi0(h2, (ordData2 == null && ordData2.b) ? new tlo0.f(R.string.video_ord_added) : new tlo0.f(R.string.video_ord_not_added), false), settingsState2.j);
    }
}
