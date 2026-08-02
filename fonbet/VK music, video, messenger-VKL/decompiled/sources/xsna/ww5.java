package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.dto.common.VideoFile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ww5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ww5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.c;
                mtk0 mtk0Var = (mtk0) this.d;
                mtk0 mtk0Var2 = (mtk0) this.e;
                mtk0 mtk0Var3 = (mtk0) this.f;
                mtk0 mtk0Var4 = (mtk0) this.g;
                oio oioVar = (oio) obj;
                wh50Var.setValue(new mxj0(oioVar.d()));
                oio.x1(oioVar, (yk8) mtk0Var.getValue(), 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                oio.x1(oioVar, (yk8) mtk0Var2.getValue(), 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                oio.x1(oioVar, (yk8) mtk0Var3.getValue(), 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                oio.x1(oioVar, (yk8) mtk0Var4.getValue(), 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                break;
            default:
                Date date = (Date) this.c;
                c1p c1pVar = (c1p) this.d;
                VideoFile videoFile = (VideoFile) this.e;
                nkd nkdVar = (nkd) this.f;
                ikd ikdVar = (ikd) this.g;
                Date date2 = (Date) obj;
                if (date2 != null) {
                    date = date2;
                }
                mkd mkdVar = c1pVar.b;
                int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(date.getTime());
                com.vk.movika.sdk.base.ui.g0 g0Var = new com.vk.movika.sdk.base.ui.g0(11);
                mkdVar.getClass();
                mkd.a(videoFile, seconds, g0Var);
                if (nkdVar != null) {
                    nkdVar.a(ClipsBottomSheetSideEffectOptions.EDIT_PUBLICATION_DATE_ON_CHANGE, ikdVar.a);
                }
                break;
        }
        return s3q0.a;
    }
}
