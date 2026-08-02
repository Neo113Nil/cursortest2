package xsna;

import com.vk.api.generated.stickers.dto.StickersSetPopupSettingsNameDto;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.PopupStickersChatSettingsModel;
import com.vk.internal.api.GsonHolder;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.kbl0;
import xsna.kcl0;

/* compiled from: PopupStickersRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class myb0 implements kcl0.a {
    public final io.reactivex.rxjava3.disposables.b a = new io.reactivex.rxjava3.disposables.b();
    public final AtomicBoolean b = new AtomicBoolean(false);

    public static eyb0 d() {
        HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
        return StickersDatabase.a.b().B();
    }

    @Override // xsna.kcl0.a
    public final io.reactivex.rxjava3.internal.operators.single.y a(boolean z) {
        return h(StickersSetPopupSettingsNameDto.AUTOPLAY_ON_GET, z, null);
    }

    @Override // xsna.kcl0.a
    public final io.reactivex.rxjava3.internal.operators.single.f0 b() {
        return new io.reactivex.rxjava3.internal.operators.single.v(new r5r(this, 1)).q(asu0.a.c());
    }

    @Override // xsna.kcl0.a
    public final io.reactivex.rxjava3.internal.operators.single.y c(boolean z) {
        return h(StickersSetPopupSettingsNameDto.AUTOPLAY_ON_SEND, z, null);
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 e(final long j) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new Callable(this) { // from class: xsna.iyb0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hyb0 b = myb0.d().b(j);
                return Boolean.valueOf(b != null ? b.b : true);
            }
        }).q(asu0.a.c());
    }

    public final void f(PopupStickersChatSettingsModel popupStickersChatSettingsModel) {
        if (popupStickersChatSettingsModel == null) {
            return;
        }
        boolean Ab = popupStickersChatSettingsModel.Ab();
        boolean zb = popupStickersChatSettingsModel.zb();
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        PopupStickersChatSettingsModel b = kbl0.a.b().b();
        b.Db(Ab);
        b.Cb(zb);
        kbl0 b2 = kbl0.a.b();
        b2.getClass();
        Preference.H(b2.a, "stickers_popup_general_chat_settings", GsonHolder.a().toJson(b));
        List<Long> Bb = popupStickersChatSettingsModel.Bb();
        if (Bb == null) {
            return;
        }
        asu0.a.getClass();
        asu0.n().execute(new sj1(this, Bb));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y g(long j, boolean z) {
        return h(StickersSetPopupSettingsNameDto.AUTOPLAY_DISABLED_PEER_IDS, z, Long.valueOf(j));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y h(StickersSetPopupSettingsNameDto stickersSetPopupSettingsNameDto, boolean z, Long l) {
        tfx tfxVar = new tfx("stickers.setPopupSettings", new uq(27), new jgj0(1));
        tfx.o(tfxVar, "name", stickersSetPopupSettingsNameDto.i(), 0, 0, 12);
        tfxVar.j("value", z);
        if (l != null) {
            tfx.m(tfxVar, "chat_id", l.longValue(), 0L, 12);
        }
        return rsg0.w0(yfb.x(tfxVar)).m(asu0.a.c()).l(new mau(new z7w(16), 12)).l(new i3u(new ba40(this, 12), 7));
    }
}
