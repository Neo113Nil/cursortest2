package xsna;

import com.vk.api.generated.recomSettings.dto.RecomSettingsGetAvailableRecomThemesResponseDto;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.moq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class noq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ noq0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                UserProfileDialogs userProfileDialogs = (UserProfileDialogs) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                userProfileDialogs.a.a(new UserProfileAction.m.d((moq0.c) obj));
                VkContextMenu vkContextMenu = (VkContextMenu) ref$ObjectRef.element;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                break;
            case 1:
                hyq0 hyq0Var = (hyq0) this.c;
                hyq0Var.V((RecomSettingsGetAvailableRecomThemesResponseDto) this.d, hyq0Var.f.e());
                break;
            default:
                gvw0 gvw0Var = (gvw0) this.c;
                gzs gzsVar = (gzs) this.d;
                gvw0Var.d = false;
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
        }
        return s3q0.a;
    }
}
