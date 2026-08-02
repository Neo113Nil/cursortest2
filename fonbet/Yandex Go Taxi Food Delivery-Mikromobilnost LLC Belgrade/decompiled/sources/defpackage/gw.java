package defpackage;

import com.yandex.go.feed_video.presentation.a;
import com.yandex.go.flex.main_screen.presentation.actions.UpdateMainSidePagerStateAction;
import com.yandex.go.flex.main_screen.presentation.actions.UpdateSuperappMainSectionsStateAction;

/* loaded from: classes.dex */
public final class gw implements dw {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((dw) ((i3y) obj).getValue()).handle(krVar, n6uVar);
                break;
            case 1:
                ((a) obj).a();
                break;
            case 2:
                ((dd00) obj).a.l(((UpdateMainSidePagerStateAction) krVar).a);
                break;
            default:
                qv10.B(((UpdateSuperappMainSectionsStateAction) krVar).a, ((ucw0) obj).a, null);
                break;
        }
    }
}
