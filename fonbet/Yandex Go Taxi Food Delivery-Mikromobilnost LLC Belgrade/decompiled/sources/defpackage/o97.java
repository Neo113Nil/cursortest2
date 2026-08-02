package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.yandex.go.taxi.order.cancel.reasons.view.v1.CancelReasonsV1View;
import ru.CryptoPro.JCSP.tools.common.window.CSPSelectReader;

/* loaded from: classes4.dex */
public final /* synthetic */ class o97 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o97(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((CSPSelectReader) obj).lambda$onCreateDialog$0(adapterView, view, i, j);
                break;
            default:
                CancelReasonsV1View.setListeners$lambda$0((CancelReasonsV1View) obj, adapterView, view, i, j);
                break;
        }
    }
}
