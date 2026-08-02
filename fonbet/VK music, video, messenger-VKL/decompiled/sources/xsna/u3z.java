package xsna;

import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import kotlin.collections.EmptyList;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class u3z implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ u3z(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(((us2.d) obj).d);
                break;
            case 1:
                bn40.c((Throwable) obj, new Object[0]);
                this.c.invoke(EmptyList.b);
                break;
            default:
                this.c.invoke(new AuthorHeaderEvent.Info.SubscribersClick.b((AuthorHeaderEvent.Info.SubscribersClick.FilledAudienceClickTarget) obj));
                break;
        }
        return s3q0.a;
    }
}
