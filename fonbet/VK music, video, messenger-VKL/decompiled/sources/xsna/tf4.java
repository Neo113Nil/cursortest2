package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ tf4(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        Integer valueOf;
        int i2;
        String l2;
        int i3;
        DownloadingState downloadingState;
        int i4 = this.b;
        String str = this.c;
        switch (i4) {
            case 0:
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM audio_book WHERE uid = ? ORDER BY id");
                try {
                    V0.D3(1, str);
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
                        int i5 = k14;
                        ArrayList arrayList2 = arrayList;
                        int i6 = (int) V0.getLong(k);
                        UserId b = fwx0.b(V0.l2(k2));
                        int i7 = (int) V0.getLong(k3);
                        String l22 = V0.l2(k4);
                        String l23 = V0.l2(k5);
                        int i8 = (int) V0.getLong(k6);
                        boolean z = ((int) V0.getLong(k7)) != 0;
                        int i9 = (int) V0.getLong(k8);
                        int i10 = (int) V0.getLong(k9);
                        MusicDynamicRestriction musicDynamicRestriction = null;
                        Image g = yfb.g(V0.isNull(k10) ? null : V0.l2(k10));
                        String l24 = V0.isNull(k11) ? null : V0.l2(k11);
                        if (V0.isNull(k12)) {
                            i = i10;
                            valueOf = null;
                        } else {
                            i = i10;
                            valueOf = Integer.valueOf((int) V0.getLong(k12));
                        }
                        boolean z2 = ((int) V0.getLong(k13)) != 0;
                        String l25 = V0.l2(i5);
                        int i11 = k15;
                        String l26 = V0.l2(i11);
                        int i12 = k13;
                        int i13 = k16;
                        int i14 = (int) V0.getLong(i13);
                        int i15 = k17;
                        if (V0.isNull(i15)) {
                            i2 = i13;
                            l2 = null;
                        } else {
                            i2 = i13;
                            l2 = V0.l2(i15);
                        }
                        if (l2 == null) {
                            i3 = i14;
                            k17 = i15;
                        } else {
                            i3 = i14;
                            k17 = i15;
                            musicDynamicRestriction = (MusicDynamicRestriction) MusicDynamicRestriction.i.a(new JSONObject(l2));
                        }
                        int i16 = k18;
                        MusicDynamicRestriction musicDynamicRestriction2 = musicDynamicRestriction;
                        int i17 = (int) V0.getLong(i16);
                        if (i17 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i17 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i17 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i17 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i17 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        DownloadingState downloadingState2 = downloadingState;
                        int i18 = k19;
                        k18 = i16;
                        arrayList2.add(new fg4(i6, b, i7, l22, l23, i8, z, i9, i, g, l24, valueOf, z2, l25, l26, i3, musicDynamicRestriction2, downloadingState2, V0.l2(i18)));
                        k19 = i18;
                        k13 = i12;
                        k15 = i11;
                        k16 = i2;
                        arrayList = arrayList2;
                        k14 = i5;
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 1:
                ArrayList<dl60> arrayList3 = CommentThreadFragment.y0;
                qgi0.h((tgi0) obj, str);
                return s3q0.a;
            default:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, str);
                qgi0.r(tgi0Var, "CropEditorDoneButton");
                qgi0.n(tgi0Var, 0);
                return s3q0.a;
        }
    }

    public /* synthetic */ tf4(String str, wf4 wf4Var) {
        this.b = 0;
        this.c = str;
    }
}
