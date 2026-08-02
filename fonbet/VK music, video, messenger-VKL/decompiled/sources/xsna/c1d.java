package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.item.clip.viewstate.MainOverlayState;
import com.vk.clips.viewer.impl.feed.item.clip.activities.ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished;
import com.vk.clips.viewer.impl.feed.item.clip.activities.a;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cje;
import xsna.eje;
import xsna.gje;
import xsna.hfr;
import xsna.kje;
import xsna.mje;

/* compiled from: ClipItemLikesRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class c1d {
    public static final List<Integer> i;
    public static final int j;
    public static final int n;
    public final ViewGroup a;
    public final u6d b;
    public final Object c;
    public final Object d;
    public final Object e;
    public MainOverlayState.b.c f;
    public q3d g;
    public static final List<Integer> h = e43.l(Integer.valueOf(R.id.clip_like_heart_first_avatar), Integer.valueOf(R.id.clip_like_heart_second_avatar), Integer.valueOf(R.id.clip_like_heart_third_avatar));
    public static final int k = iah0.a(25);
    public static final int l = iah0.a(88);
    public static final int m = iah0.a(46);
    public static final q500 o = new q500(1500, 2500);
    public static final Pair<Float, Float> p = new Pair<>(Float.valueOf(4.0f), Float.valueOf(12.0f));

    /* compiled from: ClipItemLikesRenderDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<a1d> {
        public static final a b = new a(0, a1d.class, "<init>", "<init>()V", 0);

        @Override // xsna.gzs
        public final a1d invoke() {
            return new a1d();
        }
    }

    /* compiled from: ClipItemLikesRenderDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<cje> {
        public static final b b = new b(0, cje.class, "<init>", "<init>()V", 0);

        @Override // xsna.gzs
        public final cje invoke() {
            return new cje();
        }
    }

    /* compiled from: ClipItemLikesRenderDelegate.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<View, a.b, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(View view, a.b bVar) {
            View view2 = view;
            a.b bVar2 = bVar;
            c1d c1dVar = (c1d) this.receiver;
            ViewGroup viewGroup = c1dVar.a;
            if (bVar2 instanceof a.b.C0707a) {
                c1dVar.b.a(p3d.b);
            } else if (bVar2 instanceof a.b.C0708b) {
                view2.getParent().requestDisallowInterceptTouchEvent(true);
            } else if (bVar2 instanceof com.vk.clips.viewer.impl.feed.item.clip.activities.b) {
                c1dVar.b().d(view2);
                ViewParent parent = viewGroup.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                }
            } else if (bVar2 instanceof com.vk.clips.viewer.impl.feed.item.clip.activities.c) {
                view2.performHapticFeedback(0);
            } else {
                if (!(bVar2 instanceof ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                view2.getParent().requestDisallowInterceptTouchEvent(false);
                ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished.DragResult dragResult = ((ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished) bVar2).a;
                im0 im0Var = new im0(c1dVar, 16);
                Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (dragResult == ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished.DragResult.DISMISSED) {
                    im0Var.invoke();
                    hfr.a aVar = new hfr.a(rli0.j(new jxt0(viewGroup), new wh6(7)));
                    while (aVar.hasNext()) {
                        View view3 = (View) aVar.next();
                        c1dVar.b().d(view3);
                        c1dVar.b().b(view3, new gje.a(), new com.vk.movika.sdk.base.model.props.a(4));
                    }
                } else {
                    c1dVar.b().c(view2, new mje.a(new Pair(Float.valueOf(view2.getTranslationX()), Float.valueOf(view2.getTranslationY())), new Pair(valueOf, valueOf)), new b1d(im0Var, c1dVar, view2, 0));
                }
            }
            return s3q0.a;
        }
    }

    static {
        float f = 0;
        float f2 = 40;
        i = e43.l(Integer.valueOf(iah0.a(f)), Integer.valueOf(iah0.a(f2)), Integer.valueOf(iah0.a(84)));
        j = iah0.a(f);
        n = iah0.a(f2);
    }

    public c1d(ViewGroup viewGroup, u6d u6dVar) {
        this.a = viewGroup;
        this.b = u6dVar;
        b bVar = b.b;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, bVar);
        this.d = msy.a(lazyThreadSafetyMode, new sa0(this, 21));
        this.e = msy.a(lazyThreadSafetyMode, a.b);
    }

    public static final c.d a(List list, gko gkoVar, int i2) {
        return new c.d(((MainOverlayState.b.c.a) list.get(i2)).b, gkoVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final cje b() {
        return (cje) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(View view, long j2) {
        eje ejeVar;
        cje b2 = b();
        eje.a aVar = new eje.a(j2);
        pk pkVar = new pk(3, view, this);
        LinkedHashMap linkedHashMap = b2.a;
        cje.a aVar2 = (cje.a) linkedHashMap.get(Integer.valueOf(view.getId()));
        if (aVar2 != null && (ejeVar = aVar2.a) != null) {
            ?? r6 = ejeVar.e;
            if (((ValueAnimator) r6.getValue()).isRunning()) {
                ValueAnimator valueAnimator = (ValueAnimator) r6.getValue();
                if (valueAnimator.isRunning()) {
                    ejeVar.c = null;
                    ejeVar.d = false;
                    valueAnimator.setStartDelay(0L);
                    valueAnimator.setDuration(0L);
                    valueAnimator.cancel();
                }
            }
        }
        view.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        eje ejeVar2 = new eje(new bje(view, 0), pkVar);
        ValueAnimator valueAnimator2 = (ValueAnimator) ejeVar2.e.getValue();
        if (!valueAnimator2.isRunning()) {
            ejeVar2.c = aVar;
            ejeVar2.d = false;
            valueAnimator2.setStartDelay(j2);
            valueAnimator2.setDuration(250L);
            valueAnimator2.start();
        }
        if (aVar2 == null) {
            aVar2 = cje.a.e;
        }
        linkedHashMap.put(Integer.valueOf(view.getId()), cje.a.a(aVar2, ejeVar2, null, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(View view) {
        kje kjeVar;
        cje b2 = b();
        kje.a aVar = new kje.a(o, p);
        LinkedHashMap linkedHashMap = b2.a;
        cje.a aVar2 = (cje.a) linkedHashMap.get(Integer.valueOf(view.getId()));
        if (aVar2 != null && (kjeVar = aVar2.c) != null) {
            ?? r4 = kjeVar.f;
            if (((ValueAnimator) r4.getValue()).isRunning()) {
                ValueAnimator valueAnimator = (ValueAnimator) r4.getValue();
                if (valueAnimator.isRunning()) {
                    kjeVar.b = null;
                    valueAnimator.cancel();
                }
            }
        }
        kje kjeVar2 = new kje(new y6c(view, 2));
        ValueAnimator valueAnimator2 = (ValueAnimator) kjeVar2.f.getValue();
        if (!valueAnimator2.isRunning()) {
            kjeVar2.b = aVar;
            kjeVar2.a(aVar);
            valueAnimator2.start();
        }
        if (aVar2 == null) {
            aVar2 = cje.a.e;
        }
        linkedHashMap.put(Integer.valueOf(view.getId()), cje.a.a(aVar2, null, null, kjeVar2, null, 11));
    }
}
