package xsna;

import android.animation.ValueAnimator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuFragmentBase;
import com.vk.voip.ui.menu.ui.MainMenuView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e820;
import xsna.ef00;
import xsna.ghw0;

/* compiled from: MenuRenderer.kt */
/* loaded from: classes7.dex */
public final class e820 {
    public final MainMenuView a;
    public final ihw0 b;
    public final b5u0 c;
    public final d820 d = new androidx.lifecycle.l() { // from class: xsna.d820
        @Override // androidx.lifecycle.l
        public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
            e820 e820Var = e820.this;
            ihw0 ihw0Var = e820Var.b;
            int i = e820.f.$EnumSwitchMapping$0[event.ordinal()];
            if (i == 1) {
                ihw0Var.a(ghw0.e.a);
                return;
            }
            if (i == 2) {
                ihw0Var.a(ghw0.g.a);
            } else {
                if (i != 3) {
                    return;
                }
                f5zVar.getLifecycle().removeObserver(e820Var.d);
                ihw0Var.a(new ghw0.f((Fragment) f5zVar));
            }
        }
    };

    /* compiled from: MenuRenderer.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            b5u0 b5u0Var = ((e820) this.receiver).c;
            com.vk.voip.ui.c.b.getClass();
            if (com.vk.voip.ui.c.W0 || com.vk.voip.ui.c.u0() || !((Boolean) b5u0Var.c.invoke()).booleanValue()) {
                if (booleanValue) {
                    b5u0Var.b(1.0f);
                } else {
                    b5u0Var.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                bwt0.p0(b5u0Var.b, booleanValue);
            } else {
                int i = 2;
                if (booleanValue) {
                    hx3 hx3Var = new hx3(1, b5u0Var, b5u0.class, "animateWithDelegate", "animateWithDelegate(F)V", 0, 8);
                    ValueAnimator valueAnimator = b5u0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    b5u0Var.d = null;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    xo2.h(ofFloat, new icn0(b5u0Var, 16));
                    xo2.i(ofFloat, new qjo0(b5u0Var, 12));
                    ofFloat.setDuration(250L);
                    ofFloat.addUpdateListener(new hm7(hx3Var, 4));
                    ofFloat.start();
                    b5u0Var.d = ofFloat;
                } else {
                    hoh hohVar = new hoh(1, b5u0Var, b5u0.class, "animateWithDelegate", "animateWithDelegate(F)V", 0, 11);
                    ValueAnimator valueAnimator2 = b5u0Var.d;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    b5u0Var.d = null;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    xo2.h(ofFloat2, new mwm0(b5u0Var, 17));
                    ofFloat2.setDuration(250L);
                    ofFloat2.addUpdateListener(new lkj0(hohVar, i));
                    ofFloat2.start();
                    b5u0Var.d = ofFloat2;
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: MenuRenderer.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            ((e820) this.receiver).a.setMenuEnabled(bool.booleanValue());
            return s3q0.a;
        }
    }

    /* compiled from: MenuRenderer.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<ef00.b, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ef00.b bVar) {
            ef00.b bVar2 = bVar;
            e820 e820Var = (e820) this.receiver;
            d820 d820Var = e820Var.d;
            ihw0 ihw0Var = e820Var.b;
            MainMenuView mainMenuView = e820Var.a;
            if (bVar2 instanceof ef00.b.C2804b) {
                if (e820Var.a() != null) {
                    com.vk.voip.ui.menu.ui.b bVar3 = mainMenuView.g;
                    bVar3.b.X(4);
                    bVar3.a.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            } else if (bVar2 instanceof ef00.b.e) {
                ihw0Var.a(new ghw0.a(((ef00.b.e) bVar2).a.invoke()));
            } else {
                boolean z = bVar2 instanceof ef00.b.d;
                ghw0.i iVar = ghw0.i.a;
                if (z) {
                    Fragment fragment = ((ef00.b.d) bVar2).a;
                    FragmentManager a = e820Var.a();
                    if (a != null) {
                        fragment.getLifecycle().addObserver(d820Var);
                        Fragment H = a.H("pull-up-menu-inner");
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(a);
                        if (H != null) {
                            aVar.q(H);
                        }
                        aVar.f(R.id.voip_extended_options_content_box, fragment, "pull-up-menu-inner", 1);
                        aVar.r(fragment, Lifecycle.State.CREATED);
                        try {
                            aVar.l();
                        } catch (Throwable unused) {
                            ihw0Var.a(iVar);
                        }
                    }
                } else if (!(bVar2 instanceof ef00.b.c)) {
                    if (bVar2 instanceof ef00.b.h) {
                        Fragment fragment2 = ((ef00.b.h) bVar2).a;
                        FragmentManager a2 = e820Var.a();
                        if (a2 != null) {
                            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(a2);
                            aVar2.r(fragment2, Lifecycle.State.RESUMED);
                            try {
                                aVar2.l();
                            } catch (Throwable unused2) {
                                ihw0Var.a(iVar);
                            }
                        }
                    } else if (bVar2 instanceof ef00.b.g) {
                        ef00.b.g gVar = (ef00.b.g) bVar2;
                        if (gVar.b) {
                            mainMenuView.g.b.X(3);
                        } else if (gVar.c) {
                            com.vk.voip.ui.menu.ui.b bVar4 = mainMenuView.g;
                            bVar4.b.X(4);
                            bVar4.a.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        mainMenuView.setShowingRoot(gVar.d);
                    } else if (bVar2 instanceof ef00.b.a) {
                        Fragment fragment3 = ((ef00.b.a) bVar2).a;
                        FragmentManager a3 = e820Var.a();
                        if (a3 != null) {
                            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(a3);
                            aVar3.q(fragment3);
                            try {
                                aVar3.l();
                            } catch (Throwable unused3) {
                                ihw0Var.a(iVar);
                            }
                        }
                    } else {
                        if (!(bVar2 instanceof ef00.b.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ef00.b.f fVar = (ef00.b.f) bVar2;
                        VoipMainMenuFragmentBase voipMainMenuFragmentBase = fVar.a;
                        voipMainMenuFragmentBase.getLifecycle().addObserver(d820Var);
                        Pair pair = fVar.b ? new Pair(Integer.valueOf(R.anim.fr_anim_slide_in_left), Integer.valueOf(R.anim.fr_anim_slide_out_right)) : new Pair(Integer.valueOf(R.anim.fr_anim_slide_in_right), Integer.valueOf(R.anim.fr_anim_slide_out_left));
                        int intValue = ((Number) pair.d()).intValue();
                        int intValue2 = ((Number) pair.g()).intValue();
                        FragmentManager a4 = e820Var.a();
                        if (a4 != null) {
                            androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(a4);
                            aVar4.i(intValue, intValue2, 0, 0);
                            aVar4.g(R.id.voip_extended_options_content_box, voipMainMenuFragmentBase, "pull-up-menu-inner");
                            try {
                                aVar4.l();
                            } catch (Throwable unused4) {
                                ihw0Var.a(iVar);
                            }
                        }
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: MenuRenderer.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Pair<? extends ef00.b, ? extends MainMenuView.b>, s3q0> {
        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            if (r5 > 1.0f) goto L9;
         */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final s3q0 invoke(Pair<? extends ef00.b, ? extends MainMenuView.b> pair) {
            Pair<? extends ef00.b, ? extends MainMenuView.b> pair2 = pair;
            e820 e820Var = (e820) this.receiver;
            ihw0 ihw0Var = e820Var.b;
            ef00.b d = pair2.d();
            MainMenuView.b g = pair2.g();
            if (g instanceof MainMenuView.b.d) {
                MainMenuView.b.d dVar = (MainMenuView.b.d) g;
                if (d instanceof ef00.b.g) {
                    MainMenuView mainMenuView = e820Var.a;
                    float f = dVar.a;
                    float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f2 = 1.0f;
                    }
                    f = f2;
                    mainMenuView.setExpandedFraction(f);
                }
            } else if (g instanceof MainMenuView.b.C2065b) {
                ihw0Var.a(ghw0.k.a.a);
            } else if (g instanceof MainMenuView.b.c) {
                ihw0Var.a(ghw0.j.a);
            } else if (g instanceof MainMenuView.b.a) {
                ihw0Var.a(ghw0.d.a);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MenuRenderer.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<ef00.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ef00.a aVar) {
            ef00.a aVar2 = aVar;
            MainMenuView mainMenuView = ((e820) this.receiver).a;
            if (aVar2 instanceof ef00.a.b) {
                mainMenuView.setExpandedState$ui_release(MainMenuView.ExpandedState.EXPANDED);
            } else if (aVar2 instanceof ef00.a.C2803a) {
                mainMenuView.setExpandedState$ui_release(MainMenuView.ExpandedState.COLLAPSED);
            } else {
                mainMenuView.setExpandedState$ui_release(MainMenuView.ExpandedState.INTERMEDIATE);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MenuRenderer.kt */
    public static final /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.d820] */
    public e820(MainMenuView mainMenuView, ihw0 ihw0Var, b5u0 b5u0Var, kny knyVar) {
        this.a = mainMenuView;
        this.b = ihw0Var;
        this.c = b5u0Var;
        io.reactivex.rxjava3.internal.operators.observable.t2 w0 = mainMenuView.h.w0(100L, TimeUnit.MILLISECONDS);
        io.reactivex.rxjava3.internal.operators.observable.j1 j1Var = knyVar.a;
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = j1Var.a0(asu0Var.d());
        io.reactivex.rxjava3.internal.operators.observable.j1 U = a0.U(new do3(new com.vk.movika.sdk.base.observable.e0(27), 23));
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.y(U, qVar, aVar).subscribe(new j41(new a(1, this, e820.class, "applyVisibleStateChange", "applyVisibleStateChange(Z)V", 0), 22));
        io.reactivex.rxjava3.disposables.b bVar = ihw0Var.f;
        bVar.b(subscribe);
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(a0.U(new yh1(new bws(1), 26)), qVar, aVar).subscribe(new d120(new b(1, this, e820.class, "applyEnabledStateChange", "applyEnabledStateChange(Z)V", 0), 1)));
        io.reactivex.rxjava3.internal.operators.observable.j1 U2 = a0.U(new zq(19, new rd1(28)));
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(U2, qVar, aVar).subscribe(new amt(new c(1, this, e820.class, "render", "render(Lcom/vk/voip/ui/menu/ui/renderers/MainMenuViewState$ContentState;)V", 0), 7)));
        bVar.b(io.reactivex.rxjava3.core.q.m(U2, w0, new b9(new tg4((byte) 0, 4), 22)).a0(asu0Var.d()).subscribe(new bf2(new d(1, this, e820.class, "handleEventAtState", "handleEventAtState(Lkotlin/Pair;)V", 0), 26)));
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(j1Var.a0(asu0Var.d()).U(new dr(new vd1(24), 22)), qVar, aVar).subscribe(new k5(new e(1, this, e820.class, "renderBottomSheetState", "renderBottomSheetState(Lcom/vk/voip/ui/menu/ui/renderers/MainMenuViewState$BottomSheetState;)V", 0), 27)));
    }

    public final FragmentManager a() {
        return this.b.a.b;
    }
}
