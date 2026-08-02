package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;

/* loaded from: classes8.dex */
public final /* synthetic */ class iqy0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ iqy0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return d.a(context, (Text) obj);
            default:
                Toast.makeText(context, (String) obj, 0).show();
                return zy11.a;
        }
    }
}
