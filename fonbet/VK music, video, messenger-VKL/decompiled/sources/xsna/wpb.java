package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import com.ironsource.G8;
import com.vk.core.preference.Preference;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vk.stickers.roulette.roulett_view.RouletteView;
import com.vkontakte.android.R;
import xsna.g2s0;
import xsna.vwb;
import xsna.xpb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wpb implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wpb(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m6a m6aVar;
        switch (this.b) {
            case 0:
                ((xpb.a) this.c).l.b((vwb.c) this.d);
                break;
            case 1:
                G8.a((G8) this.c, (G8.b) this.d, view);
                break;
            case 2:
                StickersRouletteFragment stickersRouletteFragment = (StickersRouletteFragment) this.c;
                ImageButton imageButton = (ImageButton) this.d;
                boolean z = !StickersRouletteFragment.ko();
                if (z != StickersRouletteFragment.ko()) {
                    Preference.I("random_sticker", "random_stickers_muted", z);
                }
                view.setSelected(StickersRouletteFragment.ko());
                RouletteView rouletteView = stickersRouletteFragment.W;
                if (rouletteView != null) {
                    rouletteView.setMuted(StickersRouletteFragment.ko());
                }
                Context context = imageButton.getContext();
                imageButton.setContentDescription(StickersRouletteFragment.ko() ? context.getString(R.string.roulette_accessibility_sound_on) : context.getString(R.string.roulette_accessibility_sound_off));
                break;
            default:
                g2s0.a aVar = (g2s0.a) this.c;
                g2s0 g2s0Var = (g2s0) this.d;
                HistoryAttach historyAttach = aVar.x;
                if (historyAttach != null && (m6aVar = g2s0Var.a) != null) {
                    m6aVar.b(historyAttach);
                    break;
                }
                break;
        }
    }
}
