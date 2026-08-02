package xsna;

import android.view.View;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.view.l;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ngu implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ngu(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                com.vk.sharing.core.view.b bVar = (com.vk.sharing.core.view.b) this.c;
                Target target = (Target) this.d;
                int absoluteAdapterPosition = bVar.getAbsoluteAdapterPosition();
                l.a presenter = bVar.l.getPresenter();
                if (presenter != null) {
                    if (!target.g) {
                        if (absoluteAdapterPosition != -1) {
                            if (!target.zb()) {
                                cvk.u(R.string.send_forbidden, false);
                                break;
                            } else {
                                presenter.l2(target, absoluteAdapterPosition, true);
                                break;
                            }
                        }
                    } else {
                        presenter.l2(target, absoluteAdapterPosition, false);
                        break;
                    }
                }
                break;
            default:
                izs izsVar = (izs) this.c;
                Object obj = ((pyl0) this.d).l;
                if (obj == null) {
                    obj = null;
                }
                izsVar.invoke(obj);
                break;
        }
    }
}
