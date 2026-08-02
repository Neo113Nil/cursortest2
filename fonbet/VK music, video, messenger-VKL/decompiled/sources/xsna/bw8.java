package xsna;

import android.content.DialogInterface;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.dto.narratives.Narrative;
import com.vk.profile.user.impl.ui.UserProfileAction;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class bw8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bw8(ew8 ew8Var, Ref$ObjectRef ref$ObjectRef, io.reactivex.rxjava3.core.y yVar) {
        this.c = ref$ObjectRef;
        this.d = yVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) this.d;
                Iterable iterable = (Iterable) ref$ObjectRef.element;
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (((sx8) obj).e != CacheTarget.DOWNLOADED_VIDEOS) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(sx8.a((sx8) it.next(), true));
                }
                ew8.G(arrayList2, yVar);
                break;
            default:
                ((xsq0) this.c).g.a(new UserProfileAction.f.b.a((Narrative) this.d));
                break;
        }
    }

    public /* synthetic */ bw8(xsq0 xsq0Var, Narrative narrative) {
        this.c = xsq0Var;
        this.d = narrative;
    }
}
