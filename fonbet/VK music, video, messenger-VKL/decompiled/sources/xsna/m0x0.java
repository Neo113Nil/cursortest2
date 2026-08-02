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
import xsna.o0x0;
import xsna.p0x0;
import xsna.zzw0;

/* compiled from: VoipSelectVideoPlaylistsReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class m0x0 extends FunctionReferenceImpl implements izs<o0x0, p0x0.b> {
    @Override // xsna.izs
    public final p0x0.b invoke(o0x0 o0x0Var) {
        o0x0 o0x0Var2 = o0x0Var;
        Context context = ((l0x0) this.receiver).a;
        if (!(o0x0Var2 instanceof o0x0.a)) {
            if (o0x0Var2 instanceof o0x0.b) {
                return new p0x0.b.a(Collections.singletonList(new zzw0.b(context.getString(R.string.voip_watch_playlist_load_error_title))), false);
            }
            if (o0x0Var2 instanceof o0x0.c) {
                return new p0x0.b.a(Collections.singletonList(new zzw0.c(context.getString(R.string.voip_watch_playlist_list_loading))), false);
            }
            throw new NoWhenBranchMatchedException();
        }
        o0x0.a aVar = (o0x0.a) o0x0Var2;
        o0x0.d dVar = aVar.b;
        ArrayList arrayList = new ArrayList();
        a990.a aVar2 = dVar.b.c;
        aVar2.getClass();
        boolean z = aVar2 instanceof a990.a.c;
        List<lvw0> list = dVar.a;
        a990<Integer> a990Var = dVar.b;
        if (list.isEmpty() && !z) {
            arrayList.add(new zzw0.a(context.getString(R.string.voip_watch_video_empty_list_title), context.getString(R.string.voip_watch_video_empty_list_description)));
        } else if (a990Var.c instanceof a990.a.C2530a) {
            List<lvw0> list2 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new zzw0.f((lvw0) it.next()));
            }
            arrayList.addAll(arrayList2);
            arrayList.add(new zzw0.d(list.size()));
        } else {
            List<lvw0> list3 = list;
            ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new zzw0.f((lvw0) it2.next()));
            }
            arrayList.addAll(arrayList3);
        }
        if (a990Var.b) {
            arrayList.add(zzw0.e.b);
        }
        return new p0x0.b.a(arrayList, aVar.c);
    }
}
