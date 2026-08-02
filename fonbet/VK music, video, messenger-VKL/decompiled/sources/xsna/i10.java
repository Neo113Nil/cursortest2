package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import one.video.controls.view.LiveLabelView;
import one.video.controls.view.LiveTimeView;
import one.video.controls.view.seekbar.OneVideoSeekBarView;
import one.video.controls.view.state.CastButtonState;
import one.video.controls.view.state.Mode;
import one.video.controls.view.state.PlayPauseButtonViewState;
import one.video.controls20.SimpleControlsView;
import one.video.controls20.a;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.transform.TransformController;
import xsna.bu;
import xsna.jvo0;
import xsna.o10;
import xsna.sox;

/* compiled from: ActionHandler.kt */
/* loaded from: classes8.dex */
public final class i10 {
    public final nn80 a;
    public final xpj0 b;
    public g2b0 e;
    public SimpleControlsView.h f;
    public OneVideoPlayer i;
    public gzs<s3q0> l;
    public txs n;
    public TransformController p;
    public y5r q;
    public gzs<s3q0> r;
    public gzs<s3q0> s;
    public gzs<s3q0> t;
    public owo0 u;
    public sox v;
    public wzt0 w;
    public aqj0 c = aqj0.G;
    public fzi d = fzi.m;
    public final j10 g = new j10(this);
    public final k10 h = new k10(this);
    public yqj j = yqj.e;
    public rs8 k = rs8.i;
    public final h10 m = new h10(this);
    public final l10 o = new l10(this);
    public final com.vk.movika.sdk.base.logic.interactor.j x = new com.vk.movika.sdk.base.logic.interactor.j(this, 2);
    public final lp2 y = new lp2();
    public SimpleControlsView.b z = new SimpleControlsView.b();
    public SimpleControlsView.e A = new SimpleControlsView.e(0);

    /* compiled from: ActionHandler.kt */
    public static final class a implements wzs<o10.b, String, s3q0> {
        public a() {
        }

        @Override // xsna.wzs
        public final s3q0 invoke(o10.b bVar, String str) {
            i10.this.b(bVar.a);
            return s3q0.a;
        }
    }

    public i10(nn80 nn80Var, xpj0 xpj0Var) {
        this.a = nn80Var;
        this.b = xpj0Var;
    }

