package xsna;

import com.vk.im.ui.components.contacts.ContactsList;
import xsna.zhw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class uqv0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ uqv0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return s3q0.a;
            default:
                ContactsList contactsList = (ContactsList) obj;
                return new zhw0.a(contactsList.c.d, contactsList.a);
        }
    }
}
