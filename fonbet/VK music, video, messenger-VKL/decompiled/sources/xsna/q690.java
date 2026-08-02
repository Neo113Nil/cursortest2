package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stat.scheme.MobileOfficialAppsCorePushesStat$TypePushEventItem;
import com.vk.stickers.details.AuthorSubscriptionRef;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.ugy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class q690 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q690(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.ViewGroup, xsna.t5z0] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                com.vk.stickers.details.holders.a aVar = (com.vk.stickers.details.holders.a) this.c;
                aVar.l.N((StickerStockItem) this.d, AuthorSubscriptionRef.PACK_DETAILS);
                break;
            case 1:
                j3n0 j3n0Var = (j3n0) this.c;
                k3n0 k3n0Var = (k3n0) this.d;
                j3n0Var.q = true;
                Context context = view.getContext();
                k3n0Var.f.H(MobileOfficialAppsCorePushesStat$TypePushEventItem.Action.PLAY, k3n0Var.a.b);
                xo4 xo4Var = new xo4(k3n0Var.c.invoke(), 200);
                xo4Var.K("ref", k3n0Var.d.t());
                xo4Var.C(1, "extended");
                rsg0.y0(xo4Var, null, null, 3).subscribe(new h8l0(new defpackage.y(27, k3n0Var, context), 3), new xk30(new cd10(20), 26));
                cvk.u(R.string.music_headphones_audios_started, false);
                j3n0Var.d();
                break;
            default:
                dfz0 dfz0Var = (dfz0) this.c;
                puy0 puy0Var = (puy0) this.d;
                wfy0 wfy0Var = puy0Var.a;
                ugy0.a aVar2 = dfz0Var.m;
                if (aVar2 != null) {
                    pbz0 pbz0Var = (pbz0) aVar2;
                    ?? r2 = pbz0Var.d;
                    ArrayList arrayList = pbz0Var.u;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            puy0 puy0Var2 = (puy0) it.next();
                            if (wfy0Var.F.equals(puy0Var2.a.F) && puy0Var2.b) {
                                pbz0Var.g(wfy0Var, 1, new akz0(), r2.a());
                                if (pbz0Var.w) {
                                    pbz0Var.e();
                                    break;
                                }
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            puy0 puy0Var3 = (puy0) it2.next();
                            puy0Var3.b = wfy0Var.F.equals(puy0Var3.a.F);
                        }
                        if (r2 instanceof ugy0) {
                            ((ugy0) r2).a(arrayList, puy0Var);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
