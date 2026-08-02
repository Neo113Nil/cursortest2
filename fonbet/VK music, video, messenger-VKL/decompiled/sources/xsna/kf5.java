package xsna;

import android.media.MediaMetadataRetriever;
import com.ironsource.X3;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Thumb;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.core.database.models.AutoDownloadType;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ kf5(String str, int i) {
        this.b = i;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [xsna.wf5] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        DownloadingState downloadingState;
        Boolean bool;
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM auto_download_track WHERE mid = ?");
                try {
                    V0.D3(1, str);
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "uid");
                    int k3 = egi.k(V0, "mid");
                    int k4 = egi.k(V0, "access_key");
                    int k5 = egi.k(V0, "track_code");
                    int k6 = egi.k(V0, "downloading_state");
                    int k7 = egi.k(V0, "title");
                    int k8 = egi.k(V0, "subtitle");
                    int k9 = egi.k(V0, "artist_name_fallback");
                    int k10 = egi.k(V0, "main_artists");
                    int k11 = egi.k(V0, "featured_artists");
                    int k12 = egi.k(V0, "thumb");
                    int k13 = egi.k(V0, X3.a.k);
                    int k14 = egi.k(V0, "url");
                    int k15 = egi.k(V0, "manifest_url");
                    int k16 = egi.k(V0, "duration");
                    int k17 = egi.k(V0, "date");
                    int k18 = egi.k(V0, "is_explicit");
                    int k19 = egi.k(V0, "lyrics_id");
                    int k20 = egi.k(V0, "is_focus_track");
                    int k21 = egi.k(V0, "main_color");
                    int k22 = egi.k(V0, "content_restriction");
                    int k23 = egi.k(V0, "size_in_bytes");
                    int k24 = egi.k(V0, "auto_download_date");
                    int k25 = egi.k(V0, "initial_auto_download_date");
                    int k26 = egi.k(V0, "auto_download_type");
                    int k27 = egi.k(V0, "json_raw");
                    AutoDownloadType autoDownloadType = null;
                    if (V0.step()) {
                        long j = V0.getLong(k);
                        UserId b = fwx0.b(V0.l2(k2));
                        String l2 = V0.l2(k3);
                        String l22 = V0.isNull(k4) ? null : V0.l2(k4);
                        String l23 = V0.isNull(k5) ? null : V0.l2(k5);
                        int i2 = (int) V0.getLong(k6);
                        if (i2 != 0) {
                            z = true;
                            if (i2 == 1) {
                                downloadingState = DownloadingState.Downloaded.b;
                            } else if (i2 == 2) {
                                downloadingState = DownloadingState.PendingDownload.b;
                            } else if (i2 == 3) {
                                downloadingState = DownloadingState.PartlyDownloaded.b;
                            } else {
                                if (i2 != 4) {
                                    throw new IllegalStateException("Incorrect download state value");
                                }
                                downloadingState = DownloadingState.Corrupted.b;
                            }
                        } else {
                            z = true;
                            downloadingState = DownloadingState.NotLoaded.b;
                        }
                        DownloadingState downloadingState2 = downloadingState;
                        String l24 = V0.isNull(k7) ? null : V0.l2(k7);
                        String l25 = V0.isNull(k8) ? null : V0.l2(k8);
                        String l26 = V0.isNull(k9) ? null : V0.l2(k9);
                        ArrayList a = sgn0.a(V0.isNull(k10) ? null : V0.l2(k10));
                        ArrayList a2 = sgn0.a(V0.isNull(k11) ? null : V0.l2(k11));
                        String l27 = V0.isNull(k12) ? null : V0.l2(k12);
                        Thumb e = l27 == null ? null : i7o0.e(l27);
                        MusicOfflineCacheStorage a3 = uh.a(V0.isNull(k13) ? null : V0.l2(k13));
                        String l28 = V0.isNull(k14) ? null : V0.l2(k14);
                        String l29 = V0.isNull(k15) ? null : V0.l2(k15);
                        Long valueOf = V0.isNull(k16) ? null : Long.valueOf(V0.getLong(k16));
                        Long valueOf2 = V0.isNull(k17) ? null : Long.valueOf(V0.getLong(k17));
                        boolean z2 = ((int) V0.getLong(k18)) != 0 ? z : false;
                        Integer valueOf3 = V0.isNull(k19) ? null : Integer.valueOf((int) V0.getLong(k19));
                        Integer valueOf4 = V0.isNull(k20) ? null : Integer.valueOf((int) V0.getLong(k20));
                        if (valueOf4 != null) {
                            bool = Boolean.valueOf(valueOf4.intValue() != 0 ? z : false);
                        } else {
                            bool = null;
                        }
                        String l210 = V0.isNull(k21) ? null : V0.l2(k21);
                        int i3 = (int) V0.getLong(k22);
                        Long valueOf5 = V0.isNull(k23) ? null : Long.valueOf(V0.getLong(k23));
                        Long valueOf6 = V0.isNull(k24) ? null : Long.valueOf(V0.getLong(k24));
                        Long valueOf7 = V0.isNull(k25) ? null : Long.valueOf(V0.getLong(k25));
                        Integer valueOf8 = V0.isNull(k26) ? null : Integer.valueOf((int) V0.getLong(k26));
                        if (valueOf8 != null) {
                            int intValue = valueOf8.intValue();
                            AutoDownloadType.Companion.getClass();
                            autoDownloadType = AutoDownloadType.a.a(intValue);
                        }
                        autoDownloadType = new wf5(j, b, l2, l22, l23, downloadingState2, l24, l25, l26, a, a2, e, a3, l28, l29, valueOf, valueOf2, z2, valueOf3, bool, l210, i3, valueOf5, valueOf6, valueOf7, autoDownloadType, V0.l2(k27));
                    }
                    V0.close();
                    return autoDownloadType;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 1:
                return bdb.a((bdb) obj, 0, 0, 0, 0, 0, 0, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, this.c, null, null, false, false, -134217729, 7);
            case 2:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, str);
                qgi0.r(tgi0Var, "storefront_group_rating_text");
                return s3q0.a;
            case 3:
                qgi0.h((tgi0) obj, str);
                return s3q0.a;
            case 4:
                ((MediaMetadataRetriever) obj).setDataSource(str);
                return s3q0.a;
            case 5:
                return Boolean.valueOf(epx.f(((SuperAppWidget) obj).d().b, str));
            case 6:
                qgi0.h((tgi0) obj, str);
                return s3q0.a;
            case 7:
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter((OutputStream) obj, emb.b), 8192);
                try {
                    bufferedWriter.write(str);
                    s3q0 s3q0Var = s3q0.a;
                    bufferedWriter.close();
                    return s3q0.a;
                } finally {
                }
            default:
                qgi0.s((tgi0) obj, ws2.e(str));
                return s3q0.a;
        }
    }

    public /* synthetic */ kf5(String str, vf5 vf5Var) {
        this.b = 0;
        this.c = str;
    }
}
