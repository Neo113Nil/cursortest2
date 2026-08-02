package xsna;

import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.r1r0;

/* compiled from: PrivacyRulesRepository.kt */
/* loaded from: classes5.dex */
public final class jed0 implements w8i {
    public final Object b;
    public final Object c;
    public final Object d;

    public jed0() {
        l63 l63Var = new l63(26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, l63Var);
        this.c = msy.a(lazyThreadSafetyMode, new uh80(3));
        this.d = msy.a(lazyThreadSafetyMode, new v100(this, 24));
    }

    public final io.reactivex.rxjava3.core.x<String> a(PrivacySetting privacySetting) {
        return b(privacySetting.e);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final io.reactivex.rxjava3.core.x<String> b(List<? extends PrivacySetting.PrivacyRule> list) {
        io.reactivex.rxjava3.core.b0 o;
        Iterable iterable;
        if (list.size() == 1 && !(list.get(0) instanceof PrivacyRules.UserListPrivacyRule)) {
            return io.reactivex.rxjava3.core.x.k(list.get(0).Ab());
        }
        List<? extends PrivacySetting.PrivacyRule> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (PrivacySetting.PrivacyRule privacyRule : list2) {
            if (privacyRule instanceof PrivacyRules.UserListPrivacyRule) {
                List<UserId> Cb = ((PrivacyRules.UserListPrivacyRule) privacyRule).Cb();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : Cb) {
                    if (((UserId) obj).b < 2000000000) {
                        arrayList2.add(obj);
                    }
                }
                iterable = arrayList2;
            } else {
                iterable = EmptyList.b;
            }
            g5g.y(iterable, arrayList);
        }
        io.reactivex.rxjava3.core.b0 k = arrayList.isEmpty() ? io.reactivex.rxjava3.core.x.k(EmptyList.b) : rsg0.w0(yfb.x(r1r0.a.b((s1r0) this.b.getValue(), arrayList, null, null, null, 62))).o(EmptyList.b);
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            loop2: for (PrivacySetting.PrivacyRule privacyRule2 : list2) {
                if (privacyRule2 instanceof PrivacyRules.UserListPrivacyRule) {
                    PrivacyRules.UserListPrivacyRule userListPrivacyRule = (PrivacyRules.UserListPrivacyRule) privacyRule2;
                    int Db = userListPrivacyRule.Db();
                    for (int i = 0; i < Db; i++) {
                        if (userListPrivacyRule.Eb(i).b >= 2000000000) {
                            o = rsg0.W(yfb.x(nts.f((nts) this.c.getValue(), ((b25) this.d.getValue()).c(), 6)), 7).l(new vr(new uuz(17), 27)).o(EmptyList.b);
                            break loop2;
                        }
                    }
                }
            }
        }
        o = io.reactivex.rxjava3.core.x.k(EmptyList.b);
        return io.reactivex.rxjava3.core.x.B(k, o, new tuz(new v95(this, list), 10));
    }
}
