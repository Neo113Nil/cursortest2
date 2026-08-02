package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.presentation.model.items.CoownershipStatusUiDto;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: AppendCoownersInviteBannerEditorAction.kt */
/* loaded from: classes4.dex */
public final class vc3 implements qn60.b {
    public final NewsEntry a;
    public final pn60 b;
    public final CoownershipStatusUiDto c;
    public final List<NewsfeedCoowners.CoownerRequest> d;

    /* compiled from: AppendCoownersInviteBannerEditorAction.kt */
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

    /* compiled from: AppendCoownersInviteBannerEditorAction.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public vc3(NewsEntry newsEntry, pn60 pn60Var, CoownershipStatusUiDto coownershipStatusUiDto, List<NewsfeedCoowners.CoownerRequest> list) {
        this.a = newsEntry;
        this.b = pn60Var;
        this.c = coownershipStatusUiDto;
        this.d = list;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        List<NewsfeedCoowners.CoownerRequest> list;
        NewsEntry newsEntry = this.a;
        if (!(newsEntry instanceof Post) || ((Post) newsEntry).Z1()) {
            return;
        }
        NewsfeedCoowners newsfeedCoowners = ((Post) newsEntry).f0;
        int[] iArr = a.$EnumSwitchMapping$0;
        CoownershipStatusUiDto coownershipStatusUiDto = this.c;
        int i = iArr[coownershipStatusUiDto.ordinal()];
        if (i == 1) {
            list = newsfeedCoowners != null ? newsfeedCoowners.g : null;
        } else {
            if (i != 2 && i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            list = this.d;
        }
        NewsfeedCoowners.CoownerRequest coownerRequest = list != null ? (NewsfeedCoowners.CoownerRequest) j5g.a0(list) : null;
        if (newsfeedCoowners == null || coownerRequest == null || coownershipStatusUiDto == CoownershipStatusUiDto.Closed) {
            return;
        }
        aVar.e(new zsj((Post) newsEntry, coownershipStatusUiDto, list), new b(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
