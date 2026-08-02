package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.ecomm.design.compose.imagegallery.model.ImageGalleryCellItemPlaceholderType;
import com.vk.ecomm.design.compose.imagegallery.model.ImageGalleryItem;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class a6v implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a6v(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        androidx.compose.runtime.a aVar;
        int i2 = this.b;
        q630.a aVar2 = q630.a.a;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i2) {
            case 0:
                i6v i6vVar = (i6v) obj6;
                Cell$Middle.Size size = (Cell$Middle.Size) obj5;
                izs izsVar = (izs) obj;
                ((Boolean) obj2).getClass();
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar3.y(izsVar) ? 4 : 2;
                }
                int i3 = intValue;
                if (aVar3.t(i3 & 1, (i3 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-567835224, i3, -1, "com.vk.profile.community.creationonboarding.impl.tasks.presentation.compose.HighlightedTitle.Content.<anonymous> (CreationOnBoardingTasksScreen.kt:340)");
                    }
                    v5v v5vVar = i6vVar.b;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) aVar3.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean z = !ylu0Var.s();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar3.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var2.l().F0;
                    bpn0 bpn0Var = v5v.c;
                    Cell$Middle.d.b.b(d8v0.c(v5vVar, true, z, j, aVar3, 48), null, null, null, 0, 0, null, null, izsVar, aVar3, (i3 << 27) & 1879048192, 6, 510).c(aVar2, size, aVar3, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            default:
                List list = (List) obj6;
                izs izsVar2 = (izs) obj5;
                ksy ksyVar = (ksy) obj;
                int intValue2 = ((Integer) obj2).intValue();
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    i = (aVar4.J(ksyVar) ? 4 : 2) | intValue3;
                } else {
                    i = intValue3;
                }
                int i4 = intValue3 & 48;
                int i5 = 16;
                if (i4 == 0) {
                    i |= aVar4.o(intValue2) ? 32 : 16;
                }
                if (aVar4.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(645305279, i, -1, "com.vk.ecomm.design.compose.imagegallery.ImageGalleryEditModeCell.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ImageGalleryEditModeCell.kt:80)");
                    }
                    ImageGalleryItem imageGalleryItem = (ImageGalleryItem) list.get(intValue2);
                    q630 c = ksy.c(ksyVar, aVar2, 7);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar4));
                    sy90 D = aVar4.D();
                    q630 c2 = qri.c(aVar4, c);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar5);
                    } else {
                        aVar4.f();
                    }
                    k9q0.w(aVar4, d, cri.a.f);
                    k9q0.w(aVar4, D, cri.a.e);
                    k9q0.w(aVar4, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar4, cri.a.h);
                    k9q0.w(aVar4, c2, cri.a.d);
                    boolean z2 = imageGalleryItem instanceof ImageGalleryItem.ImageGalleryImageItem;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (z2) {
                        aVar4.K(371596570);
                        ImageGalleryItem.ImageGalleryImageItem imageGalleryImageItem = (ImageGalleryItem.ImageGalleryImageItem) imageGalleryItem;
                        int i6 = imageGalleryImageItem.b;
                        String str = imageGalleryImageItem.d;
                        ImageGalleryCellItemPlaceholderType imageGalleryCellItemPlaceholderType = imageGalleryImageItem.c;
                        boolean z3 = imageGalleryCellItemPlaceholderType == ImageGalleryCellItemPlaceholderType.RELOAD;
                        boolean z4 = imageGalleryCellItemPlaceholderType == ImageGalleryCellItemPlaceholderType.PROGRESS;
                        q630 E = ahn.E(aVar2, "loadedImage" + intValue2);
                        boolean J = aVar4.J(izsVar2) | aVar4.J(imageGalleryItem);
                        Object x = aVar4.x();
                        if (J || x == c0012a) {
                            x = new cq3(14, izsVar2, (ImageGalleryItem.ImageGalleryImageItem) imageGalleryItem);
                            aVar4.R(x);
                        }
                        izs izsVar3 = (izs) x;
                        boolean J2 = aVar4.J(izsVar2) | aVar4.J(imageGalleryItem);
                        Object x2 = aVar4.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new qd1(i5, izsVar2, (ImageGalleryItem.ImageGalleryImageItem) imageGalleryItem);
                            aVar4.R(x2);
                        }
                        ijw.c(i6, str, z3, z4, E, izsVar3, (izs) x2, aVar4, 0);
                        aVar = aVar4;
                        aVar.j();
                    } else {
                        aVar = aVar4;
                        aVar.K(372380312);
                        q630 E2 = ahn.E(aVar2, "imageGalleryPlaceholder");
                        boolean J3 = aVar.J(izsVar2);
                        Object x3 = aVar.x();
                        if (J3 || x3 == c0012a) {
                            x3 = new qq5(izsVar2, 5);
                            aVar.R(x3);
                        }
                        ijw.a(0, aVar, (gzs) x3, E2);
                        aVar.j();
                    }
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
        }
    }
}
