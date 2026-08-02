package xsna;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoTag;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class cwa implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cwa(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) this.d;
                com.vk.channels.impl.comments.g gVar = (com.vk.channels.impl.comments.g) obj;
                bVar.m.remove(Integer.valueOf(this.c));
                return com.vk.channels.impl.comments.g.a(gVar, com.vk.channels.impl.comments.b.s(bVar, bVar.k.a(), false, 3), null, null, false, 14);
            case 1:
                UserId userId = (UserId) this.d;
                StringBuilder sb = new StringBuilder();
                sb.append(userId);
                sb.append('_');
                sb.append(this.c);
                sb.append('_');
                sb.append(((PhotoTag) obj).b);
                return sb.toString();
            default:
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                int a = e3m.a(R.dimen.video_topshelf_content_margin_bottom, ((ConstraintLayout) this.d).getContext());
                bVar2.t = 0;
                bVar2.v = 0;
                bVar2.l = 0;
                int i = this.c;
                bVar2.setMargins(i, 0, i, a);
                return s3q0.a;
        }
    }
}
