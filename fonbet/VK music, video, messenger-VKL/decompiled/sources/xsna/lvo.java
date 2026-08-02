package xsna;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.lifecycle.Lifecycle;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.actions.Action;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.SchemeStat$TypeEasterEggsItem;
import com.vk.toggle.Features;
import com.vkontakte.android.VKActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.collections.EmptyList;
import xsna.cse0;
import xsna.suo;

/* compiled from: EasterEggsUi.kt */
/* loaded from: classes14.dex */
public final class lvo {
    public final VKActivity a;
    public final xuo b;
    public final Lazy<suo> c;
    public final Lazy<gvo> d;
    public boolean e;
    public final HashSet<a> f;

    /* compiled from: EasterEggsUi.kt */
    public static final class a {
        public final suo.a a;
        public final dcn b;

        public a(suo.a aVar, dcn dcnVar) {
            this.a = aVar;
            this.b = dcnVar;
        }
    }

    public lvo(VKActivity vKActivity, xuo xuoVar, Lazy lazy, Lazy lazy2) {
        this.a = vKActivity;
        this.b = xuoVar;
        this.c = lazy;
        this.d = lazy2;
        vKActivity.getLifecycle().addObserver(new kvo(this, new nvo(this)));
        hg1.a(xuoVar.d.subscribe(new b00(new qqe(this, 13), 23)), vKActivity);
        Features.Type type = Features.Type.FEATURE_EASTER_EGGS_QUEUE;
        type.getClass();
        if (com.vk.toggle.b.A.a(type)) {
            sq9 e = vre0.e((vre0) ((ivo) xuoVar.b.c).c.getValue(), new hvo(o25.a().o().a), "eastereggs_tag", null, new lwh(new p5h(this, 12), 5), null, null, 108);
            if (vKActivity.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                vKActivity.getLifecycle().addObserver(new mvo(e));
            } else {
                ((cse0.a) e).cancel();
            }
        }
        this.f = new HashSet<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [xsna.jx2, xsna.qyn0] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r8v16, types: [com.vk.imageloader.view.VKImageView, xsna.zjt] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.vk.core.ui.floating_view.FloatingViewGesturesHelper$a$a] */
    public final void a() {
        List list;
        ArrayList arrayList;
        Iterator it;
        boolean z;
        ?? r8;
        Size a2;
        final PopupWindow popupWindow;
        final LottieAnimationView lottieAnimationView;
        Size a3;
        PopupWindow popupWindow2;
        boolean z2;
        int intValue;
        int i;
        int intValue2;
        int i2;
        final PopupWindow popupWindow3;
        Iterator it2;
        ?? r1;
        Integer num;
        Integer num2;
        String str;
        int i3;
        ImageSize imageSize;
        suo value = this.c.getValue();
        value.getClass();
        if (com.vk.toggle.b.A.a(Features.Type.FEATURE_EASTER_EGGS)) {
            UiTracker uiTracker = UiTracker.a;
            String d = UiTracker.d();
            List<muo> P0 = value.a.d.P0();
            if (P0 == null) {
                P0 = EmptyList.b;
            }
            ArrayList arrayList2 = new ArrayList();
            for (muo muoVar : P0) {
                ArrayList arrayList3 = muoVar.h;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList3) {
                    ouo ouoVar = (ouo) obj;
                    if (ouoVar.c.isEmpty()) {
                        arrayList = arrayList2;
                    } else {
                        ArrayList arrayList5 = ouoVar.c;
                        if (!arrayList5.isEmpty()) {
                            Iterator it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                quo quoVar = (quo) it3.next();
                                if (epx.f(quoVar.a, "show_on_time_daily")) {
                                    long a4 = qni0.a();
                                    int offset = TimeZone.getDefault().getOffset(a4);
                                    if (!quoVar.d) {
                                        a4 += offset;
                                    }
                                    arrayList = arrayList2;
                                    long convert = TimeUnit.SECONDS.convert(1L, TimeUnit.DAYS);
                                    long j = (a4 / 1000) % convert;
                                    long j2 = quoVar.b;
                                    it = it3;
                                    long j3 = new q500(j2, quoVar.c).c;
                                    if (j > j3 || j2 > j) {
                                        long j4 = j + convert;
                                        if (j2 <= j4 && j4 <= j3) {
                                        }
                                    }
                                } else {
                                    arrayList = arrayList2;
                                    it = it3;
                                }
                                it3 = it;
                                arrayList2 = arrayList;
                            }
                        }
                        arrayList = arrayList2;
                        z = false;
                        if (brm0.w(ouoVar.a, d, true) && z) {
                            arrayList4.add(obj);
                        }
                        arrayList2 = arrayList;
                    }
                    z = true;
                    if (brm0.w(ouoVar.a, d, true)) {
                        arrayList4.add(obj);
                    }
                    arrayList2 = arrayList;
                }
                ArrayList arrayList6 = arrayList2;
                ArrayList arrayList7 = new ArrayList(c5g.u(arrayList4, 10));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(new suo.a(muoVar, (ouo) it4.next()));
                }
                arrayList2 = arrayList6;
                g5g.y(arrayList7, arrayList2);
            }
            list = arrayList2;
        } else {
            list = EmptyList.b;
        }
        ArrayList arrayList8 = new ArrayList();
        HashSet<a> hashSet = this.f;
        Iterator<a> it5 = hashSet.iterator();
        while (it5.hasNext()) {
            a next = it5.next();
            if (!list.contains(next.a)) {
                arrayList8.add(next);
            }
        }
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            a aVar = (a) it6.next();
            dcn dcnVar = aVar.b;
            if (dcnVar != null) {
                dcnVar.dismiss();
            }
            hashSet.remove(aVar);
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj2 : list) {
            suo.a aVar2 = (suo.a) obj2;
            ArrayList arrayList10 = new ArrayList(c5g.u(hashSet, 10));
            Iterator<a> it7 = hashSet.iterator();
            while (it7.hasNext()) {
                arrayList10.add(it7.next().a);
            }
            if (!arrayList10.contains(aVar2)) {
                arrayList9.add(obj2);
            }
        }
        Iterator it8 = arrayList9.iterator();
        while (it8.hasNext()) {
            suo.a aVar3 = (suo.a) it8.next();
            final gvo value2 = this.d.getValue();
            final muo muoVar2 = aVar3.a;
            final ouo ouoVar2 = aVar3.b;
            value2.b.getClass();
            nuo nuoVar = muoVar2.f;
            dcn dcnVar2 = null;
            String a5 = cqm0.a(nuoVar != null ? nuoVar.a : null);
            final VKActivity vKActivity = this.a;
            if (a5 == null) {
                r8 = 0;
            } else {
                final LottieAnimationView lottieAnimationView2 = new LottieAnimationView(vKActivity);
                w800<i700> j5 = q700.j(vKActivity, a5);
                j5.a(new qvo(0));
                j5.b(new r800() { // from class: xsna.rvo
                    @Override // xsna.r800
                    public final void onResult(Object obj3) {
                        LottieAnimationView lottieAnimationView3 = LottieAnimationView.this;
                        lottieAnimationView3.setComposition((i700) obj3);
                        lottieAnimationView3.setRepeatCount(-1);
                        lottieAnimationView3.m0();
                    }
                });
                r8 = lottieAnimationView2;
            }
            if (r8 == 0) {
                Image image = muoVar2.e;
                if (image != null) {
                    i3 = 0;
                    imageSize = image.Cb(iah0.a(muoVar2.i), true, false);
                } else {
                    i3 = 0;
                    imageSize = null;
                }
                if (imageSize == null) {
                    r8 = 0;
                } else {
                    r8 = new VKImageView(vKActivity, null, 6, i3);
                    r8.o0(imageSize.d.d, null);
                }
            }
            int i4 = 3;
            if (r8 == 0 || (a2 = svo.a(muoVar2)) == null) {
                popupWindow = null;
            } else {
                r8.setLayoutParams(new ViewGroup.LayoutParams(a2.getWidth(), a2.getHeight()));
                PopupWindow popupWindow4 = new PopupWindow((View) r8, a2.getWidth(), a2.getHeight());
                int i5 = FloatingViewGesturesHelper.f;
                ?? c0787a = new FloatingViewGesturesHelper.a.C0787a();
                c0787a.g = FloatingViewGesturesHelper.SwipeDirection.Horizontal;
                c0787a.d = new iu9(popupWindow4, value2, muoVar2, i4);
                c0787a.a(r8);
                popupWindow4.setOutsideTouchable(false);
                popupWindow4.setInputMethodMode(1);
                popupWindow = popupWindow4;
            }
            if (popupWindow == null) {
                it2 = it8;
            } else {
                nuo nuoVar2 = muoVar2.g;
                if (nuoVar2 == null || (str = nuoVar2.a) == null) {
                    lottieAnimationView = null;
                } else {
                    final LottieAnimationView lottieAnimationView3 = new LottieAnimationView(vKActivity);
                    w800<i700> j6 = q700.j(vKActivity, str);
                    j6.a(new ovo());
                    j6.b(new r800() { // from class: xsna.pvo
                        @Override // xsna.r800
                        public final void onResult(Object obj3) {
                            LottieAnimationView lottieAnimationView4 = LottieAnimationView.this;
                            lottieAnimationView4.setComposition((i700) obj3);
                            lottieAnimationView4.setRepeatCount(0);
                        }
                    });
                    lottieAnimationView = lottieAnimationView3;
                }
                if (lottieAnimationView == null || (a3 = svo.a(muoVar2)) == null) {
                    popupWindow2 = null;
                    z2 = true;
                } else {
                    lottieAnimationView.setLayoutParams(new ViewGroup.LayoutParams(a3.getWidth(), a3.getHeight()));
                    popupWindow2 = new PopupWindow(lottieAnimationView, a3.getWidth(), a3.getHeight());
                    popupWindow2.setOutsideTouchable(false);
                    z2 = true;
                    popupWindow2.setInputMethodMode(1);
                }
                puo puoVar = ouoVar2.b;
                Integer num3 = puoVar.c;
                if (num3 != null || (num2 = puoVar.d) == null) {
                    intValue = num3 != null ? num3.intValue() : 0;
                    i = 3;
                } else {
                    intValue = num2.intValue();
                    i = 5;
                }
                int i6 = intValue;
                Integer num4 = puoVar.b;
                if (num4 != null || (num = puoVar.e) == null) {
                    intValue2 = num4 != null ? num4.intValue() : 0;
                    i2 = 48;
                } else {
                    intValue2 = num.intValue();
                    i2 = 80;
                }
                final yu1 yu1Var = new yu1(8, vKActivity, new avo(vKActivity, i, i2, i6, intValue2));
                final Action action = muoVar2.d;
                if (action == null) {
                    it2 = it8;
                    popupWindow3 = popupWindow2;
                    r1 = 0;
                    dcnVar2 = null;
                } else {
                    popupWindow3 = popupWindow2;
                    it2 = it8;
                    r1 = 0;
                    popupWindow.getContentView().setOnClickListener(new View.OnClickListener() { // from class: xsna.zuo
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PopupWindow popupWindow5 = popupWindow3;
                            if (popupWindow5 != null) {
                                yu1Var.invoke(popupWindow5);
                            }
                            LottieAnimationView lottieAnimationView4 = lottieAnimationView;
                            if (lottieAnimationView4 != null) {
                                lottieAnimationView4.m0();
                            }
                            if (lottieAnimationView4 != null) {
                                lottieAnimationView4.U(new dvo(popupWindow5, 0));
                            }
                            popupWindow.dismiss();
                            qex0.a().a(vKActivity, action);
                            gvo.this.a.b(muoVar2, ouoVar2);
                        }
                    });
                    yu1Var.invoke(popupWindow);
                    dcnVar2 = new evo(popupWindow);
                }
                if (dcnVar2 == null) {
                    suo suoVar = value2.c;
                    PopupWindow popupWindow5 = popupWindow;
                    yuo yuoVar = new yuo(popupWindow5, yu1Var, value2, lottieAnimationView, popupWindow3, vKActivity, muoVar2, ouoVar2);
                    suoVar.getClass();
                    int i7 = muoVar2.a;
                    ert ertVar = new ert("specials.getEasterEggPopup");
                    ertVar.C(i7, "egg_id");
                    io.reactivex.rxjava3.disposables.c subscribe = rsg0.y0(ertVar, r1, r1, 3).subscribe(new gn0(yuoVar, 20), new bg1(new j60(22), 24));
                    hg1.a(subscribe, vKActivity);
                    dcnVar2 = new fvo(subscribe, popupWindow5);
                }
            }
            hashSet.add(new a(aVar3, dcnVar2));
            muo muoVar3 = aVar3.a;
            this.b.getClass();
            xuo.a(SchemeStat$TypeEasterEggsItem.EventType.EGG_SHOW, muoVar3, ouoVar2);
            it8 = it2;
        }
    }
}
