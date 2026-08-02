package com.yandex.go.trusted_contacts.data.entities.network;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jg11;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/TrustedContactsResponse;", "", "Companion", "$serializer", "com/yandex/go/trusted_contacts/data/entities/network/p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrustedContactsResponse {
    public static final p Companion = new p();
    public static final i3y[] g;
    public final int a;
    public final List b;
    public final List c;
    public final ShareSettingsDto d;
    public final ScreenConfigDto e;
    public final DeleteSettingsDto f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new jg11(3)), kotlin.a.b(lazyThreadSafetyMode, new jg11(4)), null, null, null};
    }

    public /* synthetic */ TrustedContactsResponse(int i, int i2, List list, List list2, ShareSettingsDto shareSettingsDto, ScreenConfigDto screenConfigDto, DeleteSettingsDto deleteSettingsDto) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        int i3 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i3 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = new ShareSettingsDto(0);
        } else {
            this.d = shareSettingsDto;
        }
        if ((i & 16) == 0) {
            this.e = new ScreenConfigDto(0);
        } else {
            this.e = screenConfigDto;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = deleteSettingsDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedContactsResponse)) {
            return false;
        }
        TrustedContactsResponse trustedContactsResponse = (TrustedContactsResponse) obj;
        return this.a == trustedContactsResponse.a && jl40.l(this.b, trustedContactsResponse.b) && jl40.l(this.c, trustedContactsResponse.c) && jl40.l(this.d, trustedContactsResponse.d) && jl40.l(this.e, trustedContactsResponse.e) && jl40.l(this.f, trustedContactsResponse.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + unr0.c(unr0.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        DeleteSettingsDto deleteSettingsDto = this.f;
        return hashCode + (deleteSettingsDto == null ? 0 : deleteSettingsDto.hashCode());
    }

    public final String toString() {
        return "TrustedContactsResponse(maxTrustedContacts=" + this.a + ", trustedContacts=" + this.b + ", trustingContacts=" + this.c + ", shareSettingsDto=" + this.d + ", screenConfigDto=" + this.e + ", deleteSettingsDto=" + this.f + Extension.C_BRAKE;
    }

    public TrustedContactsResponse() {
        ShareSettingsDto shareSettingsDto = new ShareSettingsDto(0);
        ScreenConfigDto screenConfigDto = new ScreenConfigDto(0);
        this.a = 0;
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = emptyList;
        this.d = shareSettingsDto;
        this.e = screenConfigDto;
        this.f = null;
    }
}
