package xsna;

import com.vk.libvideo.ui.VideoAuthorView;
import com.vk.photos.root.photoflow.presentation.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.b4;
import xsna.sdo;
import xsna.w4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b5(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                VideoAuthorView.Action action = (VideoAuthorView.Action) this.c;
                w4 w4Var = (w4) this.d;
                w4.b bVar = (w4.b) this.e;
                boolean z = action == VideoAuthorView.Action.Subscribe;
                w4Var.b.d(new b4.l0(z));
                jyr0.a(R.drawable.vk_icon_check_circle_outline_28, z ? R.string.video_subscribed_message : R.string.video_unsubscribed_message, bVar.itemView.getContext());
                break;
            case 1:
                izs izsVar = (izs) this.c;
                qdo qdoVar = (qdo) this.d;
                ((wh50) this.e).setValue(Boolean.FALSE);
                izsVar.invoke(new sdo.j(qdoVar.a));
                break;
            default:
                ((c8a0) this.c).f.invoke(new a.b((ArrayList) this.d, (List) this.e));
                break;
        }
        return s3q0.a;
    }
}
