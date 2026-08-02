package xsna;

import com.vk.video.ui.upload.impl.publish.presentation.author.feature.entity.AuthorState;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AuthorViewStateMapper.kt */
/* loaded from: classes7.dex */
public final class md5 implements izs<AuthorState, p230> {
    public static final md5 b = new md5();

    @Override // xsna.izs
    public final p230 invoke(AuthorState authorState) {
        AuthorState authorState2 = authorState;
        int i = authorState2.c;
        List<AuthorItem> list = authorState2.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            AuthorItem authorItem = (AuthorItem) obj;
            arrayList.add(new ovx(i2, authorItem.b, authorItem.c, i2 == i));
            i2 = i3;
        }
        return new p230(arrayList, authorState2.d, authorState2.e);
    }
}
