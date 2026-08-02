package xsna;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.im.ui.components.contacts.ContactsList;
import com.vk.search.fragment.DiscoverSearchFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class fcj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fcj(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                ContactsList contactsList = (ContactsList) obj2;
                com.vk.im.ui.components.contacts.b bVar = (com.vk.im.ui.components.contacts.b) obj;
                List<? extends qtd0> list = contactsList.c.d.isEmpty() ? bVar.d().e.d : contactsList.c.d;
                gdj d = bVar.d();
                sbj a = sbj.a(contactsList.c, null, list, null, null, null, false, null, 65527);
                List<qtd0> list2 = d.a;
                List<qtd0> list3 = contactsList.a;
                List<qtd0> list4 = list2;
                ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
                Iterator<T> it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((qtd0) it.next()).G3()));
                }
                HashSet hashSet = new HashSet(arrayList);
                ArrayList arrayList2 = new ArrayList(list3.size() + list2.size());
                arrayList2.addAll(list2);
                for (qtd0 qtd0Var : list3) {
                    if (hashSet.add(Long.valueOf(qtd0Var.G3()))) {
                        arrayList2.add(qtd0Var);
                    }
                }
                bVar.o.onNext(gdj.a(d, arrayList2, a, null, null, null, z ? false : bVar.d().i, null, 1646));
                return s3q0.a;
            case 1:
                DiscoverSearchFragment discoverSearchFragment = (DiscoverSearchFragment) obj2;
                VkSearchView vkSearchView = (VkSearchView) obj;
                int i2 = DiscoverSearchFragment.s0;
                Context mo2getContext = discoverSearchFragment.mo2getContext();
                if (mo2getContext == null) {
                    return s3q0.a;
                }
                if (fnj.b(mo2getContext)) {
                    vkSearchView.X4(false);
                } else {
                    int i3 = 1;
                    if (z) {
                        vkSearchView.f5(true);
                        View view = discoverSearchFragment.j0;
                        int width = view.getWidth();
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                        ValueAnimator ofInt = ValueAnimator.ofInt(width, 0);
                        ofInt.addUpdateListener(new o6n(0, layoutParams, view));
                        ofInt.setDuration(200L);
                        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
                        xo2.h(ofInt, new yce(view, 15));
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(discoverSearchFragment.k0.getSelfMargin(), discoverSearchFragment.k0.getSideMargin() - discoverSearchFragment.k0.getSelfMargin());
                        ofInt2.addUpdateListener(new p6n(discoverSearchFragment, objArr == true ? 1 : 0));
                        ofInt2.setDuration(200L);
                        ofInt2.setInterpolator(new AccelerateDecelerateInterpolator());
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        ofFloat.addUpdateListener(new w88(view, i3));
                        ofFloat.setDuration(80L);
                        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofInt, ofInt2);
                        animatorSet.start();
                    } else {
                        vkSearchView.X4(true);
                    }
                }
                return s3q0.a;
            default:
                return "onStartPlaylist() - playlist= " + ((y6b0) obj2) + " position= " + ((deb0) obj) + " playWhenReady= " + z;
        }
    }
}
