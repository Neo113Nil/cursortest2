package androidx.view.fragment;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.view.b;
import defpackage.jl40;
import defpackage.oey;
import defpackage.pey;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpey;", "kotlin.jvm.PlatformType", "owner", "Lzy11;", "invoke", "(Lpey;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes10.dex */
final class FragmentNavigator$attachObservers$1 extends Lambda implements tls {
    final /* synthetic */ b $entry;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigator$attachObservers$1(b bVar, Fragment fragment, b bVar2) {
        super(1);
        this.this$0 = bVar;
        this.$fragment = fragment;
        this.$entry = bVar2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        pey peyVar = (pey) obj;
        ArrayList arrayList = this.this$0.g;
        Fragment fragment = this.$fragment;
        boolean z = false;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (jl40.l(((Pair) it.next()).c(), fragment.getTag())) {
                    z = true;
                    break;
                }
            }
        }
        if (peyVar != null && !z) {
            Lifecycle lifecycle = this.$fragment.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.b().a(Lifecycle.State.CREATED)) {
                lifecycle.a((oey) ((FragmentNavigator$fragmentViewObserver$1) this.this$0.i).invoke(this.$entry));
            }
        }
        return zy11.a;
    }
}
