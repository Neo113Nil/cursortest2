package xsna;

import com.vk.fave.entities.FaveEntry;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: ShowFaveEmptyPlaceholderEditorAction.kt */
/* loaded from: classes4.dex */
public final class aij0 implements qn60.b {
    public final unq a;
    public final pn60 b;

    /* compiled from: ShowFaveEmptyPlaceholderEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public aij0(unq unqVar, pn60 pn60Var) {
        this.a = unqVar;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        LinkedHashSet c = aVar.a.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : c) {
            if (obj instanceof FaveEntry) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            aVar.j(fpf0.a(unq.class));
        } else {
            aVar.e(this.a, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
        }
    }
}
