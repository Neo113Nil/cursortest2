package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class bkb0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bkb0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                dlv0 dlv0Var = (dlv0) this.c;
                f3b0 f3b0Var = (f3b0) this.d;
                izs izsVar = (izs) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1386573464, intValue, -1, "com.vk.music.stickyplayer.presentation.PodcastContent.<anonymous>.<anonymous>.<anonymous> (PodcastWithBottomPlayer.kt:239)");
                    }
                    d4b0.a(dlv0Var, f3b0Var.b().a, null, izsVar, aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                gzs gzsVar = (gzs) this.c;
                lg90 lg90Var = (lg90) this.d;
                String str = (String) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-329186314, intValue2, -1, "com.vk.core.compose.component.VkPanelHeader.<anonymous>.<anonymous> (VkTopBar.kt:341)");
                    }
                    muv0.c(512, aVar2, str, gzsVar, null, lg90Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
