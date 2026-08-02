package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cri;
import xsna.dt1;
import xsna.k840;
import xsna.q630;

/* compiled from: SelectedSnippetsSettingsModalBottomSheet.kt */
/* loaded from: classes4.dex */
public final class dbi0 extends jmu0 {
    public static final /* synthetic */ int r1 = 0;
    public final wh50 h1 = androidx.compose.runtime.k.b(EmptyList.b);
    public final wh50 i1 = androidx.compose.runtime.k.b(new fo20(20));
    public final wh50 j1 = androidx.compose.runtime.k.b(new oey(26));
    public final wh50 k1 = androidx.compose.runtime.k.b(new k220(23));
    public final wh50 l1 = androidx.compose.runtime.k.b(Boolean.TRUE);
    public final wh50 m1 = androidx.compose.runtime.k.b(null);
    public final wh50 n1 = androidx.compose.runtime.k.b(MusicPickerListItem.MusicTrackItem.PlayingState.None);
    public final wh50 o1 = androidx.compose.runtime.k.b(k840.a.g().a());
    public final wh50 p1 = androidx.compose.runtime.k.b(new io.reactivex.rxjava3.disposables.b());
    public final d q1 = new d();

    /* compiled from: SelectedSnippetsSettingsModalBottomSheet.kt */
    public static final class a extends kmu0 {
        public final List<MusicDto> h;
        public final boolean i;
        public final f410 j;
        public final hb40 k;
        public final nl30 l;

