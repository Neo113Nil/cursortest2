package com.yandex.go.ultima_mode.api.data;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.ief;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse;", "", "Companion", "Profile", "Menu", PlusPayUiKitInflaterFactory.NAME_PROGRESS_BAR, "Title", "Subtitle", "$serializer", "com/yandex/go/ultima_mode/api/data/f", "go-client-android.features.ultima_mode:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UltimaModeResponse {
    public static final f Companion = new f();
    public final boolean a;
    public final String b;
    public final ief c;
    public final Profile d;
    public final Menu e;

    public /* synthetic */ UltimaModeResponse(int i, boolean z, String str, ief iefVar, Profile profile, Menu menu) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = iefVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = profile;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = menu;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UltimaModeResponse)) {
            return false;
        }
        UltimaModeResponse ultimaModeResponse = (UltimaModeResponse) obj;
        return this.a == ultimaModeResponse.a && jl40.l(this.b, ultimaModeResponse.b) && jl40.l(this.c, ultimaModeResponse.c) && jl40.l(this.d, ultimaModeResponse.d) && jl40.l(this.e, ultimaModeResponse.e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ief iefVar = this.c;
        int hashCode3 = (hashCode2 + (iefVar == null ? 0 : iefVar.hashCode())) * 31;
        Profile profile = this.d;
        int hashCode4 = (hashCode3 + (profile == null ? 0 : profile.hashCode())) * 31;
        Menu menu = this.e;
        return hashCode4 + (menu != null ? menu.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ly3.v("UltimaModeResponse(ultimaEnabled=", ", state=", this.b, ", currencyRules=", this.a);
        v.append(this.c);
        v.append(", profile=");
        v.append(this.d);
        v.append(", menu=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse$Profile;", "", "Companion", "Card", "$serializer", "com/yandex/go/ultima_mode/api/data/j", "go-client-android.features.ultima_mode:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Profile {
        public static final j Companion = new j();
        public final Card a;

        public /* synthetic */ Profile(int i, Card card) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = card;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Profile) && jl40.l(this.a, ((Profile) obj).a);
        }

        public final int hashCode() {
            Card card = this.a;
            if (card == null) {
                return 0;
            }
            return card.hashCode();
        }

        public final String toString() {
            return "Profile(card=" + this.a + Extension.C_BRAKE;
        }

        public Profile() {
            this.a = null;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse$Profile$Card;", "", "Companion", "$serializer", "com/yandex/go/ultima_mode/api/data/i", "go-client-android.features.ultima_mode:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes14.dex */
        public static final /* data */ class Card {
            public static final i Companion = new i();
            public final Title a;
            public final Subtitle b;
            public final ProgressBar c;
            public final SlotItemDto d;
            public final SlotItemDto e;
            public final SlotItemDto f;

            public /* synthetic */ Card(int i, Title title, Subtitle subtitle, ProgressBar progressBar, SlotItemDto slotItemDto, SlotItemDto slotItemDto2, SlotItemDto slotItemDto3) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = title;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = subtitle;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = progressBar;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = slotItemDto;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = slotItemDto2;
                }
                if ((i & 32) == 0) {
                    this.f = null;
                } else {
                    this.f = slotItemDto3;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Card)) {
                    return false;
                }
                Card card = (Card) obj;
                return jl40.l(this.a, card.a) && jl40.l(this.b, card.b) && jl40.l(this.c, card.c) && jl40.l(this.d, card.d) && jl40.l(this.e, card.e) && jl40.l(this.f, card.f);
            }

            public final int hashCode() {
                Title title = this.a;
                int hashCode = (title == null ? 0 : title.hashCode()) * 31;
                Subtitle subtitle = this.b;
                int hashCode2 = (hashCode + (subtitle == null ? 0 : subtitle.hashCode())) * 31;
                ProgressBar progressBar = this.c;
                int hashCode3 = (hashCode2 + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
                SlotItemDto slotItemDto = this.d;
                int hashCode4 = (hashCode3 + (slotItemDto == null ? 0 : slotItemDto.hashCode())) * 31;
                SlotItemDto slotItemDto2 = this.e;
                int hashCode5 = (hashCode4 + (slotItemDto2 == null ? 0 : slotItemDto2.hashCode())) * 31;
                SlotItemDto slotItemDto3 = this.f;
                return hashCode5 + (slotItemDto3 != null ? slotItemDto3.hashCode() : 0);
            }

            public final String toString() {
                return "Card(title=" + this.a + ", subtitle=" + this.b + ", progressBar=" + this.c + ", plus=" + this.d + ", concierge=" + this.e + ", modeSwitcher=" + this.f + Extension.C_BRAKE;
            }

            public Card() {
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse$Title;", "", "Companion", "Trail", "$serializer", "com/yandex/go/ultima_mode/api/data/n", "go-client-android.features.ultima_mode:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class Title {
        public static final n Companion = new n();
        public final String a;
        public final Trail b;
        public final String c;

        public /* synthetic */ Title(int i, String str, Trail trail, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = trail;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Title)) {
                return false;
            }
            Title title = (Title) obj;
            return jl40.l(this.a, title.a) && jl40.l(this.b, title.b) && jl40.l(this.c, title.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Trail trail = this.b;
            int hashCode2 = (hashCode + (trail == null ? 0 : trail.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Title(iconTag=");
            sb.append(this.a);
            sb.append(", trail=");
            sb.append(this.b);
            sb.append(", iconAccessibility=");
            return oyr.t(sb, this.c, Extension.C_BRAKE);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse$Title$Trail;", "", "Companion", "$serializer", "com/yandex/go/ultima_mode/api/data/o", "go-client-android.features.ultima_mode:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Trail {
            public static final o Companion = new o();
            public final FormattedText a;
            public final e b;

            public /* synthetic */ Trail(int i, FormattedText formattedText, e eVar) {
                this.a = (i & 1) == 0 ? null : formattedText;
                if ((i & 2) == 0) {
                    this.b = b.INSTANCE;
                } else {
                    this.b = eVar;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Trail)) {
                    return false;
                }
                Trail trail = (Trail) obj;
                return jl40.l(this.a, trail.a) && jl40.l(this.b, trail.b);
            }

            public final int hashCode() {
                FormattedText formattedText = this.a;
                return this.b.hashCode() + ((formattedText == null ? 0 : formattedText.a.hashCode()) * 31);
            }

            public final String toString() {
                return "Trail(text=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
            }

            public Trail() {
                b bVar = b.INSTANCE;
                this.a = null;
                this.b = bVar;
            }
        }

        public Title() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse$Subtitle;", "", "Companion", "$serializer", "com/yandex/go/ultima_mode/api/data/m", "go-client-android.features.ultima_mode:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class Subtitle {
        public static final m Companion = new m();
        public final FormattedText a;
        public final e b;

        public /* synthetic */ Subtitle(int i, FormattedText formattedText, e eVar) {
            this.a = (i & 1) == 0 ? null : formattedText;
            if ((i & 2) == 0) {
                this.b = b.INSTANCE;
            } else {
                this.b = eVar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subtitle)) {
                return false;
            }
            Subtitle subtitle = (Subtitle) obj;
            return jl40.l(this.a, subtitle.a) && jl40.l(this.b, subtitle.b);
        }

        public final int hashCode() {
            FormattedText formattedText = this.a;
            return this.b.hashCode() + ((formattedText == null ? 0 : formattedText.a.hashCode()) * 31);
        }

        public final String toString() {
            return "Subtitle(text=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
        }

        public Subtitle() {
            b bVar = b.INSTANCE;
            this.a = null;
            this.b = bVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse$Menu;", "", "Companion", "Card", "$serializer", "com/yandex/go/ultima_mode/api/data/h", "go-client-android.features.ultima_mode:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Menu {
        public static final h Companion = new h();
        public final Card a;
        public final String b;
        public final String c;
        public final boolean d;

        public /* synthetic */ Menu(int i, Card card, String str, String str2, boolean z) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = card;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Menu)) {
                return false;
            }
            Menu menu = (Menu) obj;
            return jl40.l(this.a, menu.a) && jl40.l(this.b, menu.b) && jl40.l(this.c, menu.c) && this.d == menu.d;
        }

        public final int hashCode() {
            Card card = this.a;
            int hashCode = (card == null ? 0 : card.hashCode()) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return Boolean.hashCode(this.d) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Menu(card=");
            sb.append(this.a);
            sb.append(", ratingIcon=");
            sb.append(this.b);
            sb.append(", ratingIconAccessibility=");
            return nnm.i(this.c, ", removeTaxiWork=", Extension.C_BRAKE, sb, this.d);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse$Menu$Card;", "", "Companion", "$serializer", "com/yandex/go/ultima_mode/api/data/g", "go-client-android.features.ultima_mode:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes14.dex */
        public static final /* data */ class Card {
            public static final g Companion = new g();
            public final Title a;
            public final Subtitle b;
            public final ProgressBar c;

            public /* synthetic */ Card(int i, Title title, Subtitle subtitle, ProgressBar progressBar) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = title;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = subtitle;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = progressBar;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Card)) {
                    return false;
                }
                Card card = (Card) obj;
                return jl40.l(this.a, card.a) && jl40.l(this.b, card.b) && jl40.l(this.c, card.c);
            }

            public final int hashCode() {
                Title title = this.a;
                int hashCode = (title == null ? 0 : title.hashCode()) * 31;
                Subtitle subtitle = this.b;
                int hashCode2 = (hashCode + (subtitle == null ? 0 : subtitle.hashCode())) * 31;
                ProgressBar progressBar = this.c;
                return hashCode2 + (progressBar != null ? progressBar.hashCode() : 0);
            }

            public final String toString() {
                return "Card(title=" + this.a + ", subtitle=" + this.b + ", progressBar=" + this.c + Extension.C_BRAKE;
            }

            public Card() {
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }

        public Menu() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse$ProgressBar;", "", "Companion", "ProgressBarSubtitle", "$serializer", "com/yandex/go/ultima_mode/api/data/k", "go-client-android.features.ultima_mode:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class ProgressBar {
        public static final k Companion = new k();
        public final String a;
        public final int b;
        public final ProgressBarSubtitle c;

        public /* synthetic */ ProgressBar(int i, String str, int i2, ProgressBarSubtitle progressBarSubtitle) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = progressBarSubtitle;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressBar)) {
                return false;
            }
            ProgressBar progressBar = (ProgressBar) obj;
            return jl40.l(this.a, progressBar.a) && this.b == progressBar.b && jl40.l(this.c, progressBar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int b = oyr.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
            ProgressBarSubtitle progressBarSubtitle = this.c;
            return b + (progressBarSubtitle != null ? progressBarSubtitle.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder u = b64.u(this.b, "ProgressBar(accessibility=", this.a, ", percent=", ", subtitle=");
            u.append(this.c);
            u.append(Extension.C_BRAKE);
            return u.toString();
        }

        public ProgressBar() {
            this.a = null;
            this.b = 0;
            this.c = null;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse$ProgressBar$ProgressBarSubtitle;", "", "Companion", "$serializer", "com/yandex/go/ultima_mode/api/data/l", "go-client-android.features.ultima_mode:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class ProgressBarSubtitle {
            public static final l Companion = new l();
            public final String a;
            public final FormattedText b;
            public final FormattedText c;
            public final String d;
            public final FormattedText e;

            public /* synthetic */ ProgressBarSubtitle(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = formattedText;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = formattedText2;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = str2;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = formattedText3;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ProgressBarSubtitle)) {
                    return false;
                }
                ProgressBarSubtitle progressBarSubtitle = (ProgressBarSubtitle) obj;
                return jl40.l(this.a, progressBarSubtitle.a) && jl40.l(this.b, progressBarSubtitle.b) && jl40.l(this.c, progressBarSubtitle.c) && jl40.l(this.d, progressBarSubtitle.d) && jl40.l(this.e, progressBarSubtitle.e);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                FormattedText formattedText = this.b;
                int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
                FormattedText formattedText2 = this.c;
                int hashCode3 = (hashCode2 + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
                String str2 = this.d;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                FormattedText formattedText3 = this.e;
                return hashCode4 + (formattedText3 != null ? formattedText3.a.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder q = xvz.q("ProgressBarSubtitle(textAccessibility=", this.a, ", text=", ", trail=", this.b);
                q.append(this.c);
                q.append(", bottomTextAccessibility=");
                q.append(this.d);
                q.append(", bottomText=");
                return tse0.m(q, this.e, Extension.C_BRAKE);
            }

            public ProgressBarSubtitle() {
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
            }
        }
    }

    public UltimaModeResponse(int i) {
        this.a = false;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public UltimaModeResponse() {
        this(0);
    }
}
