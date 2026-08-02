package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAdActionButtonDto;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ClipsRecomFeedItemsToSdkMapperImpl.kt */
/* loaded from: classes17.dex */
public final class h0f implements g0f, w8i {
    public static final h0f b = new h0f();
    public static final bpn0 c = new bpn0(new wv0(5));
    public static final bpn0 d = new bpn0(new xv0(4));
    public static final bpn0 e = new bpn0(new vi0(9));
    public static final bpn0 f = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.b(8));
    public static final k2r0 g = new k2r0();
    public static final j2r0 h = new j2r0();
    public static final equ i = new equ();
    public static final dqu j = new dqu();
    public static final bpn0 k = new bpn0(new g13(9));

    /* compiled from: ClipsRecomFeedItemsToSdkMapperImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShortVideoAdActionButtonDto.TypeDto.values().length];
            try {
                iArr[ShortVideoAdActionButtonDto.TypeDto.LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortVideoAdActionButtonDto.TypeDto.SUBSCRIBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShortVideoAdActionButtonDto.TypeDto.WRITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static zof b() {
        return (zof) c.getValue();
    }

    public static SdkImages c(List list) {
        List<BaseImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (BaseImageDto baseImageDto : list2) {
            arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
        }
        return fz5.C(new Image(arrayList));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v51 xsna.wih0$b, still in use, count: 2, list:
          (r7v51 xsna.wih0$b) from 0x076e: MOVE (r82v8 xsna.wih0$b) = (r7v51 xsna.wih0$b)
          (r7v51 xsna.wih0$b) from 0x0758: MOVE (r82v10 xsna.wih0$b) = (r7v51 xsna.wih0$b)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v70, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v71, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v130 */
    /* JADX WARN: Type inference failed for: r7v52, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v94, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v96 */
    /* JADX WARN: Type inference failed for: r7v97 */
    /* JADX WARN: Type inference failed for: r7v98 */
    @Override // xsna.g0f
    public final xsna.g0f.a a(java.util.List<? extends com.vk.api.generated.shortVideo.dto.ShortVideoRecomFeedItemDto> r81, java.util.List<com.vk.api.generated.users.dto.UsersUserFullDto> r82, java.util.List<com.vk.api.generated.groups.dto.GroupsGroupFullDto> r83, java.util.List<com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto> r84, java.util.List<com.vk.api.generated.masks.dto.MasksEffectDto> r85, java.util.List<com.vk.api.generated.masks.dto.MasksMaskDto> r86, java.util.List<com.vk.api.generated.market.dto.MarketMarketItemDto> r87, java.util.List<com.vk.api.generated.shortVideo.dto.ShortVideoCompilationInfoDto> r88, java.util.List<com.vk.api.generated.places.dto.PlacesPlaceDto> r89, com.vk.clips.sdk.shared.api.recom.ShortVideoMyTargetMapperTracker r90) {
        /*
            Method dump skipped, instructions count: 4284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.h0f.a(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, com.vk.clips.sdk.shared.api.recom.ShortVideoMyTargetMapperTracker):xsna.g0f$a");
    }
}
