package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.search.models.VkRelation;
import com.vk.search.params.api.City;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.search.params.api.domain.model.education.EducationParam;
import com.vkontakte.android.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ath0;
import xsna.c8p;
import xsna.cku;
import xsna.cri;
import xsna.dt1;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;
import xsna.s2x;

/* compiled from: PeopleSearchFiltersBottomSheet.kt */
/* loaded from: classes5.dex */
public final class lv90 extends ath0 {
    public static final /* synthetic */ int v1 = 0;
    public final p2u j1;
    public final bbb0 k1;
    public final wh50<VkPeopleSearchParams> l1;
    public final f1m m1;
    public final f1m n1;
    public final f1m o1;
    public final awf p1;
    public final f1m q1;
    public final f1m r1;
    public final f1m s1;
    public final asp t1;
    public final f1m u1;

    /* compiled from: PeopleSearchFiltersBottomSheet.kt */
    @b6l(c = "com.vk.search.params.impl.presentation.modal.PeopleSearchFiltersBottomSheet$AgeField$2$1", f = "PeopleSearchFiltersBottomSheet.kt", l = {306}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<bwf<Float>> $localAgeRange$delegate;
        int label;
        final /* synthetic */ lv90 this$0;

        /* compiled from: PeopleSearchFiltersBottomSheet.kt */
        /* renamed from: xsna.lv90$a$a, reason: collision with other inner class name */
        public static final class C3303a<T> implements lsr {
            public final /* synthetic */ lv90 b;

            public C3303a(lv90 lv90Var) {
                this.b = lv90Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                bwf bwfVar = (bwf) obj;
                zak0 zak0Var = (zak0) this.b.l1;
                VkPeopleSearchParams copy = ((VkPeopleSearchParams) zak0Var.getValue()).copy();
                int floatValue = (int) ((Number) bwfVar.getStart()).floatValue();
                int floatValue2 = (int) ((Number) bwfVar.c()).floatValue();
                if (floatValue == 14 && floatValue2 == 80) {
                    copy.d = 0;
                    copy.e = 0;
                } else {
                    copy.d = (int) ((Number) bwfVar.getStart()).floatValue();
                    copy.e = (int) ((Number) bwfVar.c()).floatValue();
                }
                zak0Var.setValue(copy);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wh50<bwf<Float>> wh50Var, lv90 lv90Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$localAgeRange$delegate = wh50Var;
            this.this$0 = lv90Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$localAgeRange$delegate, this.this$0, spjVar);
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
                izg0 M = nr2.M(new xwn(3, this.$localAgeRange$delegate));
                C3303a c3303a = new C3303a(this.this$0);
                this.label = 1;
                if (M.collect(c3303a, this) == coroutineSingletons) {
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

    /* compiled from: PeopleSearchFiltersBottomSheet.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ asp a = new asp(VkRelation.values());
    }

    /* compiled from: PeopleSearchFiltersBottomSheet.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((lv90) this.receiver).dismiss();
            return s3q0.a;
        }
    }

    public lv90(Context context, VkPeopleSearchParams vkPeopleSearchParams, p2u p2uVar, tas tasVar, bbb0 bbb0Var) {
        super(tasVar);
        this.j1 = p2uVar;
        this.k1 = bbb0Var;
        this.l1 = androidx.compose.runtime.k.b(vkPeopleSearchParams);
        this.m1 = bbk0.b(new ag20(this, 19));
        this.n1 = bbk0.b(new tju(this, 17));
        this.o1 = bbk0.b(new vv20(this, 11));
        this.p1 = new awf(14.0f, 80.0f);
        this.q1 = bbk0.b(new vex(this, 17));
        this.r1 = bbk0.b(new nly(this, 24));
        this.s1 = bbk0.b(new da50(this, 8));
        this.t1 = b.a;
        this.u1 = bbk0.b(new xq1(9, this, context));
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(840368699);
        int i2 = i | (M.y(this) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(840368699, i2, -1, "com.vk.search.params.impl.presentation.modal.PeopleSearchFiltersBottomSheet.ThemedContent (PeopleSearchFiltersBottomSheet.kt:157)");
            }
            q630 E = ahn.E(n34.t(p490.D(ath0.i1, p490.x(M), 14), dz5.I(0, 1, M, false), null), "search_filters_container");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            String N = d370.N(R.string.vk_discover_search_params_title, 0, M);
            boolean z = !((VkPeopleSearchParams) ((zak0) this.l1).getValue()).I();
            boolean y = M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                c cVar = new c(0, this, lv90.class, "dismiss", "dismiss()V", 0);
                M.R(cVar);
                x = cVar;
            }
            gzs gzsVar = (gzs) ((fcy) x);
            boolean y2 = M.y(this);
            Object x2 = M.x();
            if (y2 || x2 == c0012a) {
                x2 = new f880(this, 2);
                M.R(x2);
            }
            wsh0.c(0, M, N, gzsVar, (gzs) x2, null, z);
            int i3 = 14 & i2;
            fo(i3, M);
            ho(i3, M);
            eo(i3, M);
            go(i3, M);
            ko(i3, M);
            jo(i3, M);
            String N2 = d370.N(R.string.vk_discover_search_show_result, 0, M);
            boolean y3 = M.y(this);
            Object x3 = M.x();
            if (y3 || x3 == c0012a) {
                x3 = new kr50(this, 9);
                M.R(x3);
            }
            wsh0.a(N2, (gzs) x3, M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y6c(this, i, 10);
        }
    }

    public final void eo(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1395276802);
        int i2 = i | (M.y(this) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1395276802, i2, -1, "com.vk.search.params.impl.presentation.modal.PeopleSearchFiltersBottomSheet.AgeField (PeopleSearchFiltersBottomSheet.kt:264)");
            }
            Object x = M.x();
            awf awfVar = this.p1;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                zak0 zak0Var = (zak0) this.l1;
                int i3 = ((VkPeopleSearchParams) zak0Var.getValue()).d;
                int i4 = ((VkPeopleSearchParams) zak0Var.getValue()).e;
                x = androidx.compose.runtime.k.b((i3 == 0 && i4 == 0) ? awfVar : new awf(Math.max(i3, awfVar.b), Math.min(i4, awfVar.c)));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(aVar2, "people_search_filters_age_container");
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            float f = 18;
            float f2 = 12;
            q630 H = s200.H(new xpy(1.0f, true), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            String N = d370.N(R.string.vk_discover_search_age, 0, M);
            bwf bwfVar = (bwf) wh50Var.getValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new iv90(0, wh50Var);
                M.R(x2);
            }
            hkv0.b(bwfVar, (izs) x2, H, N, false, null, awfVar, 65, null, M, 12582960, 816);
            q630 E2 = ahn.E(s200.H(txj0.z(txj0.j(80, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.x(96, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2)), dt1.a.m, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f, 24, 1), "people_search_filters_age_meta_text");
            String str = (String) this.q1.getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().s;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, E2, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.Y, M, 48, 0, 8184);
            M = M;
            M.G();
            s3q0 s3q0Var = s3q0.a;
            boolean y = M.y(this);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new a(wh50Var, this, null);
                M.R(x3);
            }
            bap.g(s3q0Var, (wzs) x3, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new om9(this, i, 10);
        }
    }

    public final void fo(int i, androidx.compose.runtime.a aVar) {
        String str;
        androidx.compose.runtime.a M = aVar.M(-587087478);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-587087478, i2, -1, "com.vk.search.params.impl.presentation.modal.PeopleSearchFiltersBottomSheet.CityField (PeopleSearchFiltersBottomSheet.kt:188)");
            }
            City city = (City) this.m1.getValue();
            if (city == null || (str = city.c) == null) {
                str = "";
            }
            hly a2 = h8s.a.a(d370.N(R.string.vk_discover_search_city, 0, M), false, null, null, null, M, 196608, 30);
            boolean y = M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new re40(this, 6);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            String N = d370.N(R.string.vk_discover_search_choose_a_city, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new j5n(19);
                M.R(x2);
            }
            u2x a3 = g8s.b.a.a(s2x.b.a.a(str, gzsVar, N, j, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 805306368, PsExtractor.VIDEO_STREAM_MASK), null, false, null, M, 24576, 14);
            M = M;
            nvu0.a(a3, null, a2, null, null, M, 0, 26);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.i(this, i, 13);
        }
    }

    public final void go(int i, androidx.compose.runtime.a aVar) {
        String str;
        androidx.compose.runtime.a M = aVar.M(-1969902549);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1969902549, i2, -1, "com.vk.search.params.impl.presentation.modal.PeopleSearchFiltersBottomSheet.EducationField (PeopleSearchFiltersBottomSheet.kt:315)");
            }
            String N = d370.N(R.string.search_params_education_title, 0, M);
            boolean y = M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new gzv(this, 26);
                M.R(x);
            }
            q630 E = ahn.E(ojc.c(q630.a.a, true, N, null, (gzs) x, 12), "people_search_filters_education_container");
            b.c cVar = b.c.a;
            cku ckuVar = null;
            com.vk.core.compose.component.group.header.f a2 = f.a.a(d370.N(R.string.search_params_education_title, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510);
            EducationParam educationParam = (EducationParam) this.r1.getValue();
            if (educationParam == null) {
                M.K(1067054662);
            } else {
                M.K(1067054663);
                StringBuilder sb = new StringBuilder();
                sb.append(educationParam.b.getTitle());
                sb.append(" (");
                sb.append(educationParam.c);
                sb.append(')');
                Integer num = educationParam.d;
                if (num == null || (str = lhg.a(num.intValue(), ", ")) == null) {
                    str = "";
                }
                sb.append(str);
                String sb2 = sb.toString();
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new rvq(17);
                    M.R(x2);
                }
                ckuVar = cku.b.a(sb2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 24576, 6);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(958254720, 384, -1, "com.vk.core.compose.component.group.header.GroupHeader.Middle.Companion.invoke (GroupHeader.kt:1088)");
            }
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new com.vk.core.compose.component.group.header.a(a2, ckuVar);
                M.R(x3);
            }
            com.vk.core.compose.component.group.header.a aVar2 = (com.vk.core.compose.component.group.header.a) x3;
            ((zak0) aVar2.a).setValue(a2);
            ((zak0) aVar2.b).setValue(ckuVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean y2 = M.y(this);
            Object x4 = M.x();
            if (y2 || x4 == c0012a) {
                x4 = new Cnew(this, 21);
                M.R(x4);
            }
            com.vk.core.compose.component.group.header.g.a(aVar2, E, cVar, null, GroupHeader$Right.c.a(null, null, GroupHeader$Right.b.a.C0746a.a(3072, 6, M, null, null, (gzs) x4), null, M, 11), false, M, 384, 104);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.s(this, i, 12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r0 != 2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ho(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1868321120);
        int i2 = 2;
        int i3 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1868321120, i3, -1, "com.vk.search.params.impl.presentation.modal.PeopleSearchFiltersBottomSheet.GenderField (PeopleSearchFiltersBottomSheet.kt:211)");
            }
            q630 D = s200.D(txj0.f(ahn.E(q630.a.a, "people_search_filters_gender_container"), 1.0f), 16);
            int intValue = ((Number) this.n1.getValue()).intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    i2 = 1;
                }
                ejv0.a(D, Integer.valueOf(i2), false, null, kai.c(-231786957, new t67(this, 3), M), M, 24582, 12);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            i2 = 0;
            ejv0.a(D, Integer.valueOf(i2), false, null, kai.c(-231786957, new t67(this, 3), M), M, 24582, 12);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.w(this, i, 15);
        }
    }

    public final void io(y4i0 y4i0Var, String str, boolean z, q630 q630Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-215796483);
        if ((i & 6) == 0) {
            i2 = (M.J(y4i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-215796483, i2, -1, "com.vk.search.params.impl.presentation.modal.PeopleSearchFiltersBottomSheet.GenderSegment (PeopleSearchFiltersBottomSheet.kt:248)");
            }
            y4i0Var.c(z, gzsVar, kai.c(-504762153, new jv90(str, 0), M), q630Var, M, ((i2 >> 6) & 14) | 384 | ((i2 >> 9) & 112) | (i2 & 7168) | ((i2 << 12) & 57344), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kv90(this, y4i0Var, str, z, q630Var, gzsVar, i);
        }
    }

    public final void jo(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(438379351);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(438379351, i2, -1, "com.vk.search.params.impl.presentation.modal.PeopleSearchFiltersBottomSheet.RelationshipField (PeopleSearchFiltersBottomSheet.kt:378)");
            }
            String N = d370.N(R.string.vk_discover_search_relationships, 0, M);
            String str = (String) this.u1.getValue();
            String a2 = VkPeopleSearchParams.i.a((Context) M.r(AndroidCompositionLocals_androidKt.b), ((Boolean) this.o1.getValue()).booleanValue());
            boolean y = M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new eiz(this, 20);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean y2 = M.y(this);
            Object x2 = M.x();
            if (y2 || x2 == c0012a) {
                x2 = new com.vk.movika.tools.controls.seekbar.k(this, 7);
                M.R(x2);
            }
            wsh0.d(N, this.t1, izsVar, (wzs) x2, null, str, a2, false, "people_search_filters_relationship_select", M, 100663296, 144);
            if (a690.d(q630.a.a, 12, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.l(this, i, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ko(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-196245200);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-196245200, i2, -1, "com.vk.search.params.impl.presentation.modal.PeopleSearchFiltersBottomSheet.WorkField (PeopleSearchFiltersBottomSheet.kt:351)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(this.s1.getValue());
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            q630 E = ahn.E(q630.a.a, "people_search_filters_work_input");
            hly a2 = h8s.a.a(d370.N(R.string.search_params_work_title, 0, M), false, null, null, null, M, 196608, 30);
            tho0 tho0Var = (tho0) wh50Var.getValue();
            boolean y = M.y(this);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new zf1(22, this, wh50Var);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            String N = d370.N(R.string.search_params_work_hint, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            u2x a3 = g8s.b.a.a(s2x.a.C3649a.b(tho0Var, izsVar, N, 0L, ylu0Var.getText().p, new rgy(1, 7, 113), null, null, null, null, false, null, M, 12582912, 196608, 32616), null, false, null, M, 24576, 14);
            M = M;
            nvu0.a(a3, E, a2, null, null, M, 48, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.u(this, i, 9);
        }
    }

    public final void lo(int i) {
        zak0 zak0Var = (zak0) this.l1;
        VkPeopleSearchParams copy = ((VkPeopleSearchParams) zak0Var.getValue()).copy();
        copy.c = i;
        zak0Var.setValue(copy);
    }

    public final void mo() {
        c8p.a aVar = new c8p.a(requireContext());
        zak0 zak0Var = (zak0) this.l1;
        aVar.f = ((VkPeopleSearchParams) zak0Var.getValue()).g;
        aVar.g = ((VkPeopleSearchParams) zak0Var.getValue()).b;
        nqh0 nqh0Var = this.h1;
        aVar.h = nqh0Var;
        aVar.e = "search_people_filter_education_param";
        nqh0Var.a(aVar.a());
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            activity = null;
        }
        if (activity == null) {
            return;
        }
        FragmentManager fragmentManager = ((ath0.a) this.k1.c).j;
        fragmentManager.l0("search_people_filter_education_param", activity, new s7(this, 29));
        fragmentManager.l0("search_people_filter_city_param", activity, new c8(this, 27));
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        ((ath0.a) this.k1.c).j.e("search_people_filter_education_param");
    }
}
