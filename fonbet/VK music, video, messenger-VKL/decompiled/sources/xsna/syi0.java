package xsna;

import com.vk.dto.common.data.LikeInfo;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: SetLikesInfoModifier.kt */
/* loaded from: classes4.dex */
public final class syi0 implements wm60 {
    public final NewsEntry a;
    public final List<LikeInfo> b;

    public syi0(NewsEntry newsEntry, List<LikeInfo> list) {
        this.a = newsEntry;
        this.b = list;
    }

    @Override // xsna.wm60
    public final boolean a(wm60 wm60Var) {
        return !(wm60Var instanceof syi0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wm60
    public final List<u1c0> c(List<? extends u1c0> list, i170 i170Var) {
        for (u1c0 u1c0Var : list) {
            if (epx.f(u1c0Var.a, this.a) && rl3.y0(new Integer[]{73, 341}).contains(Integer.valueOf(u1c0Var.c))) {
                u1c0Var.g = this.b;
            }
        }
        return list;
    }
}
