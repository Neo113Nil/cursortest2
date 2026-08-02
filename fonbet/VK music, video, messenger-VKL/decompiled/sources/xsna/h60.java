package xsna;

import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.dto.common.Source;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchMarketCatalogRootVh;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import xsna.bi9;
import xsna.ygb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class h60 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((q60) obj2).invoke(obj);
                break;
            case 1:
                ((a8) obj2).invoke(obj);
                break;
            case 2:
                ((a8) obj2).invoke(obj);
                break;
            case 3:
                ((a8) obj2).invoke(obj);
                break;
            case 4:
                ((a8) obj2).invoke(obj);
                break;
            case 5:
                int i2 = CallParticipantsFragment.W;
                ((a8) obj2).invoke(obj);
                break;
            case 6:
                ((com.vk.im.ui.fragments.b) obj2).invoke(obj);
                break;
            case 7:
                ((a8) obj2).invoke(obj);
                break;
            case 8:
                ((bi9.a) obj2).invoke(obj);
                break;
            case 9:
                int i3 = ChannelFragment.a1;
                ((a8) obj2).invoke(obj);
                break;
            case 10:
                ((io.reactivex.rxjava3.subjects.d) obj2).onNext((ygb.a) obj);
                break;
            case 11:
                ((g60) obj2).invoke(obj);
                break;
            case 12:
                ((a8) obj2).invoke(obj);
                break;
            case 13:
                ((a8) obj2).invoke(obj);
                break;
            case 14:
                int i4 = CommunityAddressesFragment.E0;
                ((py) obj2).invoke(obj);
                break;
            case 15:
                ((nhe) obj2).invoke(obj);
                break;
            case 16:
                int i5 = d2h.p1;
                ((nhe) obj2).invoke(obj);
                break;
            case 17:
                ((nhe) obj2).invoke(obj);
                break;
            case 18:
                ((izs) obj2).invoke(obj);
                break;
            case 19:
                l8j l8jVar = (l8j) obj2;
                l8jVar.r.a(((ipm) obj).a(l8jVar.n.b));
                l8jVar.Y0(Source.NETWORK);
                break;
            case 20:
                ((qb6) obj2).invoke(obj);
                break;
            case 21:
                ((nhe) obj2).invoke(obj);
                break;
            case 22:
                ((nhe) obj2).invoke(obj);
                break;
            case 23:
                ((nhe) obj2).invoke(obj);
                break;
            case 24:
                ((nhe) obj2).invoke(obj);
                break;
            case 25:
                ((nhe) obj2).invoke(obj);
                break;
            case 26:
                ((GlobalSearchMarketCatalogRootVh.a) obj2).invoke(obj);
                break;
            case 27:
                ((qb6) obj2).invoke(obj);
                break;
            case 28:
                int i6 = ImDialogsSelectionFragment.n0;
                ((k82) obj2).invoke(obj);
                break;
            default:
                ((fju) obj2).invoke(obj);
                break;
        }
    }
}
