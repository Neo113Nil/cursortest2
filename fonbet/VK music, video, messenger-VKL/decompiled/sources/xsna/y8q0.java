package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.j6c0;
import xsna.qn60;

/* compiled from: UpdatePhotoLikeCompanionEditorAction.kt */
/* loaded from: classes4.dex */
public final class y8q0 implements qn60.b {
    public final Photo a;
    public final pn60 b;

    /* compiled from: UpdatePhotoLikeCompanionEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public y8q0(Photo photo, pn60 pn60Var) {
        this.a = photo;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        Photo photo = this.a;
        HashSet c = aVar.c(new j6c0.a(photo.e, photo.C));
        if (c == null) {
            return;
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((Post) it.next()).wc(photo);
        }
        aVar.f(c, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
