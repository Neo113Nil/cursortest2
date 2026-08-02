package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.m3b;

/* compiled from: ChannelMessagesSearchCmd.kt */
/* loaded from: classes2.dex */
public final class o3b extends le6<a> {
    public final long b;
    public final String c;
    public final Integer d;
    public final boolean e = true;

    public o3b(long j, String str, Integer num) {
        this.b = j;
        this.c = str;
        this.d = num;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        m3b.b bVar = (m3b.b) fo50.v(new m3b(this.b, this.d, this.c, this.e), w2wVar, "ChannelMessagesSearchCmd", 2);
        List<Msg> list = bVar.a;
        ProfilesSimpleInfo profilesSimpleInfo = bVar.b;
        Integer num = bVar.c;
        return new a(list, profilesSimpleInfo, num, num != null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3b)) {
            return false;
        }
        o3b o3bVar = (o3b) obj;
        return this.b == o3bVar.b && epx.f(this.c, o3bVar.c) && epx.f(this.d, o3bVar.d) && this.e == o3bVar.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a2 = urd0.a(Long.hashCode(this.b) * 31, 961, this.c);
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((a2 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMessagesSearchCmd(channelId=");
        sb.append(this.b);
        sb.append(", query=");
        sb.append(this.c);
        sb.append(", count=null, startCmid=");
        sb.append(this.d);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.e, ')');
    }

    /* compiled from: ChannelMessagesSearchCmd.kt */
    public static final class a {
        public final List<Msg> a;
        public final ProfilesSimpleInfo b;
        public final Integer c;
        public final boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends Msg> list, ProfilesSimpleInfo profilesSimpleInfo, Integer num, boolean z) {
            this.a = list;
            this.b = profilesSimpleInfo;
            this.c = num;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            int a = io.reactivex.rxjava3.subjects.c.a(this.b, this.a.hashCode() * 31, 31);
            Integer num = this.c;
            return Boolean.hashCode(this.d) + ((a + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(messages=");
            sb.append(this.a);
            sb.append(", profiles=");
            sb.append(this.b);
            sb.append(", nextFrom=");
            sb.append(this.c);
            sb.append(", hasMore=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        public a() {
            this(EmptyList.b, new ProfilesSimpleInfo(), null, false);
        }
    }
}
