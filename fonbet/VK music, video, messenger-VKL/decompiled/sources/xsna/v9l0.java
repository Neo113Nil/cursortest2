package xsna;

import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.CanvasStickerDraft;
import com.vk.stickers.api.models.question.StoryQuestionInfo;
import com.vk.superapp.api.dto.story.WebNativeSticker;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.api.dto.story.WebTransform;
import com.vk.superapp.api.dto.story.actions.StickerAction;
import com.vk.superapp.api.dto.story.actions.WebActionHashtag;
import com.vk.superapp.api.dto.story.actions.WebActionMention;
import com.vk.superapp.api.dto.story.actions.WebActionPlace;
import com.vk.superapp.api.dto.story.actions.WebActionQuestion;
import com.vk.superapp.api.dto.story.actions.WebActionText;
import com.vk.superapp.api.dto.story.actions.WebActionTime;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NotImplementedError;

/* compiled from: StickersDraftExt.kt */
/* loaded from: classes16.dex */
public final class v9l0 {
    public static final WebTransform a(kr9 kr9Var) {
        float o = kr9Var.o();
        kr9Var.y0(o, kr9Var.getCenterX(), kr9Var.getCenterY(), true);
        float stickerTranslationX = kr9Var.getStickerTranslationX();
        z2l0 z2l0Var = kr9Var.c;
        WebTransform webTransform = new WebTransform((int) o, stickerTranslationX / z2l0Var.i, kr9Var.getStickerTranslationY() / z2l0Var.j, Float.valueOf((kr9Var.getOriginalWidth() * z2l0Var.l) / z2l0Var.i), "left_top");
        kr9Var.y0(-o, kr9Var.getCenterX(), kr9Var.getCenterY(), true);
        return webTransform;
    }

    public static final WebNativeSticker b(kr9 kr9Var, StickerAction stickerAction) {
        return new WebNativeSticker(stickerAction.zb().i(), stickerAction, a(kr9Var), true, kr9Var.d());
    }

    public static final CanvasStickerDraft c(nov novVar) {
        String str;
        if (novVar instanceof yjm0) {
            yjm0 yjm0Var = (yjm0) novVar;
            return new CanvasStickerDraft.NativeCanvasStickerDraft(b(yjm0Var, new WebActionTime(yjm0Var.h.c.j(), Long.valueOf(yjm0Var.h.b.d()), yjm0Var.h.d, null, 8, null)), yjm0Var.c.k);
        }
        if (novVar instanceof sam0) {
            sam0 sam0Var = (sam0) novVar;
            StoryQuestionInfo storyQuestionInfo = sam0Var.h;
            return new CanvasStickerDraft.NativeCanvasStickerDraft(b(sam0Var, new WebActionQuestion(storyQuestionInfo.a, storyQuestionInfo.b, storyQuestionInfo.e.i(), sam0Var.h.d.i)), sam0Var.c.k);
        }
        if (novVar instanceof x6m0) {
            x6m0 x6m0Var = (x6m0) novVar;
            String lowerCase = x6m0Var.h.d.toLowerCase(Locale.ROOT);
            a420 a420Var = x6m0Var.h.c;
            if (a420Var != null) {
                UserId userId = a420Var.a;
                if (fkq0.d(userId)) {
                    str = b4q.b(userId, "id");
                } else {
                    str = "club" + Math.abs(userId.b);
                }
            } else {
                str = "id0";
            }
            return new CanvasStickerDraft.NativeCanvasStickerDraft(b(x6m0Var, new WebActionMention(X3.j.d + str + '|' + lowerCase + ']', x6m0Var.h.a.c().i())), x6m0Var.c.k);
        }
        if (novVar instanceof v4m0) {
            v4m0 v4m0Var = (v4m0) novVar;
            String str2 = v4m0Var.h.c;
            if (!brm0.B(str2, "#", false)) {
                str2 = "#".concat(str2);
            }
            return new CanvasStickerDraft.NativeCanvasStickerDraft(b(v4m0Var, new WebActionHashtag(str2, v4m0Var.h.a.c().i())), v4m0Var.c.k);
        }
        if (novVar instanceof g4m0) {
            g4m0 g4m0Var = (g4m0) novVar;
            return new CanvasStickerDraft.LoadableCanvasStickerDraft(a(g4m0Var), g4m0Var.c.k, g4m0Var.j, WebStickerType.GIF, g4m0Var.i, null, 32, null);
        }
        if (novVar instanceof xlo0) {
            xlo0 xlo0Var = (xlo0) novVar;
            String obj = xlo0Var.l.toString();
            imo0 imo0Var = xlo0Var.k;
            return new CanvasStickerDraft.NativeCanvasStickerDraft(b(xlo0Var, new WebActionText(obj, imo0Var.m, imo0Var.n, imo0.a(imo0Var.b), String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(xlo0Var.k.g & 16777215)}, 1)), Float.valueOf(xlo0Var.k.c), null)), xlo0Var.c.k);
        }
        if (novVar instanceof c8m0) {
            c8m0 c8m0Var = (c8m0) novVar;
            WebTransform a = a(c8m0Var);
            q500 q500Var = c8m0Var.c.k;
            String str3 = c8m0Var.n;
            return new CanvasStickerDraft.LoadableCanvasStickerDraft(a, q500Var, str3 == null ? "" : str3, WebStickerType.PHOTO, c8m0Var.r.m(), null, 32, null);
        }
        if (novVar instanceof t690) {
            t690 t690Var = (t690) novVar;
            return new CanvasStickerDraft.LoadableCanvasStickerDraft(a(t690Var), t690Var.c.k, t690Var.o.b, WebStickerType.LOTTIE, t690Var.l, t690Var.k);
        }
        if (novVar instanceof s690) {
            s690 s690Var = (s690) novVar;
            return new CanvasStickerDraft.LoadableCanvasStickerDraft(a(s690Var), s690Var.c.k, s690Var.k, WebStickerType.LOTTIE, s690Var.j, null, 32, null);
        }
        if (novVar instanceof z3m0) {
            z3m0 z3m0Var = (z3m0) novVar;
            d4m0 d4m0Var = z3m0Var.h;
            return new CanvasStickerDraft.NativeCanvasStickerDraft(b(z3m0Var, new WebActionPlace(d4m0Var.d, d4m0Var.a, d4m0Var.e, d4m0Var.c.c().i(), d4m0Var.b)), z3m0Var.c.k);
        }
        if (novVar instanceof ad7) {
            ad7 ad7Var = (ad7) novVar;
            WebTransform a2 = a(ad7Var);
            q500 q500Var2 = ad7Var.c.k;
            String str4 = ad7Var.n;
            return new CanvasStickerDraft.LoadableCanvasStickerDraft(a2, q500Var2, str4 == null ? "" : str4, WebStickerType.STICKER, ad7Var.m, null, 32, null);
        }
        com.vk.metrics.eventtracking.b.a.q(new NotImplementedError("Draft mapping for " + qjg.a(novVar) + " is not implemented"));
        return null;
    }
}
