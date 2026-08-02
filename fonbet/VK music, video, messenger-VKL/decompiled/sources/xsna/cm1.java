package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.money.createtransfer.input.TransferInputFieldView;
import com.vk.stickers.bottomsheets.LegoStickersBottomSheetDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.yis;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cm1 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cm1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Iterable iterable;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((dm1) obj2).g.invoke((PhotoAlbum) obj);
                break;
            case 1:
                izs izsVar = (izs) obj;
                if (!((ude) obj2).c.a()) {
                    izsVar.invoke(view);
                    break;
                }
                break;
            case 2:
                ((izs) obj2).invoke(((yis.g) obj).a);
                break;
            case 3:
                wfy wfyVar = (wfy) obj;
                y4l0 y4l0Var = ((vfy) obj2).l;
                if (y4l0Var != null) {
                    y4l0Var.f(wfyVar.b);
                    break;
                }
                break;
            case 4:
                LegoStickersBottomSheetDialog legoStickersBottomSheetDialog = (LegoStickersBottomSheetDialog) obj2;
                Context context = (Context) obj;
                Collection<UserId> collection = legoStickersBottomSheetDialog.U.b;
                if (collection == null || (iterable = j5g.O0(collection)) == null) {
                    iterable = EmptyList.b;
                }
                String str = legoStickersBottomSheetDialog.X;
                if (str == null) {
                    str = "pack_details";
                }
                String str2 = str;
                zal0 a = g2v.d().a();
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((UserId) it.next()).b));
                }
                a.u(context, true, arrayList, legoStickersBottomSheetDialog.V, str2);
                break;
            case 5:
                com.vk.attachpicker.screen.k kVar = (com.vk.attachpicker.screen.k) obj2;
                kVar.e.invoke(Integer.valueOf(kVar.t), new k0(8, (yn3) obj, view));
                break;
            default:
                int i2 = TransferInputFieldView.p;
                g2v.c().b().d(((Dialog) obj).Sb().longValue(), ((TransferInputFieldView) obj2).getContext());
                break;
        }
    }
}
