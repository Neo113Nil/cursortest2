package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogTheme;
import java.util.List;

/* compiled from: ThemeProvider.kt */
/* loaded from: classes2.dex */
public final class opo0 extends yq70<List<? extends DialogTheme>, List<? extends DialogTheme>> {
    @Override // xsna.yq70
    public final boolean a(sxp sxpVar) {
        return (sxpVar instanceof f480) || (sxpVar instanceof n480);
    }

    @Override // xsna.yq70
    public final e1w<List<? extends DialogTheme>> b(Source source) {
        return new qkm(source, source != Source.CACHE);
    }

    @Override // xsna.yq70
    public final List<? extends DialogTheme> c(List<? extends DialogTheme> list) {
        return list;
    }
}
