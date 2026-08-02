package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.offline.DownloadRequest;
import com.vk.api.generated.audio.dto.AudioStreamDto;
import com.vk.music.offline.impl.mediastore.download.service.DownloadService;
import java.util.ArrayList;

/* compiled from: MusicDownloadServiceHelperImpl.kt */
/* loaded from: classes.dex */
public final class ai40 implements zh40 {
    @Override // xsna.zh40
    public final void a(String str) {
        bpn0 bpn0Var = DownloadService.p;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        DownloadService.a.e(context, str);
    }

    @Override // xsna.zh40
    public final void b(ArrayList<String> arrayList) {
        bpn0 bpn0Var = DownloadService.p;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        DownloadService.a.f(context, arrayList);
    }

    @Override // xsna.zh40
    public final void c(String str) {
        bpn0 bpn0Var = DownloadService.p;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        DownloadService.a.g(context, str);
    }

    @Override // xsna.zh40
    public final void d(String str, AudioStreamDto.TypeDto typeDto, Uri uri, byte[] bArr) {
        DownloadRequest.b bVar = new DownloadRequest.b(str, uri);
        bVar.c(bArr);
        DownloadRequest a = bVar.a();
        bpn0 bpn0Var = DownloadService.p;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        DownloadService.a.d(context, a);
    }

    @Override // xsna.zh40
    public final void e(ArrayList<String> arrayList) {
        bpn0 bpn0Var = DownloadService.p;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        DownloadService.a.h(context, arrayList);
    }

    @Override // xsna.zh40
    public final void f(Uri uri, String str, byte[] bArr) {
        DownloadRequest.b bVar = new DownloadRequest.b(str, uri);
        bVar.c(bArr);
        DownloadRequest a = bVar.a();
        bpn0 bpn0Var = DownloadService.p;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        DownloadService.a.d(context, a);
    }
}
