package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.coc;
import xsna.mat;
import xsna.z7k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d74 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ d74(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new PostingAction.Editing.EnableAuthorSign(((Boolean) obj).booleanValue()));
                break;
            case 1:
                this.c.invoke(new a.i(((Integer) obj).intValue()));
                break;
            case 2:
                this.c.invoke(new coc.d((UserId) obj));
                break;
            case 3:
                this.c.invoke(obj);
                break;
            case 4:
                this.c.invoke(new z7k.e((String) obj));
                break;
            default:
                this.c.invoke(new mat.b((uet) obj));
                break;
        }
        return s3q0.a;
    }
}
