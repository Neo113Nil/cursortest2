package xsna;

import com.vk.superapp.api.dto.story.WebSticker;
import com.vk.superapp.api.dto.story.WebTransform;
import xsna.szl0;

/* compiled from: StoryBoxConverter.kt */
/* loaded from: classes6.dex */
public final class tzl0 implements izs {
    public final /* synthetic */ WebSticker b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ szl0 d;

    public tzl0(WebSticker webSticker, boolean z, szl0 szl0Var) {
        this.b = webSticker;
        this.c = z;
        this.d = szl0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        nov novVar = (nov) obj;
        WebSticker webSticker = this.b;
        novVar.setRemovable(webSticker.g1() && !this.c);
        WebTransform zb = webSticker.zb();
        szl0 szl0Var = this.d;
        szl0.a.a(novVar, zb, szl0Var.a, szl0Var.b);
        return s3q0.a;
    }
}
