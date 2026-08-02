package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cad;
import xsna.cri;
import xsna.dt1;
import xsna.ise;
import xsna.jqe;
import xsna.jte;
import xsna.q630;

/* compiled from: ClipPlaylistsFolderList.kt */
/* loaded from: classes16.dex */
public final class cad {

    /* compiled from: ClipPlaylistsFolderList.kt */
    @b6l(c = "com.vk.clips.playlists.folders.list.ui.ClipPlaylistsFolderListKt$PlaylistsFoldersList$1$1", f = "ClipPlaylistsFolderList.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mtk0<List<ise>> $items;
        final /* synthetic */ SnapshotStateList<ise> $listSnapshot;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(mtk0<? extends List<? extends ise>> mtk0Var, SnapshotStateList<ise> snapshotStateList, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$items = mtk0Var;
            this.$listSnapshot = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$items, this.$listSnapshot, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            List<ise> value = this.$items.getValue();
            SnapshotStateList<ise> snapshotStateList = this.$listSnapshot;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : value) {
                ise iseVar = (ise) obj3;
                ListIterator<ise> listIterator = snapshotStateList.listIterator();
                while (true) {
                    duk0 duk0Var = (duk0) listIterator;
                    if (!duk0Var.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = duk0Var.next();
                    if (((ise) obj2).getId() == iseVar.getId()) {
                        break;
                    }
                }
                if (!epx.f(iseVar, obj2)) {
                    arrayList.add(obj3);
                }
            }
            SnapshotStateList<ise> snapshotStateList2 = this.$listSnapshot;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                final ise iseVar2 = (ise) arrayList.get(i);
                snapshotStateList2.replaceAll(new UnaryOperator() { // from class: xsna.bad
                    @Override // java.util.function.Function
                    public final Object apply(Object obj4) {
                        ise iseVar3 = (ise) obj4;
                        ise iseVar4 = ise.this;
                        return iseVar4.getId() == iseVar3.getId() ? iseVar4 : iseVar3;
                    }
                });
            }
            List list = this.$listSnapshot;
            List<ise> value2 = this.$items.getValue();
            SnapshotStateList<ise> snapshotStateList3 = this.$listSnapshot;
            if ((value2 instanceof List) && (value2 instanceof RandomAccess)) {
                List<ise> list2 = value2;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ise iseVar3 = list2.get(i2);
                    ise iseVar4 = iseVar3;
                    int size3 = snapshotStateList3.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size3) {
                            list.add(iseVar3);
                            break;
                        }
                        if (snapshotStateList3.get(i3).getId() != iseVar4.getId()) {
                            i3++;
                        }
                    }
                }
            } else {
                for (Object obj4 : value2) {
                    ise iseVar5 = (ise) obj4;
                    int size4 = snapshotStateList3.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size4) {
                            list.add(obj4);
                            break;
                        }
                        if (snapshotStateList3.get(i4).getId() != iseVar5.getId()) {
                            i4++;
                        }
                    }
                }
            }
            p4g.m(this.$listSnapshot, new ka(this.$items, 21));
            return s3q0.a;
        }
    }

    /* compiled from: ClipPlaylistsFolderList.kt */
    public static final class b implements zzs<qa8, Boolean, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ ise b;
        public final /* synthetic */ izs<jte, s3q0> c;
        public final /* synthetic */ zzf0 d;
        public final /* synthetic */ vtu e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ise iseVar, izs<? super jte, s3q0> izsVar, zzf0 zzf0Var, vtu vtuVar) {
            this.b = iseVar;
            this.c = izsVar;
            this.d = zzf0Var;
            this.e = vtuVar;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(qa8 qa8Var, Boolean bool, androidx.compose.runtime.a aVar, Integer num) {
            bool.getClass();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 129) != 128)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(756059933, intValue, -1, "com.vk.clips.playlists.folders.list.ui.PlaylistsFoldersList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ClipPlaylistsFolderList.kt:104)");
                }
                izs<jte, s3q0> izsVar = this.c;
                boolean J = aVar2.J(izsVar);
                Object x = aVar2.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (J || x == c0012a) {
                    x = new dad(izsVar);
                    aVar2.R(x);
                }
                izs izsVar2 = (izs) x;
                aVar2.K(724131350);
                q630.a aVar3 = q630.a.a;
                q630 f = txj0.f(aVar3, 1.0f);
                ise iseVar = this.b;
                ise.b bVar = iseVar instanceof ise.b ? (ise.b) iseVar : null;
                if ((bVar != null ? bVar.d : null) instanceof jqe.a) {
                    vtu vtuVar = this.e;
                    boolean y = aVar2.y(vtuVar);
                    Object x2 = aVar2.x();
                    if (y || x2 == c0012a) {
                        x2 = new ead(vtuVar);
                        aVar2.R(x2);
                    }
                    f = f.g(e5m.a(aVar3, this.d, (gzs) x2));
                }
                aVar2.j();
                p9d.b(iseVar, izsVar2, f, aVar2, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClipPlaylistsFolderList.kt */
    @b6l(c = "com.vk.clips.playlists.folders.list.ui.ClipPlaylistsFolderListKt$PlaylistsFoldersList$3$1", f = "ClipPlaylistsFolderList.kt", l = {Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $hasNext;
        final /* synthetic */ zzf0 $listState;
        final /* synthetic */ izs<jte, s3q0> $onAction;
        int label;

        /* compiled from: ClipPlaylistsFolderList.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ boolean b;
            public final /* synthetic */ izs<jte, s3q0> c;

            public a(izs izsVar, boolean z) {
                this.b = z;
                this.c = izsVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (this.b && booleanValue) {
                    this.c.invoke(jte.i.b);
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(zzf0 zzf0Var, boolean z, izs<? super jte, s3q0> izsVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$listState = zzf0Var;
            this.$hasNext = z;
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$listState, this.$hasNext, this.$onAction, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                izg0 M = nr2.M(new wm1(this.$listState, 15));
                a aVar = new a(this.$onAction, this.$hasNext);
                this.label = 1;
                if (M.collect(aVar, this) == coroutineSingletons) {
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

    /* compiled from: LazyDsl.kt */
    public static final class d implements izs<Integer, Object> {
        public final /* synthetic */ aad b;
        public final /* synthetic */ List c;

        public d(aad aadVar, List list) {
            this.b = aadVar;
            this.c = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            int intValue = num.intValue();
            return this.b.invoke(Integer.valueOf(intValue), this.c.get(intValue));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class e implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public e(List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return qjg.a((ise) this.b.get(num.intValue()));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class f implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ List b;
        public final /* synthetic */ zzf0 c;
        public final /* synthetic */ izs d;
        public final /* synthetic */ vtu e;

        public f(List list, zzf0 zzf0Var, izs izsVar, vtu vtuVar) {
            this.b = list;
            this.c = zzf0Var;
            this.d = izsVar;
            this.e = vtuVar;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                Object obj = this.b.get(intValue);
                int i2 = i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                aVar2.K(-681337980);
                izs izsVar = this.d;
                vtu vtuVar = this.e;
                zzf0 zzf0Var = this.c;
                vzf0.a(ksyVar2, zzf0Var, intValue, null, false, kai.c(756059933, new b((ise) obj, izsVar, zzf0Var, vtuVar), aVar2), aVar2, (i & 14) | 196608 | ((i2 << 3) & 896));
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final mtk0<? extends List<? extends ise>> mtk0Var, boolean z, final boolean z2, final boolean z3, izs<? super jte, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final boolean z4;
        Object obj;
        int i3;
        int i4;
        Object obj2;
        int i5;
        zzf0 zzf0Var;
        boolean J;
        Object x;
        final izs<? super jte, s3q0> izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(1465935184);
        if ((i & 6) == 0) {
            i2 = (M.J(mtk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar2) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1465935184, i2, -1, "com.vk.clips.playlists.folders.list.ui.PlaylistsFoldersList (ClipPlaylistsFolderList.kt:60)");
            }
            Object x2 = M.x();
            Object obj3 = a.C0011a.a;
            if (x2 == obj3) {
                x2 = androidx.compose.runtime.k.d(mtk0Var.getValue());
                M.R(x2);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) x2;
            List<? extends ise> value = mtk0Var.getValue();
            boolean z5 = (i2 & 14) == 4;
            Object x3 = M.x();
            if (z5 || x3 == obj3) {
                x3 = new a(mtk0Var, snapshotStateList, null);
                M.R(x3);
            }
            bap.g(value, (wzs) x3, M, 0);
            final vtu vtuVar = (vtu) M.r(uvi.l);
            int i6 = 57344 & i2;
            boolean z6 = i6 == 16384;
            Object x4 = M.x();
            if (z6 || x4 == obj3) {
                x4 = new cx(4, izsVar2, snapshotStateList);
                M.R(x4);
            }
            wzs wzsVar = (wzs) x4;
            Object x5 = M.x();
            if (x5 == obj3) {
                x5 = new x9d(0);
                M.R(x5);
            }
            Object obj4 = obj3;
            final zzf0 r = sp.r(wzsVar, null, (wzs) x5, null, M, 384, 58);
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(aVar2, "PlaylistsItemContainer");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            xvy xvyVar = r.o;
            q630 t = n34.t(aVar2, dz5.I(0, 1, M, false), null);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 d2 = defpackage.j0.d(1.0f, t, true);
            if (z3) {
                d2 = d2.g(yzf0.a(aVar2, r));
            }
            u890 n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            int i7 = i2 & 112;
            boolean J2 = M.J(r) | (i6 == 16384) | M.y(vtuVar) | (i7 == 32);
            Object x6 = M.x();
            if (!J2) {
                if (x6 == obj4) {
                    obj4 = obj4;
                } else {
                    obj2 = obj4;
                    obj = x6;
                    i4 = i7;
                    zzf0Var = r;
                    i5 = 2;
                    z4 = z;
                    i3 = i6;
                    int i8 = i3;
                    lqy.a(d2, xvyVar, n, null, null, null, false, null, (izs) obj, M, 384, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                    M = M;
                    if (z2) {
                        M.K(1836981608);
                    } else {
                        M.K(1842735363);
                        f9t.e(txj0.h(aVar2, (12 * i5) + 44), M, 6);
                    }
                    M.j();
                    M.G();
                    s3q0 s3q0Var = s3q0.a;
                    J = M.J(zzf0Var) | (i4 != 32) | (i8 != 16384);
                    x = M.x();
                    if (!J || x == obj2) {
                        x = new c(zzf0Var, z4, izsVar2, null);
                        M.R(x);
                    }
                    bap.g(s3q0Var, (wzs) x, M, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            i3 = i6;
            i4 = i7;
            obj2 = obj4;
            i5 = 2;
            z4 = z;
            obj = new izs() { // from class: xsna.y9d
                @Override // xsna.izs
                public final Object invoke(Object obj5) {
                    nvy nvyVar = (nvy) obj5;
                    aad aadVar = new aad(0);
                    SnapshotStateList snapshotStateList2 = SnapshotStateList.this;
                    nvyVar.e(snapshotStateList2.size(), new cad.d(aadVar, snapshotStateList2), new cad.e(snapshotStateList2), new jai(2039820996, new cad.f(snapshotStateList2, r, izsVar2, vtuVar), true));
                    if (z4) {
                        nvy.g(nvyVar, null, null, uci.a, 3);
                    }
                    return s3q0.a;
                }
            };
            zzf0Var = r;
            izsVar2 = izsVar2;
            M.R(obj);
            int i82 = i3;
            lqy.a(d2, xvyVar, n, null, null, null, false, null, (izs) obj, M, 384, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            M = M;
            if (z2) {
            }
            M.j();
            M.G();
            s3q0 s3q0Var2 = s3q0.a;
            J = M.J(zzf0Var) | (i4 != 32) | (i82 != 16384);
            x = M.x();
            if (!J) {
            }
            x = new c(zzf0Var, z4, izsVar2, null);
            M.R(x);
            bap.g(s3q0Var2, (wzs) x, M, 6);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            z4 = z;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final boolean z7 = z4;
            s.d = new wzs() { // from class: xsna.z9d
                @Override // xsna.wzs
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).intValue();
                    cad.a(mtk0.this, z7, z2, z3, izsVar2, (androidx.compose.runtime.a) obj5, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
