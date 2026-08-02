package xsna;

import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.music.AudioStreamMix;
import com.vk.catalog2.common.dto.api.music.AudioStreamMixTitles;
import com.vk.catalog2.common.dto.api.music.CatalogAudioStreamMix;
import com.vk.catalog2.common.dto.api.style.VkMixViewStyle;
import com.vk.catalog2.feature.music.dto.ui.UiBlockAndroidAutoVkMix;
import com.vk.toggle.features.CatalogFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.hfr;

/* compiled from: MusicAndroidAutoBlockCatalogTransformer.kt */
/* loaded from: classes16.dex */
public final class w940 implements xe7 {
    public static final Regex b = new Regex(".*/audiobook.*");
    public static final Regex c = new Regex(".*/podcast.*");

    /* compiled from: MusicAndroidAutoBlockCatalogTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.AUDIO_STREAM_MIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.AUDIO_STREAM_MIX_INTERACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.HEADER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.HEADER_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.HEADER_COMPACT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIO_STREAM_MIXES.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean a(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData) {
        hfr.a aVar = new hfr.a(rli0.t(new i5g(catalogBlock.m.c), new g6(20, catalogExtendedData, catalogBlock)));
        while (aVar.hasNext()) {
            CatalogLink catalogLink = (CatalogLink) aVar.next();
            if (b.f(catalogLink.e)) {
                return true;
            }
            if (c.f(catalogLink.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.xe7
    public final List f(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List list, oq8 oq8Var) {
        CatalogBlock catalogBlock2;
        CatalogDataType catalogDataType = catalogBlock.c;
        CatalogLayout catalogLayout = catalogBlock.i;
        boolean z = false;
        if (!com.vk.toggle.b.A.a(CatalogFeatures.ANDROID_AUTO_SHOWS_TAB)) {
            int i = a.$EnumSwitchMapping$1[catalogDataType.ordinal()];
            if (i == 3) {
                int i2 = a.$EnumSwitchMapping$0[catalogLayout.b.ordinal()];
                if (i2 == 4 || i2 == 5 || i2 == 6) {
                    int indexOf = list.indexOf(catalogBlock);
                    Integer valueOf = Integer.valueOf(indexOf);
                    if (indexOf < 0) {
                        valueOf = null;
                    }
                    if (valueOf != null && (catalogBlock2 = (CatalogBlock) j5g.b0(valueOf.intValue() + 1, list)) != null) {
                        if (catalogBlock2.c != CatalogDataType.DATA_TYPE_LINKS) {
                            catalogBlock2 = null;
                        }
                        if (catalogBlock2 != null && a(catalogBlock2, catalogExtendedData)) {
                            z = true;
                        }
                    }
                }
            } else if (i == 4) {
                z = a(catalogBlock, catalogExtendedData);
            }
        }
        if (z) {
            return EmptyList.b;
        }
        int i3 = a.$EnumSwitchMapping$1[catalogDataType.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                if (a.$EnumSwitchMapping$0[catalogLayout.b.ordinal()] == 3) {
                    return oq8Var.a(catalogExtendedData, catalogBlock.j, bi20Var);
                }
            }
            return null;
        }
        int i4 = a.$EnumSwitchMapping$0[catalogLayout.b.ordinal()];
        if (i4 != 1 && i4 != 2) {
            return EmptyList.b;
        }
        ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
        ArrayList arrayList = new ArrayList();
        Iterator it = Gb.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            CatalogAudioStreamMix catalogAudioStreamMix = next instanceof CatalogAudioStreamMix ? (CatalogAudioStreamMix) next : null;
            if (catalogAudioStreamMix != null) {
                arrayList.add(catalogAudioStreamMix);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CatalogAudioStreamMix catalogAudioStreamMix2 = (CatalogAudioStreamMix) it2.next();
            String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
            VkMixViewStyle.Style.Companion.getClass();
            com.vk.catalog2.common.dto.api.ui.a aVar = new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, new VkMixViewStyle(VkMixViewStyle.Style.a.a(string)), bi20Var.r, (CatalogLaunchOrigin) null, 5120);
            String str = catalogAudioStreamMix2.b;
            boolean z2 = catalogAudioStreamMix2.h;
            String str2 = catalogAudioStreamMix2.c;
            AudioStreamMixTitles audioStreamMixTitles = catalogAudioStreamMix2.f;
            if (audioStreamMixTitles == null) {
                AudioStreamMix audioStreamMix = catalogAudioStreamMix2.i;
                audioStreamMixTitles = new AudioStreamMixTitles(audioStreamMix != null ? audioStreamMix.c : null, null);
            }
            arrayList2.add(new UiBlockAndroidAutoVkMix(aVar, str, z2, str2, audioStreamMixTitles, catalogAudioStreamMix2.d, catalogAudioStreamMix2.g));
        }
        return arrayList2;
    }
}
