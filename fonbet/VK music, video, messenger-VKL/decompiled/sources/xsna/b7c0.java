package xsna;

import com.vk.channels.impl.post_settings.adapter.PostSettingType;
import com.vkontakte.android.R;
import java.util.Date;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: PostSettingsAdapterItem.kt */
/* loaded from: classes16.dex */
public abstract class b7c0 implements hfz {
    public final PostSettingType b;

    /* compiled from: PostSettingsAdapterItem.kt */
    public static abstract class a extends b7c0 {
        public final int c;
        public final boolean d;
        public final b e;

        /* compiled from: PostSettingsAdapterItem.kt */
        /* renamed from: xsna.b7c0$a$a, reason: collision with other inner class name */
        public static final class C2591a extends a {
            public final boolean f;
            public final pp80 g;
            public final CharSequence h;
            public final boolean i;
            public final b j;

            public C2591a(boolean z, pp80 pp80Var, CharSequence charSequence, boolean z2, b bVar) {
                super(PostSettingType.POST_FOR_DONS, z2);
                this.f = z;
                this.g = pp80Var;
                this.h = charSequence;
                this.i = z2;
                this.j = bVar;
            }

            @Override // xsna.b7c0.a
            public final b a() {
                return this.j;
            }

            @Override // xsna.b7c0.a
            public final CharSequence b() {
                return this.h;
            }

            @Override // xsna.b7c0.a
            public final boolean c() {
                return this.i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2591a)) {
                    return false;
                }
                C2591a c2591a = (C2591a) obj;
                return this.f == c2591a.f && epx.f(this.g, c2591a.g) && epx.f(this.h, c2591a.h) && this.i == c2591a.i && epx.f(this.j, c2591a.j);
            }

            public final int hashCode() {
                int hashCode = Boolean.hashCode(this.f) * 31;
                pp80 pp80Var = this.g;
                int hashCode2 = (hashCode + (pp80Var == null ? 0 : pp80Var.hashCode())) * 31;
                CharSequence charSequence = this.h;
                return this.j.hashCode() + qoy.b((hashCode2 + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.i);
            }

            public final String toString() {
                return "PostForDons(canPostDonut=" + this.f + ", visibleToDonsSetting=" + this.g + ", subtitleText=" + ((Object) this.h) + ", isHighlighted=" + this.i + ", right=" + this.j + ')';
            }
        }

        /* compiled from: PostSettingsAdapterItem.kt */
        public interface b {

            /* compiled from: PostSettingsAdapterItem.kt */
            /* renamed from: xsna.b7c0$a$b$a, reason: collision with other inner class name */
            public static final class C2592a implements b {
                public final boolean equals(Object obj) {
                    Object valueOf = Integer.valueOf(R.string.vkim_channels_post_settings_only_visible_to_dons_with_disabled_chevron);
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2592a)) {
                        return false;
                    }
                    ((C2592a) obj).getClass();
                    return valueOf.equals(valueOf);
                }

                public final int hashCode() {
                    return Integer.valueOf(R.string.vkim_channels_post_settings_only_visible_to_dons_with_disabled_chevron).hashCode();
                }

