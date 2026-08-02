package xsna;

import android.os.Bundle;
import com.vk.common.links.LinksParserData;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.TitleAction;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AboutVideoItemsLoader.kt */
/* loaded from: classes2.dex */
public final class t8 {
    public final jsf0 a;
    public final jd5 b;
    public final io.reactivex.rxjava3.subjects.d<s3q0> c = io.reactivex.rxjava3.subjects.d.O0(s3q0.a);

    public t8(vit0 vit0Var, bzs0 bzs0Var, jsf0 jsf0Var) {
        this.a = jsf0Var;
        this.b = new jd5(vit0Var, bzs0Var, null, null);
    }

    public static final List a(t8 t8Var, hfz hfzVar) {
        t8Var.getClass();
        return Collections.singletonList(hfzVar);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 b(VideoFile videoFile) {
        int i;
        t8 t8Var;
        io.reactivex.rxjava3.core.q s0Var;
        int b0 = videoFile instanceof MusicVideoFile ? (int) ((MusicVideoFile) videoFile).F1 : videoFile.b0();
        ucp ucpVar = ucp.a;
        CharSequence i2 = ucp.i(videoFile.getTitle());
        int L8 = videoFile.L8();
        int duration = videoFile.getDuration();
        CharSequence i3 = ucp.i(xwk.d().a().d(cqm0.f(videoFile.j1()), new LinksParserData(0, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, LinksParserData.HashtagService.Video, (saz) null, 0, (taz) null, false, 16127)));
        TitleAction Ha = videoFile.Ha();
        boolean k = zjq.k(videoFile);
        OrdAdInfo p1 = videoFile.p1();
        boolean c = fxc0.B().c(videoFile);
        Long z7 = videoFile.z7();
        boolean z = false;
        if (fxc0.B().J().a2() && videoFile.T1()) {
            i = 0;
            z = true;
        } else {
            i = 0;
        }
        AboutVideoItem.h hVar = new AboutVideoItem.h(i2, b0, L8, i3, duration, Ha, k, p1, c, z7, z, EmptyList.b, videoFile.z0());
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var2 = new io.reactivex.rxjava3.internal.operators.observable.s0(new i7(hVar, i));
        if (fxc0.B().J().Y()) {
            Integer K2 = videoFile.K2();
            if ((K2 != null ? K2.intValue() : i) > 0) {
                t8Var = this;
                s0Var = t8Var.c.s0(new j7(new com.vk.movika.sdk.base.logic.processor.d(1, videoFile, hVar), i));
                return io.reactivex.rxjava3.core.q.X(s0Var2, s0Var).U(new l7(new m8(1, t8Var, t8.class, "toBlock", "toBlock(Lcom/vk/core/ui/adapter_delegate/ListItem;)Ljava/util/List;", 0, 0), i));
            }
        }
        t8Var = this;
        s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new i7(hVar, i));
        return io.reactivex.rxjava3.core.q.X(s0Var2, s0Var).U(new l7(new m8(1, t8Var, t8.class, "toBlock", "toBlock(Lcom/vk/core/ui/adapter_delegate/ListItem;)Ljava/util/List;", 0, 0), i));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 c(VideoFile videoFile) {
        ftp ftpVar = new ftp(videoFile);
        return ftpVar.f.U(new w7(new v7(this, 0), 0));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 d(VideoFile videoFile) {
        return this.b.a(videoFile).U(new h7(new q8(1, this, t8.class, "toBlock", "toBlock(Lcom/vk/core/ui/adapter_delegate/ListItem;)Ljava/util/List;", 0, 0), 0));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 e(VideoFile videoFile) {
        return io.reactivex.rxjava3.core.q.q(io.reactivex.rxjava3.core.q.T(videoFile), new io.reactivex.rxjava3.internal.operators.observable.q(new z7(videoFile, 0))).U(new p7(new com.vk.im.engine.internal.api_commands.messages.a(1, videoFile, this), 0)).U(new q7(new s8(1, this, t8.class, "toBlock", "toBlock(Lcom/vk/core/ui/adapter_delegate/ListItem;)Ljava/util/List;", 0, 0), 0));
    }
}
