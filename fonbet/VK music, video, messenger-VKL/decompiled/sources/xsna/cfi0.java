package xsna;

import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.voip.OKVoipEngine;
import kotlin.text.Regex;
import xsna.rwm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class cfi0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ cfi0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return Boolean.valueOf(fxc0.B().J().b());
            case 2:
                return s3q0.a;
            case 3:
                int i = rwm0.g;
                dhr0.a.getClass();
                return rwm0.a.d(dhr0.s());
            case 4:
                return new mzr0();
            case 5:
                return new a390();
            case 6:
                Object obj = VideoItemListSmallVh.c0;
                return e43.l(new Regex(".*/history"), new Regex(".*/liked"), new Regex(".*/bookmarks"), new Regex(".*/topic/@.*"));
            case 7:
                return (bof0) jfv0.q.getValue();
            default:
                OKVoipEngine.b.getClass();
                return OKVoipEngine.A().getAudioState();
        }
    }

    public /* synthetic */ cfi0(mcw0 mcw0Var) {
        this.b = 8;
    }
}
