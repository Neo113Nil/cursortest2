package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.MusicTrack;
import com.vk.photos.root.photoflow.presentation.a;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class r6h implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r6h(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<VKApiExecutionException> v;
        VKApiExecutionException vKApiExecutionException;
        String u;
        String u2;
        switch (this.b) {
            case 0:
                oap oapVar = (oap) this.d;
                Context context = ((s6h) this.e).a;
                Throwable th = (Throwable) obj;
                boolean z = th instanceof VKApiExecutionException;
                boolean z2 = z && (u2 = ((VKApiExecutionException) th).u()) != null && drm0.D(u2, "Access denied: you are already in this community", false);
                boolean z3 = (!z || (v = ((VKApiExecutionException) th).v()) == null || (vKApiExecutionException = (VKApiExecutionException) j5g.a0(v)) == null || (u = vKApiExecutionException.u()) == null || !drm0.D(u, "Access denied: you are already in this community", false)) ? false : true;
                if (xus.o(oapVar) && (z2 || z3)) {
                    enj.q(this.c ? R.string.event_you_are_already_go : R.string.event_you_are_already_unsure_go, 0, context);
                } else {
                    e2h.a(context, th);
                }
                return s3q0.a;
            case 1:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                b8a0 b8a0Var = (b8a0) this.e;
                VKList vKList = (VKList) obj;
                String j = vKList.j();
                boolean z4 = (j == null || j.length() == 0 || epx.f(vKList.j(), "0")) ? false : true;
                cVar.s(vKList.j());
                cVar.r(z4);
                b8a0Var.d.invoke(new a.k(vKList, !z4, this.c));
                return s3q0.a;
            default:
                return ((e8u0) this.d).b.q1((MusicTrack) this.e, this.c);
        }
    }

    public /* synthetic */ r6h(oap oapVar, boolean z, s6h s6hVar) {
        this.b = 0;
        this.d = oapVar;
        this.c = z;
        this.e = s6hVar;
    }
}
