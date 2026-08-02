package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.zone.dto.objects.BulletsOrderImage;
import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import com.yandex.go.zone.dto.objects.PopupUiControl;
import com.yandex.go.zone.dto.objects.a3;
import com.yandex.go.zone.dto.objects.e3;
import com.yandex.go.zone.dto.objects.j3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.modal.popup.ui.model.PopupDialogModalUiState$HeaderType;
import ru.yandex.taxi.styling.ButtonType;
import ru.yandex.taxi.styling.g;

/* loaded from: classes6.dex */
public final class au6 {
    public final oxu0 a;

    public au6(oxu0 oxu0Var) {
        this.a = oxu0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0111, code lost:
    
        if (r2.length() != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ce, code lost:
    
        if (r10 > 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d5, code lost:
    
        if (r1 == r2) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [i8e0] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [n8e0] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cu6 a(BulletsOrderPopup bulletsOrderPopup) {
        cu6 cu6Var;
        List list;
        j8e0 j8e0Var;
        ?? r3;
        ?? g8e0Var;
        cu6 cu6Var2;
        BulletsOrderPopup.ShowPolicy showPolicy = bulletsOrderPopup.f;
        List<PopupUiControl> list2 = bulletsOrderPopup.i;
        String str = showPolicy.a;
        String str2 = bulletsOrderPopup.a;
        String str3 = bulletsOrderPopup.b;
        BulletsOrderImage bulletsOrderImage = bulletsOrderPopup.j;
        BulletsOrderImage.Companion.getClass();
        k8e0 k8e0Var = !jl40.l(bulletsOrderImage, BulletsOrderImage.c) ? new k8e0(bulletsOrderImage.b, bulletsOrderImage.a, true) : new k8e0(bulletsOrderPopup.d, 1);
        List<BulletsOrderPopup.Description> list3 = bulletsOrderPopup.e;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        for (BulletsOrderPopup.Description description : list3) {
            arrayList.add(new f8e0(description.a, description.b, description.c));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            f8e0 f8e0Var = (f8e0) next;
            String str4 = f8e0Var.a;
            if (str4 != null && str4.length() != 0 && f8e0Var.b.d()) {
                arrayList2.add(next);
            }
        }
        int i = showPolicy.b;
        int i2 = showPolicy.d;
        if (list2.isEmpty()) {
            PopupUiControl popupUiControl = bulletsOrderPopup.h;
            String str5 = bulletsOrderPopup.c;
            int i3 = zt6.b[popupUiControl.c.ordinal()];
            if (i3 == 1) {
                cu6Var = null;
                String str6 = popupUiControl.a;
                if (str6.length() != 0) {
                    str5 = str6;
                }
                g8e0Var = new g8e0(str5, popupUiControl.b);
            } else {
                if (i3 != 2) {
                    w511.b();
                    return null;
                }
                j37 a = ((g) this.a).a().a.a(ButtonType.DEFAULT);
                cu6Var = null;
                j37 j37Var = new j37(new bdc(xng0.controlMain), new bdc(xng0.textOnControl), AppColor$Palette.Control, AppColor$Palette.TextOnControl);
                if (a == null) {
                    a = j37Var;
                }
                g8e0Var = new h8e0(popupUiControl.a, popupUiControl.b, e3.INSTANCE, a.a, a.b);
            }
            String title = g8e0Var.getTitle();
            if (title != null) {
                cu6Var2 = g8e0Var;
            }
            cu6Var2 = cu6Var;
            list = cu6Var2 != null ? Collections.singletonList(cu6Var2) : EmptyList.a;
        } else {
            cu6Var = null;
            ArrayList arrayList3 = new ArrayList();
            for (PopupUiControl popupUiControl2 : list2) {
                a3 a3Var = popupUiControl2.d;
                String str7 = "none";
                if (!jl40.l(a3Var, e3.INSTANCE)) {
                    if (a3Var instanceof PopupUiControl.Deeplink) {
                        str7 = "deeplink_opened";
                    } else if (a3Var instanceof PopupUiControl.OpenSummaryAddress) {
                        str7 = "summary_address_opened";
                    } else if (jl40.l(a3Var, j3.INSTANCE)) {
                        str7 = "tariff_card_opened";
                    } else if (!(a3Var instanceof PopupUiControl.CancelOrders)) {
                        w511.b();
                        return null;
                    }
                }
                String str8 = popupUiControl2.a;
                g8e0 g8e0Var2 = new g8e0(str8, popupUiControl2.b, str7, popupUiControl2.d);
                if (str8 == null || str8.length() == 0) {
                    g8e0Var2 = null;
                }
                if (g8e0Var2 != null) {
                    arrayList3.add(g8e0Var2);
                }
            }
            list = arrayList3;
        }
        int i4 = zt6.a[bulletsOrderPopup.k.a.ordinal()];
        if (i4 == 1) {
            j8e0Var = new j8e0(PopupDialogModalUiState$HeaderType.DEFAULT, 2);
        } else {
            if (i4 != 2) {
                w511.b();
                return cu6Var;
            }
            j8e0Var = new j8e0(PopupDialogModalUiState$HeaderType.PROMINENT, 2);
        }
        n8e0 n8e0Var = new n8e0(str, str2, null, str3, k8e0Var, arrayList2, i, i2, list, j8e0Var);
        BulletsOrderPopup.ShowPolicy showPolicy2 = BulletsOrderPopup.ShowPolicy.e;
        if (str2 != null && str2.length() != 0 && !list.isEmpty()) {
            if (str != null) {
                r3 = n8e0Var;
                if (str.length() != 0) {
                }
            }
            BulletsOrderPopup.ShowPolicy.Companion.getClass();
            r3 = n8e0Var;
        }
        r3 = cu6Var;
        if (r3 == 0) {
            return cu6Var;
        }
        BulletsOrderPopup.ShowPolicy showPolicy3 = bulletsOrderPopup.f;
        boolean z = showPolicy3.c;
        BulletsOrderPopup.ShowPolicy.Companion.getClass();
        return new cu6(r3, z, showPolicy3 == showPolicy2);
    }
}
