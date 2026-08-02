package xsna;

import android.graphics.drawable.Drawable;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.WritePermission;
import com.vk.im.engine.models.dialogs.TransitionData;
import com.vk.im.engine.models.stories.ImStoryState;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ProfileInfoState.kt */
/* loaded from: classes2.dex */
public abstract class xxd0 {

    /* compiled from: ProfileInfoState.kt */
    public static final class a extends xxd0 {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(error="), this.a, ')');
        }
    }

    /* compiled from: ProfileInfoState.kt */
    public static final class c extends xxd0 {
        public static final c a = new c();
    }

    /* compiled from: ProfileInfoState.kt */
    public static final class b extends xxd0 {
        public final CharSequence a;
        public final CharSequence b;
        public final CharSequence c;
        public final CharSequence d;
        public final VerifyInfo e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final ImageList k;
        public final Drawable l;
        public final AvatarBorderType m;
        public final List<xub> n;
        public final List<xub> o;
        public final List<nwb> p;
        public final boolean q;
        public final ImStoryState r;
        public final CharSequence s;
        public final WritePermission t;
        public final TransitionData u;
        public final boolean v;

        /* JADX WARN: Multi-variable type inference failed */
        public b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, VerifyInfo verifyInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ImageList imageList, Drawable drawable, AvatarBorderType avatarBorderType, List<? extends xub> list, List<? extends xub> list2, List<? extends nwb> list3, boolean z6, ImStoryState imStoryState, CharSequence charSequence5, WritePermission writePermission, TransitionData transitionData, boolean z7) {
            this.a = charSequence;
            this.b = charSequence2;
            this.c = charSequence3;
            this.d = charSequence4;
            this.e = verifyInfo;
            this.f = z;
            this.g = z2;
            this.h = z3;
            this.i = z4;
            this.j = z5;
            this.k = imageList;
            this.l = drawable;
            this.m = avatarBorderType;
            this.n = list;
            this.o = list2;
            this.p = list3;
            this.q = z6;
            this.r = imStoryState;
            this.s = charSequence5;
            this.t = writePermission;
            this.u = transitionData;
            this.v = z7;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b a(b bVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
            CharSequence charSequence = bVar.a;
            CharSequence charSequence2 = bVar.b;
            CharSequence charSequence3 = bVar.c;
            CharSequence charSequence4 = bVar.d;
            VerifyInfo verifyInfo = bVar.e;
            boolean z = bVar.f;
            boolean z2 = bVar.g;
            boolean z3 = bVar.h;
            boolean z4 = bVar.i;
            boolean z5 = bVar.j;
            ImageList imageList = bVar.k;
            Drawable drawable = bVar.l;
            AvatarBorderType avatarBorderType = bVar.m;
            List<xub> list = (i & 8192) != 0 ? bVar.n : arrayList;
            List<xub> list2 = (i & 16384) != 0 ? bVar.o : arrayList2;
            List list3 = (i & 32768) != 0 ? bVar.p : arrayList3;
            boolean z6 = bVar.q;
            ImStoryState imStoryState = bVar.r;
            CharSequence charSequence5 = bVar.s;
            WritePermission writePermission = bVar.t;
            TransitionData transitionData = bVar.u;
            boolean z7 = bVar.v;
            bVar.getClass();
            return new b(charSequence, charSequence2, charSequence3, charSequence4, verifyInfo, z, z2, z3, z4, z5, imageList, drawable, avatarBorderType, list, list2, (List<? extends nwb>) list3, z6, imStoryState, charSequence5, writePermission, transitionData, z7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && this.j == bVar.j && epx.f(this.k, bVar.k) && epx.f(this.l, bVar.l) && this.m == bVar.m && epx.f(this.n, bVar.n) && epx.f(this.o, bVar.o) && epx.f(this.p, bVar.p) && this.q == bVar.q && this.r == bVar.r && epx.f(this.s, bVar.s) && epx.f(this.t, bVar.t) && epx.f(this.u, bVar.u) && this.v == bVar.v;
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.e.hashCode() + u11.c(u11.c(u11.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
            ImageList imageList = this.k;
            int hashCode = (b + (imageList == null ? 0 : imageList.b.hashCode())) * 31;
            Drawable drawable = this.l;
            int hashCode2 = (this.r.hashCode() + qoy.b(fw3.a(fw3.a(fw3.a((this.m.hashCode() + ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31)) * 31, 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31;
            CharSequence charSequence = this.s;
            int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            WritePermission writePermission = this.t;
            int hashCode4 = (hashCode3 + (writePermission == null ? 0 : writePermission.hashCode())) * 31;
            TransitionData transitionData = this.u;
            return Boolean.hashCode(this.v) + ((hashCode4 + (transitionData != null ? transitionData.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(title=");
            sb.append((Object) this.a);
            sb.append(", link=");
            sb.append((Object) this.b);
            sb.append(", subtitle=");
            sb.append((Object) this.c);
            sb.append(", eduRoles=");
            sb.append((Object) this.d);
            sb.append(", verifyInfo=");
            sb.append(this.e);
            sb.append(", showSettingsOptionButton=");
            sb.append(this.f);
            sb.append(", showShareOptionButton=");
            sb.append(this.g);
            sb.append(", avatarShowAsFavorites=");
            sb.append(this.h);
            sb.append(", avatarShowAsLocked=");
            sb.append(this.i);
            sb.append(", avatarIsClickable=");
            sb.append(this.j);
            sb.append(", avatarImage=");
            sb.append(this.k);
            sb.append(", avatarPlaceholder=");
            sb.append(this.l);
            sb.append(", borderType=");
            sb.append(this.m);
            sb.append(", headerActions=");
            sb.append(this.n);
            sb.append(", overflowHeaderActions=");
            sb.append(this.o);
            sb.append(", adapterItems=");
            sb.append(this.p);
            sb.append(", isFullScreenHeader=");
            sb.append(this.q);
            sb.append(", storyState=");
            sb.append(this.r);
            sb.append(", eduNotDisturbText=");
            sb.append((Object) this.s);
            sb.append(", writePermission=");
            sb.append(this.t);
            sb.append(", transitionData=");
            sb.append(this.u);
            sb.append(", isMessagesForwardEnabled=");
            return defpackage.q0.a(sb, this.v, ')');
        }

        public b(CharSequence charSequence, String str, String str2, CharSequence charSequence2, VerifyInfo verifyInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ImageList imageList, Drawable drawable, AvatarBorderType avatarBorderType, List list, List list2, List list3, boolean z6, ImStoryState imStoryState, WritePermission writePermission, TransitionData transitionData, boolean z7, int i) {
            this(charSequence, str, str2, charSequence2, verifyInfo, z, z2, z3, z4, z5, (i & 1024) != 0 ? null : imageList, (i & 2048) != 0 ? null : drawable, (i & 4096) != 0 ? AvatarBorderType.CIRCLE : avatarBorderType, (List<? extends xub>) ((i & 8192) != 0 ? EmptyList.b : list), (List<? extends xub>) ((i & 16384) != 0 ? EmptyList.b : list2), (List<? extends nwb>) list3, (65536 & i) != 0 ? false : z6, (131072 & i) != 0 ? ImStoryState.NONE : imStoryState, (CharSequence) null, (524288 & i) != 0 ? null : writePermission, (1048576 & i) != 0 ? null : transitionData, (i & 2097152) != 0 ? true : z7);
        }
    }
}
