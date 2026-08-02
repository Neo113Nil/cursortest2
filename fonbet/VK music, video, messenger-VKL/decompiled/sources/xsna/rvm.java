package xsna;

import android.content.Context;
import android.view.View;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;
import xsna.svm;

/* compiled from: DialogsSearchViewController.kt */
/* loaded from: classes18.dex */
public final class rvm extends fi6<tvm, qvm> {
    public final Context f;
    public final qqe g;
    public final vq6 h;
    public final com.vk.movika.sdk.base.flow.binding.g i;
    public final fne j;

    public rvm(Context context, qqe qqeVar, vq6 vq6Var, com.vk.movika.sdk.base.flow.binding.g gVar, fne fneVar) {
        super(R.layout.dialogs_search, null);
        this.f = context;
        this.g = qqeVar;
        this.h = vq6Var;
        this.i = gVar;
        this.j = fneVar;
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        this.g.invoke(view.findViewById(R.id.dialogs_search));
    }

    @Override // xsna.ei6, xsna.wn50
    public final void j(yn50 yn50Var) {
        boolean z = yn50Var instanceof svm.b;
        Context context = this.f;
        if (z) {
            ikv0.a aVar = new ikv0.a(context);
            aVar.t = ikv0.c.f.a;
            aVar.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.vkim_dialogs_search_channel_subsribed)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
            aVar.n();
            return;
        }
        if (!(yn50Var instanceof svm.c)) {
            if (yn50Var instanceof svm.a) {
                zk70.e(((svm.a) yn50Var).a);
            }
        } else {
            ikv0.a aVar2 = new ikv0.a(context);
            aVar2.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.vkim_dialogs_search_channel_left)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
            aVar2.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.vkim_dialogs_search_channel_left_cancel), new eaa(12, this, yn50Var));
            aVar2.n();
        }
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        this.h.invoke();
    }

    @Override // xsna.fi6, xsna.wn50
    public final void onDestroyView() {
        super.onDestroyView();
        this.i.invoke();
    }
}
