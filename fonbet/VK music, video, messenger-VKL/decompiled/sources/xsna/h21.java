package xsna;

import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.video.playlist.playlistscreen.catalog.j;
import com.vkontakte.android.attachments.ShitAttachment;
import xsna.xt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class h21 implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h21(int i, AdsintEventTypeDto adsintEventTypeDto, ShitAttachment shitAttachment) {
        this.d = shitAttachment;
        this.c = i;
        this.e = adsintEventTypeDto;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ShitAttachment shitAttachment = (ShitAttachment) this.d;
                AdsintEventTypeDto adsintEventTypeDto = (AdsintEventTypeDto) this.e;
                String Eb = shitAttachment.Eb();
                int i = this.c;
                return new xt0.a(adsintEventTypeDto, shitAttachment.v, Eb, i < 0 ? xt0.c.b.a : new xt0.c.a(i), null, null, null);
            default:
                ((izs) this.d).invoke(new j.a(((com.vk.video.playlist.playlistscreen.catalog.n) this.e).b, this.c));
                return s3q0.a;
        }
    }

    public /* synthetic */ h21(izs izsVar, com.vk.video.playlist.playlistscreen.catalog.n nVar, int i) {
        this.d = izsVar;
        this.e = nVar;
        this.c = i;
    }
}
