package xsna;

import com.vk.stickers.api.models.post.PostStickerStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.e8c0;
import xsna.u7c0;

/* compiled from: PostStickerViewStateMapperRedesign.kt */
/* loaded from: classes15.dex */
public final class d8c0 {

    /* compiled from: PostStickerViewStateMapperRedesign.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostStickerStyle.values().length];
            try {
                iArr[PostStickerStyle.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostStickerStyle.MINIATURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostStickerStyle.FULLSCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    public static e8c0 a(u7c0 u7c0Var) {
        ?? r10;
        u7c0.a aVar = u7c0Var.g;
        int i = u7c0Var.a;
        u7c0.f fVar = u7c0Var.h;
        List<q7c0> list = aVar.a;
        List<q7c0> list2 = aVar.a;
        q7c0 q7c0Var = (q7c0) j5g.a0(list);
        u7c0.e eVar = u7c0Var.j;
        PostStickerStyle postStickerStyle = eVar.a;
        PostStickerStyle postStickerStyle2 = eVar.a;
        boolean z = false;
        boolean z2 = postStickerStyle == PostStickerStyle.MINIATURE;
        int b = z2 ? cn70.b(12) : 0;
        postStickerStyle.getClass();
        e8c0.d dVar = new e8c0.d(b, z2, postStickerStyle == PostStickerStyle.FULLSCREEN);
        u7c0.c cVar = u7c0Var.c;
        List singletonList = Collections.singletonList(new u75(cVar.b, cVar.a));
        List<u7c0.c> list3 = u7c0Var.d;
        if (list3 != null) {
            List<u7c0.c> list4 = list3;
            r10 = new ArrayList(c5g.u(list4, 10));
            for (u7c0.c cVar2 : list4) {
                r10.add(new u75(cVar2.b, cVar2.a));
            }
        } else {
            r10 = 0;
        }
        if (r10 == 0) {
            r10 = EmptyList.b;
        }
        postStickerStyle2.getClass();
        e8c0.c cVar3 = new e8c0.c(j5g.u0((Iterable) r10, singletonList), (fVar == null || i != 0) ? u7c0Var.i != null ? R.string.sticker_type_prefix_channel_post : R.string.sticker_type_prefix_post : R.string.sticker_type_prefix_video, !(postStickerStyle2 == PostStickerStyle.FULLSCREEN));
        CharSequence charSequence = u7c0Var.e;
        boolean isEmpty = list2.isEmpty();
        if (isEmpty || (charSequence != null && charSequence.length() != 0 && postStickerStyle2 == PostStickerStyle.MINIATURE)) {
            z = true;
        }
        e8c0.e eVar2 = new e8c0.e(charSequence, list2.isEmpty() ? 11 : 2, z, isEmpty);
        e8c0.b bVar = new e8c0.b(q7c0Var);
        int i2 = (fVar == null || i != 0) ? R.string.accessibility_post : R.string.accessibility_video;
        int i3 = a.$EnumSwitchMapping$0[postStickerStyle2.ordinal()];
        int i4 = R.string.repost_style_preview;
        if (i3 != 1) {
            if (i3 == 2) {
                i4 = R.string.repost_style_miniature;
            } else if (i3 == 3) {
                i4 = R.string.repost_style_fullscreen;
            }
        }
        return new e8c0(dVar, cVar3, eVar2, bVar, new e8c0.a(i2, i4));
    }
}
