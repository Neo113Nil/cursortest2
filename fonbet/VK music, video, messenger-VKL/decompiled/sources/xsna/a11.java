package xsna;

import android.view.View;
import com.vk.catalog2.feature.music.holders.playlist.MusicPlaylistVkTileVh;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.feed.blacklist.impl.presentation.blacklist.BlacklistFragment;
import com.vk.feed.blacklist.impl.presentation.blacklist.f;
import com.vk.photo.editor.markup.view.tools.BrushesPanel;
import com.yandex.div.core.view2.errors.ErrorView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class a11 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a11(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((b11) obj).b.a(AdsItemViewEvent.j.b);
                break;
            case 1:
                com.vk.feed.blacklist.impl.presentation.blacklist.c cVar = (com.vk.feed.blacklist.impl.presentation.blacklist.c) obj;
                do3 do3Var = cVar.p;
                if (do3Var != null) {
                    f.a.C1034a c1034a = new f.a.C1034a(((ge7) cVar.m).a);
                    BlacklistFragment blacklistFragment = (BlacklistFragment) do3Var.c;
                    int i2 = BlacklistFragment.V;
                    blacklistFragment.getFeature().g.b(c1034a);
                    break;
                }
                break;
            case 2:
                int i3 = BrushesPanel.j;
                ((BrushesPanel) obj).b(BrushesPanel.BrushType.Arrow);
                break;
            case 3:
                ((dxg) obj).f.invoke();
                break;
            case 4:
                ErrorView.tryAddCounterView$lambda$5$lambda$4((ErrorView) obj, view);
                break;
            default:
                ((MusicPlaylistVkTileVh.b) obj).invoke();
                break;
        }
    }
}
