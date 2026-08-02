package xsna;

import android.graphics.Bitmap;
import android.graphics.Point;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.vk.catalog2.feature.music.holders.view.CatalogErrorViewWithImage;
import com.vk.core.compose.component.cell.skeleton.TextType;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesContentKt;
import com.vk.stories.design.view.editor.PipetteColorPicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import xsna.h5h;
import xsna.kb70;
import xsna.loh0;
import xsna.q630;
import xsna.u5s0;
import xsna.zol0;
import xsna.zqe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class x4a implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x4a(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Object remove;
        int i = this.b;
        int i2 = 2;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                com.vk.catalog2.feature.music.holders.view.a aVar = (com.vk.catalog2.feature.music.holders.view.a) obj4;
                CatalogErrorViewWithImage catalogErrorViewWithImage = (CatalogErrorViewWithImage) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = CatalogErrorViewWithImage.j;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-133132974, intValue, -1, "com.vk.catalog2.feature.music.holders.view.CatalogErrorViewWithImage.setupErrorView.<anonymous> (CatalogErrorViewWithImage.kt:76)");
                    }
                    rrv0.d(null, null, null, null, kai.c(943970743, new ed4(i2, aVar, catalogErrorViewWithImage), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                d1h.b((loh0.c.a) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((h5h.c) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj3;
                int i4 = ((zux) obj).a;
                int i5 = ((zux) obj2).a;
                ((izs) obj4).invoke(new zqe.i.b(i4, i5));
                if (i4 != i5 && (remove = snapshotStateList.remove(i4)) != null) {
                    snapshotStateList.add(i5, remove);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                weo.a((gzs) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 5:
                kb70.d dVar = (kb70.d) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(758071477, intValue2, -1, "com.vk.notifications.design.compose.list.common.NotificationSubtitleAsTitleContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MilkshakeNotification.kt:210)");
                    }
                    un20.a(dVar, izsVar, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 6:
                c400 c400Var = (c400) obj3;
                Long l = (Long) obj;
                long longValue = l.longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                Peer b = Peer.a.b(longValue);
                Peer Q0 = ((w2w) obj4).Q0();
                Set set = (Set) obj2;
                ArrayList arrayList = new ArrayList(c5g.u(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    long longValue2 = ((Number) it.next()).longValue();
                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                    arrayList.add(Peer.a.b(longValue2));
                }
                c400Var.g.put(l, ((urb) bz2.c(new oe20(b, Q0, arrayList, false, false, null, 48), null)).a);
                break;
            case 7:
                wzs wzsVar = (wzs) obj4;
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1429068516, intValue3, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:101)");
                    }
                    rvi.a(hfj.a.b(Float.valueOf(fsk.s(6, aVar4))), kai.c(1236486620, new gd1(6, wzsVar, jaiVar), aVar4), aVar4, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 8:
                final zol0 zol0Var = (zol0) obj4;
                final izs izsVar2 = (izs) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1327190559, intValue4, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesScreen.<anonymous> (StorefrontServicesScreen.kt:83)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar5.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    int i6 = 8;
                    phv0.b(null, kai.c(-1031101464, new m9c(i6, zol0Var, izsVar2), aVar5), null, kai.c(1487790758, new cc5(i6), aVar5), null, 0, ylu0Var.getBackground().g, 0L, kai.c(897187901, new yzs() { // from class: xsna.iol0
                        @Override // xsna.yzs
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj6;
                            int intValue5 = ((Integer) obj7).intValue();
                            if (aVar6.t(intValue5 & 1, (intValue5 & 17) != 16)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(897187901, intValue5, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesScreen.<anonymous>.<anonymous> (StorefrontServicesScreen.kt:93)");
                                }
                                zol0.a aVar7 = zol0.this.c;
                                if (aVar7 instanceof zol0.a.c) {
                                    aVar6.K(-1090850019);
                                    mml0.b((zol0.a.c) aVar7, aVar6, 0);
                                    aVar6.j();
                                } else {
                                    boolean z = aVar7 instanceof zol0.a.d;
                                    izs izsVar3 = izsVar2;
                                    if (z) {
                                        aVar6.K(543493305);
                                        StorefrontServicesContentKt.a(izsVar3, (zol0.a.d) aVar7, aVar6, 0);
                                        aVar6.j();
                                    } else {
                                        boolean z2 = aVar7 instanceof zol0.a.b;
                                        q630.a aVar8 = q630.a.a;
                                        if (z2) {
                                            aVar6.K(-1090839909);
                                            knl0.a(6, aVar6, izsVar3, ahn.E(aVar8, "storefront_content_error"));
                                            aVar6.j();
                                        } else {
                                            if (!(aVar7 instanceof zol0.a.C4188a)) {
                                                throw alb0.c(-1090852031, aVar6);
                                            }
                                            aVar6.K(543933164);
                                            zol0.a.C4188a c4188a = (zol0.a.C4188a) aVar7;
                                            hol0.f(c4188a.a, ahn.E(aVar8, "storefront_content_empty"), c4188a.c, c4188a.b, null, izsVar3, aVar6, 48, 16);
                                            aVar6.j();
                                        }
                                    }
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar6.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar5), aVar5, 805309488, 373);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            case 9:
                myl0 myl0Var = (myl0) obj4;
                t2l0 t2l0Var = (t2l0) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Point point = (Point) obj2;
                myl0Var.d(bitmap, t2l0Var != null ? Integer.valueOf(t2l0Var.b) : null);
                PipetteColorPicker pipetteColorPicker = myl0Var.d;
                PipetteColorPicker pipetteColorPicker2 = pipetteColorPicker != null ? pipetteColorPicker : null;
                bwt0.p0(pipetteColorPicker2, true);
                pipetteColorPicker2.setHasDynamicBackgroundColor(true);
                pipetteColorPicker2.d(bitmap, t2l0Var, point);
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((ben0) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((fio0) obj4).a((TextType) obj3, (androidx.compose.runtime.a) obj, ne7.I(55));
                break;
            default:
                ((izs) obj4).invoke(new s5s0(((u5s0.h) obj3).a, ((Boolean) obj).booleanValue(), (gmq) obj2));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ x4a(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ x4a(zol0 zol0Var, izs izsVar, dlv0 dlv0Var) {
        this.b = 8;
        this.c = zol0Var;
        this.d = izsVar;
    }
}
