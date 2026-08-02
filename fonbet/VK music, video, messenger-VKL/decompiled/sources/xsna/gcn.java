package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photoviewer.PhotoViewer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DismissingTouchListener.kt */
/* loaded from: classes3.dex */
public final class gcn implements View.OnTouchListener {
    public final com.vk.photoviewer.d b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public boolean g;
    public float h;
    public float i;
    public final GestureDetector j;
    public final int k;

    /* compiled from: DismissingTouchListener.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ gzs<s3q0> b;

        public a(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.b.invoke();
        }
    }

    public gcn(com.vk.photoviewer.d dVar) {
        this.b = dVar;
        PhotoViewer photoViewer = dVar.a;
        this.j = new GestureDetector(photoViewer.w.getContext(), new hcn(this));
        this.k = ViewConfiguration.get(photoViewer.w.getContext()).getScaledTouchSlop();
    }

    public final void a(gzs<s3q0> gzsVar) {
        com.vk.photoviewer.d dVar = this.b;
        ArrayList<View> b = dVar.b();
        ArrayList arrayList = new ArrayList(c5g.u(b, 10));
        for (View view : b) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        ArrayList<View> a2 = dVar.a();
        ArrayList arrayList2 = new ArrayList(c5g.u(a2, 10));
        for (View view2 : a2) {
            arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, view2.getAlpha(), 1.0f));
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList3);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(100L);
        animatorSet.addListener(new a(gzsVar));
        animatorSet.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r1 != 3) goto L67;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        com.vk.photoviewer.d dVar = this.b;
        PhotoViewer photoViewer = dVar.a;
        if (!this.g) {
            if (photoViewer.f) {
                ggs ggsVar = photoViewer.q.k.get(photoViewer.C.getCurrentItem());
                fnw fnwVar = ggsVar instanceof fnw ? (fnw) ggsVar : null;
                boolean z = fnwVar != null ? fnwVar.m.m.n : false;
                boolean z2 = bn10.d(fnwVar != null ? fnwVar.getScale() : 1.0f, 1.0f) == 0;
                if ((!z || z2) && photoViewer.l == null) {
                    if (motionEvent.getPointerCount() > 1) {
                        a(new h1j(this, 7));
                        return false;
                    }
                    this.j.onTouchEvent(motionEvent);
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 2) {
                                float abs = Math.abs(this.d - motionEvent.getRawY());
                                if (Math.abs(this.c - motionEvent.getRawX()) / abs < 0.75f && abs > this.k && !this.f) {
                                    this.f = true;
                                }
                                if (this.f) {
                                    float rawY = (motionEvent.getRawY() - this.d) + this.h;
                                    this.h = rawY;
                                    this.i = Math.max(1 - Math.abs((rawY * 1.5f) / photoViewer.w.getHeight()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    this.d = motionEvent.getRawY();
                                    Iterator it = dVar.b().iterator();
                                    while (it.hasNext()) {
                                        ((View) it.next()).setTranslationY(this.h);
                                    }
                                    Iterator it2 = dVar.a().iterator();
                                    while (it2.hasNext()) {
                                        ((View) it2.next()).setAlpha(this.i);
                                    }
                                }
                            }
                        }
                        if (Math.abs(this.h) > photoViewer.w.getHeight() / 3) {
                            if (!this.e) {
                                this.e = true;
                                this.g = false;
                                dVar.a.g(true);
                            }
                        } else if (this.f) {
                            a(new wzh(this, 10));
                            this.g = true;
                        }
                    } else {
                        this.c = motionEvent.getRawX();
                        this.d = motionEvent.getRawY();
                        if (photoViewer.q.n.get(photoViewer.r, false)) {
                            photoViewer.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, photoViewer.r);
                        }
                    }
                    return this.f;
                }
            }
            return false;
        }
        return true;
    }
}
