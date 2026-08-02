package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.kyc.internal.screens.photo.KycStatus;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.KycOnlinePhotoLandscapeConfig;
import com.ybsdk.rconfig.model.ThemedImage;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.c;
import com.ybsdk.widgets.common.d;
import com.ybsdk.widgets.common.e;

/* loaded from: classes3.dex */
public final class mpx implements ev31 {
    public final opx a;

    public mpx(opx opxVar) {
        this.a = opxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [rbv] */
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        kao kaoVar;
        e eVar;
        c cVar;
        ?? r10;
        onx onxVar = (onx) obj;
        int i = onxVar.g;
        spx spxVar = onxVar.e;
        Uri uri = onxVar.c;
        jnx jnxVar = onxVar.a;
        if (jnxVar instanceof inx) {
            kaoVar = r501.a(((inx) jnxVar).a, unr0.h(Text.Companion, dzh0.ybsdk_kyc_photo_uploading_error_title), new Text.Resource(dzh0.ybsdk_kyc_photo_uploading_error_subtitle), new Text.Resource(dzh0.ybsdk_card_landing_try_again), null, null, null, null, null, null, null, null, null, 65506);
        } else if (jnxVar instanceof hnx) {
            kaoVar = r501.a(((hnx) jnxVar).a, unr0.h(Text.Companion, dzh0.ybsdk_kyc_camera_init_error_title), new Text.Resource(dzh0.ybsdk_kyc_camera_init_error_subtitle), new Text.Resource(dzh0.ybsdk_card_landing_ok), null, null, null, null, null, null, null, null, null, 65506);
        } else {
            if (jnxVar != null) {
                w511.b();
                return null;
            }
            kaoVar = null;
        }
        kpx kpxVar = kaoVar != null ? new kpx(kaoVar) : null;
        if (kpxVar != null) {
            return kpxVar;
        }
        boolean z = onxVar.h;
        opx opxVar = this.a;
        if (z) {
            KycStatus kycStatus = onxVar.b;
            if (kycStatus == KycStatus.UPLOAD_IN_PROGRESS) {
                eVar = new d(unr0.h(Text.Companion, dzh0.ybsdk_kyc_photo_uploading), (Text) null, 6);
            } else if (kycStatus == KycStatus.UPLOAD_IN_PROGRESS_TOO_LONG) {
                eVar = new d(unr0.h(Text.Companion, dzh0.ybsdk_kyc_photo_uploading), new Text.Resource(dzh0.ybsdk_kyc_photo_uploading_takes_longer), 4);
            } else {
                if (kycStatus == KycStatus.LOCATION_DEMAND) {
                    Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_kyc_location_demand_title);
                    Text.Resource resource = new Text.Resource(dzh0.ybsdk_kyc_location_demand_subtitle);
                    ThemedImage mandatoryGeoExplanation = ((if8) opxVar).a.f().getMandatoryGeoExplanation();
                    rbv h2 = mandatoryGeoExplanation != null ? if8.h(mandatoryGeoExplanation) : null;
                    cVar = new c(h, resource, h2 != null ? new bks(h2, null, 6) : null, new Text.Resource(dzh0.ybsdk_kyc_location_demand_button));
                } else if (kycStatus == KycStatus.LOCATION_DEADEND) {
                    Text.Resource h3 = unr0.h(Text.Companion, dzh0.ybsdk_kyc_location_deadend_title);
                    Text.Resource resource2 = new Text.Resource(dzh0.ybsdk_kyc_location_deadend_subtitle);
                    ThemedImage mandatoryGeoDeadend = ((if8) opxVar).a.f().getMandatoryGeoDeadend();
                    rbv h4 = mandatoryGeoDeadend != null ? if8.h(mandatoryGeoDeadend) : null;
                    cVar = new c(h3, resource2, h4 != null ? new bks(h4, null, 6) : null, new Text.Resource(dzh0.ybsdk_kyc_location_deadend_button));
                } else {
                    eVar = null;
                }
                eVar = cVar;
            }
        } else {
            Text.Resource h5 = unr0.h(Text.Companion, dzh0.ybsdk_transfer_permission_access_required_title);
            Text.Resource resource3 = new Text.Resource(dzh0.ybsdk_kyc_permission_description_subtitle);
            int r = kp50.r(80);
            nbv nbvVar = new nbv(nyg0.ybsdk_ic_error_icon, new qev(r, r));
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            eVar = new c(h5, resource3, new bks(nbvVar, null, 2), new Text.Resource(dzh0.ybsdk_qr_payment_open_settings_button));
        }
        if (eVar != null) {
            return new hpx(eVar);
        }
        if (uri != null && spxVar != null) {
            rpx rpxVar = spxVar.b;
            Text.Resource resource4 = rpxVar.a;
            if8 if8Var = (if8) opxVar;
            return new ipx(rpxVar.b, new pbv(String.valueOf(uri), (ccv) null, rev.d, (dcv) null, (vfv) null, 58), new YbButtonViewGroup.b(YbButtonViewGroup.Orientation.VERTICAL, new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_kyc_common_preview_button_ready), null, null, null, null, null, null, false, false, null, 4094), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_kyc_common_preview_button_reshoot), null, null, null, null, null, null, false, false, null, 4094), null, 8), if8Var.c() ? stz0.a(lpx.b, resource4, rpxVar.c, null, null, null, new ntz0(new ColorModel.Attr(ung0.ybColor_textIcon_primary)), false, false, new ColorModel.Attr(ung0.ybColor_textIcon_primary), new ColorModel.Attr(ung0.ybColor_textIcon_primary), 0, 31964) : stz0.a(lpx.b, resource4, rpxVar.c, null, null, null, new ntz0(new ColorModel.Attr(ung0.ybColor_textIcon_primaryStaticInverted)), false, false, null, null, 0, 32732), ((KycOnlinePhotoLandscapeConfig) if8Var.a.d(fnx.c).getData()).getChangeAnimationEnabled());
        }
        if (!onxVar.d || spxVar == null) {
            return new hpx(null);
        }
        qpx qpxVar = spxVar.a;
        nbv nbvVar2 = qpxVar.d;
        tnx tnxVar = spxVar.c;
        Text.Resource resource5 = qpxVar.b;
        if ((i == 90 || i == 270) && (r10 = qpxVar.g) != 0) {
            nbvVar2 = r10;
        }
        snx snxVar = snx.b;
        if (tnxVar.equals(snxVar)) {
            Boolean selfieFrameEnabled = ((KycOnlinePhotoLandscapeConfig) ((if8) opxVar).a.d(fnx.c).getData()).getSelfieFrameEnabled();
            if (!(selfieFrameEnabled != null ? selfieFrameEnabled.booleanValue() : true)) {
                nbvVar2 = null;
            }
        }
        tr7 tr7Var = qpxVar.e;
        stz0 a = stz0.a(lpx.b, qpxVar.a, (i == 90 || i == 270) ? null : qpxVar.c, null, new nbv(onxVar.f ? cyg0.ybsdk_ic_lightning_on : cyg0.ybsdk_ic_lightning_off, null), unr0.h(Text.Companion, dzh0.ybsdk_kyc_accessibility_flash_button), new ntz0(new ColorModel.Attr(ung0.ybColor_textIcon_primaryStaticInverted)), false, false, null, null, 0, 32708);
        int i2 = onxVar.g;
        if8 if8Var2 = (if8) opxVar;
        b bVar = if8Var2.a;
        dfr dfrVar = fnx.c;
        return new gpx(resource5, nbvVar2, tr7Var, a, i2, ((KycOnlinePhotoLandscapeConfig) bVar.d(dfrVar).getData()).getEnabled() && tnxVar.equals(snxVar), ((KycOnlinePhotoLandscapeConfig) if8Var2.a.d(dfrVar).getData()).getChangeAnimationEnabled());
    }
}
