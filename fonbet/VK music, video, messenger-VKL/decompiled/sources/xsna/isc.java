package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X3;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewParams;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditAttachedVideo;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipVideoAttachmentSdkItem;
import com.vk.clips.viewer.edit.presentation.feature.state.ClipEditSdkMviState;
import com.vk.clips.viewer.edit.presentation.feature.state.CoverImageUrl;
import com.vk.clips.viewer.edit.presentation.feature.state.ImmutableClipState;
import com.vk.clips.viewer.edit.presentation.feature.state.coauthors.ClipsEditCoauthorsState;
import com.vk.clips.viewer.edit.presentation.feature.state.ord.ClipsEditOrdState;
import com.vk.clips.viewer.edit.presentation.feature.state.trends.ClipsTrendingHashtagsState;
import com.vk.clips.viewer.edit.presentation.feature.state.videoattach.ClipEditVideoAttachState;
import com.vk.clips.viewer.edit.presentation.model.OrdVS;
import com.vk.clips.viewer.edit.presentation.model.coauthors.CoauthorsBannerVS;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.Regex;
import xsna.auc;
import xsna.duc;
import xsna.jsc;
import xsna.ksc;
import xsna.tw50;
import xsna.usc;
import xsna.ysc;
import xsna.zih0;

/* compiled from: ClipEditSdkBottomSheet.kt */
/* loaded from: classes17.dex */
public final class isc extends vpi implements tb0 {
    public static final /* synthetic */ qcy<Object>[] t1;
    public final Object g1;
    public final Object h1;
    public final Object i1;
    public final Object j1;
    public final Object k1;
    public final Object l1;
    public final Object m1;
    public final Object n1;
    public final Object o1;
    public wzs<? super View, ? super izs<? super Boolean, s3q0>, s3q0> p1;
    public irk0 q1;
    public final u1h0 r1;
    public final hb0<Intent> s1;

    /* compiled from: ClipEditSdkBottomSheet.kt */
    public static final class a extends wpi {
        public final ClipEditSdkItem g;
        public final wzs<View, izs<? super Boolean, s3q0>, s3q0> h;
        public final irk0 i;
        public final boolean j;

        public a(Context context, ClipEditSdkItem clipEditSdkItem, wzs wzsVar, irk0 irk0Var, boolean z, auc.a aVar) {
            super(context, aVar);
            this.g = clipEditSdkItem;
            this.h = wzsVar;
            this.i = irk0Var;
            this.j = z;
            P0();
            O0();
            n0(0);
            o0(0);
            p0(0);
            m0(0);
            l(0);
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            isc iscVar = new isc();
            iscVar.p1 = this.h;
            iscVar.q1 = this.i;
            iscVar.setArguments(yfb.b(new Pair("input_clip", this.g), new Pair("force_dark", Boolean.valueOf(this.j))));
            return iscVar;
        }
    }

