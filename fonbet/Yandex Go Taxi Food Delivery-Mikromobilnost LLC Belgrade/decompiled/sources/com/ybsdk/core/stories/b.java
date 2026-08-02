package com.ybsdk.core.stories;

import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.stories.dto.AdvertisementDisclosureDto;
import com.ybsdk.core.stories.dto.Background;
import com.ybsdk.core.stories.dto.CommunicationFullScreenBullet;
import com.ybsdk.core.stories.dto.CommunicationFullScreenButton;
import com.ybsdk.core.stories.dto.CommunicationFullScreenButtonGroup;
import com.ybsdk.core.stories.dto.CommunicationFullScreenImage;
import com.ybsdk.core.stories.dto.CommunicationFullScreenText;
import com.ybsdk.core.stories.dto.FullScreenDto;
import com.ybsdk.core.stories.dto.HorizontalAlignment;
import com.ybsdk.core.stories.dto.LegalAgreement;
import com.ybsdk.core.stories.dto.ProgressStyle;
import com.ybsdk.core.stories.dto.StoriesResponse;
import com.ybsdk.core.stories.dto.StoryItem;
import com.ybsdk.core.stories.dto.StoryItemMode;
import com.ybsdk.core.stories.dto.VerticalStoriesResponse;
import com.ybsdk.core.stories.dto.VerticalStory;
import com.ybsdk.core.stories.dto.VideoSettingsDto;
import com.ybsdk.core.stories.entities.HorizontalAlignmentEntity;
import com.ybsdk.core.stories.entities.StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.widgets.common.ImageScaleTypeDto;
import com.ybsdk.widgets.common.ImageScaleTypeEntity;
import defpackage.fob1;
import defpackage.fxy0;
import defpackage.g5b1;
import defpackage.g8e;
import defpackage.hmu0;
import defpackage.it6;
import defpackage.jl40;
import defpackage.lvy0;
import defpackage.mrc;
import defpackage.nbv;
import defpackage.ny61;
import defpackage.oe1;
import defpackage.og31;
import defpackage.omu0;
import defpackage.pmu0;
import defpackage.rbv;
import defpackage.rr51;
import defpackage.smu0;
import defpackage.tay;
import defpackage.tcc;
import defpackage.tou0;
import defpackage.uou0;
import defpackage.vjf0;
import defpackage.vou0;
import defpackage.vz6;
import defpackage.w511;
import defpackage.wou0;
import defpackage.x4c;
import defpackage.zz6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes2.dex */
public abstract class b {
    public static final vz6 a(CommunicationFullScreenButton communicationFullScreenButton) {
        Text.Constant i = g8e.i(Text.Companion, communicationFullScreenButton.getText());
        Themes<String> textColor = communicationFullScreenButton.getTextColor();
        ColorModel c = textColor != null ? lvy0.c(textColor) : null;
        String action = communicationFullScreenButton.getAction();
        Themes<String> backgroundColor = communicationFullScreenButton.getBackgroundColor();
        return new vz6(i, c, action, backgroundColor != null ? lvy0.c(backgroundColor) : null);
    }

