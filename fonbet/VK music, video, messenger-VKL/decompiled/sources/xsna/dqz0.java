package xsna;

import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.material3.SheetValue;
import com.google.android.gms.common.ConnectionResult;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class dqz0 implements omz0, pjw, gn60, nto0, her0 {
    public final Object b;

    public /* synthetic */ dqz0(Object obj) {
        this.b = obj;
    }

    public static int o(ShitAttachment shitAttachment, NewsEntry newsEntry) {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean p(ShitAttachment shitAttachment, s1c0 s1c0Var) {
        BadgesSet u0;
        boolean z = s1c0Var.i;
        if (shitAttachment instanceof c6z) {
            if (!z) {
                return false;
            }
            Badgeable badgeable = shitAttachment instanceof Badgeable ? (Badgeable) shitAttachment : null;
            u0 = badgeable != null ? badgeable.u0() : null;
            return (u0 == null || u0.e.isEmpty() || u0.f <= 0) ? false : true;
        }
        VideoAttachment videoAttachment = shitAttachment.I;
        if (!shitAttachment.Gb() || videoAttachment == null || !z) {
            return false;
        }
        VideoFile videoFile = videoAttachment.k;
        Badgeable badgeable2 = videoFile instanceof Badgeable ? (Badgeable) videoFile : null;
        u0 = badgeable2 != null ? badgeable2.u0() : null;
        return (u0 == null || u0.e.isEmpty() || u0.f <= 0) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean q(ShitAttachment shitAttachment, s1c0 s1c0Var) {
        boolean z = s1c0Var.k;
        boolean z2 = s1c0Var.i;
        if (!(shitAttachment instanceof c6z)) {
            VideoAttachment videoAttachment = shitAttachment.I;
            if (!shitAttachment.Gb() || videoAttachment == null || !z2) {
                return false;
            }
            VideoFile videoFile = videoAttachment.k;
            Badgeable badgeable = videoFile instanceof Badgeable ? (Badgeable) videoFile : null;
            BadgesSet u0 = badgeable != null ? badgeable.u0() : null;
            if (u0 != null && !u0.e.isEmpty() && u0.f > 0) {
                return false;
            }
            VideoFile videoFile2 = videoAttachment.k;
            Badgeable badgeable2 = videoFile2 instanceof Badgeable ? (Badgeable) videoFile2 : null;
            if ((badgeable2 != null ? badgeable2.ca() : null) == null || !z) {
                return false;
            }
        } else {
            if (!z2) {
                return false;
            }
            boolean z3 = shitAttachment instanceof Badgeable;
            Badgeable badgeable3 = z3 ? (Badgeable) shitAttachment : null;
            BadgesSet u02 = badgeable3 != null ? badgeable3.u0() : null;
            if (u02 != null && !u02.e.isEmpty() && u02.f > 0) {
                return false;
            }
            Badgeable badgeable4 = z3 ? (Badgeable) shitAttachment : null;
            if ((badgeable4 != null ? badgeable4.ca() : null) == null || !z) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean r(ShitAttachment shitAttachment, s1c0 s1c0Var) {
        boolean z = s1c0Var.k;
        boolean z2 = s1c0Var.i;
        if (shitAttachment instanceof c6z) {
            Badgeable badgeable = shitAttachment instanceof Badgeable ? (Badgeable) shitAttachment : null;
            if (z2 && badgeable != null && badgeable.u0() != null) {
                BadgesSet u0 = badgeable.u0();
                if ((u0 != null ? u0.f : 0) > 0 || z) {
                    return true;
                }
            }
            return false;
        }
        VideoAttachment videoAttachment = shitAttachment.I;
        if (shitAttachment.Gb() && videoAttachment != null) {
            VideoFile videoFile = videoAttachment.k;
            Badgeable badgeable2 = videoFile instanceof Badgeable ? (Badgeable) videoFile : null;
            if (z2 && badgeable2 != null && badgeable2.u0() != null) {
                BadgesSet u02 = badgeable2.u0();
                if ((u02 != null ? u02.f : 0) > 0 || z) {
                    if (!z) {
                        VideoFile videoFile2 = videoAttachment.k;
                        Post post = videoFile2 instanceof Post ? (Post) videoFile2 : null;
                        if ((post != null && post.gc()) == false) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean s(ShitAttachment shitAttachment) {
        if (shitAttachment instanceof c6z) {
            ((c6z) shitAttachment).qa();
            return true;
        }
        VideoAttachment videoAttachment = shitAttachment.I;
        if (!shitAttachment.Gb() || videoAttachment == null) {
            return false;
        }
        videoAttachment.k.Pa().qa();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean t(ShitAttachment shitAttachment) {
        VideoFile videoFile;
        bss0 Pa;
        Integer num = null;
        num = null;
        num = null;
        if (shitAttachment instanceof c6z) {
            return ((shitAttachment instanceof o2f0 ? (o2f0) shitAttachment : null) != null && di60.I(shitAttachment)) || ((grj0) shitAttachment).T9() > 0;
        }
        VideoAttachment videoAttachment = shitAttachment.I;
        if (videoAttachment != null && (videoFile = videoAttachment.k) != null && (Pa = videoFile.Pa()) != null) {
            num = Integer.valueOf(Pa.T9());
        }
        return num != null && num.intValue() > 0;
    }

    public static boolean u(ShitAttachment shitAttachment) {
        if (!(shitAttachment instanceof c6z)) {
            VideoAttachment videoAttachment = shitAttachment.I;
            if (!shitAttachment.Gb() || videoAttachment == null) {
                return false;
            }
        }
        return true;
    }

    public void a(SheetValue sheetValue, float f) {
        ((LinkedHashMap) this.b).put(sheetValue, Float.valueOf(f));
    }

    @Override // xsna.her0
    public boolean c(qdr0 qdr0Var) {
        return ((hl00) this.b).c(qdr0Var);
    }

    @Override // xsna.omz0
    public void e(int i, boolean z) {
        eqz0 eqz0Var = (eqz0) this.b;
        Lock lock = eqz0Var.o;
        Lock lock2 = eqz0Var.o;
        lock.lock();
        try {
            if (eqz0Var.n) {
                eqz0Var.n = false;
                eqz0Var.b.e(i, z);
                eqz0Var.m = null;
                eqz0Var.l = null;
            } else {
                eqz0Var.n = true;
                eqz0Var.f.onConnectionSuspended(i);
            }
            lock2.unlock();
        } catch (Throwable th) {
            lock2.unlock();
            throw th;
        }
    }

    @Override // xsna.pjw
    public String f(int i) {
        UserProfile userProfile = (UserProfile) this.b;
        if (i > 0) {
            if (userProfile != null) {
                return userProfile.u(i);
            }
            return null;
        }
        if (userProfile != null) {
            return userProfile.h;
        }
        return null;
    }

    @Override // xsna.omz0
    public void g(@Nullable Bundle bundle) {
        eqz0 eqz0Var = (eqz0) this.b;
        eqz0Var.o.lock();
        try {
            eqz0Var.m = ConnectionResult.g;
            eqz0Var.k();
        } finally {
            eqz0Var.o.unlock();
        }
    }

    public float l(int i, int i2) {
        DecelerateInterpolator decelerateInterpolator = (DecelerateInterpolator) this.b;
        int i3 = i % 4530;
        if (i3 >= 2265) {
            i2 = 0;
        }
        int max = Math.max(0, i3 - i2);
        if (Integer.MIN_VALUE <= max && max < 1) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (max >= 0 && max < 200) {
            float f = 200;
            return decelerateInterpolator.getInterpolation((max % f) / f);
        }
        if (4330 > max || max >= 4530) {
            return 1.0f;
        }
        float f2 = 200;
        return 1.0f - decelerateInterpolator.getInterpolation(((max - 4330) % f2) / f2);
    }

    @Override // xsna.omz0
    public void m(@NonNull ConnectionResult connectionResult) {
        eqz0 eqz0Var = (eqz0) this.b;
        eqz0Var.o.lock();
        try {
            eqz0Var.m = connectionResult;
            eqz0Var.k();
        } finally {
            eqz0Var.o.unlock();
        }
    }

    public float n(int i, int i2) {
        DecelerateInterpolator decelerateInterpolator = (DecelerateInterpolator) this.b;
        int i3 = i % 4530;
        int i4 = (i3 < 0 || i3 >= 501) ? 330 : 500;
        if (i3 >= 0 && i3 < 500) {
            float f = i4;
            return (1.0f - decelerateInterpolator.getInterpolation((i3 % f) / f)) * i2;
        }
        if (4000 > i3 || i3 >= 4330) {
            return (4330 > i3 || i3 >= 4530) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : -i2;
        }
        float f2 = i4;
        return decelerateInterpolator.getInterpolation(((i3 - 4000) % f2) / f2) * (-i2);
    }

    @Override // xsna.nto0
    public void seekTo(long j) {
        MiniPlayerControllersWrapper miniPlayerControllersWrapper = ((VideoMinimizableDiscoveryFragment) this.b).X;
        if (miniPlayerControllersWrapper != null) {
            miniPlayerControllersWrapper.seekTo(j);
        }
    }

    public List v(int i, Triple triple) {
        Post post;
        h170 h170Var = (h170) ((pa2) this.b).b;
        ShitAttachment shitAttachment = (ShitAttachment) triple.d();
        NewsEntry newsEntry = (NewsEntry) triple.g();
        s1c0 s1c0Var = (s1c0) triple.h();
        VideoAttachment videoAttachment = shitAttachment.I;
        if (!shitAttachment.Gb() || videoAttachment == null) {
            String z = sa30.z(0, s1c0Var);
            String z2 = sa30.z(0, s1c0Var);
            String z3 = sa30.z(0, s1c0Var);
            String z4 = sa30.z(0, s1c0Var);
            int o = o(shitAttachment, newsEntry);
            boolean s = s(shitAttachment);
            boolean t = t(shitAttachment);
            boolean u = u(shitAttachment);
            int A = sa30.A(shitAttachment);
            boolean a = pa2.a(shitAttachment);
            boolean I = di60.I(shitAttachment);
            int b = !di60.I(shitAttachment) ? 0 : cn70.b(8);
            boolean r = r(shitAttachment, s1c0Var);
            boolean p = p(shitAttachment, s1c0Var);
            boolean q = q(shitAttachment, s1c0Var);
            boolean b2 = h170Var.b();
            post = newsEntry instanceof Post ? (Post) newsEntry : null;
            boolean Tb = post != null ? post.Tb() : false;
            EmptyList emptyList = EmptyList.b;
            return Collections.singletonList(new q6s(false, false, false, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, z2, z, z4, z3, false, false, R.string.video_remove_from_added, 0, s, false, t, false, u, A, false, false, a, false, false, false, I, b, r, p, q, 0, 0, false, false, b2, Tb, emptyList, emptyList, false, o, tni.i(shitAttachment), false, shitAttachment, newsEntry, 0));
        }
        int T9 = videoAttachment.k.Pa().T9();
        int E1 = videoAttachment.k.Pa().E1();
        int i7 = videoAttachment.k.Pa().i7();
        int w0 = videoAttachment.k.Pa().w0();
        VideoFile videoFile = videoAttachment.k;
        Badgeable badgeable = videoFile instanceof Badgeable ? (Badgeable) videoFile : null;
        BadgesSet u0 = badgeable != null ? badgeable.u0() : null;
        int i2 = u0 != null ? u0.f : -1;
        boolean z5 = E1 > 0;
        boolean z6 = i7 > 0;
        boolean j0 = videoAttachment.k.j0();
        boolean z7 = !j0;
        boolean i9 = videoAttachment.k.i9();
        boolean J = videoAttachment.k.Pa().J();
        String z8 = sa30.z(E1, s1c0Var);
        String z9 = sa30.z(T9, s1c0Var);
        String z10 = sa30.z(w0, s1c0Var);
        String z11 = sa30.z(i7, s1c0Var);
        int o2 = o(shitAttachment, newsEntry);
        int i3 = !j0 ? R.string.video_add_to_added : R.string.video_remove_from_added;
        boolean s2 = s(shitAttachment);
        boolean t2 = t(shitAttachment);
        boolean u2 = u(shitAttachment);
        int A2 = sa30.A(shitAttachment);
        boolean a2 = pa2.a(shitAttachment);
        boolean I2 = di60.I(shitAttachment);
        int b3 = !di60.I(shitAttachment) ? 0 : cn70.b(8);
        boolean r2 = r(shitAttachment, s1c0Var);
        boolean p2 = p(shitAttachment, s1c0Var);
        boolean q2 = q(shitAttachment, s1c0Var);
        VideoFile videoFile2 = videoAttachment.k;
        boolean D = f9t.D(false, videoFile2 instanceof Badgeable ? (Badgeable) videoFile2 : null, s1c0Var);
        boolean b4 = h170Var.b();
        post = newsEntry instanceof Post ? (Post) newsEntry : null;
        return Collections.singletonList(new q6s(J, false, false, null, null, null, null, 0, 0, T9, E1, i7, w0, i2, z9, z8, z11, z10, z7, i9, i3, 0, s2, z5, t2, z6, u2, A2, false, false, a2, false, false, false, I2, b3, r2, p2, q2, 0, 0, false, D, b4, post != null ? post.Tb() : false, f9t.t(u0, true), f9t.t(u0, false), f9t.r(u0), o2, tni.i(shitAttachment), false, shitAttachment, newsEntry, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return v(0, (Triple) pair);
    }

    public dqz0(int i) {
        switch (i) {
            case 7:
                this.b = new DecelerateInterpolator();
                break;
            default:
                this.b = new LinkedHashMap();
                break;
        }
    }
}
