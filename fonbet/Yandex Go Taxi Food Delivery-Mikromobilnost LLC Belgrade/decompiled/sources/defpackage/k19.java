package defpackage;

import com.yandex.go.navigator.notifications.cartech.CartechDeeplinkPayloadDto;

/* loaded from: classes12.dex */
public final class k19 {
    public final j19 a;
    public final sul b;

    public k19(j19 j19Var, sul sulVar) {
        this.a = j19Var;
        this.b = sulVar;
    }

    public final CartechDeeplinkPayloadDto a() {
        String l = this.b.a().l("tanker_payload", null);
        if (l == null) {
            return null;
        }
        return (CartechDeeplinkPayloadDto) ((xnt) this.a.a).c(l, CartechDeeplinkPayloadDto.Companion.serializer());
    }

    public final void b(CartechDeeplinkPayloadDto cartechDeeplinkPayloadDto) {
        this.b.a().r("tanker_payload", ((xnt) this.a.a).e(cartechDeeplinkPayloadDto, CartechDeeplinkPayloadDto.Companion.serializer()));
    }
}
