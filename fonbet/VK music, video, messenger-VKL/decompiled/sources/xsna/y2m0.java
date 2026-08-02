package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.stories.design.view.stickerbutton.StickerType;
import com.vk.story.api.storyflexboxfactory.StickerButtonType;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StoryFlexboxFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class y2m0 implements x2m0 {

    /* compiled from: StoryFlexboxFactoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StickerType.values().length];
            try {
                iArr[StickerType.MENTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerType.LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerType.PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickerType.PHOTO_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StickerType.HASHTAG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StickerType.LOCATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StickerType.POLL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StickerType.GIF.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StickerType.TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StickerType.TIME_REGULAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StickerType.PRODUCT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[StickerType.SERVICE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[StickerType.MUSIC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[StickerType.OPINION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[StickerType.REACTION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StickerButtonType.values().length];
            try {
                iArr2[StickerButtonType.MENTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[StickerButtonType.LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[StickerButtonType.PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[StickerButtonType.HASHTAG.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[StickerButtonType.LOCATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[StickerButtonType.POLL.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[StickerButtonType.GIF.ordinal()] = 7;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[StickerButtonType.TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[StickerButtonType.PRODUCT.ordinal()] = 9;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[StickerButtonType.SERVICE.ordinal()] = 10;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[StickerButtonType.MUSIC.ordinal()] = 11;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[StickerButtonType.OPINION.ordinal()] = 12;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[StickerButtonType.REACTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.x2m0
    public final ViewGroup a(Context context, EnumSet enumSet, r6i0 r6i0Var, boolean z) {
        StickerType stickerType;
        if (z) {
            Object obj = com.vk.stories.design.view.stickerbutton.a.a;
            StoriesFeatures storiesFeatures = StoriesFeatures.ST_REACTION_STICKER;
            storiesFeatures.getClass();
            return (ViewGroup) LayoutInflater.from(context).inflate(com.vk.toggle.b.A.a(storiesFeatures) ? R.layout.pds_stories_sticker_buttons_2_layout : R.layout.pds_stories_sticker_buttons_layout, (ViewGroup) null, false);
        }
        Object obj2 = com.vk.stories.design.view.stickerbutton.a.a;
        EnumSet noneOf = EnumSet.noneOf(StickerType.class);
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            switch (a.$EnumSwitchMapping$1[((StickerButtonType) it.next()).ordinal()]) {
                case 1:
                    stickerType = StickerType.MENTION;
                    break;
                case 2:
                    stickerType = StickerType.LINK;
                    break;
                case 3:
                    stickerType = StickerType.PHOTO_SMALL;
                    break;
                case 4:
                    stickerType = StickerType.HASHTAG;
                    break;
                case 5:
                    stickerType = StickerType.LOCATION;
                    break;
                case 6:
                    stickerType = StickerType.POLL;
                    break;
                case 7:
                    stickerType = StickerType.GIF;
                    break;
                case 8:
                    stickerType = StickerType.TIME_REGULAR;
                    break;
                case 9:
                    stickerType = StickerType.PRODUCT;
                    break;
                case 10:
                    stickerType = StickerType.SERVICE;
                    break;
                case 11:
                    stickerType = StickerType.MUSIC;
                    break;
                case 12:
                    stickerType = StickerType.OPINION;
                    break;
                case 13:
                    stickerType = StickerType.REACTION;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            noneOf.add(stickerType);
        }
        m2l0 m2l0Var = new m2l0(r6i0Var, this);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.pds_clips_sticker_buttons_layout, (ViewGroup) null, false);
        for (Map.Entry entry : com.vk.stories.design.view.stickerbutton.a.a.entrySet()) {
            StickerType stickerType2 = (StickerType) entry.getKey();
            View findViewById = viewGroup.findViewById(((Number) entry.getValue()).intValue());
            if (findViewById != null) {
                findViewById.setOnClickListener(new a6u(2, m2l0Var, stickerType2));
                findViewById.setEnabled(noneOf.contains(stickerType2));
            }
        }
        return viewGroup;
    }
}
