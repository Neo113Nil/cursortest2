package xsna;

import android.widget.TextView;
import com.vk.qrcode.QRTypes$SmsQrAction;
import com.vkontakte.android.R;

/* compiled from: SmsAdapterBinder.kt */
/* loaded from: classes5.dex */
public final class j6k0 extends z6v<QRTypes$SmsQrAction.b> {
    public final QRTypes$SmsQrAction.FieldType e = QRTypes$SmsQrAction.FieldType.PHONE;

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        QRTypes$SmsQrAction.b bVar = (QRTypes$SmsQrAction.b) obj;
        QRTypes$SmsQrAction.FieldType fieldType = bVar.b;
        boolean z = fieldType == this.e;
        hkpVar.f(R.id.ll_contact_root).setEnabled(z);
        TextView textView = (TextView) hkpVar.f(this.c);
        textView.setText(textView.getContext().getString(fieldType.h()));
        TextView textView2 = (TextView) hkpVar.f(this.d);
        textView2.setTextColor(dhr0.t.c(z ? R.attr.vk_ui_text_link_themed : R.attr.vk_ui_text_primary));
        textView2.setText(bVar.a);
    }
}
