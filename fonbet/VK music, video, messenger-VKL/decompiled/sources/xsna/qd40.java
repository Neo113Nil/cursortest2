package xsna;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockShimmer;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.toggle.features.MusicFeatures;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: MusicCatalogSectionPresenter.kt */
/* loaded from: classes16.dex */
public final class qd40 extends kea implements zda {
    public final String S;
    public final x2a<hda> T;
    public final w2a U;
    public final gzs<Boolean> V;
    public final AtomicBoolean W;
    public final io.reactivex.rxjava3.disposables.g X;
    public final i12 Y;

    public qd40(a.c cVar, fz8 fz8Var, u4a u4aVar, vd7 vd7Var, boolean z, UIBlockList uIBlockList, String str, boolean z2, eda edaVar, x2a x2aVar, u550 u550Var, int i) {
        this(cVar, fz8Var, u4aVar, vd7Var, z, uIBlockList, str, (i & 128) != 0 ? true : z2, null, null, edaVar, null, x2aVar, u550Var, new pv7((byte) 0, 8), null);
    }

    @Override // xsna.kea, xsna.tba
    public final void b(CatalogPaginatedListViewHolder catalogPaginatedListViewHolder) {
        super.b(catalogPaginatedListViewHolder);
        boolean h = MusicFeatures.CATALOG_RELOAD_ON_INET.h();
        io.reactivex.rxjava3.disposables.g gVar = this.X;
        if (!h) {
            com.vk.core.utils.newtork.b.a.getClass();
            gVar.b(com.vk.core.utils.newtork.b.f().subscribe(new s440(new kb40(this, 1), 1)));
            return;
        }
        com.vk.core.utils.newtork.b.a.getClass();
        io.reactivex.rxjava3.subjects.d<com.vk.core.utils.newtork.d> dVar = com.vk.core.utils.newtork.b.d;
        dVar.getClass();
        gVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.k2(new io.reactivex.rxjava3.internal.operators.observable.q2(new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new y34(new l6u(this, 18), 26)), new com.vk.movika.sdk.base.flow.binding.c(new e420(3), 24)).y(3L, TimeUnit.SECONDS), new ed(new s6x(12), 27)).subscribe(new tl30(new lw20(this, 4), 2)));
    }

    @Override // xsna.kea, xsna.tba
    public final void d(CatalogPaginatedListViewHolder catalogPaginatedListViewHolder) {
        super.d(catalogPaginatedListViewHolder);
        mzp0 mzp0Var = this.b;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
        this.X.b(null);
    }

    @Override // xsna.kea, xsna.tba
    public final io.reactivex.rxjava3.core.q i(Integer num, String str, boolean z) {
        io.reactivex.rxjava3.core.q<hda> qVar;
        gzs<Boolean> gzsVar;
        mzp0 mzp0Var = null;
        String str2 = this.S;
        if (str2 != null) {
            if (str2.length() == 0) {
                str2 = null;
            }
            if (str2 != null) {
                LruCache<UUID, mzp0> lruCache = rzp0.a;
                mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.MUSIC_CATALOG, str2, false, 60).g();
                mzp0Var.init();
                mzp0Var.start();
                mzp0Var.a();
            }
        }
        this.b = mzp0Var;
        if (z && (gzsVar = this.V) != null && gzsVar.invoke().booleanValue()) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        if (str == null) {
            w2a w2aVar = this.U;
            if (w2aVar == null || (qVar = w2aVar.a()) == null) {
                qVar = io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }
        } else {
            qVar = io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        io.reactivex.rxjava3.core.q i = super.i(num, str, z);
        cx00 cx00Var = new cx00(new s53(25, str, this), 3);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(this.T.a(qVar, i.E(cx00Var, lVar, kVar, kVar), z).E(new pmu(new e810(this, 8), 6), lVar, kVar, kVar).F(new pd40(new f410(this, 9), 0)), new m5(new nl30(this, 2), 28), kVar).C(new xv(this, 6));
    }

    @Override // xsna.zda
    public final void k(UIBlock uIBlock) {
        i12 i12Var = this.Y;
        if (i12Var != null) {
            CatalogPaginatedListViewHolder catalogPaginatedListViewHolder = this.c;
            if (i12Var.a || !(uIBlock instanceof UIBlockList)) {
                return;
            }
            ArrayList<UIBlock> arrayList = ((UIBlockList) uIBlock).y;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((UIBlock) it.next()) instanceof UIBlockShimmer) {
                        return;
                    }
                }
            }
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            Iterator<UIBlock> it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else if (epx.f(it2.next().m, (String) i12Var.b)) {
                    break;
                } else {
                    i++;
                }
            }
            ref$IntRef.element = i;
            if (i > 0 && (arrayList.get(i - 1) instanceof UIBlockHeader)) {
                ref$IntRef.element--;
            }
            i12Var.a = true;
            ((Handler) i12Var.c).postDelayed(new h12(0, catalogPaginatedListViewHolder, ref$IntRef), 100L);
        }
    }

    @Override // xsna.tba
    public final void l() {
        mzp0 mzp0Var = this.b;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
    }

    @Override // xsna.kea, xsna.tba
    public final void n() {
        super.n();
        mzp0 mzp0Var = this.b;
        if (mzp0Var != null) {
            mzp0Var.h();
        }
    }

    public qd40(u96 u96Var, fz8 fz8Var, u4a u4aVar, vd7 vd7Var, boolean z, UIBlockList uIBlockList, String str, boolean z2, String str2, String str3, eda edaVar, com.vk.catalog2.feature.music.configuration.b bVar, x2a x2aVar, w2a w2aVar, wzs wzsVar, pp00 pp00Var) {
        super(u96Var, fz8Var, u4aVar, vd7Var, z, uIBlockList, str, z2, str3, edaVar, bVar, null, null, false, wzsVar, 59648);
        i12 i12Var;
        this.S = str2;
        this.T = x2aVar;
        this.U = w2aVar;
        this.V = pp00Var;
        this.W = new AtomicBoolean(false);
        this.X = new io.reactivex.rxjava3.disposables.g();
        if (str3 != null) {
            i12Var = new i12();
            i12Var.b = str3;
            i12Var.c = new Handler(Looper.getMainLooper());
        } else {
            i12Var = null;
        }
        this.Y = i12Var;
    }

    @Override // xsna.zda
    public final void H(UIBlockCatalog uIBlockCatalog) {
    }

    @Override // xsna.zda
    public final void I(Throwable th) {
    }
}
