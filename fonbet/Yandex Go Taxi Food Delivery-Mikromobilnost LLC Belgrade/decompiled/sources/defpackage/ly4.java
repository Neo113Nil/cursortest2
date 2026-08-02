package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.internal.menu.c;
import com.yandex.messaging.internal.urlpreview.impl.d;
import com.yandex.messaging.internal.view.input.mesix.Mesix;
import com.yandex.messaging.internal.view.stickers.panel.a;
import com.yandex.messaging.internal.view.timeline.f;
import com.yandex.messaging.ui.chatlist.b;
import com.ybsdk.feature.merchant.offers.internal.view.MerchantOffersBannerView;

/* loaded from: classes15.dex */
public final /* synthetic */ class ly4 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ly4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        boolean _init_$lambda$0;
        boolean onLongClick;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                p4b p4bVar = bVar.g0;
                if (p4bVar == null) {
                    p4bVar = null;
                }
                ExistingChatRequest existingChatRequest = p4bVar.k;
                c cVar = (c) bVar.P.get();
                if (cVar != null) {
                    cVar.a(existingChatRequest);
                }
                return true;
            case 1:
                return ((pa5) obj).n0();
            case 2:
                return ((f) obj).n0();
            case 3:
                return ((ldb) obj).c.performLongClick();
            case 4:
                return ((enh) obj).c.performLongClick();
            case 5:
                return ((t15) ((css) obj)).a.n0();
            case 6:
                _init_$lambda$0 = MerchantOffersBannerView._init_$lambda$0((MerchantOffersBannerView) obj, view);
                return _init_$lambda$0;
            case 7:
                onLongClick = ((Mesix) obj).onLongClick(view);
                return onLongClick;
            case 8:
                return ((com.yandex.messaging.internal.urlpreview.impl.c) obj).c.performLongClick();
            case 9:
                return ((lhs0) obj).n0();
            case 10:
                return ((xws0) obj).c.performLongClick();
            case 11:
                ncu0 ncu0Var = (ncu0) obj;
                hhs0 hhs0Var = ncu0Var.R;
                if (hhs0Var == null) {
                    return false;
                }
                String str = ncu0Var.S;
                Activity activity = (Activity) hhs0Var.c;
                a aVar = (a) hhs0Var.b;
                yfa yfaVar = aVar.C;
                if (yfaVar == null) {
                    return true;
                }
                aVar.x.getClass();
                if (str.equals("recent")) {
                    return true;
                }
                AlertDialog create = new AlertDialog.Builder(activity, w0i0.Messaging_AlertDialog).setMessage(oyh0.delete_stickerpack_message).setPositiveButton(oyh0.delete_confirm, new ow4(5, yfaVar, str)).setNegativeButton(oyh0.button_cancel, new dz2(7)).create();
                create.show();
                create.getButton(-1).setTextColor(fxa1.c(jng0.messagingCommonDestructiveTextColor, activity).data);
                return true;
            case 12:
                return ((d) obj).w.performLongClick();
            default:
                return ((lo31) obj).x.performLongClick();
        }
    }
}