        public a(Context context, List list, boolean z, f410 f410Var, hb40 hb40Var, nl30 nl30Var, t210 t210Var) {
            super(context, tzp0.a(null, 3));
            this.h = list;
            this.i = z;
            this.j = f410Var;
            this.k = hb40Var;
            this.l = nl30Var;
            F0(true);
            J();
            n0(0);
            o0(0);
            p0(0);
            m0(0);
            N0();
            a0(t210Var);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            dbi0 dbi0Var = new dbi0();
            List<MusicDto> list = this.h;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(MusicDto.a((MusicDto) it.next(), false, null, null, 15359));
            }
            ((zak0) dbi0Var.h1).setValue(arrayList);
            ((zak0) dbi0Var.i1).setValue(this.j);
            ((zak0) dbi0Var.l1).setValue(Boolean.valueOf(this.i));
            ((zak0) dbi0Var.j1).setValue(this.k);
            ((zak0) dbi0Var.k1).setValue(this.l);
            return dbi0Var;
        }
    }

    /* compiled from: SelectedSnippetsSettingsModalBottomSheet.kt */
    @b6l(c = "com.vk.newsfeed.posting.music_picker.presentation.SelectedSnippetsSettingsModalBottomSheet$ThemedContent$1$1", f = "SelectedSnippetsSettingsModalBottomSheet.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<List<MusicDto>> $selectedSnippets$delegate;
        int label;

        /* compiled from: SelectedSnippetsSettingsModalBottomSheet.kt */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(Throwable th) {
                j03.l(th);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wh50<List<MusicDto>> wh50Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$selectedSnippets$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return dbi0.this.new b(this.$selectedSnippets$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            tp4 tp4Var = new tp4(new pn0(3));
            dbi0 dbi0Var = dbi0.this;
            int i = dbi0.r1;
            ((io.reactivex.rxjava3.disposables.b) ((zak0) dbi0.this.p1).getValue()).b(new io.reactivex.rxjava3.internal.operators.observable.o0(io.reactivex.rxjava3.core.q.O((List) ((zak0) dbi0Var.h1).getValue()), new n7(new m7(tp4Var, 5), 3)).E0().m(asu0.a.d()).subscribe(new fv70(new au6(1, this.$selectedSnippets$delegate), 12), new l8w(new a(1, j03.a, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0), 20)));
            return s3q0.a;
        }
    }

    /* compiled from: SelectedSnippetsSettingsModalBottomSheet.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((dbi0) this.receiver).dismiss();
            return s3q0.a;
        }
    }

    /* compiled from: SelectedSnippetsSettingsModalBottomSheet.kt */
    public static final class d extends e.a {

        /* compiled from: SelectedSnippetsSettingsModalBottomSheet.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PlayState.values().length];
                try {
                    iArr[PlayState.PLAYING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PlayState.PAUSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public d() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            MusicTrack f = fVar != null ? fVar.f() : null;
            dbi0 dbi0Var = dbi0.this;
            ((zak0) dbi0Var.m1).setValue(f);
            int i = playState == null ? -1 : a.$EnumSwitchMapping$0[playState.ordinal()];
            ((zak0) dbi0Var.n1).setValue(i != 1 ? i != 2 ? MusicPickerListItem.MusicTrackItem.PlayingState.None : MusicPickerListItem.MusicTrackItem.PlayingState.Paused : MusicPickerListItem.MusicTrackItem.PlayingState.Playing);
        }
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(-459993571);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-459993571, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.SelectedSnippetsSettingsModalBottomSheet.ThemedContent (SelectedSnippetsSettingsModalBottomSheet.kt:103)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            boolean z = ((List) wh50Var.getValue()) != null;
            s3q0 s3q0Var = s3q0.a;
            boolean y = M.y(this);
            Object x2 = M.x();
            if (y || x2 == c0012a2) {
                x2 = new b(wh50Var, null);
                M.R(x2);
            }
            bap.g(s3q0Var, (wzs) x2, M, 6);
            float f = 12;
            uog0 d2 = vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            q630.a aVar2 = q630.a.a;
            q630 d3 = rte0.d(aVar2, d2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d3, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, m);
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
            String N = d370.N(R.string.music_picker_selected_snippet_screen_close, 0, M);
            boolean y2 = M.y(this);
            Object x3 = M.x();
            if (y2 || x3 == c0012a2) {
                x3 = new jaa0(this, 11);
                M.R(x3);
            }
            boolean z2 = z;
            TopBar$Before.d a3 = TopBar$Before.d.a.a(N, (gzs) x3, null, null, M, 24576, 12);
            TopBar$Middle.Text a4 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.music_picker_selected_snippet_screen_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            q630 t = n34.t(aVar2, dz5.I(6, 0, M, true), null);
            Object x4 = M.x();
            if (x4 == c0012a2) {
                x4 = new z410(21);
                M.R(x4);
            }
            muv0.h(a4, ahn.E(ahh0.b(t, m4s.C((izs) x4, M, 6), Orientation.Vertical), "MusicSnippetEditorBottomSheetToolbar"), null, null, null, a3, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8156);
            com.vk.core.compose.component.cell.content.k0 a5 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.music_picker_selected_snippet_screen_info_title, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b(d370.N(R.string.music_picker_selected_snippet_screen_info_subtitle, 0, M), 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, M, 196608, 28);
            boolean z3 = z2 && fo();
            boolean l = M.l(z2) | M.y(this) | M.y(context);
            Object x5 = M.x();
            if (l || x5 == c0012a2) {
                x5 = new zm3(z2, this, context, 2);
                M.R(x5);
            }
            com.vk.core.compose.component.semantics.a a6 = com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3);
            boolean y3 = M.y(this);
            Object x6 = M.x();
            if (y3 || x6 == c0012a2) {
                x6 = new dj60(this, 21);
                M.R(x6);
            }
            wiu0.b(null, false, null, a5, com.vk.core.compose.component.cell.content.n.a(z3, (gzs) x6, z2, a6, M, 24576, 0), null, null, M, 0, 103);
            List list = (List) wh50Var.getValue();
            if (list == null || !fo()) {
                list = (List) ((zak0) this.h1).getValue();
            }
            List list2 = list;
            MusicTrack musicTrack = (MusicTrack) ((zak0) this.m1).getValue();
            String Ib = musicTrack != null ? musicTrack.Ib() : null;
            MusicPickerListItem.MusicTrackItem.PlayingState playingState = (MusicPickerListItem.MusicTrackItem.PlayingState) ((zak0) this.n1).getValue();
            izs izsVar = (izs) ((zak0) this.i1).getValue();
            boolean y4 = M.y(this);
            Object x7 = M.x();
            if (y4 || x7 == c0012a2) {
                c0012a = c0012a2;
                c cVar = new c(0, this, dbi0.class, "dismiss", "dismiss()V", 0);
                M.R(cVar);
                x7 = cVar;
            } else {
                c0012a = c0012a2;
            }
            gzs gzsVar = (gzs) ((fcy) x7);
            boolean y5 = M.y(this);
            Object x8 = M.x();
            if (y5 || x8 == c0012a) {
                x8 = new fv90(this, 21);
                M.R(x8);
            }
            ebi0.a(list2, Ib, playingState, null, izsVar, gzsVar, (izs) x8, M, 0);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uxb(this, i, 9);
        }
    }

    public final u2b0 eo() {
        return (u2b0) ((zak0) this.o1).getValue();
    }

    public final boolean fo() {
        return ((Boolean) ((zak0) this.l1).getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        eo().P0(this.q1, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((io.reactivex.rxjava3.disposables.b) ((zak0) this.p1).getValue()).dispose();
        eo().stop(32);
        eo().n0(this.q1);
        super.onDestroy();
    }
}
