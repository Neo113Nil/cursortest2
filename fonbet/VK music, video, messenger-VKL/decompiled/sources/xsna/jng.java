package xsna;

import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPackPreview;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackHorizontalPreviewListItemVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import one.video.controls.view.seekpreview.SeekPreviewImageView;
import xsna.spt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jng implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jng(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                ((StickerPackHorizontalPreviewListItemVh) this.d).a(this.c, (UIBlockStickerPackPreview) this.e);
                break;
            case 2:
                n7m0 n7m0Var = (n7m0) this.d;
                MusicTrack musicTrack = (MusicTrack) this.e;
                spt.a aVar = (spt.a) obj;
                if (aVar.a.length() != 0) {
                    int i = aVar.b * this.c;
                    n7m0Var.d0(aVar.a, i, 0, 0, musicTrack, i);
                    n7m0Var.x(musicTrack, aVar.a, null);
                    break;
                } else {
                    ((d7m0) n7m0Var.b).Y();
                    n7m0Var.d.j();
                    break;
                }
            default:
                xrp0 xrp0Var = (xrp0) this.d;
                izs izsVar = (izs) this.e;
                SeekPreviewImageView seekPreviewImageView = (SeekPreviewImageView) obj;
                seekPreviewImageView.setImageLoader(xrp0Var.f);
                seekPreviewImageView.setTimelineImages(xrp0Var.e);
                seekPreviewImageView.setDuration(xrp0Var.c);
                seekPreviewImageView.setPosition(((Number) izsVar.invoke(Integer.valueOf(this.c))).longValue());
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jng(kng kngVar, UserId userId, int i, String str) {
        this.b = 0;
        this.d = userId;
        this.c = i;
        this.e = str;
    }

    public /* synthetic */ jng(n7m0 n7m0Var, int i, MusicTrack musicTrack) {
        this.b = 2;
        this.d = n7m0Var;
        this.c = i;
        this.e = musicTrack;
    }
}
