package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.domain.CatalogExtraDo;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog.mvi.section.ui.utils.ParcelableLazyGridState;
import com.vk.catalog.mvi.section.ui.utils.ParcelableLazyListState;
import com.vk.catalog.mvi.section.ui.utils.ParcelableLazyState;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xsna.sga;

/* compiled from: CatalogSectionViewStateMapperImpl.kt */
/* loaded from: classes16.dex */
public final class uga implements tga {
    public final Map<Class<? extends CatalogBlockState>, s2a<? super CatalogBlockState, ?>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public uga(Map<Class<? extends CatalogBlockState>, ? extends s2a<? super CatalogBlockState, ?>> map) {
        this.a = map;
    }

    public static sga.e b(CatalogSectionState catalogSectionState) {
        Throwable th = catalogSectionState.i;
        if (th != null) {
            j03.a.getClass();
            return new sga.c(tq.h(tlo0.Companion, R.string.vk_common_retry), j03.h(th));
        }
        if (catalogSectionState.m.b != null || catalogSectionState.g) {
            return sga.d.b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0013 A[SYNTHETIC] */
    @Override // xsna.tga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sga a(CatalogSectionState catalogSectionState) {
        Throwable th;
        xm00 xm00Var;
        CatalogExtraDo catalogExtraDo = catalogSectionState.m;
        List<CatalogBlockData> list = catalogSectionState.k;
        if (list == null) {
            list = catalogSectionState.d;
        }
        ArrayList arrayList = new ArrayList();
        for (CatalogBlockData catalogBlockData : list) {
            xm00 xm00Var2 = catalogBlockData.d;
            utk0 utk0Var = catalogBlockData.b;
            if (xm00Var2 == null) {
                Class<?> cls = utk0Var.getValue().getClass();
                s2a<? super CatalogBlockState, ?> s2aVar = this.a.get(cls);
                if (s2aVar == null) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.e, new Object[]{xlg0.a(cls, new StringBuilder("CatalogSectionViewStateMapper has no registered viewStateMapper for "))});
                    }
                }
                if (s2aVar == null) {
                    xm00Var = null;
                    if (xm00Var == null) {
                        arrayList.add(xm00Var);
                    }
                } else {
                    catalogBlockData.d = new xm00(utk0Var, new p1(s2aVar, 16));
                }
            }
            xm00Var = catalogBlockData.d;
            if (xm00Var == null) {
            }
        }
        ParcelableLazyState parcelableLazyState = catalogSectionState.e;
        if (arrayList.isEmpty() && (th = catalogSectionState.h) != null) {
            j03.a.getClass();
            return new sga.c(tq.h(tlo0.Companion, R.string.vk_common_retry), j03.h(th));
        }
        if (arrayList.isEmpty() && catalogSectionState.f) {
            return sga.d.b;
        }
        if (parcelableLazyState instanceof ParcelableLazyGridState) {
            return new sga.b(catalogSectionState.b, catalogSectionState.f, catalogSectionState.j, arrayList, ((ParcelableLazyGridState) parcelableLazyState).b, catalogExtraDo.b != null, b(catalogSectionState), catalogSectionState.n);
        }
        if (!(parcelableLazyState instanceof ParcelableLazyListState)) {
            throw new IllegalStateException("Unknown lazy state");
        }
        xvy xvyVar = ((ParcelableLazyListState) parcelableLazyState).b;
        return new sga.a(catalogSectionState.b, catalogSectionState.f, catalogSectionState.j, arrayList, xvyVar, catalogExtraDo.b != null, b(catalogSectionState), catalogSectionState.n);
    }
}
