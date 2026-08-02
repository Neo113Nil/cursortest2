package xsna;

import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.messages.MsgFromChannel;

/* compiled from: ArchiveChannelsViewState.kt */
/* loaded from: classes15.dex */
public abstract class fi3 implements hfz, a7i {

    /* compiled from: ArchiveChannelsViewState.kt */
    public static final class a extends fi3 {
        public static final a b = new a();

        @Override // xsna.fi3, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(hashCode());
        }
    }

    /* compiled from: ArchiveChannelsViewState.kt */
    public static final class b extends fi3 {
        public final long b;
        public final ImageList c;
        public final CharSequence d;
        public final CharSequence e;
        public final boolean f;

        public b(long j, ImageList imageList, CharSequence charSequence, CharSequence charSequence2, boolean z) {
            this.b = j;
            this.c = imageList;
            this.d = charSequence;
            this.e = charSequence2;
            this.f = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f;
        }

        @Override // xsna.fi3, xsna.hfz
        public final Number getItemId() {
            return Long.valueOf(this.b);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + u11.c(u11.c(fw3.a(Long.hashCode(this.b) * 31, 31, this.c.b), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Channel(id=");
            sb.append(this.b);
            sb.append(", avatar=");
            sb.append(this.c);
            sb.append(", name=");
            sb.append((Object) this.d);
            sb.append(", description=");
            sb.append((Object) this.e);
            sb.append(", selected=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: ArchiveChannelsViewState.kt */
    public static final class c extends fi3 {
        public static final c b = new c();

        @Override // xsna.fi3, xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return Integer.MIN_VALUE;
        }
    }

    /* compiled from: ArchiveChannelsViewState.kt */
    public static final class d extends fi3 {
        public final long b;
        public final ImageList c;
        public final CharSequence d;
        public final MsgFromChannel e;
        public final boolean f;
        public final boolean g;
        public final int h;

        public d(long j, ImageList imageList, String str, MsgFromChannel msgFromChannel, boolean z, boolean z2, int i) {
            this.b = j;
            this.c = imageList;
            this.d = str;
            this.e = msgFromChannel;
            this.f = z;
            this.g = z2;
            this.h = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h;
        }

        @Override // xsna.fi3, xsna.hfz
        public final Number getItemId() {
            return Long.valueOf(this.b);
        }

        public final int hashCode() {
            int c = u11.c(fw3.a(Long.hashCode(this.b) * 31, 31, this.c.b), 31, this.d);
            MsgFromChannel msgFromChannel = this.e;
            return Integer.hashCode(this.h) + qoy.b(qoy.b((c + (msgFromChannel == null ? 0 : msgFromChannel.hashCode())) * 31, 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommunityChannel(id=");
            sb.append(this.b);
            sb.append(", avatar=");
            sb.append(this.c);
            sb.append(", name=");
            sb.append((Object) this.d);
            sb.append(", lastMessages=");
            sb.append(this.e);
            sb.append(", isVerified=");
            sb.append(this.f);
            sb.append(", isMuted=");
            sb.append(this.g);
            sb.append(", countUnread=");
            return vu5.b(sb, this.h, ')');
        }
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }

    @Override // xsna.a7i
    public boolean za(a7i a7iVar) {
        return equals(a7iVar);
    }
}