                public final String toString() {
                    return "ActionDetail(actionDetail=" + Integer.valueOf(R.string.vkim_channels_post_settings_only_visible_to_dons_with_disabled_chevron) + ')';
                }
            }

            /* compiled from: PostSettingsAdapterItem.kt */
            /* renamed from: xsna.b7c0$a$b$b, reason: collision with other inner class name */
            public static final class C2593b implements b {
                public static final C2593b a = new C2593b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2593b);
                }

                public final int hashCode() {
                    return -1476868288;
                }

                public final String toString() {
                    return "None";
                }
            }

            /* compiled from: PostSettingsAdapterItem.kt */
            public static final class c implements b {
                public final boolean a;

                public c(boolean z) {
                    this.a = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && this.a == ((c) obj).a;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.a);
                }

                public final String toString() {
                    return defpackage.q0.a(new StringBuilder("Switch(isChecked="), this.a, ')');
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PostSettingType postSettingType, boolean z) {
            super(postSettingType);
            b.C2593b c2593b = b.C2593b.a;
            this.c = R.string.vkim_channels_post_settings_only_visible_to_dons;
            this.d = z;
            this.e = c2593b;
        }

        public b a() {
            return this.e;
        }

        public CharSequence b() {
            return null;
        }

        public boolean c() {
            return this.d;
        }
    }

    /* compiled from: PostSettingsAdapterItem.kt */
    public static final class b implements hfz {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return 0;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "CellAdapterItem(itemViewType=null, title=null, subtitle=null, extraSubtitle=null, action=null, hasChevron=false)";
        }
    }

    /* compiled from: PostSettingsAdapterItem.kt */
    public static final class c implements hfz {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return 0;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("HeaderAdapterItem(header="), this.b, ')');
        }
    }

    /* compiled from: PostSettingsAdapterItem.kt */
    public static final class d extends b7c0 {
        public final String c;
        public final Boolean d;
        public final String e;
        public final String f;
        public final boolean g;

        public d(String str, String str2, String str3, boolean z, Boolean bool) {
            super(PostSettingType.MARK_ADVERTISEMENT);
            this.c = str;
            this.d = bool;
            this.e = str2;
            this.f = str3;
            this.g = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f) && this.g == dVar.g;
        }

        public final int hashCode() {
            String str = this.c;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.d;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.e;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return Boolean.hashCode(this.g) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarkAdvertisement(prevId=");
            sb.append(this.c);
            sb.append(", isAddAdvertisingOrd=");
            sb.append(this.d);
            sb.append(", erid=");
            sb.append(this.e);
            sb.append(", ordExternalId=");
            sb.append(this.f);
            sb.append(", isEditMode=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: PostSettingsAdapterItem.kt */
    public static abstract class e extends b7c0 {
        public final int c;
        public final String d;
        public final Integer e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;

        /* compiled from: PostSettingsAdapterItem.kt */
        public static final class a extends e {
            public final boolean j;

            public a(boolean z) {
                super(PostSettingType.ADD_AUTHOR_SIGN, R.string.vkim_channels_post_settings_author_sign, null, null, z, false, false, false, 488);
                this.j = z;
            }

            @Override // xsna.b7c0.e
            public final boolean b() {
                return this.j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.j == ((a) obj).j;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.j);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("AddAuthorSign(isChecked="), this.j, ')');
            }
        }

        /* compiled from: PostSettingsAdapterItem.kt */
        public static final class b extends e {
            public final Date j;
            public final String k;

            public b(Date date, String str) {
                super(PostSettingType.DELAYED_SEND, R.string.vkim_channels_post_settings_delay_send, str, null, date != null, false, date != null, false, 424);
                this.j = date;
                this.k = str;
            }

            @Override // xsna.b7c0.e
            public final String a() {
                return this.k;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.j, bVar.j) && epx.f(this.k, bVar.k);
            }

            public final int hashCode() {
                Date date = this.j;
                int hashCode = (date == null ? 0 : date.hashCode()) * 31;
                String str = this.k;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DelayedSend(sendDate=");
                sb.append(this.j);
                sb.append(", subtitleText=");
                return ho8.a(sb, this.k, ')');
            }
        }

        /* compiled from: PostSettingsAdapterItem.kt */
        public static final class c extends e {
            public final boolean j;
            public final boolean k;

            public c(boolean z, boolean z2) {
                super(PostSettingType.ENABLE_COMMENTS, R.string.vkim_channels_post_settings_enable_comments, null, null, z, z2, false, false, ApiInvocationException.ErrorCodes.GROUP_RESTRICTION);
                this.j = z;
                this.k = z2;
            }

            @Override // xsna.b7c0.e
            public final boolean b() {
                return this.j;
            }

            @Override // xsna.b7c0.e
            public final boolean c() {
                return this.k;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.j == cVar.j && this.k == cVar.k;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.k) + (Boolean.hashCode(this.j) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("EnableComments(isChecked=");
                sb.append(this.j);
                sb.append(", isEnabled=");
                return defpackage.q0.a(sb, this.k, ')');
            }
        }

        /* compiled from: PostSettingsAdapterItem.kt */
        public static final class d extends e {
            public final boolean j;
            public final boolean k;

            public d(boolean z) {
                super(PostSettingType.HIDE_ONLY_PHOTOS, R.string.vkim_channels_post_settings_hide_only_photos_title, null, Integer.valueOf(R.string.vkim_channels_post_settings_hide_only_photos_subtitle), z, true, false, false, 448);
                this.j = z;
                this.k = true;
            }

            @Override // xsna.b7c0.e
            public final boolean b() {
                return this.j;
            }

            @Override // xsna.b7c0.e
            public final boolean c() {
                return this.k;
            }

            @Override // xsna.b7c0.e
            public final boolean d() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.j == dVar.j && this.k == dVar.k;
            }

            public final int hashCode() {
                return Boolean.hashCode(false) + qoy.b(Boolean.hashCode(this.j) * 31, 31, this.k);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HideOnlyPhotos(isChecked=");
                sb.append(this.j);
                sb.append(", isEnabled=");
                return n23.b(sb, this.k, ", isHighlighted=false)");
            }
        }

        /* compiled from: PostSettingsAdapterItem.kt */
        /* renamed from: xsna.b7c0$e$e, reason: collision with other inner class name */
        public static final class C2594e extends e {
            public final pp80 j;
            public final String k;
            public final boolean l;
            public final boolean m;

            public C2594e(pp80 pp80Var, String str, boolean z, boolean z2) {
                super(PostSettingType.ONLY_VISIBLE_TO_DONS, R.string.vkim_channels_post_settings_only_visible_to_dons, str, Integer.valueOf(R.string.vkim_channels_post_settings_only_visible_to_dons_subtitle), pp80Var != null, false, pp80Var != null, z, 160);
                this.j = pp80Var;
                this.k = str;
                this.l = z;
                this.m = z2;
            }

            @Override // xsna.b7c0.e
            public final String a() {
                return this.k;
            }

            @Override // xsna.b7c0.e
            public final boolean d() {
                return this.m;
            }

            @Override // xsna.b7c0.e
            public final boolean e() {
                return this.l;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2594e)) {
                    return false;
                }
                C2594e c2594e = (C2594e) obj;
                return epx.f(this.j, c2594e.j) && epx.f(this.k, c2594e.k) && this.l == c2594e.l && this.m == c2594e.m;
            }

            public final int hashCode() {
                pp80 pp80Var = this.j;
                int hashCode = (pp80Var == null ? 0 : pp80Var.hashCode()) * 31;
                String str = this.k;
                return Boolean.hashCode(this.m) + qoy.b((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.l);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnlyVisibleToDons(visibleToDonsSetting=");
                sb.append(this.j);
                sb.append(", subtitleText=");
                sb.append(this.k);
                sb.append(", isSwitchVisible=");
                sb.append(this.l);
                sb.append(", isHighlighted=");
                return defpackage.q0.a(sb, this.m, ')');
            }
        }

        /* compiled from: PostSettingsAdapterItem.kt */
        public static final class f extends e {
            public final boolean j;
            public final boolean k;
            public final boolean l;

            public f(boolean z, boolean z2, boolean z3) {
                super(PostSettingType.PUBLISH_STORY, R.string.vkim_channels_post_settings_publish_story_title, null, Integer.valueOf(R.string.vkim_channels_post_settings_publish_story_subtitle), z, z2, false, false, 448);
                this.j = z;
                this.k = z2;
                this.l = z3;
            }

            @Override // xsna.b7c0.e
            public final boolean b() {
                return this.j;
            }

            @Override // xsna.b7c0.e
            public final boolean c() {
                return this.k;
            }

            @Override // xsna.b7c0.e
            public final boolean d() {
                return this.l;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.j == fVar.j && this.k == fVar.k && this.l == fVar.l;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.l) + qoy.b(Boolean.hashCode(this.j) * 31, 31, this.k);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PublishStory(isChecked=");
                sb.append(this.j);
                sb.append(", isEnabled=");
                sb.append(this.k);
                sb.append(", isHighlighted=");
                return defpackage.q0.a(sb, this.l, ')');
            }
        }

        /* compiled from: PostSettingsAdapterItem.kt */
        public static final class g extends e {
            public final boolean j;

            public g(boolean z) {
                super(PostSettingType.SEND_NOTIFICATIONS, R.string.vkim_channels_post_settings_send_notifications_title, null, Integer.valueOf(R.string.vkim_channels_post_settings_send_notifications_subtitle), z, false, false, false, 480);
                this.j = z;
            }

            @Override // xsna.b7c0.e
            public final boolean b() {
                return this.j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.j == ((g) obj).j;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.j);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("SendNotifications(isChecked="), this.j, ')');
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PostSettingType postSettingType, int i, String str, Integer num, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
            super(postSettingType);
            num = (i2 & 8) != 0 ? null : num;
            z2 = (i2 & 32) != 0 ? true : z2;
            z3 = (i2 & 64) != 0 ? false : z3;
            z4 = (i2 & 256) != 0 ? true : z4;
            this.c = i;
            this.d = str;
            this.e = num;
            this.f = z;
            this.g = z2;
            this.h = z3;
            this.i = z4;
        }

        public String a() {
            return this.d;
        }

        public boolean b() {
            return this.f;
        }

        public boolean c() {
            return this.g;
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return this.i;
        }
    }

    public b7c0(PostSettingType postSettingType) {
        this.b = postSettingType;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.ordinal());
    }
}
