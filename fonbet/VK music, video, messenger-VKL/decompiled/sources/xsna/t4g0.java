package xsna;

import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stickers.reply.ReplyVideoStickerStyle;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.newsfeed.Owner;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ej90;
import xsna.q4g0;
import xsna.s4g0;

/* compiled from: ReplyVideoStickerStateMapper.kt */
/* loaded from: classes15.dex */
public final class t4g0 {

    /* compiled from: ReplyVideoStickerStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReplyVideoStickerStyle.values().length];
            try {
                iArr[ReplyVideoStickerStyle.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReplyVideoStickerStyle.MINIATURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReplyVideoStickerStyle.FULLSCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    public static s4g0 a(q4g0 q4g0Var) {
        ?? r12;
        int i;
        int i2;
        Drawable drawable;
        q4g0.b bVar = q4g0Var.a;
        q4g0.a aVar = q4g0Var.e;
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        String str = ((b25) bpn0Var.getValue()).o().b;
        ReplyVideoStickerStyle replyVideoStickerStyle = aVar.a;
        ReplyVideoStickerStyle replyVideoStickerStyle2 = aVar.a;
        boolean z = false;
        if (replyVideoStickerStyle == ReplyVideoStickerStyle.FULLSCREEN) {
            z = true;
        }
        List singletonList = Collections.singletonList(new u75(q4g0Var.c, q4g0Var.b));
        boolean z2 = bVar instanceof q4g0.b.a;
        String str2 = "";
        if (z2) {
            ArrayList arrayList = ((q4g0.b.a) bVar).d;
            r12 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Owner owner = ((CoOwnerItem) it.next()).d;
                String str3 = owner.c;
                if (str3 == null) {
                    str3 = "";
                }
                VerifyInfo verifyInfo = owner.f;
                if (verifyInfo != null) {
                    VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                    dhr0.a.getClass();
                    drawable = VerifyInfoHelper.h(verifyInfoHelper, verifyInfo, dhr0.s(), VerifyInfoHelper.ColorTheme.white, 24);
                } else {
                    drawable = null;
                }
                r12.add(new u75(drawable, str3));
            }
        } else {
            if (!epx.f(bVar, q4g0.b.C3548b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            r12 = EmptyList.b;
        }
        int i3 = q4g0Var.d;
        boolean z3 = !z;
        if (z2) {
            String str4 = ((q4g0.b.a) bVar).c;
            if (str4 != null) {
                str2 = str4;
            }
        } else if (!epx.f(bVar, q4g0.b.C3548b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        CharSequence charSequence = ej90.a.b(str2, new ej90.b(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, q4g0Var.g, null, 0, 0, null, null, 503), 4).a;
        ReplyVideoStickerStyle replyVideoStickerStyle3 = ReplyVideoStickerStyle.MINIATURE;
        s4g0.b bVar2 = new s4g0.b(charSequence, replyVideoStickerStyle2 == replyVideoStickerStyle3 && myc0.f(str2), replyVideoStickerStyle2 == replyVideoStickerStyle3);
        ArrayList u0 = j5g.u0((Iterable) r12, singletonList);
        if (z2) {
            i = R.string.accessibility_clip;
        } else {
            if (!(bVar instanceof q4g0.b.C3548b)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.accessibility_story;
        }
        int i4 = a.$EnumSwitchMapping$0[replyVideoStickerStyle2.ordinal()];
        if (i4 == 1) {
            i2 = R.string.repost_style_preview;
        } else if (i4 == 2) {
            i2 = R.string.repost_style_miniature;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.string.repost_style_fullscreen;
        }
        return new s4g0(z, i3, str, z3, bVar2, u0, new s4g0.a(i, i2));
    }
}
