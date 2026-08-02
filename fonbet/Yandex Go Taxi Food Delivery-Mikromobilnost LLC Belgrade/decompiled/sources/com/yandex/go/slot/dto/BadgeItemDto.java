package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.pk4;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0(with = c.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0017\u0018\u0000 \u00042\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/slot/dto/BadgeItemDto;", "", "<init>", "()V", "Companion", "com/yandex/go/slot/dto/e", "Chat", "Text", "Properties", "com/yandex/go/slot/dto/c", "pk4", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public class BadgeItemDto {
    public static final pk4 Companion = new pk4();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/slot/dto/BadgeItemDto$Chat;", "Lcom/yandex/go/slot/dto/BadgeItemDto;", "Companion", "$serializer", "com/yandex/go/slot/dto/a", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Chat extends BadgeItemDto {
        public static final a Companion = new a();
        public final Properties a;

        public /* synthetic */ Chat(int i, Properties properties) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = properties;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Chat) && jl40.l(this.a, ((Chat) obj).a);
        }

        public final int hashCode() {
            Properties properties = this.a;
            if (properties == null) {
                return 0;
            }
            return properties.hashCode();
        }

        public final String toString() {
            return "Chat(properties=" + this.a + Extension.C_BRAKE;
        }

        public Chat() {
            this.a = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/slot/dto/BadgeItemDto$Text;", "Lcom/yandex/go/slot/dto/BadgeItemDto;", "Companion", "$serializer", "com/yandex/go/slot/dto/d", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Text extends BadgeItemDto {
        public static final d Companion = new d();
        public final FormattedText a;
        public final Properties b;

        public /* synthetic */ Text(int i, FormattedText formattedText, Properties properties) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = properties;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return jl40.l(this.a, text.a) && jl40.l(this.b, text.b);
        }

        public final int hashCode() {
            int hashCode = this.a.a.hashCode() * 31;
            Properties properties = this.b;
            return hashCode + (properties == null ? 0 : properties.hashCode());
        }

        public final String toString() {
            return "Text(text=" + this.a + ", properties=" + this.b + Extension.C_BRAKE;
        }

        public Text() {
            this.a = FormattedText.c;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/slot/dto/BadgeItemDto$Properties;", "", "Companion", "$serializer", "com/yandex/go/slot/dto/b", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Properties {
        public static final b Companion = new b();
        public final String a;
        public final String b;

        public /* synthetic */ Properties(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Properties)) {
                return false;
            }
            Properties properties = (Properties) obj;
            return jl40.l(this.a, properties.a) && jl40.l(this.b, properties.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return unr0.p("Properties(textColor=", this.a, ", backgroundColor=", this.b, Extension.C_BRAKE);
        }

        public Properties() {
            this.a = null;
            this.b = null;
        }
    }
}
