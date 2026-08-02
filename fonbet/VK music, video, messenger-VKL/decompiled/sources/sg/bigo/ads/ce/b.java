package sg.bigo.ads.ce;

import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.l;

/* loaded from: classes9.dex */
public abstract class b implements e<sg.bigo.ads.cn.a, String, Object> {
    @Override // sg.bigo.ads.ce.e
    public final /* bridge */ /* synthetic */ void a(int i, @NonNull sg.bigo.ads.cn.a aVar, @NonNull String[] strArr) {
        a(i, strArr);
    }

    public abstract void a(int i, @NonNull String str);

    public final void a(int i, @NonNull String... strArr) {
        a(i, (String) l.b(strArr));
    }
}
