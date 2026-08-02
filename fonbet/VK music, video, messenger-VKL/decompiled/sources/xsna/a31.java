package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.ui.ad.AdvertBannerView;
import com.vk.qrcode.QRStatsTracker;
import com.vk.qrcode.QRTypes$AddressBookQRAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.e31;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a31 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a31(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Integer num;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                e31.a aVar = (e31.a) obj3;
                e31 e31Var = (e31) obj2;
                AboutVideoItem.c.a aVar2 = (AboutVideoItem.c.a) obj;
                AdvertBannerView advertBannerView = aVar.n;
                if (advertBannerView != null && !(aVar.m instanceof AboutVideoItem.c.b)) {
                    advertBannerView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    AdvertBannerView advertBannerView2 = aVar.n;
                    if (advertBannerView2 != null) {
                        ValueAnimator ofInt = ValueAnimator.ofInt(0, iah0.a(110));
                        ofInt.addListener(new c31(advertBannerView2));
                        ofInt.addUpdateListener(new b31(advertBannerView2, 0));
                        ofInt.setDuration(700L);
                        ofInt.start();
                    }
                    d3m.c(aVar.n, (r15 & 1) != 0 ? 300L : 700L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                e31Var.b.a(Collections.singletonList(aVar2.b.b.b));
                e31Var.c.g();
                break;
            case 1:
                f6s f6sVar = (f6s) obj3;
                Post post = (Post) obj2;
                new p4r();
                p4r.a(MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick.Subtype.FOOTER, f6sVar.v, post.m, Integer.valueOf(post.n));
                di60.w((Action) obj, f6sVar.itemView.getContext(), null, f6sVar.u, null, null, 58);
                break;
            case 2:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                xsw xswVar = (xsw) obj;
                int i2 = ref$IntRef.element + 1;
                ref$IntRef.element = i2;
                if (i2 == ((ArrayList) obj2).size()) {
                    xswVar.invoke();
                }
                break;
            case 3:
                new hqc0().a((Context) obj3, (gqc0) obj2, new px30((dmc0) obj, 24));
                break;
            case 4:
                Activity activity = (Activity) obj3;
                cme0 cme0Var = (cme0) obj2;
                Intent intent = new Intent("android.intent.action.INSERT");
                intent.setType("vnd.android.cursor.dir/raw_contact");
                for (QRTypes$AddressBookQRAction.a aVar3 : ((QRTypes$AddressBookQRAction.b) obj).a()) {
                    QRTypes$AddressBookQRAction.FieldType fieldType = aVar3.c;
                    String str = aVar3.b;
                    if (fieldType == QRTypes$AddressBookQRAction.FieldType.ADDRESS) {
                        if (!epx.f(str, "home")) {
                            if (epx.f(str, "work")) {
                                num = 2;
                            }
                            num = null;
                        }
                        num = 1;
                    } else {
                        if (fieldType == QRTypes$AddressBookQRAction.FieldType.PHONE) {
                            if (!epx.f(str, "home")) {
                                if (epx.f(str, "work")) {
                                    num = 3;
                                }
                            }
                            num = 1;
                        }
                        num = null;
                    }
                    fieldType.l(num);
                    intent.putExtra(fieldType.j(), aVar3.a);
                    if (fieldType.i() != null) {
                        intent.putExtra(fieldType.h(), fieldType.i().intValue());
                    }
                }
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    activity.startActivity(intent);
                }
                com.vk.qrcode.d dVar = com.vk.qrcode.d.b;
                com.vk.qrcode.d.a(cme0Var);
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.ADD_TO_CONTACTS);
                break;
            default:
                VideoItemSliderVh videoItemSliderVh = (VideoItemSliderVh) obj3;
                VideoFile videoFile = (VideoFile) obj2;
                com.vk.libvideo.design.view.overlay.b bVar = (com.vk.libvideo.design.view.overlay.b) obj;
                hdt0 hdt0Var = videoItemSliderVh.x;
                View view = videoItemSliderVh.O;
                hdt0Var.a((view != null ? view : null).getContext(), videoFile, bVar.f, null, null);
                break;
        }
        return s3q0.a;
    }
}
