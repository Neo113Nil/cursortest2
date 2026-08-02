package xsna;

import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.masks.Mask;
import xsna.dug0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ti10 implements izs {
    public final /* synthetic */ MasksWrap b;
    public final /* synthetic */ Mask c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;

    public /* synthetic */ ti10(MasksWrap masksWrap, Mask mask, boolean z, boolean z2, long j, int i) {
        this.b = masksWrap;
        this.c = mask;
        this.d = z;
        this.e = z2;
        this.f = j;
        this.g = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        return MasksWrap.v(this.b, this.c, this.d, this.e, this.f, this.g, (dug0.c) obj);
    }
}
