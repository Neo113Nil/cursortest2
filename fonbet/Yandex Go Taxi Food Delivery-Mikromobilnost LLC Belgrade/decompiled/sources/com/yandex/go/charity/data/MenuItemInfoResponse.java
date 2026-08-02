package com.yandex.go.charity.data;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.ief;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/charity/data/MenuItemInfoResponse;", "", "Companion", "MenuButtonDto", "$serializer", "com/yandex/go/charity/data/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MenuItemInfoResponse {
    public static final a Companion = new a();
    public final MenuButtonDto a;

    public /* synthetic */ MenuItemInfoResponse(int i, MenuButtonDto menuButtonDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = menuButtonDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MenuItemInfoResponse) && jl40.l(this.a, ((MenuItemInfoResponse) obj).a);
    }

    public final int hashCode() {
        MenuButtonDto menuButtonDto = this.a;
        if (menuButtonDto == null) {
            return 0;
        }
        return menuButtonDto.hashCode();
    }

    public final String toString() {
        return "MenuItemInfoResponse(menuButtonDto=" + this.a + Extension.C_BRAKE;
    }

    public MenuItemInfoResponse() {
        this.a = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/charity/data/MenuItemInfoResponse$MenuButtonDto;", "", "Companion", "SubtitleDto", "$serializer", "com/yandex/go/charity/data/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class MenuButtonDto {
        public static final b Companion = new b();
        public final SubtitleDto a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ MenuButtonDto(int i, SubtitleDto subtitleDto, String str, String str2, String str3) {
            this.a = (i & 1) == 0 ? new SubtitleDto(0) : subtitleDto;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MenuButtonDto)) {
                return false;
            }
            MenuButtonDto menuButtonDto = (MenuButtonDto) obj;
            return jl40.l(this.a, menuButtonDto.a) && jl40.l(this.b, menuButtonDto.b) && jl40.l(this.c, menuButtonDto.c) && jl40.l(this.d, menuButtonDto.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MenuButtonDto(subtitleDto=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", url=");
            return g8e.r(sb, this.c, ", imageTag=", this.d, Extension.C_BRAKE);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/charity/data/MenuItemInfoResponse$MenuButtonDto$SubtitleDto;", "", "Companion", "$serializer", "com/yandex/go/charity/data/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class SubtitleDto {
            public static final c Companion = new c();
            public final String a;
            public final ief b;

            public /* synthetic */ SubtitleDto(int i, String str, ief iefVar) {
                this.a = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.b = ief.e;
                } else {
                    this.b = iefVar;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SubtitleDto)) {
                    return false;
                }
                SubtitleDto subtitleDto = (SubtitleDto) obj;
                return jl40.l(this.a, subtitleDto.a) && jl40.l(this.b, subtitleDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "SubtitleDto(text=" + this.a + ", currencyRules=" + this.b + Extension.C_BRAKE;
            }

            public SubtitleDto(int i) {
                this.a = "";
                this.b = ief.e;
            }

            public SubtitleDto() {
                this(0);
            }
        }

        public MenuButtonDto() {
            this.a = new SubtitleDto(0);
            this.b = "";
            this.c = "";
            this.d = "";
        }
    }
}