    public static void e(i10 i10Var, boolean z) {
        i10Var.d(i10Var.z.b, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (xsna.wp80.g((one.video.controls.view.state.PlayPauseButtonViewState) r9, r3.x) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0172, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (xsna.wp80.g((xsna.mbu) r9, r3.v) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        if (xsna.wp80.g((xsna.g3e0) r9, r3.m) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        if (xsna.wp80.g((xsna.qso0) r9, r3.n) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (xsna.wp80.g((xsna.ozb0) r9, r3.k) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
    
        if (xsna.wp80.g((xsna.ilk) r9, r3.C) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bb, code lost:
    
        if (xsna.wp80.g((xsna.hs8) r9, r3.b) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
    
        if (xsna.wp80.g((xsna.rxu) r9, r3.q) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
    
        if (xsna.wp80.g((xsna.s6s) r9, r3.r) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        if (xsna.wp80.g((xsna.zfg0) r9, r3.s) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ff, code lost:
    
        if (xsna.wp80.g((xsna.w170) r9, r3.u) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0110, code lost:
    
        if (xsna.wp80.g((xsna.l3d0) r9, r3.t) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0120, code lost:
    
        if (xsna.wp80.g((xsna.u3i0) r9, r3.D) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0130, code lost:
    
        if (xsna.wp80.g((xsna.w6y0) r9, r3.E) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0140, code lost:
    
        if (xsna.wp80.g((xsna.cmq) r9, r3.B) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0150, code lost:
    
        if (xsna.wp80.g((xsna.smz) r9, r3.o) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0160, code lost:
    
        if (xsna.wp80.g((xsna.ojz) r9, r3.p) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0170, code lost:
    
        if (xsna.wp80.g((xsna.alp) r9, r3.z) == false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(List list, a aVar) {
        boolean z;
        Pair pair;
        Pair pair2;
        l2u0 l2u0Var;
        i10 i10Var = i10.this;
        aqj0 aqj0Var = this.c;
        lp2 lp2Var = this.y;
        lp2Var.getClass();
        long b = k830.b();
        ArrayList arrayList = lp2Var.a;
        arrayList.clear();
        ArrayList arrayList2 = lp2Var.b;
        arrayList2.clear();
        for (Object obj : list) {
            if (obj instanceof l2u0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l2u0 l2u0Var2 = (l2u0) it.next();
            if (!(l2u0Var2 instanceof PlayPauseButtonViewState)) {
                if (!(l2u0Var2 instanceof mbu)) {
                    if (!(l2u0Var2 instanceof g3e0)) {
                        if (!(l2u0Var2 instanceof qso0)) {
                            if (!(l2u0Var2 instanceof ozb0)) {
                                if (!(l2u0Var2 instanceof ilk)) {
                                    if (!(l2u0Var2 instanceof hs8)) {
                                        if (!(l2u0Var2 instanceof rxu)) {
                                            if (!(l2u0Var2 instanceof s6s)) {
                                                if (!(l2u0Var2 instanceof zfg0)) {
                                                    if (!(l2u0Var2 instanceof w170)) {
                                                        if (!(l2u0Var2 instanceof l3d0)) {
                                                            if (!(l2u0Var2 instanceof u3i0)) {
                                                                if (!(l2u0Var2 instanceof w6y0)) {
                                                                    if (!(l2u0Var2 instanceof cmq)) {
                                                                        if (!(l2u0Var2 instanceof smz)) {
                                                                            if (!(l2u0Var2 instanceof ojz)) {
                                                                                if (!(l2u0Var2 instanceof alp)) {
                                                                                    throw new NoWhenBranchMatchedException();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (l2u0Var != null) {
                arrayList2.add(l2u0Var);
            }
        }
        lp2Var.e = arrayList2;
        zno.m(jvo0.a.b(b));
        i10Var.b(lp2Var.e);
        s3q0 s3q0Var = s3q0.a;
        long b2 = k830.b();
        lp2Var.a().clear();
        ArrayList arrayList3 = lp2Var.e;
        ArrayList a2 = lp2Var.a();
        Iterator it2 = arrayList3.iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            } else {
                a2.add(one.video.controls.view.state.b.a((l2u0) it2.next(), true));
            }
        }
        lp2Var.e = lp2Var.a();
        zno.m(jvo0.a.b(b2));
        i10Var.b(lp2Var.e);
        s3q0 s3q0Var2 = s3q0.a;
        boolean z2 = this.j.b;
        long j = this.z.a;
        nn80 nn80Var = this.a;
        OneVideoSeekBarView oneVideoSeekBarView = nn80Var.y;
        long b3 = k830.b();
        ArrayList arrayList4 = lp2Var.c;
        arrayList4.clear();
        ArrayList arrayList5 = lp2Var.d;
        arrayList5.clear();
        Iterator it3 = lp2Var.e.iterator();
        while (it3.hasNext()) {
            l2u0 l2u0Var3 = (l2u0) it3.next();
            boolean z3 = z;
            if (l2u0Var3 instanceof hs8) {
                pair = new Pair(l2u0Var3, nn80Var.b);
            } else if (l2u0Var3 instanceof ilk) {
                pair = new Pair(l2u0Var3, nn80Var.f);
            } else if (l2u0Var3 instanceof alp) {
                pair = new Pair(l2u0Var3, nn80Var.g);
            } else if (l2u0Var3 instanceof cmq) {
                pair = new Pair(l2u0Var3, nn80Var.j);
            } else if (l2u0Var3 instanceof s6s) {
                pair = new Pair(l2u0Var3, nn80Var.l);
            } else if (l2u0Var3 instanceof mbu) {
                pair = new Pair(l2u0Var3, nn80Var.o);
            } else if (l2u0Var3 instanceof rxu) {
                pair = new Pair(l2u0Var3, nn80Var.p);
            } else if (l2u0Var3 instanceof ojz) {
                LiveLabelView liveLabelView = oneVideoSeekBarView.getLiveLabelView();
                if (liveLabelView != null) {
                    pair2 = new Pair(l2u0Var3, liveLabelView);
                    pair = pair2;
                }
                pair = null;
            } else if (l2u0Var3 instanceof smz) {
                LiveTimeView liveTimeView = oneVideoSeekBarView.getLiveTimeView();
                if (liveTimeView != null) {
                    pair2 = new Pair(l2u0Var3, liveTimeView);
                    pair = pair2;
                }
                pair = null;
            } else if (l2u0Var3 instanceof w170) {
                pair = new Pair(l2u0Var3, nn80Var.q);
            } else if (l2u0Var3 instanceof PlayPauseButtonViewState) {
                pair = new Pair(l2u0Var3, nn80Var.s);
            } else if (l2u0Var3 instanceof ozb0) {
                pair = new Pair(l2u0Var3, nn80Var.t);
            } else if (l2u0Var3 instanceof l3d0) {
                pair = new Pair(l2u0Var3, nn80Var.u);
            } else if (l2u0Var3 instanceof g3e0) {
                pair = new Pair(l2u0Var3, oneVideoSeekBarView.getProgressSeekBarView());
            } else if (l2u0Var3 instanceof zfg0) {
                pair = new Pair(l2u0Var3, nn80Var.w);
            } else if (l2u0Var3 instanceof u3i0) {
                pair = new Pair(l2u0Var3, z2 ? nn80Var.m : nn80Var.z);
            } else if (l2u0Var3 instanceof qso0) {
                pair = new Pair(l2u0Var3, oneVideoSeekBarView.getThumbSeekBarView());
            } else {
                if (!(l2u0Var3 instanceof w6y0)) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(l2u0Var3, nn80Var.E);
            }
            if (pair != null) {
                arrayList5.add(pair);
            }
            z = z3;
        }
        boolean z4 = z;
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            Pair pair3 = (Pair) it4.next();
            l2u0 l2u0Var4 = (l2u0) pair3.d();
            View view = (View) pair3.g();
            float f = l2u0Var4.isVisible() ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f2 = 1.0f - f;
            Property property = View.ALPHA;
            float[] fArr = new float[2];
            fArr[0] = f2;
            fArr[z4 ? 1 : 0] = f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
            ofFloat.setDuration(zno.e(j));
            ofFloat.addListener(new kp2(view, f2));
            ofFloat.addListener(new jp2(view, l2u0Var4));
            arrayList4.add(ofFloat);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList4);
        lp2Var.f = animatorSet;
        animatorSet.addListener(new ip2(lp2Var));
        zno.m(jvo0.a.b(b3));
        animatorSet.addListener(new g10(this, aVar));
        animatorSet.start();
    }

    public final void b(List list) {
        long b = k830.b();
        aqj0 aqj0Var = this.c;
        Iterator it = list.iterator();
        while (true) {
            aqj0 aqj0Var2 = aqj0Var;
            while (it.hasNext()) {
                x0u0 x0u0Var = (x0u0) it.next();
                if (x0u0Var instanceof hs8) {
                    aqj0Var = aqj0.a(aqj0Var2, null, (hs8) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3);
                } else if (x0u0Var instanceof CastButtonState) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, (CastButtonState) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5);
                } else if (x0u0Var instanceof p5r) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, (p5r) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9);
                } else if (x0u0Var instanceof sxs) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, (sxs) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17);
                } else if (x0u0Var instanceof woa0) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, (woa0) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33);
                } else if (x0u0Var instanceof k4h0) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, (k4h0) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65);
                } else if (x0u0Var instanceof w0j0) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, (w0j0) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129);
                } else if (x0u0Var instanceof v7o0) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, (v7o0) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257);
                } else if (x0u0Var instanceof ldr0) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, (ldr0) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -513);
                } else if (x0u0Var instanceof ozb0) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, (ozb0) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025);
                } else if (x0u0Var instanceof hn80) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, (hn80) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049);
                } else if (x0u0Var instanceof g3e0) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, (g3e0) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097);
                } else if (x0u0Var instanceof qso0) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, (qso0) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193);
                } else if (x0u0Var instanceof smz) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (smz) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385);
                } else if (x0u0Var instanceof ojz) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (ojz) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769);
                } else if (x0u0Var instanceof rxu) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (rxu) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537);
                } else if (x0u0Var instanceof s6s) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (s6s) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131073);
                } else if (x0u0Var instanceof zfg0) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (zfg0) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145);
                } else if (x0u0Var instanceof l3d0) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (l3d0) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, null, -524289);
                } else if (x0u0Var instanceof w170) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (w170) x0u0Var, null, null, null, null, null, null, null, null, null, null, null, -1048577);
                } else if (x0u0Var instanceof mbu) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (mbu) x0u0Var, null, null, null, null, null, null, null, null, null, null, -2097153);
                } else if (x0u0Var instanceof w3e0) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (w3e0) x0u0Var, null, null, null, null, null, null, null, null, null, -4194305);
                } else if (x0u0Var instanceof PlayPauseButtonViewState) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (PlayPauseButtonViewState) x0u0Var, null, null, null, null, null, null, null, null, -8388609);
                } else if (x0u0Var instanceof zfk0) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (zfk0) x0u0Var, null, null, null, null, null, null, null, -16777217);
                } else if (x0u0Var instanceof alp) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (alp) x0u0Var, null, null, null, null, null, null, -33554433);
                } else if (x0u0Var instanceof ixp) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (ixp) x0u0Var, null, null, null, null, null, -67108865);
                } else if (x0u0Var instanceof cmq) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (cmq) x0u0Var, null, null, null, null, -134217729);
                } else if (x0u0Var instanceof ilk) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (ilk) x0u0Var, null, null, null, -268435457);
                } else if (x0u0Var instanceof u3i0) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (u3i0) x0u0Var, null, null, -536870913);
                } else if (x0u0Var instanceof w6y0) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (w6y0) x0u0Var, null, -1073741825);
                } else if (x0u0Var instanceof wlq) {
                    aqj0Var = aqj0.a(aqj0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (wlq) x0u0Var, Integer.MAX_VALUE);
                } else if (!(x0u0Var instanceof p0a)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            this.c = aqj0Var2;
            jvo0.a.b(b);
            long b2 = k830.b();
            this.b.accept(new o10.b(list));
            jvo0.a.b(b2);
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x022e, code lost:
    
        if (r9 == true) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:814:0x0b81  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x0b8c  */
    /* JADX WARN: Removed duplicated region for block: B:821:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:846:0x0a42  */
    /* JADX WARN: Removed duplicated region for block: B:847:0x0a32  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(bu buVar) {
        Object bVar;
        boolean z;
        boolean z2;
        OneVideoPlayer.State state;
        TransformController.ScaleType scaleType;
        SimpleControlsView.e eVar;
        boolean z3;
        List singletonList;
        TransformController.ScaleType scaleType2;
        TransformController.ScaleType scaleType3;
        wlq wlqVar;
        OneVideoPlayer.State state2;
        boolean z4;
        OneVideoPlayer.State state3;
        fzi fziVar;
        boolean z5;
        boolean z6;
        boolean z7;
        CastButtonState castButtonState;
        k4h0 k4h0Var;
        sxs sxsVar;
        ixp ixpVar;
        OneVideoPlaybackException oneVideoPlaybackException;
        Integer num;
        boolean z8;
        boolean z9;
        boolean a2;
        CastButtonState.CastButtonConnectionState castButtonConnectionState;
        boolean z10;
        TransformController.ScaleType scaleType4;
        SimpleControlsView.e eVar2;
        boolean z11;
        aqj0 aqj0Var;
        boolean z12;
        boolean z13;
        AnimatorSet animatorSet;
        boolean z14 = (buVar instanceof bu.f.a) && ((bu.f.a) buVar).a;
        if (z14 && (animatorSet = this.y.f) != null) {
            animatorSet.end();
        }
        long b = k830.b();
        aqj0 aqj0Var2 = this.c;
        fzi fziVar2 = this.d;
        g2b0 g2b0Var = this.e;
        ilk ilkVar = aqj0Var2.C;
        w6y0 w6y0Var = aqj0Var2.E;
        Mode mode = aqj0Var2.a;
        PlayPauseButtonViewState playPauseButtonViewState = aqj0Var2.x;
        CastButtonState castButtonState2 = aqj0Var2.c;
        u3i0 u3i0Var = aqj0Var2.D;
        ojz ojzVar = aqj0Var2.p;
        smz smzVar = aqj0Var2.o;
        boolean z15 = z14;
        mbu mbuVar = aqj0Var2.v;
        hs8 hs8Var = aqj0Var2.b;
        zfg0 zfg0Var = aqj0Var2.s;
        s6s s6sVar = aqj0Var2.r;
        rxu rxuVar = aqj0Var2.q;
        hn80 hn80Var = aqj0Var2.l;
        qso0 qso0Var = aqj0Var2.n;
        cmq cmqVar = aqj0Var2.B;
        k4h0 k4h0Var2 = aqj0Var2.g;
        sxs sxsVar2 = aqj0Var2.e;
        w170 w170Var = aqj0Var2.u;
        l3d0 l3d0Var = aqj0Var2.t;
        Mode mode2 = aqj0Var2.a;
        g3e0 g3e0Var = aqj0Var2.m;
        SimpleControlsView.e eVar3 = fziVar2.l;
        gzs<s3q0> gzsVar = fziVar2.g;
        gzs<s3q0> gzsVar2 = fziVar2.c;
        y5r y5rVar = fziVar2.d;
        txs txsVar = fziVar2.f;
        gzs<s3q0> gzsVar3 = fziVar2.i;
        gzs<s3q0> gzsVar4 = fziVar2.h;
        yqj yqjVar = fziVar2.a;
        rs8 rs8Var = fziVar2.b;
        TransformController transformController = fziVar2.e;
        boolean z16 = buVar instanceof bu.c;
        ldr0 ldr0Var = ldr0.c;
        ldr0 ldr0Var2 = ldr0.b;
        v7o0 v7o0Var = v7o0.c;
        v7o0 v7o0Var2 = v7o0.b;
        Integer num2 = null;
        w0j0 w0j0Var = w0j0.c;
        w0j0 w0j0Var2 = w0j0.b;
        woa0 woa0Var = woa0.b;
        p5r p5rVar = p5r.c;
        p5r p5rVar2 = p5r.b;
        if (z16) {
            bu.c cVar = (bu.c) buVar;
            alp alpVar = aqj0Var2.z;
            wlq wlqVar2 = aqj0Var2.F;
            boolean equals = cVar.equals(bu.c.a.a);
            wlq wlqVar3 = wlq.c;
            w3e0 w3e0Var = w3e0.c;
            w3e0 w3e0Var2 = w3e0.b;
            if (equals) {
                if (g2b0Var == null) {
                    aqj0Var = aqj0.G;
                } else {
                    long j = g2b0Var.e;
                    OneVideoPlayer.State state4 = g2b0Var.a;
                    long j2 = g2b0Var.g;
                    boolean z17 = g2b0Var.h;
                    if (state4 == OneVideoPlayer.State.BUFFERING) {
                        w3e0Var = w3e0Var2;
                    }
                    Mode mode3 = Mode.SHOW;
                    if (mode2 == mode3) {
                        fziVar = fziVar2;
                        if (g2b0Var.c && (state4 == OneVideoPlayer.State.PLAYING || state4 == OneVideoPlayer.State.PAUSED)) {
                            z5 = true;
                            OneVideoPlayer.State state5 = OneVideoPlayer.State.PLAYING;
                            PlayPauseButtonViewState a3 = one.video.controls.view.state.a.a(playPauseButtonViewState, z5, false, state4 != state5 ? PlayPauseButtonViewState.ImageType.PAUSE : PlayPauseButtonViewState.ImageType.PLAY, 2);
                            zfk0 zfk0Var = ((state4 != state5 || state4 == OneVideoPlayer.State.PAUSED) && g2b0Var.k.isEmpty()) ? zfk0.b : zfk0.c;
                            if (g2b0Var.d && state4 != OneVideoPlayer.State.IDLE && state4 != OneVideoPlayer.State.ERROR && state4 != OneVideoPlayer.State.RELEASED) {
                                int i = ulq.b;
                                int i2 = wn80.a;
                                z12 = j2 - j <= 0;
                                z13 = j <= 0;
                                if (z12 == wlqVar2.a || z13 != wlqVar2.b) {
                                    wlqVar2 = new wlq(z12, z13);
                                }
                                wlqVar3 = wlqVar2;
                            }
                            rxu e = sni.e(rxuVar, (mode2 != mode3 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var), false, 2);
                            s6s i3 = fai.i(s6sVar, (mode2 != mode3 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var), false, 2);
                            EnumSet<OneVideoPlayer.State> enumSet = agg0.a;
                            zfg0 q = dz5.q(zfg0Var, mode2 != Mode.HIDE && agg0.a.contains(state4), false, 2);
                            hs8 j3 = n34.j(hs8Var, mode2 != mode3 && h2b0.a(g2b0Var), false, 2);
                            ozb0 ozb0Var = aqj0Var2.k;
                            boolean z18 = (mode == mode3 || z17 || !h2b0.a(g2b0Var)) ? false : true;
                            EnumSet<OneVideoPlayer.State> enumSet2 = h2b0.a;
                            long j4 = 1000;
                            ozb0 p = fsk.p(ozb0Var, z18, false, (int) (j2 / j4), (int) (j / j4), 2);
                            l3d0 k = s101.k(l3d0Var, (mode2 == mode3 || !h2b0.a(g2b0Var) || gzsVar4 == null) ? false : true, false, 2);
                            w170 q2 = d02.q(w170Var, (mode2 == mode3 || !h2b0.a(g2b0Var) || gzsVar3 == null) ? false : true, false, 2);
                            mbu e2 = his0.e(mbuVar, mode2 != mode3 && h2b0.a(g2b0Var), false, 2);
                            fzi fziVar3 = fziVar;
                            hn80 m = k15.m(hn80Var, g2b0Var, fziVar3);
                            if (yqjVar.a) {
                                z6 = z17;
                            } else {
                                z6 = z17;
                            }
                            if ((mode2 != mode3 && mode2 != Mode.SHOW_SEEK_PREVIEW) || !h2b0.a(g2b0Var) || j2 == 0) {
                                z7 = false;
                                g3e0 h = znk0.h(g3e0Var, z7, false, 2);
                                qso0 k2 = sp.k(qso0Var, (mode2 != mode3 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var) && j2 != 0, false, 2);
                                smz j5 = f370.j(smzVar, mode2 != mode3 && z6 && h2b0.a(g2b0Var) && j2 != 0, false, 2);
                                ojz g = tci.g(ojzVar, mode2 != mode3 && z6 && h2b0.a(g2b0Var) && j2 != 0, false, 2);
                                zfk0 zfk0Var2 = zfk0Var;
                                castButtonState = castButtonState2;
                                k4h0Var = k4h0Var2;
                                sxsVar = sxsVar2;
                                u3i0 a4 = w3i0.a(u3i0Var, aqj0Var2.a, g2b0Var, fziVar3, u3i0Var.d, null, 32);
                                alp d = i35.d(alpVar, state4 != OneVideoPlayer.State.ENDED, false, 2);
                                ixpVar = aqj0Var2.A;
                                oneVideoPlaybackException = g2b0Var.b;
                                if (oneVideoPlaybackException != null) {
                                    int i4 = bxp.$EnumSwitchMapping$0[oneVideoPlaybackException.d().ordinal()];
                                    int i5 = R.string.one_video_error_not_supported;
                                    switch (i4) {
                                        case 1:
                                        case 2:
                                        case 10:
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                            i5 = R.string.one_video_error_restricted;
                                            break;
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                            i5 = R.string.one_video_error_decoder;
                                            break;
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                            i5 = R.string.one_video_error_io;
                                            break;
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                            i5 = R.string.one_video_error_internal;
                                            break;
                                        default:
                                            i5 = R.string.one_video_error;
                                            break;
                                    }
                                    num2 = Integer.valueOf(i5);
                                }
                                num = num2;
                                z8 = state4 != OneVideoPlayer.State.ERROR;
                                if (z8 == ixpVar.a || !epx.f(num, ixpVar.b)) {
                                    ixpVar = new ixp(z8, num);
                                }
                                z9 = txsVar == null && rs8Var.g;
                                a2 = txsVar == null ? txsVar.a() : false;
                                if (z9 == sxsVar.a || a2 != sxsVar.b) {
                                    sxsVar = new sxs(z9, a2);
                                }
                                castButtonConnectionState = CastButtonState.CastButtonConnectionState.DISCONNECTED;
                                if (!castButtonState.a || castButtonConnectionState != castButtonState.b) {
                                    castButtonState = new CastButtonState(false, castButtonConnectionState);
                                }
                                if (y5rVar != null && rs8Var.b) {
                                    p5rVar = p5rVar2;
                                }
                                z10 = transformController == null && rs8Var.f;
                                if (transformController != null || (scaleType4 = transformController.e) == null) {
                                    scaleType4 = k4h0.c.b;
                                }
                                if (z10 == k4h0Var.a || scaleType4 != k4h0Var.b) {
                                    k4h0Var = new k4h0(scaleType4, z10);
                                }
                                k4h0 k4h0Var3 = k4h0Var;
                                if (rs8Var.e) {
                                    w0j0Var = w0j0Var2;
                                }
                                if (gzsVar2 != null && rs8Var.a) {
                                    v7o0Var = v7o0Var2;
                                }
                                if (gzsVar != null && rs8Var.h) {
                                    ldr0Var = ldr0Var2;
                                }
                                cmq h2 = kn4.h(cmqVar, mode2 != Mode.SHOW_FAST_SPEED && state4 == state5, false, 2);
                                sox.a aVar = ilkVar.c;
                                int i6 = ilkVar.d;
                                int i7 = ilkVar.e;
                                if (mode2 != mode3) {
                                    eVar2 = eVar3;
                                    if (eVar2.a && aVar != null && h2b0.a(g2b0Var)) {
                                        z11 = true;
                                        boolean z19 = eVar2.b;
                                        SimpleControlsView.e.a aVar2 = eVar2.c;
                                        aqj0Var = new aqj0(mode2, j3, castButtonState, p5rVar, sxsVar, woa0Var, k4h0Var3, w0j0Var, v7o0Var, ldr0Var, p, m, h, k2, j5, g, e, i3, q, k, q2, e2, w3e0Var, a3, zfk0Var2, d, ixpVar, h2, jlk.a(ilkVar, z11, false, aVar, i6, i7, z19, aVar2.a, aVar2.b, aVar2.c, 2), a4, s1v.d(w6y0Var, mode2 != Mode.SHOW_ZOOM_RATE && h2b0.a(g2b0Var), false, transformController != null ? transformController.c().e.a : 1.0f, 2), wlqVar3);
                                    }
                                } else {
                                    eVar2 = eVar3;
                                }
                                z11 = false;
                                boolean z192 = eVar2.b;
                                SimpleControlsView.e.a aVar22 = eVar2.c;
                                aqj0Var = new aqj0(mode2, j3, castButtonState, p5rVar, sxsVar, woa0Var, k4h0Var3, w0j0Var, v7o0Var, ldr0Var, p, m, h, k2, j5, g, e, i3, q, k, q2, e2, w3e0Var, a3, zfk0Var2, d, ixpVar, h2, jlk.a(ilkVar, z11, false, aVar, i6, i7, z192, aVar22.a, aVar22.b, aVar22.c, 2), a4, s1v.d(w6y0Var, mode2 != Mode.SHOW_ZOOM_RATE && h2b0.a(g2b0Var), false, transformController != null ? transformController.c().e.a : 1.0f, 2), wlqVar3);
                            }
                            z7 = true;
                            g3e0 h3 = znk0.h(g3e0Var, z7, false, 2);
                            qso0 k22 = sp.k(qso0Var, (mode2 != mode3 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var) && j2 != 0, false, 2);
                            smz j52 = f370.j(smzVar, mode2 != mode3 && z6 && h2b0.a(g2b0Var) && j2 != 0, false, 2);
                            ojz g2 = tci.g(ojzVar, mode2 != mode3 && z6 && h2b0.a(g2b0Var) && j2 != 0, false, 2);
                            zfk0 zfk0Var22 = zfk0Var;
                            castButtonState = castButtonState2;
                            k4h0Var = k4h0Var2;
                            sxsVar = sxsVar2;
                            u3i0 a42 = w3i0.a(u3i0Var, aqj0Var2.a, g2b0Var, fziVar3, u3i0Var.d, null, 32);
                            alp d2 = i35.d(alpVar, state4 != OneVideoPlayer.State.ENDED, false, 2);
                            ixpVar = aqj0Var2.A;
                            oneVideoPlaybackException = g2b0Var.b;
                            if (oneVideoPlaybackException != null) {
                            }
                            num = num2;
                            if (state4 != OneVideoPlayer.State.ERROR) {
                            }
                            if (z8 == ixpVar.a) {
                            }
                            ixpVar = new ixp(z8, num);
                            if (txsVar == null) {
                            }
                            if (txsVar == null) {
                            }
                            if (z9 == sxsVar.a) {
                            }
                            sxsVar = new sxs(z9, a2);
                            castButtonConnectionState = CastButtonState.CastButtonConnectionState.DISCONNECTED;
                            if (!castButtonState.a) {
                            }
                            castButtonState = new CastButtonState(false, castButtonConnectionState);
                            if (y5rVar != null) {
                                p5rVar = p5rVar2;
                            }
                            if (transformController == null) {
                            }
                            if (transformController != null) {
                            }
                            scaleType4 = k4h0.c.b;
                            if (z10 == k4h0Var.a) {
                            }
                            k4h0Var = new k4h0(scaleType4, z10);
                            k4h0 k4h0Var32 = k4h0Var;
                            if (rs8Var.e) {
                            }
                            if (gzsVar2 != null) {
                                v7o0Var = v7o0Var2;
                            }
                            if (gzsVar != null) {
                                ldr0Var = ldr0Var2;
                            }
                            cmq h22 = kn4.h(cmqVar, mode2 != Mode.SHOW_FAST_SPEED && state4 == state5, false, 2);
                            sox.a aVar3 = ilkVar.c;
                            int i62 = ilkVar.d;
                            int i72 = ilkVar.e;
                            if (mode2 != mode3) {
                            }
                            z11 = false;
                            boolean z1922 = eVar2.b;
                            SimpleControlsView.e.a aVar222 = eVar2.c;
                            aqj0Var = new aqj0(mode2, j3, castButtonState, p5rVar, sxsVar, woa0Var, k4h0Var32, w0j0Var, v7o0Var, ldr0Var, p, m, h3, k22, j52, g2, e, i3, q, k, q2, e2, w3e0Var, a3, zfk0Var22, d2, ixpVar, h22, jlk.a(ilkVar, z11, false, aVar3, i62, i72, z1922, aVar222.a, aVar222.b, aVar222.c, 2), a42, s1v.d(w6y0Var, mode2 != Mode.SHOW_ZOOM_RATE && h2b0.a(g2b0Var), false, transformController != null ? transformController.c().e.a : 1.0f, 2), wlqVar3);
                        }
                    } else {
                        fziVar = fziVar2;
                    }
                    z5 = false;
                    OneVideoPlayer.State state52 = OneVideoPlayer.State.PLAYING;
                    PlayPauseButtonViewState a32 = one.video.controls.view.state.a.a(playPauseButtonViewState, z5, false, state4 != state52 ? PlayPauseButtonViewState.ImageType.PAUSE : PlayPauseButtonViewState.ImageType.PLAY, 2);
                    if (state4 != state52) {
                    }
                    if (g2b0Var.d) {
                        int i8 = ulq.b;
                        int i22 = wn80.a;
                        if (j2 - j <= 0) {
                        }
                        if (j <= 0) {
                        }
                        if (z12 == wlqVar2.a) {
                        }
                        wlqVar2 = new wlq(z12, z13);
                        wlqVar3 = wlqVar2;
                    }
                    rxu e3 = sni.e(rxuVar, (mode2 != mode3 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var), false, 2);
                    s6s i32 = fai.i(s6sVar, (mode2 != mode3 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var), false, 2);
                    EnumSet<OneVideoPlayer.State> enumSet3 = agg0.a;
                    zfg0 q3 = dz5.q(zfg0Var, mode2 != Mode.HIDE && agg0.a.contains(state4), false, 2);
                    hs8 j32 = n34.j(hs8Var, mode2 != mode3 && h2b0.a(g2b0Var), false, 2);
                    ozb0 ozb0Var2 = aqj0Var2.k;
                    if (mode == mode3) {
                    }
                    EnumSet<OneVideoPlayer.State> enumSet22 = h2b0.a;
                    long j42 = 1000;
                    ozb0 p2 = fsk.p(ozb0Var2, z18, false, (int) (j2 / j42), (int) (j / j42), 2);
                    l3d0 k3 = s101.k(l3d0Var, (mode2 == mode3 || !h2b0.a(g2b0Var) || gzsVar4 == null) ? false : true, false, 2);
                    w170 q22 = d02.q(w170Var, (mode2 == mode3 || !h2b0.a(g2b0Var) || gzsVar3 == null) ? false : true, false, 2);
                    mbu e22 = his0.e(mbuVar, mode2 != mode3 && h2b0.a(g2b0Var), false, 2);
                    fzi fziVar32 = fziVar;
                    hn80 m2 = k15.m(hn80Var, g2b0Var, fziVar32);
                    if (yqjVar.a) {
                    }
                    if (mode2 != mode3) {
                        z7 = false;
                        g3e0 h32 = znk0.h(g3e0Var, z7, false, 2);
                        qso0 k222 = sp.k(qso0Var, (mode2 != mode3 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var) && j2 != 0, false, 2);
                        smz j522 = f370.j(smzVar, mode2 != mode3 && z6 && h2b0.a(g2b0Var) && j2 != 0, false, 2);
                        ojz g22 = tci.g(ojzVar, mode2 != mode3 && z6 && h2b0.a(g2b0Var) && j2 != 0, false, 2);
                        zfk0 zfk0Var222 = zfk0Var;
                        castButtonState = castButtonState2;
                        k4h0Var = k4h0Var2;
                        sxsVar = sxsVar2;
                        u3i0 a422 = w3i0.a(u3i0Var, aqj0Var2.a, g2b0Var, fziVar32, u3i0Var.d, null, 32);
                        alp d22 = i35.d(alpVar, state4 != OneVideoPlayer.State.ENDED, false, 2);
                        ixpVar = aqj0Var2.A;
                        oneVideoPlaybackException = g2b0Var.b;
                        if (oneVideoPlaybackException != null) {
                        }
                        num = num2;
                        if (state4 != OneVideoPlayer.State.ERROR) {
                        }
                        if (z8 == ixpVar.a) {
                        }
                        ixpVar = new ixp(z8, num);
                        if (txsVar == null) {
                        }
                        if (txsVar == null) {
                        }
                        if (z9 == sxsVar.a) {
                        }
                        sxsVar = new sxs(z9, a2);
                        castButtonConnectionState = CastButtonState.CastButtonConnectionState.DISCONNECTED;
                        if (!castButtonState.a) {
                        }
                        castButtonState = new CastButtonState(false, castButtonConnectionState);
                        if (y5rVar != null) {
                        }
                        if (transformController == null) {
                        }
                        if (transformController != null) {
                        }
                        scaleType4 = k4h0.c.b;
                        if (z10 == k4h0Var.a) {
                        }
                        k4h0Var = new k4h0(scaleType4, z10);
                        k4h0 k4h0Var322 = k4h0Var;
                        if (rs8Var.e) {
                        }
                        if (gzsVar2 != null) {
                        }
                        if (gzsVar != null) {
                        }
                        cmq h222 = kn4.h(cmqVar, mode2 != Mode.SHOW_FAST_SPEED && state4 == state52, false, 2);
                        sox.a aVar32 = ilkVar.c;
                        int i622 = ilkVar.d;
                        int i722 = ilkVar.e;
                        if (mode2 != mode3) {
                        }
                        z11 = false;
                        boolean z19222 = eVar2.b;
                        SimpleControlsView.e.a aVar2222 = eVar2.c;
                        aqj0Var = new aqj0(mode2, j32, castButtonState, p5rVar, sxsVar, woa0Var, k4h0Var322, w0j0Var, v7o0Var, ldr0Var, p2, m2, h32, k222, j522, g22, e3, i32, q3, k3, q22, e22, w3e0Var, a32, zfk0Var222, d22, ixpVar, h222, jlk.a(ilkVar, z11, false, aVar32, i622, i722, z19222, aVar2222.a, aVar2222.b, aVar2222.c, 2), a422, s1v.d(w6y0Var, mode2 != Mode.SHOW_ZOOM_RATE && h2b0.a(g2b0Var), false, transformController != null ? transformController.c().e.a : 1.0f, 2), wlqVar3);
                    }
                    z7 = false;
                    g3e0 h322 = znk0.h(g3e0Var, z7, false, 2);
                    qso0 k2222 = sp.k(qso0Var, (mode2 != mode3 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var) && j2 != 0, false, 2);
                    smz j5222 = f370.j(smzVar, mode2 != mode3 && z6 && h2b0.a(g2b0Var) && j2 != 0, false, 2);
                    ojz g222 = tci.g(ojzVar, mode2 != mode3 && z6 && h2b0.a(g2b0Var) && j2 != 0, false, 2);
                    zfk0 zfk0Var2222 = zfk0Var;
                    castButtonState = castButtonState2;
                    k4h0Var = k4h0Var2;
                    sxsVar = sxsVar2;
                    u3i0 a4222 = w3i0.a(u3i0Var, aqj0Var2.a, g2b0Var, fziVar32, u3i0Var.d, null, 32);
                    alp d222 = i35.d(alpVar, state4 != OneVideoPlayer.State.ENDED, false, 2);
                    ixpVar = aqj0Var2.A;
                    oneVideoPlaybackException = g2b0Var.b;
                    if (oneVideoPlaybackException != null) {
                    }
                    num = num2;
                    if (state4 != OneVideoPlayer.State.ERROR) {
                    }
                    if (z8 == ixpVar.a) {
                    }
                    ixpVar = new ixp(z8, num);
                    if (txsVar == null) {
                    }
                    if (txsVar == null) {
                    }
                    if (z9 == sxsVar.a) {
                    }
                    sxsVar = new sxs(z9, a2);
                    castButtonConnectionState = CastButtonState.CastButtonConnectionState.DISCONNECTED;
                    if (!castButtonState.a) {
                    }
                    castButtonState = new CastButtonState(false, castButtonConnectionState);
                    if (y5rVar != null) {
                    }
                    if (transformController == null) {
                    }
                    if (transformController != null) {
                    }
                    scaleType4 = k4h0.c.b;
                    if (z10 == k4h0Var.a) {
                    }
                    k4h0Var = new k4h0(scaleType4, z10);
                    k4h0 k4h0Var3222 = k4h0Var;
                    if (rs8Var.e) {
                    }
                    if (gzsVar2 != null) {
                    }
                    if (gzsVar != null) {
                    }
                    cmq h2222 = kn4.h(cmqVar, mode2 != Mode.SHOW_FAST_SPEED && state4 == state52, false, 2);
                    sox.a aVar322 = ilkVar.c;
                    int i6222 = ilkVar.d;
                    int i7222 = ilkVar.e;
                    if (mode2 != mode3) {
                    }
                    z11 = false;
                    boolean z192222 = eVar2.b;
                    SimpleControlsView.e.a aVar22222 = eVar2.c;
                    aqj0Var = new aqj0(mode2, j32, castButtonState, p5rVar, sxsVar, woa0Var, k4h0Var3222, w0j0Var, v7o0Var, ldr0Var, p2, m2, h322, k2222, j5222, g222, e3, i32, q3, k3, q22, e22, w3e0Var, a32, zfk0Var2222, d222, ixpVar, h2222, jlk.a(ilkVar, z11, false, aVar322, i6222, i7222, z192222, aVar22222.a, aVar22222.b, aVar22222.c, 2), a4222, s1v.d(w6y0Var, mode2 != Mode.SHOW_ZOOM_RATE && h2b0.a(g2b0Var), false, transformController != null ? transformController.c().e.a : 1.0f, 2), wlqVar3);
                }
                bVar = new o10.a(aqj0Var);
            } else if (cVar.equals(bu.c.d.a)) {
                boolean z20 = mode2 == Mode.SHOW && g2b0Var != null && g2b0Var.c && ((state3 = g2b0Var.a) == OneVideoPlayer.State.PLAYING || state3 == OneVideoPlayer.State.PAUSED);
                OneVideoPlayer.State state6 = g2b0Var != null ? g2b0Var.a : null;
                OneVideoPlayer.State state7 = OneVideoPlayer.State.PLAYING;
                PlayPauseButtonViewState a5 = one.video.controls.view.state.a.a(playPauseButtonViewState, z20, false, state6 == state7 ? PlayPauseButtonViewState.ImageType.PAUSE : PlayPauseButtonViewState.ImageType.PLAY, 2);
                w3e0 w3e0Var3 = (g2b0Var != null ? g2b0Var.a : null) == OneVideoPlayer.State.BUFFERING ? w3e0Var2 : w3e0Var;
                alp d3 = i35.d(alpVar, (g2b0Var != null ? g2b0Var.a : null) == OneVideoPlayer.State.ENDED, false, 2);
                if (mode2 == Mode.SHOW_FAST_SPEED) {
                    if ((g2b0Var != null ? g2b0Var.a : null) == state7) {
                        z4 = true;
                        bVar = new o10.b(e43.l(a5, w3e0Var3, d3, kn4.h(cmqVar, z4, false, 2)));
                    }
                }
                z4 = false;
                bVar = new o10.b(e43.l(a5, w3e0Var3, d3, kn4.h(cmqVar, z4, false, 2)));
            } else if (cVar instanceof bu.c.C2623c) {
                hn80 m3 = k15.m(hn80Var, g2b0Var, fziVar2);
                g3e0 h4 = znk0.h(g3e0Var, (yqjVar.a && (g2b0Var == null || !g2b0Var.h)) || ((mode2 == Mode.SHOW || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var) && (g2b0Var == null || g2b0Var.g != 0)), false, 2);
                qso0 k4 = sp.k(qso0Var, (mode2 == Mode.SHOW || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var) && (g2b0Var == null || g2b0Var.g != 0), false, 2);
                if (g2b0Var == null || !g2b0Var.d || (state2 = g2b0Var.a) == OneVideoPlayer.State.IDLE || state2 == OneVideoPlayer.State.ERROR || state2 == OneVideoPlayer.State.RELEASED) {
                    wlqVar = wlqVar3;
                } else {
                    int i9 = ulq.b;
                    long j6 = g2b0Var.e;
                    long j7 = g2b0Var.g;
                    int i10 = wn80.a;
                    boolean z21 = j7 - j6 > 0;
                    boolean z22 = j6 > 0;
                    wlqVar = (z21 == wlqVar2.a && z22 == wlqVar2.b) ? wlqVar2 : new wlq(z21, z22);
                }
                bVar = new o10.b(e43.l(m3, h4, k4, wlqVar));
            } else {
                if (!(cVar instanceof bu.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ozb0 ozb0Var3 = aqj0Var2.k;
                Mode mode4 = Mode.SHOW;
                boolean z23 = mode == mode4 && g2b0Var != null && !g2b0Var.h && h2b0.a(g2b0Var);
                EnumSet<OneVideoPlayer.State> enumSet4 = h2b0.a;
                long j8 = 1000;
                bVar = new o10.b(e43.l(fsk.p(ozb0Var3, z23, false, (int) ((g2b0Var != null ? g2b0Var.g : 0L) / j8), (int) ((g2b0Var != null ? g2b0Var.e : 0L) / j8), 2), k15.m(hn80Var, g2b0Var, fziVar2), znk0.h(g3e0Var, (yqjVar.a && (g2b0Var == null || !g2b0Var.h)) || ((mode2 == mode4 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var) && (g2b0Var == null || g2b0Var.g != 0)), false, 2), sp.k(qso0Var, (mode2 == mode4 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var) && (g2b0Var == null || g2b0Var.g != 0), false, 2)));
            }
        } else if (buVar instanceof bu.a) {
            bu.a aVar4 = (bu.a) buVar;
            if (aVar4.equals(bu.a.c.a)) {
                singletonList = Collections.singletonList(znk0.h(g3e0Var, (yqjVar.a && (g2b0Var == null || !g2b0Var.h)) || ((mode2 == Mode.SHOW || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var) && (g2b0Var == null || g2b0Var.g != 0)), false, 2));
            } else if (aVar4.equals(bu.a.C2622a.a)) {
                CastButtonState.CastButtonConnectionState castButtonConnectionState2 = CastButtonState.CastButtonConnectionState.DISCONNECTED;
                CastButtonState castButtonState3 = (castButtonState2.a || castButtonConnectionState2 != castButtonState2.b) ? new CastButtonState(false, castButtonConnectionState2) : castButtonState2;
                if (y5rVar == null || !rs8Var.b) {
                    p5rVar2 = p5rVar;
                }
                boolean z24 = txsVar != null && rs8Var.g;
                boolean a6 = txsVar != null ? txsVar.a() : false;
                sxs sxsVar3 = (z24 == sxsVar2.a && a6 == sxsVar2.b) ? sxsVar2 : new sxs(z24, a6);
                boolean z25 = transformController != null && rs8Var.f;
                if (transformController == null || (scaleType3 = transformController.e) == null) {
                    scaleType3 = k4h0.c.b;
                }
                singletonList = e43.l(castButtonState3, p5rVar2, sxsVar3, woa0Var, (z25 == k4h0Var2.a && scaleType3 == k4h0Var2.b) ? k4h0Var2 : new k4h0(scaleType3, z25), rs8Var.e ? w0j0Var2 : w0j0Var, (gzsVar2 == null || !rs8Var.a) ? v7o0Var : v7o0Var2, (gzsVar == null || !rs8Var.h) ? ldr0Var : ldr0Var2);
            } else if (aVar4.equals(bu.a.n.a)) {
                if (gzsVar != null && rs8Var.h) {
                    ldr0Var = ldr0Var2;
                }
                singletonList = Collections.singletonList(ldr0Var);
            } else if (aVar4.equals(bu.a.f.a)) {
                boolean z26 = txsVar != null && rs8Var.g;
                boolean a7 = txsVar != null ? txsVar.a() : false;
                singletonList = Collections.singletonList((z26 == sxsVar2.a && a7 == sxsVar2.b) ? sxsVar2 : new sxs(z26, a7));
            } else if (aVar4 instanceof bu.a.m) {
                boolean z27 = transformController != null && rs8Var.f;
                if (transformController == null || (scaleType2 = transformController.e) == null) {
                    scaleType2 = k4h0.c.b;
                }
                singletonList = e43.l((z27 == k4h0Var2.a && scaleType2 == k4h0Var2.b) ? k4h0Var2 : new k4h0(scaleType2, z27), s1v.d(w6y0Var, mode2 == Mode.SHOW_ZOOM_RATE && h2b0.a(g2b0Var), false, transformController != null ? transformController.c().e.a : 1.0f, 2));
            } else if (aVar4.equals(bu.a.i.a)) {
                singletonList = Collections.singletonList(woa0Var);
            } else if (aVar4.equals(bu.a.b.a)) {
                CastButtonState.CastButtonConnectionState castButtonConnectionState3 = CastButtonState.CastButtonConnectionState.DISCONNECTED;
                singletonList = Collections.singletonList((castButtonState2.a || castButtonConnectionState3 != castButtonState2.b) ? new CastButtonState(false, castButtonConnectionState3) : castButtonState2);
            } else if (aVar4.equals(bu.a.e.a)) {
                if (y5rVar != null && rs8Var.b) {
                    p5rVar = p5rVar2;
                }
                singletonList = Collections.singletonList(p5rVar);
            } else if (aVar4.equals(bu.a.k.a)) {
                if (gzsVar2 != null && rs8Var.a) {
                    v7o0Var = v7o0Var2;
                }
                singletonList = Collections.singletonList(v7o0Var);
            } else if (aVar4 instanceof bu.a.j) {
                singletonList = Collections.singletonList(s101.k(l3d0Var, mode2 == Mode.SHOW && h2b0.a(g2b0Var) && gzsVar4 != null, false, 2));
            } else if (aVar4 instanceof bu.a.h) {
                singletonList = Collections.singletonList(d02.q(w170Var, mode2 == Mode.SHOW && h2b0.a(g2b0Var) && gzsVar3 != null, false, 2));
            } else if (aVar4.equals(bu.a.l.a)) {
                singletonList = Collections.singletonList(w3i0.a(aqj0Var2.D, aqj0Var2.a, g2b0Var, fziVar2, null, null, 32));
            } else if (aVar4.equals(bu.a.g.a)) {
                singletonList = Collections.singletonList(k15.m(hn80Var, g2b0Var, fziVar2));
            } else {
                if (!aVar4.equals(bu.a.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                sox.a aVar5 = ilkVar.c;
                int i11 = ilkVar.d;
                int i12 = ilkVar.e;
                if (mode2 == Mode.SHOW) {
                    eVar = eVar3;
                    if (eVar.a && aVar5 != null && h2b0.a(g2b0Var)) {
                        z3 = true;
                        boolean z28 = eVar.b;
                        SimpleControlsView.e.a aVar6 = eVar.c;
                        singletonList = Collections.singletonList(jlk.a(ilkVar, z3, false, aVar5, i11, i12, z28, aVar6.a, aVar6.b, aVar6.c, 2));
                    }
                } else {
                    eVar = eVar3;
                }
                z3 = false;
                boolean z282 = eVar.b;
                SimpleControlsView.e.a aVar62 = eVar.c;
                singletonList = Collections.singletonList(jlk.a(ilkVar, z3, false, aVar5, i11, i12, z282, aVar62.a, aVar62.b, aVar62.c, 2));
            }
            bVar = new o10.b(singletonList);
        } else if (buVar.equals(bu.b.a)) {
            boolean z29 = txsVar != null && rs8Var.g;
            boolean a8 = txsVar != null ? txsVar.a() : false;
            bVar = new o10.b(Collections.singletonList((z29 == sxsVar2.a && a8 == sxsVar2.b) ? sxsVar2 : new sxs(z29, a8)));
        } else if (buVar.equals(bu.d.a)) {
            boolean z30 = transformController != null && rs8Var.f;
            if (transformController == null || (scaleType = transformController.e) == null) {
                scaleType = k4h0.c.b;
            }
            bVar = new o10.b(Collections.singletonList((z30 == k4h0Var2.a && scaleType == k4h0Var2.b) ? k4h0Var2 : new k4h0(scaleType, z30)));
        } else if (buVar instanceof bu.f) {
            if (!(((bu.f) buVar) instanceof bu.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            Mode mode5 = Mode.SHOW;
            boolean z31 = mode2 == mode5 && g2b0Var != null && g2b0Var.c && ((state = g2b0Var.a) == OneVideoPlayer.State.PLAYING || state == OneVideoPlayer.State.PAUSED);
            OneVideoPlayer.State state8 = g2b0Var != null ? g2b0Var.a : null;
            OneVideoPlayer.State state9 = OneVideoPlayer.State.PLAYING;
            PlayPauseButtonViewState a9 = one.video.controls.view.state.a.a(playPauseButtonViewState, z31, false, state8 == state9 ? PlayPauseButtonViewState.ImageType.PAUSE : PlayPauseButtonViewState.ImageType.PLAY, 2);
            rxu e4 = sni.e(rxuVar, (mode2 == mode5 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var), false, 2);
            s6s i13 = fai.i(s6sVar, (mode2 == mode5 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var), false, 2);
            EnumSet<OneVideoPlayer.State> enumSet5 = agg0.a;
            if (mode2 == Mode.HIDE) {
                if (agg0.a.contains(g2b0Var != null ? g2b0Var.a : null)) {
                    z = true;
                    zfg0 q4 = dz5.q(zfg0Var, z, false, 2);
                    hs8 j9 = n34.j(hs8Var, mode2 != mode5 && h2b0.a(g2b0Var), false, 2);
                    ozb0 ozb0Var4 = aqj0Var2.k;
                    boolean z32 = (mode == mode5 || g2b0Var == null || g2b0Var.h || !h2b0.a(g2b0Var)) ? false : true;
                    EnumSet<OneVideoPlayer.State> enumSet6 = h2b0.a;
                    long j10 = 1000;
                    ozb0 p3 = fsk.p(ozb0Var4, z32, false, (int) ((g2b0Var == null ? g2b0Var.g : 0L) / j10), (int) ((g2b0Var == null ? g2b0Var.e : 0L) / j10), 2);
                    l3d0 k5 = s101.k(l3d0Var, (mode2 == mode5 || !h2b0.a(g2b0Var) || gzsVar4 == null) ? false : true, false, 2);
                    w170 q5 = d02.q(w170Var, (mode2 == mode5 || !h2b0.a(g2b0Var) || gzsVar3 == null) ? false : true, false, 2);
                    mbu e5 = his0.e(mbuVar, mode2 != mode5 && h2b0.a(g2b0Var), false, 2);
                    g3e0 h5 = znk0.h(g3e0Var, (!yqjVar.a && (g2b0Var == null || !g2b0Var.h)) || ((mode2 == mode5 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var) && (g2b0Var == null || g2b0Var.g != 0)), false, 2);
                    qso0 k6 = sp.k(qso0Var, (mode2 != mode5 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var) && (g2b0Var == null || g2b0Var.g != 0), false, 2);
                    smz j11 = f370.j(smzVar, (mode2 == mode5 || g2b0Var == null || !g2b0Var.h || !h2b0.a(g2b0Var) || g2b0Var.g == 0) ? false : true, false, 2);
                    ojz g3 = tci.g(ojzVar, (mode2 == mode5 || g2b0Var == null || !g2b0Var.h || !h2b0.a(g2b0Var) || g2b0Var.g == 0) ? false : true, false, 2);
                    sox.a aVar7 = ilkVar.c;
                    int i14 = ilkVar.d;
                    int i15 = ilkVar.e;
                    boolean z33 = mode2 != mode5 && eVar3.a && aVar7 != null && h2b0.a(g2b0Var);
                    boolean z34 = eVar3.b;
                    SimpleControlsView.e.a aVar8 = eVar3.c;
                    ilk a10 = jlk.a(ilkVar, z33, false, aVar7, i14, i15, z34, aVar8.a, aVar8.b, aVar8.c, 2);
                    u3i0 a11 = w3i0.a(u3i0Var, aqj0Var2.a, g2b0Var, fziVar2, u3i0Var.d, null, 32);
                    if (mode2 == Mode.SHOW_FAST_SPEED) {
                        if ((g2b0Var != null ? g2b0Var.a : null) == state9) {
                            z2 = true;
                            bVar = new o10.b(e43.l(a9, e4, i13, q4, j9, p3, k5, q5, e5, h5, k6, j11, g3, a10, a11, kn4.h(cmqVar, z2, false, 2), s1v.d(w6y0Var, mode2 != Mode.SHOW_ZOOM_RATE && h2b0.a(g2b0Var), false, transformController != null ? transformController.c().e.a : 1.0f, 2)));
                        }
                    }
                    z2 = false;
                    bVar = new o10.b(e43.l(a9, e4, i13, q4, j9, p3, k5, q5, e5, h5, k6, j11, g3, a10, a11, kn4.h(cmqVar, z2, false, 2), s1v.d(w6y0Var, mode2 != Mode.SHOW_ZOOM_RATE && h2b0.a(g2b0Var), false, transformController != null ? transformController.c().e.a : 1.0f, 2)));
                }
            }
            z = false;
            zfg0 q42 = dz5.q(zfg0Var, z, false, 2);
            hs8 j92 = n34.j(hs8Var, mode2 != mode5 && h2b0.a(g2b0Var), false, 2);
            ozb0 ozb0Var42 = aqj0Var2.k;
            if (mode == mode5) {
            }
            EnumSet<OneVideoPlayer.State> enumSet62 = h2b0.a;
            long j102 = 1000;
            ozb0 p32 = fsk.p(ozb0Var42, z32, false, (int) ((g2b0Var == null ? g2b0Var.g : 0L) / j102), (int) ((g2b0Var == null ? g2b0Var.e : 0L) / j102), 2);
            l3d0 k52 = s101.k(l3d0Var, (mode2 == mode5 || !h2b0.a(g2b0Var) || gzsVar4 == null) ? false : true, false, 2);
            w170 q52 = d02.q(w170Var, (mode2 == mode5 || !h2b0.a(g2b0Var) || gzsVar3 == null) ? false : true, false, 2);
            mbu e52 = his0.e(mbuVar, mode2 != mode5 && h2b0.a(g2b0Var), false, 2);
            g3e0 h52 = znk0.h(g3e0Var, (!yqjVar.a && (g2b0Var == null || !g2b0Var.h)) || ((mode2 == mode5 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var) && (g2b0Var == null || g2b0Var.g != 0)), false, 2);
            qso0 k62 = sp.k(qso0Var, (mode2 != mode5 || mode2 == Mode.SHOW_SEEK_PREVIEW) && h2b0.a(g2b0Var) && (g2b0Var == null || g2b0Var.g != 0), false, 2);
            smz j112 = f370.j(smzVar, (mode2 == mode5 || g2b0Var == null || !g2b0Var.h || !h2b0.a(g2b0Var) || g2b0Var.g == 0) ? false : true, false, 2);
            ojz g32 = tci.g(ojzVar, (mode2 == mode5 || g2b0Var == null || !g2b0Var.h || !h2b0.a(g2b0Var) || g2b0Var.g == 0) ? false : true, false, 2);
            sox.a aVar72 = ilkVar.c;
            int i142 = ilkVar.d;
            int i152 = ilkVar.e;
            if (mode2 != mode5) {
            }
            boolean z342 = eVar3.b;
            SimpleControlsView.e.a aVar82 = eVar3.c;
            ilk a102 = jlk.a(ilkVar, z33, false, aVar72, i142, i152, z342, aVar82.a, aVar82.b, aVar82.c, 2);
            u3i0 a112 = w3i0.a(u3i0Var, aqj0Var2.a, g2b0Var, fziVar2, u3i0Var.d, null, 32);
            if (mode2 == Mode.SHOW_FAST_SPEED) {
            }
            z2 = false;
            bVar = new o10.b(e43.l(a9, e4, i13, q42, j92, p32, k52, q52, e52, h52, k62, j112, g32, a102, a112, kn4.h(cmqVar, z2, false, 2), s1v.d(w6y0Var, mode2 != Mode.SHOW_ZOOM_RATE && h2b0.a(g2b0Var), false, transformController != null ? transformController.c().e.a : 1.0f, 2)));
        } else {
            if (!(buVar instanceof bu.e)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new o10.b(d4i0.a(aqj0Var2, fziVar2, g2b0Var, (bu.e) buVar));
        }
        jvo0.a.b(b);
        if (bVar instanceof o10.a) {
            this.c = ((o10.a) bVar).a;
            this.b.accept(bVar);
        } else {
            if (!(bVar instanceof o10.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!z15) {
                b(((o10.b) bVar).a);
                return;
            }
            long b2 = k830.b();
            a(((o10.b) bVar).a, new a());
            jvo0.a.b(b2);
        }
    }

    public final void d(long j, boolean z) {
        wzt0 wzt0Var = this.w;
        if (wzt0Var != null) {
            wzt0Var.a();
        }
        this.w = null;
        if (this.c.a == Mode.HIDE || !z) {
            return;
        }
        wzt0 wzt0Var2 = new wzt0(this.a.a, new f10(0, this.x), zno.e(j), true);
        this.w = wzt0Var2.e ? wzt0Var2 : null;
    }

    public final void f(Mode mode, boolean z) {
        SimpleControlsView.h hVar;
        SimpleControlsView.f fVar;
        SimpleControlsView.f fVar2;
        aqj0 aqj0Var = this.c;
        if (aqj0Var.a != mode) {
            this.c = aqj0.a(aqj0Var, mode, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2);
            c(new bu.f.a(z));
            if (mode == Mode.SHOW) {
                SimpleControlsView.h hVar2 = this.f;
                if (hVar2 != null && (fVar2 = SimpleControlsView.this.K) != null) {
                    fVar2.a(new a.j(true));
                }
            } else if (mode == Mode.HIDE && (hVar = this.f) != null && (fVar = SimpleControlsView.this.K) != null) {
                fVar.a(new a.j(false));
            }
            d(this.z.b, false);
        }
    }
}
