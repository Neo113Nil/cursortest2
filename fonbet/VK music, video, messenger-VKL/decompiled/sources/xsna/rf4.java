package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf4 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rf4(int i, List list) {
        this.c = i;
        this.d = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        Integer valueOf;
        int i2;
        String l2;
        int i3;
        DownloadingState downloadingState;
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                int i4 = this.c;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM audio_book WHERE uid = ? AND book_id = ? LIMIT 1");
                try {
                    V0.D3(1, str);
                    V0.bindLong(2, i4);
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "uid");
                    int k3 = egi.k(V0, "book_id");
                    int k4 = egi.k(V0, "title");
                    int k5 = egi.k(V0, "annotation");
                    int k6 = egi.k(V0, "minimum_age");
                    int k7 = egi.k(V0, "is_explicit");
                    int k8 = egi.k(V0, "duration");
                    int k9 = egi.k(V0, "updated_at");
                    int k10 = egi.k(V0, "cover_image");
                    int k11 = egi.k(V0, "copyright");
                    int k12 = egi.k(V0, "release_date");
                    int k13 = egi.k(V0, "is_favorite");
                    int k14 = egi.k(V0, "access_status");
                    int k15 = egi.k(V0, "track_code");
                    int k16 = egi.k(V0, "context_flags_mask");
                    int k17 = egi.k(V0, "restriction");
                    int k18 = egi.k(V0, "downloading_state");
                    int k19 = egi.k(V0, "json_raw");
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        int i5 = k13;
                        ArrayList arrayList2 = arrayList;
                        int i6 = (int) V0.getLong(k);
                        UserId b = fwx0.b(V0.l2(k2));
                        int i7 = (int) V0.getLong(k3);
                        String l22 = V0.l2(k4);
                        String l23 = V0.l2(k5);
                        int i8 = (int) V0.getLong(k6);
                        boolean z = ((int) V0.getLong(k7)) != 0;
                        int i9 = k;
                        int i10 = (int) V0.getLong(k8);
                        int i11 = (int) V0.getLong(k9);
                        MusicDynamicRestriction musicDynamicRestriction = null;
                        Image g = yfb.g(V0.isNull(k10) ? null : V0.l2(k10));
                        String l24 = V0.isNull(k11) ? null : V0.l2(k11);
                        if (V0.isNull(k12)) {
                            i = i11;
                            valueOf = null;
                        } else {
                            i = i11;
                            valueOf = Integer.valueOf((int) V0.getLong(k12));
                        }
                        int i12 = k3;
                        int i13 = k2;
                        boolean z2 = ((int) V0.getLong(i5)) != 0;
                        String l25 = V0.l2(k14);
                        int i14 = k15;
                        String l26 = V0.l2(i14);
                        Integer num = valueOf;
                        int i15 = k16;
                        int i16 = (int) V0.getLong(i15);
                        int i17 = k17;
                        if (V0.isNull(i17)) {
                            i2 = i16;
                            l2 = null;
                        } else {
                            i2 = i16;
                            l2 = V0.l2(i17);
                        }
                        if (l2 == null) {
                            k17 = i17;
                            i3 = i9;
                        } else {
                            k17 = i17;
                            i3 = i9;
                            musicDynamicRestriction = (MusicDynamicRestriction) MusicDynamicRestriction.i.a(new JSONObject(l2));
                        }
                        int i18 = k18;
                        MusicDynamicRestriction musicDynamicRestriction2 = musicDynamicRestriction;
                        int i19 = (int) V0.getLong(i18);
                        if (i19 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i19 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i19 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i19 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i19 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        DownloadingState downloadingState2 = downloadingState;
                        int i20 = k19;
                        k18 = i18;
                        arrayList2.add(new fg4(i6, b, i7, l22, l23, i8, z, i10, i, g, l24, num, z2, l25, l26, i2, musicDynamicRestriction2, downloadingState2, V0.l2(i20)));
                        k19 = i20;
                        k15 = i14;
                        k2 = i13;
                        k = i3;
                        arrayList = arrayList2;
                        k13 = i5;
                        k16 = i15;
                        k3 = i12;
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            default:
                return MediaPickerMviState.a((MediaPickerMviState) obj, this.c, (List) this.d, false, null, null, 57);
        }
    }

    public /* synthetic */ rf4(String str, int i, wf4 wf4Var) {
        this.d = str;
        this.c = i;
    }
}
