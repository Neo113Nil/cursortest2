package xsna;

import android.content.Context;
import com.vk.api.generated.audio.dto.AudioRestrictionDto;
import com.vk.api.generated.audio.dto.AudioRestrictionInfoDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionTypeDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.dto.common.Image;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AudioRestrictionRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final class ww4 implements sw4 {
    public final ix4 a;
    public final gw4 b;
    public final jw4 c;
    public final iv10 d;
    public final Context e;

    public ww4(ix4 ix4Var, gw4 gw4Var, jw4 jw4Var, iv10 iv10Var, Context context) {
        this.a = ix4Var;
        this.b = gw4Var;
        this.c = jw4Var;
        this.d = iv10Var;
        this.e = context;
    }

    @Override // xsna.sw4
    public final io.reactivex.rxjava3.internal.operators.single.l a(Integer num, String str, String str2) {
        if (!com.vk.toggle.b.A.a(MusicFeatures.AUTOGEN_RESTRICTION_POPUP)) {
            return rsg0.w0(new ip4(str, str2)).h(new qz(new vw4(L.a, 0), 4));
        }
        this.a.getClass();
        tfx tfxVar = new tfx("audio.getRestrictionPopup", new bo(8), new sr(6));
        tfx.o(tfxVar, "audio_id", str, 0, 0, 12);
        tfx.l(tfxVar, "restriction", num.intValue(), 0, 0, 12);
        if (str2 != null) {
            tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        }
        return rsg0.w0(yfb.x(tfxVar)).l(new pj4(new tw4(this.d, 0), 2)).h(new defpackage.n(new uw4(L.a, 0), 6));
    }

    @Override // xsna.sw4
    public final io.reactivex.rxjava3.internal.operators.maybe.u b(int i) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", lhg.a(i, "id=")});
        }
        return new io.reactivex.rxjava3.internal.operators.maybe.u(this.b.b(i), new b9(new qr0(this.c, 1), 1));
    }

    @Override // xsna.sw4
    public final io.reactivex.rxjava3.internal.operators.single.x c() {
        return io.reactivex.rxjava3.core.x.k(new AudioRestrictionInfoDto(AudioRestrictionDto.NO, this.e.getString(R.string.audio_restriction_title_default), null, null, null, 28, null));
    }

    @Override // xsna.sw4
    public final io.reactivex.rxjava3.core.a d(List<AudioRestrictionInfoDto> list) {
        BaseLinkButtonActionDto e;
        BaseLinkButtonActionTypeDto C;
        BaseLinkButtonActionDto e2;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "restrictionsList.size=" + list.size()});
        }
        List<AudioRestrictionInfoDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (AudioRestrictionInfoDto audioRestrictionInfoDto : list2) {
            AudioRestrictionDto f = audioRestrictionInfoDto.f();
            int j = f != null ? f.j() : 0;
            String title = audioRestrictionInfoDto.getTitle();
            String str = title == null ? "" : title;
            String g = audioRestrictionInfoDto.g();
            String str2 = g == null ? "" : g;
            BaseLinkButtonDto d = audioRestrictionInfoDto.d();
            Image image = null;
            String title2 = d != null ? d.getTitle() : null;
            BaseLinkButtonDto d2 = audioRestrictionInfoDto.d();
            String url = (d2 == null || (e2 = d2.e()) == null) ? null : e2.getUrl();
            BaseLinkButtonDto d3 = audioRestrictionInfoDto.d();
            String j2 = (d3 == null || (e = d3.e()) == null || (C = e.C()) == null) ? null : C.j();
            List<BaseImageDto> e3 = audioRestrictionInfoDto.e();
            if (e3 != null) {
                new ne6();
                image = ne6.a(e3);
            }
            arrayList.add(new kw4(str, str2, title2, url, j, image, j2));
        }
        return this.b.a(arrayList);
    }

    @Override // xsna.sw4
    public final io.reactivex.rxjava3.internal.operators.observable.f0 e() {
        this.a.getClass();
        return rsg0.w0(yfb.x(new tfx("audio.getRestrictionsInfo", new xr(5), new io.reactivex.rxjava3.processors.b(5))));
    }
}
