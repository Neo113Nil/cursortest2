package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.chat.clips.decoration.api.models.ImChatPaginationKey;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.gob;

/* compiled from: ChatClipsDecorationRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class nob implements gob {
    public final s2f a;
    public final com.vk.im.engine.models.c b;
    public final lzv c;
    public final f1w d;
    public final io.reactivex.rxjava3.subjects.f<ProfilesInfo> e;
    public final io.reactivex.rxjava3.subjects.f f;

    public nob(s2f s2fVar, com.vk.im.engine.models.c cVar, lzv lzvVar, f1w f1wVar) {
        this.a = s2fVar;
        this.b = cVar;
        this.c = lzvVar;
        this.d = f1wVar;
        io.reactivex.rxjava3.subjects.f<ProfilesInfo> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.e = fVar;
        this.f = fVar;
    }

    @Override // xsna.gob
    public final io.reactivex.rxjava3.internal.operators.single.r a(ImChatPaginationKey imChatPaginationKey, int i, boolean z) {
        return new io.reactivex.rxjava3.internal.operators.single.r(this.c.b(this, new lpe(imChatPaginationKey.b, i, z ? -i : 1, imChatPaginationKey.d, imChatPaginationKey.c)), new pb(new mob(imChatPaginationKey, this, z, i), 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gob
    public final ArrayList b(Msg msg, int i) {
        if (msg instanceof aux0) {
            return p490.y(((aux0) msg).K(), this.d.a(), Integer.valueOf(i));
        }
        return null;
    }

    @Override // xsna.gob
    public final io.reactivex.rxjava3.internal.operators.single.r c(long j) {
        return new io.reactivex.rxjava3.internal.operators.single.r(this.c.b(this, new d1e0(this.d.a(), Source.CACHE, false)), new nu0(new job(this, j), 6));
    }

    @Override // xsna.gob
    public final Peer d() {
        return this.d.a();
    }

    @Override // xsna.gob
    public final io.reactivex.rxjava3.internal.operators.single.y e(LinkedHashSet linkedHashSet) {
        return this.c.b(this, new dj30(MsgIdType.LOCAL_ID, linkedHashSet, null, Source.CACHE, false, null, 36)).l(new nb(new mb(linkedHashSet, 22), 7));
    }

    @Override // xsna.gob
    public final VideoFile f(SdkClipVideoFile sdkClipVideoFile) {
        return this.a.a(sdkClipVideoFile);
    }

    @Override // xsna.gob
    public final io.reactivex.rxjava3.core.x<gob.a> g(long j, int i, Integer num) {
        Exception exc;
        List singletonList;
        if (num == null) {
            try {
                singletonList = Collections.singletonList(Integer.valueOf(i));
            } catch (Exception e) {
                exc = e;
                return io.reactivex.rxjava3.core.x.i(exc);
            }
        } else {
            try {
                singletonList = e43.l(Integer.valueOf(i), num);
            } catch (Exception e2) {
                e = e2;
                exc = e;
                return io.reactivex.rxjava3.core.x.i(exc);
            }
        }
        MsgIdType msgIdType = MsgIdType.CNV_ID;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        try {
            return io.reactivex.rxjava3.core.x.B(c(j), this.c.b(this, new ej30(msgIdType, singletonList, Peer.a.b(j), Source.ACTUAL, true, this)), new pi0(new cc5(1), 8)).l(new mm6(new iob(i, num), 9));
        } catch (Exception e3) {
            e = e3;
            exc = e;
            return io.reactivex.rxjava3.core.x.i(exc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gob
    public final ArrayList h(Msg msg, Integer num, int i) {
        if (msg instanceof aux0) {
            return p490.i(((aux0) msg).K(), this.d.a(), num != null ? num.intValue() : -1, i);
        }
        return null;
    }

    @Override // xsna.gob
    public final io.reactivex.rxjava3.core.x<? extends Object> i(gob.b bVar) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer b = Peer.a.b(bVar.a);
        String str = bVar.b;
        MsgTextFormat msgTextFormat = bVar.c;
        List<Attach> list = bVar.d;
        Integer num = bVar.e;
        ly30 ly30Var = bVar.f;
        String str2 = bVar.g;
        String str3 = str2 == null ? "" : str2;
        String str4 = bVar.h;
        return this.c.b(this, new pz30(b, str, msgTextFormat, null, null, str3, str4 == null ? "" : str4, "clips_fullscreen", list, null, num, null, ly30Var, 10776));
    }

    @Override // xsna.gob
    public final io.reactivex.rxjava3.core.x<s3q0> j(Msg msg) {
        MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
        if (msgFromUser == null) {
            return io.reactivex.rxjava3.core.x.k(s3q0.a);
        }
        if (msgFromUser.cc()) {
            return io.reactivex.rxjava3.core.x.k(s3q0.a);
        }
        return this.c.b(this, new com.vk.im.engine.commands.messages.f(Integer.valueOf(msg.b), null, this, true));
    }

    @Override // xsna.gob
    public final io.reactivex.rxjava3.subjects.f k() {
        return this.f;
    }
}
