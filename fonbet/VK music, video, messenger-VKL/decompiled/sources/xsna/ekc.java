package xsna;

import android.content.Context;
import android.view.View;
import com.facebook.soloader.MinElf;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.clickable.ClickableMention;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ekc implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ekc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                qkc qkcVar = (qkc) this.c;
                ClickableMention clickableMention = (ClickableMention) this.d;
                Context context = view.getContext();
                ((anm0) qkcVar.i.getValue()).F(clickableMention);
                qkcVar.m(clickableMention);
                UserId userId = clickableMention.e;
                if (userId != null) {
                    xwk.e().m(context, userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    break;
                }
                break;
            case 1:
                pk30 pk30Var = (pk30) this.c;
                et30 et30Var = (et30) this.d;
                if (pk30Var != null) {
                    pk30Var.d(0, et30Var.d);
                    break;
                }
                break;
            default:
                rxy0 rxy0Var = (rxy0) this.c;
                p0z0 p0z0Var = (p0z0) this.d;
                rxy0Var.getClass();
                rxy0Var.b.b(p0z0Var, null, 1, wn4.d(p0z0Var.T.c ? new viy0(8, rxy0Var.e) : new akz0()), view.getContext());
                break;
        }
    }
}
