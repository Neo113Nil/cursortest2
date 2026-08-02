package xsna;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsm;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.pending.PendingPhotoAttachment;
import com.vkontakte.android.R;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.mediarecord.VideoRecord;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class itz0 implements w101, c46, izn, gc40, g94 {
    public final Object b;

    public /* synthetic */ itz0(Object obj) {
        this.b = obj;
    }

    @Override // xsna.c46
    @Nullable
    public Rect G() {
        Point[] zzo = ((zzsm) this.b).zzo();
        if (zzo == null) {
            return null;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (Point point : zzo) {
            i2 = Math.min(i2, point.x);
            i = Math.max(i, point.x);
            i3 = Math.min(i3, point.y);
            i4 = Math.max(i4, point.y);
        }
        return new Rect(i2, i3, i, i4);
    }

    @Override // xsna.c46
    @Nullable
    public Point[] I() {
        return ((zzsm) this.b).zzo();
    }

    @Override // xsna.c46
    @Nullable
    public String R() {
        return ((zzsm) this.b).zzm();
    }

    @Override // xsna.gc40
    public List a() {
        MusicTrack musicTrack = (MusicTrack) this.b;
        DownloadingState downloadingState = musicTrack.J;
        return ((downloadingState instanceof DownloadingState.Downloading) || (downloadingState instanceof DownloadingState.PendingDownload)) ? Collections.singletonList(new ec40(R.id.music_action_cancel_download, musicTrack, R.string.music_action_cancel_download, R.string.music_action_cancel_download, 0, 0, 0, 1008)) : Collections.singletonList(new ec40(R.id.music_action_remove_from_storage, musicTrack, R.string.music_action_remove_from_storage_description, R.string.music_action_remove_from_storage_description, R.drawable.vk_icon_download_cancel_outline_28, R.attr.vk_ui_icon_negative, 0, VideoRecord.DEFAULT_MAX_DIMENSION));
    }

    @Override // xsna.w101
    public void b(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (((ByteBuffer) this.b)) {
            int i2 = (int) j;
            ((ByteBuffer) this.b).position(i2);
            ((ByteBuffer) this.b).limit(i2 + i);
            slice = ((ByteBuffer) this.b).slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // xsna.gc40
    public EmptyList c() {
        return EmptyList.b;
    }

    @Override // xsna.g94
    public int d(Attachment attachment) {
        return -1;
    }

    @Override // xsna.izn
    public void e(yzs yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(410129660);
        if ((i & 6) == 0) {
            i2 = (M.y(yzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(410129660, i2, -1, "com.vk.design.demo.presentation.screens.DonutUserStackContent.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (DonutUserStackContent.kt:142)");
            }
            yzsVar.invoke(Integer.valueOf(((rg50) this.b).getIntValue()), M, Integer.valueOf((i2 << 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bo7(this, yzsVar, i, 2);
        }
    }

    public boolean f(int i) {
        k6z0 k6z0Var = (k6z0) this.b;
        switch (i) {
            case 0:
                return k6z0Var.a || k6z0Var.m;
            case 1:
                return k6z0Var.b || k6z0Var.m;
            case 2:
                return k6z0Var.c || k6z0Var.m;
            case 3:
                return k6z0Var.d || k6z0Var.m;
            case 4:
                return k6z0Var.e || k6z0Var.m;
            case 5:
                return k6z0Var.f || k6z0Var.m;
            case 6:
                return k6z0Var.g || k6z0Var.m;
            case 7:
                return k6z0Var.h || k6z0Var.m;
            case 8:
                return k6z0Var.i || k6z0Var.m;
            case 9:
                return k6z0Var.j || k6z0Var.m;
            case 10:
                return k6z0Var.k || k6z0Var.m;
            case 11:
                return k6z0Var.l || k6z0Var.m;
            case 12:
            default:
                return false;
            case 13:
                return k6z0Var.n || k6z0Var.m;
        }
    }

    @Override // xsna.g94
    public List getAll() {
        return ((com.vk.writebar.c) this.b).d();
    }

    @Override // xsna.c46
    public int getFormat() {
        return ((zzsm) this.b).zza();
    }

    @Override // xsna.c46
    public int h() {
        return ((zzsm) this.b).zzb();
    }

    @Override // xsna.w101
    public long zza() {
        return ((ByteBuffer) this.b).capacity();
    }

    public itz0(ByteBuffer byteBuffer) {
        this.b = byteBuffer.slice();
    }

    @Override // xsna.g94
    public void i(int i) {
    }

    @Override // xsna.g94
    public void j(LinkedHashMap linkedHashMap) {
    }

    @Override // xsna.g94
    public void g(PendingPhotoAttachment pendingPhotoAttachment, Integer num) {
    }
}
