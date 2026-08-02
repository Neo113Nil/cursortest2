package xsna;

import com.vk.dto.common.ClipVideoFile;
import xsna.lgj0;

/* compiled from: CommunityScheduledClipsRepository.kt */
/* loaded from: classes5.dex */
public final class e1i {
    public static void a(ClipVideoFile clipVideoFile, int i, gzs gzsVar, gzs gzsVar2) {
        if (clipVideoFile.F) {
            rsg0.Z(yfb.x(lgj0.a.b(new ngj0(), clipVideoFile.b, clipVideoFile.c, clipVideoFile.m, null, null, null, Integer.valueOf(i), null, null, null, 32696))).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ph8(gzsVar, 1), new lz(new kqb(1, gzsVar2), 13));
        }
    }
}
