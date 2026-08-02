package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.vk.catalog2.common.ui.holders.ActionFollowVh;
import com.vk.dto.newsfeed.FaveTag;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a10 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a10(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((ActionFollowVh) this.c).onClick((View) this.d);
                break;
            default:
                gsq gsqVar = (gsq) this.c;
                FaveTag faveTag = (FaveTag) this.d;
                t1o0 t1o0Var = gsqVar.b;
                int indexOf = ((ArrayList) t1o0Var.y0()).indexOf(faveTag);
                if (indexOf > -1) {
                    ((ArrayList) t1o0Var.y0()).remove(indexOf);
                }
                if (!t1o0Var.K0()) {
                    indexOf++;
                }
                t1o0Var.notifyItemRemoved(indexOf);
                Context context = gsqVar.getContext();
                int i2 = faveTag.b;
                mrq mrqVar = new mrq("fave.removeTag");
                mrqVar.C(i2, "id");
                io.reactivex.rxjava3.internal.operators.observable.b0 F = rsg0.y0(mrqVar, null, null, 3).F(new zl0(new l8k(6), 29));
                j50 j50Var = new j50(new eqq(faveTag, 1), 23);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                hg1.m(F.E(j50Var, lVar, kVar, kVar), context, 0L, false, 62).subscribe(new fsq(new y90(29), 0), new inq(hsq.b, 1));
                break;
        }
    }
}
