package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.ads.AdsItemAction;
import com.vk.clips.sdk.shared.item.ads.AdsItemPatch;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.ky0;
import xsna.nz0;
import xsna.wk50;
import xsna.xw0;

/* compiled from: SubscribeActionButtonActionApplier.kt */
/* loaded from: classes17.dex */
public final class cvm0 implements oj50<nz0, AdsItemAction, AdsItemPatch> {
    public final pih0 a;
    public final f4z b;
    public final f4z c;

    public cvm0(iih0 iih0Var, f4z f4zVar, f4z f4zVar2) {
        this.a = iih0Var;
        this.b = f4zVar;
        this.c = f4zVar2;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        nz0 nz0Var = (nz0) km50Var;
        AdsItemAction adsItemAction = (AdsItemAction) kj50Var;
        if ((nz0Var instanceof nz0.a) && (adsItemAction instanceof AdsItemAction.s)) {
            AdsItemAction.s sVar = (AdsItemAction.s) adsItemAction;
            if (sVar.equals(AdsItemAction.s.b.b)) {
                UserId b = dgd.b(((nz0.a) nz0Var).b.a);
                if (b == null) {
                    return;
                }
                this.b.b(new xw0.j.a(b));
                return;
            }
            if (!sVar.equals(AdsItemAction.s.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            SdkClipVideoFile sdkClipVideoFile = ((nz0.a) nz0Var).b.a;
            UserId b2 = dgd.b(sdkClipVideoFile);
            if (b2 == null) {
                return;
            }
            this.a.ai(new mfd(sdkClipVideoFile));
            this.c.b(new ky0.e(b2));
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
