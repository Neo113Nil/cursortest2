package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.dto.common.ClipVideoFile;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.lrq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class sa5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sa5(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                xa5.h((mc90) this.c, (bc90) this.d, (ka5) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                n0i n0iVar = (n0i) this.c;
                Activity activity = (Activity) this.d;
                ClipVideoFile clipVideoFile = (ClipVideoFile) this.e;
                ((ClipEditComponent) n0iVar.c.getValue()).d6().j(bwt0.u(activity), (View) obj, clipVideoFile, new m0i(clipVideoFile, (izs) obj2, n0iVar, 0));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((lxl) this.c).h((kyl) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                mf70 mf70Var = (mf70) this.c;
                izs<? super le70, s3q0> izsVar = (izs) this.d;
                mtk0 mtk0Var = (mtk0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-334387783, intValue, -1, "com.vk.settings.impl.presentation.base.mvi.setting.NotificationSettingView.ThemedContent.<anonymous> (NotificationSettingView.kt:59)");
                    }
                    mf70Var.h((hf70) mtk0Var.getValue(), izsVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                lrq0.b bVar = (lrq0.b) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(149721593, intValue2, -1, "com.vk.profile.user.impl.dialogs.lego.contextmenu.viewer.UserProfileLegoViewerModalMenu.show.<anonymous>.<anonymous> (UserProfileLegoViewerModalMenu.kt:52)");
                    }
                    lrq0.a.g(bVar, new qvm0(ref$ObjectRef, ref$ObjectRef2, (sp) null), aVar2, 384);
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

    public /* synthetic */ sa5(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ sa5(lrq0.b bVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, sp spVar) {
        this.b = 4;
        this.c = bVar;
        this.d = ref$ObjectRef;
        this.e = ref$ObjectRef2;
    }
}
