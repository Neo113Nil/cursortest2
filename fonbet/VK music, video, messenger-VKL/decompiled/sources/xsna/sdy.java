package xsna;

import android.net.Uri;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.a;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.audio.dto.AudioPhotoSizesDto;
import com.vk.core.apps.BuildInfo;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.music.Thumb;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemPreviewImage;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.queue.sync.utils.InterruptionType;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.player.live.proto.rtmp.ProtocolException;
import ru.ok.proto.PublisherConfiguration;
import xsna.acw;
import xsna.u2s;

/* compiled from: KeyModifiers.kt */
@vby
/* loaded from: classes11.dex */
public final class sdy implements wq5, uch0, jp70, rpr, ea60, moa0 {
    public static final int b = 9;
    public static final int c = 10;
    public static final int d = 12;
    public static final jai e = new jai(1798447165, new iii(2), false);
    public static final jai f = new jai(-1767370654, new bv4(0, 4), false);
    public static final jai g = new jai(-268646019, new lq2(4), false);
    public static final sdy h = new sdy();
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public static final sdy j = new sdy();
    public static final sdy k = new sdy();

    public static final fke0 f(bpn0 bpn0Var, bpn0 bpn0Var2) {
        return new fke0(bpn0Var, bpn0Var2);
    }

    public static final void g(androidx.compose.foundation.lazy.layout.b bVar, Object obj, int i2, Object obj2, androidx.compose.runtime.a aVar, int i3) {
        androidx.compose.runtime.a M = aVar.M(1439843069);
        int i4 = (M.J(bVar) ? 4 : 2) | i3 | (M.J(obj) ? 32 : 16) | (M.o(i2) ? 256 : 128) | (M.J(obj2) ? 2048 : 1024);
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1439843069, i4, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:124)");
            }
            ((j1h0) obj).c(obj2, kai.c(980966366, new t41(i2, bVar, obj2), M), M, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mx9(bVar, obj, i2, obj2, i3);
        }
    }

    public static final InterruptionType j(boolean z) {
        if (Thread.interrupted()) {
            if (z) {
                throw new InterruptedException("Thread interrupted");
            }
            return InterruptionType.NORMAL;
        }
        Thread currentThread = Thread.currentThread();
        rmr rmrVar = currentThread instanceof rmr ? (rmr) currentThread : null;
        return (rmrVar == null || !rmrVar.b.get()) ? InterruptionType.NOT_INTERRUPTED : InterruptionType.CUSTOM;
    }

    public static byte[] k(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long q = q(0, bArr) & 67108863;
        int i2 = 3;
        long q2 = (q(3, bArr) >> 2) & 67108611;
        long q3 = (q(6, bArr) >> 4) & 67092735;
        long q4 = (q(9, bArr) >> 6) & 66076671;
        long q5 = (q(12, bArr) >> 8) & PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK;
        long j2 = q2 * 5;
        long j3 = q3 * 5;
        long j4 = q4 * 5;
        long j5 = q5 * 5;
        byte[] bArr3 = new byte[17];
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        int i3 = 0;
        while (i3 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, 17, (byte) 0);
            }
            long q6 = j10 + (q(0, bArr3) & 67108863);
            long q7 = j6 + ((q(i2, bArr3) >> 2) & 67108863);
            long q8 = j7 + ((q(6, bArr3) >> 4) & 67108863);
            long q9 = j8 + ((q(9, bArr3) >> 6) & 67108863);
            long j11 = q2;
            long q10 = j9 + (((q(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j12 = (q10 * j2) + (q9 * j3) + (q8 * j4) + (q7 * j5) + (q6 * q);
            long j13 = (q10 * j3) + (q9 * j4) + (q8 * j5) + (q7 * q) + (q6 * j11);
            long j14 = (q10 * j4) + (q9 * j5) + (q8 * q) + (q7 * j11) + (q6 * q3);
            long j15 = (q10 * j5) + (q9 * q) + (q8 * j11) + (q7 * q3) + (q6 * q4);
            long j16 = q9 * j11;
            long j17 = q10 * q;
            long j18 = j13 + (j12 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j15 + (j19 >> 26);
            long j21 = j17 + j16 + (q8 * q3) + (q7 * q4) + (q6 * q5) + (j20 >> 26);
            long j22 = j21 >> 26;
            j9 = j21 & 67108863;
            long j23 = (j22 * 5) + (j12 & 67108863);
            i3 += 16;
            j7 = j19 & 67108863;
            j8 = j20 & 67108863;
            j10 = j23 & 67108863;
            j6 = (j18 & 67108863) + (j23 >> 26);
            q2 = j11;
            i2 = 3;
        }
        long j24 = j7 + (j6 >> 26);
        long j25 = j24 & 67108863;
        long j26 = j8 + (j24 >> 26);
        long j27 = j26 & 67108863;
        long j28 = j9 + (j26 >> 26);
        long j29 = j28 & 67108863;
        long j30 = ((j28 >> 26) * 5) + j10;
        long j31 = j30 >> 26;
        long j32 = j30 & 67108863;
        long j33 = (j6 & 67108863) + j31;
        long j34 = j32 + 5;
        long j35 = j34 & 67108863;
        long j36 = j33 + (j34 >> 26);
        long j37 = j25 + (j36 >> 26);
        long j38 = j27 + (j37 >> 26);
        long j39 = j38 & 67108863;
        long j40 = (j29 + (j38 >> 26)) - 67108864;
        long j41 = j40 >> 63;
        long j42 = j32 & j41;
        long j43 = j33 & j41;
        long j44 = j25 & j41;
        long j45 = j27 & j41;
        long j46 = j29 & j41;
        long j47 = ~j41;
        long j48 = j43 | (j36 & 67108863 & j47);
        long j49 = j44 | (j37 & 67108863 & j47);
        long j50 = j45 | (j39 & j47);
        long j51 = (j42 | (j35 & j47) | (j48 << 26)) & 4294967295L;
        long j52 = ((j48 >> 6) | (j49 << 20)) & 4294967295L;
        long j53 = ((j49 >> 12) | (j50 << 14)) & 4294967295L;
        long j54 = ((j50 >> 18) | ((j46 | (j40 & j47)) << 8)) & 4294967295L;
        long q11 = q(16, bArr) + j51;
        long j55 = q11 & 4294967295L;
        long q12 = q(20, bArr) + j52 + (q11 >> 32);
        long q13 = q(24, bArr) + j53 + (q12 >> 32);
        long q14 = (q(28, bArr) + j54 + (q13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        x(0, bArr4, j55);
        x(4, bArr4, q12 & 4294967295L);
        x(8, bArr4, q13 & 4294967295L);
        x(12, bArr4, q14);
        return bArr4;
    }

    public static final StickerStockItem l(j5l0 j5l0Var) {
        int i2 = j5l0Var.a;
        String str = j5l0Var.c;
        String str2 = j5l0Var.d;
        boolean z = j5l0Var.e;
        boolean z2 = j5l0Var.f;
        String str3 = j5l0Var.g;
        List<StickerItem> list = j5l0Var.h;
        StickerStockItemPreviewImage stickerStockItemPreviewImage = j5l0Var.i;
        NotificationImage notificationImage = j5l0Var.j;
        String str4 = j5l0Var.k;
        String str5 = j5l0Var.l;
        String str6 = j5l0Var.m;
        List<Integer> list2 = j5l0Var.n;
        List<Integer> list3 = j5l0Var.o;
        Integer num = j5l0Var.p;
        VmojiAvatar vmojiAvatar = j5l0Var.q;
        return new StickerStockItem(i2, str, str3, str5, str6, list, z, j5l0Var.s, j5l0Var.t, z2, j5l0Var.u, j5l0Var.v, j5l0Var.w, j5l0Var.x, j5l0Var.y, j5l0Var.z, j5l0Var.A, j5l0Var.B, j5l0Var.C, j5l0Var.D, notificationImage, j5l0Var.E, j5l0Var.F, j5l0Var.r, j5l0Var.G, j5l0Var.H, j5l0Var.I, stickerStockItemPreviewImage, str4, j5l0Var.J, j5l0Var.K, j5l0Var.L, vmojiAvatar, j5l0Var.M, list2, list3, num, j5l0Var.N, str2, j5l0Var.O, null, j5l0Var.P, null, null, j5l0Var.Q, 0, 3328, null);
    }

    public static final ym20 m() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2025107012, 0, -1, "com.vk.core.compose.component.defaults.<get-VkPlaceholderDefaults> (VkPlaceholderDefaults.kt:15)");
        }
        ym20 ym20Var = ym20.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return ym20Var;
    }

    public static final a1w n(acw acwVar) {
        if (acwVar instanceof acw.b) {
            a1w a1wVar = q1w.a;
            if (a1wVar != null) {
                return a1wVar;
            }
            return null;
        }
        if (!(acwVar instanceof acw.a)) {
            throw new NoWhenBranchMatchedException();
        }
        a1w a1wVar2 = q1w.b;
        if (a1wVar2 != null) {
            return a1wVar2;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean o(FolderType folderType, com.vk.im.engine.models.c cVar) {
        boolean o;
        switch (u2s.a.$EnumSwitchMapping$0[folderType.ordinal()]) {
            case 1:
            case 4:
                o = true;
                return (!o || folderType == FolderType.CHANNELS || folderType == FolderType.MANAGED_GROUPS) ? false : true;
            case 2:
                o = cVar.o();
                if (!o) {
                }
            case 3:
                if (!BuildInfo.s()) {
                    cVar.getClass();
                }
                o = true;
                if (!o) {
                }
            case 5:
                o = BuildInfo.s();
                if (!o) {
                }
            case 6:
            case 7:
                o = false;
                if (!o) {
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean p(MediaStoreEntry mediaStoreEntry) {
        String lastPathSegment = mediaStoreEntry.f().getLastPathSegment();
        return lastPathSegment != null && brm0.v(lastPathSegment, ".gif", false);
    }

    public static long q(int i2, byte[] bArr) {
        return (((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16)) & 4294967295L;
    }

    public static Thumb r(AudioPhotoDto audioPhotoDto) {
        SparseArray sparseArray = new SparseArray();
        String i2 = audioPhotoDto.i();
        if (i2 != null) {
            sparseArray.append(34, Uri.parse(i2));
        }
        String k2 = audioPhotoDto.k();
        if (k2 != null) {
            sparseArray.append(68, Uri.parse(k2));
        }
        String e2 = audioPhotoDto.e();
        if (e2 != null) {
            sparseArray.append(135, Uri.parse(e2));
        }
        String f2 = audioPhotoDto.f();
        if (f2 != null) {
            sparseArray.append(atv0.b, Uri.parse(f2));
        }
        String g2 = audioPhotoDto.g();
        if (g2 != null) {
            sparseArray.append(300, Uri.parse(g2));
        }
        String j2 = audioPhotoDto.j();
        if (j2 != null) {
            sparseArray.append(600, Uri.parse(j2));
        }
        String d2 = audioPhotoDto.d();
        if (d2 != null) {
            sparseArray.append(1200, Uri.parse(d2));
        }
        List<AudioPhotoSizesDto> l = audioPhotoDto.l();
        if (l != null) {
            for (AudioPhotoSizesDto audioPhotoSizesDto : l) {
                sparseArray.append(audioPhotoSizesDto.getWidth(), Uri.parse(audioPhotoSizesDto.d()));
            }
        }
        return new Thumb(audioPhotoDto.getId(), audioPhotoDto.getWidth(), audioPhotoDto.getHeight(), sparseArray);
    }

    public static final lw6 s(efj efjVar, List list, float f2, k18 k18Var, z190 z190Var, gzs gzsVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i2) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1446156080, i2, -1, "com.vk.core.compose.component.banner.remember (BeforeAvatarImpl.kt:94)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            lw6 lw6Var = new lw6(efjVar, f2, list, k18Var, z190Var, gzsVar, semanticsConfiguration);
            aVar.R(lw6Var);
            x = lw6Var;
        }
        lw6 lw6Var2 = (lw6) x;
        ((zak0) lw6Var2.a).setValue(efjVar);
        ((zak0) lw6Var2.d).setValue(new wow(list));
        ((zak0) lw6Var2.e).setValue(k18Var);
        ((zak0) lw6Var2.f).setValue(z190Var);
        ((zak0) lw6Var2.g).setValue(gzsVar);
        ((zak0) lw6Var2.b).setValue(semanticsConfiguration);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return lw6Var2;
    }

    public static void t(View view, boolean z) {
        if (view != null && view.isEnabled() != z) {
            view.setEnabled(z);
        }
        if (view != null) {
            view.setAlpha(z ? 1.0f : 0.3f);
        }
    }

    public static void u(byte b2, ByteBuffer byteBuffer) throws ProtocolException {
        if (b2 == 0) {
            wr.c(8, byteBuffer);
            return;
        }
        if (b2 == 1) {
            wr.c(1, byteBuffer);
            return;
        }
        if (b2 == 2) {
            wr.c(65535 & byteBuffer.getShort(), byteBuffer);
            return;
        }
        if (b2 == 3) {
            v(byteBuffer, 0);
            return;
        }
        if (b2 != 5) {
            switch (b2) {
                case 8:
                    if (byteBuffer.remaining() < 4) {
                        throw new ProtocolException("Incomplete ECMA array");
                    }
                    int i2 = byteBuffer.getInt();
                    if (i2 > 0) {
                        v(byteBuffer, i2);
                        return;
                    }
                    return;
                case 9:
                    return;
                case 10:
                    if (byteBuffer.remaining() < 4) {
                        throw new ProtocolException("Incomplete AMF array");
                    }
                    int i3 = byteBuffer.getInt();
                    if (i3 > 0) {
                        for (int i4 = 0; i4 < i3 && byteBuffer.remaining() > 0; i4++) {
                            u(byteBuffer.get(), byteBuffer);
                        }
                        return;
                    }
                    return;
                default:
                    throw new ProtocolException(lhg.a(b2, "AMF: Unexpected type:"));
            }
        }
    }

    public static void v(ByteBuffer byteBuffer, int i2) throws ProtocolException {
        while (byteBuffer.remaining() > 0) {
            u((byte) 2, byteBuffer);
            if (byteBuffer.remaining() <= 0) {
                return;
            }
            byte b2 = byteBuffer.get();
            if (9 == b2 && i2 == 0) {
                return;
            } else {
                u(b2, byteBuffer);
            }
        }
    }

    public static final void w() {
        throw new UnsupportedOperationException("Expecting this method not to be called");
    }

    public static void x(int i2, byte[] bArr, long j2) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) (255 & j2);
            i3++;
            j2 >>= 8;
        }
    }

    @Override // xsna.rpr
    public ppr b(boolean z, gzs gzsVar) {
        return !z ? new su9(gzsVar) : new v5t();
    }

    @Override // xsna.moa0
    public Collection c(long j2) {
        return EmptyList.b;
    }

    @Override // xsna.wq5
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void e(String str, yzs yzsVar, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-606062271);
        if ((i2 & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(this) ? 256 : 128;
        }
        int i4 = i3;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-606062271, i4, -1, "com.vk.design.demo.presentation.screens.ModalCardScreenContent.getComposeBottomContent.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (ModalCardScreenContent.kt:321)");
            }
            if (as.a((i4 & 112) | 8, yzsVar, fwu0.l(str, null, null, null, M, i4 & 14, 62), M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mx9(i2, 4, this, str, yzsVar);
        }
    }

    @Override // xsna.jp70
    public Object h() {
        return new ConcurrentSkipListMap();
    }

    public tfx i(List list) {
        tfx tfxVar = new tfx("assets.get", new bo(4), new sr(3));
        tfxVar.i("asset_ids", list);
        return tfxVar;
    }

    @Override // xsna.moa0
    public void a(int i2, long j2, boolean z) {
    }
}
