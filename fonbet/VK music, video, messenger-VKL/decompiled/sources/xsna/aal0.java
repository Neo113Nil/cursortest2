package xsna;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.stories.dto.StoriesClickableStickerDto;
import com.vk.attachpicker.stickers.photo.PhotoStickerStyle;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.actions.ActionPoll;
import com.vk.dto.stories.model.clickable.ClickableApp;
import com.vk.dto.stories.model.clickable.ClickableChannelPost;
import com.vk.dto.stories.model.clickable.ClickableClip;
import com.vk.dto.stories.model.clickable.ClickableClipStat;
import com.vk.dto.stories.model.clickable.ClickableGeo;
import com.vk.dto.stories.model.clickable.ClickableHashtag;
import com.vk.dto.stories.model.clickable.ClickableLink;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vk.dto.stories.model.clickable.ClickableMusicPlaylist;
import com.vk.dto.stories.model.clickable.ClickablePackSticker;
import com.vk.dto.stories.model.clickable.ClickablePhoto;
import com.vk.dto.stories.model.clickable.ClickablePhotoAlbum;
import com.vk.dto.stories.model.clickable.ClickablePoll;
import com.vk.dto.stories.model.clickable.ClickablePost;
import com.vk.dto.stories.model.clickable.ClickableQuestion;
import com.vk.dto.stories.model.clickable.ClickableReaction;
import com.vk.dto.stories.model.clickable.ClickableReply;
import com.vk.dto.stories.model.clickable.ClickableServiceYcItem;
import com.vk.dto.stories.model.clickable.ClickableSituationalTemplate;
import com.vk.dto.stories.model.clickable.ClickableSituationalTheme;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableVideo;
import com.vk.dto.stories.model.mention.StoryHashtagSpan;
import com.vk.dto.stories.model.mention.StoryMentionSpan;
import com.vk.stickers.api.models.hashtag.HashtagLegacyStyle;
import com.vk.stickers.api.models.market.StoryServiceItemInfo;
import com.vk.stickers.api.models.mention.MentionLegacyStyle;
import com.vk.stickers.api.models.question.StoryQuestionInfo;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebClickableZone;
import com.vk.superapp.api.dto.story.WebRenderableSticker;
import com.vk.superapp.api.dto.story.actions.StickerAction;
import com.vk.superapp.api.dto.story.actions.WebActionApp;
import com.vk.superapp.api.dto.story.actions.WebActionHashtag;
import com.vk.superapp.api.dto.story.actions.WebActionLink;
import com.vk.superapp.api.dto.story.actions.WebActionMarketItem;
import com.vk.superapp.api.dto.story.actions.WebActionMention;
import com.vk.superapp.api.dto.story.actions.WebActionPlace;
import com.vk.superapp.api.dto.story.actions.WebActionQuestion;
import com.vk.superapp.api.dto.story.actions.WebActionServiceYcItem;
import com.vk.superapp.api.dto.story.actions.WebActionSituationalTheme;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.kba0;
import xsna.q4g0;
import xsna.u7c0;

