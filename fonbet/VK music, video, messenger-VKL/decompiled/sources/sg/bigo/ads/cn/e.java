package sg.bigo.ads.cn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.bo.a;
import sg.bigo.ads.cn.a;

/* loaded from: classes9.dex */
public abstract class e<T extends sg.bigo.ads.bo.a> extends a<T> {

    @NonNull
    private final sg.bigo.ads.ce.b j;

    @NonNull
    private final Map<String, Object> k;

    public e(@NonNull Map<String, Object> map, @NonNull sg.bigo.ads.an.g gVar, @Nullable sg.bigo.ads.cf.b bVar, @NonNull sg.bigo.ads.ce.b bVar2) {
        super(gVar, bVar);
        this.j = bVar2;
        this.k = map;
    }

    @Override // sg.bigo.ads.cn.a
    public final void a(int i, int i2, String str) {
        this.j.a(a(), i, i2, str, null);
    }

    @Override // sg.bigo.ads.cn.a
    public final void a(@NonNull String str, @NonNull Map<String, Object> map) {
        this.j.a(a(), str);
    }

    @Override // sg.bigo.ads.cn.a
    public void a(@NonNull a.b bVar) {
        for (String str : this.k.keySet()) {
            bVar.a(str, this.k.get(str));
        }
    }
}
