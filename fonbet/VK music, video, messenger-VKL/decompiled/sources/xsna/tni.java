package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.Layout;
import com.google.android.gms.internal.measurement.zznn;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: VkHintBanner.kt */
/* loaded from: classes5.dex */
public final class tni implements q701 {
    public static final jai c = new jai(932263232, new tji(1), false);
    public static final /* synthetic */ tni d = new tni(1);
    public final /* synthetic */ int b;

    public /* synthetic */ tni(int i) {
        this.b = i;
    }

    public static final w1r0 a() {
        return new w1r0();
    }

    public static final String b(String str, String str2) {
        return str.length() > 0 ? fo8.a(str2, str) : str;
    }

    public static final float c(mc90 mc90Var, wow wowVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-588053159, i, -1, "com.vk.core.compose.component.tabs.calculateTabIndicatorOffset (VkPagerState.kt:14)");
        }
        int min = Math.min(e43.h(wowVar), mc90Var.k());
        dtn0 dtn0Var = (dtn0) wowVar.b.get(min);
        dtn0 dtn0Var2 = (dtn0) j5g.b0(min - 1, wowVar);
        dtn0 dtn0Var3 = (dtn0) j5g.b0(min + 1, wowVar);
        float l = mc90Var.l();
        float z = (l <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || dtn0Var3 == null) ? (l >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || dtn0Var2 == null) ? dtn0Var.a : q6x.z(dtn0Var.a, dtn0Var2.a, -l) : q6x.z(dtn0Var.a, dtn0Var3.a, l);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return z;
    }

    public static final float d(mc90 mc90Var, wow wowVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1026613670, i, -1, "com.vk.core.compose.component.tabs.calculateTabIndicatorWidth (VkPagerState.kt:35)");
        }
        int min = Math.min(e43.h(wowVar), mc90Var.k());
        dtn0 dtn0Var = (dtn0) wowVar.b.get(min);
        dtn0 dtn0Var2 = (dtn0) j5g.b0(min - 1, wowVar);
        dtn0 dtn0Var3 = (dtn0) j5g.b0(min + 1, wowVar);
        float l = mc90Var.l();
        float z = (l <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || dtn0Var3 == null) ? (l >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || dtn0Var2 == null) ? dtn0Var.b : q6x.z(dtn0Var.b, dtn0Var2.b, -l) : q6x.z(dtn0Var.b, dtn0Var3.b, l);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean e(NewsEntry newsEntry, boolean z) {
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ArrayList<EntryAttachment> arrayList;
        Owner s;
        UserId b = t11.b();
        l490 l490Var = newsEntry instanceof l490 ? (l490) newsEntry : null;
        if (l490Var == null || (s = l490Var.s()) == null || (obj = s.b) == null) {
            obj = 0;
        }
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            Flags flags = post.l;
            String str = post.t;
            z4 = flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            z3 = flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH);
            z5 = "reply".equals(str);
            z6 = "market".equals(str);
            z2 = "topic".equals(str);
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (fkq0.d(b) && (!obj.equals(b) || z)) {
            int zb = newsEntry.zb();
            boolean z7 = (newsEntry instanceof Videos) && (arrayList = ((Videos) newsEntry).o) != null && arrayList.size() == 1;
            if ((zb == 0 || zb == 9 || zb == 11 || zb == 12 || z7) && !z4 && !z3 && !z5 && !z6 && !z2) {
                return true;
            }
        }
        return false;
    }

    public static final long f(int i) {
        return TimeUnit.DAYS.toMillis(i);
    }

    public static final Long g(b2g0 b2g0Var) {
        e210 e210Var = b2g0Var instanceof e210 ? (e210) b2g0Var : null;
        if (e210Var != null) {
            return Long.valueOf(e210Var.a);
        }
        return null;
    }

    public static final byte[] h(int i, int i2, byte[] bArr) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[(i3 * 3) / 2];
        for (int i4 = 0; i4 <= i3 - 1; i4++) {
            bArr2[((i - 1) - (i4 % i)) + ((i4 / i) * i)] = bArr[i4];
        }
        for (int i5 = 0; i5 < i2 / 2; i5++) {
            int i6 = (i5 * i) + i3;
            for (int i7 = 0; i7 < i; i7 += 2) {
                int i8 = i6 + i7;
                int i9 = (i - i7) + i6;
                bArr2[i8] = bArr[i9 - 2];
                bArr2[i8 + 1] = bArr[i9 - 1];
            }
        }
        return bArr2;
    }

    public static final boolean i(NewsEntry newsEntry) {
        return ((newsEntry instanceof FaveEntry) && (((FaveEntry) newsEntry).i.f instanceof ArticleAttachment)) ? false : true;
    }

    public static final float j(Layout layout) {
        Float valueOf;
        Iterator<Integer> it = swe0.q(0, layout.getLineCount()).iterator();
        if (it.hasNext()) {
            z8x z8xVar = (z8x) it;
            float lineWidth = layout.getLineWidth(z8xVar.nextInt());
            while (it.hasNext()) {
                lineWidth = Math.max(lineWidth, layout.getLineWidth(z8xVar.nextInt()));
            }
            valueOf = Float.valueOf(lineWidth);
        } else {
            valueOf = null;
        }
        return valueOf != null ? valueOf.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static final long k(int i) {
        return TimeUnit.HOURS.toMillis(i);
    }

    public static final long l() {
        return TimeUnit.MINUTES.toMillis(1);
    }

    public static final float m(mc90 mc90Var, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(283968135, 0, -1, "com.vk.core.compose.component.tabs.pageProgress (VkPagerState.kt:56)");
        }
        float abs = 1.0f - Math.abs(mc90Var.l() + (mc90Var.k() - i));
        if (abs < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            abs = 0.0f;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return abs;
    }

    public static final byte[] n(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[(i3 * 3) / 2];
        if (z) {
            int i4 = i3 - 1;
            for (int i5 = 0; i5 < i; i5++) {
                for (int i6 = i2 - 1; -1 < i6; i6--) {
                    bArr2[i4] = bArr[(((i2 - i6) - 1) * i) + i5];
                    i4--;
                }
            }
            int i7 = i3;
            for (int i8 = i - 1; i8 > 0; i8 -= 2) {
                int i9 = i2 / 2;
                for (int i10 = 0; i10 < i9; i10++) {
                    int i11 = (((i9 - i10) - 1) * i) + i3;
                    bArr2[i7] = bArr[(i8 - 1) + i11];
                    bArr2[i7 + 1] = bArr[i11 + i8];
                    i7 += 2;
                }
            }
        } else {
            int i12 = i3 - 1;
            for (int i13 = 0; i13 < i; i13++) {
                for (int i14 = i2 - 1; -1 < i14; i14--) {
                    bArr2[i12] = bArr[(i14 * i) + i13];
                    i12--;
                }
            }
            int i15 = i3;
            for (int i16 = i - 1; i16 > 0; i16 -= 2) {
                int i17 = i2 / 2;
                for (int i18 = 0; i18 < i17; i18++) {
                    int i19 = (i18 * i) + i3;
                    bArr2[i15] = bArr[(i16 - 1) + i19];
                    bArr2[i15 + 1] = bArr[i19 + i16];
                    i15 += 2;
                }
            }
        }
        return bArr2;
    }

    public int hashCode() {
        switch (this.b) {
            case 5:
                throw null;
            default:
                return super.hashCode();
        }
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Integer.valueOf((int) zznn.zzE());
    }
}
