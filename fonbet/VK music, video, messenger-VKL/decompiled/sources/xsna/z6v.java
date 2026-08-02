package xsna;

import android.view.View;
import com.vk.qrcode.QRTypes$SmsQrAction;
import com.vkontakte.android.R;

/* compiled from: HintValueAdapterBinder.kt */
/* loaded from: classes5.dex */
public class z6v<T> extends s770 {
    public final int c;
    public final int d;

    public z6v() {
        QRTypes$SmsQrAction.FieldType fieldType = QRTypes$SmsQrAction.FieldType.PHONE;
        this.c = R.id.tv_title;
        this.d = R.id.tv_value;
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view);
        hkpVar.d(view.findViewById(this.c));
        hkpVar.d(view.findViewById(this.d));
        return hkpVar;
    }
}
