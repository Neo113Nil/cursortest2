package xsna;

import android.net.Uri;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.Artist;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.pyn;

/* compiled from: AuthorVideoItemsLoader.kt */
/* loaded from: classes2.dex */
public final class jd5 {
    public final vit0 a;
    public final bzs0 b;
    public final h7v c;
    public final ows0 d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new n1(5));
    public final o5o f = new o5o(e43.l(new p80(), new jsw(), new zml()));

    public jd5(vit0 vit0Var, bzs0 bzs0Var, h7v h7vVar, gus0 gus0Var) {
        this.a = vit0Var;
        this.b = bzs0Var;
        this.c = h7vVar;
        this.d = gus0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.core.q<AboutVideoItem.d> a(final VideoFile videoFile) {
        io.reactivex.rxjava3.core.q T;
        List<Artist> list;
        Artist artist;
        Image image;
        ImageSize imageSize;
        io.reactivex.rxjava3.core.q T2;
        String str;
        ows0 ows0Var;
        io.reactivex.rxjava3.core.q<R> s0 = o25.a().m(true).U(new x34(new pl2(1), 1)).s0(new y34(new ed5(dz5.B(videoFile, videoFile.I0()), this, videoFile, 0), 1));
        if (fxc0.B().J().Y0()) {
            String M0 = videoFile.M0();
            if (M0 == null) {
                T = io.reactivex.rxjava3.core.q.T(Uri.EMPTY);
            }
            T = !fxc0.B().J().M1() ? this.b.i(videoFile.r1(), M0).w().p0(Uri.parse(M0)).d0(Uri.parse(M0)) : io.reactivex.rxjava3.core.q.T(Uri.parse(M0));
        } else {
            MusicVideoFile musicVideoFile = videoFile instanceof MusicVideoFile ? (MusicVideoFile) videoFile : null;
            if ((musicVideoFile == null || (list = musicVideoFile.B1) == null || (artist = (Artist) j5g.a0(list)) == null || (image = artist.f) == null || (imageSize = (ImageSize) j5g.a0(image.Fb())) == null || (M0 = imageSize.d.d) == null) && (M0 = videoFile.M0()) == null) {
                T = io.reactivex.rxjava3.core.q.T(Uri.EMPTY);
            }
            if (!fxc0.B().J().M1()) {
            }
        }
        io.reactivex.rxjava3.internal.operators.observable.t tVar = new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: xsna.hd5
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                if (!BuildInfo.q()) {
                    return io.reactivex.rxjava3.core.q.T(new AboutVideoItem.d.a(pyn.a.a));
                }
                VideoFile videoFile2 = videoFile;
                UserId B = dz5.B(videoFile2, videoFile2.I0());
                io.reactivex.rxjava3.core.q<T> p0 = new io.reactivex.rxjava3.internal.operators.observable.q(new pn(7)).p0(s3q0.a);
                jd5 jd5Var = this;
                io.reactivex.rxjava3.internal.operators.observable.j1 U = p0.s0(new com.vk.movika.sdk.base.flow.binding.c(new defpackage.b0(4, jd5Var, B), 3)).U(new ed(new fd5(jd5Var, B, videoFile2, 0), 2));
                pyn.a aVar = pyn.a.a;
                return io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(new AboutVideoItem.d.a(aVar)), U).d0(new AboutVideoItem.d.a(aVar));
            }
        });
        if ((videoFile instanceof MusicVideoFile) && fxc0.B().J().Y0()) {
            T2 = io.reactivex.rxjava3.core.q.T(AboutVideoItem.d.InterfaceC1215d.a.a);
        } else {
            s75 c = com.vk.toggle.d.c();
            String str2 = c != null ? c.a : null;
            Owner s = videoFile.s();
            if (str2 != null && (!drm0.N(str2)) && s != null && fkq0.b(s.b) && (s.i(2) || videoFile.t0())) {
                String format = String.format(str2, Arrays.copyOf(new Object[]{"club" + fkq0.e(s.b).b, Integer.valueOf(videoFile.o0())}, 2));
                h7v h7vVar = this.c;
                Hint p = h7vVar != null ? h7vVar.p(HintId.CREATORS_DASHBOARD_ANALYTICS.getId()) : null;
                if (p == null || (str = p.c) == null || drm0.N(str) || (ows0Var = this.d) == null) {
                    T2 = io.reactivex.rxjava3.core.q.T(new AboutVideoItem.d.InterfaceC1215d.b(format, null));
                } else {
                    io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3 = ows0Var.b3();
                    b3.getClass();
                    a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
                    b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
                    T2 = new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.y(b3, qVar, aVar).U(new s41(new u9(4, p, format), 4)), qVar, aVar);
                }
            } else {
                T2 = io.reactivex.rxjava3.core.q.T(AboutVideoItem.d.InterfaceC1215d.a.a);
            }
        }
        return io.reactivex.rxjava3.core.q.j(s0, T, tVar, T2, new r41(new id5(videoFile, this), 4));
    }
}