    /* compiled from: ClipEditSdkBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ClipEditSdkMviState, euc> {
        public static final b b = new b(1, fuc.class, "toViewState", "toViewState(Lcom/vk/clips/viewer/edit/presentation/feature/state/ClipEditSdkMviState;)Lcom/vk/clips/viewer/edit/presentation/model/ClipEditSdkViewState;", 1);

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ff A[LOOP:1: B:48:0x00f9->B:50:0x00ff, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x018e  */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final euc invoke(ClipEditSdkMviState clipEditSdkMviState) {
            duc cVar;
            ClipsEditCoauthorsState clipsEditCoauthorsState;
            ClipsTrendingHashtagsState clipsTrendingHashtagsState;
            List list;
            duc ducVar;
            ClipEditSdkMviState clipEditSdkMviState2 = clipEditSdkMviState;
            ClipEditVideoAttachState clipEditVideoAttachState = clipEditSdkMviState2.e;
            ImmutableClipState immutableClipState = clipEditSdkMviState2.i;
            boolean z = clipEditSdkMviState2.o;
            String str = clipEditSdkMviState2.c;
            if (str.length() == 0) {
                Iterator<T> it = immutableClipState.f.b.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next = it.next();
                if (it.hasNext()) {
                    int i = ((CoverImageUrl) next).c;
                    do {
                        Object next2 = it.next();
                        int i2 = ((CoverImageUrl) next2).c;
                        if (i > i2) {
                            next = next2;
                            i = i2;
                        }
                    } while (it.hasNext());
                }
                str = ((CoverImageUrl) next).b;
            }
            String str2 = clipEditSdkMviState2.b;
            boolean z2 = clipEditSdkMviState2.j;
            d9k0 d9k0Var = clipEditSdkMviState2.k;
            OrdVS shown = ((clipEditSdkMviState2.g instanceof ClipsEditOrdState.Disabled) || immutableClipState.k != null) ? OrdVS.Hidden.b : clipEditSdkMviState2.d != null ? new OrdVS.Shown(true) : new OrdVS.Shown(false);
            if (epx.f(clipEditVideoAttachState, ClipEditVideoAttachState.Disabled.b)) {
                ducVar = duc.a.a;
            } else if (epx.f(clipEditVideoAttachState, ClipEditVideoAttachState.Empty.b)) {
                ducVar = new duc.b(false, z);
            } else {
                if (!(clipEditVideoAttachState instanceof ClipEditVideoAttachState.Loading)) {
                    if (!(clipEditVideoAttachState instanceof ClipEditVideoAttachState.Selected)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ClipEditVideoAttachState.Selected selected = (ClipEditVideoAttachState.Selected) clipEditVideoAttachState;
                    cVar = new duc.c(selected.b, selected.c, z);
                    clipsEditCoauthorsState = clipEditSdkMviState2.f;
                    ksc kscVar = null;
                    CoauthorsBannerVS coauthorsBannerVS = null;
                    if (!epx.f(clipsEditCoauthorsState, ClipsEditCoauthorsState.Disabled.b)) {
                        if (!(clipsEditCoauthorsState instanceof ClipsEditCoauthorsState.Enabled)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ClipsEditCoauthorsState.Enabled enabled = (ClipsEditCoauthorsState.Enabled) clipsEditCoauthorsState;
                        ClipsEditCoauthorsState.Enabled.InactiveReason inactiveReason = enabled.d;
                        boolean z3 = enabled.c;
                        switch (inactiveReason == null ? -1 : ryf.$EnumSwitchMapping$0[inactiveReason.ordinal()]) {
                            case -1:
                                List<ClipCoauthorSdkItem> list2 = enabled.b;
                                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                                for (ClipCoauthorSdkItem clipCoauthorSdkItem : list2) {
                                    arrayList.add(new pyf(clipCoauthorSdkItem.c, clipCoauthorSdkItem.d));
                                }
                                kscVar = arrayList.isEmpty() ? new ksc.a(z3, coauthorsBannerVS) : arrayList.size() == 1 ? new ksc.c(z3, coauthorsBannerVS, (pyf) j5g.Y(arrayList)) : new ksc.b(z3, coauthorsBannerVS, arrayList);
                                break;
                            case 0:
                            default:
                                throw new NoWhenBranchMatchedException();
                            case 1:
                                coauthorsBannerVS = CoauthorsBannerVS.ClosedProfileWithoutCoauthors;
                                List<ClipCoauthorSdkItem> list22 = enabled.b;
                                ArrayList arrayList2 = new ArrayList(c5g.u(list22, 10));
                                while (r0.hasNext()) {
                                }
                                kscVar = arrayList2.isEmpty() ? new ksc.a(z3, coauthorsBannerVS) : arrayList2.size() == 1 ? new ksc.c(z3, coauthorsBannerVS, (pyf) j5g.Y(arrayList2)) : new ksc.b(z3, coauthorsBannerVS, arrayList2);
                                break;
                            case 2:
                                coauthorsBannerVS = CoauthorsBannerVS.ClosedProfileWithCoauthors;
                                List<ClipCoauthorSdkItem> list222 = enabled.b;
                                ArrayList arrayList22 = new ArrayList(c5g.u(list222, 10));
                                while (r0.hasNext()) {
                                }
                                kscVar = arrayList22.isEmpty() ? new ksc.a(z3, coauthorsBannerVS) : arrayList22.size() == 1 ? new ksc.c(z3, coauthorsBannerVS, (pyf) j5g.Y(arrayList22)) : new ksc.b(z3, coauthorsBannerVS, arrayList22);
                                break;
                            case 3:
                                coauthorsBannerVS = CoauthorsBannerVS.ClosedGroupWithoutCoauthors;
                                List<ClipCoauthorSdkItem> list2222 = enabled.b;
                                ArrayList arrayList222 = new ArrayList(c5g.u(list2222, 10));
                                while (r0.hasNext()) {
                                }
                                kscVar = arrayList222.isEmpty() ? new ksc.a(z3, coauthorsBannerVS) : arrayList222.size() == 1 ? new ksc.c(z3, coauthorsBannerVS, (pyf) j5g.Y(arrayList222)) : new ksc.b(z3, coauthorsBannerVS, arrayList222);
                                break;
                            case 4:
                                coauthorsBannerVS = CoauthorsBannerVS.ClosedGroupWithCoauthors;
                                List<ClipCoauthorSdkItem> list22222 = enabled.b;
                                ArrayList arrayList2222 = new ArrayList(c5g.u(list22222, 10));
                                while (r0.hasNext()) {
                                }
                                kscVar = arrayList2222.isEmpty() ? new ksc.a(z3, coauthorsBannerVS) : arrayList2222.size() == 1 ? new ksc.c(z3, coauthorsBannerVS, (pyf) j5g.Y(arrayList2222)) : new ksc.b(z3, coauthorsBannerVS, arrayList2222);
                                break;
                            case 5:
                                coauthorsBannerVS = CoauthorsBannerVS.ClosedClip;
                                List<ClipCoauthorSdkItem> list222222 = enabled.b;
                                ArrayList arrayList22222 = new ArrayList(c5g.u(list222222, 10));
                                while (r0.hasNext()) {
                                }
                                kscVar = arrayList22222.isEmpty() ? new ksc.a(z3, coauthorsBannerVS) : arrayList22222.size() == 1 ? new ksc.c(z3, coauthorsBannerVS, (pyf) j5g.Y(arrayList22222)) : new ksc.b(z3, coauthorsBannerVS, arrayList22222);
                                break;
                            case 6:
                                coauthorsBannerVS = CoauthorsBannerVS.None;
                                List<ClipCoauthorSdkItem> list2222222 = enabled.b;
                                ArrayList arrayList222222 = new ArrayList(c5g.u(list2222222, 10));
                                while (r0.hasNext()) {
                                }
                                kscVar = arrayList222222.isEmpty() ? new ksc.a(z3, coauthorsBannerVS) : arrayList222222.size() == 1 ? new ksc.c(z3, coauthorsBannerVS, (pyf) j5g.Y(arrayList222222)) : new ksc.b(z3, coauthorsBannerVS, arrayList222222);
                                break;
                        }
                    }
                    r8d r8dVar = clipEditSdkMviState2.n;
                    clipsTrendingHashtagsState = clipEditSdkMviState2.h;
                    if (clipsTrendingHashtagsState instanceof ClipsTrendingHashtagsState.Enabled) {
                        list = EmptyList.b;
                    } else {
                        List<String> list3 = ((ClipsTrendingHashtagsState.Enabled) clipsTrendingHashtagsState).b;
                        Set C = rli0.C(new ulp0(Regex.d(new Regex("#\\w+"), clipEditSdkMviState2.b), new mo1(10)));
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : list3) {
                            if (!C.contains(((String) obj).toLowerCase(Locale.ROOT))) {
                                arrayList3.add(obj);
                            }
                        }
                        list = new wow(arrayList3);
                    }
                    return new euc(str, str2, list, z2, d9k0Var, shown, cVar, kscVar, r8dVar);
                }
                ducVar = new duc.b(true, z);
            }
            cVar = ducVar;
            clipsEditCoauthorsState = clipEditSdkMviState2.f;
            ksc kscVar2 = null;
            CoauthorsBannerVS coauthorsBannerVS2 = null;
            if (!epx.f(clipsEditCoauthorsState, ClipsEditCoauthorsState.Disabled.b)) {
            }
            r8d r8dVar2 = clipEditSdkMviState2.n;
            clipsTrendingHashtagsState = clipEditSdkMviState2.h;
            if (clipsTrendingHashtagsState instanceof ClipsTrendingHashtagsState.Enabled) {
            }
            return new euc(str, str2, list, z2, d9k0Var, shown, cVar, kscVar2, r8dVar2);
        }
    }

