package xsna;

import com.vk.clips.sdk.drafts.models.ClipsDraftAudioEffectType;
import com.vk.clips.sdk.drafts.models.video.ClipsDraftTranscodingState;
import java.io.File;

/* compiled from: ClipsDraftVideoItem.kt */
/* loaded from: classes17.dex */
public final class cud {
    public final File a;
    public final long b;
    public final long c;
    public final ctd d;
    public final dtd e;
    public final File f;
    public final ClipsDraftTranscodingState g;
    public final rsd h;
    public final boolean i;
    public final float j;
    public final dud k;
    public final boolean l;
    public final ClipsDraftAudioEffectType m;
    public final urd n;
    public final btd o;
    public final eud p;

    public cud(File file, long j, long j2, ctd ctdVar, dtd dtdVar, File file2, ClipsDraftTranscodingState clipsDraftTranscodingState, rsd rsdVar, boolean z, float f, dud dudVar, boolean z2, ClipsDraftAudioEffectType clipsDraftAudioEffectType, urd urdVar, btd btdVar, eud eudVar) {
        this.a = file;
        this.b = j;
        this.c = j2;
        this.d = ctdVar;
        this.e = dtdVar;
        this.f = file2;
        this.g = clipsDraftTranscodingState;
        this.h = rsdVar;
        this.i = z;
        this.j = f;
        this.k = dudVar;
        this.l = z2;
        this.m = clipsDraftAudioEffectType;
        this.n = urdVar;
        this.o = btdVar;
        this.p = eudVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cud)) {
            return false;
        }
        cud cudVar = (cud) obj;
        return epx.f(this.a, cudVar.a) && this.b == cudVar.b && this.c == cudVar.c && epx.f(this.d, cudVar.d) && epx.f(this.e, cudVar.e) && epx.f(this.f, cudVar.f) && this.g == cudVar.g && epx.f(this.h, cudVar.h) && this.i == cudVar.i && Float.compare(this.j, cudVar.j) == 0 && epx.f(this.k, cudVar.k) && this.l == cudVar.l && this.m == cudVar.m && epx.f(this.n, cudVar.n) && epx.f(this.o, cudVar.o) && epx.f(this.p, cudVar.p);
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ctd ctdVar = this.d;
        int hashCode = (a + (ctdVar == null ? 0 : ctdVar.hashCode())) * 31;
        dtd dtdVar = this.e;
        int hashCode2 = (hashCode + (dtdVar == null ? 0 : dtdVar.hashCode())) * 31;
        File file = this.f;
        int a2 = io.reactivex.rxjava3.subjects.b.a(this.j, qoy.b((this.h.hashCode() + ((this.g.hashCode() + ((hashCode2 + (file == null ? 0 : file.hashCode())) * 31)) * 31)) * 31, 31, this.i), 31);
        dud dudVar = this.k;
        int hashCode3 = (this.m.hashCode() + qoy.b((a2 + (dudVar == null ? 0 : dudVar.hashCode())) * 31, 31, this.l)) * 31;
        urd urdVar = this.n;
        int hashCode4 = (hashCode3 + (urdVar == null ? 0 : urdVar.hashCode())) * 961;
        btd btdVar = this.o;
        return this.p.hashCode() + ((hashCode4 + (btdVar != null ? btdVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClipsDraftVideoItem(videoFile=" + this.a + ", startTimeMs=" + this.b + ", endTimeMs=" + this.c + ", maskInfo=" + this.d + ", musicInfo=" + this.e + ", reversedVideoFile=" + this.f + ", transcodingState=" + this.g + ", clipFilterInfo=" + this.h + ", recordedWithTimer=" + this.i + ", speed=" + this.j + ", transform=" + this.k + ", fromPhoto=" + this.l + ", audioEffect=" + this.m + ", audioConfig=" + this.n + ", videoConfig=null, originFileLocation=" + this.o + ", volumeItem=" + this.p + ')';
    }
}
