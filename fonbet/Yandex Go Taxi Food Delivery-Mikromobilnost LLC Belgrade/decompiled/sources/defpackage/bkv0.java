package defpackage;

import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenFlexModalView;
import ru.yandex.taxi.widget.modalview.ModalViewCoordinator$StackChangeType;

/* loaded from: classes8.dex */
public final /* synthetic */ class bkv0 implements v030 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bkv0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.v030
    public final void a(u45 u45Var, u45 u45Var2, ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tls tlsVar = (tls) obj;
                if (modalViewCoordinator$StackChangeType == ModalViewCoordinator$StackChangeType.PUSH && u45Var2 != null) {
                    tlsVar.invoke(u45Var2.getModalScreenName());
                    break;
                }
                break;
            default:
                SuperAppMainScreenFlexModalView.addModalViewCoordinatorListener$lambda$0((SuperAppMainScreenFlexModalView) obj, u45Var, u45Var2, modalViewCoordinator$StackChangeType);
                break;
        }
    }
}
