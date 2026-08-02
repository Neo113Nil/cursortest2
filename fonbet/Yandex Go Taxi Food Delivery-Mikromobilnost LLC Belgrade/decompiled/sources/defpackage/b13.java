package defpackage;

import com.ybsdk.common.entities.ApplicationStatusEntity$Status;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.deeplink.api.Deeplink;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class b13 {
    public final ApplicationStatusEntity$Status a;
    public final Text b;
    public final Text c;
    public final String d;
    public final Deeplink e;
    public final Themes f;
    public final List g;

    static {
        ApplicationStatusEntity$Status applicationStatusEntity$Status = ApplicationStatusEntity$Status.UNKNOWN;
        Text.Empty empty = Text.Empty.INSTANCE;
    }

    public b13(ApplicationStatusEntity$Status applicationStatusEntity$Status, Text text, Text text2, String str, Deeplink deeplink, Themes themes, ArrayList arrayList) {
        this.a = applicationStatusEntity$Status;
        this.b = text;
        this.c = text2;
        this.d = str;
        this.e = deeplink;
        this.f = themes;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b13)) {
            return false;
        }
        b13 b13Var = (b13) obj;
        return this.a == b13Var.a && jl40.l(this.b, b13Var.b) && jl40.l(this.c, b13Var.c) && jl40.l(this.d, b13Var.d) && jl40.l(this.e, b13Var.e) && jl40.l(this.f, b13Var.f) && jl40.l(this.g, b13Var.g);
    }

    public final int hashCode() {
        int c = n.c(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        Deeplink deeplink = this.e;
        int hashCode2 = (hashCode + (deeplink == null ? 0 : deeplink.hashCode())) * 31;
        Themes themes = this.f;
        int hashCode3 = (hashCode2 + (themes == null ? 0 : themes.hashCode())) * 31;
        List list = this.g;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationStatusEntity(status=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", supportUrl=");
        sb.append(this.d);
        sb.append(", action=");
        sb.append(this.e);
        sb.append(", image=");
        sb.append(this.f);
        sb.append(", buttons=");
        return ly3.s(sb, this.g, Extension.C_BRAKE);
    }
}
