package xsna;

import com.vk.dto.stickers.AnimatedStickerContent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class oed0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ oed0(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                if (str == null) {
                    str = "";
                }
                qgi0.r(tgi0Var, str);
                break;
            default:
                AnimatedStickerContent animatedStickerContent = new AnimatedStickerContent(str, (byte[]) obj);
                wmi0 wmi0Var = wmi0.a;
                bpn0 bpn0Var = c7r0.a;
                wmi0Var.n(c7r0.d(str), animatedStickerContent);
                break;
        }
        return s3q0.a;
    }
}
