package defpackage;

import com.ybsdk.core.common.domain.entities.BottomBarIcon;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pb6 {
    public final BottomBarItemId a;
    public final Text b;
    public final BottomBarIcon c;
    public final String d;

    public pb6(BottomBarItemId bottomBarItemId, Text text, BottomBarIcon bottomBarIcon, String str) {
        this.a = bottomBarItemId;
        this.b = text;
        this.c = bottomBarIcon;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb6)) {
            return false;
        }
        pb6 pb6Var = (pb6) obj;
        return this.a == pb6Var.a && jl40.l(this.b, pb6Var.b) && this.c == pb6Var.c && jl40.l(this.d, pb6Var.d);
    }

    public final int hashCode() {
        int c = n.c(this.b, this.a.hashCode() * 31, 31);
        BottomBarIcon bottomBarIcon = this.c;
        int hashCode = (c + (bottomBarIcon == null ? 0 : bottomBarIcon.hashCode())) * 31;
        String str = this.d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BottomBarItemEntity(itemId=" + this.a + ", title=" + this.b + ", icon=" + this.c + ", deeplink=" + this.d + Extension.C_BRAKE;
    }
}
