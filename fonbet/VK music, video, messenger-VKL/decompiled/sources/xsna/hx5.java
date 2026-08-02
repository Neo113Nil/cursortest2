package xsna;

import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Source;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: BackgroundProvider.kt */
/* loaded from: classes2.dex */
public final class hx5 extends yq70<List<? extends DialogBackground>, xpp<List<? extends DialogBackground>>> {
    @Override // xsna.yq70
    public final boolean a(sxp sxpVar) {
        return sxpVar instanceof f480;
    }

    @Override // xsna.yq70
    public final e1w<xpp<List<? extends DialogBackground>>> b(Source source) {
        return new iam(source, source != Source.CACHE);
    }

    @Override // xsna.yq70
    public final List<? extends DialogBackground> c(xpp<List<? extends DialogBackground>> xppVar) {
        ArrayList arrayList;
        List<? extends DialogBackground> a = xppVar.a();
        if (a != null) {
            arrayList = new ArrayList();
            for (Object obj : a) {
                if (((DialogBackground) obj).d()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? EmptyList.b : arrayList;
    }
}
