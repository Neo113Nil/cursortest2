package xsna;

import android.view.View;
import com.vk.audiomsg.player.Speed;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.cell.rich.middle.VkRichCellMiddleText;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.vk.photo.editor.markup.view.tools.BrushesPanel;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.Iterator;
import xsna.i0d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class z01 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z01(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((b11) obj2).b.a(AdsItemViewEvent.f.b);
                break;
            case 1:
                rr4 rr4Var = (rr4) obj2;
                Iterator it = rl3.m0(Speed.values(), new sr4(0)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((Speed) next).i() > rr4Var.m.i()) {
                            obj = next;
                        }
                    }
                }
                Speed speed = (Speed) obj;
                if (speed == null) {
                    speed = Speed.X1;
                }
                jr4 jr4Var = jr4.this;
                jr4Var.j.w(jr4Var.k, speed);
                break;
            case 2:
                int i2 = BrushesPanel.j;
                ((BrushesPanel) obj2).b(BrushesPanel.BrushType.Eraser);
                break;
            case 3:
                i0d.a aVar = (i0d.a) obj2;
                if (aVar.getBindingAdapterPosition() != -1) {
                    Object tag = aVar.itemView.getTag();
                    VideoFile videoFile = tag instanceof VideoFile ? (VideoFile) tag : null;
                    if (videoFile != null) {
                        String r = videoFile.r();
                        if (r != null) {
                            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, null, null, null, r, null, 46, null), new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.CLICK, CommonVideoStat$TypeScreenMode.DISCOVERY), 2);
                            UiTracker uiTracker = UiTracker.a;
                            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                            uzp0 uzp0Var = UiTracker.h;
                            uzp0Var.getClass();
                            new bjc(c, b, uzp0Var.a).q();
                        }
                        aVar.l.invoke(videoFile);
                        break;
                    }
                }
                break;
            case 4:
                int i3 = MarketEditAlbumCoverFragment.d0;
                ((MarketEditAlbumCoverFragment) obj2).ko();
                break;
            case 5:
                nw20 nw20Var = (nw20) obj2;
                nw20Var.Q0 = true;
                hz20 hz20Var = nw20Var.M;
                if (hz20Var != null) {
                    hz20Var.a(-2);
                }
                if (nw20Var.q) {
                    nw20Var.dismiss();
                    break;
                }
                break;
            case 6:
                dw20 dw20Var = ((y4v0) obj2).c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                    break;
                }
                break;
            default:
                int i4 = VkRichCellMiddleText.i;
                ((gzs) obj2).invoke();
                break;
        }
    }
}
