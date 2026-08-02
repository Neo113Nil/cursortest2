package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.vk.clips.design.view.editor.CorrectionView;
import com.vk.clips.design.view.filter.CorrectionsView;
import com.vk.clips.design.view.filter.FiltersRecyclerView;
import com.vk.clips.design.view.filter.FiltersView;
import com.vk.clips.design.view.filter.HslView;
import com.vk.dto.clips.filters.FilterInfo;
import com.vk.dto.clips.filters.HslInfo;
import com.vk.dto.stories.model.web.ClipBox;
import com.vk.editor.filters.correction.entity.CorrectionType;
import com.vk.editor.filters.correction.entity.HslColorType;
import com.vk.editor.filters.correction.model.FilterType;
import com.vk.permission.PermissionHelper;
import com.vk.voip.ui.report.dialog.VoipReportSuspiciousCallActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.gmw0;
import xsna.imw0;
import xsna.ixd;
import xsna.jto0;
import xsna.qis0;
import xsna.qis0.a;
import xsna.sum0;
import xsna.u5s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qum0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qum0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        HslInfo.Params params;
        int i;
        FilterType filterType;
        boolean z;
        gmw0 gmw0Var;
        int i2 = this.b;
        boolean z2 = false;
        int i3 = 2;
        int i4 = 9;
        boolean z3 = true;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                ((Boolean) obj).getClass();
                ((izs) obj3).invoke(sum0.c.a((sum0.c) obj2, !r0.a, null, 0, false, 14));
                return s3q0.a;
            case 1:
                ((i0b0) obj3).invoke(jto0.b.a((jto0.b) obj2, null, null, null, null, false, null, false, false, false, false, (tho0) obj, false, false, false, null, false, 64511));
                return s3q0.a;
            case 2:
                ((lyp0) obj3).b.g((hyg0) obj, (ArrayList) obj2);
                return s3q0.a;
            case 3:
                ((izs) obj3).invoke(new r5s0(((u5s0.h) obj2).a, (gmq) obj));
                return s3q0.a;
            case 4:
                qis0 qis0Var = (qis0) obj3;
                Bitmap bitmap = (Bitmap) obj;
                CorrectionView correctionView = (CorrectionView) qis0Var.o.getValue();
                qis0.a aVar = qis0Var.new a();
                FilterInfo filterInfo = ((com.vk.clips.editor.state.model.c) obj2).h;
                HslView hslView = correctionView.v;
                CorrectionsView correctionsView = correctionView.u;
                FiltersView filtersView = correctionView.t;
                correctionView.P4(CorrectionView.Tab.Filters);
                correctionView.w = aVar;
                correctionView.x = filterInfo;
                Context context = correctionView.getContext();
                zrp<FilterType> h = FilterType.h();
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = h.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    qis0 qis0Var2 = qis0.this;
                    if (!hasNext) {
                        boolean z4 = z3;
                        int i5 = 10;
                        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            FilterType filterType2 = (FilterType) it2.next();
                            if (filterType2.i() == filterInfo.b) {
                                filterType = filterType2;
                                z = z4;
                            } else {
                                filterType = filterType2;
                                z = z2;
                            }
                            FiltersView filtersView2 = filtersView;
                            arrayList2.add(new tcr(filterType, bitmap, ((tfr) qis0Var2.n.getValue()).b(ris0.a(filterType), context), z, false, z ? filterInfo.c : 1.0f));
                            i5 = 10;
                            filtersView = filtersView2;
                            context = context;
                            qis0Var2 = qis0Var2;
                            z2 = false;
                        }
                        FiltersView filtersView3 = filtersView;
                        int i6 = i5;
                        filtersView3.setListener(new z77(correctionView, 2));
                        FiltersRecyclerView filtersRecyclerView = filtersView3.t;
                        filtersRecyclerView.setFiltersData(arrayList2);
                        filtersRecyclerView.h = io.reactivex.rxjava3.core.q.O(filtersRecyclerView.i.y0()).U(new nb(new lh(13, aVar, filtersRecyclerView), 17)).r0(io.reactivex.rxjava3.schedulers.a.a()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new jz(new wpg(filtersRecyclerView, 12), 19), new ir0(new qb(26), 14));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            tcr tcrVar = (tcr) it3.next();
                            if (tcrVar.d) {
                                filtersView3.P4(tcrVar);
                                zrp<CorrectionType> h2 = CorrectionType.h();
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj4 : h2) {
                                    if (!((CorrectionType) obj4).i()) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, i6));
                                Iterator it4 = arrayList3.iterator();
                                int i7 = 0;
                                while (true) {
                                    if (!it4.hasNext()) {
                                        correctionsView.setListener(new srg(correctionView, 3));
                                        correctionsView.setCorrectionItems(arrayList4);
                                        Object[] array = HslColorType.h().toArray(new HslColorType[0]);
                                        ArrayList arrayList5 = new ArrayList(array.length);
                                        int length = array.length;
                                        int i8 = 0;
                                        int i9 = 0;
                                        while (i8 < length) {
                                            int i10 = i9 + 1;
                                            HslColorType hslColorType = (HslColorType) array[i8];
                                            HslInfo hslInfo = filterInfo.e;
                                            int[] iArr = vtp0.$EnumSwitchMapping$0;
                                            switch (iArr[hslColorType.ordinal()]) {
                                                case 1:
                                                    params = hslInfo.b;
                                                    break;
                                                case 2:
                                                    params = hslInfo.c;
                                                    break;
                                                case 3:
                                                    params = hslInfo.d;
                                                    break;
                                                case 4:
                                                    params = hslInfo.e;
                                                    break;
                                                case 5:
                                                    params = hslInfo.f;
                                                    break;
                                                case 6:
                                                    params = hslInfo.g;
                                                    break;
                                                case 7:
                                                    params = hslInfo.h;
                                                    break;
                                                case 8:
                                                    params = hslInfo.i;
                                                    break;
                                                default:
                                                    throw new NoWhenBranchMatchedException();
                                            }
                                            switch (iArr[hslColorType.ordinal()]) {
                                                case 1:
                                                    i = R.color.vk_red;
                                                    break;
                                                case 2:
                                                    i = R.color.vk_orange;
                                                    break;
                                                case 3:
                                                    i = R.color.vk_yellow_sunflower;
                                                    break;
                                                case 4:
                                                    i = R.color.vk_green;
                                                    break;
                                                case 5:
                                                    i = R.color.vk_turquoise;
                                                    break;
                                                case 6:
                                                    i = R.color.vk_azure_A100;
                                                    break;
                                                case 7:
                                                    i = R.color.vk_violet;
                                                    break;
                                                case 8:
                                                    i = R.color.vk_raspberry_pink_light;
                                                    break;
                                                default:
                                                    throw new NoWhenBranchMatchedException();
                                            }
                                            arrayList5.add(new wgv(hslColorType, i, params.b, params.c, params.d, i9 == 0 ? z4 : false));
                                            i8++;
                                            i9 = i10;
                                        }
                                        hslView.setListener(new wzf(correctionView, 7));
                                        hslView.setHslItems(arrayList5);
                                        Context context2 = correctionView.getContext();
                                        ixd ixdVar = ad0.g;
                                        if (ixdVar == null) {
                                            ixdVar = null;
                                        }
                                        ixd.a aVar2 = ixdVar.b;
                                        filtersView3.setCursorScrollingColor(context2.getColor(R.color.vk_sky_300));
                                        Context context3 = correctionView.getContext();
                                        ixd ixdVar2 = ad0.g;
                                        ixd.a aVar3 = (ixdVar2 != null ? ixdVar2 : null).b;
                                        correctionsView.setCursorScrollingColor(context3.getColor(R.color.vk_sky_300));
                                        return s3q0.a;
                                    }
                                    Object next = it4.next();
                                    int i11 = i7 + 1;
                                    if (i7 < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    CorrectionType correctionType = (CorrectionType) next;
                                    arrayList4.add(new lwj(correctionType, correctionType.k(filterInfo.d), i7 == 0 ? z4 : false));
                                    i7 = i11;
                                }
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    Object next2 = it.next();
                    boolean z5 = z3;
                    if (((tfr) qis0Var2.n.getValue()).a(ris0.a((FilterType) next2), context)) {
                        arrayList.add(next2);
                    }
                    z3 = z5;
                }
            case 5:
                slw0 slw0Var = (slw0) obj3;
                imw0.a.d dVar = (imw0.a.d) obj2;
                if (dVar instanceof imw0.a.d.b) {
                    gmw0Var = gmw0.b.a;
                } else if (dVar instanceof imw0.a.d.c) {
                    gmw0Var = new gmw0.c(((imw0.a.d.c) dVar).c);
                } else {
                    if (!(dVar instanceof imw0.a.d.C3066a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gmw0Var = gmw0.a.a;
                }
                slw0Var.l.a(gmw0Var);
                return s3q0.a;
            case 6:
                ((gvw0) obj3).c = false;
                ((i97) obj2).invoke();
                return s3q0.a;
            case 7:
                JSONObject jSONObject = (JSONObject) obj;
                ((VoipReportSuspiciousCallActivity) obj3).n = true;
                ((fww0) obj2).invoke();
                return jSONObject;
            case 8:
                c2x0 c2x0Var = (c2x0) obj3;
                int i12 = c2x0.o1;
                spv0 spv0Var = new spv0(i3, c2x0Var, (ImageView) obj2);
                if (gz80.a(34)) {
                    spv0Var.invoke();
                } else {
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    Context mo2getContext = c2x0Var.mo2getContext();
                    permissionHelper.getClass();
                    permissionHelper.d(mo2getContext, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, spv0Var, new qyn0(i4));
                }
                return s3q0.a;
            default:
                iok0.y0(qfx0.d, new dda(i4, (Long) obj3, (ClipBox) obj, (String) obj2));
                return s3q0.a;
        }
    }
}
