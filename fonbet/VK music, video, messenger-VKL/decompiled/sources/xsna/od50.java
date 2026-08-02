package xsna;

import androidx.annotation.NonNull;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.music.MusicTrack;
import org.jsoup.parser.ParseErrorList;

/* compiled from: MusicTrackModelImpl.java */
/* loaded from: classes3.dex */
public final class od50 implements hx2, kjy {
    public final Object b;
    public final Object c;

    public /* synthetic */ od50(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.kjy
    public mkv a(ckv ckvVar, yjv yjvVar) {
        Object i;
        i = vhk0.i((wdp0) this.b, "KnetEngine " + ((kjy) this.c).getId(), (r5 & 2) == 0, new xdf(2), new yf1(this, ckvVar, yjvVar, 7));
        return (mkv) i;
    }

    @Override // xsna.hx2
    public void b(Object obj) {
        nd50.F((nd50) this.c, (MusicTrack) this.b, ((AudioAudioDto) obj).getId());
    }

    public io.reactivex.rxjava3.core.x c() {
        a69 a69Var = (a69) ((gzs) this.c).invoke();
        return a69Var != null ? ((lrt) this.b).b().l(new nu0(new r9k(a69Var, 14), 25)) : io.reactivex.rxjava3.core.x.k(new it80(null));
    }

    public io.reactivex.rxjava3.internal.operators.observable.y d() {
        com.vk.voip.ui.c.b.getClass();
        io.reactivex.rxjava3.subjects.f<a6r> fVar = com.vk.voip.ui.c.Y.f;
        yi2 yi2Var = new yi2(new ol(29), 21);
        fVar.getClass();
        io.reactivex.rxjava3.core.q o0 = new io.reactivex.rxjava3.internal.operators.observable.o0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, yi2Var), new mm6(new m4g(this, 25), 19)).o0(c());
        o0.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(o0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    @Override // xsna.hx2
    public void e(@NonNull VKApiExecutionException vKApiExecutionException) {
        nd50.E((nd50) this.c, (MusicTrack) this.b, vKApiExecutionException);
    }

    @Override // xsna.kjy
    public String getId() {
        return ((kjy) this.c).getId();
    }

    public od50(org.jsoup.parser.a aVar) {
        this.b = aVar;
        this.c = new ParseErrorList();
    }

    public od50(nd50 nd50Var, MusicTrack musicTrack) {
        this.c = nd50Var;
        this.b = musicTrack;
    }
}
