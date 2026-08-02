package xsna;

import com.vk.core.view.components.userstack.VkUserStack;
import java.util.ArrayList;

/* compiled from: VkFeedUserLikesInfoFooter.kt */
/* loaded from: classes18.dex */
public final class ivu0 {
    public final VkUserStack.Size a;
    public final ArrayList b;

    public ivu0(VkUserStack.Size size, ArrayList arrayList) {
        this.a = size;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivu0)) {
            return false;
        }
        ivu0 ivu0Var = (ivu0) obj;
        return this.a == ivu0Var.a && this.b.equals(ivu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Avatars(size=");
        sb.append(this.a);
        sb.append(", urls=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
