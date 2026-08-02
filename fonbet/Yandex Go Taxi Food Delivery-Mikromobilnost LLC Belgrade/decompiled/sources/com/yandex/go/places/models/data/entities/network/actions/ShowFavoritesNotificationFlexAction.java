package com.yandex.go.places.models.data.entities.network.actions;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.kr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/actions/ShowFavoritesNotificationFlexAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/actions/k", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ShowFavoritesNotificationFlexAction extends kr {
    public static final k Companion = new k();
    public final ImageDto a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ ShowFavoritesNotificationFlexAction(int i, ImageDto imageDto, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = imageDto;
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
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowFavoritesNotificationFlexAction)) {
            return false;
        }
        ShowFavoritesNotificationFlexAction showFavoritesNotificationFlexAction = (ShowFavoritesNotificationFlexAction) obj;
        return jl40.l(this.a, showFavoritesNotificationFlexAction.a) && jl40.l(this.b, showFavoritesNotificationFlexAction.b) && jl40.l(this.c, showFavoritesNotificationFlexAction.c) && jl40.l(this.d, showFavoritesNotificationFlexAction.d);
    }

    public final int hashCode() {
        ImageDto imageDto = this.a;
        int hashCode = (imageDto == null ? 0 : imageDto.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowFavoritesNotificationFlexAction(image=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", buttonText=");
        return g8e.r(sb, this.c, ", actionDeeplink=", this.d, Extension.C_BRAKE);
    }

    public ShowFavoritesNotificationFlexAction() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
