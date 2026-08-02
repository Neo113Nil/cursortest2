package xsna;

import com.vk.superapp.api.dto.story.WebStickerType;
import com.vungle.ads.internal.protos.Sdk;
import xsna.c0e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b0e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ b0e(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new c0e.a(WebStickerType.GIF, null, null, null, ((pvf) obj).y(), null, this.c, 238);
            case 1:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            default:
                mol0 mol0Var = (mol0) obj;
                return mol0.a(mol0Var, null, null, null, null, ggr.a(mol0Var.g, false, null, this.c, 63), null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
        }
    }
}
