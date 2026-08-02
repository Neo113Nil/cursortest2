package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.activities.LikesActivity;
import com.vk.dto.reactions.ReactionAsset;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaLikeUiComponent$Companion$Position;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: UiComponentTransformer.kt */
/* loaded from: classes4.dex */
public final class ryp0 {
    public final Object a;
    public final Object b;

    public ryp0() {
        fog0 fog0Var = new fog0(3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, fog0Var);
        this.b = msy.a(lazyThreadSafetyMode, new g13(24));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    public final ArrayList a(Map map) {
        Collection collection;
        ReactionMeta d;
        ReactionAsset d2;
        ReactionMeta d3;
        ReactionAsset d4;
        ReactionMeta d5;
        ReactionAsset d6;
        Comment comment;
        CharSequence charSequence;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Pair pair = (Pair) entry.getKey();
            Activity activity = (Activity) entry.getValue();
            long longValue = ((Number) pair.d()).longValue();
            int intValue = ((Number) pair.g()).intValue();
            if (((Boolean) this.b.getValue()).booleanValue() && (activity instanceof CommentsActivity)) {
                CommentsActivity commentsActivity = (CommentsActivity) activity;
                if (commentsActivity.h == CommentsActivity.Position.ON_CONTENT) {
                    UserId userId = new UserId(longValue);
                    ArrayList<Comment> arrayList2 = commentsActivity.d;
                    if (arrayList2 == null || (comment = (Comment) j5g.a0(arrayList2)) == null) {
                        collection = EmptyList.b;
                    } else {
                        Owner owner = commentsActivity.e.get(comment.c);
                        if (owner == null) {
                            collection = EmptyList.b;
                        } else {
                            ej90 ej90Var = comment.u;
                            if (ej90Var == null || (charSequence = ej90Var.a) == null) {
                                charSequence = "";
                            }
                            collection = Collections.singletonList(new b880(userId, intValue, charSequence, comment, owner, true));
                        }
                    }
                    arrayList.addAll(collection);
                }
            }
            if (((Boolean) this.a.getValue()).booleanValue() && (activity instanceof LikesActivity)) {
                LikesActivity likesActivity = (LikesActivity) activity;
                if (likesActivity.f == LikesActivity.Position.ON_CONTENT) {
                    UserId userId2 = new UserId(longValue);
                    ReactionSet reactionSet = likesActivity.g;
                    List<Owner> list = likesActivity.e;
                    String str = null;
                    if (list.size() == 1) {
                        OnMediaLikeUiComponent$Companion$Position onMediaLikeUiComponent$Companion$Position = OnMediaLikeUiComponent$Companion$Position.SINGLE;
                        Owner owner2 = list.get(0);
                        if (reactionSet != null && (d5 = c2f0.d(reactionSet, 0)) != null && (d6 = d5.d()) != null) {
                            str = d6.b;
                        }
                        collection = Collections.singletonList(new i880(userId2, intValue, onMediaLikeUiComponent$Companion$Position, owner2, true, str));
                    } else if (list.size() > 1) {
                        i880 i880Var = new i880(userId2, intValue, OnMediaLikeUiComponent$Companion$Position.FIRST, list.get(0), true, (reactionSet == null || (d3 = c2f0.d(reactionSet, 0)) == null || (d4 = d3.d()) == null) ? null : d4.b);
                        OnMediaLikeUiComponent$Companion$Position onMediaLikeUiComponent$Companion$Position2 = OnMediaLikeUiComponent$Companion$Position.SECOND;
                        Owner owner3 = list.get(1);
                        if (reactionSet != null && (d = c2f0.d(reactionSet, 0)) != null && (d2 = d.d()) != null) {
                            str = d2.b;
                        }
                        collection = e43.l(i880Var, new i880(userId2, intValue, onMediaLikeUiComponent$Companion$Position2, owner3, true, str));
                    } else {
                        collection = EmptyList.b;
                    }
                    arrayList.addAll(collection);
                }
            }
            collection = EmptyList.b;
            arrayList.addAll(collection);
        }
        return arrayList;
    }
}
