package defpackage;

import android.os.Bundle;
import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.ybsdk.feature.card.internal.samsungpay.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class czl0 implements g4t {
    public final /* synthetic */ kol0 a;
    public final /* synthetic */ d b;

    public czl0(kol0 kol0Var, d dVar) {
        this.a = kol0Var;
        this.b = dVar;
    }

    public final void a(int i, Bundle bundle) {
        d.b(this.b, "Failed getting SamsungPay cards", Integer.valueOf(i), bundle, null, null, 24);
        this.a.resumeWith(EmptyList.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public final void b(List list) {
        Object obj;
        if (list != null) {
            List list2 = list;
            obj = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                obj.add(((Card) it.next()).getCardId());
            }
        } else {
            obj = EmptyList.a;
        }
        this.a.resumeWith(obj);
    }
}
