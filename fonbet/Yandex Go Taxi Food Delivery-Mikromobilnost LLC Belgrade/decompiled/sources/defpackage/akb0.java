package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.c;
import com.ybsdk.widgets.common.d;

/* loaded from: classes3.dex */
public final class akb0 implements ev31 {
    public static boolean a(zib0 zib0Var) {
        yib0 yib0Var = zib0Var instanceof yib0 ? (yib0) zib0Var : null;
        if (yib0Var != null) {
            int i = zjb0.a[yib0Var.a.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3 || i == 4) {
                    return true;
                }
                w511.b();
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f1  */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        ujb0 ujb0Var;
        tjb0 tjb0Var;
        pnx pnxVar;
        Integer num;
        boolean a;
        Uri uri;
        YbButtonViewGroup.b bVar;
        Text h;
        rbv nbvVar;
        int i;
        kao a2;
        ajb0 ajb0Var = (ajb0) obj;
        sr7 sr7Var = ajb0Var.c;
        zib0 zib0Var = ajb0Var.d;
        uib0 uib0Var = ajb0Var.h;
        Text text = null;
        if (uib0Var != null) {
            if (uib0Var instanceof rib0) {
                a2 = r501.a(((rib0) uib0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 49150);
            } else if (uib0Var instanceof sib0) {
                a2 = r501.a(((sib0) uib0Var).a, unr0.h(Text.Companion, dzh0.ybsdk_kyc_camera_init_error_title), new Text.Resource(dzh0.ybsdk_kyc_camera_init_error_subtitle), new Text.Resource(dzh0.ybsdk_card_landing_ok), null, null, null, null, null, null, null, null, null, 49122);
            } else {
                if (!(uib0Var instanceof tib0)) {
                    w511.b();
                    return null;
                }
                a2 = r501.a(((tib0) uib0Var).a, unr0.h(Text.Companion, dzh0.ybsdk_common_design_default_error), null, new Text.Resource(dzh0.ybsdk_common_button_cancel), new Text.Resource(dzh0.ybsdk_common_try_again_button), null, null, null, null, null, null, null, null, 49098);
            }
            return new wjb0(a2);
        }
        int i2 = 2;
        if (!ajb0Var.g) {
            Text.Resource h2 = unr0.h(Text.Companion, dzh0.ybsdk_transfer_permission_access_required_title);
            Text.Resource resource = new Text.Resource(dzh0.ybsdk_kyc_permission_description_subtitle);
            int r = kp50.r(80);
            nbv nbvVar2 = new nbv(nyg0.ybsdk_ic_error_icon, new qev(r, r));
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            return new xjb0(new c(h2, resource, new bks(nbvVar2, null, 2), new Text.Resource(dzh0.ybsdk_qr_payment_open_settings_button)));
        }
        if (!ajb0Var.a || sr7Var == null) {
            return new xjb0(new d(unr0.h(Text.Companion, dzh0.ybsdk_kyc_photo_uploading), text, i2));
        }
        String str = sr7Var.c;
        boolean z = zib0Var instanceof vib0;
        wib0 wib0Var = wib0.a;
        if (!z) {
            ThemedParameter themedParameter = sr7Var.i;
            if (str != null && themedParameter != null) {
                if (jl40.l(zib0Var, wib0Var)) {
                    h = g8e.i(Text.Companion, str);
                } else if (zib0Var instanceof yib0) {
                    int i3 = zjb0.a[((yib0) zib0Var).a.ordinal()];
                    if (i3 == 1) {
                        h = unr0.h(Text.Companion, dzh0.ybsdk_kyc_tip_photo_check);
                    } else if (i3 == 2) {
                        h = unr0.h(Text.Companion, dzh0.ybsdk_kyc_tip_photo_check_more_time);
                    } else if (i3 == 3) {
                        h = unr0.h(Text.Companion, dzh0.ybsdk_kyc_upload_error);
                    } else {
                        if (i3 != 4) {
                            w511.b();
                            return null;
                        }
                        h = g8e.i(Text.Companion, sr7Var.d);
                    }
                } else {
                    if (z) {
                        yhl.d(zib0Var, "No tip expected for this stage ");
                        return null;
                    }
                    if (!(zib0Var instanceof xib0)) {
                        w511.b();
                        return null;
                    }
                    h = unr0.h(Text.Companion, dzh0.ybsdk_kyc_upload_error);
                }
                if (jl40.l(zib0Var, wib0Var)) {
                    nbvVar = fob1.b(themedParameter);
                } else if (zib0Var instanceof yib0) {
                    int i4 = zjb0.a[((yib0) zib0Var).a.ordinal()];
                    if (i4 == 1 || i4 == 2) {
                        nbvVar = new nbv(cyg0.ybsdk_ic_tip_progress, null);
                    } else {
                        if (i4 != 3 && i4 != 4) {
                            w511.b();
                            return null;
                        }
                        nbvVar = new nbv(cyg0.ybsdk_ic_tip_error, null);
                    }
                } else {
                    if (z) {
                        yhl.d(zib0Var, "No tip expected for this stage ");
                        return null;
                    }
                    if (!(zib0Var instanceof xib0)) {
                        w511.b();
                        return null;
                    }
                    nbvVar = new nbv(cyg0.ybsdk_ic_tip_error, null);
                }
                if (jl40.l(zib0Var, wib0Var)) {
                    i = ung0.ybColor_button_primaryStaticNormal;
                } else if (zib0Var instanceof yib0) {
                    int i5 = zjb0.a[((yib0) zib0Var).a.ordinal()];
                    if (i5 == 1 || i5 == 2) {
                        i = ung0.ybColor_button_primaryStaticNormal;
                    } else {
                        if (i5 != 3 && i5 != 4) {
                            w511.b();
                            return null;
                        }
                        i = ung0.ybColor_background_warningCamera;
                    }
                } else {
                    if (z) {
                        yhl.d(zib0Var, "No tip expected for this stage ");
                        return null;
                    }
                    if (!(zib0Var instanceof xib0)) {
                        w511.b();
                        return null;
                    }
                    i = ung0.ybColor_background_warningCamera;
                }
                ujb0Var = new ujb0(h, nbvVar, new ColorModel.Attr(i));
                if (a(zib0Var)) {
                    tjb0Var = new tjb0(zib0Var instanceof wib0, ajb0Var.b ? new nbv(cyg0.ybsdk_flash_on, null) : new nbv(cyg0.ybsdk_flash_off, null));
                } else {
                    tjb0Var = null;
                }
                pnxVar = sr7Var.a;
                if (!pnxVar.equals(qnx.b)) {
                    num = Integer.valueOf(cyg0.ybsdk_kyc_photo_frame_1);
                } else if (pnxVar.equals(snx.b)) {
                    num = Integer.valueOf(cyg0.ybsdk_kyc_photo_frame_2);
                } else {
                    pnxVar.equals(rnx.b);
                    num = null;
                }
                boolean z2 = zib0Var instanceof wib0;
                nbv nbvVar3 = (z2 || num == null) ? null : new nbv(num.intValue(), null);
                a = a(zib0Var);
                n38 n38Var = l38.a;
                if (!a && !jl40.l(zib0Var, xib0.a) && !jl40.l(zib0Var, wib0Var)) {
                    if (!(zib0Var instanceof yib0)) {
                        n38Var = m38.a;
                    } else {
                        if (!z) {
                            w511.b();
                            return null;
                        }
                        n38Var = k38.a;
                    }
                }
                n38 n38Var2 = n38Var;
                stz0 stz0Var = new stz0(g8e.i(Text.Companion, sr7Var.b), null, null, sr7Var.f == null ? new nbv(cyg0.ybsdk_ic_guide, null) : null, null, new ntz0(new ColorModel.Attr(ung0.ybColor_textIcon_primaryStaticInverted)), true, new ColorModel.Attr(ung0.ybColor_textIcon_primaryStaticInverted), null, null, null, null, 32342);
                if (!(zib0Var instanceof yib0)) {
                    uri = ((yib0) zib0Var).b;
                } else if (z2 || (zib0Var instanceof xib0)) {
                    uri = null;
                } else {
                    if (!z) {
                        w511.b();
                        return null;
                    }
                    uri = ((vib0) zib0Var).a;
                }
                pbv pbvVar = uri == null ? new pbv(uri.toString(), (ccv) null, rev.d, (dcv) null, (vfv) null, 58) : null;
                tr7 tr7Var = new tr7(sr7Var.e);
                if (a(zib0Var)) {
                    bVar = null;
                } else {
                    ColorModel colorModel = null;
                    ColorModel colorModel2 = null;
                    ColorModel colorModel3 = null;
                    boolean z3 = false;
                    bVar = new YbButtonViewGroup.b(YbButtonViewGroup.Orientation.HORIZONTAL, new YbButtonView.a(new Text.Resource(dzh0.ybsdk_kyc_button_send), null, null, null, colorModel, colorModel2, colorModel3, false, z3, null, 4094), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_kyc_button_recapture), 0 == true ? 1 : 0, 0 == true ? 1 : 0, colorModel, colorModel2, colorModel3, null, z3, false, null, 4094), null, 8);
                }
                return new vjb0(ujb0Var, tjb0Var, nbvVar3, pbvVar, stz0Var, n38Var2, tr7Var, bVar);
            }
        }
        ujb0Var = null;
        if (a(zib0Var)) {
        }
        pnxVar = sr7Var.a;
        if (!pnxVar.equals(qnx.b)) {
        }
        boolean z22 = zib0Var instanceof wib0;
        if (z22) {
        }
        a = a(zib0Var);
        n38 n38Var3 = l38.a;
        if (!a) {
            if (!(zib0Var instanceof yib0)) {
            }
        }
        n38 n38Var22 = n38Var3;
        stz0 stz0Var2 = new stz0(g8e.i(Text.Companion, sr7Var.b), null, null, sr7Var.f == null ? new nbv(cyg0.ybsdk_ic_guide, null) : null, null, new ntz0(new ColorModel.Attr(ung0.ybColor_textIcon_primaryStaticInverted)), true, new ColorModel.Attr(ung0.ybColor_textIcon_primaryStaticInverted), null, null, null, null, 32342);
        if (!(zib0Var instanceof yib0)) {
        }
        if (uri == null) {
        }
        tr7 tr7Var2 = new tr7(sr7Var.e);
        if (a(zib0Var)) {
        }
        return new vjb0(ujb0Var, tjb0Var, nbvVar3, pbvVar, stz0Var2, n38Var22, tr7Var2, bVar);
    }
}
