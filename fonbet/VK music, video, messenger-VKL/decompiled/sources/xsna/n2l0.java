package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.stories.design.view.stickerbutton.a;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import com.vk.story.api.storyflexboxfactory.StickerButtonType;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.R;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import xsna.x2m0;

/* compiled from: StickerButtonsViewHolder.kt */
/* loaded from: classes15.dex */
public final class n2l0 extends RecyclerView.e0 {
    public static final Object o = pn00.k(new Pair(StickerButtonType.MENTION, Integer.valueOf(R.id.sticker_button_mention)), new Pair(StickerButtonType.LOCATION, Integer.valueOf(R.id.sticker_button_location)), new Pair(StickerButtonType.POLL, Integer.valueOf(R.id.sticker_button_poll)), new Pair(StickerButtonType.OPINION, Integer.valueOf(R.id.sticker_button_opinion)), new Pair(StickerButtonType.MUSIC, Integer.valueOf(R.id.sticker_button_music)), new Pair(StickerButtonType.PHOTO, Integer.valueOf(R.id.sticker_button_photo)), new Pair(StickerButtonType.TIME, Integer.valueOf(R.id.sticker_button_time)), new Pair(StickerButtonType.LINK, Integer.valueOf(R.id.sticker_button_link)), new Pair(StickerButtonType.HASHTAG, Integer.valueOf(R.id.sticker_button_hashtag)), new Pair(StickerButtonType.PRODUCT, Integer.valueOf(R.id.sticker_button_product)), new Pair(StickerButtonType.REACTION, Integer.valueOf(R.id.sticker_button_reaction)));
    public final x2m0.b l;
    public final r6i0 m;
    public final a.C1830a n;

    /* compiled from: StickerButtonsViewHolder.kt */
    public static final class a {

        /* compiled from: StickerButtonsViewHolder.kt */
        /* renamed from: xsna.n2l0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3382a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[StickerButtonType.values().length];
                try {
                    iArr[StickerButtonType.MENTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StickerButtonType.LINK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StickerButtonType.PHOTO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StickerButtonType.HASHTAG.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[StickerButtonType.LOCATION.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[StickerButtonType.POLL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[StickerButtonType.OPINION.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[StickerButtonType.TIME.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[StickerButtonType.PRODUCT.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[StickerButtonType.MUSIC.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[StickerButtonType.REACTION.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[WebStickerType.values().length];
                try {
                    iArr2[WebStickerType.MENTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr2[WebStickerType.LINK.ordinal()] = 2;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr2[WebStickerType.PHOTO.ordinal()] = 3;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr2[WebStickerType.HASHTAG.ordinal()] = 4;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr2[WebStickerType.GEO.ordinal()] = 5;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr2[WebStickerType.POLL.ordinal()] = 6;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr2[WebStickerType.QUESTION.ordinal()] = 7;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr2[WebStickerType.GIF.ordinal()] = 8;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr2[WebStickerType.TIME.ordinal()] = 9;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr2[WebStickerType.MARKET_ITEM.ordinal()] = 10;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr2[WebStickerType.MARKET_SERVICE_ITEM.ordinal()] = 11;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr2[WebStickerType.SERVICE_YC_ITEM.ordinal()] = 12;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr2[WebStickerType.MUSIC.ordinal()] = 13;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr2[WebStickerType.REACTION.ordinal()] = 14;
                } catch (NoSuchFieldError unused25) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public static StickerButtonType a(WebStickerType webStickerType) {
            switch (C3382a.$EnumSwitchMapping$1[webStickerType.ordinal()]) {
                case 1:
                    return StickerButtonType.MENTION;
                case 2:
                    return StickerButtonType.LINK;
                case 3:
                    return StickerButtonType.PHOTO;
                case 4:
                    return StickerButtonType.HASHTAG;
                case 5:
                    return StickerButtonType.LOCATION;
                case 6:
                    return StickerButtonType.POLL;
                case 7:
                    return StickerButtonType.OPINION;
                case 8:
                    return StickerButtonType.GIF;
                case 9:
                    return StickerButtonType.TIME;
                case 10:
                    return StickerButtonType.PRODUCT;
                case 11:
                case 12:
                    return StickerButtonType.SERVICE;
                case 13:
                    return StickerButtonType.MUSIC;
                case 14:
                    return StickerButtonType.REACTION;
                default:
                    return null;
            }
        }
    }

    public n2l0() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n2l0(ViewGroup viewGroup, uei0 uei0Var, Set set, x2m0 x2m0Var, SelectionStickerView.OpenFrom openFrom) {
        super(x2m0Var.a(r4, r1, new r6i0(uei0Var, 2), openFrom != SelectionStickerView.OpenFrom.CLIPS));
        x2m0.b bVar = new x2m0.b();
        Context context = viewGroup.getContext();
        EnumSet noneOf = EnumSet.noneOf(StickerButtonType.class);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            StickerButtonType a2 = a.a((WebStickerType) it.next());
            if (a2 != null) {
                noneOf.add(a2);
            }
        }
        this.l = bVar;
        this.m = new r6i0(uei0Var, 2);
        a.C1830a c1830a = new a.C1830a();
        bVar.a = new m2l0(c1830a, 0);
        this.n = c1830a;
    }
}
