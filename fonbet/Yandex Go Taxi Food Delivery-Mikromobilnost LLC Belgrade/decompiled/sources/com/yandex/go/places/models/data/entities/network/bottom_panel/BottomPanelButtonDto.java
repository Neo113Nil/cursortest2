package com.yandex.go.places.models.data.entities.network.bottom_panel;

import defpackage.av5;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/bottom_panel/BottomPanelButtonDto;", "", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/bottom_panel/l", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BottomPanelButtonDto {
    public static final l Companion = new l();
    public static final i3y[] g;
    public final String a;
    public final String b;
    public final String c;
    public final BottomPanelButtonType d;
    public final BottomPanelButtonSize e;
    public final k f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new av5(17)), kotlin.a.b(lazyThreadSafetyMode, new av5(18)), null};
    }

    public /* synthetic */ BottomPanelButtonDto(int i, String str, String str2, String str3, BottomPanelButtonType bottomPanelButtonType, BottomPanelButtonSize bottomPanelButtonSize, k kVar) {
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
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bottomPanelButtonType;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bottomPanelButtonSize;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = kVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomPanelButtonDto)) {
            return false;
        }
        BottomPanelButtonDto bottomPanelButtonDto = (BottomPanelButtonDto) obj;
        return jl40.l(this.a, bottomPanelButtonDto.a) && jl40.l(this.b, bottomPanelButtonDto.b) && jl40.l(this.c, bottomPanelButtonDto.c) && this.d == bottomPanelButtonDto.d && this.e == bottomPanelButtonDto.e && jl40.l(this.f, bottomPanelButtonDto.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int b = unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        BottomPanelButtonType bottomPanelButtonType = this.d;
        int hashCode2 = (b + (bottomPanelButtonType == null ? 0 : bottomPanelButtonType.hashCode())) * 31;
        BottomPanelButtonSize bottomPanelButtonSize = this.e;
        int hashCode3 = (hashCode2 + (bottomPanelButtonSize == null ? 0 : bottomPanelButtonSize.hashCode())) * 31;
        k kVar = this.f;
        return hashCode3 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("BottomPanelButtonDto(imageTag=", this.a, ", text=", this.b, ", accessibilityText=");
        v.append(this.c);
        v.append(", type=");
        v.append(this.d);
        v.append(", size=");
        v.append(this.e);
        v.append(", action=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public BottomPanelButtonDto() {
        this.a = null;
        this.b = null;
        this.c = "";
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
