package sg.bigo.ads.ch;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.an.g;
import sg.bigo.ads.ci.i;
import sg.bigo.ads.cn.l;

/* loaded from: classes9.dex */
public final class e extends c {
    Pair<String, Integer> a;
    private final l.a i;

    public e(sg.bigo.ads.cf.b bVar, g gVar, sg.bigo.ads.ci.e eVar, i iVar) {
        super(bVar, gVar, eVar, iVar);
        this.a = null;
        this.i = new l.a() { // from class: sg.bigo.ads.ch.e.1
            @Override // sg.bigo.ads.cn.l.a
            public final void a(String str, int i, int i2, int i3, @NonNull String str2, @Nullable Map<String, Object> map) {
                e.this.h.set(false);
                e eVar2 = e.this;
                eVar2.a(eVar2.a, c.a(i3));
            }

            @Override // sg.bigo.ads.cn.l.a
            public final void a(String str, int i, String str2, @Nullable Map<String, Object> map) {
                e.this.h.set(false);
                e eVar2 = e.this;
                eVar2.a(eVar2.a, false);
            }
        };
    }

    @Override // sg.bigo.ads.ch.c
    public final sg.bigo.ads.bh.e a() {
        return sg.bigo.ads.bp.e.b();
    }

    @Override // sg.bigo.ads.ch.c
    public final sg.bigo.ads.cg.b b() {
        return this.b.a.g;
    }

    @Override // sg.bigo.ads.ch.c
    public final void a(Pair<String, Integer> pair) {
        if (pair == null) {
            return;
        }
        this.h.set(true);
        this.a = pair;
        sg.bigo.ads.cf.b bVar = this.b;
        String str = (String) pair.first;
        l.a aVar = this.i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l lVar = new l(bVar.b, bVar, new l.a() { // from class: sg.bigo.ads.cf.b.3
            final /* synthetic */ sg.bigo.ads.cg.c a;
            final /* synthetic */ l.a b;

            public AnonymousClass3(sg.bigo.ads.cg.c cVar, l.a aVar2) {
                r2 = cVar;
                r3 = aVar2;
            }

            @Override // sg.bigo.ads.cn.l.a
            public final void a(String str2, int i, int i2, int i3, @NonNull String str3, @Nullable Map<String, Object> map) {
                l.a aVar2 = r3;
                if (aVar2 != null) {
                    aVar2.a(str2, i, i2, i3, str3, map);
                }
            }

            @Override // sg.bigo.ads.cn.l.a
            public final void a(String str2, int i, String str3, @Nullable Map<String, Object> map) {
                r2.h = System.currentTimeMillis();
                b.this.a.a(0L);
                l.a aVar2 = r3;
                if (aVar2 != null) {
                    aVar2.a(str2, i, str3, map);
                }
            }
        });
        lVar.i = str;
        lVar.b();
    }
}
