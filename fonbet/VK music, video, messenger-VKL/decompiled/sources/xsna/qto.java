package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.feed.core.models.dzen.DzenFooter;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.info.InfoPopup;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeDzenShowMoreClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.LazyThreadSafetyMode;
import xsna.tlo0;

/* compiled from: DzenNewsFooterHolder.kt */
/* loaded from: classes4.dex */
public final class qto extends qi6<DzenNews> implements View.OnClickListener {
    public final VkMiniInfoCell C;
    public final tvw D;
    public final Object E;
    public final Object F;
    public final Object G;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qto(ViewGroup viewGroup) {
        super(r0);
        VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell(viewGroup.getContext(), null, 6);
        vkMiniInfoCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        getContext();
        View view = this.itemView;
        VkMiniInfoCell vkMiniInfoCell2 = view instanceof VkMiniInfoCell ? (VkMiniInfoCell) view : null;
        this.C = vkMiniInfoCell2;
        this.D = new tvw();
        nef nefVar = new nef(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E = msy.a(lazyThreadSafetyMode, nefVar);
        this.F = msy.a(lazyThreadSafetyMode, new sim(this, 3));
        this.G = msy.a(lazyThreadSafetyMode, new atm(this, 2));
        if (vkMiniInfoCell2 != null) {
            vkMiniInfoCell2.setOnClickListener(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qi6
    public final void E6(DzenNews dzenNews) {
        DzenNews dzenNews2 = dzenNews;
        DzenFooter dzenFooter = dzenNews2.n;
        boolean z = dzenNews2.q;
        VkMiniInfoCell vkMiniInfoCell = this.C;
        if (!z || dzenFooter == null) {
            if (vkMiniInfoCell == null) {
                return;
            }
            vkMiniInfoCell.setMode(VkMiniInfoCell.Mode.MoreInfo);
            vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(oq.d(tlo0.Companion, dzenNews2.m), false, false, false, false, null, 60));
            vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new eko((baf0) this.F.getValue()), null, 4));
            return;
        }
        if (vkMiniInfoCell == null) {
            return;
        }
        vkMiniInfoCell.setMode(VkMiniInfoCell.Mode.Base);
        tlo0.a aVar = tlo0.Companion;
        String str = dzenFooter.b;
        if (str == null) {
            str = "";
        }
        vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(oq.d(aVar, str), false, false, false, false, null, 60));
        vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new eko((baf0) this.E.getValue()), null, 4));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DzenNews q6;
        DzenNews q62;
        if (jjc.b() || (q6 = q6()) == null) {
            return;
        }
        DzenFooter dzenFooter = q6.n;
        if (q6.q && dzenFooter != null) {
            InfoPopup infoPopup = dzenFooter.c;
            if (infoPopup != null) {
                Context context = this.itemView.getContext();
                this.D.getClass();
                tvw.a(context, infoPopup);
                return;
            }
            return;
        }
        ((p870) this.G.getValue()).e(144, q6);
        String str = q6.o;
        if (str == null || (q62 = q6()) == null) {
            return;
        }
        q62.p++;
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.DZEN_STORY, null, null, null, str, null, 46, null), new MobileOfficialAppsFeedStat$TypeDzenShowMoreClick(q62.p, str), 2)).q();
    }
}