    public static final mrc b(CommunicationFullScreenText communicationFullScreenText) {
        Text.Constant i = g8e.i(Text.Companion, communicationFullScreenText.getText());
        Themes<String> textColor = communicationFullScreenText.getTextColor();
        HorizontalAlignmentEntity horizontalAlignmentEntity = null;
        ColorModel c = textColor != null ? lvy0.c(textColor) : null;
        HorizontalAlignment alignment = communicationFullScreenText.getAlignment();
        int i2 = alignment == null ? -1 : pmu0.b[alignment.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                horizontalAlignmentEntity = HorizontalAlignmentEntity.LEFT;
            } else if (i2 == 2) {
                horizontalAlignmentEntity = HorizontalAlignmentEntity.CENTER;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                horizontalAlignmentEntity = HorizontalAlignmentEntity.RIGHT;
            }
        }
        return new mrc(i, horizontalAlignmentEntity, c, communicationFullScreenText.getTextStyle());
    }

    public static final tay c(LegalAgreement legalAgreement) {
        Text.Constant i = g8e.i(Text.Companion, legalAgreement.getHtml());
        Themes<String> textColor = legalAgreement.getTextColor();
        ColorModel c = textColor != null ? lvy0.c(textColor) : null;
        Themes<String> linkColor = legalAgreement.getLinkColor();
        return new tay(i, c, linkColor != null ? lvy0.c(linkColor) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public static final vou0 d(FullScreenDto fullScreenDto, String str, int i) {
        ArrayList arrayList;
        ?? r2;
        zz6 zz6Var;
        uou0 uou0Var;
        ImageScaleTypeEntity imageScaleTypeEntity;
        oe1 oe1Var;
        ImageScaleTypeDto imageScaleType;
        StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode storyItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode;
        it6 it6Var;
        CommunicationFullScreenImage image;
        List<Themes<String>> gradientColors;
        Themes<String> themedColor;
        mrc b = b(fullScreenDto.getTitle());
        CommunicationFullScreenText subtitle = fullScreenDto.getSubtitle();
        mrc b2 = subtitle != null ? b(subtitle) : null;
        Background background = fullScreenDto.getBackground();
        ColorModel c = (background == null || (themedColor = background.getThemedColor()) == null) ? null : lvy0.c(themedColor);
        Background background2 = fullScreenDto.getBackground();
        if (background2 == null || (gradientColors = background2.getGradientColors()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = gradientColors.iterator();
            while (it.hasNext()) {
                ColorModel c2 = lvy0.c((Themes) it.next());
                if (c2 != null) {
                    arrayList2.add(c2);
                }
            }
            arrayList = arrayList2;
        }
        Background background3 = fullScreenDto.getBackground();
        rbv i2 = (background3 == null || (image = background3.getImage()) == null) ? null : i(image);
        List<CommunicationFullScreenBullet> bullets = fullScreenDto.getBullets();
        if (bullets != null) {
            r2 = new ArrayList();
            for (CommunicationFullScreenBullet communicationFullScreenBullet : bullets) {
                rbv i3 = i(communicationFullScreenBullet.getImage());
                if (i3 == null) {
                    x4c.g("bullets does not have an image", null, null, null, 14);
                }
                if (i3 != null) {
                    String title = communicationFullScreenBullet.getTitle();
                    Text.Constant i4 = title != null ? g8e.i(Text.Companion, title) : null;
                    Themes<String> titleColor = communicationFullScreenBullet.getTitleColor();
                    ColorModel c3 = titleColor != null ? lvy0.c(titleColor) : null;
                    String subtitle2 = communicationFullScreenBullet.getSubtitle();
                    Text.Constant i5 = subtitle2 != null ? g8e.i(Text.Companion, subtitle2) : null;
                    Themes<String> subtitleColor = communicationFullScreenBullet.getSubtitleColor();
                    it6Var = new it6(i4, c3, i5, subtitleColor != null ? lvy0.c(subtitleColor) : null, i3);
                } else {
                    it6Var = null;
                }
                if (it6Var != null) {
                    r2.add(it6Var);
                }
            }
        } else {
            r2 = EmptyList.a;
        }
        List list = r2;
        CommunicationFullScreenButtonGroup buttonGroup = fullScreenDto.getButtonGroup();
        if (buttonGroup != null) {
            vz6 a = a(buttonGroup.getFirstButton());
            CommunicationFullScreenButton secondButton = buttonGroup.getSecondButton();
            vz6 a2 = secondButton != null ? a(secondButton) : null;
            LegalAgreement legalAgreement = buttonGroup.getLegalAgreement();
            zz6Var = new zz6(a, a2, legalAgreement != null ? c(legalAgreement) : null);
        } else {
            zz6Var = null;
        }
        VideoSettingsDto video = fullScreenDto.getVideo();
        if (video != null) {
            fxy0 entity = video.getUri().toEntity();
            StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode[] values = StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode.values();
            int length = values.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    storyItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode = null;
                    break;
                }
                storyItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode = values[i6];
                if (jl40.l(storyItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode.name(), video.getRepeatMode())) {
                    break;
                }
                i6++;
            }
            if (storyItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode == null) {
                storyItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode = StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode.OFF;
            }
            uou0Var = new uou0(entity, storyItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode);
        } else {
            uou0Var = null;
        }
        Background background4 = fullScreenDto.getBackground();
        if (background4 == null || (imageScaleType = background4.getImageScaleType()) == null || (imageScaleTypeEntity = g5b1.b(imageScaleType)) == null) {
            imageScaleTypeEntity = ImageScaleTypeEntity.DEFAULT;
        }
        ImageScaleTypeEntity imageScaleTypeEntity2 = imageScaleTypeEntity;
        AdvertisementDisclosureDto advertisementDisclosure = fullScreenDto.getAdvertisementDisclosure();
        if (advertisementDisclosure != null) {
            String text = advertisementDisclosure.getText();
            String action = advertisementDisclosure.getAction();
            Themes<String> trailingIcon = advertisementDisclosure.getTrailingIcon();
            rbv c4 = trailingIcon != null ? fob1.c(trailingIcon.getLight(), trailingIcon.getDark(), new omu0(0)) : null;
            Themes<String> contentColor = advertisementDisclosure.getContentColor();
            ColorModel c5 = contentColor != null ? lvy0.c(contentColor) : null;
            Themes<String> backgroundColor = advertisementDisclosure.getBackgroundColor();
            oe1Var = new oe1(text, action, c4, c5, backgroundColor != null ? lvy0.c(backgroundColor) : null);
        } else {
            oe1Var = null;
        }
        return new vou0(str, b, b2, c, arrayList, i2, list, zz6Var, i, uou0Var, imageScaleTypeEntity2, oe1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006c -> B:10:0x006f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(StoriesResponse storiesResponse, ContinuationImpl continuationImpl) {
        StoriesMapperKt$toEntity$5 storiesMapperKt$toEntity$5;
        int i;
        List list;
        Collection arrayList;
        StoriesResponse storiesResponse2;
        Iterator it;
        if (continuationImpl instanceof StoriesMapperKt$toEntity$5) {
            storiesMapperKt$toEntity$5 = (StoriesMapperKt$toEntity$5) continuationImpl;
            int i2 = storiesMapperKt$toEntity$5.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesMapperKt$toEntity$5.label = i2 - Integer.MIN_VALUE;
                Object obj = storiesMapperKt$toEntity$5.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesMapperKt$toEntity$5.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List<StoryItem> storyItemsList = storiesResponse.getStoryItemsList();
                    if (storyItemsList == null) {
                        list = null;
                        CommunicationFullScreenButton primaryButton = storiesResponse.getPrimaryButton();
                        if (primaryButton == null) {
                        }
                        LegalAgreement legalAgreement = storiesResponse.getLegalAgreement();
                        return new hmu0(list, r7, legalAgreement != null ? c(legalAgreement) : null, storiesResponse.getActionAfterLast(), storiesResponse.getOverriddenCloseAction());
                    }
                    arrayList = new ArrayList();
                    Iterator it2 = storyItemsList.iterator();
                    storiesResponse2 = storiesResponse;
                    it = it2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) storiesMapperKt$toEntity$5.L$2;
                    arrayList = (Collection) storiesMapperKt$toEntity$5.L$1;
                    StoriesResponse storiesResponse3 = (StoriesResponse) storiesMapperKt$toEntity$5.L$0;
                    kotlin.b.b(obj);
                    wou0 wou0Var = (wou0) obj;
                    if (wou0Var != null) {
                        arrayList.add(wou0Var);
                    }
                    storiesResponse2 = storiesResponse3;
                    if (it.hasNext()) {
                        StoryItem storyItem = (StoryItem) it.next();
                        storiesMapperKt$toEntity$5.L$0 = storiesResponse2;
                        storiesMapperKt$toEntity$5.L$1 = arrayList;
                        storiesMapperKt$toEntity$5.L$2 = it;
                        storiesMapperKt$toEntity$5.label = 1;
                        Object f = f(storyItem, storiesMapperKt$toEntity$5);
                        if (f == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        storiesResponse3 = storiesResponse2;
                        obj = f;
                        wou0 wou0Var2 = (wou0) obj;
                        if (wou0Var2 != null) {
                        }
                        storiesResponse2 = storiesResponse3;
                        if (it.hasNext()) {
                            storiesResponse = storiesResponse2;
                            list = (List) arrayList;
                            CommunicationFullScreenButton primaryButton2 = storiesResponse.getPrimaryButton();
                            vz6 a = primaryButton2 == null ? a(primaryButton2) : null;
                            LegalAgreement legalAgreement2 = storiesResponse.getLegalAgreement();
                            return new hmu0(list, a, legalAgreement2 != null ? c(legalAgreement2) : null, storiesResponse.getActionAfterLast(), storiesResponse.getOverriddenCloseAction());
                        }
                    }
                }
            }
        }
        storiesMapperKt$toEntity$5 = new StoriesMapperKt$toEntity$5(continuationImpl);
        Object obj2 = storiesMapperKt$toEntity$5.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesMapperKt$toEntity$5.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(StoryItem storyItem, ContinuationImpl continuationImpl) {
        StoriesMapperKt$toEntity$7 storiesMapperKt$toEntity$7;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Object obj;
        StoryItem storyItem2;
        Ref$ObjectRef ref$ObjectRef3;
        T t;
        Background background;
        List<Themes<String>> gradientColors;
        Background background2;
        Themes<String> themedColor;
        boolean z;
        if (continuationImpl instanceof StoriesMapperKt$toEntity$7) {
            storiesMapperKt$toEntity$7 = (StoriesMapperKt$toEntity$7) continuationImpl;
            int i2 = storiesMapperKt$toEntity$7.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesMapperKt$toEntity$7.label = i2 - Integer.MIN_VALUE;
                Object obj2 = storiesMapperKt$toEntity$7.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesMapperKt$toEntity$7.label;
                ArrayList arrayList = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    StoryItemMode storyItemMode = storyItem.getStoryItemMode();
                    int i3 = storyItemMode == null ? -1 : pmu0.a[storyItemMode.ordinal()];
                    if (i3 == -1) {
                        x4c.g("The type of incoming data is not set. StoryItemMode = null", null, null, null, 14);
                        FullScreenDto fullScreen = storyItem.getFullScreen();
                        if (fullScreen != null) {
                            return d(fullScreen, storyItem.getId(), storyItem.getMaxProgressValueMs());
                        }
                    } else if (i3 == 1) {
                        ref$ObjectRef = new Ref$ObjectRef();
                        DivDataDto divkitData = storyItem.getDivkitData();
                        if (divkitData != null) {
                            com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                            storiesMapperKt$toEntity$7.L$0 = storyItem;
                            storiesMapperKt$toEntity$7.L$1 = ref$ObjectRef;
                            storiesMapperKt$toEntity$7.L$2 = ref$ObjectRef;
                            storiesMapperKt$toEntity$7.label = 1;
                            Object b = aVar.b(divkitData, storiesMapperKt$toEntity$7);
                            if (b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ref$ObjectRef2 = ref$ObjectRef;
                            obj = b;
                            storyItem2 = storyItem;
                            ref$ObjectRef3 = ref$ObjectRef2;
                        }
                        t = ref$ObjectRef.element;
                        if (t != 0) {
                            rr51 rr51Var = (rr51) t;
                            String str = rr51Var.e;
                            FullScreenDto fullScreen2 = storyItem.getFullScreen();
                            ColorModel c = (fullScreen2 == null || (background2 = fullScreen2.getBackground()) == null || (themedColor = background2.getThemedColor()) == null) ? null : lvy0.c(themedColor);
                            FullScreenDto fullScreen3 = storyItem.getFullScreen();
                            if (fullScreen3 != null && (background = fullScreen3.getBackground()) != null && (gradientColors = background.getGradientColors()) != null) {
                                arrayList = new ArrayList();
                                Iterator<T> it = gradientColors.iterator();
                                while (it.hasNext()) {
                                    ColorModel c2 = lvy0.c((Themes) it.next());
                                    if (c2 != null) {
                                        arrayList.add(c2);
                                    }
                                }
                            }
                            return new tou0(str, rr51Var, c, arrayList, storyItem.getMaxProgressValueMs());
                        }
                        FullScreenDto fullScreen4 = storyItem.getFullScreen();
                        if (fullScreen4 != null) {
                            return d(fullScreen4, storyItem.getId(), storyItem.getMaxProgressValueMs());
                        }
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        FullScreenDto fullScreen5 = storyItem.getFullScreen();
                        if (fullScreen5 != null) {
                            return d(fullScreen5, storyItem.getId(), storyItem.getMaxProgressValueMs());
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef3 = (Ref$ObjectRef) storiesMapperKt$toEntity$7.L$2;
                ref$ObjectRef2 = (Ref$ObjectRef) storiesMapperKt$toEntity$7.L$1;
                storyItem2 = (StoryItem) storiesMapperKt$toEntity$7.L$0;
                kotlin.b.b(obj2);
                obj = ((Result) obj2).getValue();
                z = obj instanceof Result.Failure;
                T t2 = obj;
                if (z) {
                    t2 = 0;
                }
                ref$ObjectRef3.element = t2;
                storyItem = storyItem2;
                ref$ObjectRef = ref$ObjectRef2;
                t = ref$ObjectRef.element;
                if (t != 0) {
                }
            }
        }
        storiesMapperKt$toEntity$7 = new StoriesMapperKt$toEntity$7(continuationImpl);
        Object obj22 = storiesMapperKt$toEntity$7.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesMapperKt$toEntity$7.label;
        ArrayList arrayList2 = null;
        if (i != 0) {
        }
        z = obj instanceof Result.Failure;
        T t22 = obj;
        if (z) {
        }
        ref$ObjectRef3.element = t22;
        storyItem = storyItem2;
        ref$ObjectRef = ref$ObjectRef2;
        t = ref$ObjectRef.element;
        if (t != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006f -> B:10:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(VerticalStoriesResponse verticalStoriesResponse, ContinuationImpl continuationImpl) {
        StoriesMapperKt$toEntity$1 storiesMapperKt$toEntity$1;
        int i;
        Iterator it;
        Collection collection;
        if (continuationImpl instanceof StoriesMapperKt$toEntity$1) {
            storiesMapperKt$toEntity$1 = (StoriesMapperKt$toEntity$1) continuationImpl;
            int i2 = storiesMapperKt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesMapperKt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = storiesMapperKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesMapperKt$toEntity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List<VerticalStory> stories = verticalStoriesResponse.getStories();
                    ArrayList arrayList = new ArrayList(tcc.n(stories, 10));
                    it = stories.iterator();
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) storiesMapperKt$toEntity$1.L$2;
                    it = (Iterator) storiesMapperKt$toEntity$1.L$1;
                    Collection collection2 = (Collection) storiesMapperKt$toEntity$1.L$0;
                    kotlin.b.b(obj);
                    collection.add((smu0) obj);
                    collection = collection2;
                    if (it.hasNext()) {
                        VerticalStory verticalStory = (VerticalStory) it.next();
                        storiesMapperKt$toEntity$1.L$0 = collection;
                        storiesMapperKt$toEntity$1.L$1 = it;
                        storiesMapperKt$toEntity$1.L$2 = collection;
                        storiesMapperKt$toEntity$1.label = 1;
                        obj = h(verticalStory, storiesMapperKt$toEntity$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        collection2 = collection;
                        collection.add((smu0) obj);
                        collection = collection2;
                        if (it.hasNext()) {
                            return new og31((List) collection);
                        }
                    }
                }
            }
        }
        storiesMapperKt$toEntity$1 = new StoriesMapperKt$toEntity$1(continuationImpl);
        Object obj2 = storiesMapperKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesMapperKt$toEntity$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0074 -> B:10:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(VerticalStory verticalStory, ContinuationImpl continuationImpl) {
        StoriesMapperKt$toEntity$3 storiesMapperKt$toEntity$3;
        int i;
        Collection arrayList;
        Iterator it;
        VerticalStory verticalStory2;
        String str;
        vjf0 vjf0Var;
        if (continuationImpl instanceof StoriesMapperKt$toEntity$3) {
            storiesMapperKt$toEntity$3 = (StoriesMapperKt$toEntity$3) continuationImpl;
            int i2 = storiesMapperKt$toEntity$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesMapperKt$toEntity$3.label = i2 - Integer.MIN_VALUE;
                Object obj = storiesMapperKt$toEntity$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesMapperKt$toEntity$3.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String id = verticalStory.getId();
                    List<StoryItem> storyItems = verticalStory.getStoryItems();
                    arrayList = new ArrayList();
                    it = storyItems.iterator();
                    verticalStory2 = verticalStory;
                    str = id;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) storiesMapperKt$toEntity$3.L$3;
                    it = (Iterator) storiesMapperKt$toEntity$3.L$2;
                    arrayList = (Collection) storiesMapperKt$toEntity$3.L$1;
                    VerticalStory verticalStory3 = (VerticalStory) storiesMapperKt$toEntity$3.L$0;
                    kotlin.b.b(obj);
                    wou0 wou0Var = (wou0) obj;
                    if (wou0Var != null) {
                        arrayList.add(wou0Var);
                    }
                    verticalStory2 = verticalStory3;
                    if (it.hasNext()) {
                        StoryItem storyItem = (StoryItem) it.next();
                        storiesMapperKt$toEntity$3.L$0 = verticalStory2;
                        storiesMapperKt$toEntity$3.L$1 = arrayList;
                        storiesMapperKt$toEntity$3.L$2 = it;
                        storiesMapperKt$toEntity$3.L$3 = str;
                        storiesMapperKt$toEntity$3.label = 1;
                        Object f = f(storyItem, storiesMapperKt$toEntity$3);
                        if (f == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        verticalStory3 = verticalStory2;
                        obj = f;
                        wou0 wou0Var2 = (wou0) obj;
                        if (wou0Var2 != null) {
                        }
                        verticalStory2 = verticalStory3;
                        if (it.hasNext()) {
                            List list = (List) arrayList;
                            ProgressStyle progressStyle = verticalStory2.getProgressStyle();
                            if (progressStyle != null) {
                                Themes<String> trackColor = progressStyle.getTrackColor();
                                ColorModel c = trackColor != null ? lvy0.c(trackColor) : null;
                                Themes<String> indicatorColor = progressStyle.getIndicatorColor();
                                vjf0Var = new vjf0(c, indicatorColor != null ? lvy0.c(indicatorColor) : null);
                            } else {
                                vjf0Var = null;
                            }
                            Themes<String> closeIconColor = verticalStory2.getCloseIconColor();
                            return new smu0(str, list, vjf0Var, closeIconColor != null ? lvy0.c(closeIconColor) : null);
                        }
                    }
                }
            }
        }
        storiesMapperKt$toEntity$3 = new StoriesMapperKt$toEntity$3(continuationImpl);
        Object obj2 = storiesMapperKt$toEntity$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesMapperKt$toEntity$3.label;
        if (i != 0) {
        }
    }

    public static final rbv i(CommunicationFullScreenImage communicationFullScreenImage) {
        Object obj;
        int i = pmu0.c[communicationFullScreenImage.getMode().ordinal()];
        if (i == 1) {
            String assetName = communicationFullScreenImage.getAssetName();
            if (assetName != null) {
                LocalImageEnum.Companion.getClass();
                Iterator<E> it = LocalImageEnum.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((LocalImageEnum) obj).getAssertName(), assetName)) {
                        break;
                    }
                }
                LocalImageEnum localImageEnum = (LocalImageEnum) obj;
                int i2 = localImageEnum == null ? -1 : pmu0.d[localImageEnum.ordinal()];
                if (i2 == 1) {
                    return fob1.a(new nbv(localImageEnum.getLightId(), null), new nbv(localImageEnum.getDarkId(), null));
                }
                if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                    return new nbv(localImageEnum.getLightId(), null);
                }
            }
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            Themes<String> image = communicationFullScreenImage.getImage();
            if (image != null) {
                return fob1.c(image.getLight(), image.getDark(), new omu0(0));
            }
        }
        return null;
    }
}
