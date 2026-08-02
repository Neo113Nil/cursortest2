package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg4 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ gzs c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zg4(int i, gzs gzsVar, q630 q630Var, boolean z) {
        this.d = z;
        this.e = q630Var;
        this.c = gzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                ah4.a(ne7.I(49), (androidx.compose.runtime.a) obj, this.c, q630Var, this.d);
                break;
            default:
                final jgt0 jgt0Var = (jgt0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1324543369, intValue, -1, "com.vk.libvideo.bottomsheet.VideoSettingsBottomSheetRedesign.VideoSettingsScreen.<anonymous> (VideoSettingsBottomSheetRedesign.kt:114)");
                    }
                    final gzs gzsVar = this.c;
                    final boolean z = this.d;
                    b5v0.a(gzsVar, null, null, null, kai.c(922331572, new wzs() { // from class: xsna.igt0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj3, Object obj4) {
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(922331572, intValue2, -1, "com.vk.libvideo.bottomsheet.VideoSettingsBottomSheetRedesign.VideoSettingsScreen.<anonymous>.<anonymous> (VideoSettingsBottomSheetRedesign.kt:119)");
                                }
                                jgt0Var.b(z, gzsVar, aVar2, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar), null, false, false, null, aVar, 14180352, 302);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zg4(gzs gzsVar, jgt0 jgt0Var, boolean z) {
        this.c = gzsVar;
        this.e = jgt0Var;
        this.d = z;
    }
}
