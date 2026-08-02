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
import xsna.c1x0;
import xsna.d1x0;
import xsna.zzw0;

/* compiled from: VoipSelectVideoTabReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class a1x0 extends FunctionReferenceImpl implements izs<c1x0, d1x0.b.a> {
    @Override // xsna.izs
    public final d1x0.b.a invoke(c1x0 c1x0Var) {
        c1x0 c1x0Var2 = c1x0Var;
        y0x0 y0x0Var = (y0x0) this.receiver;
        Context context = y0x0Var.a;
        if (!(c1x0Var2 instanceof c1x0.a)) {
            if (c1x0Var2 instanceof c1x0.b) {
                return new d1x0.b.a(Collections.singletonList(new zzw0.b(context.getString(R.string.voip_watch_video_load_error_title))));
            }
            if (c1x0Var2 instanceof c1x0.c) {
                return new d1x0.b.a(Collections.singletonList(new zzw0.c(context.getString(R.string.voip_watch_video_list_loading))));
            }
            throw new NoWhenBranchMatchedException();
        }
        c1x0.a aVar = (c1x0.a) c1x0Var2;
        ArrayList arrayList = new ArrayList();
        a990<String> a990Var = aVar.c;
        a990.a aVar2 = a990Var.c;
        aVar2.getClass();
        boolean z = aVar2 instanceof a990.a.c;
        List<p3x0> list = aVar.b;
        if (list.isEmpty() && !z) {
            arrayList.add(y0x0Var.c ? new zzw0.a(context.getString(R.string.voip_watch_video_empty_list_title), context.getString(R.string.voip_watch_playlist_video_empty_description)) : new zzw0.a(context.getString(R.string.voip_watch_video_empty_list_title), context.getString(y0x0Var.b)));
        } else if (a990Var.c instanceof a990.a.C2530a) {
            List<p3x0> list2 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new zzw0.h((p3x0) it.next()));
            }
            arrayList.addAll(arrayList2);
            arrayList.add(new zzw0.d(list.size()));
        } else {
            List<p3x0> list3 = list;
            ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new zzw0.h((p3x0) it2.next()));
            }
            arrayList.addAll(arrayList3);
        }
        if (a990Var.b) {
            arrayList.add(zzw0.e.b);
        }
        return new d1x0.b.a(arrayList);
    }
}
