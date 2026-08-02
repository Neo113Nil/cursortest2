package xsna;

import com.vkontakte.android.attachments.ActionButtonAttachment;
import xsna.tlo0;

/* compiled from: ChipActionButtonUiDto.kt */
/* loaded from: classes4.dex */
public final class iac extends ol60 {
    public final tlo0.h h;
    public final ActionButtonAttachment i;

    public iac(tlo0.h hVar, ActionButtonAttachment actionButtonAttachment) {
        super(348, 0, 0, 0, null);
        this.h = hVar;
        this.i = actionButtonAttachment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iac)) {
            return false;
        }
        iac iacVar = (iac) obj;
        return epx.f(this.h, iacVar.h) && epx.f(this.i, iacVar.i);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.i.hashCode() + (this.h.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ChipActionButtonUiDto(title=" + this.h + ", attachment=" + this.i + ", seqId=0)";
    }
}
