package defpackage;

import com.yandex.go.flex.common.api.actions.CloseFlexScreenAction;
import com.yandex.go.flex.common.api.actions.j;
import defpackage.jg9;
import defpackage.ju8;
import defpackage.l7b;
import defpackage.mu;
import defpackage.qoi0;
import defpackage.uh60;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public final class jg9 implements nu {
    public final /* synthetic */ int a;
    public final h3y b;
    public final i3y c;

    public jg9(h3y h3yVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = h3yVar;
                this.c = a.a(new sls() { // from class: com.yandex.go.morphlex.data.descriptors.actions.close_flex_screen.a
                    @Override // defpackage.sls
                    public final Object invoke() {
                        return new mu("CloseFlexScreenAction", qoi0.a(CloseFlexScreenAction.class), new CloseFlexScreenActionDescriptorFactory$descriptor$2$1(0, CloseFlexScreenAction.Companion, j.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new l7b(17, jg9.this)), EmptyList.a, false);
                    }
                });
                break;
            case 2:
                this.b = h3yVar;
                this.c = a.a(new sls() { // from class: com.yandex.go.morphlex.data.descriptors.actions.morphlex_forward.b
                    @Override // defpackage.sls
                    public final Object invoke() {
                        return new mu("OpenMorphlexScreenAction", qoi0.a(OpenMorphlexScreenAction.class), new OpenMorphlexScreenActionHandlerDescriptorFactory$descriptor$2$1(0, OpenMorphlexScreenAction.Companion, a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new uh60(7, jg9.this)), EmptyList.a, false);
                    }
                });
                break;
            default:
                this.b = h3yVar;
                this.c = a.a(new sls() { // from class: com.yandex.go.morphlex.data.descriptors.actions.change_status_bar.b
                    @Override // defpackage.sls
                    public final Object invoke() {
                        return new mu("ChangeStatusBarThemeAction", qoi0.a(ChangeStatusBarThemeAction.class), new ChangeStatusBarThemeActionDescriptorFactory$descriptor$2$1(0, ChangeStatusBarThemeAction.Companion, a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new ju8(16, jg9.this)), EmptyList.a, false);
                    }
                });
                break;
        }
    }

    @Override // defpackage.nu
    public final mu create() {
        switch (this.a) {
        }
        return (mu) this.c.getValue();
    }
}
