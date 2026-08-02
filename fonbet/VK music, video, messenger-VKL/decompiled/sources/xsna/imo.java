package xsna;

import com.vk.dto.photo.Photo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.c5f0;
import xsna.qn60;

/* compiled from: DropReactionsFeedPhotoRestrictionEditorAction.kt */
/* loaded from: classes4.dex */
public final class imo implements qn60.b {
    public final Photo a;
    public final pn60 b;

    /* compiled from: DropReactionsFeedPhotoRestrictionEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public imo(Photo photo, pn60 pn60Var) {
        this.a = photo;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        Object obj;
        c5f0 c5f0Var = (c5f0) aVar.d(fpf0.a(c5f0.class));
        if (c5f0Var == null) {
            return;
        }
        List<c5f0.a> list = c5f0Var.a;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((c5f0.a) obj).a.equals(this.a)) {
                    break;
                }
            }
        }
        c5f0.a aVar2 = (c5f0.a) obj;
        if (aVar2 == null) {
            return;
        }
        aVar2.a.L = null;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            Photo photo = ((c5f0.a) it2.next()).a;
            arrayList.add(new c5f0.a(photo, photo.L));
        }
        aVar.k(c5f0Var, new c5f0(arrayList), new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
