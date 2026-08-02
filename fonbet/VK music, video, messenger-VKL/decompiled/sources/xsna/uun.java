package xsna;

import android.os.Bundle;
import com.vk.core.fragments.FragmentImpl;
import com.vk.documents.impl.ui.fragments.AttachDocumentsFragment;
import com.vk.dto.common.id.UserId;

/* compiled from: DocumentsFactoryImpl.kt */
/* loaded from: classes18.dex */
public final class uun implements tun {
    @Override // xsna.tun
    public final FragmentImpl b(UserId userId, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        AttachDocumentsFragment.a aVar = new AttachDocumentsFragment.a(AttachDocumentsFragment.class, null, null);
        aVar.z(i);
        aVar.A(i2);
        Bundle bundle = aVar.j;
        if (userId != null) {
            bundle.putParcelable("uid", userId);
        }
        bundle.putBoolean("search", z);
        aVar.y(z3);
        if (!z2) {
            bundle.putBoolean("closeBtn", false);
        }
        if (z4) {
            bundle.putBoolean("newPosting", true);
        }
        return aVar.f();
    }
}
