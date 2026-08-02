package xsna;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: AppendTagsConfirmationEditorAction.kt */
/* loaded from: classes4.dex */
public final class wc3 implements qn60.b {
    public final NewsEntry a;
    public final int b;
    public final UserProfile c;
    public final pn60 d;
    public final Lazy e;

    /* compiled from: AppendTagsConfirmationEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    /* compiled from: AppendTagsConfirmationEditorAction.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    /* compiled from: AppendTagsConfirmationEditorAction.kt */
    public static final /* synthetic */ class c extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public wc3(NewsEntry newsEntry, int i, UserProfile userProfile, pn60 pn60Var, Lazy<? extends AuthBridgeComponent> lazy) {
        this.a = newsEntry;
        this.b = i;
        this.c = userProfile;
        this.d = pn60Var;
        this.e = lazy;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        Photos photos;
        PhotoAttachment Mb;
        NewsEntry newsEntry = this.a;
        if ((newsEntry instanceof Photos) && (Mb = (photos = (Photos) newsEntry).Mb()) != null) {
            List<PhotoTag> list = Mb.l.b;
            pn60 pn60Var = this.d;
            int i = this.b;
            if (i != 0) {
                if (photos.q.isEmpty()) {
                    return;
                }
                aVar.e(new rba0(photos, Mb, i, this.c), new a(1, pn60Var, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
                return;
            }
            if (list.isEmpty()) {
                return;
            }
            PhotoTag photoTag = (PhotoTag) j5g.a0(list);
            if (list.size() == 1) {
                if (epx.f(photoTag != null ? photoTag.c : null, ((AuthBridgeComponent) this.e.getValue()).s().c())) {
                    aVar.e(new zba0(photos, photoTag), new b(1, pn60Var, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
                    return;
                }
            }
            List<PhotoTag> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (!((PhotoTag) it.next()).l) {
                    aVar.e(new g9a0(photos), new c(1, pn60Var, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
                    return;
                }
            }
        }
    }
}
