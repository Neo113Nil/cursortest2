package xsna;

import com.vk.im.ui.components.contacts.ContactsList;
import xsna.sst0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class zuh implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zuh(ContactsList contactsList, com.vk.im.ui.components.contacts.b bVar, boolean z) {
        this.d = contactsList;
        this.e = bVar;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                avh avhVar = (avh) this.d;
                sst0.b bVar = (sst0.b) this.e;
                if (this.c) {
                    avhVar.t6(bVar);
                } else {
                    avhVar.v6(bVar);
                }
                break;
            default:
                ContactsList contactsList = (ContactsList) this.d;
                com.vk.im.ui.components.contacts.b bVar2 = (com.vk.im.ui.components.contacts.b) this.e;
                sbj sbjVar = contactsList.c;
                bVar2.o.onNext(gdj.a(bVar2.d(), contactsList.a, sbj.a(sbjVar, null, sbjVar.d.isEmpty() ? bVar2.d().e.d : sbjVar.d, sbjVar.g, null, null, false, sbjVar.p, 32695), null, null, null, this.c ? false : bVar2.d().i, null, 1646));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zuh(boolean z, avh avhVar, sst0.b bVar) {
        this.c = z;
        this.d = avhVar;
        this.e = bVar;
    }
}
