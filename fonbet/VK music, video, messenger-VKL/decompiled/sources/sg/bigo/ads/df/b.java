package sg.bigo.ads.df;

import android.content.Context;
import java.util.Arrays;
import java.util.Map;
import sg.bigo.ads.api.core.r;
import sg.bigo.ads.common.utils.l;

/* loaded from: classes9.dex */
public class b extends c {
    public b(r rVar, e[] eVarArr, e[] eVarArr2, e[] eVarArr3, e[] eVarArr4, Map<String, String> map) {
        super(rVar);
        this.b.addAll(Arrays.asList(eVarArr));
        this.c.addAll(Arrays.asList(eVarArr2));
        this.d.addAll(Arrays.asList(eVarArr3));
        this.e.addAll(Arrays.asList(eVarArr4));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public final void a(final Context context, final int i) {
        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.df.b.2
            final /* synthetic */ boolean b = false;

            @Override // java.lang.Runnable
            public final void run() {
                b.this.a(context, this.b, i);
            }
        });
    }

    public final void a(Map<String, String> map) {
        if (l.a(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }
}
