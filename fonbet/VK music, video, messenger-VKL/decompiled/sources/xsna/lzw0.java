package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a990;
import xsna.nzw0;
import xsna.pzw0;
import xsna.zzw0;

/* compiled from: VoipSelectMovieReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class lzw0 extends FunctionReferenceImpl implements izs<nzw0, pzw0.b> {
    @Override // xsna.izs
    public final pzw0.b invoke(nzw0 nzw0Var) {
        List list;
        nzw0 nzw0Var2 = nzw0Var;
        ozw0 ozw0Var = (ozw0) this.receiver;
        ozw0Var.getClass();
        if (nzw0Var2 instanceof nzw0.b) {
            nzw0.b bVar = (nzw0.b) nzw0Var2;
            return new pzw0.b.a(bVar.b, bVar.c);
        }
        if (!(nzw0Var2 instanceof nzw0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        nzw0.a aVar = (nzw0.a) nzw0Var2;
        Context context = ozw0Var.a;
        if (aVar instanceof nzw0.a.C3429a) {
            nzw0.a.C3429a c3429a = (nzw0.a.C3429a) aVar;
            List<p3x0> list2 = c3429a.f;
            boolean isEmpty = list2.isEmpty();
            a990<Integer> a990Var = c3429a.g;
            a990.a aVar2 = a990Var.c;
            aVar2.getClass();
            boolean z = aVar2 instanceof a990.a.c;
            ArrayList arrayList = new ArrayList();
            if (isEmpty && !z) {
                arrayList.add(new zzw0.a(null, context.getString(R.string.vk_search_empty)));
            } else if (a990Var.c instanceof a990.a.C2530a) {
                List<p3x0> list3 = list2;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new zzw0.h((p3x0) it.next()));
                }
                arrayList.addAll(arrayList2);
                arrayList.add(new zzw0.d(list2.size()));
            } else {
                List<p3x0> list4 = list2;
                ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new zzw0.h((p3x0) it2.next()));
                }
                arrayList.addAll(arrayList3);
            }
            list = arrayList;
            if (a990Var.b) {
                arrayList.add(zzw0.e.b);
                list = arrayList;
            }
        } else if (aVar instanceof nzw0.a.b) {
            list = Collections.singletonList(new zzw0.b(context.getString(R.string.liblists_err_text)));
        } else {
            if (!(aVar instanceof nzw0.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            list = Collections.singletonList(new zzw0.c(context.getString(R.string.voip_watch_video_list_loading)));
        }
        return new pzw0.b.C3539b(list, aVar.h().length() > 0, aVar.c(), aVar.a(), aVar.b());
    }
}
