package xsna;

import com.vk.api.generated.likes.dto.LikesItemReactionDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.likes.dto.LikesReactionAssetDto;
import com.vk.api.generated.likes.dto.LikesReactionColorDto;
import com.vk.api.generated.likes.dto.LikesReactionImageMetaDto;
import com.vk.api.generated.likes.dto.LikesReactionMetaDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import com.vk.api.generated.likes.dto.LikesReactionThemeColorDto;
import com.vk.api.generated.likes.dto.LikesReactionTitleDto;
import com.vk.api.generated.wall.dto.WallGetByIdResponseDto;
import com.vk.api.generated.wall.dto.WallGetCommentResponseDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import com.vk.api.generated.wall.dto.WallWallItemDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ThemedColor;
import com.vk.dto.common.data.VKList;
import com.vk.dto.reactions.ItemReaction;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionAsset;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.reactions.SimpleReactionMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.rtt;

/* compiled from: GetReactedUserResponseMapper.kt */
/* loaded from: classes15.dex */
public final class stt {
    public static final stt a = new stt();

    public static VKList a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("reaction_set");
        ReactionSet d = optJSONObject != null ? h1f0.d(optJSONObject) : null;
        return d != null ? h1f0.c(jSONObject.getJSONObject("response"), d) : h1f0.b(jSONObject.getJSONObject("response"));
    }

    public static ItemReactions b(LikesItemReactionsDto likesItemReactionsDto, ReactionSet reactionSet) {
        ReactionMeta d;
        TreeSet treeSet = new TreeSet(ItemReactions.j);
        int i = 0;
        for (LikesItemReactionDto likesItemReactionDto : likesItemReactionsDto.d()) {
            a.getClass();
            ItemReaction itemReaction = new ItemReaction(likesItemReactionDto.getId(), likesItemReactionDto.getCount());
            treeSet.add(itemReaction);
            i += itemReaction.c * ((reactionSet == null || (d = c2f0.d(reactionSet, itemReaction.b)) == null) ? 1 : d.f());
        }
        return new ItemReactions(p4g.q(treeSet), likesItemReactionsDto.getCount(), i, likesItemReactionsDto.e());
    }

    public static ReactionSet c(LikesReactionSetDto likesReactionSetDto) {
        ArrayList arrayList;
        LikesReactionColorDto d;
        LikesReactionThemeColorDto d2;
        LikesReactionColorDto d3;
        LikesReactionThemeColorDto e;
        String id = likesReactionSetDto.getId();
        List<LikesReactionMetaDto> d4 = likesReactionSetDto.d();
        ArrayList arrayList2 = new ArrayList(c5g.u(d4, 10));
        for (LikesReactionMetaDto likesReactionMetaDto : d4) {
            int id2 = likesReactionMetaDto.getId();
            String title = likesReactionMetaDto.getTitle();
            LikesReactionAssetDto d5 = likesReactionMetaDto.d();
            String d6 = d5.d();
            if (d6 == null) {
                d6 = "";
            }
            List<LikesReactionImageMetaDto> e2 = d5.e();
            ThemedColor themedColor = null;
            if (e2 != null) {
                List<LikesReactionImageMetaDto> list = e2;
                arrayList = new ArrayList(c5g.u(list, 10));
                for (LikesReactionImageMetaDto likesReactionImageMetaDto : list) {
                    arrayList.add(new ImageSize(likesReactionImageMetaDto.getUrl(), likesReactionImageMetaDto.getWidth(), likesReactionImageMetaDto.getHeight(), null, (char) 0, false, 56, null));
                }
            } else {
                arrayList = null;
            }
            Image image = new Image(arrayList);
            LikesReactionTitleDto f = d5.f();
            ThemedColor g = (f == null || (d3 = f.d()) == null || (e = d3.e()) == null) ? null : g(e);
            LikesReactionTitleDto f2 = d5.f();
            if (f2 != null && (d = f2.d()) != null && (d2 = d.d()) != null) {
                themedColor = g(d2);
            }
            ReactionAsset reactionAsset = new ReactionAsset(d6, image, g, themedColor);
            Integer e3 = likesReactionMetaDto.e();
            arrayList2.add(new SimpleReactionMeta(id2, title, reactionAsset, e3 != null ? e3.intValue() : 1));
        }
        return new ReactionSet(id, p4g.q(arrayList2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rtt.a d(bv6 bv6Var, int i) {
        VKList vKList = (VKList) bv6Var.a;
        return new rtt.a(vKList == null ? new VKList() : vKList, i, vKList != null ? vKList.i() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair e(bv6 bv6Var) {
        ItemReactions itemReactions;
        List<WallWallCommentDto> d;
        WallWallCommentDto wallWallCommentDto;
        LikesItemReactionsDto o;
        List<LikesReactionSetDto> e;
        LikesReactionSetDto likesReactionSetDto;
        WallGetCommentResponseDto wallGetCommentResponseDto = (WallGetCommentResponseDto) bv6Var.a;
        ReactionSet c = (wallGetCommentResponseDto == null || (e = wallGetCommentResponseDto.e()) == null || (likesReactionSetDto = (LikesReactionSetDto) j5g.a0(e)) == null) ? null : c(likesReactionSetDto);
        if (wallGetCommentResponseDto == null || (d = wallGetCommentResponseDto.d()) == null || (wallWallCommentDto = (WallWallCommentDto) j5g.a0(d)) == null || (o = wallWallCommentDto.o()) == null) {
            itemReactions = null;
        } else {
            a.getClass();
            itemReactions = b(o, c);
        }
        if (c == null || itemReactions == null) {
            return null;
        }
        return new Pair(c, itemReactions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair f(bv6 bv6Var) {
        ItemReactions itemReactions;
        LikesItemReactionsDto t1;
        List<WallWallItemDto> e;
        List<LikesReactionSetDto> f;
        LikesReactionSetDto likesReactionSetDto;
        WallGetByIdResponseDto wallGetByIdResponseDto = (WallGetByIdResponseDto) bv6Var.a;
        ReactionSet c = (wallGetByIdResponseDto == null || (f = wallGetByIdResponseDto.f()) == null || (likesReactionSetDto = (LikesReactionSetDto) j5g.a0(f)) == null) ? null : c(likesReactionSetDto);
        WallWallItemDto wallWallItemDto = (wallGetByIdResponseDto == null || (e = wallGetByIdResponseDto.e()) == null) ? null : (WallWallItemDto) j5g.a0(e);
        WallWallItemDto.WallWallpostFullDto wallWallpostFullDto = wallWallItemDto instanceof WallWallItemDto.WallWallpostFullDto ? (WallWallItemDto.WallWallpostFullDto) wallWallItemDto : null;
        if (wallWallpostFullDto == null || (t1 = wallWallpostFullDto.t1()) == null) {
            itemReactions = null;
        } else {
            a.getClass();
            itemReactions = b(t1, c);
        }
        if (c == null || itemReactions == null) {
            return null;
        }
        return new Pair(c, itemReactions);
    }

    public static ThemedColor g(LikesReactionThemeColorDto likesReactionThemeColorDto) {
        String e = likesReactionThemeColorDto.e();
        Integer a2 = e != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", e) : null;
        String d = likesReactionThemeColorDto.d();
        return new ThemedColor(a2, d != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", d) : null);
    }
}
