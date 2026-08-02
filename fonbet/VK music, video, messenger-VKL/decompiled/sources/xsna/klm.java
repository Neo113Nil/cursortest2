package xsna;

import android.content.Context;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.c;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: DialogThemesLangGetAllCmd.kt */
/* loaded from: classes2.dex */
public final class klm extends le6<Map<String, ? extends String>> {
    public final Source b;
    public final boolean c;

    public klm(Source source, boolean z) {
        this.b = source;
        this.c = z;
    }

    @Override // xsna.le6
    public final Map<String, ? extends String> e(w2w w2wVar) {
        String string;
        if (this.b == Source.CACHE) {
            return w2wVar.I0().i().g();
        }
        w2wVar.getConfig().getClass();
        String a = ply.a();
        if (w2wVar.I0().i().g().isEmpty()) {
            string = null;
        } else {
            string = w2wVar.I0().k().getString("last_lang_theme_version_hash_request_" + a);
        }
        Object c = bz2.c(new mlm(this.c, a, string), "DialogThemesLangLoadApiCmd");
        if (((nlm) c).c) {
            c = null;
        }
        nlm nlmVar = (nlm) c;
        if (nlmVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(nlmVar.a);
            Context context = e43.a;
            Context context2 = context != null ? context : null;
            linkedHashMap.put(c.h.c.a, context2.getString(R.string.vkim_theme_name_custom));
            linkedHashMap.put(c.C1124c.c.a, context2.getString(R.string.vkim_theme_name_default));
            w2wVar.I0().i().k(a, linkedHashMap);
            String str = nlmVar.b;
            if (str != null && !drm0.N(str)) {
                w2wVar.I0().k().k(str, "last_lang_theme_version_hash_request_".concat(a));
            }
        }
        return w2wVar.I0().i().g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klm)) {
            return false;
        }
        klm klmVar = (klm) obj;
        return this.b == klmVar.b && this.c == klmVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogThemesLangGetAllCmd(source=");
        sb.append(this.b);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
