package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.holders.group.cell.GroupCellViewState$Avatar;
import com.vk.core.view.components.cell.VkCell;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GroupCellVh.kt */
/* loaded from: classes16.dex */
public final class lsg implements VkCell.f {
    public final GroupCellViewState$Avatar a;
    public final FunctionReferenceImpl b;

    /* JADX WARN: Multi-variable type inference failed */
    public lsg(GroupCellViewState$Avatar groupCellViewState$Avatar, izs<? super View, s3q0> izsVar) {
        this.a = groupCellViewState$Avatar;
        this.b = (FunctionReferenceImpl) izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsg)) {
            return false;
        }
        lsg lsgVar = (lsg) obj;
        return this.a.equals(lsgVar.a) && this.b.equals(lsgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommunityAvatarViewParams(avatar=" + this.a + ", onClick=" + this.b + ')';
    }
}
