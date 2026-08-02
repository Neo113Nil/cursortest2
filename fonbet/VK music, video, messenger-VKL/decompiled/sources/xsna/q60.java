package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.media3.datasource.a;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.database.dto.DatabaseCityDto;
import com.vk.api.generated.database.dto.DatabaseGetCitiesResponseDto;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.log.L;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.superapp.core.api.models.VkGender;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.a0d;
import xsna.akv;
import xsna.ink;
import xsna.otb;
import xsna.ulc;

/* compiled from: ActionSynchronizerInteractorImpl.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class q60 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q60(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ozc ozcVar;
        Integer num;
        r1 = null;
        androidx.media3.exoplayer.upstream.b iu70Var = null;
        switch (this.b) {
            case 0:
                ((r60) this.receiver).getClass();
                hd60.a().w().e(142, (du) obj);
                break;
            case 1:
                L.i((Throwable) obj);
                break;
            case 2:
                otb otbVar = (otb) this.receiver;
                otbVar.l = otb.b.a(otbVar.l, otbVar.l.a.Ab((ProfilesInfo) obj), false, false, null, false, null, 958);
                otbVar.a();
                otbVar.i();
                break;
            case 3:
                qzb qzbVar = (qzb) this.receiver;
                qzbVar.getClass();
                akv.a aVar = new akv.a();
                aVar.a = (String) obj;
                aVar.b(Uri.parse(qzbVar.c));
                aVar.f = false;
                break;
            case 4:
                a0d a0dVar = (a0d) obj;
                ulc ulcVar = (ulc) this.receiver;
                if (ulcVar.K != ulc.a.ACTIVE && (a0dVar instanceof a0d.a) && (ozcVar = (ozc) ulcVar.C) != null && (num = ozcVar.k) != null) {
                    ulcVar.G.setBackgroundColor(num.intValue());
                    ozc ozcVar2 = (ozc) ulcVar.C;
                    ulcVar.b7(ozcVar2 != null ? ozcVar2.l : null);
                }
                break;
            case 5:
                BaseImageDto baseImageDto = (BaseImageDto) obj;
                ((ojd) this.receiver).getClass();
                break;
            case 6:
                ((hpp) this.receiver).b0((VkGender) obj);
                break;
            case 7:
                ((lwk) this.receiver).getClass();
                List<DatabaseCityDto> d = ((DatabaseGetCitiesResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (DatabaseCityDto databaseCityDto : d) {
                    int id = databaseCityDto.getId();
                    String title = databaseCityDto.getTitle();
                    String d2 = databaseCityDto.d();
                    if (d2 == null) {
                        d2 = "";
                    }
                    String f = databaseCityDto.f();
                    arrayList.add(new WebCity(id, title, d2, f != null ? f : "", databaseCityDto.e() == BaseBoolIntDto.YES));
                }
                break;
            case 8:
                w920.f((w920) this.receiver, (Throwable) obj);
                break;
            case 9:
                sht0 sht0Var = (sht0) obj;
                xk80 xk80Var = (xk80) this.receiver;
                j1d0 j1d0Var = xk80Var.Q;
                if (j1d0Var != null) {
                    q1d0 c = j1d0Var.g.c(sht0Var);
                    if (c == null) {
                        c = null;
                    }
                    if (c != null) {
                        c.q = new e8(xk80Var.V, 25);
                        c.r = new j630(xk80Var.U, 9);
                        pae0 pae0Var = c.B;
                        if (pae0Var != null) {
                            pae0Var.b = xk80Var.a0;
                            pae0Var.c = false;
                            break;
                        }
                    }
                }
                Context context = xk80Var.J;
                pae0 pae0Var2 = new pae0(fz5.d.t(context));
                pae0Var2.b = xk80Var.a0;
                pae0Var2.c = false;
                a.InterfaceC0045a interfaceC0045a = xk80Var.p0;
                ink.a aVar2 = interfaceC0045a == null ? new ink.a(new hc6(null, xk80Var.S, pae0Var2), xk80Var.q0, xk80Var.r0) : new ink.a(new hc6(interfaceC0045a, f7q.c(xk80Var.J), pae0Var2), xk80Var.q0, xk80Var.r0);
                int i = wn80.a;
                sy10 sy10Var = new sy10(context, sht0Var, aVar2);
                sy10Var.d = xk80Var.K;
                sy10Var.m = xk80Var.P;
                sy10Var.n = xk80Var.O;
                sy10Var.e = xk80Var.s0;
                sy10Var.i = xk80Var.Q;
                sy10Var.o = xk80Var.R;
                sy10Var.f = xk80Var.r0;
                sy10Var.h = xk80Var.L;
                sy10Var.j = xk80Var.N == null ? new usk(sht0Var instanceof psk) : new ysk(new svz(14), xk80Var.N);
                sy10Var.k = xk80Var.T;
                if (sht0Var instanceof psk) {
                    iu70Var = new j740();
                } else if ((sht0Var instanceof mv70) && wn80.u) {
                    iu70Var = new iu70();
                }
                if (iu70Var != null) {
                    sy10Var.l = iu70Var;
                }
                sy10Var.g = xk80Var.q;
                break;
            case 10:
                ((o0i0) this.receiver).h(((Boolean) obj).booleanValue());
                break;
            case 11:
                break;
            case 12:
                ((View) this.receiver).setBackgroundResource(((Number) obj).intValue());
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((lcw0) this.receiver).getClass();
                com.vk.voip.ui.c.b.getClass();
                boolean z0 = com.vk.voip.ui.c.z0();
                if (!booleanValue) {
                    ysg0.b.a(new zg10());
                } else if (z0) {
                    ysg0.b.a(new nij0());
                } else {
                    ysg0.b.a(new ah10());
                }
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, otb.class, "onUpdateInconsistentMembersInfoSuccess", "onUpdateInconsistentMembersInfoSuccess(Lcom/vk/im/engine/models/ProfilesInfo;)V", 0);
                break;
            case 5:
                super(1, obj, ojd.class, "mapToImage", "mapToImage(Lcom/vk/api/generated/base/dto/BaseImageDto;)Lcom/vk/dto/common/Image;", 0);
                break;
            case 10:
                super(1, obj, o0i0.class, "onFilterChangedByUser", "onFilterChangedByUser(Z)V", 0);
                break;
            case 13:
                super(1, obj, lcw0.class, "openMasksSettingsIfReady", "openMasksSettingsIfReady(Z)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(r60 r60Var) {
        super(1, r60Var, r60.class, "notifyOnResult", "notifyOnResult(Lcom/vk/newsfeed/impl/domain/model/ActionApplyResult;)V", 0);
        this.b = 0;
    }
}
