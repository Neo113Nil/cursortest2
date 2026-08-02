package xsna;

import android.net.Uri;
import android.util.Size;
import com.vk.clips.upload.edit.api.ClipCoverPreviewType;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewParams;
import com.vk.dto.clips.stickers.ISerializableStickerSDK;
import com.vk.media.MediaUtils;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.player.OneVideoPlayer;
import xsna.eeu0;
import xsna.x4d0;

/* compiled from: ClipsChoosePreviewPresenter.kt */
/* loaded from: classes17.dex */
public final class zld {
    public final pld a;
    public final lpj b;
    public final ClipsChoosePreviewParams c;
    public final cmd d;
    public final x4d0 e;
    public final mef f;
    public final ie8 g;
    public cv10 h;
    public Uri i;
    public boolean j;
    public ClipCoverPreviewType k;
    public boolean l;
    public long m;
    public long n;
    public volatile List<? extends uq10> o;
    public OneVideoPlayer p;
    public final cia0 q;

    public zld(pld pldVar, lpj lpjVar, ClipsChoosePreviewParams clipsChoosePreviewParams, cmd cmdVar, x4d0 x4d0Var, mef mefVar, ie8 ie8Var) {
        this.a = pldVar;
        this.b = lpjVar;
        this.c = clipsChoosePreviewParams;
        this.d = cmdVar;
        this.e = x4d0Var;
        this.f = mefVar;
        this.g = ie8Var;
        Uri uri = clipsChoosePreviewParams.c;
        this.i = uri;
        this.j = uri != null;
        this.k = ClipCoverPreviewType.FIRST_FRAME;
        this.n = clipsChoosePreviewParams.f;
        this.o = EmptyList.b;
        this.q = mefVar.c(lpjVar, new xcd(this, 1));
    }

    public final void a() {
        if (!this.l) {
            this.g.invoke(null);
            return;
        }
        eeu0.a aVar = new eeu0.a(this.b);
        aVar.B(R.string.clips_choose_preview_cancel_title);
        aVar.setPositiveButton(R.string.clips_choose_preview_exit, new tld(this, 0));
        aVar.setNegativeButton(R.string.clips_choose_preview_cancel, new vld(0));
        aVar.m();
    }

    public final void b(x4d0.a aVar) {
        cv10 Yb = this.a.c.Yb(this.b.getApplicationContext(), "cover-picker-player");
        Yb.g(new apk(this.o, this.b, this.a.b.Gd()));
        OneVideoPlayer a = Yb.a();
        this.h = Yb;
        this.p = a;
        this.d.a5(a, aVar);
        cmd cmdVar = this.d;
        ClipsChoosePreviewParams clipsChoosePreviewParams = this.c;
        cmdVar.d5(clipsChoosePreviewParams.d, clipsChoosePreviewParams.e, Yb, aVar.a, this.n);
        this.d.setTimestamp(this.n);
    }

    public final List<uq10> c(x4d0.a aVar) {
        List<ISerializableStickerSDK> list = aVar.b;
        ClipsChoosePreviewParams clipsChoosePreviewParams = this.c;
        Size size = new Size(clipsChoosePreviewParams.d, clipsChoosePreviewParams.e);
        if (list.isEmpty()) {
            return EmptyList.b;
        }
        c1f d = this.f.d(list, new MediaUtils.d(size));
        d.f();
        return Collections.singletonList(d);
    }

    public final void d() {
        this.l = true;
        Uri uri = this.i;
        cmd cmdVar = this.d;
        cmdVar.setPhotoUri(uri);
        cmdVar.setPhotoSelected(this.j);
        if (this.i != null) {
            cmdVar.b5();
            cmdVar.setVideoSelected(true ^ this.j);
        }
    }
}
