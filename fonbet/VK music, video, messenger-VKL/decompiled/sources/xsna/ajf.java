package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import xsna.yaf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ajf implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ajf(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                ((izs) obj2).invoke(new yaf.b.g(i2));
                return s3q0.a;
            case 1:
                ((nk40) obj2).getClass();
                return Boolean.valueOf(k5a.b((UIBlockList) obj, new jk40(i2, 0)));
            default:
                VideoRestriction videoRestriction = (VideoRestriction) obj2;
                w9y w9yVar = (w9y) obj;
                Serializer.c<VideoRestriction> cVar = VideoRestriction.CREATOR;
                w9yVar.e(videoRestriction.b, "title");
                w9yVar.e(videoRestriction.c, "text");
                w9yVar.b(Boolean.valueOf(videoRestriction.d), "blur");
                w9yVar.c(Integer.valueOf(i2), "can_play");
                w9yVar.e(videoRestriction.g.Gb(), "card_icon");
                w9yVar.e(videoRestriction.h.Gb(), "list_icon");
                RestrictionButton restrictionButton = videoRestriction.e;
                w9yVar.e(restrictionButton != null ? restrictionButton.e5() : null, "button");
                w9yVar.c(Integer.valueOf(videoRestriction.i), "disclaimer_type");
                w9yVar.e(videoRestriction.j, "mute_info_link");
                return s3q0.a;
        }
    }
}
