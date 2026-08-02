package xsna;

import android.view.View;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.writebar.WriteBar;
import xsna.ha70;
import xsna.jse;
import xsna.vmu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lse implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ lse(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(new jse.d((tho0) obj));
                break;
            case 1:
                izsVar.invoke(vmu.a.b);
                break;
            case 2:
                izsVar.invoke(ha70.e.a);
                break;
            case 3:
                PostingAction postingAction = (PostingAction) obj;
                if (postingAction instanceof PostingAction.ShowMessage) {
                    PostingAction.ShowMessage showMessage = (PostingAction.ShowMessage) postingAction;
                    izsVar.invoke(new PostingAction.ShowMessage(showMessage.b, showMessage.c, showMessage.d, cic0.j, showMessage.f, showMessage.g, showMessage.h));
                } else {
                    izsVar.invoke(postingAction);
                }
                break;
            case 4:
                izsVar.invoke((PostingVisibilityMode) obj);
                break;
            default:
                int i2 = WriteBar.h0;
                izsVar.invoke((View) obj);
                break;
        }
        return s3q0.a;
    }
}
