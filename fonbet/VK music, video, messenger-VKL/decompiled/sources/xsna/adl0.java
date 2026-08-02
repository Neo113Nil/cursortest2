package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.ImFeatures;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import xsna.kbl0;

/* compiled from: StickersStorage.kt */
/* loaded from: classes5.dex */
public final class adl0 {
    public static final long e = TimeUnit.HOURS.toSeconds(6);
    public final io.reactivex.rxjava3.disposables.b a;
    public final jtq b;
    public final s9f0 c;
    public final int d;

    public adl0(m9l0 m9l0Var) {
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.a = bVar;
        this.b = new jtq(m9l0Var, bVar);
        this.c = new s9f0(m9l0Var, bVar);
        this.d = BuildInfo.e;
    }

    public static void a() {
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        Preference.F(-1L, kbl0.a.b().a, "stickers_recent_last_timestamp");
        Preference.I(kbl0.a.b().a, "stickers_recent_synced", false);
        Preference.F(-1, kbl0.a.b().a, "stickers_last_version_code");
        Preference.H(kbl0.a.b().a, "stickers_favorites_hash_code", "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (java.lang.System.currentTimeMillis() > ((com.vk.core.preference.Preference.m(-1, xsna.kbl0.a.b().a, "stickers_recent_last_timestamp") + xsna.adl0.e) * 1000)) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (com.vk.core.preference.Preference.d(xsna.kbl0.a.b().a, "stickers_recent_synced", false) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z) {
        ImFeatures imFeatures = ImFeatures.REDUCE_GET_RECENT_STICKERS_CALLS;
        imFeatures.getClass();
        boolean z2 = true;
        if (com.vk.toggle.b.A.a(imFeatures)) {
            HashMap<UserId, kbl0> hashMap = kbl0.b;
        } else {
            HashMap<UserId, kbl0> hashMap2 = kbl0.b;
        }
        if ((z || z2) && o25.a().b()) {
            orj0 orj0Var = new orj0(this, 2);
            s9f0 s9f0Var = this.c;
            s9f0Var.getClass();
            int i = 24;
            s9f0Var.b.b(rsg0.y0(new eal0("messages.getRecentStickers"), null, null, 3).subscribe(new c2y(new defpackage.y(i, s9f0Var, orj0Var), i), kwg0.b()));
        }
    }
}
