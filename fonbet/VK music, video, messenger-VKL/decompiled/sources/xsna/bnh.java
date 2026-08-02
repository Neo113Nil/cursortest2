package xsna;

import com.vk.documents.api.di.DocumentsComponent;
import com.vk.profile.community.address.api.di.CommunityAddressComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class bnh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ bnh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((DocumentsComponent) this.c.mo408a(fpf0.a(DocumentsComponent.class))).F7();
            default:
                return ((CommunityAddressComponent) this.c.a(fpf0.a(CommunityAddressComponent.class))).a();
        }
    }
}
