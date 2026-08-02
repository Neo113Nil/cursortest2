package defpackage;

import com.yandex.go.places.complaint.impl.ui.modal.ComplaintModalView;
import java.util.List;

/* loaded from: classes13.dex */
public final class hxc implements kxc {
    public final /* synthetic */ ComplaintModalView a;

    public hxc(ComplaintModalView complaintModalView) {
        this.a = complaintModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        sxc sxcVar;
        sxcVar = this.a.adapter;
        sxcVar.submitList((List) obj, null);
    }
}
