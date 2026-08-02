package xsna;

import com.vk.clips.sdk.models.SdkCompilation;
import com.vk.clips.sdk.models.SdkDuetMeta;
import com.vk.clips.sdk.models.SdkMask;
import com.vk.clips.sdk.shared.api.deps.dtos.SdkGeoPlace;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import org.chromium.base.version_info.VersionConstants;
import xsna.tlo0;

/* compiled from: SdkBadgeItem.kt */
/* loaded from: classes17.dex */
public abstract class mih0 implements hfz {
    public final boolean b;
    public final tlo0 c;
    public final Integer d;
    public final o e;
    public final Integer f;
    public final boolean g;
    public final boolean h;

    /* compiled from: SdkBadgeItem.kt */
    public static final class a extends mih0 {
        public final SdkCompilation i;
        public final tlo0.h j;

        public a(SdkCompilation sdkCompilation, tlo0.h hVar) {
            super(false, hVar, null, null, null, false, false, 253);
            this.i = sdkCompilation;
            this.j = hVar;
        }

        @Override // xsna.mih0
        public final tlo0 e() {
            return this.j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j);
        }

        public final int hashCode() {
            return this.j.a.hashCode() + (this.i.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CompilationItem(compilation=");
            sb.append(this.i);
            sb.append(", title=");
            return jq.c(sb, this.j, ')');
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static final class b extends mih0 {
        public final SdkDuetMeta i;
        public final tlo0.g j;

        public b(SdkDuetMeta sdkDuetMeta, tlo0.g gVar) {
            super(false, gVar, Integer.valueOf(R.drawable.vk_icon_play_12), null, null, false, false, 249);
            this.i = sdkDuetMeta;
            this.j = gVar;
        }

        @Override // xsna.mih0
        public final tlo0 e() {
            return this.j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.i, bVar.i) && epx.f(this.j, bVar.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + (this.i.hashCode() * 31);
        }

        public final String toString() {
            return "DuetItem(duet=" + this.i + ", title=" + this.j + ')';
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static final class c extends mih0 {
        public final SdkGeoPlace i;

        public c(SdkGeoPlace sdkGeoPlace) {
            super(false, oq.d(tlo0.Companion, sdkGeoPlace.getTitle()), Integer.valueOf(R.drawable.vk_icon_place_12), null, Integer.valueOf(iah0.a(VersionConstants.PRODUCT_MAJOR_VERSION)), false, false, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);
            this.i = sdkGeoPlace;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.i, ((c) obj).i);
        }

        public final int hashCode() {
            return this.i.hashCode();
        }

        public final String toString() {
            return "GeoPlaceItem(place=" + this.i + ')';
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static final class d<T extends mih0> extends mih0 {
        public final e i;
        public final ArrayList j;
        public final ArrayList k;

        public d(e eVar, ArrayList arrayList, ArrayList arrayList2) {
            super(false, tq.h(tlo0.Companion, eVar.i), null, null, null, false, false, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE);
            this.i = eVar;
            this.j = arrayList;
            this.k = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.i, dVar.i) && epx.f(this.j, dVar.j) && epx.f(this.k, dVar.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + qr.a(this.j, Integer.hashCode(this.i.i) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GroupItem(header=");
            sb.append(this.i);
            sb.append(", badges=");
            sb.append(this.j);
            sb.append(", modalItems=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.k);
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static final class e extends mih0 {
        public final int i;

        public e(int i) {
            super(false, null, null, null, null, false, false, 254);
            this.i = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.i == ((e) obj).i;
        }

        public final int hashCode() {
            return Integer.hashCode(this.i);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("HeaderItem(sectionName="), this.i, ')');
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static final class f extends mih0 {
        public final SdkMask i;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f(SdkMask sdkMask) {
            super(false, oq.d(r0, r1 == null ? "" : r1), Integer.valueOf(sdkMask.e ? R.drawable.vk_icon_stars_12 : R.drawable.vk_icon_mask_12), null, null, false, false, 249);
            tlo0.a aVar = tlo0.Companion;
            String str = sdkMask.c;
            this.i = sdkMask;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.i, ((f) obj).i);
        }

        public final int hashCode() {
            return this.i.hashCode();
        }

        public final String toString() {
            return "MaskItem(mask=" + this.i + ')';
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static final class g extends mih0 {
        public final SdkMask i;

        public g(SdkMask sdkMask) {
            super(false, null, null, null, null, false, false, 255);
            this.i = sdkMask;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.i, ((g) obj).i);
        }

        public final int hashCode() {
            return this.i.hashCode();
        }

        public final String toString() {
            return "MaskModalItem(mask=" + this.i + ')';
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static final class h extends mih0 {
        public final ArrayList i;

        public h(ArrayList arrayList) {
            super(false, null, Integer.valueOf(R.drawable.vk_icon_more_horizontal_16), null, null, false, false, 251);
            this.i = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.i, ((h) obj).i);
        }

        public final int hashCode() {
            return this.i.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("MoreItem(badges="), this.i);
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static final class i extends mih0 {
        public final tlo0 i;
        public final boolean j;
        public final Integer k;
        public final o l;
        public final boolean m;
        public final tlo0 n;
        public final SdkClipVideoFile o;
        public final tlo0 p;
        public final String q;
        public final Integer r;
        public final boolean s;
        public final boolean t;

        public /* synthetic */ i(tlo0 tlo0Var, boolean z, Integer num, boolean z2, tlo0.h hVar, SdkClipVideoFile sdkClipVideoFile, tlo0.f fVar, String str, Integer num2, boolean z3, int i) {
            this(tlo0Var, z, num, null, z2, hVar, sdkClipVideoFile, fVar, str, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? false : z3, false);
        }

        @Override // xsna.mih0
        public final o a() {
            return this.l;
        }

        @Override // xsna.mih0
        public final boolean b() {
            return this.j;
        }

        @Override // xsna.mih0
        public final boolean c() {
            return this.m;
        }

        @Override // xsna.mih0
        public final Integer d() {
            return this.k;
        }

        @Override // xsna.mih0
        public final tlo0 e() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.i, iVar.i) && this.j == iVar.j && epx.f(this.k, iVar.k) && epx.f(this.l, iVar.l) && this.m == iVar.m && epx.f(this.n, iVar.n) && epx.f(this.o, iVar.o) && epx.f(this.p, iVar.p) && epx.f(this.q, iVar.q) && epx.f(this.r, iVar.r) && this.s == iVar.s && this.t == iVar.t;
        }

        public final int hashCode() {
            int b = qoy.b(this.i.hashCode() * 31, 31, this.j);
            Integer num = this.k;
            int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
            o oVar = this.l;
            int b2 = qoy.b((hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31, 31, this.m);
            tlo0 tlo0Var = this.n;
            int hashCode2 = (this.o.hashCode() + ((b2 + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31)) * 31;
            tlo0 tlo0Var2 = this.p;
            int hashCode3 = (hashCode2 + (tlo0Var2 == null ? 0 : tlo0Var2.hashCode())) * 31;
            String str = this.q;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.r;
            return Boolean.hashCode(this.t) + qoy.b((hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.s);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MusicItem(title=");
            sb.append(this.i);
            sb.append(", clickable=");
            sb.append(this.j);
            sb.append(", iconRes=");
            sb.append(this.k);
            sb.append(", appearance=");
            sb.append(this.l);
            sb.append(", enabled=");
            sb.append(this.m);
            sb.append(", author=");
            sb.append(this.n);
            sb.append(", clip=");
            sb.append(this.o);
            sb.append(", trailingLabel=");
            sb.append(this.p);
            sb.append(", coverImageUrl=");
            sb.append(this.q);
            sb.append(", rightIconRes=");
            sb.append(this.r);
            sb.append(", isTrend=");
            sb.append(this.s);
            sb.append(", isFocused=");
            return defpackage.q0.a(sb, this.t, ')');
        }

        public i(tlo0 tlo0Var, boolean z, Integer num, o oVar, boolean z2, tlo0 tlo0Var2, SdkClipVideoFile sdkClipVideoFile, tlo0 tlo0Var3, String str, Integer num2, boolean z3, boolean z4) {
            super(z, tlo0Var, num, oVar, Integer.valueOf(iah0.a(VersionConstants.PRODUCT_MAJOR_VERSION)), false, z2, 72);
            this.i = tlo0Var;
            this.j = z;
            this.k = num;
            this.l = oVar;
            this.m = z2;
            this.n = tlo0Var2;
            this.o = sdkClipVideoFile;
            this.p = tlo0Var3;
            this.q = str;
            this.r = num2;
            this.s = z3;
            this.t = z4;
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static final class j extends mih0 {
        public final SdkClipAudioTemplate i;

        public j(SdkClipAudioTemplate sdkClipAudioTemplate) {
            super(false, tq.h(tlo0.Companion, R.string.clips_use_template_button_text), Integer.valueOf(R.drawable.vk_icon_cards_2_12), null, null, false, false, 249);
            this.i = sdkClipAudioTemplate;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.i, ((j) obj).i);
        }

        public final int hashCode() {
            return this.i.b.hashCode();
        }

        public final String toString() {
            return "MusicTemplateItem(audioTemplate=" + this.i + ')';
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static final class k extends mih0 {
        public final tlo0 i;
        public final o j;
        public final boolean k;
        public final String l;
        public final String m;
        public final boolean n;
        public final boolean o;

        public k(tlo0 tlo0Var, o oVar, boolean z, String str, String str2, boolean z2, boolean z3) {
            super(false, tlo0Var, Integer.valueOf(R.drawable.vk_icon_list_play_outline_12), oVar, Integer.valueOf(iah0.a(VersionConstants.PRODUCT_MAJOR_VERSION)), false, false, 201);
            this.i = tlo0Var;
            this.j = oVar;
            this.k = z;
            this.l = str;
            this.m = str2;
            this.n = z2;
            this.o = z3;
        }

        public static k g(k kVar, o oVar, boolean z, boolean z2, boolean z3, int i) {
            tlo0 tlo0Var = kVar.i;
            if ((i & 2) != 0) {
                oVar = kVar.j;
            }
            o oVar2 = oVar;
            if ((i & 4) != 0) {
                z = kVar.k;
            }
            boolean z4 = z;
            String str = kVar.l;
            String str2 = kVar.m;
            if ((i & 32) != 0) {
                z2 = kVar.n;
            }
            boolean z5 = z2;
            if ((i & 64) != 0) {
                z3 = kVar.o;
            }
            kVar.getClass();
            return new k(tlo0Var, oVar2, z4, str, str2, z5, z3);
        }

        @Override // xsna.mih0
        public final o a() {
            return this.j;
        }

        @Override // xsna.mih0
        public final tlo0 e() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.i, kVar.i) && epx.f(this.j, kVar.j) && this.k == kVar.k && epx.f(this.l, kVar.l) && epx.f(this.m, kVar.m) && this.n == kVar.n && this.o == kVar.o;
        }

        @Override // xsna.mih0
        public final boolean f() {
            return this.k;
        }

        public final int hashCode() {
            int hashCode = this.i.hashCode() * 31;
            o oVar = this.j;
            return Boolean.hashCode(this.o) + qoy.b(urd0.a(urd0.a(qoy.b((hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsMonothemeItem(title=");
            sb.append(this.i);
            sb.append(", appearance=");
            sb.append(this.j);
            sb.append(", isHighlighted=");
            sb.append(this.k);
            sb.append(", monothemeObjectId=");
            sb.append(this.l);
            sb.append(", header=");
            sb.append(this.m);
            sb.append(", hasBeenAnimated=");
            sb.append(this.n);
            sb.append(", isFocused=");
            return defpackage.q0.a(sb, this.o, ')');
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static abstract class l extends mih0 {

        /* compiled from: SdkBadgeItem.kt */
        public static final class a extends l {
            public final ArrayList i;

            public a(ArrayList arrayList) {
                super(tq.h(tlo0.Companion, R.string.clips_header_playlists));
                this.i = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.i, ((a) obj).i);
            }

            public final int hashCode() {
                return this.i.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Many(playlists="), this.i);
            }
        }

        /* compiled from: SdkBadgeItem.kt */
        public static final class b extends l {
            public final ClipsPlaylist i;

            public b(ClipsPlaylist clipsPlaylist) {
                super(oq.d(tlo0.Companion, clipsPlaylist.c));
                this.i = clipsPlaylist;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.i, ((b) obj).i);
            }

            public final int hashCode() {
                return this.i.hashCode();
            }

            public final String toString() {
                return "Single(playlist=" + this.i + ')';
            }
        }

        public l(tlo0 tlo0Var) {
            super(false, tlo0Var, Integer.valueOf(R.drawable.vk_icon_list_play_outline_12), null, null, false, false, 249);
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static final class m extends mih0 {
        public final SdkClipVideoFile i;
        public final tlo0.f j;
        public final boolean k;

        public m(SdkClipVideoFile sdkClipVideoFile, tlo0.f fVar) {
            super(false, fVar, Integer.valueOf(R.drawable.vk_icon_lock_12), null, null, false, false, 249);
            this.i = sdkClipVideoFile;
            this.j = fVar;
            this.k = true;
        }

        @Override // xsna.mih0
        public final boolean b() {
            return this.k;
        }

        @Override // xsna.mih0
        public final tlo0 e() {
            return this.j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.i, mVar.i) && epx.f(this.j, mVar.j) && this.k == mVar.k;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.k) + shy.a(this.j.a, this.i.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PrivacyInfoItem(videoFile=");
            sb.append(this.i);
            sb.append(", title=");
            sb.append(this.j);
            sb.append(", clickable=");
            return defpackage.q0.a(sb, this.k, ')');
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static final class n extends mih0 {
        public final tlo0 i;
        public final Integer j;
        public final boolean k;

        public n(tlo0 tlo0Var, Integer num, boolean z) {
            super(false, tlo0Var, num, null, Integer.valueOf(iah0.a(VersionConstants.PRODUCT_MAJOR_VERSION)), z, false, 153);
            this.i = tlo0Var;
            this.j = num;
            this.k = z;
        }

        @Override // xsna.mih0
        public final Integer d() {
            return this.j;
        }

        @Override // xsna.mih0
        public final tlo0 e() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return epx.f(this.i, nVar.i) && epx.f(this.j, nVar.j) && this.k == nVar.k;
        }

        @Override // xsna.mih0
        public final boolean f() {
            return this.k;
        }

        public final int hashCode() {
            int hashCode = this.i.hashCode() * 31;
            Integer num = this.j;
            return Boolean.hashCode(this.k) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProductsItem(title=");
            sb.append(this.i);
            sb.append(", iconRes=");
            sb.append(this.j);
            sb.append(", isHighlighted=");
            return defpackage.q0.a(sb, this.k, ')');
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public interface o {

        /* compiled from: SdkBadgeItem.kt */
        public static final class a implements o {
            public final ArrayList a;

            public a(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Gradient(colors="), this.a);
            }
        }

        /* compiled from: SdkBadgeItem.kt */
        public static final class b implements o {
            public final x7g a;

            public b(x7g x7gVar) {
                this.a = x7gVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a.equals(((b) obj).a);
            }

            public final int hashCode() {
                return Integer.hashCode(this.a.a);
            }

            public final String toString() {
                return "Highlight(color=" + this.a + ')';
            }
        }

        /* compiled from: SdkBadgeItem.kt */
        public static final class c implements o {
            public final cut0 a;

            public c(cut0 cut0Var) {
                this.a = cut0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Solid(color=" + this.a + ')';
            }
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static final class p extends mih0 {
        public final tlo0 i;
        public final Integer j;
        public final boolean k;
        public final boolean l;

        public p(tlo0 tlo0Var, Integer num, boolean z, boolean z2) {
            super(false, tlo0Var, num, null, null, z, false, 185);
            this.i = tlo0Var;
            this.j = num;
            this.k = z;
            this.l = z2;
        }

        @Override // xsna.mih0
        public final Integer d() {
            return this.j;
        }

        @Override // xsna.mih0
        public final tlo0 e() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return epx.f(this.i, pVar.i) && epx.f(this.j, pVar.j) && this.k == pVar.k && this.l == pVar.l;
        }

        @Override // xsna.mih0
        public final boolean f() {
            return this.k;
        }

        public final int hashCode() {
            int hashCode = this.i.hashCode() * 31;
            Integer num = this.j;
            return Boolean.hashCode(this.l) + qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.k);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShopsMoreItem(title=");
            sb.append(this.i);
            sb.append(", iconRes=");
            sb.append(this.j);
            sb.append(", isHighlighted=");
            sb.append(this.k);
            sb.append(", hasBeenAnimated=");
            return defpackage.q0.a(sb, this.l, ')');
        }
    }

    /* compiled from: SdkBadgeItem.kt */
    public static final class q extends mih0 {
        public final tlo0 i;
        public final o j;
        public final tlo0 k;
        public final boolean l;

        public q(tlo0 tlo0Var, o oVar, tlo0 tlo0Var2, boolean z) {
            super(false, tlo0Var, Integer.valueOf(R.drawable.vk_icon_flash_12), oVar, Integer.valueOf(iah0.a(VersionConstants.PRODUCT_MAJOR_VERSION)), false, false, 201);
            this.i = tlo0Var;
            this.j = oVar;
            this.k = tlo0Var2;
            this.l = z;
        }

        @Override // xsna.mih0
        public final o a() {
            return this.j;
        }

        @Override // xsna.mih0
        public final tlo0 e() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return epx.f(this.i, qVar.i) && epx.f(this.j, qVar.j) && epx.f(this.k, qVar.k) && this.l == qVar.l;
        }

        public final int hashCode() {
            int hashCode = this.i.hashCode() * 31;
            o oVar = this.j;
            int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
            tlo0 tlo0Var = this.k;
            return Boolean.hashCode(this.l) + ((hashCode2 + (tlo0Var != null ? tlo0Var.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrendingHashtagItem(title=");
            sb.append(this.i);
            sb.append(", appearance=");
            sb.append(this.j);
            sb.append(", trailingLabel=");
            sb.append(this.k);
            sb.append(", isFocused=");
            return defpackage.q0.a(sb, this.l, ')');
        }
    }

    public mih0(boolean z, tlo0 tlo0Var, Integer num, o oVar, Integer num2, boolean z2, boolean z3, int i2) {
        z = (i2 & 1) != 0 ? true : z;
        if ((i2 & 2) != 0) {
            tlo0.Companion.getClass();
            tlo0Var = tlo0.c.a;
        }
        num = (i2 & 4) != 0 ? null : num;
        oVar = (i2 & 16) != 0 ? null : oVar;
        num2 = (i2 & 32) != 0 ? null : num2;
        z2 = (i2 & 64) != 0 ? false : z2;
        z3 = (i2 & 128) != 0 ? true : z3;
        this.b = z;
        this.c = tlo0Var;
        this.d = num;
        this.e = oVar;
        this.f = num2;
        this.g = z2;
        this.h = z3;
    }

    public o a() {
        return this.e;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.h;
    }

    public Integer d() {
        return this.d;
    }

    public tlo0 e() {
        return this.c;
    }

    public boolean f() {
        return this.g;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }
}
