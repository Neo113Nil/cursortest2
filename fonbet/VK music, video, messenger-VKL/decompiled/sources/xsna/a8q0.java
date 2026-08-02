package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.newsfeed.common.presentation.model.items.CoownershipStatusUiDto;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: UpdateCoownershipBannerEditorAction.kt */
/* loaded from: classes4.dex */
public final class a8q0 implements qn60.b {
    public final Post a;
    public final List<NewsfeedCoowners.CoownerRequest> b;
    public final CoownershipStatusUiDto c;
    public final pn60 d;

    /* compiled from: UpdateCoownershipBannerEditorAction.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoownershipStatusUiDto.values().length];
            try {
                iArr[CoownershipStatusUiDto.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoownershipStatusUiDto.Approved.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoownershipStatusUiDto.Rejected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoownershipStatusUiDto.Closed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: UpdateCoownershipBannerEditorAction.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    /* compiled from: UpdateCoownershipBannerEditorAction.kt */
    public static final /* synthetic */ class c extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public a8q0(Post post, List<NewsfeedCoowners.CoownerRequest> list, CoownershipStatusUiDto coownershipStatusUiDto, pn60 pn60Var) {
        this.a = post;
        this.b = list;
        this.c = coownershipStatusUiDto;
        this.d = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        List<NewsfeedCoowners.CoownerRequest> list;
        Post post = this.a;
        NewsfeedCoowners newsfeedCoowners = post.f0;
        int[] iArr = a.$EnumSwitchMapping$0;
        CoownershipStatusUiDto coownershipStatusUiDto = this.c;
        int i = iArr[coownershipStatusUiDto.ordinal()];
        if (i == 1) {
            list = newsfeedCoowners != null ? newsfeedCoowners.g : null;
        } else {
            if (i != 2 && i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            list = this.b;
        }
        NewsfeedCoowners.CoownerRequest coownerRequest = list != null ? (NewsfeedCoowners.CoownerRequest) j5g.a0(list) : null;
        if (newsfeedCoowners == null || coownerRequest == null || coownershipStatusUiDto == CoownershipStatusUiDto.Closed) {
            aVar.j(fpf0.a(zsj.class));
            return;
        }
        zsj zsjVar = new zsj(post, coownershipStatusUiDto, list);
        zsj zsjVar2 = (zsj) aVar.d(fpf0.a(zsj.class));
        if (zsjVar2 != null) {
            aVar.k(zsjVar2, zsjVar, new b(1, this.d, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
        } else {
            aVar.g(zsjVar, new c(1, this.d, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0), new a60(1));
        }
    }
}
