package xsna;

import android.widget.CompoundButton;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.log.L;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.dp20;
import xsna.qo20;
import xsna.xn50;

/* compiled from: BaseVoipSelectMovieDialogFragment.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class vs6 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VoipActionMultiLineView voipActionMultiLineView;
        switch (this.b) {
            case 0:
                us6 us6Var = (us6) this.receiver;
                us6Var.getClass();
                xn50.a.c(us6Var, (tmw0) obj);
                return s3q0.a;
            case 1:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((Map) this.receiver).containsKey(Long.valueOf(((Number) obj).longValue())));
            case 3:
                hpm.i((hpm) this.receiver, (com.vk.im.engine.models.dialogs.b) obj);
                return s3q0.a;
            case 4:
                ((mlu) this.receiver).getClass();
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d == null) {
                    throw new IllegalArgumentException("There isn't group in response");
                }
                List<GroupsGroupFullDto> list = d;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(mlu.a((GroupsGroupFullDto) it.next()));
                }
                return arrayList;
            case 5:
                Boolean bool = (Boolean) obj;
                zcz zczVar = (zcz) this.receiver;
                if (zczVar.d && bool != null && (voipActionMultiLineView = (VoipActionMultiLineView) zczVar.w.getValue()) != null) {
                    voipActionMultiLineView.setSwitchListener(null);
                    VoipActionMultiLineView.b(voipActionMultiLineView, bool.booleanValue());
                    voipActionMultiLineView.setSwitchListener((CompoundButton.OnCheckedChangeListener) zczVar.x.getValue());
                }
                return s3q0.a;
            case 6:
                to20 to20Var = (to20) this.receiver;
                if (!(((dp20) obj) instanceof dp20.a)) {
                    to20Var.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                po20 po20Var = to20Var.c;
                if (po20Var != null) {
                    po20Var.a(qo20.c.a);
                }
                try {
                    to20Var.a();
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.q(th);
                }
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((io.reactivex.rxjava3.disposables.b) this.receiver).b((io.reactivex.rxjava3.disposables.c) obj));
            case 8:
                L.i((Throwable) obj);
                return s3q0.a;
            case 9:
                L.i((Throwable) obj);
                return s3q0.a;
            case 10:
                wyv0.k((wyv0) this.receiver, (Throwable) obj);
                return s3q0.a;
            default:
                p3x0 p3x0Var = (p3x0) obj;
                com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a aVar = (com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a) this.receiver;
                int i = com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a.l1;
                z1h0 parentFragment = aVar.getParentFragment();
                t6x0 t6x0Var = parentFragment instanceof t6x0 ? (t6x0) parentFragment : null;
                if (t6x0Var != null) {
                    t6x0Var.Ab(p3x0Var);
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs6(Object obj, int i) {
        super(1, obj, io.reactivex.rxjava3.disposables.b.class, "add", "add(Lio/reactivex/rxjava3/disposables/Disposable;)Z", 0);
        this.b = i;
        switch (i) {
            case 8:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 9:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
