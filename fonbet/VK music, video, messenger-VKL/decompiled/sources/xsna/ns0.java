package xsna;

import android.widget.TextView;
import com.vk.qrcode.QRTypes$AddressBookQRAction;
import com.vkontakte.android.R;

/* compiled from: AddressBookAdapterBinder.kt */
/* loaded from: classes5.dex */
public final class ns0 extends z6v<QRTypes$AddressBookQRAction.a> {
    public final QRTypes$AddressBookQRAction.FieldType[] e = {QRTypes$AddressBookQRAction.FieldType.PHONE, QRTypes$AddressBookQRAction.FieldType.EMAIL, QRTypes$AddressBookQRAction.FieldType.SITE};

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        QRTypes$AddressBookQRAction.a aVar = (QRTypes$AddressBookQRAction.a) obj;
        QRTypes$AddressBookQRAction.FieldType fieldType = aVar.c;
        boolean G = rl3.G(this.e, fieldType);
        hkpVar.f(R.id.ll_contact_root).setEnabled(G);
        TextView textView = (TextView) hkpVar.f(this.c);
        textView.setText(textView.getContext().getString(fieldType.k()));
        TextView textView2 = (TextView) hkpVar.f(this.d);
        textView2.setTextColor(dhr0.t.c(G ? R.attr.vk_ui_text_link_themed : R.attr.vk_ui_text_primary));
        textView2.setText(aVar.a);
    }
}
