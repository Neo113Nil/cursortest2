package xsna;

import android.view.View;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.core.view.search.ModernSearchView;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.im.settings.DarkThemeTimetableFragment;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.im.ui.fragments.ImStartGroupCallFragment;
import com.vk.stat.scheme.SchemeStat$TypeClickItem;
import xsna.q4a0;
import xsna.r1q0;
import xsna.s4e0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class yb implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        uy<Object> uyVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((zb) obj).l.d();
                break;
            case 1:
                v60 v60Var = (v60) obj;
                zt<Object> ztVar = v60Var.o;
                if (ztVar != null && (uyVar = v60Var.p) != null) {
                    uyVar.a(ztVar);
                    break;
                }
                break;
            case 2:
                int i2 = AppearanceSettingsWithBackgroundsFragment.b0;
                new DarkThemeTimetableFragment.a(DarkThemeTimetableFragment.class, null, null).k(((AppearanceSettingsWithBackgroundsFragment) obj).getActivity());
                r1q0.a.a(SchemeStat$TypeClickItem.Subtype.THEME_TIMETABLE_SETTINGS);
                break;
            case 3:
                ((vzb) obj).a(2);
                break;
            case 4:
                ((w6d) obj).e.a(ClipItemViewEvent.o.b);
                break;
            case 5:
                q4a0.b bVar = ((fzt) obj).e;
                if (bVar != null) {
                    bVar.a();
                    break;
                }
                break;
            case 6:
                int i3 = ImStartGroupCallFragment.f0;
                ((ImStartGroupCallFragment) obj).Mf(0, null);
                break;
            case 7:
                int i4 = MarketEditAlbumGoodsFragment.c1;
                ((MarketEditAlbumGoodsFragment) obj).No();
                break;
            case 8:
                gzs gzsVar = (gzs) obj;
                h94 h94Var = ModernSearchView.y;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 9:
                s4e0.c cVar = ((s4e0.a) obj).e;
                if (cVar != null) {
                    cVar.a(view, 1);
                    break;
                }
                break;
            default:
                b30 b30Var = ((f3y0) obj).O;
                if (b30Var != null) {
                    ((h30) b30Var).c();
                    break;
                }
                break;
        }
    }
}
