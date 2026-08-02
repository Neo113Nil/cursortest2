package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.fragments.FragmentImpl;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o;
import com.vk.mediapicker.impl.presentation.mvi.f;
import com.vk.music.ui.subscription.BuyMusicSubscriptionComposeButtonKt;
import com.vk.music.ui.subscription.SubscriptionContext;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.cri;
import xsna.dt1;
import xsna.h1m;
import xsna.ind0;
import xsna.lsr;
import xsna.mt10;
import xsna.pt10;
import xsna.q630;
import xsna.s3q0;
import xsna.spj;
import xsna.uld0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fz7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fz7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        frv0 frv0Var;
        long d;
        frv0 frv0Var2;
        switch (this.b) {
            case 0:
                o.a aVar = (o.a) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1841017423, intValue, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingMenuContent.<anonymous>.<anonymous>.<anonymous> (BookingStartScreen.kt:243)");
                    }
                    vz7.a(0, aVar2, aVar.k, izsVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                SubscriptionContext subscriptionContext = (SubscriptionContext) this.c;
                qr8 qr8Var = (qr8) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-6402503, intValue2, -1, "com.vk.music.ui.subscription.BuyMusicSubscriptionComposeButton.<anonymous> (BuyMusicSubscriptionComposeButton.kt:107)");
                    }
                    q630 f = txj0.f(q630.a.a, 1.0f);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar3, 48);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, f);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar4);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, a, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    boolean booleanValue = qr8Var.d.getValue().booleanValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1823351037, 0, -1, "com.vk.music.ui.subscription.resolveTitleStyle (BuyMusicSubscriptionComposeButton.kt:139)");
                    }
                    int[] iArr = BuyMusicSubscriptionComposeButtonKt.c.$EnumSwitchMapping$0;
                    int i = iArr[subscriptionContext.ordinal()];
                    if (i == 1) {
                        aVar3.K(-106303864);
                        aVar3.j();
                        j = l5g.k;
                    } else {
                        if (i != 2) {
                            throw alb0.c(-106305703, aVar3);
                        }
                        aVar3.K(-106301617);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getText().e;
                        aVar3.j();
                    }
                    int i2 = iArr[subscriptionContext.ordinal()];
                    if (i2 == 1) {
                        aVar3.K(999719223);
                        if (booleanValue) {
                            aVar3.K(999744550);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            frv0Var = wuv0Var.H;
                            aVar3.j();
                        } else {
                            aVar3.K(999813091);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var2 = (wuv0) aVar3.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            frv0Var = wuv0Var2.M;
                            aVar3.j();
                        }
                        aVar3.j();
                    } else {
                        if (i2 != 2) {
                            throw alb0.c(-106299879, aVar3);
                        }
                        aVar3.K(-106291515);
                        if (booleanValue) {
                            aVar3.K(999942795);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var3 = (wuv0) aVar3.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            frv0Var = wuv0Var3.M;
                            aVar3.j();
                        } else {
                            aVar3.K(1000006252);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var4 = (wuv0) aVar3.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            frv0Var = wuv0Var4.p1;
                            aVar3.j();
                        }
                        aVar3.j();
                    }
                    Pair pair = new Pair(new l5g(j), frv0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(qr8Var.a.getValue(), null, ((l5g) pair.d()).a, null, null, 0, 3, null, 0, false, 0, 0, null, (frv0) pair.g(), aVar3, 0, 0, 8122);
                    androidx.compose.runtime.a aVar5 = aVar3;
                    if (qr8Var.c.getValue().booleanValue()) {
                        aVar5.K(-1223628752);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(586561189, 0, -1, "com.vk.music.ui.subscription.resolveSubtitleStyle (BuyMusicSubscriptionComposeButton.kt:165)");
                        }
                        int i3 = iArr[subscriptionContext.ordinal()];
                        if (i3 == 1) {
                            aVar5.K(1044592470);
                            aVar5.j();
                            d = f870.d(2566914048L);
                        } else {
                            if (i3 != 2) {
                                throw alb0.c(1044590817, aVar5);
                            }
                            aVar5.K(1044594903);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) aVar5.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            d = ylu0Var2.getText().e;
                            aVar5.j();
                        }
                        int i4 = iArr[subscriptionContext.ordinal()];
                        if (i4 == 1) {
                            aVar5.K(1044598637);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var5 = (wuv0) aVar5.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            frv0Var2 = wuv0Var5.i0;
                            aVar5.j();
                        } else {
                            if (i4 != 2) {
                                throw alb0.c(1044596389, aVar5);
                            }
                            aVar5.K(1044600754);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var6 = (wuv0) aVar5.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            frv0Var2 = wuv0Var6.e0;
                            aVar5.j();
                        }
                        Pair pair2 = new Pair(new l5g(d), frv0Var2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        yqv0.c(qr8Var.b.getValue(), null, ((l5g) pair2.d()).a, null, null, 0, 3, null, 0, false, 0, 0, null, (frv0) pair2.g(), aVar5, 0, 0, 8122);
                        aVar5 = aVar5;
                    } else {
                        aVar5.K(-1228913601);
                    }
                    aVar5.j();
                    aVar5.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 2:
                FragmentImpl fragmentImpl = (FragmentImpl) this.c;
                final pt10 pt10Var = (pt10) this.d;
                hvj hvjVar = (hvj) obj;
                bn50 bn50Var = (bn50) obj2;
                final mt10.a aVar6 = (mt10.a) obj3;
                hvj.a(hvjVar, tci.k(bn50Var), g5z.a(fragmentImpl).c, new iyp() { // from class: xsna.ot10
                    @Override // xsna.iyp
                    public final void a(pk50 pk50Var) {
                        com.vk.mediapicker.impl.presentation.mvi.f fVar = (com.vk.mediapicker.impl.presentation.mvi.f) pk50Var;
                        boolean z = fVar instanceof f.c;
                        mt10.a aVar7 = mt10.a.this;
                        if (z) {
                            aVar7.Ag(((f.c) fVar).a);
                            return;
                        }
                        if (fVar instanceof f.d) {
                            aVar7.U6(((f.d) fVar).a);
                            return;
                        }
                        if (fVar instanceof f.h) {
                            int i5 = pt10.a.$EnumSwitchMapping$0[((f.h) fVar).a.ordinal()];
                            aVar7.tl(i5 != 1 ? i5 != 2 ? R.string.picker_selection_limit_text : R.string.picker_selection_limit_video_text : R.string.picker_selection_limit_photo_text);
                            return;
                        }
                        if (fVar instanceof f.e) {
                            aVar7.Kc(((f.e) fVar).a);
                            return;
                        }
                        if (fVar.equals(f.b.a)) {
                            aVar7.getClass();
                            return;
                        }
                        boolean equals = fVar.equals(f.C1267f.a);
                        pt10 pt10Var2 = pt10Var;
                        if (equals) {
                            s8g0 s8g0Var = pt10Var2.d;
                            (s8g0Var != null ? s8g0Var : null).c(true);
                            return;
                        }
                        if (!fVar.equals(f.a.a)) {
                            if (!fVar.equals(f.g.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FrameLayout frameLayout = pt10Var2.e;
                            aVar7.K3(frameLayout != null ? frameLayout : null);
                            return;
                        }
                        s8g0 s8g0Var2 = pt10Var2.d;
                        s8g0 s8g0Var3 = s8g0Var2 != null ? s8g0Var2 : null;
                        s8g0Var3.getClass();
                        if (gz80.a(34)) {
                            PermissionHelper permissionHelper = PermissionHelper.a;
                            Context b = s8g0Var3.b.b();
                            yx90 yx90Var = s8g0Var3.e;
                            PermissionHelper.g(permissionHelper, b, yx90Var.c, yx90Var.d, 0, 0, s8g0Var3.f, null, null, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
                        }
                    }
                });
                hvj.b(hvjVar, tci.l(bn50Var), ie00.a, new hel(pt10Var, aVar6));
                return s3q0.a;
            default:
                uld0 uld0Var = (uld0) this.c;
                hnd0 hnd0Var = (hnd0) this.d;
                hvj hvjVar2 = (hvj) obj;
                omd0 omd0Var = (omd0) obj2;
                nb9 k = tci.k(omd0Var);
                f5z f5zVar = uld0Var.b;
                hvj.a(hvjVar2, k, g5z.a(f5zVar).c, new uld0.a(uld0Var.c));
                final h1m l = tci.l(omd0Var);
                hvj.b(hvjVar2, new ksr<ind0>() { // from class: com.vk.ecomm.market.good.good2.presentation.ProductCardMviComponent$render$lambda$3$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    /* renamed from: com.vk.ecomm.market.good.good2.presentation.ProductCardMviComponent$render$lambda$3$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements lsr {
                        public final /* synthetic */ lsr b;

                        @b6l(c = "com.vk.ecomm.market.good.good2.presentation.ProductCardMviComponent$render$lambda$3$$inlined$map$1$2", f = "ProductCardMviComponent.kt", l = {50}, m = "emit")
                        /* renamed from: com.vk.ecomm.market.good.good2.presentation.ProductCardMviComponent$render$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(spj spjVar) {
                                super(spjVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(lsr lsrVar) {
                            this.b = lsrVar;
                        }

                        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                            java.lang.NullPointerException
                            */
                        @Override // xsna.lsr
                        public final java.lang.Object emit(
                        /*  JADX ERROR: Method generation error
                            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r51v0 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
                            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            */
                        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                            java.lang.NullPointerException
                            */
                    }

                    @Override // xsna.ksr
                    public final Object collect(lsr<? super ind0> lsrVar, spj spjVar) {
                        Object collect = h1m.this.collect(new AnonymousClass2(lsrVar), spjVar);
                        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                    }
                }, g5z.a(f5zVar).c, new tld0((nkd0) obj3, hnd0Var));
                return s3q0.a;
        }
    }
}
