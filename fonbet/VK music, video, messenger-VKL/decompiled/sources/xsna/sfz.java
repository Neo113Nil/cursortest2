package xsna;

import android.content.Context;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class sfz implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sfz(Object obj, int i, Object obj2, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((qul) obj2).notifyItemChanged(i2, (jav) obj);
                return s3q0.a;
            case 1:
                com.vk.clips.sdk.shared.item.market_ads.b bVar = (com.vk.clips.sdk.shared.item.market_ads.b) obj2;
                ld00 ld00Var = new ld00(bVar, i2);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                Lazy a = msy.a(lazyThreadSafetyMode, ld00Var);
                int i3 = 13;
                return new hq00(msy.a(lazyThreadSafetyMode, new mh3(i3, bVar, (Context) obj)), msy.a(lazyThreadSafetyMode, new d5(i3, a, bVar)), a, new vv0(24));
            default:
                int i4 = iv00.p1;
                ((iv00) obj2).bo(i2, (List) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ sfz(iv00 iv00Var, List list, int i) {
        this.b = 2;
        this.d = iv00Var;
        this.e = list;
        this.c = i;
    }
}
