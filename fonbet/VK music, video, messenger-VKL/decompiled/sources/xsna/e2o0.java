package xsna;

import android.graphics.Color;
import com.vk.dialogtags.impl.list.TagsListState;
import com.vk.im.engine.models.dialogs.DialogTag;
import java.util.ArrayList;
import java.util.List;
import xsna.j2o0;

/* compiled from: TagsListStateMapper.kt */
/* loaded from: classes18.dex */
public final class e2o0 implements izs<TagsListState, j2o0> {
    @Override // xsna.izs
    public final j2o0 invoke(TagsListState tagsListState) {
        TagsListState tagsListState2 = tagsListState;
        List<DialogTag> list = tagsListState2.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (DialogTag dialogTag : list) {
            int i = dialogTag.b;
            String str = dialogTag.c;
            String str2 = dialogTag.d;
            if (!brm0.B(str2, "#", false)) {
                str2 = "#".concat(str2);
            }
            arrayList.add(new j2o0.a(f870.c(Color.parseColor(str2)), i, str, tagsListState2.c.contains(Integer.valueOf(dialogTag.b))));
        }
        return new j2o0(arrayList);
    }
}
