package xsna;

import android.net.Uri;
import com.vk.api.generated.audio.dto.AudioStreamDto;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: OneVideoMusicDownloadServiceHelperImpl.kt */
/* loaded from: classes3.dex */
public final class km80 implements zh40 {
    public final com.vk.music.offline.api.domain.download.b a;
    public final ai40 b;

    public km80(fk80 fk80Var, ai40 ai40Var) {
        this.a = fk80Var;
        this.b = ai40Var;
    }

    @Override // xsna.zh40
    public final void a(String str) {
        this.a.a(str);
        this.b.a(str);
    }

    @Override // xsna.zh40
    public final void b(ArrayList<String> arrayList) {
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            this.a.a((String) it.next());
        }
        this.b.b(arrayList);
    }

    @Override // xsna.zh40
    public final void c(String str) {
        this.a.i(str);
        this.b.c(str);
    }

    @Override // xsna.zh40
    public final void d(String str, AudioStreamDto.TypeDto typeDto, Uri uri, byte[] bArr) {
        this.a.h(str, typeDto, uri, bArr);
    }

    @Override // xsna.zh40
    public final void e(ArrayList<String> arrayList) {
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            this.a.i((String) it.next());
        }
        this.b.e(arrayList);
    }

    @Override // xsna.zh40
    public final void f(Uri uri, String str, byte[] bArr) {
        this.b.f(uri, str, bArr);
    }
}
