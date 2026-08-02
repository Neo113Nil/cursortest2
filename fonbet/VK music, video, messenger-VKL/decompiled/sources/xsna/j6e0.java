package xsna;

import android.location.Location;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.stickers.dto.StickersPackPreviewDto;
import com.vk.api.generated.stickers.dto.StickersPackPreviewsChunkDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.log.L;
import com.vk.posting.presentation.video.search.h;
import com.vk.video.ui.discovery.minimizable.dialog.about.VideoAboutFragment;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import com.vk.vmoji.character.model.VmojiStickerPacksModel;
import com.vk.voip.ui.qr.ui.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptySet;
import xsna.loh0;
import xsna.qmw0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class j6e0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ j6e0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.HashSet] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? r1;
        boolean z = false;
        switch (this.b) {
            case 0:
                qyg0 V0 = ((hyg0) obj).V0("SELECT id FROM promoted_stickers");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        arrayList.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 1:
                return tnf0.i;
            case 2:
                qgi0.r((tgi0) obj, "backButton");
                return s3q0.a;
            case 3:
                return new et6(((Float) obj).floatValue());
            case 4:
                dhw0 dhw0Var = (dhw0) ((it80) obj).a;
                return new it80(dhw0Var != null ? dhw0Var.r : null);
            case 5:
                kmb0 kmb0Var = (kmb0) obj;
                if (kmb0Var != null && kmb0Var.a == 2) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 6:
                return loh0.e.b.a;
            case 7:
                return new h.a(((tj50.a) obj).e(szh0.b));
            case 8:
                qgi0.c((tgi0) obj);
                return s3q0.a;
            case 9:
                L.g("Error on share link prepare: ", (Throwable) obj);
                return s3q0.a;
            case 10:
                return Boolean.valueOf(((it80) obj).a());
            case 11:
                return s3q0.a;
            case 12:
                return Integer.valueOf(((k9l0) obj).m);
            case 13:
                List<hvu> list = ((u4m0) obj).a;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((hvu) it.next()).a);
                }
                return arrayList2;
            case 14:
                g9a g9aVar = new g9a();
                ((jmg0) obj).a.add(g9aVar);
                grm0 grm0Var = new grm0(btm0.b);
                id3 id3Var = g9aVar.a;
                id3Var.a.add(grm0Var);
                hd3.b(id3Var, "✅");
                s3q0 s3q0Var = s3q0.a;
                return s3q0.a;
            case 15:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 16:
                it80.b.getClass();
                return new it80((Location) obj);
            case 17:
                int i = VideoAboutFragment.S;
                qgi0.r((tgi0) obj, "close_tag");
                return s3q0.a;
            case 18:
                ImageSize Cb = ((Image) obj).Cb(VideoFullscreenBottomBarView.l, false, false);
                if (Cb != null) {
                    return Cb.d.d;
                }
                return null;
            case 19:
                return ((com.vk.video.ui.discovery.minimizable.q) obj).l.d.b;
            case 20:
                return BaseOkResponseDto.OK;
            case 21:
                StickersPackPreviewsChunkDto stickersPackPreviewsChunkDto = (StickersPackPreviewsChunkDto) obj;
                Serializer.c<VmojiStickerPacksModel> cVar = VmojiStickerPacksModel.CREATOR;
                List<StickersPackPreviewDto> e = stickersPackPreviewsChunkDto.e();
                ArrayList arrayList3 = new ArrayList(c5g.u(e, 10));
                for (StickersPackPreviewDto stickersPackPreviewDto : e) {
                    Serializer.c<VmojiStickerPackPreviewModel> cVar2 = VmojiStickerPackPreviewModel.CREATOR;
                    arrayList3.add(VmojiStickerPackPreviewModel.a.a(stickersPackPreviewDto));
                }
                return new VmojiStickerPacksModel(arrayList3, stickersPackPreviewsChunkDto.d());
            case 22:
                Dialog dialog = (Dialog) obj;
                int Jb = dialog.Jb();
                ChatSettings Hb = dialog.Hb();
                if (Hb != null) {
                    LinkedHashSet k = izi0.k(Hb.e, Hb.d);
                    r1 = new HashSet();
                    Iterator it2 = k.iterator();
                    while (it2.hasNext()) {
                        r1.add(new UserId(((Peer) it2.next()).d));
                    }
                } else {
                    r1 = EmptySet.b;
                }
                return new qmw0.a(Jb, r1);
            case 23:
                return a.e.a;
            case 24:
                return s3q0.a;
            default:
                return Boolean.valueOf(brm0.B(((StackTraceElement) obj).getClassName(), "java.util.concurrent", false));
        }
    }
}
