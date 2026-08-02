package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.ads.EasyPromote;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import org.json.JSONObject;
import xsna.j6c0;
import xsna.qn60;

/* compiled from: UpdateEasyPromoteEditorAction.kt */
/* loaded from: classes4.dex */
public final class c8q0 implements qn60.b {
    public final JSONObject a;
    public final pn60 b;

    /* compiled from: UpdateEasyPromoteEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public c8q0(JSONObject jSONObject, pn60 pn60Var) {
        this.a = jSONObject;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        JSONObject jSONObject = this.a;
        List b0 = drm0.b0(jSONObject.optString("post_id"), new char[]{'_'}, 2, 2);
        HashSet c = aVar.c(new j6c0.a(new UserId(Long.parseLong((String) b0.get(0))), Integer.parseInt((String) b0.get(1))));
        if (c == null) {
            return;
        }
        Serializer.c<EasyPromote> cVar = EasyPromote.CREATOR;
        EasyPromote a2 = EasyPromote.a.a(jSONObject);
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((Post) it.next()).I = a2;
        }
        aVar.f(c, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
