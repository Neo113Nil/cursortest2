package com.yandex.go.trusted_contacts.data.entities.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mkr0;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/ShareSettingsDto;", "", "Companion", "$serializer", "com/yandex/go/trusted_contacts/data/entities/network/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ShareSettingsDto {
    public static final i Companion = new i();
    public static final i3y[] g;
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final EditContactNameConfigDto f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new mkr0(4)), kotlin.a.b(lazyThreadSafetyMode, new mkr0(5)), null};
    }

    public /* synthetic */ ShareSettingsDto(int i, String str, String str2, String str3, List list, List list2, EditContactNameConfigDto editContactNameConfigDto) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        int i2 = i & 8;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.d = emptyList;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = editContactNameConfigDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareSettingsDto)) {
            return false;
        }
        ShareSettingsDto shareSettingsDto = (ShareSettingsDto) obj;
        return jl40.l(this.a, shareSettingsDto.a) && jl40.l(this.b, shareSettingsDto.b) && jl40.l(this.c, shareSettingsDto.c) && jl40.l(this.d, shareSettingsDto.d) && jl40.l(this.e, shareSettingsDto.e) && jl40.l(this.f, shareSettingsDto.f);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        EditContactNameConfigDto editContactNameConfigDto = this.f;
        return c + (editContactNameConfigDto == null ? 0 : editContactNameConfigDto.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("ShareSettingsDto(title=", this.a, ", subtitle=", this.b, ", defaultEnabledOptionId=");
        tse0.x(this.c, ", options=", ", switches=", v, this.d);
        v.append(this.e);
        v.append(", editContactNameConfig=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ShareSettingsDto(int i) {
        this.a = "";
        this.b = "";
        this.c = "";
        EmptyList emptyList = EmptyList.a;
        this.d = emptyList;
        this.e = emptyList;
        this.f = null;
    }

    public ShareSettingsDto() {
        this(0);
    }
}
