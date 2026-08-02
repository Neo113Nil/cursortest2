package defpackage;

import androidx.camera.core.ImageProcessingUtil;

/* loaded from: classes10.dex */
public final /* synthetic */ class edv implements z9s {
    public final /* synthetic */ int a;
    public final /* synthetic */ jdv b;

    public /* synthetic */ edv(jdv jdvVar, jdv jdvVar2, int i) {
        this.a = i;
        this.b = jdvVar2;
    }

    @Override // defpackage.z9s
    public final void a(aas aasVar) {
        int i = this.a;
        jdv jdvVar = this.b;
        switch (i) {
            case 0:
                int i2 = ImageProcessingUtil.a;
                jdvVar.close();
                break;
            default:
                int i3 = ImageProcessingUtil.a;
                jdvVar.close();
                break;
        }
    }
}
