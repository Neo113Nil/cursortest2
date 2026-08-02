package com.yandex.go.data.entities.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/data/entities/network/UserUploadPhotoResponse;", "", "Companion", "Bdui", "$serializer", "com/yandex/go/data/entities/network/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UserUploadPhotoResponse {
    public static final d Companion = new d();
    public final String a;
    public final String b;
    public final Bdui c;

    public /* synthetic */ UserUploadPhotoResponse(int i, String str, String str2, Bdui bdui) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bdui;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Bdui getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserUploadPhotoResponse)) {
            return false;
        }
        UserUploadPhotoResponse userUploadPhotoResponse = (UserUploadPhotoResponse) obj;
        return jl40.l(this.a, userUploadPhotoResponse.a) && jl40.l(this.b, userUploadPhotoResponse.b) && jl40.l(this.c, userUploadPhotoResponse.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Bdui bdui = this.c;
        return b + (bdui == null ? 0 : bdui.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("UserUploadPhotoResponse(url=", this.a, ", status=", this.b, ", bdui=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/data/entities/network/UserUploadPhotoResponse$Bdui;", "", "Companion", "$serializer", "com/yandex/go/data/entities/network/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Bdui {
        public static final c Companion = new c();
        public final FormattedText a;

        public /* synthetic */ Bdui(int i, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = formattedText;
            }
        }

        /* renamed from: a, reason: from getter */
        public final FormattedText getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Bdui) && jl40.l(this.a, ((Bdui) obj).a);
        }

        public final int hashCode() {
            FormattedText formattedText = this.a;
            if (formattedText == null) {
                return 0;
            }
            return formattedText.a.hashCode();
        }

        public final String toString() {
            return ly3.p("Bdui(status=", Extension.C_BRAKE, this.a);
        }

        public Bdui() {
            this.a = null;
        }
    }

    public UserUploadPhotoResponse() {
        this.a = "";
        this.b = "";
        this.c = null;
    }
}
