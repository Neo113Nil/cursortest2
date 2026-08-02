package defpackage;

import android.view.View;
import com.yandex.plus.pay.ui.common.api.log.PlusPayLogLayoutInflaterFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class idd0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ idd0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                PlusPayLogLayoutInflaterFactory.addFocusChangeLogging$lambda$7((PlusPayLogLayoutInflaterFactory) obj3, (View.OnFocusChangeListener) obj2, (View) obj, view, z);
                break;
            default:
                n70 n70Var = (n70) obj3;
                r961 r961Var = (r961) obj2;
                uq01 uq01Var = (uq01) obj;
                if (!z) {
                    switch (aq01.a[((vqj0) n70Var.Z()).a.getItemType().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            r961Var.a.scrollToInputStart();
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            w511.b();
                            break;
                    }
                }
                uq01Var.invoke(((vqj0) n70Var.Z()).a, Boolean.valueOf(z));
                break;
        }
    }
}
