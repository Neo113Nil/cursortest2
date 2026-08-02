package xsna;

import android.view.View;
import com.vk.money.MoneyTransferLinkFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class stj implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ stj(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                utj utjVar = (utj) obj;
                if (((Boolean) ((gzs) obj2).invoke()).booleanValue()) {
                    utjVar.b();
                    break;
                }
                break;
            default:
                int i2 = MoneyTransferLinkFragment.u0;
                ((MoneyTransferLinkFragment) obj2).uo((String) obj);
                break;
        }
    }
}