    /* compiled from: ClipEditSdkBottomSheet.kt */
    public static final /* synthetic */ class c implements xy, g0t {
        public final /* synthetic */ btc b;

        public c(btc btcVar) {
            this.b = btcVar;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((usc) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, btc.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: ClipEditSdkBottomSheet.kt */
    @b6l(c = "com.vk.clips.viewer.edit.presentation.fragment.ClipEditSdkBottomSheet$Content$1$2$1", f = "ClipEditSdkBottomSheet.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements yzs<z37<usc>, ysc, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public d(spj<? super d> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<usc> z37Var, ysc yscVar, spj<? super s3q0> spjVar) {
            d dVar = isc.this.new d(spjVar);
            dVar.L$0 = yscVar;
            return dVar.invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            wzs<? super View, ? super izs<? super Boolean, s3q0>, s3q0> wzsVar;
            View view;
            ClipEditAttachedVideo rawId;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            ysc yscVar = (ysc) this.L$0;
            isc iscVar = isc.this;
            qcy<Object>[] qcyVarArr = isc.t1;
            btc fo = iscVar.fo();
            ?? r4 = iscVar.g1;
            if (epx.f(yscVar, ysc.g.a)) {
                iscVar.hide();
            } else if (yscVar instanceof ysc.h) {
                ClipEditSdkItem clipEditSdkItem = (ClipEditSdkItem) r4.getValue();
                ysc.h hVar = (ysc.h) yscVar;
                ImmutableClipState immutableClipState = hVar.a;
                String str = immutableClipState.e;
                List<CoverImageUrl> list = immutableClipState.f.b;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (CoverImageUrl coverImageUrl : list) {
                    arrayList.add(new ImageUrl(coverImageUrl.b, coverImageUrl.c, coverImageUrl.d));
                }
                ClipEditAttachedVideo clipEditAttachedVideo = null;
                SdkImages sdkImages = new SdkImages(arrayList, null, 2, null);
                ImmutableClipState immutableClipState2 = hVar.a;
                SdkClipOrdData sdkClipOrdData = immutableClipState2.k;
                ImmutableClipState.AttachedVideo attachedVideo = immutableClipState2.l;
                if (attachedVideo != null) {
                    if (attachedVideo instanceof ImmutableClipState.AttachedVideo.Full) {
                        rawId = new ClipEditAttachedVideo.Full(((ImmutableClipState.AttachedVideo.Full) attachedVideo).b);
                    } else {
                        if (!(attachedVideo instanceof ImmutableClipState.AttachedVideo.RawId)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rawId = new ClipEditAttachedVideo.RawId(((ImmutableClipState.AttachedVideo.RawId) attachedVideo).b);
                    }
                    clipEditAttachedVideo = rawId;
                }
                iscVar.getParentFragmentManager().k0(yfb.b(new Pair("clip_edit_bundle_result", new ClipEditSdkItem(clipEditSdkItem.b, clipEditSdkItem.c, clipEditSdkItem.d, clipEditSdkItem.e, clipEditSdkItem.f, clipEditSdkItem.g, str, sdkImages, clipEditSdkItem.j, sdkClipOrdData, clipEditAttachedVideo, immutableClipState2.m, clipEditSdkItem.n, clipEditSdkItem.o, clipEditSdkItem.p))), "clip_edit_result");
                iscVar.hide();
            } else {
                int i = 24;
                if (yscVar instanceof ysc.d) {
                    jqd m = iscVar.eo().m();
                    iscVar.eo().getClass();
                    m.a(new l7s(iscVar.requireContext(), R.style.Vk_Theme_VkApp_space_gray_generated), ((ysc.d) yscVar).a, new a8(fo, i), tw50.a.a.getSTUB(), zih0.a.a.getSTUB());
                } else if (yscVar instanceof ysc.c) {
                    ClipsChoosePreviewParams clipsChoosePreviewParams = new ClipsChoosePreviewParams(((ClipEditSdkMviState) fo.getCurrentState()).i.g, null, ((ClipEditSdkMviState) fo.getCurrentState()).i.h, ((ClipEditSdkMviState) fo.getCurrentState()).i.i, 0L, null, ((ClipEditSdkMviState) fo.getCurrentState()).i.j, null, null, 418, null);
                    nld nldVar = (nld) iscVar.j1.getValue();
                    if (nldVar != null) {
                        iscVar.s1.a(nldVar.getIntent());
                    } else {
                        ((fvd) iscVar.o1.getValue()).a(iscVar.requireContext(), clipsChoosePreviewParams);
                    }
                } else if (yscVar instanceof ysc.e) {
                    ysc.e eVar = (ysc.e) yscVar;
                    jvd jvdVar = (jvd) iscVar.k1.getValue();
                    if (jvdVar != null) {
                        jvdVar.a(iscVar.requireContext(), eVar.a, new com.vk.im.ui.fragments.b(iscVar, i));
                    }
                } else if (yscVar instanceof ysc.f) {
                    nvd nvdVar = (nvd) iscVar.m1.getValue();
                    if (nvdVar != null) {
                        nvdVar.d(iscVar.requireContext(), ((ysc.f) yscVar).a, ((ClipEditSdkItem) r4.getValue()).b);
                    }
                } else if (yscVar instanceof ysc.b) {
                    ysc.b bVar = (ysc.b) yscVar;
                    jsc jscVar = (jsc) iscVar.n1.getValue();
                    if (jscVar != null) {
                        jscVar.c(new jsc.a(iscVar.requireContext(), iscVar.getChildFragmentManager(), iscVar), bVar.a, bVar.b, bVar.c, new fb(fo, 22));
                    }
                } else {
                    if (!(yscVar instanceof ysc.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jsc g = iscVar.eo().g();
                    if (g != null && g.b() != null && (wzsVar = iscVar.p1) != null && (view = iscVar.Hn().Y) != null) {
                        wzsVar.invoke(view, new x7(fo, 25));
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClipEditSdkBottomSheet.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<usc, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(usc uscVar) {
            ((z37) this.receiver).b(uscVar);
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(isc.class, X3.i.U, "getStore()Lcom/vk/clips/viewer/edit/presentation/feature/ClipEditSdkMviStore;", 0);
        fpf0.a.getClass();
        t1 = new qcy[]{propertyReference1Impl};
        SchemeStat$TypeDialogItem.DialogAction dialogAction = SchemeStat$TypeDialogItem.DialogAction.SHOW;
    }

    public isc() {
        eu1 eu1Var = new eu1(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g1 = msy.a(lazyThreadSafetyMode, eu1Var);
        this.h1 = msy.a(lazyThreadSafetyMode, new im0(this, 15));
        this.i1 = msy.a(lazyThreadSafetyMode, new ra(this, 18));
        this.j1 = msy.a(lazyThreadSafetyMode, new h20(this, 14));
        this.k1 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.d(this, 15));
        int i = 17;
        this.l1 = msy.a(lazyThreadSafetyMode, new hg(this, i));
        this.m1 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.f(this, i));
        this.n1 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.g(this, 21));
        this.o1 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.h(this, 19));
        this.r1 = new u1h0(fpf0.d(btc.class).toString(), this, this, new sf1(this, 23));
        this.s1 = registerForActivityResult(new cb0(), new ua0() { // from class: xsna.fsc
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.ua0
            public final void onActivityResult(Object obj) {
                ClipsChoosePreviewResult clipsChoosePreviewResult;
                ActivityResult activityResult = (ActivityResult) obj;
                qcy<Object>[] qcyVarArr = isc.t1;
                if (activityResult.b == -1) {
                    Intent intent = activityResult.c;
                    isc iscVar = isc.this;
                    if (intent != null) {
                        clipsChoosePreviewResult = (ClipsChoosePreviewResult) intent.getParcelableExtra(((nld) iscVar.j1.getValue()) != null ? "" : null);
                    } else {
                        clipsChoosePreviewResult = null;
                    }
                    if (clipsChoosePreviewResult != null) {
                        btc fo = iscVar.fo();
                        File file = clipsChoosePreviewResult.b;
                        fo.b(new usc.a.e(String.valueOf(file != null ? Uri.fromFile(file) : null)));
                    }
                }
            }
        });
        registerForActivityResult(new cb0(), new gsc(this, 0));
        registerForActivityResult(new cb0(), new hsc(this, 0));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vpi
    public final void Zn(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-117524076);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-117524076, i2, -1, "com.vk.clips.viewer.edit.presentation.fragment.ClipEditSdkBottomSheet.Content (ClipEditSdkBottomSheet.kt:200)");
            }
            eo().getClass();
            co(((Boolean) this.h1.getValue()).booleanValue(), kai.c(-1320400286, new vp4(this, 2), M), M, ((i2 << 9) & 7168) | 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uxb(this, i, 1);
        }
    }

    @Override // xsna.vpi
    public final void bo(b33 b33Var) {
        Object obj;
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            bpn0 bpn0Var = enj.a;
            obj = e3m.h(mo2getContext);
        } else {
            obj = null;
        }
        aeg0 aeg0Var = obj instanceof aeg0 ? (aeg0) obj : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this);
        }
        eo().b().b(requireContext(), new com.vk.movika.sdk.base.model.e(this, 13));
    }

    public final void co(final boolean z, jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final jai jaiVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2084832708);
        if ((i & 6) == 0) {
            i2 = (M.J(null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2084832708, i2, -1, "com.vk.clips.viewer.edit.presentation.fragment.ClipEditSdkBottomSheet.EditTheme (ClipEditSdkBottomSheet.kt:228)");
            }
            if (z) {
                M.K(-270652006);
                M.K(-270626711);
                M.j();
                M.K(2069481401);
                aVar2 = M;
                rrv0.e(true, null, null, null, null, null, jaiVar, aVar2, ((i2 << 12) & 3670016) | 6, 62);
                jaiVar2 = jaiVar;
                aVar2.j();
                aVar2.j();
            } else {
                jaiVar2 = jaiVar;
                M.K(-270509716);
                int i3 = ((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).uiMode;
                M.K(-270292345);
                M.j();
                M.K(2069492222);
                rrv0.d(null, null, null, null, jaiVar2, M, (i2 << 6) & 57344, 15);
                aVar2 = M;
                aVar2.j();
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.csc
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qcy<Object>[] qcyVarArr = isc.t1;
                    int I = ne7.I(i | 1);
                    isc.this.co(z, jaiVar2, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final fof eo() {
        return (fof) this.i1.getValue();
    }

    public final btc fo() {
        qcy<Object> qcyVar = t1[0];
        return (btc) this.r1.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ClipVideoAttachmentSdkItem a2;
        ?? r8 = this.m1;
        nvd nvdVar = (nvd) r8.getValue();
        if (nvdVar == null || i != nvdVar.c()) {
            ?? r82 = this.o1;
            ((fvd) r82.getValue()).getClass();
            if (i != 1765) {
                return;
            }
            ClipsChoosePreviewResult b2 = ((fvd) r82.getValue()).b(intent);
            if (b2 != null) {
                btc fo = fo();
                File file = b2.b;
                fo.b(new usc.a.e(String.valueOf(file != null ? Uri.fromFile(file) : null)));
                return;
            }
            return;
        }
        nvd nvdVar2 = (nvd) r8.getValue();
        if (nvdVar2 == null || (a2 = nvdVar2.a(intent)) == null) {
            return;
        }
        btc fo2 = fo();
        String str = a2.c;
        UserId userId = a2.b;
        String str2 = a2.e;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = a2.d;
        fo2.b(new usc.a.f(new e2s0(userId, str, str2, str3 != null ? str3 : "", a2.f)));
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        eo().b().a(requireContext());
        Context requireContext = requireContext();
        bpn0 bpn0Var = enj.a;
        ComponentCallbacks2 h = e3m.h(requireContext);
        aeg0 aeg0Var = h instanceof aeg0 ? (aeg0) h : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this);
        }
    }
}
