package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.im.ui.components.contacts.ContactsList;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import java.util.Collection;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.utils.Logger;
import xsna.jne0;
import xsna.k9d0;

/* compiled from: CallPrimaryActions.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class y89 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y89(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                k9d0 k9d0Var = (k9d0) obj;
                z89 z89Var = (z89) this.receiver;
                z89Var.l.i(k9d0Var.b);
                ty tyVar = z89Var.i;
                k9d0.c cVar = k9d0Var.c;
                tyVar.i(cVar);
                z89Var.j.i(k9d0Var.d);
                z89Var.g.i(k9d0Var.f);
                z89Var.h.i(cVar);
                z89Var.k.i(k9d0Var.e);
                z89Var.m.i(Boolean.valueOf(k9d0Var.i));
                z89Var.n.i(Boolean.valueOf(k9d0Var.h));
                z89Var.o.i(k9d0Var.j);
                boolean z = k9d0Var.a;
                if (z != z89Var.c) {
                    z89Var.c = z;
                    h70 h70Var = z89Var.a;
                    if (h70Var != null) {
                        h70Var.a(z89Var, true);
                    }
                }
                h70 h70Var2 = z89Var.a;
                if (h70Var2 != null) {
                    h70Var2.a(z89Var, false);
                }
                break;
            case 1:
                L.i((Throwable) obj);
                break;
            case 2:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                break;
            case 3:
                ((kpg) this.receiver).a((CommunityProfileAction) obj);
                break;
            case 4:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) this.receiver;
                qcy<Object>[] qcyVarArr = com.vk.im.ui.components.contacts.a.d0;
                aVar.h1((ContactsList) obj);
                break;
            case 5:
                pdm pdmVar = (pdm) this.receiver;
                int i = pdm.m;
                n0s n0sVar = (n0s) pdmVar.j.getValue();
                n0sVar.b.b().h(new ut6(15, (Collection) obj, n0sVar));
                break;
            case 6:
                Throwable th = (Throwable) obj;
                afm afmVar = (afm) this.receiver;
                f9w f9wVar = afm.F;
                afmVar.getClass();
                afm.F.a(th);
                afmVar.D.i = false;
                dfm dfmVar = afmVar.z;
                if (dfmVar != null) {
                    dfmVar.d(th);
                }
                break;
            case 7:
                com.vk.photos.ui.editalbum.domain.c.U((com.vk.photos.ui.editalbum.domain.c) this.receiver, (Throwable) obj);
                break;
            case 8:
                vkq vkqVar = (vkq) this.receiver;
                vkqVar.getClass();
                UserId userId = ((t39) obj).b;
                if (!epx.f(userId, vkqVar.g)) {
                    vkqVar.g = userId;
                    vkqVar.e.onNext(vkqVar.h);
                }
                break;
            case 9:
                ((fgj0) this.receiver).getClass();
                break;
            case 10:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                break;
            case 11:
                vvw0 vvw0Var = (vvw0) this.receiver;
                vvw0Var.getClass();
                vvw0Var.C(new jne0.c((Throwable) obj));
                break;
            default:
                rcx0 rcx0Var = (rcx0) this.receiver;
                com.vk.voip.b bVar = rcx0Var.c;
                icx0 icx0Var = rcx0Var.b;
                if (!epx.f((FeatureRoles) obj, FeatureRoles.EnabledForAll.INSTANCE) && epx.f(icx0Var.m(), bVar.a()) && !bVar.isMeCreatorOrAdmin()) {
                    icx0Var.i();
                }
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y89(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 9:
                super(1, obj, fgj0.class, "map", "map(Lcom/vk/api/generated/shortVideo/dto/ShortVideoGetResponseDto;)Lcom/vk/dto/common/ClipVideoFile;", 0);
                break;
            case 10:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
