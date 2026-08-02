package xsna;

import com.vk.core.preference.Preference;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class dgk implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ dgk(String str, int i) {
        this.b = i;
        this.c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (xsna.drm0.D(r7, r6.c, false) == false) goto L8;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, this.c);
                qgi0.r(tgi0Var, "CropEditorCloseButton");
                qgi0.n(tgi0Var, 0);
                return s3q0.a;
            case 1:
                qgi0.s((tgi0) obj, new us2(this.c));
                return s3q0.a;
            case 2:
                return new OfflinePodcastEpisodesMviState.Loading(this.c, null, null, 6, null);
            default:
                String str = (String) obj;
                if (!Preference.g.invoke(str).booleanValue()) {
                    z = false;
                    break;
                }
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