/* compiled from: StickersExt.kt */
/* loaded from: classes6.dex */
public final class aal0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0c89 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<ClickableSticker> a(nov novVar) {
        List<WebClickableZone> list;
        ArrayList arrayList;
        Object obj;
        Object clickableSituationalTheme;
        ArrayList arrayList2;
        List<? extends PointF> invoke;
        ArrayList arrayList3;
        List<? extends PointF> invoke2;
        ArrayList arrayList4;
        List<? extends PointF> invoke3;
        kba0.a aVar;
        PhotoStickerStyle photoStickerStyle;
        Object clickablePost;
        ArrayList arrayList5;
        List<? extends PointF> invoke4;
        ArrayList arrayList6;
        List<? extends PointF> invoke5;
        List<? extends PointF> invoke6;
        String lowerCase;
        String str;
        Float valueOf;
        Object obj2;
        Object clickableHashtag;
        Object clickablePost2;
        if (novVar instanceof aqx) {
            aqx aqxVar = (aqx) novVar;
            a6m0 a6m0Var = aqxVar.h;
            return Collections.singletonList(new ClickableMarketItem(0L, e43.l(new WebClickablePoint(0, 0), new WebClickablePoint(0, 0), new WebClickablePoint(0, 0), new WebClickablePoint(0, 0)), aqxVar.c.k, a6m0Var.b, a6m0Var.c, a6m0Var.d, null, null, null, null, null, null, 3265, null));
        }
        if (novVar instanceof p550) {
            p550 p550Var = (p550) novVar;
            List<PointF> clickableArea = p550Var.getClickableArea();
            ArrayList arrayList7 = new ArrayList(c5g.u(clickableArea, 10));
            Iterator<T> it = clickableArea.iterator();
            while (it.hasNext()) {
                arrayList7.add(i((PointF) it.next()));
            }
            return Collections.singletonList(new ClickableMusic(0L, arrayList7, p550Var.getCommons().o(), p550Var.getMusic(), null, 0, null, false, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, null));
        }
        if (novVar instanceof eeb0) {
            eeb0 eeb0Var = (eeb0) novVar;
            List<PointF> clickableArea2 = eeb0Var.getClickableArea();
            ArrayList arrayList8 = new ArrayList(c5g.u(clickableArea2, 10));
            Iterator<T> it2 = clickableArea2.iterator();
            while (it2.hasNext()) {
                arrayList8.add(i((PointF) it2.next()));
            }
            return Collections.singletonList(new ClickableMusicPlaylist(0L, arrayList8, eeb0Var.getCommons().o(), eeb0Var.getPlaylist(), null, 17, null));
        }
        if (novVar instanceof s690) {
            s690 s690Var = (s690) novVar;
            return Collections.singletonList(new ClickablePackSticker(0L, e(s690Var), s690Var.c.k, s690Var.l, s690Var.m, null, 33, null));
        }
        if (novVar instanceof t690) {
            t690 t690Var = (t690) novVar;
            return Collections.singletonList(new ClickablePackSticker(0L, e(t690Var), t690Var.c.k, t690Var.m, t690Var.n, null, 33, null));
        }
        if (novVar instanceof w690) {
            w690 w690Var = (w690) novVar;
            return Collections.singletonList(new ClickablePackSticker(0L, e(w690Var), w690Var.c.k, w690Var.q, w690Var.r, null, 33, null));
        }
        if (novVar instanceof o7c0) {
            o7c0 o7c0Var = (o7c0) novVar;
            u7c0 u7c0Var = o7c0Var.f;
            u7c0.b bVar = u7c0Var.i;
            u7c0.e eVar = u7c0Var.j;
            if (bVar != null) {
                ArrayList e = e(o7c0Var);
                q500 o = o7c0Var.getCommons().o();
                u7c0.b bVar2 = u7c0Var.i;
                clickablePost2 = new ClickableChannelPost(0L, e, o, bVar2 != null ? bVar2.c : UserId.d, bVar2 != null ? bVar2.b : UserId.d, bVar2 != null ? bVar2.a : 0, eVar.a.i(), null, 129, null);
            } else {
                clickablePost2 = new ClickablePost(0L, e(o7c0Var), o7c0Var.getCommons().o(), u7c0Var.a, u7c0Var.b, eVar.a.i(), 1, null);
            }
            return Collections.singletonList(clickablePost2);
        }
        if (novVar instanceof air0) {
            air0 air0Var = (air0) novVar;
            return Collections.singletonList(d(air0Var, air0Var.f));
        }
        if (novVar instanceof p8b) {
            p8b p8bVar = (p8b) novVar;
            return Collections.singletonList(d(p8bVar, p8bVar.f));
        }
        if (novVar instanceof z7c0) {
            z7c0 z7c0Var = (z7c0) novVar;
            ArrayList e2 = e(z7c0Var);
            q500 o2 = z7c0Var.getCommons().o();
            u7c0 u7c0Var2 = z7c0Var.f;
            return Collections.singletonList(new ClickablePost(0L, e2, o2, u7c0Var2.a, u7c0Var2.b, u7c0Var2.j.a.i(), 1, null));
        }
        if (novVar instanceof g4g0) {
            g4g0 g4g0Var = (g4g0) novVar;
            if (g4g0Var.getInfo().f) {
                return Collections.singletonList(new ClickableReply(0L, e(g4g0Var), g4g0Var.getCommons().o(), null, 0, g4g0Var.getInfo().c.a.j(), 25, null));
            }
        } else {
            if (novVar instanceof h4g0) {
                h4g0 h4g0Var = (h4g0) novVar;
                h4g0Var.getOverlayDelegate();
                h4g0Var.getStickerMatrix();
                h4g0Var.getCommons().getClass();
                h4g0Var.getCommons().getClass();
                throw null;
            }
            if (novVar instanceof r4g0) {
                r4g0 r4g0Var = (r4g0) novVar;
                if (r4g0Var.getInfo().f) {
                    return f(r4g0Var.getInfo(), e(r4g0Var), r4g0Var.getCommons().o());
                }
            } else {
                if (novVar instanceof u4g0) {
                    u4g0 u4g0Var = (u4g0) novVar;
                    u4g0Var.getOverlayDelegate();
                    u4g0Var.getStickerMatrix();
                    u4g0Var.getCommons().getClass();
                    u4g0Var.getCommons().getClass();
                    throw null;
                }
                if (!(novVar instanceof xlo0)) {
                    if (novVar instanceof z3m0) {
                        z3m0 z3m0Var = (z3m0) novVar;
                        ArrayList e3 = e(z3m0Var);
                        q500 q500Var = z3m0Var.c.k;
                        d4m0 d4m0Var = z3m0Var.h;
                        int i = d4m0Var.d;
                        String i2 = d4m0Var.c.c().i();
                        d4m0 d4m0Var2 = z3m0Var.h;
                        return Collections.singletonList(new ClickableGeo(0L, e3, q500Var, i, i2, null, d4m0Var2.a, d4m0Var2.e, 33, null));
                    }
                    if (novVar instanceof no6) {
                        no6 no6Var = (no6) novVar;
                        a6m0 a6m0Var2 = (a6m0) no6Var.m();
                        r2 = a6m0Var2.g != null ? 1 : 0;
                        Long l = a6m0Var2.b;
                        UserId userId = a6m0Var2.c;
                        String str2 = a6m0Var2.d;
                        ArrayList e4 = e(no6Var);
                        q500 o3 = no6Var.getCommons().o();
                        if (r2 != 0) {
                            Serializer.c<ClickableMarketItem> cVar = ClickableMarketItem.CREATOR;
                            str = StoriesClickableStickerDto.StyleDto.HORIZONTAL.i();
                        } else {
                            str = null;
                        }
                        return Collections.singletonList(new ClickableMarketItem(0L, e4, o3, l, userId, str2, null, null, null, null, null, str, 1985, null));
                    }
                    if (novVar instanceof edm0) {
                        edm0 edm0Var = (edm0) novVar;
                        ArrayList e5 = e(edm0Var);
                        q500 o4 = edm0Var.getCommons().o();
                        StoryServiceItemInfo.Style style = edm0Var.getInfo().e;
                        return Collections.singletonList(new ClickableServiceYcItem(0L, e5, o4, null, null, style != null ? style.i() : null, null, 89, null));
                    }
                    if (novVar instanceof v4m0) {
                        v4m0 v4m0Var = (v4m0) novVar;
                        String str3 = v4m0Var.h.c;
                        if (!brm0.B(str3, "#", false)) {
                            str3 = "#".concat(str3);
                        }
                        return Collections.singletonList(new ClickableHashtag(0L, e(v4m0Var), v4m0Var.c.k, str3, v4m0Var.h.a.c().i(), 1, null));
                    }
                    if (novVar instanceof q5m0) {
                        q5m0 q5m0Var = (q5m0) novVar;
                        ArrayList e6 = e(q5m0Var);
                        r5m0 r5m0Var = q5m0Var.h;
                        return Collections.singletonList(new ClickableLink(0L, e6, null, r5m0Var.a, null, null, null, r5m0Var.c.c().i(), Boolean.TRUE, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, null));
                    }
                    if (novVar instanceof x6m0) {
                        x6m0 x6m0Var = (x6m0) novVar;
                        v6m0 v6m0Var = x6m0Var.h;
                        a420 a420Var = v6m0Var.c;
                        UserId userId2 = a420Var != null ? a420Var.a : null;
                        if (a420Var == null || (lowerCase = a420Var.b) == null) {
                            lowerCase = v6m0Var.d.toLowerCase(Locale.ROOT);
                        }
                        return Collections.singletonList(new ClickableMention(0L, e(x6m0Var), x6m0Var.c.k, userId2, lowerCase, x6m0Var.h.a.c().i(), null, null, 193, null));
                    }
                    if (novVar instanceof g7m0) {
                        return Collections.singletonList(new ClickableMusic(0L, Collections.singletonList(new WebClickablePoint(0, 0)), null, ((g7m0) novVar).h.b, null, 0, null, false, 197, null));
                    }
                    if (novVar instanceof r8m0) {
                        return g((r8m0) novVar);
                    }
                    if (novVar instanceof sam0) {
                        sam0 sam0Var = (sam0) novVar;
                        ArrayList e7 = e(sam0Var);
                        q500 q500Var2 = sam0Var.c.k;
                        StoryQuestionInfo storyQuestionInfo = sam0Var.h;
                        return Collections.singletonList(new ClickableQuestion(0L, e7, q500Var2, new WebActionQuestion(storyQuestionInfo.a, storyQuestionInfo.b, storyQuestionInfo.e.i(), sam0Var.h.d.i), true, 1, null));
                    }
                    if (novVar instanceof pjm0) {
                        z2l0 z2l0Var = ((pjm0) novVar).c;
                        float f = z2l0Var.i;
                        float f2 = 185;
                        RectF rectF = new RectF((f / 2.0f) - f2, 1667.0f, (f / 2.0f) + f2, 1782.0f);
                        x7l0 x7l0Var = x7l0.b;
                        float[] b = x7l0.b(rectF);
                        List l2 = e43.l(new PointF(b[0], b[1]), new PointF(b[2], b[3]), new PointF(b[4], b[5]), new PointF(b[6], b[7]));
                        ArrayList arrayList9 = new ArrayList(c5g.u(l2, 10));
                        Iterator it3 = l2.iterator();
                        while (it3.hasNext()) {
                            arrayList9.add(i((PointF) it3.next()));
                        }
                        return Collections.singletonList(new ClickableSituationalTemplate(0L, arrayList9, z2l0Var.k, null, null, 25, null));
                    }
                    if (novVar instanceof ppe0) {
                        ppe0 ppe0Var = (ppe0) novVar;
                        return rl3.I(new ClickableMention[]{c(ppe0Var, ppe0Var.getStickerMatrix()), b(ppe0Var, ppe0Var.getStickerMatrix())});
                    }
                    if (!(novVar instanceof l0u0)) {
                        if (!(novVar instanceof c0m0)) {
                            if (novVar instanceof o7m0) {
                                o7m0 o7m0Var = (o7m0) novVar;
                                return Collections.singletonList(new ClickableMusic(0L, e(o7m0Var), o7m0Var.getCommons().o(), o7m0Var.getInfo().b, null, 0, o7m0Var.getStyle().i(), false, 145, null));
                            }
                            if (novVar instanceof lba0) {
                                lba0 lba0Var = (lba0) novVar;
                                ArrayList e8 = e(lba0Var);
                                q500 o5 = lba0Var.getCommons().o();
                                String str4 = lba0Var.getInfo().g;
                                if (str4 == null) {
                                    str4 = lba0Var.getInfo().a;
                                }
                                return Collections.singletonList(new ClickablePhoto(0L, e8, o5, str4, lba0Var.getInfo().h, lba0Var.getInfo().i, lba0Var.getInfo().c.a.j(), fco0.j(lba0Var.getInfo().j), 1, null));
                            }
                            if (novVar instanceof h5a0) {
                                h5a0 h5a0Var = (h5a0) novVar;
                                ArrayList e9 = e(h5a0Var);
                                q500 o6 = h5a0Var.getCommons().o();
                                i5a0 i5a0Var = h5a0Var.f;
                                return Collections.singletonList(new ClickablePhotoAlbum(0L, e9, o6, i5a0Var.a, i5a0Var.b, i5a0Var.i.a.i(), 1, null));
                            }
                            if (!(novVar instanceof abm0)) {
                                com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("No mapping for " + novVar));
                                return null;
                            }
                            abm0 abm0Var = (abm0) novVar;
                            ArrayList e10 = e(abm0Var);
                            q500 o7 = abm0Var.getCommons().o();
                            int reactionId = abm0Var.getReactionId();
                            Boolean withBlackBackground = abm0Var.getWithBlackBackground();
                            return Collections.singletonList(new ClickableReaction(0L, e10, o7, reactionId, withBlackBackground != null ? withBlackBackground.booleanValue() : true, 1, null));
                        }
                        c0m0 c0m0Var = (c0m0) novVar;
                        Object g = c0m0Var.g();
                        WebRenderableSticker webRenderableSticker = g instanceof WebRenderableSticker ? (WebRenderableSticker) g : null;
                        if (webRenderableSticker == null || (list = webRenderableSticker.h) == null) {
                            return null;
                        }
                        float originalWidth = webRenderableSticker.i != null ? c0m0Var.getOriginalWidth() / r1.intValue() : 1.0f;
                        PointF[] fillPoints = c0m0Var.getFillPoints();
                        Matrix stickerMatrix = c0m0Var.getStickerMatrix();
                        ArrayList arrayList10 = new ArrayList();
                        for (WebClickableZone webClickableZone : list) {
                            StickerAction stickerAction = webClickableZone.c;
                            List<WebClickablePoint> list2 = webClickableZone.d;
                            if (list2 != null) {
                                float[] fArr = new float[list2.size() * 2];
                                int size = list2.size();
                                for (int i3 = r2; i3 < size; i3++) {
                                    int i4 = i3 * 2;
                                    fArr[i4] = list2.get(i3).b * originalWidth;
                                    fArr[i4 + 1] = list2.get(i3).c * originalWidth;
                                }
                                stickerMatrix.mapPoints(fArr);
                                arrayList = new ArrayList(list2.size());
                                int size2 = list2.size();
                                for (int i5 = r2; i5 < size2; i5++) {
                                    int i6 = i5 * 2;
                                    arrayList.add(i5, new WebClickablePoint(Math.round(fArr[i6]), Math.round(fArr[i6 + 1])));
                                }
                            } else {
                                arrayList = new ArrayList(fillPoints.length);
                                for (PointF pointF : fillPoints) {
                                    arrayList.add(new WebClickablePoint(an10.b(pointF.x), an10.b(pointF.y)));
                                }
                            }
                            ArrayList arrayList11 = arrayList;
                            if (stickerAction instanceof WebActionHashtag) {
                                WebActionHashtag webActionHashtag = (WebActionHashtag) stickerAction;
                                clickableSituationalTheme = new ClickableHashtag(0L, arrayList11, null, webActionHashtag.b, webActionHashtag.c, 5, null);
                            } else if (stickerAction instanceof WebActionMention) {
                                Serializer.c<ClickableMention> cVar2 = ClickableMention.CREATOR;
                                WebActionMention webActionMention = (WebActionMention) stickerAction;
                                clickableSituationalTheme = ClickableMention.a.a(webActionMention.b, webActionMention.c, arrayList11, null, null, null, 0L);
                            } else if (stickerAction instanceof WebActionPlace) {
                                WebActionPlace webActionPlace = (WebActionPlace) stickerAction;
                                int i7 = webActionPlace.b;
                                String str5 = webActionPlace.e;
                                if (str5 == null) {
                                    StickerCommonStyle.Companion.getClass();
                                    StickerCommonStyle stickerCommonStyle = StickerCommonStyle.DARK;
                                    StickerCommonStyle stickerCommonStyle2 = (StickerCommonStyle) j5g.a0(e43.l(stickerCommonStyle, StickerCommonStyle.LIGHT, StickerCommonStyle.ACCENT_BACKGROUND, StickerCommonStyle.ACCENT_CONTENT, StickerCommonStyle.DARK_WITHOUT_BACKGROUND, StickerCommonStyle.LIGHT_WITHOUT_BACKGROUND, StickerCommonStyle.DARK_UNIQUE, StickerCommonStyle.LIGHT_UNIQUE));
                                    if (stickerCommonStyle2 != null) {
                                        stickerCommonStyle = stickerCommonStyle2;
                                    }
                                    str5 = stickerCommonStyle.i();
                                }
                                clickableSituationalTheme = new ClickableGeo(0L, arrayList11, null, i7, str5, null, webActionPlace.c, webActionPlace.d, 37, null);
                            } else if (stickerAction instanceof WebActionLink) {
                                WebActionLink webActionLink = (WebActionLink) stickerAction;
                                clickableSituationalTheme = new ClickableLink(0L, arrayList11, null, webActionLink.b, webActionLink.c, null, null, webActionLink.e, null, 357, null);
                            } else if (stickerAction instanceof WebActionQuestion) {
                                clickableSituationalTheme = new ClickableQuestion(0L, arrayList11, null, (WebActionQuestion) stickerAction, false, 21, null);
                            } else if (stickerAction instanceof WebActionMarketItem) {
                                WebActionMarketItem webActionMarketItem = (WebActionMarketItem) stickerAction;
                                clickableSituationalTheme = new ClickableMarketItem(0L, arrayList11, null, webActionMarketItem.c, webActionMarketItem.d, webActionMarketItem.e, null, null, null, null, null, null, 4037, null);
                            } else if (stickerAction instanceof WebActionServiceYcItem) {
                                clickableSituationalTheme = new ClickableServiceYcItem(0L, arrayList11, null, null, null, ((WebActionServiceYcItem) stickerAction).b, null, 93, null);
                            } else if (stickerAction instanceof ActionPoll) {
                                clickableSituationalTheme = new ClickablePoll(0L, arrayList11, null, (ActionPoll) stickerAction, 5, null);
                            } else if (stickerAction instanceof WebActionApp) {
                                clickableSituationalTheme = new ClickableApp(0L, arrayList11, null, (WebActionApp) stickerAction, null, false, 53, null);
                            } else if (stickerAction instanceof WebActionSituationalTheme) {
                                clickableSituationalTheme = new ClickableSituationalTheme(0L, arrayList11, null, null, null, 29, null);
                            } else {
                                b7l.a("Can't convert " + webClickableZone.b + " to sticker");
                                obj = null;
                                if (obj == null) {
                                    arrayList10.add(obj);
                                }
                                r2 = 0;
                            }
                            obj = clickableSituationalTheme;
                            if (obj == null) {
                            }
                            r2 = 0;
                        }
                        return arrayList10;
                    }
                    l0u0 l0u0Var = (l0u0) novVar;
                    z2l0 z2l0Var2 = l0u0Var.c;
                    z2l0 z2l0Var3 = l0u0Var.c;
                    gzs<? extends List<? extends PointF>> gzsVar = l0u0Var.s;
                    if (gzsVar != null && (invoke6 = gzsVar.invoke()) != null) {
                        List<? extends PointF> list3 = invoke6;
                        ArrayList arrayList12 = new ArrayList(c5g.u(list3, 10));
                        Iterator<T> it4 = list3.iterator();
                        while (it4.hasNext()) {
                            arrayList12.add(i((PointF) it4.next()));
                        }
                    }
                    Class<? extends nov> cls = l0u0Var.q;
                    if (epx.f(cls, rcd.class)) {
                        return Collections.singletonList(new ClickableClipStat(0L, e(l0u0Var), z2l0Var2.k, 1, null));
                    }
                    if (epx.f(cls, p550.class)) {
                        gzs<? extends List<? extends PointF>> gzsVar2 = l0u0Var.s;
                        if (gzsVar2 == null || (invoke5 = gzsVar2.invoke()) == null) {
                            arrayList6 = null;
                        } else {
                            List<? extends PointF> list4 = invoke5;
                            ArrayList arrayList13 = new ArrayList(c5g.u(list4, 10));
                            Iterator<T> it5 = list4.iterator();
                            while (it5.hasNext()) {
                                arrayList13.add(i((PointF) it5.next()));
                            }
                            arrayList6 = arrayList13;
                        }
                        return Collections.singletonList(new ClickableMusic(0L, arrayList6, z2l0Var2.k, (MusicTrack) l0u0Var.t, null, 0, null, true, 81, null));
                    }
                    if (epx.f(cls, eeb0.class)) {
                        gzs<? extends List<? extends PointF>> gzsVar3 = l0u0Var.s;
                        if (gzsVar3 == null || (invoke4 = gzsVar3.invoke()) == null) {
                            arrayList5 = null;
                        } else {
                            List<? extends PointF> list5 = invoke4;
                            ArrayList arrayList14 = new ArrayList(c5g.u(list5, 10));
                            Iterator<T> it6 = list5.iterator();
                            while (it6.hasNext()) {
                                arrayList14.add(i((PointF) it6.next()));
                            }
                            arrayList5 = arrayList14;
                        }
                        return Collections.singletonList(new ClickableMusicPlaylist(0L, arrayList5, z2l0Var2.k, (Playlist) l0u0Var.t, null, 17, null));
                    }
                    if (epx.f(cls, o7c0.class)) {
                        u7c0 u7c0Var3 = (u7c0) l0u0Var.t;
                        u7c0.b bVar3 = u7c0Var3.i;
                        u7c0.e eVar2 = u7c0Var3.j;
                        if (bVar3 != null) {
                            ArrayList e11 = e(l0u0Var);
                            q500 q500Var3 = z2l0Var2.k;
                            u7c0.b bVar4 = u7c0Var3.i;
                            clickablePost = new ClickableChannelPost(0L, e11, q500Var3, bVar4 != null ? bVar4.c : UserId.d, bVar4 != null ? bVar4.b : UserId.d, bVar4 != null ? bVar4.a : 0, eVar2.a.i(), null, 129, null);
                        } else {
                            clickablePost = new ClickablePost(0L, e(l0u0Var), z2l0Var2.k, u7c0Var3.a, u7c0Var3.b, eVar2.a.i(), 1, null);
                        }
                        return Collections.singletonList(clickablePost);
                    }
                    if (epx.f(cls, air0.class)) {
                        return Collections.singletonList(d(l0u0Var, (u7c0) l0u0Var.t));
                    }
                    if (epx.f(cls, p8b.class)) {
                        return Collections.singletonList(d(l0u0Var, (u7c0) l0u0Var.t));
                    }
                    if (epx.f(cls, z7c0.class)) {
                        u7c0 u7c0Var4 = (u7c0) l0u0Var.t;
                        return Collections.singletonList(new ClickablePost(0L, e(l0u0Var), z2l0Var2.k, u7c0Var4.a, u7c0Var4.b, u7c0Var4.j.a.i(), 1, null));
                    }
                    if (epx.f(cls, g4g0.class)) {
                        Object obj3 = l0u0Var.t;
                        kba0 kba0Var = obj3 instanceof kba0 ? (kba0) obj3 : null;
                        if (kba0Var == null || kba0Var.f) {
                            return Collections.singletonList(new ClickableReply(0L, e(l0u0Var), z2l0Var2.k, null, 0, (kba0Var == null || (aVar = kba0Var.c) == null || (photoStickerStyle = aVar.a) == null) ? null : photoStickerStyle.j(), 25, null));
                        }
                        return null;
                    }
                    if (epx.f(cls, r4g0.class)) {
                        Object obj4 = l0u0Var.t;
                        q4g0 q4g0Var = obj4 instanceof q4g0 ? (q4g0) obj4 : null;
                        if ((q4g0Var == null || q4g0Var.f) && q4g0Var != null) {
                            return f(q4g0Var, e(l0u0Var), z2l0Var2.k);
                        }
                        return null;
                    }
                    if (epx.f(cls, ppe0.class)) {
                        ppe0 ppe0Var2 = (ppe0) l0u0Var.r;
                        return rl3.I(new ClickableMention[]{c(ppe0Var2, z2l0Var3.n), b(ppe0Var2, z2l0Var3.n)});
                    }
                    if (epx.f(cls, o7m0.class)) {
                        gzs<? extends List<? extends PointF>> gzsVar4 = l0u0Var.s;
                        if (gzsVar4 == null || (invoke3 = gzsVar4.invoke()) == null) {
                            arrayList4 = null;
                        } else {
                            List<? extends PointF> list6 = invoke3;
                            ArrayList arrayList15 = new ArrayList(c5g.u(list6, 10));
                            Iterator<T> it7 = list6.iterator();
                            while (it7.hasNext()) {
                                arrayList15.add(i((PointF) it7.next()));
                            }
                            arrayList4 = arrayList15;
                        }
                        StoryMusicInfo storyMusicInfo = (StoryMusicInfo) l0u0Var.t;
                        return Collections.singletonList(new ClickableMusic(0L, arrayList4, z2l0Var2.k, storyMusicInfo.b, null, storyMusicInfo.d, ((o7m0) l0u0Var.r).getStyle().i(), false, 145, null));
                    }
                    if (epx.f(cls, b6m0.class)) {
                        gzs<? extends List<? extends PointF>> gzsVar5 = l0u0Var.s;
                        if (gzsVar5 == null || (invoke2 = gzsVar5.invoke()) == null) {
                            arrayList3 = null;
                        } else {
                            List<? extends PointF> list7 = invoke2;
                            ArrayList arrayList16 = new ArrayList(c5g.u(list7, 10));
                            Iterator<T> it8 = list7.iterator();
                            while (it8.hasNext()) {
                                arrayList16.add(i((PointF) it8.next()));
                            }
                            arrayList3 = arrayList16;
                        }
                        ViewGroup viewGroup = l0u0Var.r;
                        b6m0 b6m0Var = viewGroup instanceof b6m0 ? (b6m0) viewGroup : null;
                        if (b6m0Var == null) {
                            return EmptyList.b;
                        }
                        q500 q500Var4 = z2l0Var2.k;
                        a6m0 a6m0Var3 = b6m0Var.c;
                        return Collections.singletonList(new ClickableMarketItem(0L, arrayList3, q500Var4, a6m0Var3.b, a6m0Var3.c, a6m0Var3.d, null, null, null, null, null, StoriesClickableStickerDto.StyleDto.HORIZONTAL.i(), 1985, null));
                    }
                    if (!epx.f(cls, edm0.class)) {
                        if (epx.f(cls, lba0.class)) {
                            kba0 kba0Var2 = (kba0) l0u0Var.t;
                            ArrayList e12 = e(l0u0Var);
                            q500 q500Var5 = z2l0Var2.k;
                            String str6 = kba0Var2.g;
                            if (str6 == null) {
                                str6 = kba0Var2.a;
                            }
                            return Collections.singletonList(new ClickablePhoto(0L, e12, q500Var5, str6, kba0Var2.h, kba0Var2.i, kba0Var2.c.a.j(), fco0.j(kba0Var2.j), 1, null));
                        }
                        if (epx.f(cls, abm0.class)) {
                            vjc vjcVar = (vjc) l0u0Var.t;
                            return Collections.singletonList(new ClickableReaction(0L, e(l0u0Var), z2l0Var2.k, vjcVar.a, vjcVar.b, 1, null));
                        }
                        if (!epx.f(cls, h5a0.class)) {
                            return null;
                        }
                        i5a0 i5a0Var2 = (i5a0) l0u0Var.t;
                        return Collections.singletonList(new ClickablePhotoAlbum(0L, e(l0u0Var), z2l0Var2.k, i5a0Var2.a, i5a0Var2.b, i5a0Var2.i.a.i(), 1, null));
                    }
                    StoryServiceItemInfo storyServiceItemInfo = (StoryServiceItemInfo) l0u0Var.t;
                    gzs<? extends List<? extends PointF>> gzsVar6 = l0u0Var.s;
                    if (gzsVar6 == null || (invoke = gzsVar6.invoke()) == null) {
                        arrayList2 = null;
                    } else {
                        List<? extends PointF> list8 = invoke;
                        ArrayList arrayList17 = new ArrayList(c5g.u(list8, 10));
                        Iterator<T> it9 = list8.iterator();
                        while (it9.hasNext()) {
                            arrayList17.add(i((PointF) it9.next()));
                        }
                        arrayList2 = arrayList17;
                    }
                    if (arrayList2 == null) {
                        throw new NullPointerException("clickableArea is null");
                    }
                    q500 q500Var6 = z2l0Var2.k;
                    UserId userId3 = storyServiceItemInfo.d;
                    StoryServiceItemInfo.Style style2 = storyServiceItemInfo.e;
                    return Collections.singletonList(new ClickableServiceYcItem(0L, arrayList2, q500Var6, storyServiceItemInfo.c, userId3, style2 != null ? style2.i() : null, null, 65, null));
                }
                xlo0 xlo0Var = (xlo0) novVar;
                jmo0 jmo0Var = xlo0Var.o;
                if (jmo0Var != null) {
                    StaticLayout staticLayout = jmo0Var.a;
                    List<yhk0> g2 = q7o.g(staticLayout);
                    Iterator<Integer> it10 = swe0.q(0, staticLayout.getLineCount()).iterator();
                    if (it10.hasNext()) {
                        float primaryHorizontal = staticLayout.getPrimaryHorizontal(staticLayout.getLineStart(it10.next().intValue()));
                        while (it10.hasNext()) {
                            primaryHorizontal = Math.min(primaryHorizontal, staticLayout.getPrimaryHorizontal(staticLayout.getLineStart(it10.next().intValue())));
                        }
                        valueOf = Float.valueOf(primaryHorizontal);
                    } else {
                        valueOf = null;
                    }
                    float floatValue = valueOf != null ? valueOf.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (g2 != null && !g2.isEmpty()) {
                        ArrayList arrayList18 = new ArrayList();
                        for (yhk0 yhk0Var : g2) {
                            RectF rectF2 = yhk0Var.b;
                            T t = yhk0Var.a;
                            float f3 = rectF2.left;
                            float f4 = rectF2.top;
                            float f5 = rectF2.right;
                            float f6 = rectF2.bottom;
                            float[] fArr2 = {f3, f4, f5, f4, f5, f6, f3, f6};
                            fArr2[0] = fArr2[0] - floatValue;
                            fArr2[2] = fArr2[2] - floatValue;
                            fArr2[4] = fArr2[4] - floatValue;
                            fArr2[6] = fArr2[6] - floatValue;
                            xlo0Var.c.n.mapPoints(fArr2);
                            Serializer.c<WebClickablePoint> cVar3 = WebClickablePoint.CREATOR;
                            List A = rli0.A(new ulp0(new i5g(swe0.q(0, 4)), new z7t0(fArr2, 13)));
                            p0m0 p0m0Var = (p0m0) t;
                            if (p0m0Var instanceof StoryMentionSpan) {
                                clickableHashtag = new ClickableMention(0L, A, null, ((StoryMentionSpan) t).b, yhk0Var.c, MentionLegacyStyle.UNDERLINE.h(), null, null, 197, null);
                            } else if (p0m0Var instanceof StoryHashtagSpan) {
                                clickableHashtag = new ClickableHashtag(0L, A, null, ((StoryHashtagSpan) t).b, HashtagLegacyStyle.UNDERLINE.h(), 5, null);
                            } else {
                                obj2 = null;
                                if (obj2 == null) {
                                    arrayList18.add(obj2);
                                }
                            }
                            obj2 = clickableHashtag;
                            if (obj2 == null) {
                            }
                        }
                        return arrayList18;
                    }
                }
            }
        }
        return null;
    }

    public static final ClickableMention b(ppe0 ppe0Var, Matrix matrix) {
        String str;
        Owner responder = ppe0Var.getResponder();
        if (responder == null || (str = responder.c) == null) {
            return null;
        }
        Pair pair = ppe0Var.getAnswer().g == null ? new Pair(ppe0Var.getUid(), ppe0Var.getName()) : new Pair(responder.b, str);
        UserId userId = (UserId) pair.d();
        String str2 = (String) pair.g();
        x7l0 x7l0Var = x7l0.b;
        List a = x7l0.a(ppe0Var.m, matrix);
        ArrayList arrayList = new ArrayList(c5g.u(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(i((PointF) it.next()));
        }
        return new ClickableMention(0L, arrayList, ppe0Var.getCommons().o(), userId, str2, MentionLegacyStyle.UNDERLINE.h(), null, null, 193, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0 != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ClickableMention c(ppe0 ppe0Var, Matrix matrix) {
        Pair pair;
        StoryOwner zb;
        if (!ppe0Var.getAnswer().f || ppe0Var.getAnswer().g != null) {
            if (ppe0Var.getAnswer().f) {
                StoryOwner storyOwner = ppe0Var.getAnswer().g;
                if (storyOwner != null) {
                    zb = storyOwner instanceof StoryOwner.Owner ? (StoryOwner.Owner) storyOwner : null;
                }
                StoryOwner storyOwner2 = ppe0Var.getAnswer().g;
                zb = storyOwner2 != null ? storyOwner2.zb() : null;
                if (zb == null) {
                    StoryOwner storyOwner3 = ppe0Var.getAnswer().g;
                    zb = (storyOwner3 == null || !(storyOwner3 instanceof StoryOwner.Community)) ? null : (StoryOwner.Community) storyOwner3;
                }
                pair = new Pair(zb != null ? zb.Fb() : null, zb != null ? zb.Db() : null);
            } else {
                Owner owner = ppe0Var.getAnswer().c;
                UserId userId = owner != null ? owner.b : null;
                Owner owner2 = ppe0Var.getAnswer().c;
                pair = new Pair(userId, owner2 != null ? owner2.c : null);
            }
            UserId userId2 = (UserId) pair.d();
            String str = (String) pair.g();
            if (userId2 != null) {
                x7l0 x7l0Var = x7l0.b;
                List a = x7l0.a(ppe0Var.l, matrix);
                ArrayList arrayList = new ArrayList(c5g.u(a, 10));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    arrayList.add(i((PointF) it.next()));
                }
                if (str == null) {
                    str = "";
                }
                return new ClickableMention(0L, arrayList, ppe0Var.getCommons().o(), userId2, str, MentionLegacyStyle.UNDERLINE.h(), null, null, 193, null);
            }
        }
        return null;
    }

    public static final ClickableSticker d(nov novVar, u7c0 u7c0Var) {
        u7c0.b bVar = u7c0Var.i;
        u7c0.e eVar = u7c0Var.j;
        u7c0.f fVar = u7c0Var.h;
        if (fVar != null && u7c0Var.a == 0) {
            return new ClickableVideo(0L, e(novVar), novVar.getCommons().o(), u7c0Var.b, fVar.a, eVar.a.i(), 1, null);
        }
        if (bVar == null) {
            return new ClickablePost(0L, e(novVar), novVar.getCommons().o(), u7c0Var.a, u7c0Var.b, eVar.a.i(), 1, null);
        }
        ArrayList e = e(novVar);
        q500 o = novVar.getCommons().o();
        int i = bVar.a;
        return new ClickableChannelPost(0L, e, o, bVar.c, bVar.b, i, eVar.a.i(), null, 129, null);
    }

    public static final ArrayList e(nov novVar) {
        PointF[] fillPoints = novVar.getFillPoints();
        ArrayList arrayList = new ArrayList(fillPoints.length);
        for (PointF pointF : fillPoints) {
            arrayList.add(i(pointF));
        }
        return arrayList;
    }

    public static final List f(q4g0 q4g0Var, ArrayList arrayList, q500 q500Var) {
        q4g0.a aVar = q4g0Var.e;
        q4g0.b bVar = q4g0Var.a;
        if (epx.f(bVar, q4g0.b.C3548b.a)) {
            return Collections.singletonList(new ClickableReply(0L, arrayList, q500Var, null, 0, aVar.a.i(), 25, null));
        }
        if (!(bVar instanceof q4g0.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        q4g0.b.a aVar2 = (q4g0.b.a) bVar;
        return Collections.singletonList(new ClickableClip(0L, arrayList, q500Var, aVar2.a, aVar2.b, aVar.a.i(), 1, null));
    }

    public static final List<ClickableSticker> g(r8m0 r8m0Var) {
        return Collections.singletonList(new ClickablePoll(0L, e(r8m0Var), r8m0Var.c.k, new ActionPoll(r8m0Var.h.a), 1, null));
    }

    public static final boolean h(nov novVar) {
        return (novVar instanceof aqx) || (novVar instanceof p550) || (novVar instanceof eeb0) || (novVar instanceof s690) || (novVar instanceof t690) || (novVar instanceof w690) || (novVar instanceof o7c0) || (novVar instanceof z7c0) || (novVar instanceof g4g0) || (novVar instanceof h4g0) || (novVar instanceof u4g0) || (novVar instanceof r4g0) || (novVar instanceof xlo0) || (novVar instanceof z3m0) || (novVar instanceof no6) || (novVar instanceof v4m0) || (novVar instanceof q5m0) || (novVar instanceof x6m0) || (novVar instanceof g7m0) || (novVar instanceof r8m0) || (novVar instanceof sam0) || (novVar instanceof pjm0) || (novVar instanceof ppe0) || (novVar instanceof l0u0) || (novVar instanceof c0m0) || (novVar instanceof o7m0) || (novVar instanceof lba0) || (novVar instanceof h5a0) || (novVar instanceof abm0);
    }

    public static final WebClickablePoint i(PointF pointF) {
        return new WebClickablePoint(an10.b(pointF.x), an10.b(pointF.y));
    }
}
