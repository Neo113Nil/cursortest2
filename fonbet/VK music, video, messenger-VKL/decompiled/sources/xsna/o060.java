package xsna;

import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.dto.common.id.UserId;
import com.vk.poll.fragments.PollResultsFragment;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlin.text.Regex;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import xsna.exd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class o060 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o060(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((yr00) obj2).invoke(obj);
                break;
            case 1:
                ((r770) obj2).invoke(obj);
                break;
            case 2:
                ((yr00) obj2).invoke(obj);
                break;
            case 3:
                ((ee8) obj2).invoke(obj);
                break;
            case 4:
                ((yr00) obj2).invoke(obj);
                break;
            case 5:
                ((hpb0) obj2).t();
                break;
            case 6:
                int i2 = PollResultsFragment.b0;
                ((yr00) obj2).invoke(obj);
                break;
            case 7:
                ((k220) obj2).invoke(obj);
                break;
            case 8:
                ((isg) obj2).invoke(obj);
                break;
            case 9:
                ((exd0.c) obj2).invoke(obj);
                break;
            case 10:
                kyd0 kyd0Var = (kyd0) obj2;
                androidx.lifecycle.f fVar = kyd0Var.c;
                if (!(obj instanceof bf1)) {
                    if (!(obj instanceof ok1)) {
                        if (!(obj instanceof cl1)) {
                            if (obj instanceof zaa0) {
                                LinkedHashMap linkedHashMap = qt1.a;
                                UserId userId = kyd0Var.f;
                                r6m.a.getClass();
                                io.reactivex.rxjava3.internal.operators.observable.m1 a0 = qt1.a(userId, new yea0(R.string.user_photos_title, R.string.all_photos, r6m.k())).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                                a8v a8vVar = new a8v(new bzw(kyd0Var, 26), 13);
                                int i3 = kwg0.a;
                                kyd0Var.a(a0.subscribe(a8vVar, new hwg0()));
                                break;
                            }
                        } else {
                            ((gyd0) fVar).X(((cl1) obj).a);
                            break;
                        }
                    } else {
                        ((gyd0) fVar).R(((ok1) obj).a);
                        break;
                    }
                } else {
                    bf1 bf1Var = (bf1) obj;
                    ((gyd0) fVar).U(bf1Var.a, bf1Var.b);
                    break;
                }
                break;
            case 11:
                ((j4f0) obj2).e((k4f0) obj);
                break;
            case 12:
                ((SharedPeerConnectionFactory) obj2).a((Throwable) obj);
                break;
            case 13:
                ((k220) obj2).invoke(obj);
                break;
            case 14:
                ((r770) obj2).invoke(obj);
                break;
            case 15:
                ((m2l0) obj2).invoke(obj);
                break;
            case 16:
                ((gz30) obj2).invoke(obj);
                break;
            case 17:
                ((m2l0) obj2).invoke(obj);
                break;
            case 18:
                ((z6r0) obj2).invoke(obj);
                break;
            case 19:
                ((m2l0) obj2).invoke(obj);
                break;
            case 20:
                ((alj0) obj2).invoke(obj);
                break;
            case 21:
                ((m2l0) obj2).invoke(obj);
                break;
            case 22:
                Regex regex = VkAuthPhoneView.q;
                ((m2l0) obj2).invoke(obj);
                break;
            case 23:
                ((knt) obj2).invoke(obj);
                break;
            case 24:
                ((m2l0) obj2).invoke(obj);
                break;
            case 25:
                ((m2l0) obj2).invoke(obj);
                break;
            default:
                ((m1y0) obj2).invoke(obj);
                break;
        }
    }
}
