package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.chat.clips.decoration.api.models.ImChatPaginationKey;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ChatClipsDecorationRepository.kt */
/* loaded from: classes2.dex */
public interface gob {

    /* compiled from: ChatClipsDecorationRepository.kt */
    public static final class a {
        public final Msg a;
        public final String b;
        public final DialogExt c;

        public a(Msg msg, String str, DialogExt dialogExt) {
            this.a = msg;
            this.b = str;
            this.c = dialogExt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "MsgWithDialogExt(msg=" + this.a + ", linkedText=" + this.b + ", dialogExt=" + this.c + ')';
        }
    }

    /* compiled from: ChatClipsDecorationRepository.kt */
    public static final class b {
        public final long a;
        public final String b;
        public final MsgTextFormat c;
        public final List<Attach> d;
        public final Integer e;
        public final ly30 f;
        public final String g;
        public final String h;

        public b() {
            throw null;
        }

        public b(long j, String str, MsgTextFormat msgTextFormat, List list, Integer num, ly30 ly30Var, int i) {
            str = (i & 2) != 0 ? "" : str;
            msgTextFormat = (i & 4) != 0 ? new MsgTextFormat(0, EmptyList.b, 1, null) : msgTextFormat;
            num = (i & 16) != 0 ? null : num;
            ly30Var = (i & 32) != 0 ? new ly30(null, null, null, 15) : ly30Var;
            String str2 = (i & 128) != 0 ? null : "quick_chat_recom_button";
            this.a = j;
            this.b = str;
            this.c = msgTextFormat;
            this.d = list;
            this.e = num;
            this.f = ly30Var;
            this.g = null;
            this.h = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h);
        }

        public final int hashCode() {
            int a = fw3.a((this.c.hashCode() + urd0.a(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
            Integer num = this.e;
            int hashCode = (this.f.hashCode() + ((a + (num == null ? 0 : num.hashCode())) * 31)) * 31;
            String str = this.g;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.h;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SendMessageArgs(dialogId=");
            sb.append(this.a);
            sb.append(", text=");
            sb.append(this.b);
            sb.append(", textFormat=");
            sb.append(this.c);
            sb.append(", attaches=");
            sb.append(this.d);
            sb.append(", replyMsgCnvId=");
            sb.append(this.e);
            sb.append(", msgSendConfig=");
            sb.append(this.f);
            sb.append(", referer=");
            sb.append(this.g);
            sb.append(", refSource=");
            return ho8.a(sb, this.h, ')');
        }
    }

    io.reactivex.rxjava3.internal.operators.single.r a(ImChatPaginationKey imChatPaginationKey, int i, boolean z);

    ArrayList b(Msg msg, int i);

    io.reactivex.rxjava3.internal.operators.single.r c(long j);

    Peer d();

    io.reactivex.rxjava3.internal.operators.single.y e(LinkedHashSet linkedHashSet);

    VideoFile f(SdkClipVideoFile sdkClipVideoFile);

    io.reactivex.rxjava3.core.x<a> g(long j, int i, Integer num);

    ArrayList h(Msg msg, Integer num, int i);

    io.reactivex.rxjava3.core.x<? extends Object> i(b bVar);

    io.reactivex.rxjava3.core.x<s3q0> j(Msg msg);

    io.reactivex.rxjava3.subjects.f k();
}
