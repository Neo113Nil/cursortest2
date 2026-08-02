package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.chs;
import xsna.q630;
import xsna.wkj;

/* compiled from: MusicTrackCell.kt */
/* loaded from: classes4.dex */
public final class wb50 implements Cell$Left.Main {
    public final wax a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final kg50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;

    /* compiled from: MusicTrackCell.kt */
    @b6l(c = "com.vk.newsfeed.posting.music_picker.presentation.view.MusicTrackImage$Content$1$1", f = "MusicTrackCell.kt", l = {276}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: MusicTrackCell.kt */
        /* renamed from: xsna.wb50$a$a, reason: collision with other inner class name */
        public static final class C3925a<T> implements lsr {
            public final /* synthetic */ wb50 b;

            public C3925a(wb50 wb50Var) {
                this.b = wb50Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                vax vaxVar = (vax) obj;
                if (vaxVar instanceof llk) {
                    llk llkVar = (llk) vaxVar;
                    MusicTrack musicTrack = llkVar.a;
                    MusicPickerListItem.MusicTrackItem.PlayingState playingState = llkVar.b;
                    String Ib = musicTrack != null ? musicTrack.Ib() : null;
                    wb50 wb50Var = this.b;
                    wh50 wh50Var = wb50Var.b;
                    wh50 wh50Var2 = wb50Var.i;
                    wh50 wh50Var3 = wb50Var.h;
                    if (epx.f(Ib, (String) ((zak0) wh50Var).getValue())) {
                        ((zak0) wh50Var3).setValue(Boolean.valueOf(playingState == MusicPickerListItem.MusicTrackItem.PlayingState.Playing));
                        ((zak0) wh50Var2).setValue(Boolean.valueOf(playingState != MusicPickerListItem.MusicTrackItem.PlayingState.None));
                    } else {
                        Boolean bool = Boolean.FALSE;
                        ((zak0) wh50Var3).setValue(bool);
                        ((zak0) wh50Var2).setValue(bool);
                    }
                }
                return s3q0.a;
            }
        }

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return wb50.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                caj0 b = wb50.this.a.b();
                C3925a c3925a = new C3925a(wb50.this);
                this.label = 1;
                b.getClass();
                if (caj0.k(b, c3925a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public wb50() {
        throw null;
    }

    public wb50(Object obj, float f, float f2, String str, boolean z, boolean z2, wax waxVar, com.vk.core.compose.component.semantics.a aVar, gzs gzsVar) {
        this.a = waxVar;
        this.b = androidx.compose.runtime.k.b(str);
        this.c = androidx.compose.runtime.k.b(new qow(obj));
        this.d = cq.f(f);
        this.e = androidx.compose.runtime.k.b(gzsVar);
        this.f = androidx.compose.runtime.d.a(f2);
        this.g = androidx.compose.runtime.k.b(aVar);
        this.h = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.i = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Left
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(722958431);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(722958431, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicTrackImage.Content (MusicTrackCell.kt:273)");
            }
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new a(null);
                M.R(x);
            }
            bap.g(this.a, (wzs) x, M, 0);
            q630 d = rte0.d(sua.d(1.0f, txj0.q(q630Var, 48), false), vog0.b(c()));
            boolean z2 = i3 == 256;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new s1x(this, 14);
                M.R(x2);
            }
            ua8.a(com.vk.core.compose.component.semantics.b.b(ojc.c(d, false, null, null, (gzs) x2, 15), (SemanticsConfiguration) ((zak0) this.g).getValue()), null, false, kai.c(1312741321, new slh(this, 2), M), M, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y85(this, spg0Var, q630Var, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(va8 va8Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(1263210594);
        if ((i & 6) == 0) {
            i2 = (M.J(va8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1263210594, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicTrackImage.MusicCover (MusicTrackCell.kt:315)");
            }
            T t = ((qow) ((zak0) this.c).getValue()).a;
            float j = va8Var.j();
            v5b0 v5b0Var = qa50.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(157243931, 0, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.getForSizeOrEmpty (MusicTrackCell.kt:440)");
            }
            String b = qa50.b((Thumb) t, j, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int length = b.length();
            q630.a aVar3 = q630.a.a;
            if (length == 0) {
                M.K(-196464035);
                q630 m = hr80.m(txj0.q(aVar3, 48), wlb0.h(M).getBackground().x, vog0.b(c()));
                y18 a2 = aqw.a(0.5f, wlb0.h(M).getImage().a);
                q630 b2 = r18.b(a2.a, a2.b, m, vog0.b(c()));
                qzu0.a.getClass();
                lg90 r1 = qzu0.r1(M);
                long j2 = wlb0.h(M).getIcon().l;
                if (Build.VERSION.SDK_INT >= 29) {
                    se7.b();
                    porterDuffColorFilter = re7.b(f870.H(j2), z42.a(5));
                } else {
                    porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j2), z42.b(5));
                }
                aVar2 = M;
                vjw.a(r1, null, b2, null, wkj.a.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j2, 5, porterDuffColorFilter), aVar2, 24632, 40);
                aVar2.j();
            } else {
                M.K(-195568352);
                fwu0.c(o19.a(txj0.d(aVar3, 1.0f), ((vak0) this.f).getFloatValue()), null, b, null, null, null, null, kai.c(1286459533, new a0t() { // from class: xsna.vb50
                    @Override // xsna.a0t
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i3;
                        ColorFilter porterDuffColorFilter2;
                        chs chsVar = (chs) obj2;
                        lg90 lg90Var = (lg90) obj3;
                        androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        if ((intValue & 48) == 0) {
                            i3 = (aVar4.J(chsVar) ? 32 : 16) | intValue;
                        } else {
                            i3 = intValue;
                        }
                        if ((intValue & 384) == 0) {
                            i3 |= (intValue & 512) == 0 ? aVar4.J(lg90Var) : aVar4.y(lg90Var) ? 256 : 128;
                        }
                        if (aVar4.t(i3 & 1, (i3 & 1169) != 1168)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1286459533, i3, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicTrackImage.MusicCover.<anonymous> (MusicTrackCell.kt:344)");
                            }
                            boolean z = chsVar instanceof chs.b;
                            q630.a aVar5 = q630.a.a;
                            wb50 wb50Var = wb50.this;
                            if (z || (chsVar instanceof chs.a)) {
                                aVar4.K(922948080);
                                q630 m2 = hr80.m(txj0.d(aVar5, 1.0f), wlb0.h(aVar4).getBackground().x, vog0.b(wb50Var.c()));
                                y18 a3 = aqw.a(0.5f, wlb0.h(aVar4).getImage().a);
                                q630 b3 = r18.b(a3.a, a3.b, m2, vog0.b(wb50Var.c()));
                                qzu0.a.getClass();
                                lg90 r12 = qzu0.r1(aVar4);
                                long j3 = wlb0.h(aVar4).getIcon().l;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    se7.b();
                                    porterDuffColorFilter2 = re7.b(f870.H(j3), z42.a(5));
                                } else {
                                    porterDuffColorFilter2 = new PorterDuffColorFilter(f870.H(j3), z42.b(5));
                                }
                                vjw.a(r12, null, b3, null, wkj.a.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j3, 5, porterDuffColorFilter2), aVar4, 24632, 40);
                                aVar4.j();
                            } else if (chsVar instanceof chs.c) {
                                aVar4.K(-662929849);
                                q630 d = txj0.d(aVar5, 1.0f);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                iyk0 iyk0Var = rrv0.a;
                                ylu0 ylu0Var = (ylu0) aVar4.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                q630 m3 = hr80.m(d, ylu0Var.getBackground().x, vog0.b(wb50Var.c()));
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var2 = (ylu0) aVar4.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                y18 a4 = aqw.a(0.5f, ylu0Var2.getImage().a);
                                ja8.a(r18.b(a4.a, a4.b, m3, vog0.b(wb50Var.c())), aVar4, 0);
                                aVar4.j();
                            } else {
                                aVar4.K(924731262);
                                q630 d2 = txj0.d(aVar5, 1.0f);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var3 = (ylu0) aVar4.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                y18 a5 = aqw.a(0.5f, ylu0Var3.getImage().a);
                                vjw.a(lg90Var, null, rte0.d(r18.b(a5.a, a5.b, d2, vog0.b(wb50Var.c())), vog0.b(wb50Var.c())), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar4, 56 | ((i3 >> 6) & 14), 120);
                                aVar4.j();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar4.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, 100663296, 250);
                aVar2 = M;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new h9g(this, va8Var, i, 4);
        }
    }

    public final float c() {
        return ((pco) ((zak0) this.d).getValue()).b;
    }
}
