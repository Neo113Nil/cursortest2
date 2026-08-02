package xsna;

import com.vk.dto.posting.DonutPostingSettings;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.community.PostingSettingsCommunityView;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import java.util.ArrayList;
import java.util.List;
import xsna.fhc0;

/* compiled from: CommunityPostingSettingsDelegateImpl.kt */
/* loaded from: classes4.dex */
public final class xch {
    public final dmc0 a;
    public final jbc0 b;
    public final fhc0.e c;
    public final qdc0 d;
    public ckc0 e;
    public PostingMetricsCreationEntryPoint f = PostingMetricsCreationEntryPoint.Other;
    public rlc0 g = new rlc0(e43.l(new PostingSettingsCommunityItem.d(0), new PostingSettingsCommunityItem.b(0), new PostingSettingsCommunityItem.c(0), new PostingSettingsCommunityItem.a(0)));
    public boolean h = true;

    public xch(dmc0 dmc0Var, jbc0 jbc0Var, fhc0.e eVar, qdc0 qdc0Var) {
        this.a = dmc0Var;
        this.b = jbc0Var;
        this.c = eVar;
        this.d = qdc0Var;
    }

    public final void a(DonutPostingSettings.Duration duration) {
        DonutPostingSettings.Duration duration2;
        this.d.M6(duration != null ? Integer.valueOf(duration.b) : null);
        List<PostingSettingsCommunityItem> list = this.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.b) {
                duration2 = duration;
                zif0Var = PostingSettingsCommunityItem.b.d((PostingSettingsCommunityItem.b) zif0Var, null, duration2, false, false, false, 29);
            } else {
                duration2 = duration;
            }
            arrayList.add(zif0Var);
            duration = duration2;
        }
        this.g = new rlc0(arrayList);
        b();
    }

    public final void b() {
        rlc0 rlc0Var = this.g;
        PostingSettingsCommunityView postingSettingsCommunityView = this.a.i;
        if (postingSettingsCommunityView != null) {
            qlc0 qlc0Var = postingSettingsCommunityView.b;
            List<PostingSettingsCommunityItem> list = rlc0Var.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((PostingSettingsCommunityItem) obj).c()) {
                    arrayList.add(obj);
                }
            }
            qlc0Var.setItems(arrayList);
        }
    }
}
