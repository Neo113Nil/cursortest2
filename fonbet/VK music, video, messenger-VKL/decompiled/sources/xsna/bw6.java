package xsna;

import android.util.Log;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.log.L;
import com.vk.photo.editor.markup.view.DrawingView;
import java.util.AbstractCollection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.android.utils.Logger;
import xsna.ca9;

/* compiled from: BeautyFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class bw6 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bw6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                L.i((Throwable) obj);
                break;
            case 1:
                ca9 ca9Var = (ca9) obj;
                m99 m99Var = (m99) this.receiver;
                if ((m99Var.j().c instanceof ca9.c) && (ca9Var instanceof ca9.c)) {
                    m99Var.f(s99.a(m99Var.j(), null, null, ca9Var, null, null, null, null, false, 251));
                }
                break;
            case 2:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).T((com.vk.profile.community.impl.ui.profile.d) obj);
                break;
            case 3:
                h6n0 h6n0Var = (h6n0) obj;
                shm shmVar = (shm) this.receiver;
                h6n0 h6n0Var2 = shmVar.k.c;
                m420 m420Var = h6n0Var2.a;
                Set S0 = j5g.S0(m420Var.a);
                m420 m420Var2 = h6n0Var.a;
                LinkedHashSet j = izi0.j(S0, m420Var2.a);
                ProfilesInfo profilesInfo = m420Var.b;
                profilesInfo.Hb(m420Var2.b);
                m420 m420Var3 = new m420((AbstractCollection) j, profilesInfo, m420Var.c, 8);
                LinkedHashMap linkedHashMap = new LinkedHashMap(h6n0Var2.b);
                linkedHashMap.putAll(h6n0Var.b);
                atk0 a = atk0.a(shmVar.k, null, h6n0.a(new h6n0(m420Var3, linkedHashMap), m420.a(m420Var3, true, 0, 11)), 3);
                shmVar.k = a;
                shmVar.n.onNext(a.c);
                g2z g2zVar = shmVar.r;
                if (g2zVar != null) {
                    g2zVar.a(shmVar.k.c.a);
                }
                break;
            case 4:
                y9n.q1((y9n) this.receiver, (StoriesContainer) obj);
                break;
            case 5:
                break;
            case 6:
                ((DrawingView) this.receiver).b((vlo) obj);
                break;
            case 7:
                L.i((Throwable) obj);
                break;
            case 8:
                yj50 yj50Var = (yj50) this.receiver;
                qcy<Object>[] qcyVarArr = yj50.m;
                Log.e(yj50Var.getClass().getCanonicalName(), "Error!", (Throwable) obj);
                break;
            case 9:
                ((dv60) this.receiver).a((r070) obj);
                break;
            case 10:
                j03.l((Throwable) obj);
                break;
            case 11:
                ((c7h0) this.receiver).T((b59) obj);
                break;
            case 12:
                ((xgx0) this.receiver).getClass();
                xgx0.d((Throwable) obj);
                break;
            case 13:
                ((wzh0) this.receiver).h(((Boolean) obj).booleanValue());
                break;
            case 14:
                String str = (String) obj;
                lgv0 lgv0Var = (lgv0) this.receiver;
                if (!epx.f(lgv0Var.q, str)) {
                    lgv0Var.q = str;
                    hgv0 hgv0Var = lgv0Var.n;
                    (hgv0Var != null ? hgv0Var : null).clear();
                    io.reactivex.rxjava3.disposables.c cVar = lgv0Var.p;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    com.vk.lists.c cVar2 = lgv0Var.o;
                    if (cVar2 != null) {
                        cVar2.p(false);
                    }
                }
                break;
            default:
                L.i((Throwable) obj);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw6(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, m99.class, "onInvalidateParticipantsSuccess", "onInvalidateParticipantsSuccess(Lcom/vk/voip/ui/settings/feature/states/CallState;)V", 0);
                break;
            case 2:
            case 4:
            case 5:
            case 11:
            case 13:
            case 14:
            default:
                break;
            case 3:
                super(1, obj, shm.class, "onRequestByActualSuccess", "onRequestByActualSuccess(Lcom/vk/im/ui/components/dialog_mention/vc/SuggestionData;)V", 0);
                break;
            case 6:
                super(1, obj, DrawingView.class, "applyState", "applyState(Lcom/vk/photo/editor/markup/state/DrawingState;)V", 0);
                break;
            case 7:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 8:
                super(1, obj, yj50.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0);
                break;
            case 9:
                super(1, obj, dv60.class, "startTask", "startTask(Lcom/vk/mvi/MviTask;)V", 0);
                break;
            case 10:
                super(1, obj, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0);
                break;
            case 12:
                super(1, obj, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 15:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}
