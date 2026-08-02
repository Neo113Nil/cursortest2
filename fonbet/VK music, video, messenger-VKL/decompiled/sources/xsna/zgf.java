package xsna;

import com.google.gson.Gson;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.clips.upload.model.ClipUploadParams;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.clips.morphing.AudioMorphingTypeStat;
import com.vk.dto.clips.upload.ClipTemplateInfo;
import com.vk.dto.common.clips.VideoTemplatePublishInfo;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.dto.stories.entities.stat.StickersStatInfo;
import com.vk.dto.stories.entities.stat.StoryStatContainer;
import com.vk.dto.stories.entities.stat.TextStatInfo;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ChangePreview;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipUploadSettingItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipUploadStickerItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: ClipsUploadRequestAnalyticsBuilder.kt */
/* loaded from: classes17.dex */
public final class zgf {

    /* compiled from: ClipsUploadRequestAnalyticsBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileOfficialAppsClipsStat$ChangePreview.PreviewType.values().length];
            try {
                iArr[MobileOfficialAppsClipsStat$ChangePreview.PreviewType.FIRST_FRAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileOfficialAppsClipsStat$ChangePreview.PreviewType.ORIGINAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MobileOfficialAppsClipsStat$ChangePreview.PreviewType.GALLERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016b A[LOOP:0: B:60:0x0165->B:62:0x016b, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MobileOfficialAppsClipsStat$TypeClipUploadItem a(ClipUploadParams clipUploadParams) {
        List<ClickableSticker> list;
        List<MaskLight> list2;
        boolean z;
        int i;
        MobileOfficialAppsClipsStat$TypeClipUploadItem.PreviewType previewType;
        boolean z2;
        Boolean bool;
        Iterator it;
        ?? r5;
        ?? r6;
        List list3;
        EmptyList emptyList;
        AudioMorphingTypeStat audioMorphingTypeStat;
        List<String> list4;
        List<ClickableSticker> list5;
        long j;
        Long l;
        List<TextStatInfo> list6;
        List<StickersStatInfo> list7;
        List<String> list8;
        List<StickersStatInfo> list9;
        List<TextStatInfo> list10;
        List<ClickableStickerStatInfo> list11;
        List<MaskLight> list12 = clipUploadParams.u;
        ClickableStickers clickableStickers = clipUploadParams.w;
        ClipUploadParams.LicensedAudioInfo licensedAudioInfo = clipUploadParams.D;
        StoryStatContainer storyStatContainer = clipUploadParams.E;
        boolean z3 = ((storyStatContainer == null || (list11 = storyStatContainer.f) == null || !(list11.isEmpty() ^ true)) && (clickableStickers == null || (list = clickableStickers.d) == null || !(list.isEmpty() ^ true))) ? false : true;
        int i2 = clipUploadParams.I;
        MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext = new MobileOfficialAppsClipsStat$ClipsCreateContext(clipUploadParams.b, wrp.a(clipUploadParams.c));
        int i3 = clipUploadParams.d / 1000;
        MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType cameraType = clipUploadParams.J;
        Integer valueOf = licensedAudioInfo != null ? Integer.valueOf(licensedAudioInfo.b) : null;
        Long valueOf2 = licensedAudioInfo != null ? Long.valueOf(licensedAudioInfo.c.b) : null;
        Integer num = licensedAudioInfo != null ? licensedAudioInfo.e : null;
        Long l2 = licensedAudioInfo != null ? licensedAudioInfo.f : null;
        Integer num2 = licensedAudioInfo != null ? licensedAudioInfo.d : null;
        List m = e43.m(licensedAudioInfo != null ? licensedAudioInfo.g : null);
        VideoTemplatePublishInfo videoTemplatePublishInfo = clipUploadParams.B;
        Integer num3 = videoTemplatePublishInfo != null ? videoTemplatePublishInfo.c : null;
        Long l3 = videoTemplatePublishInfo != null ? videoTemplatePublishInfo.d : null;
        boolean z4 = clipUploadParams.M;
        boolean z5 = clipUploadParams.N;
        boolean z6 = clipUploadParams.r != null;
        boolean z7 = clipUploadParams.P;
        boolean z8 = clipUploadParams.O;
        OrdData ordData = clipUploadParams.C;
        if (ordData != null) {
            list2 = list12;
            if (ordData.b) {
                z = true;
                String str = clipUploadParams.e;
                boolean z9 = clipUploadParams.L;
                i = a.$EnumSwitchMapping$0[clipUploadParams.n.ordinal()];
                if (i != 1) {
                    previewType = MobileOfficialAppsClipsStat$TypeClipUploadItem.PreviewType.FIRST_FRAME;
                } else if (i == 2) {
                    previewType = MobileOfficialAppsClipsStat$TypeClipUploadItem.PreviewType.ORIGINAL;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    previewType = MobileOfficialAppsClipsStat$TypeClipUploadItem.PreviewType.GALLERY;
                }
                MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType duetType = clipUploadParams.K;
                MobileOfficialAppsClipsStat$TypeClipUploadItem.PreviewType previewType2 = previewType;
                String str2 = clipUploadParams.i;
                if (list2 == null) {
                    z2 = true;
                    bool = Boolean.valueOf(!list2.isEmpty());
                } else {
                    z2 = true;
                    bool = null;
                }
                Boolean valueOf3 = (storyStatContainer != null || (list10 = storyStatContainer.b) == null) ? null : Boolean.valueOf(!list10.isEmpty());
                Boolean valueOf4 = (storyStatContainer != null || (list9 = storyStatContainer.c) == null) ? null : Boolean.valueOf(!list9.isEmpty());
                Boolean valueOf5 = (storyStatContainer != null || (list8 = storyStatContainer.e) == null) ? null : Boolean.valueOf(!list8.isEmpty());
                List<MaskLight> list13 = list2 != null ? EmptyList.b : list2;
                boolean z10 = z;
                ArrayList arrayList = new ArrayList(c5g.u(list13, 10));
                it = list13.iterator();
                while (it.hasNext()) {
                    MaskLight maskLight = (MaskLight) it.next();
                    arrayList.add(new Object(maskLight.b, maskLight.c.b, maskLight.d) { // from class: com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipUploadMaskItem

                        @pmi0("id")
                        private final int id;

                        @pmi0("owner_id")
                        private final long ownerId;

                        @pmi0("section")
                        private final int section;

                        {
                            this.id = r1;
                            this.ownerId = r2;
                            this.section = r4;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof MobileOfficialAppsClipsStat$ClipUploadMaskItem)) {
                                return false;
                            }
                            MobileOfficialAppsClipsStat$ClipUploadMaskItem mobileOfficialAppsClipsStat$ClipUploadMaskItem = (MobileOfficialAppsClipsStat$ClipUploadMaskItem) obj;
                            return this.id == mobileOfficialAppsClipsStat$ClipUploadMaskItem.id && this.ownerId == mobileOfficialAppsClipsStat$ClipUploadMaskItem.ownerId && this.section == mobileOfficialAppsClipsStat$ClipUploadMaskItem.section;
                        }

                        public final int hashCode() {
                            return Integer.hashCode(this.section) + bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId);
                        }

                        public final String toString() {
                            StringBuilder sb = new StringBuilder("ClipUploadMaskItem(id=");
                            sb.append(this.id);
                            sb.append(", ownerId=");
                            sb.append(this.ownerId);
                            sb.append(", section=");
                            return vu5.b(sb, this.section, ')');
                        }
                    });
                    it = it;
                    z3 = z3;
                    z5 = z5;
                }
                boolean z11 = z3;
                boolean z12 = z5;
                if (storyStatContainer != null || (list7 = storyStatContainer.c) == null) {
                    r5 = EmptyList.b;
                } else {
                    List<StickersStatInfo> list14 = list7;
                    r5 = new ArrayList(c5g.u(list14, 10));
                    for (Iterator it2 = list14.iterator(); it2.hasNext(); it2 = it2) {
                        StickersStatInfo stickersStatInfo = (StickersStatInfo) it2.next();
                        r5.add(new MobileOfficialAppsClipsStat$ClipUploadStickerItem(stickersStatInfo.c, stickersStatInfo.d, stickersStatInfo.b, stickersStatInfo.e));
                    }
                }
                if (storyStatContainer != null || (list6 = storyStatContainer.b) == null) {
                    r6 = EmptyList.b;
                } else {
                    List<TextStatInfo> list15 = list6;
                    r6 = new ArrayList(c5g.u(list15, 10));
                    for (Iterator it3 = list15.iterator(); it3.hasNext(); it3 = it3) {
                        TextStatInfo textStatInfo = (TextStatInfo) it3.next();
                        r6.add(new Object(textStatInfo.g, textStatInfo.d, textStatInfo.b, textStatInfo.c, textStatInfo.e, textStatInfo.f) { // from class: com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipUploadTextItem

                            @pmi0("align")
                            private final String align;

                            @pmi0(L2.g)
                            private final String background;

                            @pmi0("color")
                            private final String color;

                            @pmi0("font")
                            private final String font;

                            @pmi0("size")
                            private final int size;

                            @pmi0("text")
                            private final String text;

                            {
                                this.align = r1;
                                this.size = r2;
                                this.text = r3;
                                this.font = r4;
                                this.color = r5;
                                this.background = r6;
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof MobileOfficialAppsClipsStat$ClipUploadTextItem)) {
                                    return false;
                                }
                                MobileOfficialAppsClipsStat$ClipUploadTextItem mobileOfficialAppsClipsStat$ClipUploadTextItem = (MobileOfficialAppsClipsStat$ClipUploadTextItem) obj;
                                return epx.f(this.align, mobileOfficialAppsClipsStat$ClipUploadTextItem.align) && this.size == mobileOfficialAppsClipsStat$ClipUploadTextItem.size && epx.f(this.text, mobileOfficialAppsClipsStat$ClipUploadTextItem.text) && epx.f(this.font, mobileOfficialAppsClipsStat$ClipUploadTextItem.font) && epx.f(this.color, mobileOfficialAppsClipsStat$ClipUploadTextItem.color) && epx.f(this.background, mobileOfficialAppsClipsStat$ClipUploadTextItem.background);
                            }

                            public final int hashCode() {
                                return this.background.hashCode() + urd0.a(urd0.a(urd0.a(shy.a(this.size, this.align.hashCode() * 31, 31), 31, this.text), 31, this.font), 31, this.color);
                            }

                            public final String toString() {
                                StringBuilder sb = new StringBuilder("ClipUploadTextItem(align=");
                                sb.append(this.align);
                                sb.append(", size=");
                                sb.append(this.size);
                                sb.append(", text=");
                                sb.append(this.text);
                                sb.append(", font=");
                                sb.append(this.font);
                                sb.append(", color=");
                                sb.append(this.color);
                                sb.append(", background=");
                                return ho8.a(sb, this.background, ')');
                            }
                        });
                    }
                }
                List list16 = r6;
                if (clickableStickers != null || (list5 = clickableStickers.d) == null) {
                    list3 = r5;
                    emptyList = EmptyList.b;
                } else {
                    List<ClickableSticker> list17 = list5;
                    ?? arrayList2 = new ArrayList(c5g.u(list17, 10));
                    Iterator it4 = list17.iterator();
                    List list18 = r5;
                    while (it4.hasNext()) {
                        ClickableSticker clickableSticker = (ClickableSticker) it4.next();
                        JSONObject zb = clickableSticker.zb().zb();
                        String i4 = clickableSticker.Cb().i();
                        String D = f370.D(zb, TtmlNode.TAG_STYLE);
                        String D2 = f370.D(zb, "text_value");
                        List list19 = list18;
                        long j2 = clickableSticker.b;
                        Iterator it5 = it4;
                        Long z13 = f370.z(zb, "id_value");
                        if (z13 == null) {
                            if (f370.x(zb, "id_value") != null) {
                                j = j2;
                                z13 = Long.valueOf(r1.intValue());
                            } else {
                                j = j2;
                                l = null;
                                arrayList2.add(new MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem(i4, j, D, D2, l, null, null, null, 224, null));
                                list18 = list19;
                                it4 = it5;
                            }
                        } else {
                            j = j2;
                        }
                        l = z13;
                        arrayList2.add(new MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem(i4, j, D, D2, l, null, null, null, 224, null));
                        list18 = list19;
                        it4 = it5;
                    }
                    list3 = list18;
                    emptyList = arrayList2;
                }
                EmptyList emptyList2 = emptyList;
                List V = (storyStatContainer != null || (list4 = storyStatContainer.e) == null) ? null : j5g.V(list4);
                ArrayList arrayList3 = new ArrayList();
                audioMorphingTypeStat = clipUploadParams.t;
                if (audioMorphingTypeStat != null) {
                    List<AudioEffectType> list20 = audioMorphingTypeStat.b;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : list20) {
                        if (!epx.f(((AudioEffectType) obj).name(), "DEFAULT")) {
                            arrayList4.add(obj);
                        }
                    }
                    Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        arrayList3.add(cqm0.b(cqm0.m(((AudioEffectType) it6.next()).name())));
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name name = MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.USE_FOR_TEMPLATES;
                ClipTemplateInfo clipTemplateInfo = clipUploadParams.v;
                String str3 = clipUploadParams.h;
                arrayList5.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(name, clipTemplateInfo == null ? epx.f(clipTemplateInfo.d, Boolean.TRUE) : false));
                MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name name2 = MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.IS_MARKET_ONLINE_BOOKING_ENABLED;
                Boolean bool2 = clipUploadParams.o;
                arrayList5.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(name2, bool2 == null ? bool2.booleanValue() : false));
                MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name name3 = MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.IS_MARKET_MESSAGE_TO_BC_ENABLED;
                Boolean bool3 = clipUploadParams.p;
                arrayList5.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(name3, bool3 == null ? bool3.booleanValue() : false));
                arrayList5.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.POST_ON_WALL, clipUploadParams.g));
                arrayList5.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.ALLOW_DUETS, clipUploadParams.j));
                arrayList5.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.ALLOW_COMMENTS, (!epx.f(str3, PrivacyRules.c.d) || epx.f(str3, PrivacyRules.b.d)) ? false : z2));
                arrayList5.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.IS_DELAYED, clipUploadParams.m == 0 ? z2 : false));
                arrayList5.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.REPOST_IN_STORY, clipUploadParams.T));
                return new MobileOfficialAppsClipsStat$TypeClipUploadItem(null, i2, mobileOfficialAppsClipsStat$ClipsCreateContext, i3, cameraType, previewType2, valueOf, valueOf2, num, l2, num2, m, num3, l3, Boolean.valueOf(z4), Boolean.valueOf(z12), Boolean.valueOf(z6), Boolean.valueOf(z7), Boolean.valueOf(z8), Boolean.valueOf(z10), str, duetType, Boolean.valueOf(z9), str2, bool, valueOf4, valueOf5, valueOf3, Boolean.valueOf(z11), arrayList, V, arrayList3, list3, emptyList2, list16, arrayList5, Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis())), 1, 0, null);
            }
        } else {
            list2 = list12;
        }
        z = false;
        String str4 = clipUploadParams.e;
        boolean z92 = clipUploadParams.L;
        i = a.$EnumSwitchMapping$0[clipUploadParams.n.ordinal()];
        if (i != 1) {
        }
        MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType duetType2 = clipUploadParams.K;
        MobileOfficialAppsClipsStat$TypeClipUploadItem.PreviewType previewType22 = previewType;
        String str22 = clipUploadParams.i;
        if (list2 == null) {
        }
        if (storyStatContainer != null) {
        }
        if (storyStatContainer != null) {
        }
        if (storyStatContainer != null) {
        }
        List<MaskLight> list132 = list2 != null ? EmptyList.b : list2;
        boolean z102 = z;
        ArrayList arrayList6 = new ArrayList(c5g.u(list132, 10));
        it = list132.iterator();
        while (it.hasNext()) {
        }
        boolean z112 = z3;
        boolean z122 = z5;
        if (storyStatContainer != null) {
        }
        r5 = EmptyList.b;
        if (storyStatContainer != null) {
        }
        r6 = EmptyList.b;
        List list162 = r6;
        if (clickableStickers != null) {
        }
        list3 = r5;
        emptyList = EmptyList.b;
        EmptyList emptyList22 = emptyList;
        if (storyStatContainer != null) {
        }
        ArrayList arrayList32 = new ArrayList();
        audioMorphingTypeStat = clipUploadParams.t;
        if (audioMorphingTypeStat != null) {
        }
        ArrayList arrayList52 = new ArrayList();
        MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name name4 = MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.USE_FOR_TEMPLATES;
        ClipTemplateInfo clipTemplateInfo2 = clipUploadParams.v;
        String str32 = clipUploadParams.h;
        arrayList52.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(name4, clipTemplateInfo2 == null ? epx.f(clipTemplateInfo2.d, Boolean.TRUE) : false));
        MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name name22 = MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.IS_MARKET_ONLINE_BOOKING_ENABLED;
        Boolean bool22 = clipUploadParams.o;
        arrayList52.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(name22, bool22 == null ? bool22.booleanValue() : false));
        MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name name32 = MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.IS_MARKET_MESSAGE_TO_BC_ENABLED;
        Boolean bool32 = clipUploadParams.p;
        arrayList52.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(name32, bool32 == null ? bool32.booleanValue() : false));
        arrayList52.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.POST_ON_WALL, clipUploadParams.g));
        arrayList52.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.ALLOW_DUETS, clipUploadParams.j));
        arrayList52.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.ALLOW_COMMENTS, (!epx.f(str32, PrivacyRules.c.d) || epx.f(str32, PrivacyRules.b.d)) ? false : z2));
        arrayList52.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.IS_DELAYED, clipUploadParams.m == 0 ? z2 : false));
        arrayList52.add(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.REPOST_IN_STORY, clipUploadParams.T));
        return new MobileOfficialAppsClipsStat$TypeClipUploadItem(null, i2, mobileOfficialAppsClipsStat$ClipsCreateContext, i3, cameraType, previewType22, valueOf, valueOf2, num, l2, num2, m, num3, l3, Boolean.valueOf(z4), Boolean.valueOf(z122), Boolean.valueOf(z6), Boolean.valueOf(z7), Boolean.valueOf(z8), Boolean.valueOf(z102), str4, duetType2, Boolean.valueOf(z92), str22, bool, valueOf4, valueOf5, valueOf3, Boolean.valueOf(z112), arrayList6, V, arrayList32, list3, emptyList22, list162, arrayList52, Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis())), 1, 0, null);
    }

    public static String b(ClipUploadParams clipUploadParams) {
        return new Gson().toJson(a(clipUploadParams));
    }
}
