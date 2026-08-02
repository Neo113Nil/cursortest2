package xsna;

/* compiled from: ClipsUploadScreenComposeWrapperImpl.kt */
/* loaded from: classes17.dex */
public final class dhf implements ahf {
    public final aif b;

    public dhf(aif aifVar) {
        this.b = aifVar;
    }

    @Override // xsna.ahf
    public final void a(whf whfVar, final boolean z, final egf egfVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final whf whfVar2;
        androidx.compose.runtime.a M = aVar.M(639481379);
        int i2 = i | (M.l(z) ? 32 : 16) | (M.J(egfVar) ? 256 : 128) | (M.J(this) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(639481379, i2, -1, "com.vk.clips.upload.ui.impl.compose.ClipsUploadScreenComposeWrapperImpl.Content (ClipsUploadScreenComposeWrapperImpl.kt:36)");
            }
            whfVar2 = whfVar;
            rrv0.e(z, null, null, null, null, null, kai.c(-250535418, new wzs() { // from class: xsna.bhf
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-250535418, intValue, -1, "com.vk.clips.upload.ui.impl.compose.ClipsUploadScreenComposeWrapperImpl.Content.<anonymous> (ClipsUploadScreenComposeWrapperImpl.kt:43)");
                        }
                        okf.a(egf.this, kai.c(1103163443, new l8c(this, q630Var, whfVar2), aVar2), aVar2, 48);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 3) & 14) | 1572864, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            whfVar2 = whfVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final whf whfVar3 = whfVar2;
            s.d = new wzs(whfVar3, z, egfVar, q630Var, i) { // from class: xsna.chf
                public final /* synthetic */ whf c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ egf e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3079);
                    dhf.this.a(this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
