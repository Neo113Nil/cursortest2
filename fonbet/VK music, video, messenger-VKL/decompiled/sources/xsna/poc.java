package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectInputModel;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectorInputParams;
import com.vk.clips.coauthors.list.common.mvi.ClipCoauthorListLaunchType;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListItem;
import com.vk.clips.coauthors.list.common.mvi.entity.viewstate.ClipCoauthorListVS;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.doc;
import xsna.tzp0;

/* compiled from: ClipCoauthorsListBottomSheet.kt */
/* loaded from: classes16.dex */
public final class poc extends vpi {
    public static final tzp0.c.a l1 = new tzp0.c.a(new b(), false);
    public final Object g1;
    public final Object h1;
    public final Object i1;
    public final Object j1;
    public syf k1;

    /* compiled from: ClipCoauthorsListBottomSheet.kt */
    public static final class a extends wpi {
        public final ClipVideoFile g;
        public final syf h;
        public final ClipCoauthorListLaunchType i;
        public final boolean j;

        public a(Context context, ClipVideoFile clipVideoFile, syf syfVar, ClipCoauthorListLaunchType clipCoauthorListLaunchType, boolean z) {
            super(context, poc.l1);
            this.g = clipVideoFile;
            this.h = syfVar;
            this.i = clipCoauthorListLaunchType;
            this.j = z;
            F0(true);
            J();
            n0(0);
            o0(0);
            p0(0);
            m0(0);
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            poc pocVar = new poc();
            Bundle bundle = new Bundle();
            bundle.putParcelable("clip", this.g);
            bundle.putParcelable("launch_type", this.i);
            bundle.putBoolean("force_dark_theme", this.j);
            pocVar.setArguments(bundle);
            pocVar.k1 = this.h;
            return pocVar;
        }
    }

    /* compiled from: ClipCoauthorsListBottomSheet.kt */
    public static final class b implements m0q0 {
        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.COOWNER_MODAL_CARD;
        }
    }

    /* compiled from: ClipCoauthorsListBottomSheet.kt */
    public static final /* synthetic */ class c implements xy, g0t {
        public final /* synthetic */ eoc b;

        public c(eoc eocVar) {
            this.b = eocVar;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((coc) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, eoc.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: ClipCoauthorsListBottomSheet.kt */
    @b6l(c = "com.vk.clips.coauthors.list.common.mvi.ClipCoauthorsListBottomSheet$Content$2$1", f = "ClipCoauthorsListBottomSheet.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements yzs<z37<coc>, doc, spj<? super s3q0>, Object> {
        final /* synthetic */ eoc $store;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(eoc eocVar, spj<? super d> spjVar) {
            super(3, spjVar);
            this.$store = eocVar;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<coc> z37Var, doc docVar, spj<? super s3q0> spjVar) {
            d dVar = poc.this.new d(this.$store, spjVar);
            dVar.L$0 = docVar;
            return dVar.invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            doc docVar = (doc) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (epx.f(docVar, doc.b.a)) {
                poc.this.hide();
            } else if (docVar instanceof doc.c) {
                poc pocVar = poc.this;
                syf syfVar = pocVar.k1;
                if (syfVar != null) {
                    pocVar.requireContext();
                    doc.c cVar = (doc.c) docVar;
                    syfVar.a(cVar.a, cVar.b);
                }
                poc.this.hide();
            } else {
                if (!(docVar instanceof doc.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                poc pocVar2 = poc.this;
                doc.a aVar = (doc.a) docVar;
                eoc eocVar = this.$store;
                jmd jmdVar = (jmd) pocVar2.h1.getValue();
                Context requireContext = pocVar2.requireContext();
                ArrayList<ClipCoauthorListItem> arrayList = aVar.b;
                int i = aVar.c;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (ClipCoauthorListItem clipCoauthorListItem : arrayList) {
                    ClipCoauthorListItem.OwnerMin ownerMin = clipCoauthorListItem.b;
                    UserId userId = ownerMin.b;
                    String str = ownerMin.c;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String str3 = ownerMin.d;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    String str4 = str;
                    arrayList2.add(new ClipsCoauthorsSelectInputModel(userId, str4, str2, clipCoauthorListItem.f, clipCoauthorListItem.g));
                }
                jmdVar.b(requireContext, new ClipsCoauthorsSelectorInputParams(true, j5g.S0(arrayList2), "co_request", "co_result", aVar.a.b.b, true, new ClipsCoauthorsSelectorInputParams.ImmediateSave.Enabled(i), new ClipsCoauthorsSelectorInputParams.OpenFrom.Clips(Integer.valueOf(i))), pocVar2.getChildFragmentManager());
                pocVar2.getChildFragmentManager().l0("co_request", pocVar2, new moc(pocVar2, aVar, eocVar));
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClipCoauthorsListBottomSheet.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<coc, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(coc cocVar) {
            ((eoc) this.receiver).b(cocVar);
            return s3q0.a;
        }
    }

    public poc() {
        com.vk.movika.sdk.android.defaultplayer.view.timeline.a aVar = new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g1 = msy.a(lazyThreadSafetyMode, aVar);
        this.h1 = msy.a(lazyThreadSafetyMode, new h9(this, 17));
        this.i1 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.presenter.b(this, 10));
        this.j1 = msy.a(lazyThreadSafetyMode, new qc(this, 12));
    }

    @Override // xsna.vpi
    public final void Zn(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1905914485);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1905914485, i2, -1, "com.vk.clips.coauthors.list.common.mvi.ClipCoauthorsListBottomSheet.Content (ClipCoauthorsListBottomSheet.kt:66)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new com.vk.movika.sdk.base.data.a(this, 21);
                M.R(x);
            }
            int m = n34.m(M);
            ro.d(16);
            final eoc eocVar = (eoc) gcd0.v(Integer.toString(m, 16), (izs) x, M);
            boolean y = M.y(eocVar);
            Object x2 = M.x();
            if (y || x2 == obj) {
                x2 = new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(eocVar, 17);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            boolean y2 = M.y(eocVar) | (i3 == 4);
            Object x3 = M.x();
            if (y2 || x3 == obj) {
                x3 = new d(eocVar, null);
                M.R(x3);
            }
            r37.a(izsVar, (yzs) x3, kai.c(-359601886, new zzs() { // from class: xsna.ooc
                /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
                @Override // xsna.zzs
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    ClipCoauthorListVS clipCoauthorListVS = (ClipCoauthorListVS) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    tzp0.c.a aVar3 = poc.l1;
                    if ((intValue & 48) == 0) {
                        intValue |= aVar2.J(clipCoauthorListVS) ? 32 : 16;
                    }
                    int i4 = 0;
                    if (aVar2.t(intValue & 1, (intValue & 145) != 144)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-359601886, intValue, -1, "com.vk.clips.coauthors.list.common.mvi.ClipCoauthorsListBottomSheet.Content.<anonymous> (ClipCoauthorsListBottomSheet.kt:84)");
                        }
                        new xnd(true).a(6, aVar2, kai.c(1293987524, new noc(clipCoauthorListVS, ((Boolean) poc.this.j1.getValue()).booleanValue() || dhr0.M(), eocVar, i4), aVar2));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jd4(this, i, 5);
        }
    }
}
