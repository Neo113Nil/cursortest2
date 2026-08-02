package xsna;

import com.vk.dto.newsfeed.entries.Post;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: SortPostsByDateAscEditorAction.kt */
/* loaded from: classes4.dex */
public final class ffk0 implements qn60.b {
    public final pn60 a;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((Post) t).r), Integer.valueOf(((Post) t2).r));
        }
    }

    /* compiled from: SortPostsByDateAscEditorAction.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public ffk0(pn60 pn60Var) {
        this.a = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        LinkedHashSet c = aVar.a.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : c) {
            if (obj instanceof Post) {
                arrayList.add(obj);
            }
        }
        List D0 = j5g.D0(new a(), arrayList);
        aVar.a();
        aVar.f(D0, new b(1, this.a, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
