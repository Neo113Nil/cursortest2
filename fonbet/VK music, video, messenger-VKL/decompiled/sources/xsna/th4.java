package xsna;

import android.content.Context;
import android.view.View;
import com.facebook.soloader.MinElf;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookItem;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookOfflineVh;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.money.MoneyTransfer;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.user.UserProfile;
import com.vk.music.common.MusicPlaybackLaunchContext;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class th4 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ th4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AudioBook audioBook;
        switch (this.b) {
            case 0:
                AudioBookOfflineVh audioBookOfflineVh = (AudioBookOfflineVh) this.c;
                Context context = ((VkRichCell) this.d).getContext();
                UIBlockAudioBookItem uIBlockAudioBookItem = audioBookOfflineVh.c;
                if (uIBlockAudioBookItem != null && (audioBook = uIBlockAudioBookItem.y) != null && context != null) {
                    CatalogLaunchOrigin catalogLaunchOrigin = uIBlockAudioBookItem.p;
                    if (catalogLaunchOrigin == null) {
                        catalogLaunchOrigin = CatalogLaunchOrigin.UNKNOWN;
                    }
                    String str = uIBlockAudioBookItem.b;
                    if (str == null) {
                        str = "";
                    }
                    audioBookOfflineVh.b.o(context, audioBook.b, MusicPlaybackLaunchContext.Fb(str).Cb(catalogLaunchOrigin.h()), audioBook.c);
                    break;
                }
                break;
            case 1:
                com.vk.music.notifications.restriction.d dVar = (com.vk.music.notifications.restriction.d) this.c;
                String str2 = (String) this.d;
                s750 s750Var = dVar.b;
                s750Var.j0(str2, true);
                s750Var.X(str2, "continue_free");
                break;
            case 2:
                p730 p730Var = (p730) this.c;
                UserProfile userProfile = (UserProfile) this.d;
                MoneyTransfer moneyTransfer = p730Var.k1;
                if (moneyTransfer != null && !moneyTransfer.l) {
                    xwk.e().m(p730Var.requireContext(), userProfile.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    p730Var.dismiss();
                    break;
                }
                break;
            case 3:
                nzk0 nzk0Var = (nzk0) this.c;
                dw20 dw20Var = (dw20) this.d;
                gzs<s3q0> gzsVar = nzk0Var.g;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                dw20Var.hide();
                break;
            default:
                mbz0 mbz0Var = (mbz0) this.c;
                wty0 wty0Var = (wty0) this.d;
                b9z0 b9z0Var = mbz0Var.b;
                fvy0 fvy0Var = mbz0Var.j;
                if (fvy0Var == null || !fvy0Var.c()) {
                    fvy0 fvy0Var2 = mbz0Var.j;
                    if (fvy0Var2 != null) {
                        fvy0Var2.b(b9z0Var.getContext());
                        break;
                    } else {
                        de.L(wty0Var.b, null, null, null, b9z0Var.getContext());
                        break;
                    }
                }
                break;
        }
    }
}
